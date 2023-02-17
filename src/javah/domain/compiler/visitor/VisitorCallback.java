package javah.domain.compiler.visitor;

import com.sun.source.tree.Tree;

@FunctionalInterface
public interface VisitorCallback<A extends Tree, B> {
    void exec(A node, B arg);
}
