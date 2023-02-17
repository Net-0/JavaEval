package javah;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Utils {

    /**
     * This method get the Path of temporary folder
     * @return the temporary folder directory
     */
    public static final Path systemTemp;

    static {
        Path ownTmp = Path.of(System.getProperty("java.io.tmpdir"), "JavaEval");
        if (!ownTmp.toFile().exists()) { ownTmp.toFile().mkdir(); }

        systemTemp = ownTmp;
    }

    /**
     * Create a new Random File Path with extension parameter
     * @param extension extension of file path
     * @return a random file path with extension
     */
    public static Path randomFilePath(String extension) {
        try {
            String tmpDir = systemTemp.toString();
            Supplier<Path> randomPath = () -> Path.of(tmpDir, UUID.randomUUID() + "." + extension);

            Path newPath = randomPath.get();
            while (newPath.toFile().exists()) { newPath = randomPath.get(); }

            newPath.toFile().createNewFile();
            return newPath;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Path randomDir() {
        String tmpDir = systemTemp.toString();
        Supplier<Path> randomPath = () -> Path.of(tmpDir, UUID.randomUUID().toString());

        Path newPath = randomPath.get();
        while (newPath.toFile().exists()) { newPath = randomPath.get(); }

        newPath.toFile().mkdirs();
        return newPath;
    }

    /**
     * This method get all ClassPaths of current application
     * @return ClassPaths of current application
     */
    public static List<Path> getClassesPaths() {
        String classesPathsStr = System.getProperty("java.class.path");
        String[] classesPaths = classesPathsStr.split(File.pathSeparator);
        return Arrays.stream(classesPaths)
                .map(Path::of)
                .toList();
    }

    /**
     * This method delete a Directory and his all children
     * @param dir Directory to be deleted
     */
    public static void deleteDir(Path dir) {
        var file = dir.toFile();

        if (!file.exists()) return;

        if (file.isFile()) file.delete();
        else if (file.isDirectory()) {
            List.of(file.listFiles()).forEach( child -> deleteDir(child.toPath()) );
            file.delete();
        }
    }
}
