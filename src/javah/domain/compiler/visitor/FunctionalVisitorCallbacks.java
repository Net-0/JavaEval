package javah.domain.compiler.visitor;

import com.sun.source.tree.*;

import java.util.ArrayList;
import java.util.List;

public class FunctionalVisitorCallbacks<P> {

    protected List<VisitorCallback<AnnotatedTypeTree, P>> callbacksAnnotatedType = new ArrayList<>();
    protected List<VisitorCallback<AnnotationTree, P>> callbacksAnnotation = new ArrayList<>();
    protected List<VisitorCallback<MethodInvocationTree, P>> callbacksMethodInvocation = new ArrayList<>();
    protected List<VisitorCallback<AssertTree, P>> callbacksAssert = new ArrayList<>();
    protected List<VisitorCallback<AssignmentTree, P>> callbacksAssignment = new ArrayList<>();
    protected List<VisitorCallback<CompoundAssignmentTree, P>> callbacksCompoundAssignment = new ArrayList<>();
    protected List<VisitorCallback<BinaryTree, P>> callbacksBinary = new ArrayList<>();
    protected List<VisitorCallback<BlockTree, P>> callbacksBlock = new ArrayList<>();
    protected List<VisitorCallback<BreakTree, P>> callbacksBreak = new ArrayList<>();
    protected List<VisitorCallback<CaseTree, P>> callbacksCase = new ArrayList<>();
    protected List<VisitorCallback<CatchTree, P>> callbacksCatch = new ArrayList<>();
    protected List<VisitorCallback<ClassTree, P>> callbacksClass = new ArrayList<>();
    protected List<VisitorCallback<ConditionalExpressionTree, P>> callbacksConditionalExpression = new ArrayList<>();
    protected List<VisitorCallback<ContinueTree, P>> callbacksContinue = new ArrayList<>();
    protected List<VisitorCallback<DoWhileLoopTree, P>> callbacksDoWhileLoop = new ArrayList<>();
    protected List<VisitorCallback<ErroneousTree, P>> callbacksErroneous = new ArrayList<>();
    protected List<VisitorCallback<ExpressionStatementTree, P>> callbacksExpressionStatement = new ArrayList<>();
    protected List<VisitorCallback<EnhancedForLoopTree, P>> callbacksEnhancedForLoop = new ArrayList<>();
    protected List<VisitorCallback<ForLoopTree, P>> callbacksForLoop = new ArrayList<>();
    protected List<VisitorCallback<IdentifierTree, P>> callbacksIdentifier = new ArrayList<>();
    protected List<VisitorCallback<IfTree, P>> callbacksIf = new ArrayList<>();
    protected List<VisitorCallback<ImportTree, P>> callbacksImport = new ArrayList<>();
    protected List<VisitorCallback<ArrayAccessTree, P>> callbacksArrayAccess = new ArrayList<>();
    protected List<VisitorCallback<LabeledStatementTree, P>> callbacksLabeledStatement = new ArrayList<>();
    protected List<VisitorCallback<LiteralTree, P>> callbacksLiteral = new ArrayList<>();
    protected List<VisitorCallback<BindingPatternTree, P>> callbacksBindingPattern = new ArrayList<>();
    protected List<VisitorCallback<DefaultCaseLabelTree, P>> callbacksDefaultCaseLabel = new ArrayList<>();
    protected List<VisitorCallback<MethodTree, P>> callbacksMethod = new ArrayList<>();
    protected List<VisitorCallback<ModifiersTree, P>> callbacksModifiers = new ArrayList<>();
    protected List<VisitorCallback<NewArrayTree, P>> callbacksNewArray = new ArrayList<>();
    protected List<VisitorCallback<GuardedPatternTree, P>> callbacksGuardedPattern = new ArrayList<>();
    protected List<VisitorCallback<ParenthesizedPatternTree, P>> callbacksParenthesizedPattern = new ArrayList<>();
    protected List<VisitorCallback<NewClassTree, P>> callbacksNewClass = new ArrayList<>();
    protected List<VisitorCallback<LambdaExpressionTree, P>> callbacksLambdaExpression = new ArrayList<>();
    protected List<VisitorCallback<PackageTree, P>> callbacksPackage = new ArrayList<>();
    protected List<VisitorCallback<ParenthesizedTree, P>> callbacksParenthesized = new ArrayList<>();
    protected List<VisitorCallback<ReturnTree, P>> callbacksReturn = new ArrayList<>();
    protected List<VisitorCallback<MemberSelectTree, P>> callbacksMemberSelect = new ArrayList<>();
    protected List<VisitorCallback<MemberReferenceTree, P>> callbacksMemberReference = new ArrayList<>();
    protected List<VisitorCallback<EmptyStatementTree, P>> callbacksEmptyStatement = new ArrayList<>();
    protected List<VisitorCallback<SwitchTree, P>> callbacksSwitch = new ArrayList<>();
    protected List<VisitorCallback<SwitchExpressionTree, P>> callbacksSwitchExpression = new ArrayList<>();
    protected List<VisitorCallback<SynchronizedTree, P>> callbacksSynchronized = new ArrayList<>();
    protected List<VisitorCallback<ThrowTree, P>> callbacksThrow = new ArrayList<>();
    protected List<VisitorCallback<CompilationUnitTree, P>> callbacksCompilationUnit = new ArrayList<>();
    protected List<VisitorCallback<TryTree, P>> callbacksTry = new ArrayList<>();
    protected List<VisitorCallback<ParameterizedTypeTree, P>> callbacksParameterizedType = new ArrayList<>();
    protected List<VisitorCallback<UnionTypeTree, P>> callbacksUnionType = new ArrayList<>();
    protected List<VisitorCallback<IntersectionTypeTree, P>> callbacksIntersectionType = new ArrayList<>();
    protected List<VisitorCallback<ArrayTypeTree, P>> callbacksArrayType = new ArrayList<>();
    protected List<VisitorCallback<TypeCastTree, P>> callbacksTypeCast = new ArrayList<>();
    protected List<VisitorCallback<PrimitiveTypeTree, P>> callbacksPrimitiveType = new ArrayList<>();
    protected List<VisitorCallback<TypeParameterTree, P>> callbacksTypeParameter = new ArrayList<>();
    protected List<VisitorCallback<InstanceOfTree, P>> callbacksInstanceOf = new ArrayList<>();
    protected List<VisitorCallback<UnaryTree, P>> callbacksUnary = new ArrayList<>();
    protected List<VisitorCallback<VariableTree, P>> callbacksVariable = new ArrayList<>();
    protected List<VisitorCallback<WhileLoopTree, P>> callbacksWhileLoop = new ArrayList<>();
    protected List<VisitorCallback<WildcardTree, P>> callbacksWildcard = new ArrayList<>();
    protected List<VisitorCallback<ModuleTree, P>> callbacksModule = new ArrayList<>();
    protected List<VisitorCallback<ExportsTree, P>> callbacksExports = new ArrayList<>();
    protected List<VisitorCallback<OpensTree, P>> callbacksOpens = new ArrayList<>();
    protected List<VisitorCallback<ProvidesTree, P>> callbacksProvides = new ArrayList<>();
    protected List<VisitorCallback<RequiresTree, P>> callbacksRequires = new ArrayList<>();
    protected List<VisitorCallback<UsesTree, P>> callbacksUses = new ArrayList<>();
    protected List<VisitorCallback<Tree, P>> callbacksOther = new ArrayList<>();
    protected List<VisitorCallback<YieldTree, P>> callbacksYield = new ArrayList<>();

    public void onAnnotatedType(VisitorCallback<AnnotatedTypeTree, P> callback) {
        this.callbacksAnnotatedType.add(callback);
    }

    public void onAnnotation(VisitorCallback<AnnotationTree, P> callback) {
        this.callbacksAnnotation.add(callback);
    }

    public void onMethodInvocation(VisitorCallback<MethodInvocationTree, P> callback) {
        this.callbacksMethodInvocation.add(callback);
    }

    public void onAssert(VisitorCallback<AssertTree, P> callback) {
        this.callbacksAssert.add(callback);
    }

    public void onAssignment(VisitorCallback<AssignmentTree, P> callback) {
        this.callbacksAssignment.add(callback);
    }

    public void onCompoundAssignment(VisitorCallback<CompoundAssignmentTree, P> callback) {
        this.callbacksCompoundAssignment.add(callback);
    }

    public void onBinary(VisitorCallback<BinaryTree, P> callback) {
        this.callbacksBinary.add(callback);
    }

    public void onBlock(VisitorCallback<BlockTree, P> callback) {
        this.callbacksBlock.add(callback);
    }

    public void onBreak(VisitorCallback<BreakTree, P> callback) {
        this.callbacksBreak.add(callback);
    }

    public void onCase(VisitorCallback<CaseTree, P> callback) {
        this.callbacksCase.add(callback);
    }

    public void onCatch(VisitorCallback<CatchTree, P> callback) {
        this.callbacksCatch.add(callback);
    }

    public void onClass(VisitorCallback<ClassTree, P> callback) {
        this.callbacksClass.add(callback);
    }

    public void onConditionalExpression(VisitorCallback<ConditionalExpressionTree, P> callback) {
        this.callbacksConditionalExpression.add(callback);
    }

    public void onContinue(VisitorCallback<ContinueTree, P> callback) {
        this.callbacksContinue.add(callback);
    }

    public void onDoWhileLoop(VisitorCallback<DoWhileLoopTree, P> callback) {
        this.callbacksDoWhileLoop.add(callback);
    }

    public void onErroneous(VisitorCallback<ErroneousTree, P> callback) {
        this.callbacksErroneous.add(callback);
    }

    public void onExpressionStatement(VisitorCallback<ExpressionStatementTree, P> callback) {
        this.callbacksExpressionStatement.add(callback);
    }

    public void onEnhancedForLoop(VisitorCallback<EnhancedForLoopTree, P> callback) {
        this.callbacksEnhancedForLoop.add(callback);
    }

    public void onForLoop(VisitorCallback<ForLoopTree, P> callback) {
        this.callbacksForLoop.add(callback);
    }

    public void onIdentifier(VisitorCallback<IdentifierTree, P> callback) {
        this.callbacksIdentifier.add(callback);
    }

    public void onIf(VisitorCallback<IfTree, P> callback) {
        this.callbacksIf.add(callback);
    }

    public void onImport(VisitorCallback<ImportTree, P> callback) {
        this.callbacksImport.add(callback);
    }

    public void onArrayAccess(VisitorCallback<ArrayAccessTree, P> callback) {
        this.callbacksArrayAccess.add(callback);
    }

    public void onLabeledStatement(VisitorCallback<LabeledStatementTree, P> callback) {
        this.callbacksLabeledStatement.add(callback);
    }

    public void onLiteral(VisitorCallback<LiteralTree, P> callback) {
        this.callbacksLiteral.add(callback);
    }

    public void onBindingPattern(VisitorCallback<BindingPatternTree, P> callback) {
        this.callbacksBindingPattern.add(callback);
    }

    public void onDefaultCaseLabel(VisitorCallback<DefaultCaseLabelTree, P> callback) {
        this.callbacksDefaultCaseLabel.add(callback);
    }

    public void onMethod(VisitorCallback<MethodTree, P> callback) {
        this.callbacksMethod.add(callback);
    }

    public void onModifiers(VisitorCallback<ModifiersTree, P> callback) {
        this.callbacksModifiers.add(callback);
    }

    public void onNewArray(VisitorCallback<NewArrayTree, P> callback) {
        this.callbacksNewArray.add(callback);
    }

    public void onGuardedPattern(VisitorCallback<GuardedPatternTree, P> callback) {
        this.callbacksGuardedPattern.add(callback);
    }

    public void onParenthesizedPattern(VisitorCallback<ParenthesizedPatternTree, P> callback) {
        this.callbacksParenthesizedPattern.add(callback);
    }

    public void onNewClass(VisitorCallback<NewClassTree, P> callback) {
        this.callbacksNewClass.add(callback);
    }

    public void onLambdaExpression(VisitorCallback<LambdaExpressionTree, P> callback) {
        this.callbacksLambdaExpression.add(callback);
    }

    public void onPackage(VisitorCallback<PackageTree, P> callback) {
        this.callbacksPackage.add(callback);
    }

    public void onParenthesized(VisitorCallback<ParenthesizedTree, P> callback) {
        this.callbacksParenthesized.add(callback);
    }

    public void onReturn(VisitorCallback<ReturnTree, P> callback) {
        this.callbacksReturn.add(callback);
    }

    public void onMemberSelect(VisitorCallback<MemberSelectTree, P> callback) {
        this.callbacksMemberSelect.add(callback);
    }

    public void onMemberReference(VisitorCallback<MemberReferenceTree, P> callback) {
        this.callbacksMemberReference.add(callback);
    }

    public void onEmptyStatement(VisitorCallback<EmptyStatementTree, P> callback) {
        this.callbacksEmptyStatement.add(callback);
    }

    public void onSwitch(VisitorCallback<SwitchTree, P> callback) {
        this.callbacksSwitch.add(callback);
    }

    public void onSwitchExpression(VisitorCallback<SwitchExpressionTree, P> callback) {
        this.callbacksSwitchExpression.add(callback);
    }

    public void onSynchronized(VisitorCallback<SynchronizedTree, P> callback) {
        this.callbacksSynchronized.add(callback);
    }

    public void onThrow(VisitorCallback<ThrowTree, P> callback) {
        this.callbacksThrow.add(callback);
    }

    public void onCompilationUnit(VisitorCallback<CompilationUnitTree, P> callback) {
        this.callbacksCompilationUnit.add(callback);
    }

    public void onTry(VisitorCallback<TryTree, P> callback) {
        this.callbacksTry.add(callback);
    }

    public void onParameterizedType(VisitorCallback<ParameterizedTypeTree, P> callback) {
        this.callbacksParameterizedType.add(callback);
    }

    public void onUnionType(VisitorCallback<UnionTypeTree, P> callback) {
        this.callbacksUnionType.add(callback);
    }

    public void onIntersectionType(VisitorCallback<IntersectionTypeTree, P> callback) {
        this.callbacksIntersectionType.add(callback);
    }

    public void onArrayType(VisitorCallback<ArrayTypeTree, P> callback) {
        this.callbacksArrayType.add(callback);
    }

    public void onTypeCast(VisitorCallback<TypeCastTree, P> callback) {
        this.callbacksTypeCast.add(callback);
    }

    public void onPrimitiveType(VisitorCallback<PrimitiveTypeTree, P> callback) {
        this.callbacksPrimitiveType.add(callback);
    }

    public void onTypeParameter(VisitorCallback<TypeParameterTree, P> callback) {
        this.callbacksTypeParameter.add(callback);
    }

    public void onInstanceOf(VisitorCallback<InstanceOfTree, P> callback) {
        this.callbacksInstanceOf.add(callback);
    }

    public void onUnary(VisitorCallback<UnaryTree, P> callback) {
        this.callbacksUnary.add(callback);
    }

    public void onVariable(VisitorCallback<VariableTree, P> callback) {
        this.callbacksVariable.add(callback);
    }

    public void onWhileLoop(VisitorCallback<WhileLoopTree, P> callback) {
        this.callbacksWhileLoop.add(callback);
    }

    public void onWildcard(VisitorCallback<WildcardTree, P> callback) {
        this.callbacksWildcard.add(callback);
    }

    public void onModule(VisitorCallback<ModuleTree, P> callback) {
        this.callbacksModule.add(callback);
    }

    public void onExports(VisitorCallback<ExportsTree, P> callback) {
        this.callbacksExports.add(callback);
    }

    public void onOpens(VisitorCallback<OpensTree, P> callback) {
        this.callbacksOpens.add(callback);
    }

    public void onProvides(VisitorCallback<ProvidesTree, P> callback) {
        this.callbacksProvides.add(callback);
    }

    public void onRequires(VisitorCallback<RequiresTree, P> callback) {
        this.callbacksRequires.add(callback);
    }

    public void onUses(VisitorCallback<UsesTree, P> callback) {
        this.callbacksUses.add(callback);
    }

    public void onOther(VisitorCallback<Tree, P> callback) {
        this.callbacksOther.add(callback);
    }

    public void onYield(VisitorCallback<YieldTree, P> callback) {
        this.callbacksYield.add(callback);
    }
}

