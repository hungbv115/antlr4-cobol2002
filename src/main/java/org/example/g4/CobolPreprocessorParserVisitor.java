// Generated from D:/Spring-boot/antlr4-cobol2002/src/main/java/org/example/g4/CobolPreprocessorParser.g4 by ANTLR 4.13.2
package org.example.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CobolPreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CobolPreprocessorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(CobolPreprocessorParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#identificationDivisionTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivisionTag(CobolPreprocessorParser.IdentificationDivisionTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerXOpts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerXOpts(CobolPreprocessorParser.CompilerXOptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerOption(CobolPreprocessorParser.CompilerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#define_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_opt(CobolPreprocessorParser.Define_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#identifier_et_al}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_et_al(CobolPreprocessorParser.Identifier_et_alContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#invdata_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvdata_opts(CobolPreprocessorParser.Invdata_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#numcheck_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumcheck_opts(CobolPreprocessorParser.Numcheck_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#numcheck_zon_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumcheck_zon_opts(CobolPreprocessorParser.Numcheck_zon_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#rules_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules_opts(CobolPreprocessorParser.Rules_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#ssrange_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsrange_opts(CobolPreprocessorParser.Ssrange_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#test_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_opts(CobolPreprocessorParser.Test_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#javaiop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaiop(CobolPreprocessorParser.JavaiopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#javaiopOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaiopOption(CobolPreprocessorParser.JavaiopOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#classicCommentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicCommentEntry(CobolPreprocessorParser.ClassicCommentEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#execCicsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecCicsStatement(CobolPreprocessorParser.ExecCicsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#execDliStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDliStatement(CobolPreprocessorParser.ExecDliStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#execSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlStatement(CobolPreprocessorParser.ExecSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlImsStatement(CobolPreprocessorParser.ExecSqlImsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#copyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStatement(CobolPreprocessorParser.CopyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#copySource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopySource(CobolPreprocessorParser.CopySourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#copyLibrary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyLibrary(CobolPreprocessorParser.CopyLibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplacingPhrase(CobolPreprocessorParser.ReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replaceArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceArea(CobolPreprocessorParser.ReplaceAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replaceByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceByStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replaceOffStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceClause(CobolPreprocessorParser.ReplaceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#directoryPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectoryPhrase(CobolPreprocessorParser.DirectoryPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#familyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFamilyPhrase(CobolPreprocessorParser.FamilyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replaceable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceable(CobolPreprocessorParser.ReplaceableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#replacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplacement(CobolPreprocessorParser.ReplacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#ejectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjectStatement(CobolPreprocessorParser.EjectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#skipStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStatement(CobolPreprocessorParser.SkipStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#titleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleStatement(CobolPreprocessorParser.TitleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#pseudoText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoText(CobolPreprocessorParser.PseudoTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#charData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharData(CobolPreprocessorParser.CharDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#charDataSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDataSql(CobolPreprocessorParser.CharDataSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#charDataLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDataLine(CobolPreprocessorParser.CharDataLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobolWord(CobolPreprocessorParser.CobolWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CobolPreprocessorParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(CobolPreprocessorParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#dfhvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfhvalue(CobolPreprocessorParser.DfhvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveStatement(CobolPreprocessorParser.CompilerDirectiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirective(CobolPreprocessorParser.CompilerDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationStatement(CobolPreprocessorParser.ConditionalCompilationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCallInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCallInterface(CobolPreprocessorParser.CompilerDirectiveCallInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveInline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveInline(CobolPreprocessorParser.CompilerDirectiveInlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveBasis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveBasis(CobolPreprocessorParser.CompilerDirectiveBasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#basisName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasisName(CobolPreprocessorParser.BasisNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveInsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveInsert(CobolPreprocessorParser.CompilerDirectiveInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveDelete(CobolPreprocessorParser.CompilerDirectiveDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveData(CobolPreprocessorParser.CompilerDirectiveDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCallConvention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCallConvention(CobolPreprocessorParser.CompilerDirectiveCallConventionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCobolWords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCobolWords(CobolPreprocessorParser.CompilerDirectiveCobolWordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveDisplay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveDisplay(CobolPreprocessorParser.CompilerDirectiveDisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveFlag02}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveFlag02(CobolPreprocessorParser.CompilerDirectiveFlag02Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveFlag14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveFlag14(CobolPreprocessorParser.CompilerDirectiveFlag14Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveJavaCallable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveJavaCallable(CobolPreprocessorParser.CompilerDirectiveJavaCallableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveJavaShareable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveJavaShareable(CobolPreprocessorParser.CompilerDirectiveJavaShareableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveLeapSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveLeapSecond(CobolPreprocessorParser.CompilerDirectiveLeapSecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveListing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveListing(CobolPreprocessorParser.CompilerDirectiveListingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectivePage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectivePage(CobolPreprocessorParser.CompilerDirectivePageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectivePop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectivePop(CobolPreprocessorParser.CompilerDirectivePopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectivePropogate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectivePropogate(CobolPreprocessorParser.CompilerDirectivePropogateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectivePush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectivePush(CobolPreprocessorParser.CompilerDirectivePushContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveRefModZeroLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveRefModZeroLength(CobolPreprocessorParser.CompilerDirectiveRefModZeroLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveSource(CobolPreprocessorParser.CompilerDirectiveSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveTurn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveTurn(CobolPreprocessorParser.CompilerDirectiveTurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectivePopList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectivePopList(CobolPreprocessorParser.CompilerDirectivePopListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCobolWordsEquate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCobolWordsEquate(CobolPreprocessorParser.CompilerDirectiveCobolWordsEquateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCobolWordsUndefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCobolWordsUndefine(CobolPreprocessorParser.CompilerDirectiveCobolWordsUndefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCobolWordsSubstitute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCobolWordsSubstitute(CobolPreprocessorParser.CompilerDirectiveCobolWordsSubstituteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveCobolWordsReserve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveCobolWordsReserve(CobolPreprocessorParser.CompilerDirectiveCobolWordsReserveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveNumericRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveNumericRange(CobolPreprocessorParser.CompilerDirectiveNumericRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveNumericAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveNumericAtom(CobolPreprocessorParser.CompilerDirectiveNumericAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#compilerDirectiveDeleteSequenceNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerDirectiveDeleteSequenceNumber(CobolPreprocessorParser.CompilerDirectiveDeleteSequenceNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationDefine(CobolPreprocessorParser.ConditionalCompilationDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationDefinePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationDefinePredicate(CobolPreprocessorParser.ConditionalCompilationDefinePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationArithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationArithmeticExpression(CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationArithmeticAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationArithmeticAtom(CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationArithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationArithmeticOp(CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationIf(CobolPreprocessorParser.ConditionalCompilationIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationElse(CobolPreprocessorParser.ConditionalCompilationElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationEndIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationEndIf(CobolPreprocessorParser.ConditionalCompilationEndIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationEvaluateSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationEvaluateSelection(CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationEvaluate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationEvaluate(CobolPreprocessorParser.ConditionalCompilationEvaluateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationWhen(CobolPreprocessorParser.ConditionalCompilationWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationEndEvaluate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationEndEvaluate(CobolPreprocessorParser.ConditionalCompilationEndEvaluateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationComparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationComparisonOp(CobolPreprocessorParser.ConditionalCompilationComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationRelationalCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationRelationalCondition(CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationCondition(CobolPreprocessorParser.ConditionalCompilationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationSimpleRelationalCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationSimpleRelationalCondition(CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationBinaryCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationBinaryCondition(CobolPreprocessorParser.ConditionalCompilationBinaryConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#conditionalCompilationDefinedCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalCompilationDefinedCondition(CobolPreprocessorParser.ConditionalCompilationDefinedConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolPreprocessorParser#charDataKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDataKeyword(CobolPreprocessorParser.CharDataKeywordContext ctx);
}