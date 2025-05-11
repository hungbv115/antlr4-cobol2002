// Generated from D:/Spring-boot/antlr4-cobol2002/src/main/java/org/example/g4/COBOL2002Parser.g4 by ANTLR 4.13.2
package org.example.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COBOL2002Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COBOL2002ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(COBOL2002Parser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(COBOL2002Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#programUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramUnit(COBOL2002Parser.ProgramUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classicCommentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicCommentEntry(COBOL2002Parser.ClassicCommentEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endProgramUnitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndProgramUnitStatement(COBOL2002Parser.EndProgramUnitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endClassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndClassStatement(COBOL2002Parser.EndClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndFunctionStatement(COBOL2002Parser.EndFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endMethodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndMethodStatement(COBOL2002Parser.EndMethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endInterfaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndInterfaceStatement(COBOL2002Parser.EndInterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endFactoryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndFactoryStatement(COBOL2002Parser.EndFactoryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endObjectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndObjectStatement(COBOL2002Parser.EndObjectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endProgramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndProgramStatement(COBOL2002Parser.EndProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#identificationDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivision(COBOL2002Parser.IdentificationDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#identificationDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificationDivisionBody(COBOL2002Parser.IdentificationDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#programIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdParagraph(COBOL2002Parser.ProgramIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassIdParagraph(COBOL2002Parser.ClassIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#factoryParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryParagraph(COBOL2002Parser.FactoryParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdParagraph(COBOL2002Parser.FunctionIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionPrototypeIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototypeIdParagraph(COBOL2002Parser.FunctionPrototypeIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionPrototypeNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototypeNameClause(COBOL2002Parser.FunctionPrototypeNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryNameClause(COBOL2002Parser.EntryNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryInterfaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryInterfaceClause(COBOL2002Parser.EntryInterfaceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryInterfaceParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryInterfaceParagraph(COBOL2002Parser.EntryInterfaceParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryNameParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryNameParagraph(COBOL2002Parser.EntryNameParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#interfaceIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceIdParagraph(COBOL2002Parser.InterfaceIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#methodIdParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodIdParagraph(COBOL2002Parser.MethodIdParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#objectParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectParagraph(COBOL2002Parser.ObjectParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#optionsParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsParagraph(COBOL2002Parser.OptionsParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#optionsParagraphBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsParagraphBody(COBOL2002Parser.OptionsParagraphBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#arithmeticClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticClause(COBOL2002Parser.ArithmeticClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#defaultRoundedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultRoundedClause(COBOL2002Parser.DefaultRoundedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#roundedMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundedMode(COBOL2002Parser.RoundedModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#roundedPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundedPhrase(COBOL2002Parser.RoundedPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryConventionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryConventionClause(COBOL2002Parser.EntryConventionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#floatBinaryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatBinaryClause(COBOL2002Parser.FloatBinaryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#floatDecimalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDecimalClause(COBOL2002Parser.FloatDecimalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#encodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodingPhrase(COBOL2002Parser.EncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endiannessPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndiannessPhrase(COBOL2002Parser.EndiannessPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeClause(COBOL2002Parser.InitializeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#intermediateRoundingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntermediateRoundingClause(COBOL2002Parser.IntermediateRoundingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#authorParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorParagraph(COBOL2002Parser.AuthorParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#authorParagraphHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorParagraphHeading(COBOL2002Parser.AuthorParagraphHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#authorParagraphText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorParagraphText(COBOL2002Parser.AuthorParagraphTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#installationParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallationParagraph(COBOL2002Parser.InstallationParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dateWrittenParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateWrittenParagraph(COBOL2002Parser.DateWrittenParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dateCompiledParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateCompiledParagraph(COBOL2002Parser.DateCompiledParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#securityParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityParagraph(COBOL2002Parser.SecurityParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#remarksParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemarksParagraph(COBOL2002Parser.RemarksParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#environmentDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivision(COBOL2002Parser.EnvironmentDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#environmentDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDivisionBody(COBOL2002Parser.EnvironmentDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#configurationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationSection(COBOL2002Parser.ConfigurationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#configurationSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationSectionParagraph(COBOL2002Parser.ConfigurationSectionParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sourceComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceComputerParagraph(COBOL2002Parser.SourceComputerParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#objectComputerParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectComputerParagraph(COBOL2002Parser.ObjectComputerParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#objectComputerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectComputerClause(COBOL2002Parser.ObjectComputerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#memorySizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemorySizeClause(COBOL2002Parser.MemorySizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#diskSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiskSizeClause(COBOL2002Parser.DiskSizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#collatingSequenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClause(COBOL2002Parser.CollatingSequenceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#collatingSequenceClauseAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClauseAlphanumeric(COBOL2002Parser.CollatingSequenceClauseAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#collatingSequenceClauseNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollatingSequenceClauseNational(COBOL2002Parser.CollatingSequenceClauseNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#segmentLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentLimitClause(COBOL2002Parser.SegmentLimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#characterSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetClause(COBOL2002Parser.CharacterSetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#characterClassificationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClassificationClause(COBOL2002Parser.CharacterClassificationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#characterClassificationClauseAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClassificationClauseAlphanumeric(COBOL2002Parser.CharacterClassificationClauseAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#characterClassificationClauseNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClassificationClauseNational(COBOL2002Parser.CharacterClassificationClauseNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#localePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalePhrase(COBOL2002Parser.LocalePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#specialNamesParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialNamesParagraph(COBOL2002Parser.SpecialNamesParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#specialNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialNameClause(COBOL2002Parser.SpecialNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClause(COBOL2002Parser.AlphabetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClauseFormat1(COBOL2002Parser.AlphabetClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetLiterals(COBOL2002Parser.AlphabetLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetThrough(COBOL2002Parser.AlphabetThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetAlso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetAlso(COBOL2002Parser.AlphabetAlsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetClauseFormat2(COBOL2002Parser.AlphabetClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#channelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelClause(COBOL2002Parser.ChannelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClause(COBOL2002Parser.ClassClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classClauseThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseThrough(COBOL2002Parser.ClassClauseThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classClauseFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseFrom(COBOL2002Parser.ClassClauseFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classClauseTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClauseTo(COBOL2002Parser.ClassClauseToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#currencySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrencySignClause(COBOL2002Parser.CurrencySignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#decimalPointClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPointClause(COBOL2002Parser.DecimalPointClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#defaultComputationalSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultComputationalSignClause(COBOL2002Parser.DefaultComputationalSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#defaultDisplaySignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultDisplaySignClause(COBOL2002Parser.DefaultDisplaySignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#environmentSwitchNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentSwitchNameClause(COBOL2002Parser.EnvironmentSwitchNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#environmentSwitchNameSpecialNamesStatusPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentSwitchNameSpecialNamesStatusPhrase(COBOL2002Parser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#odtClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdtClause(COBOL2002Parser.OdtClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reserveNetworkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveNetworkClause(COBOL2002Parser.ReserveNetworkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicCharactersClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharactersClause(COBOL2002Parser.SymbolicCharactersClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharacters(COBOL2002Parser.SymbolicCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlSchemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlSchemaClause(COBOL2002Parser.XmlSchemaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#crtStatusClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrtStatusClause(COBOL2002Parser.CrtStatusClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cursorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorClause(COBOL2002Parser.CursorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dynamicLengthStructureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicLengthStructureClause(COBOL2002Parser.DynamicLengthStructureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#localeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaleClause(COBOL2002Parser.LocaleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#orderTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderTableClause(COBOL2002Parser.OrderTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#respositoryParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespositoryParagraph(COBOL2002Parser.RespositoryParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classIsPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassIsPhrase(COBOL2002Parser.ClassIsPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#interfaceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceSpecifier(COBOL2002Parser.InterfaceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionIntrinsicPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIntrinsicPhrase(COBOL2002Parser.FunctionIntrinsicPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#programSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramSpecifier(COBOL2002Parser.ProgramSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#propertySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySpecifier(COBOL2002Parser.PropertySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#userDefinedFunctionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedFunctionSpecifier(COBOL2002Parser.UserDefinedFunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inputOutputSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputOutputSection(COBOL2002Parser.InputOutputSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inputOutputSectionParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputOutputSectionParagraph(COBOL2002Parser.InputOutputSectionParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlParagraph(COBOL2002Parser.FileControlParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileControlEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlEntry(COBOL2002Parser.FileControlEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(COBOL2002Parser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlClause(COBOL2002Parser.FileControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#assignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignClause(COBOL2002Parser.AssignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reserveClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveClause(COBOL2002Parser.ReserveClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#organizationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrganizationClause(COBOL2002Parser.OrganizationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#paddingCharacterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingCharacterClause(COBOL2002Parser.PaddingCharacterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordDelimiterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDelimiterClause(COBOL2002Parser.RecordDelimiterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#accessModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModeClause(COBOL2002Parser.AccessModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordKeyClause(COBOL2002Parser.RecordKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alternateRecordKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternateRecordKeyClause(COBOL2002Parser.AlternateRecordKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#passwordClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordClause(COBOL2002Parser.PasswordClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileStatusClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStatusClause(COBOL2002Parser.FileStatusClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relativeKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeKeyClause(COBOL2002Parser.RelativeKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#lockModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockModeClause(COBOL2002Parser.LockModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sharingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharingClause(COBOL2002Parser.SharingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ioControlParagraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoControlParagraph(COBOL2002Parser.IoControlParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ioControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoControlClause(COBOL2002Parser.IoControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rerunClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunClause(COBOL2002Parser.RerunClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rerunEveryRecords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryRecords(COBOL2002Parser.RerunEveryRecordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rerunEveryOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryOf(COBOL2002Parser.RerunEveryOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rerunEveryClock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRerunEveryClock(COBOL2002Parser.RerunEveryClockContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameClause(COBOL2002Parser.SameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multipleFileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleFileClause(COBOL2002Parser.MultipleFileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multipleFilePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleFilePosition(COBOL2002Parser.MultipleFilePositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#commitmentControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitmentControlClause(COBOL2002Parser.CommitmentControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#applyCommitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyCommitClause(COBOL2002Parser.ApplyCommitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivision(COBOL2002Parser.DataDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDivisionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDivisionSection(COBOL2002Parser.DataDivisionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSection(COBOL2002Parser.FileSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDescriptionEntry(COBOL2002Parser.FileDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileDescriptionEntryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDescriptionEntryClause(COBOL2002Parser.FileDescriptionEntryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#externalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalClause(COBOL2002Parser.ExternalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#globalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalClause(COBOL2002Parser.GlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#formatClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatClause(COBOL2002Parser.FormatClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#blockContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContainsClause(COBOL2002Parser.BlockContainsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#blockContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContainsTo(COBOL2002Parser.BlockContainsToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordContainsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClause(COBOL2002Parser.RecordContainsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordContainsClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat1(COBOL2002Parser.RecordContainsClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordContainsClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat2(COBOL2002Parser.RecordContainsClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordContainsClauseFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsClauseFormat3(COBOL2002Parser.RecordContainsClauseFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordContainsTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordContainsTo(COBOL2002Parser.RecordContainsToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#labelRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelRecordsClause(COBOL2002Parser.LabelRecordsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#valueOfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOfClause(COBOL2002Parser.ValueOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#valuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePair(COBOL2002Parser.ValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataRecordsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRecordsClause(COBOL2002Parser.DataRecordsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageClause(COBOL2002Parser.LinageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linageAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageAt(COBOL2002Parser.LinageAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linageFootingAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageFootingAt(COBOL2002Parser.LinageFootingAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linageLinesAtTop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageLinesAtTop(COBOL2002Parser.LinageLinesAtTopContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linageLinesAtBottom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinageLinesAtBottom(COBOL2002Parser.LinageLinesAtBottomContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordingModeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordingModeClause(COBOL2002Parser.RecordingModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#modeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeStatement(COBOL2002Parser.ModeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#codeSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSetClause(COBOL2002Parser.CodeSetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#codeSetAlphabetPhrase1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSetAlphabetPhrase1(COBOL2002Parser.CodeSetAlphabetPhrase1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#codeSetAlphabetPhrase2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSetAlphabetPhrase2(COBOL2002Parser.CodeSetAlphabetPhrase2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportClause(COBOL2002Parser.ReportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataBaseSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBaseSection(COBOL2002Parser.DataBaseSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataBaseSectionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBaseSectionEntry(COBOL2002Parser.DataBaseSectionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#workingStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkingStorageSection(COBOL2002Parser.WorkingStorageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#linkageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSection(COBOL2002Parser.LinkageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#communicationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationSection(COBOL2002Parser.CommunicationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#communicationDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntry(COBOL2002Parser.CommunicationDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#communicationDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat1(COBOL2002Parser.CommunicationDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#communicationDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat2(COBOL2002Parser.CommunicationDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#communicationDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommunicationDescriptionEntryFormat3(COBOL2002Parser.CommunicationDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#destinationCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationCountClause(COBOL2002Parser.DestinationCountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#destinationTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationTableClause(COBOL2002Parser.DestinationTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#endKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndKeyClause(COBOL2002Parser.EndKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#errorKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorKeyClause(COBOL2002Parser.ErrorKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#messageCountClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCountClause(COBOL2002Parser.MessageCountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#messageDateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDateClause(COBOL2002Parser.MessageDateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#messageTimeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageTimeClause(COBOL2002Parser.MessageTimeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#statusKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusKeyClause(COBOL2002Parser.StatusKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicDestinationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicDestinationClause(COBOL2002Parser.SymbolicDestinationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicQueueClause(COBOL2002Parser.SymbolicQueueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicSourceClause(COBOL2002Parser.SymbolicSourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicTerminalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicTerminalClause(COBOL2002Parser.SymbolicTerminalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicSubQueueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicSubQueueClause(COBOL2002Parser.SymbolicSubQueueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#textLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLengthClause(COBOL2002Parser.TextLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#localStorageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalStorageSection(COBOL2002Parser.LocalStorageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenSection(COBOL2002Parser.ScreenSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionEntry(COBOL2002Parser.ScreenDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionBlankClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlankClause(COBOL2002Parser.ScreenDescriptionBlankClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionBellClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBellClause(COBOL2002Parser.ScreenDescriptionBellClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionBlinkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlinkClause(COBOL2002Parser.ScreenDescriptionBlinkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionEraseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionEraseClause(COBOL2002Parser.ScreenDescriptionEraseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionLightClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionLightClause(COBOL2002Parser.ScreenDescriptionLightClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionGridClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionGridClause(COBOL2002Parser.ScreenDescriptionGridClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionReverseVideoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionReverseVideoClause(COBOL2002Parser.ScreenDescriptionReverseVideoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionUnderlineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUnderlineClause(COBOL2002Parser.ScreenDescriptionUnderlineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionSizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSizeClause(COBOL2002Parser.ScreenDescriptionSizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionLineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionLineClause(COBOL2002Parser.ScreenDescriptionLineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionColumnClause(COBOL2002Parser.ScreenDescriptionColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionForegroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionForegroundColorClause(COBOL2002Parser.ScreenDescriptionForegroundColorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionBackgroundColorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBackgroundColorClause(COBOL2002Parser.ScreenDescriptionBackgroundColorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionControlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionControlClause(COBOL2002Parser.ScreenDescriptionControlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionValueClause(COBOL2002Parser.ScreenDescriptionValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPictureClause(COBOL2002Parser.ScreenDescriptionPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionFromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionFromClause(COBOL2002Parser.ScreenDescriptionFromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionToClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionToClause(COBOL2002Parser.ScreenDescriptionToClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUsingClause(COBOL2002Parser.ScreenDescriptionUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUsageClause(COBOL2002Parser.ScreenDescriptionUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionBlankWhenZeroClause(COBOL2002Parser.ScreenDescriptionBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionJustifiedClause(COBOL2002Parser.ScreenDescriptionJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSignClause(COBOL2002Parser.ScreenDescriptionSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionAutoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionAutoClause(COBOL2002Parser.ScreenDescriptionAutoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionSecureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionSecureClause(COBOL2002Parser.ScreenDescriptionSecureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionRequiredClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionRequiredClause(COBOL2002Parser.ScreenDescriptionRequiredClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionPromptClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPromptClause(COBOL2002Parser.ScreenDescriptionPromptClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionPromptOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionPromptOccursClause(COBOL2002Parser.ScreenDescriptionPromptOccursClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionFullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionFullClause(COBOL2002Parser.ScreenDescriptionFullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionUpperOrLowerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUpperOrLowerClause(COBOL2002Parser.ScreenDescriptionUpperOrLowerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionScrollClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionScrollClause(COBOL2002Parser.ScreenDescriptionScrollClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionUpdateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionUpdateClause(COBOL2002Parser.ScreenDescriptionUpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenDescriptionZeroFillClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenDescriptionZeroFillClause(COBOL2002Parser.ScreenDescriptionZeroFillClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportSection(COBOL2002Parser.ReportSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescription(COBOL2002Parser.ReportDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionEntry(COBOL2002Parser.ReportDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionGlobalClause(COBOL2002Parser.ReportDescriptionGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionPageLimitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionPageLimitClause(COBOL2002Parser.ReportDescriptionPageLimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionHeadingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionHeadingClause(COBOL2002Parser.ReportDescriptionHeadingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionFirstDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionFirstDetailClause(COBOL2002Parser.ReportDescriptionFirstDetailClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionLastDetailClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionLastDetailClause(COBOL2002Parser.ReportDescriptionLastDetailClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportDescriptionFootingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDescriptionFootingClause(COBOL2002Parser.ReportDescriptionFootingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntry(COBOL2002Parser.ReportGroupDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat1(COBOL2002Parser.ReportGroupDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat2(COBOL2002Parser.ReportGroupDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupDescriptionEntryFormat3(COBOL2002Parser.ReportGroupDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupBlankWhenZeroClause(COBOL2002Parser.ReportGroupBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupColumnNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupColumnNumberClause(COBOL2002Parser.ReportGroupColumnNumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupIndicateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupIndicateClause(COBOL2002Parser.ReportGroupIndicateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupJustifiedClause(COBOL2002Parser.ReportGroupJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupLineNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberClause(COBOL2002Parser.ReportGroupLineNumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupLineNumberNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberNextPage(COBOL2002Parser.ReportGroupLineNumberNextPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupLineNumberPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupLineNumberPlus(COBOL2002Parser.ReportGroupLineNumberPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupNextGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupClause(COBOL2002Parser.ReportGroupNextGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupNextGroupPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupPlus(COBOL2002Parser.ReportGroupNextGroupPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupNextGroupNextPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupNextGroupNextPage(COBOL2002Parser.ReportGroupNextGroupNextPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupPictureClause(COBOL2002Parser.ReportGroupPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupResetClause(COBOL2002Parser.ReportGroupResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSignClause(COBOL2002Parser.ReportGroupSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupSourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSourceClause(COBOL2002Parser.ReportGroupSourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupSumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupSumClause(COBOL2002Parser.ReportGroupSumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeClause(COBOL2002Parser.ReportGroupTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeReportHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeReportHeading(COBOL2002Parser.ReportGroupTypeReportHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypePageHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypePageHeading(COBOL2002Parser.ReportGroupTypePageHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeControlHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeControlHeading(COBOL2002Parser.ReportGroupTypeControlHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeDetail(COBOL2002Parser.ReportGroupTypeDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeControlFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeControlFooting(COBOL2002Parser.ReportGroupTypeControlFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupUsageClause(COBOL2002Parser.ReportGroupUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypePageFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypePageFooting(COBOL2002Parser.ReportGroupTypePageFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupTypeReportFooting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupTypeReportFooting(COBOL2002Parser.ReportGroupTypeReportFootingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportGroupValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportGroupValueClause(COBOL2002Parser.ReportGroupValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#programLibrarySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLibrarySection(COBOL2002Parser.ProgramLibrarySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntry(COBOL2002Parser.LibraryDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntryFormat1(COBOL2002Parser.LibraryDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDescriptionEntryFormat2(COBOL2002Parser.LibraryDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryAttributeClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeClauseFormat1(COBOL2002Parser.LibraryAttributeClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryAttributeClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeClauseFormat2(COBOL2002Parser.LibraryAttributeClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryAttributeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeFunction(COBOL2002Parser.LibraryAttributeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryAttributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeParameter(COBOL2002Parser.LibraryAttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryAttributeTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryAttributeTitle(COBOL2002Parser.LibraryAttributeTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureClauseFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureClauseFormat1(COBOL2002Parser.LibraryEntryProcedureClauseFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureClauseFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureClauseFormat2(COBOL2002Parser.LibraryEntryProcedureClauseFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureForClause(COBOL2002Parser.LibraryEntryProcedureForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureGivingClause(COBOL2002Parser.LibraryEntryProcedureGivingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureUsingClause(COBOL2002Parser.LibraryEntryProcedureUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureUsingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureUsingName(COBOL2002Parser.LibraryEntryProcedureUsingNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureWithClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureWithClause(COBOL2002Parser.LibraryEntryProcedureWithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryEntryProcedureWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryEntryProcedureWithName(COBOL2002Parser.LibraryEntryProcedureWithNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryIsCommonClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryIsCommonClause(COBOL2002Parser.LibraryIsCommonClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryIsGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryIsGlobalClause(COBOL2002Parser.LibraryIsGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#constantEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantEntry(COBOL2002Parser.ConstantEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#constantEntryAsPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantEntryAsPhrase(COBOL2002Parser.ConstantEntryAsPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#constantEntryFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantEntryFromPhrase(COBOL2002Parser.ConstantEntryFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntry(COBOL2002Parser.DataDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat1(COBOL2002Parser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat2(COBOL2002Parser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat3(COBOL2002Parser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescriptionEntryExecSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryExecSql(COBOL2002Parser.DataDescriptionEntryExecSqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataAlignedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAlignedClause(COBOL2002Parser.DataAlignedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataAnyLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAnyLengthClause(COBOL2002Parser.DataAnyLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlankWhenZeroClause(COBOL2002Parser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataBasedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBasedClause(COBOL2002Parser.DataBasedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCommonOwnLocalClause(COBOL2002Parser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataConstantRecordClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataConstantRecordClause(COBOL2002Parser.DataConstantRecordClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDynamicLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDynamicLengthClause(COBOL2002Parser.DataDynamicLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataExternalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExternalClause(COBOL2002Parser.DataExternalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataGlobalClause(COBOL2002Parser.DataGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataGroupUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataGroupUsageClause(COBOL2002Parser.DataGroupUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataIntegerStringClause(COBOL2002Parser.DataIntegerStringClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataJustifiedClause(COBOL2002Parser.DataJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursClause(COBOL2002Parser.DataOccursClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataOccursTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursTo(COBOL2002Parser.DataOccursToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataOccursDepending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursDepending(COBOL2002Parser.DataOccursDependingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataOccursSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursSort(COBOL2002Parser.DataOccursSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataOccursIndexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursIndexed(COBOL2002Parser.DataOccursIndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPictureClause(COBOL2002Parser.DataPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureString(COBOL2002Parser.PictureStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureCharAndCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureCharAndCardinality(COBOL2002Parser.PictureCharAndCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureChars(COBOL2002Parser.PictureCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureCardinality(COBOL2002Parser.PictureCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureEditingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureEditingPhrase(COBOL2002Parser.PictureEditingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#pictureLocalePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureLocalePhrase(COBOL2002Parser.PictureLocalePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyClause(COBOL2002Parser.DataPropertyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataReceivedByClause(COBOL2002Parser.DataReceivedByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRecordAreaClause(COBOL2002Parser.DataRecordAreaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRedefinesClause(COBOL2002Parser.DataRedefinesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataRenamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRenamesClause(COBOL2002Parser.DataRenamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataSameAsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSameAsClause(COBOL2002Parser.DataSameAsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataSelectWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSelectWhenClause(COBOL2002Parser.DataSelectWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSignClause(COBOL2002Parser.DataSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSynchronizedClause(COBOL2002Parser.DataSynchronizedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataThreadLocalClause(COBOL2002Parser.DataThreadLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeClause(COBOL2002Parser.DataTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDefClause(COBOL2002Parser.DataTypeDefClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageClause(COBOL2002Parser.DataUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataUsageObjectReferenceFactoryPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageObjectReferenceFactoryPhrase(COBOL2002Parser.DataUsageObjectReferenceFactoryPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsingClause(COBOL2002Parser.DataUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueClause(COBOL2002Parser.DataValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataValueInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueInterval(COBOL2002Parser.DataValueIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalFrom(COBOL2002Parser.DataValueIntervalFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalTo(COBOL2002Parser.DataValueIntervalToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataVolatileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataVolatileClause(COBOL2002Parser.DataVolatileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWithLowerBoundsClause(COBOL2002Parser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivision(COBOL2002Parser.ProcedureDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionUsingClause(COBOL2002Parser.ProcedureDivisionUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionGivingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionGivingClause(COBOL2002Parser.ProcedureDivisionGivingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionRaisingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionRaisingClause(COBOL2002Parser.ProcedureDivisionRaisingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionUsingParameter(COBOL2002Parser.ProcedureDivisionUsingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByReferencePhrase(COBOL2002Parser.ProcedureDivisionByReferencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByReference(COBOL2002Parser.ProcedureDivisionByReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByValuePhrase(COBOL2002Parser.ProcedureDivisionByValuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionByValue(COBOL2002Parser.ProcedureDivisionByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDeclaratives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaratives(COBOL2002Parser.ProcedureDeclarativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDeclarative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclarative(COBOL2002Parser.ProcedureDeclarativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureSectionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSectionHeader(COBOL2002Parser.ProcedureSectionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureDivisionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDivisionBody(COBOL2002Parser.ProcedureDivisionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSection(COBOL2002Parser.ProcedureSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#paragraphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphs(COBOL2002Parser.ParagraphsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(COBOL2002Parser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(COBOL2002Parser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(COBOL2002Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptStatement(COBOL2002Parser.AcceptStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptFromDateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromDateStatement(COBOL2002Parser.AcceptFromDateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptFromMnemonicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromMnemonicStatement(COBOL2002Parser.AcceptFromMnemonicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptFromEscapeKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptFromEscapeKeyStatement(COBOL2002Parser.AcceptFromEscapeKeyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptMessageCountStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptMessageCountStatement(COBOL2002Parser.AcceptMessageCountStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#acceptScreenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceptScreenStatement(COBOL2002Parser.AcceptScreenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStatement(COBOL2002Parser.AddStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToStatement(COBOL2002Parser.AddToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addToGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToGivingStatement(COBOL2002Parser.AddToGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCorrespondingStatement(COBOL2002Parser.AddCorrespondingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFrom(COBOL2002Parser.AddFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTo(COBOL2002Parser.AddToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addToGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToGiving(COBOL2002Parser.AddToGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#addGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddGiving(COBOL2002Parser.AddGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#allocateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocateStatement(COBOL2002Parser.AllocateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alteredGoTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteredGoTo(COBOL2002Parser.AlteredGoToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatement(COBOL2002Parser.AlterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alterProceedTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProceedTo(COBOL2002Parser.AlterProceedToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(COBOL2002Parser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callUsingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallUsingPhrase(COBOL2002Parser.CallUsingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callUsingParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallUsingParameter(COBOL2002Parser.CallUsingParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByReferencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByReferencePhrase(COBOL2002Parser.CallByReferencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByReference(COBOL2002Parser.CallByReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByValuePhrase(COBOL2002Parser.CallByValuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByValue(COBOL2002Parser.CallByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByContentPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByContentPhrase(COBOL2002Parser.CallByContentPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callByContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallByContent(COBOL2002Parser.CallByContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#callGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallGivingPhrase(COBOL2002Parser.CallGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fixedPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPhrase(COBOL2002Parser.FixedPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cancelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelStatement(COBOL2002Parser.CancelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cancelCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelCall(COBOL2002Parser.CancelCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStatement(COBOL2002Parser.CloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseFile(COBOL2002Parser.CloseFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closeReelUnitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseReelUnitStatement(COBOL2002Parser.CloseReelUnitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closeRelativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseRelativeStatement(COBOL2002Parser.CloseRelativeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closePortFileIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOStatement(COBOL2002Parser.ClosePortFileIOStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closePortFileIOUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsing(COBOL2002Parser.ClosePortFileIOUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closePortFileIOUsingCloseDisposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingCloseDisposition(COBOL2002Parser.ClosePortFileIOUsingCloseDispositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closePortFileIOUsingAssociatedData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingAssociatedData(COBOL2002Parser.ClosePortFileIOUsingAssociatedDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#closePortFileIOUsingAssociatedDataLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortFileIOUsingAssociatedDataLength(COBOL2002Parser.ClosePortFileIOUsingAssociatedDataLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#commitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitStatement(COBOL2002Parser.CommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#computeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeStatement(COBOL2002Parser.ComputeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#computeStore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeStore(COBOL2002Parser.ComputeStoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(COBOL2002Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(COBOL2002Parser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#deleteStatementFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatementFormat1(COBOL2002Parser.DeleteStatementFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#deleteStatementFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatementFormat2(COBOL2002Parser.DeleteStatementFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#disableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableStatement(COBOL2002Parser.DisableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(COBOL2002Parser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayStatementFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatementFormat1(COBOL2002Parser.DisplayStatementFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayOperand(COBOL2002Parser.DisplayOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayAt(COBOL2002Parser.DisplayAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayUpon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayUpon(COBOL2002Parser.DisplayUponContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayWith(COBOL2002Parser.DisplayWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayStatementFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatementFormat2(COBOL2002Parser.DisplayStatementFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#displayAtFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayAtFormat2(COBOL2002Parser.DisplayAtFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideStatement(COBOL2002Parser.DivideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideIntoStatement(COBOL2002Parser.DivideIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideIntoGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideIntoGivingStatement(COBOL2002Parser.DivideIntoGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideByGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideByGivingStatement(COBOL2002Parser.DivideByGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideGivingPhrase(COBOL2002Parser.DivideGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideInto(COBOL2002Parser.DivideIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideGiving(COBOL2002Parser.DivideGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#divideRemainder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideRemainder(COBOL2002Parser.DivideRemainderContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#enableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableStatement(COBOL2002Parser.EnableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#entryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryStatement(COBOL2002Parser.EntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateStatement(COBOL2002Parser.EvaluateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateSelect(COBOL2002Parser.EvaluateSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateAlsoSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateAlsoSelect(COBOL2002Parser.EvaluateAlsoSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateWhenPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhenPhrase(COBOL2002Parser.EvaluateWhenPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhen(COBOL2002Parser.EvaluateWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateCondition(COBOL2002Parser.EvaluateConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateThrough(COBOL2002Parser.EvaluateThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateAlsoCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateAlsoCondition(COBOL2002Parser.EvaluateAlsoConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateWhenOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateWhenOther(COBOL2002Parser.EvaluateWhenOtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateValue(COBOL2002Parser.EvaluateValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cicsCmdStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsCmdStart(COBOL2002Parser.CicsCmdStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cicsCmdEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsCmdEnd(COBOL2002Parser.CicsCmdEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#execCicsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecCicsStatement(COBOL2002Parser.ExecCicsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#execDliStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecDliStatement(COBOL2002Parser.ExecDliStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#execSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlStatement(COBOL2002Parser.ExecSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecSqlImsStatement(COBOL2002Parser.ExecSqlImsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#exhibitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExhibitStatement(COBOL2002Parser.ExhibitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#exhibitOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExhibitOperand(COBOL2002Parser.ExhibitOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#exitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(COBOL2002Parser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#raisingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaisingPhrase(COBOL2002Parser.RaisingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#freeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeStatement(COBOL2002Parser.FreeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#generateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerateStatement(COBOL2002Parser.GenerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#gobackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGobackStatement(COBOL2002Parser.GobackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#statusPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusPhrase(COBOL2002Parser.StatusPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#goToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatement(COBOL2002Parser.GoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#goToStatementSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatementSimple(COBOL2002Parser.GoToStatementSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#goToDependingOnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToDependingOnStatement(COBOL2002Parser.GoToDependingOnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(COBOL2002Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(COBOL2002Parser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(COBOL2002Parser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeStatement(COBOL2002Parser.InitializeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeWithFiller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeWithFiller(COBOL2002Parser.InitializeWithFillerContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeValuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeValuePhrase(COBOL2002Parser.InitializeValuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeReplacingPhrase(COBOL2002Parser.InitializeReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeReplacingBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeReplacingBy(COBOL2002Parser.InitializeReplacingByContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeDefaultPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeDefaultPhrase(COBOL2002Parser.InitializeDefaultPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initializeCategoryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializeCategoryName(COBOL2002Parser.InitializeCategoryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#initiateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitiateStatement(COBOL2002Parser.InitiateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectStatement(COBOL2002Parser.InspectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTallyingPhrase(COBOL2002Parser.InspectTallyingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingPhrase(COBOL2002Parser.InspectReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectTallyingReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTallyingReplacingPhrase(COBOL2002Parser.InspectTallyingReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectConvertingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectConvertingPhrase(COBOL2002Parser.InspectConvertingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectFor(COBOL2002Parser.InspectForContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectCharacters(COBOL2002Parser.InspectCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectReplacingCharacters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingCharacters(COBOL2002Parser.InspectReplacingCharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectAllLeadings(COBOL2002Parser.InspectAllLeadingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectReplacingAllLeadings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingAllLeadings(COBOL2002Parser.InspectReplacingAllLeadingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectAllLeading(COBOL2002Parser.InspectAllLeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectReplacingAllLeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectReplacingAllLeading(COBOL2002Parser.InspectReplacingAllLeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectBy(COBOL2002Parser.InspectByContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectTo(COBOL2002Parser.InspectToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inspectBeforeAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspectBeforeAfter(COBOL2002Parser.InspectBeforeAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeStatement(COBOL2002Parser.InvokeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invokeReturningClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeReturningClause(COBOL2002Parser.InvokeReturningClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invokeByReferenceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeByReferenceClause(COBOL2002Parser.InvokeByReferenceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invokeByContentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeByContentClause(COBOL2002Parser.InvokeByContentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invokeByValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeByValueClause(COBOL2002Parser.InvokeByValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateStatement(COBOL2002Parser.JsonGenerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateCountPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateCountPhrase(COBOL2002Parser.JsonGenerateCountPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateEncodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateEncodingPhrase(COBOL2002Parser.JsonGenerateEncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateNamePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateNamePhrase(COBOL2002Parser.JsonGenerateNamePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateSuppressPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateSuppressPhrase(COBOL2002Parser.JsonGenerateSuppressPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateWhenPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateWhenPhrase(COBOL2002Parser.JsonGenerateWhenPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateFigurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateFigurativeConstant(COBOL2002Parser.JsonGenerateFigurativeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateGenericSupressionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateGenericSupressionPhrase(COBOL2002Parser.JsonGenerateGenericSupressionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGeneratePhrase1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGeneratePhrase1(COBOL2002Parser.JsonGeneratePhrase1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateConvertingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateConvertingPhrase(COBOL2002Parser.JsonGenerateConvertingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonGenerateEndJsonPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonGenerateEndJsonPhrase(COBOL2002Parser.JsonGenerateEndJsonPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseStatement(COBOL2002Parser.JsonParseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseWithDetailPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseWithDetailPhrase(COBOL2002Parser.JsonParseWithDetailPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseEncodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseEncodingPhrase(COBOL2002Parser.JsonParseEncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseNamePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseNamePhrase(COBOL2002Parser.JsonParseNamePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseSuppressPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseSuppressPhrase(COBOL2002Parser.JsonParseSuppressPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParsePhrase1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParsePhrase1(COBOL2002Parser.JsonParsePhrase1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseUsingPhrase1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseUsingPhrase1(COBOL2002Parser.JsonParseUsingPhrase1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseConvertingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseConvertingPhrase(COBOL2002Parser.JsonParseConvertingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#jsonParseEndJsonPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonParseEndJsonPhrase(COBOL2002Parser.JsonParseEndJsonPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(COBOL2002Parser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOnKeyClause(COBOL2002Parser.MergeOnKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingSequencePhrase(COBOL2002Parser.MergeCollatingSequencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingAlphanumeric(COBOL2002Parser.MergeCollatingAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeCollatingNational(COBOL2002Parser.MergeCollatingNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUsing(COBOL2002Parser.MergeUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOutputProcedurePhrase(COBOL2002Parser.MergeOutputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeOutputThrough(COBOL2002Parser.MergeOutputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeGivingPhrase(COBOL2002Parser.MergeGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mergeGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeGiving(COBOL2002Parser.MergeGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(COBOL2002Parser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#moveToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveToStatement(COBOL2002Parser.MoveToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#moveToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveToSendingArea(COBOL2002Parser.MoveToSendingAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#moveCorrespondingToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCorrespondingToStatement(COBOL2002Parser.MoveCorrespondingToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#moveCorrespondingToSendingArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCorrespondingToSendingArea(COBOL2002Parser.MoveCorrespondingToSendingAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyStatement(COBOL2002Parser.MultiplyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyRegular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyRegular(COBOL2002Parser.MultiplyRegularContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyRegularOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyRegularOperand(COBOL2002Parser.MultiplyRegularOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGiving(COBOL2002Parser.MultiplyGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyGivingOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGivingOperand(COBOL2002Parser.MultiplyGivingOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multiplyGivingResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyGivingResult(COBOL2002Parser.MultiplyGivingResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#nextSentenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextSentenceStatement(COBOL2002Parser.NextSentenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStatement(COBOL2002Parser.OpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenInputStatement(COBOL2002Parser.OpenInputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenInput(COBOL2002Parser.OpenInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openOutputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenOutputStatement(COBOL2002Parser.OpenOutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenOutput(COBOL2002Parser.OpenOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openIOStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenIOStatement(COBOL2002Parser.OpenIOStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#openExtendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenExtendStatement(COBOL2002Parser.OpenExtendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sharingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharingPhrase(COBOL2002Parser.SharingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformStatement(COBOL2002Parser.PerformStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performInlineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformInlineStatement(COBOL2002Parser.PerformInlineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performProcedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformProcedureStatement(COBOL2002Parser.PerformProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformType(COBOL2002Parser.PerformTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performTimes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformTimes(COBOL2002Parser.PerformTimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performUntil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformUntil(COBOL2002Parser.PerformUntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVarying(COBOL2002Parser.PerformVaryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performVaryingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVaryingClause(COBOL2002Parser.PerformVaryingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performVaryingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformVaryingPhrase(COBOL2002Parser.PerformVaryingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformAfter(COBOL2002Parser.PerformAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformFrom(COBOL2002Parser.PerformFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformBy(COBOL2002Parser.PerformByContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performTestClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformTestClause(COBOL2002Parser.PerformTestClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performWithExceptionCheckingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformWithExceptionCheckingStatement(COBOL2002Parser.PerformWithExceptionCheckingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformExceptionClause(COBOL2002Parser.PerformExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performExceptionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformExceptionPhrase(COBOL2002Parser.PerformExceptionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performOtherExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformOtherExceptionClause(COBOL2002Parser.PerformOtherExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performCommonExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformCommonExceptionClause(COBOL2002Parser.PerformCommonExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#performFinallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformFinallyClause(COBOL2002Parser.PerformFinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#purgeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeStatement(COBOL2002Parser.PurgeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#raiseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStatement(COBOL2002Parser.RaiseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(COBOL2002Parser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#readInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInto(COBOL2002Parser.ReadIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#readWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadWith(COBOL2002Parser.ReadWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#readLockPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLockPhrase(COBOL2002Parser.ReadLockPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#readKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadKey(COBOL2002Parser.ReadKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveStatement(COBOL2002Parser.ReceiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveFromStatement(COBOL2002Parser.ReceiveFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveFrom(COBOL2002Parser.ReceiveFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveIntoStatement(COBOL2002Parser.ReceiveIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveNoData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveNoData(COBOL2002Parser.ReceiveNoDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveWithData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveWithData(COBOL2002Parser.ReceiveWithDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveBefore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveBefore(COBOL2002Parser.ReceiveBeforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveWith(COBOL2002Parser.ReceiveWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveThread(COBOL2002Parser.ReceiveThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveSize(COBOL2002Parser.ReceiveSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#receiveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveStatus(COBOL2002Parser.ReceiveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#standardReceiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardReceiveStatement(COBOL2002Parser.StandardReceiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#standardReceiveContinuePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardReceiveContinuePhrase(COBOL2002Parser.StandardReceiveContinuePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(COBOL2002Parser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#resumeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeStatement(COBOL2002Parser.ResumeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(COBOL2002Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#returnInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInto(COBOL2002Parser.ReturnIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteStatement(COBOL2002Parser.RewriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rewriteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteFrom(COBOL2002Parser.RewriteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#lockPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockPhrase(COBOL2002Parser.LockPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#rollbackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackStatement(COBOL2002Parser.RollbackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#searchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchStatement(COBOL2002Parser.SearchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#searchVarying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchVarying(COBOL2002Parser.SearchVaryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#searchWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchWhen(COBOL2002Parser.SearchWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatement(COBOL2002Parser.SendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendStatementSync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatementSync(COBOL2002Parser.SendStatementSyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendStatementAsync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStatementAsync(COBOL2002Parser.SendStatementAsyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendFromPhrase(COBOL2002Parser.SendFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendWithPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendWithPhrase(COBOL2002Parser.SendWithPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendReplacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendReplacingPhrase(COBOL2002Parser.SendReplacingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingPhrase(COBOL2002Parser.SendAdvancingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingPage(COBOL2002Parser.SendAdvancingPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingLines(COBOL2002Parser.SendAdvancingLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sendAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAdvancingMnemonic(COBOL2002Parser.SendAdvancingMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#standardSendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardSendStatement(COBOL2002Parser.StandardSendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#standardSendStatementFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardSendStatementFormat1(COBOL2002Parser.StandardSendStatementFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#standardSendStatementFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardSendStatementFormat2(COBOL2002Parser.StandardSendStatementFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(COBOL2002Parser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetToStatement(COBOL2002Parser.SetToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setUpDownByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUpDownByStatement(COBOL2002Parser.SetUpDownByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTo(COBOL2002Parser.SetToContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setToValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetToValue(COBOL2002Parser.SetToValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setByValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetByValue(COBOL2002Parser.SetByValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setScreenAttributeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetScreenAttributeStatement(COBOL2002Parser.SetScreenAttributeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#setScreenAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetScreenAttribute(COBOL2002Parser.SetScreenAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortStatement(COBOL2002Parser.SortStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortOnKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOnKeyClause(COBOL2002Parser.SortOnKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortDuplicatesPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDuplicatesPhrase(COBOL2002Parser.SortDuplicatesPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortCollatingSequencePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingSequencePhrase(COBOL2002Parser.SortCollatingSequencePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortCollatingAlphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingAlphanumeric(COBOL2002Parser.SortCollatingAlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortCollatingNational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCollatingNational(COBOL2002Parser.SortCollatingNationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortInputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortInputProcedurePhrase(COBOL2002Parser.SortInputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortInputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortInputThrough(COBOL2002Parser.SortInputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortUsing(COBOL2002Parser.SortUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortOutputProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOutputProcedurePhrase(COBOL2002Parser.SortOutputProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortOutputThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOutputThrough(COBOL2002Parser.SortOutputThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortGivingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortGivingPhrase(COBOL2002Parser.SortGivingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sortGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortGiving(COBOL2002Parser.SortGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#startStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartStatement(COBOL2002Parser.StartStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#startKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartKey(COBOL2002Parser.StartKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatement(COBOL2002Parser.StopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stopStatementGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatementGiving(COBOL2002Parser.StopStatementGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stopStatementWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatementWith(COBOL2002Parser.StopStatementWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringStatement(COBOL2002Parser.StringStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSendingPhrase(COBOL2002Parser.StringSendingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringSending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSending(COBOL2002Parser.StringSendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDelimitedByPhrase(COBOL2002Parser.StringDelimitedByPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringForPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringForPhrase(COBOL2002Parser.StringForPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringIntoPhrase(COBOL2002Parser.StringIntoPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#stringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringWithPointerPhrase(COBOL2002Parser.StringWithPointerPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractStatement(COBOL2002Parser.SubtractStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractFromStatement(COBOL2002Parser.SubtractFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractFromGivingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractFromGivingStatement(COBOL2002Parser.SubtractFromGivingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractCorrespondingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractCorrespondingStatement(COBOL2002Parser.SubtractCorrespondingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractSubtrahend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractSubtrahend(COBOL2002Parser.SubtractSubtrahendContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractMinuend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuend(COBOL2002Parser.SubtractMinuendContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractMinuendGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuendGiving(COBOL2002Parser.SubtractMinuendGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractGiving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractGiving(COBOL2002Parser.SubtractGivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subtractMinuendCorresponding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractMinuendCorresponding(COBOL2002Parser.SubtractMinuendCorrespondingContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#suppressStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuppressStatement(COBOL2002Parser.SuppressStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#terminateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminateStatement(COBOL2002Parser.TerminateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStatement(COBOL2002Parser.UnlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringStatement(COBOL2002Parser.UnstringStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringSendingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringSendingPhrase(COBOL2002Parser.UnstringSendingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringDelimitedByPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringDelimitedByPhrase(COBOL2002Parser.UnstringDelimitedByPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringOrAllPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringOrAllPhrase(COBOL2002Parser.UnstringOrAllPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringIntoPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringIntoPhrase(COBOL2002Parser.UnstringIntoPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringInto(COBOL2002Parser.UnstringIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringDelimiterIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringDelimiterIn(COBOL2002Parser.UnstringDelimiterInContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringCountIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringCountIn(COBOL2002Parser.UnstringCountInContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringWithPointerPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringWithPointerPhrase(COBOL2002Parser.UnstringWithPointerPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unstringTallyingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnstringTallyingPhrase(COBOL2002Parser.UnstringTallyingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(COBOL2002Parser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useAfterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAfterClause(COBOL2002Parser.UseAfterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useAfterOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAfterOn(COBOL2002Parser.UseAfterOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useDebugClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDebugClause(COBOL2002Parser.UseDebugClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useDebugOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDebugOn(COBOL2002Parser.UseDebugOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useExceptionNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseExceptionNameClause(COBOL2002Parser.UseExceptionNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useExceptionNameWithFilePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseExceptionNameWithFilePhrase(COBOL2002Parser.UseExceptionNameWithFilePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useExceptionObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseExceptionObjectClause(COBOL2002Parser.UseExceptionObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#useReportClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseReportClause(COBOL2002Parser.UseReportClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateStatement(COBOL2002Parser.XmlGenerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateCountInPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateCountInPhrase(COBOL2002Parser.XmlGenerateCountInPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateEncodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateEncodingPhrase(COBOL2002Parser.XmlGenerateEncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateDeclarationPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateDeclarationPhrase(COBOL2002Parser.XmlGenerateDeclarationPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateAttributesPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateAttributesPhrase(COBOL2002Parser.XmlGenerateAttributesPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateNamespacePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateNamespacePhrase(COBOL2002Parser.XmlGenerateNamespacePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateNamespacePrefixPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateNamespacePrefixPhrase(COBOL2002Parser.XmlGenerateNamespacePrefixPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateNamePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateNamePhrase(COBOL2002Parser.XmlGenerateNamePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateTypePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateTypePhrase(COBOL2002Parser.XmlGenerateTypePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateSuppressPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateSuppressPhrase(COBOL2002Parser.XmlGenerateSuppressPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateWhenPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateWhenPhrase(COBOL2002Parser.XmlGenerateWhenPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateGenericSuppressionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateGenericSuppressionPhrase(COBOL2002Parser.XmlGenerateGenericSuppressionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateGenericSuppressionNumericPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateGenericSuppressionNumericPhrase(COBOL2002Parser.XmlGenerateGenericSuppressionNumericPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateGenericSuppressionNonNumericPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateGenericSuppressionNonNumericPhrase(COBOL2002Parser.XmlGenerateGenericSuppressionNonNumericPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateEndXmlPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateEndXmlPhrase(COBOL2002Parser.XmlGenerateEndXmlPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateFigurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateFigurativeConstant(COBOL2002Parser.XmlGenerateFigurativeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlGenerateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlGenerateType(COBOL2002Parser.XmlGenerateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseStatement(COBOL2002Parser.XmlParseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseEncodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseEncodingPhrase(COBOL2002Parser.XmlParseEncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseReturningNationalPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseReturningNationalPhrase(COBOL2002Parser.XmlParseReturningNationalPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseValidatingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseValidatingPhrase(COBOL2002Parser.XmlParseValidatingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseProcessingProcedurePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseProcessingProcedurePhrase(COBOL2002Parser.XmlParseProcessingProcedurePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#xmlParseEndXmlPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlParseEndXmlPhrase(COBOL2002Parser.XmlParseEndXmlPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(COBOL2002Parser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFromPhrase(COBOL2002Parser.WriteFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeAdvancingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingPhrase(COBOL2002Parser.WriteAdvancingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeAdvancingPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingPage(COBOL2002Parser.WriteAdvancingPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeAdvancingLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingLines(COBOL2002Parser.WriteAdvancingLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeAdvancingMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdvancingMnemonic(COBOL2002Parser.WriteAdvancingMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAtEndOfPagePhrase(COBOL2002Parser.WriteAtEndOfPagePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#writeNotAtEndOfPagePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteNotAtEndOfPagePhrase(COBOL2002Parser.WriteNotAtEndOfPagePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#atEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtEndPhrase(COBOL2002Parser.AtEndPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#notAtEndPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotAtEndPhrase(COBOL2002Parser.NotAtEndPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#invalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidKeyPhrase(COBOL2002Parser.InvalidKeyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#notInvalidKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInvalidKeyPhrase(COBOL2002Parser.NotInvalidKeyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#onOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnOverflowPhrase(COBOL2002Parser.OnOverflowPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#notOnOverflowPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnOverflowPhrase(COBOL2002Parser.NotOnOverflowPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#onSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSizeErrorPhrase(COBOL2002Parser.OnSizeErrorPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#notOnSizeErrorPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnSizeErrorPhrase(COBOL2002Parser.NotOnSizeErrorPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#retryPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetryPhrase(COBOL2002Parser.RetryPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#onExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnExceptionClause(COBOL2002Parser.OnExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#notOnExceptionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOnExceptionClause(COBOL2002Parser.NotOnExceptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(COBOL2002Parser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(COBOL2002Parser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multDivs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivs(COBOL2002Parser.MultDivsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#multDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(COBOL2002Parser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#powers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowers(COBOL2002Parser.PowersContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(COBOL2002Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#basis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasis(COBOL2002Parser.BasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(COBOL2002Parser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#figurativeZero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigurativeZero(COBOL2002Parser.FigurativeZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(COBOL2002Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#andOrCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrCondition(COBOL2002Parser.AndOrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#combinableCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinableCondition(COBOL2002Parser.CombinableConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#simpleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(COBOL2002Parser.SimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#classCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCondition(COBOL2002Parser.ClassConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#conditionNameReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNameReference(COBOL2002Parser.ConditionNameReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#conditionNameSubscriptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNameSubscriptReference(COBOL2002Parser.ConditionNameSubscriptReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCondition(COBOL2002Parser.RelationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationSignCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationSignCondition(COBOL2002Parser.RelationSignConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationArithmeticComparison(COBOL2002Parser.RelationArithmeticComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCombinedComparison(COBOL2002Parser.RelationCombinedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationCombinedCondition(COBOL2002Parser.RelationCombinedConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(COBOL2002Parser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviation(COBOL2002Parser.AbbreviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(COBOL2002Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#tableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCall(COBOL2002Parser.TableCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(COBOL2002Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#referenceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceModifier(COBOL2002Parser.ReferenceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#characterPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterPosition(COBOL2002Parser.CharacterPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(COBOL2002Parser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(COBOL2002Parser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(COBOL2002Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedDataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataName(COBOL2002Parser.QualifiedDataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat1(COBOL2002Parser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedDataNameFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat2(COBOL2002Parser.QualifiedDataNameFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedDataNameFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat3(COBOL2002Parser.QualifiedDataNameFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedDataNameFormat4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat4(COBOL2002Parser.QualifiedDataNameFormat4Context ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileControlQualifiedDataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileControlQualifiedDataName(COBOL2002Parser.FileControlQualifiedDataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#qualifiedInData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedInData(COBOL2002Parser.QualifiedInDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInData(COBOL2002Parser.InDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInFile(COBOL2002Parser.InFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inMnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInMnemonic(COBOL2002Parser.InMnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSection(COBOL2002Parser.InSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inLibrary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInLibrary(COBOL2002Parser.InLibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInTable(COBOL2002Parser.InTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#alphabetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetName(COBOL2002Parser.AlphabetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#assignClauseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignClauseName(COBOL2002Parser.AssignClauseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#assignmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentName(COBOL2002Parser.AssignmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#basisName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasisName(COBOL2002Parser.BasisNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdName(COBOL2002Parser.CdNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(COBOL2002Parser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#computerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputerName(COBOL2002Parser.ComputerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(COBOL2002Parser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#constantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantName(COBOL2002Parser.ConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataName(COBOL2002Parser.DataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#dataDescName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescName(COBOL2002Parser.DataDescNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#environmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentName(COBOL2002Parser.EnvironmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#exceptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionName(COBOL2002Parser.ExceptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(COBOL2002Parser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(COBOL2002Parser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#functionPrototypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototypeName(COBOL2002Parser.FunctionPrototypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(COBOL2002Parser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inheritedClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritedClassName(COBOL2002Parser.InheritedClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#inheritedInterfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritedInterfaceName(COBOL2002Parser.InheritedInterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(COBOL2002Parser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#languageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageName(COBOL2002Parser.LanguageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryName(COBOL2002Parser.LibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#localName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalName(COBOL2002Parser.LocalNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#localeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaleName(COBOL2002Parser.LocaleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#messageServerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageServerName(COBOL2002Parser.MessageServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(COBOL2002Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#mnemonicName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnemonicName(COBOL2002Parser.MnemonicNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#paragraphName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphName(COBOL2002Parser.ParagraphNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(COBOL2002Parser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramName(COBOL2002Parser.ProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(COBOL2002Parser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#recordName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordName(COBOL2002Parser.RecordNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#reportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportName(COBOL2002Parser.ReportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(COBOL2002Parser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#screenName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenName(COBOL2002Parser.ScreenNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#sectionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionName(COBOL2002Parser.SectionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#systemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemName(COBOL2002Parser.SystemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#symbolicCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolicCharacter(COBOL2002Parser.SymbolicCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#textName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextName(COBOL2002Parser.TextNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#userFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserFunctionName(COBOL2002Parser.UserFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobolWord(COBOL2002Parser.CobolWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#intrinsicFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrinsicFunctionName(COBOL2002Parser.IntrinsicFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#binaryBooleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBooleanOperator(COBOL2002Parser.BinaryBooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#unaryBooleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBooleanOperator(COBOL2002Parser.UnaryBooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#booleanShiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanShiftOperator(COBOL2002Parser.BooleanShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(COBOL2002Parser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(COBOL2002Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#continuedLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuedLiteral(COBOL2002Parser.ContinuedLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(COBOL2002Parser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(COBOL2002Parser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(COBOL2002Parser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cicsDfhRespLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsDfhRespLiteral(COBOL2002Parser.CicsDfhRespLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#cicsDfhValueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicsDfhValueLiteral(COBOL2002Parser.CicsDfhValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#figurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigurativeConstant(COBOL2002Parser.FigurativeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#specialRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRegister(COBOL2002Parser.SpecialRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#commentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentEntry(COBOL2002Parser.CommentEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#freeFormText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeFormText(COBOL2002Parser.FreeFormTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#preprocessingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessingDirective(COBOL2002Parser.PreprocessingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#processDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessDirective(COBOL2002Parser.ProcessDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#defineList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineList(COBOL2002Parser.DefineListContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#defineItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineItem(COBOL2002Parser.DefineItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#evaluateDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateDirective(COBOL2002Parser.EvaluateDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(COBOL2002Parser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#ifDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDirective(COBOL2002Parser.IfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link COBOL2002Parser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(COBOL2002Parser.ElseClauseContext ctx);
}