package javah.domain.compiler.visitor;

import com.sun.source.tree.*;

public class FunctionalVisitor<P> extends FunctionalVisitorCallbacks<P> implements TreeVisitor<Void, P> {
    @Override
    public Void visitAnnotatedType(AnnotatedTypeTree node, P p) {
        this.callbacksAnnotatedType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitAnnotation(AnnotationTree node, P p) {
        this.callbacksAnnotation.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitMethodInvocation(MethodInvocationTree node, P p) {
        this.callbacksMethodInvocation.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitAssert(AssertTree node, P p) {
        this.callbacksAssert.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitAssignment(AssignmentTree node, P p) {
        this.callbacksAssignment.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitCompoundAssignment(CompoundAssignmentTree node, P p) {
        this.callbacksCompoundAssignment.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitBinary(BinaryTree node, P p) {
        this.callbacksBinary.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitBlock(BlockTree node, P p) {
        this.callbacksBlock.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitBreak(BreakTree node, P p) {
        this.callbacksBreak.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitCase(CaseTree node, P p) {
        this.callbacksCase.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitCatch(CatchTree node, P p) {
        this.callbacksCatch.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitClass(ClassTree node, P p) {
        this.callbacksClass.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitConditionalExpression(ConditionalExpressionTree node, P p) {
        this.callbacksConditionalExpression.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitContinue(ContinueTree node, P p) {
        this.callbacksContinue.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitDoWhileLoop(DoWhileLoopTree node, P p) {
        this.callbacksDoWhileLoop.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitErroneous(ErroneousTree node, P p) {
        this.callbacksErroneous.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitExpressionStatement(ExpressionStatementTree node, P p) {
        this.callbacksExpressionStatement.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitEnhancedForLoop(EnhancedForLoopTree node, P p) {
        this.callbacksEnhancedForLoop.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitForLoop(ForLoopTree node, P p) {
        this.callbacksForLoop.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitIdentifier(IdentifierTree node, P p) {
        this.callbacksIdentifier.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitIf(IfTree node, P p) {
        this.callbacksIf.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitImport(ImportTree node, P p) {
        this.callbacksImport.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitArrayAccess(ArrayAccessTree node, P p) {
        this.callbacksArrayAccess.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitLabeledStatement(LabeledStatementTree node, P p) {
        this.callbacksLabeledStatement.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitLiteral(LiteralTree node, P p) {
        this.callbacksLiteral.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitBindingPattern(BindingPatternTree node, P p) {
        this.callbacksBindingPattern.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitDefaultCaseLabel(DefaultCaseLabelTree node, P p) {
        this.callbacksDefaultCaseLabel.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitMethod(MethodTree node, P p) {
        this.callbacksMethod.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitModifiers(ModifiersTree node, P p) {
        this.callbacksModifiers.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitNewArray(NewArrayTree node, P p) {
        this.callbacksNewArray.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitGuardedPattern(GuardedPatternTree node, P p) {
        this.callbacksGuardedPattern.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitParenthesizedPattern(ParenthesizedPatternTree node, P p) {
        this.callbacksParenthesizedPattern.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitNewClass(NewClassTree node, P p) {
        this.callbacksNewClass.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitLambdaExpression(LambdaExpressionTree node, P p) {
        this.callbacksLambdaExpression.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitPackage(PackageTree node, P p) {
        this.callbacksPackage.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitParenthesized(ParenthesizedTree node, P p) {
        this.callbacksParenthesized.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitReturn(ReturnTree node, P p) {
        this.callbacksReturn.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitMemberSelect(MemberSelectTree node, P p) {
        this.callbacksMemberSelect.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitMemberReference(MemberReferenceTree node, P p) {
        this.callbacksMemberReference.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitEmptyStatement(EmptyStatementTree node, P p) {
        this.callbacksEmptyStatement.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitSwitch(SwitchTree node, P p) {
        this.callbacksSwitch.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitSwitchExpression(SwitchExpressionTree node, P p) {
        this.callbacksSwitchExpression.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitSynchronized(SynchronizedTree node, P p) {
        this.callbacksSynchronized.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitThrow(ThrowTree node, P p) {
        this.callbacksThrow.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitCompilationUnit(CompilationUnitTree node, P p) {
        this.callbacksCompilationUnit.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitTry(TryTree node, P p) {
        this.callbacksTry.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitParameterizedType(ParameterizedTypeTree node, P p) {
        this.callbacksParameterizedType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitUnionType(UnionTypeTree node, P p) {
        this.callbacksUnionType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitIntersectionType(IntersectionTypeTree node, P p) {
        this.callbacksIntersectionType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitArrayType(ArrayTypeTree node, P p) {
        this.callbacksArrayType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitTypeCast(TypeCastTree node, P p) {
        this.callbacksTypeCast.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitPrimitiveType(PrimitiveTypeTree node, P p) {
        this.callbacksPrimitiveType.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitTypeParameter(TypeParameterTree node, P p) {
        this.callbacksTypeParameter.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitInstanceOf(InstanceOfTree node, P p) {
        this.callbacksInstanceOf.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitUnary(UnaryTree node, P p) {
        this.callbacksUnary.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitVariable(VariableTree node, P p) {
        this.callbacksVariable.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitWhileLoop(WhileLoopTree node, P p) {
        this.callbacksWhileLoop.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitWildcard(WildcardTree node, P p) {
        this.callbacksWildcard.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitModule(ModuleTree node, P p) {
        this.callbacksModule.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitExports(ExportsTree node, P p) {
        this.callbacksExports.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitOpens(OpensTree node, P p) {
        this.callbacksOpens.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitProvides(ProvidesTree node, P p) {
        this.callbacksProvides.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitRequires(RequiresTree node, P p) {
        this.callbacksRequires.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitUses(UsesTree node, P p) {
        this.callbacksUses.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitOther(Tree node, P p) {
        this.callbacksOther.forEach( callback -> callback.exec(node, p) );
        return null;
    }

    @Override
    public Void visitYield(YieldTree node, P p) {
        this.callbacksYield.forEach( callback -> callback.exec(node, p) );
        return null;
    }
}
