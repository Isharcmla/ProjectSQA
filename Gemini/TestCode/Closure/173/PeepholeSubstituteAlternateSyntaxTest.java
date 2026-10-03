package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private PeepholeSubstituteAlternateSyntax createPeephole(boolean late, boolean normalized, boolean es5) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    if (es5) {
      options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
      options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5);
    } else {
      options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT3);
      options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT3);
    }
    compiler.initOptions(options);
    if (normalized) {
      compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    }
    PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(late);
    NodeTraversal t = new NodeTraversal(compiler, null);
    peephole.beginTraversal(t);
    return peephole;
  }

  @Test
  public void testReduceTrueFalse_lateTrue_reducesToNotZeroOrOne() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(true, false, true);

    Node trueNode = IR.trueNode();
    Node parent1 = IR.exprResult(trueNode);
    Node res1 = peephole.optimizeSubtree(trueNode);
    Assert.assertEquals(Token.NOT, res1.getType());
    Assert.assertEquals(0.0, res1.getFirstChild().getDouble(), 0.0);

    Node falseNode = IR.falseNode();
    Node parent2 = IR.exprResult(falseNode);
    Node res2 = peephole.optimizeSubtree(falseNode);
    Assert.assertEquals(Token.NOT, res2.getType());
    Assert.assertEquals(1.0, res2.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testReduceTrueFalse_lateFalse_returnsUnchanged() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node trueNode = IR.trueNode();
    Node parent1 = IR.exprResult(trueNode);
    Node res1 = peephole.optimizeSubtree(trueNode);
    Assert.assertEquals(Token.TRUE, res1.getType());

    Node falseNode = IR.falseNode();
    Node parent2 = IR.exprResult(falseNode);
    Node res2 = peephole.optimizeSubtree(falseNode);
    Assert.assertEquals(Token.FALSE, res2.getType());
  }

  @Test
  public void testTryFoldStandardConstructors_normalized_convertsNewToCall() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node newNode = IR.newNode(IR.name("Object"));
    Node block = IR.block(IR.exprResult(newNode));
    Node res = peephole.optimizeSubtree(newNode);
    Assert.assertEquals(Token.OBJECTLIT, res.getType());

    Node newArray = IR.newNode(IR.name("Array"));
    block = IR.block(IR.exprResult(newArray));
    res = peephole.optimizeSubtree(newArray);
    Assert.assertEquals(Token.ARRAYLIT, res.getType());

    Node newError = IR.newNode(IR.name("Error"), IR.string("msg"));
    block = IR.block(IR.exprResult(newError));
    res = peephole.optimizeSubtree(newError);
    Assert.assertEquals(Token.CALL, res.getType());
    Assert.assertTrue(res.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testTryFoldStandardConstructors_notNormalized_remainsNew() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node newNode = IR.newNode(IR.name("Object"));
    Node block = IR.block(IR.exprResult(newNode));
    Node res = peephole.optimizeSubtree(newNode);
    Assert.assertEquals(Token.NEW, res.getType());

    Node customNew = IR.newNode(IR.name("Custom"));
    block = IR.block(IR.exprResult(customNew));
    res = peephole.optimizeSubtree(customNew);
    Assert.assertEquals(Token.NEW, res.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_objectWithArgs_notFolded() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node callObjectWithArgs = IR.call(IR.name("Object"), IR.number(1));
    Node block = IR.block(IR.exprResult(callObjectWithArgs));
    Node res = peephole.optimizeSubtree(callObjectWithArgs);
    Assert.assertEquals(Token.CALL, res.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_arrayVariants() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node callArrNoArgs = IR.call(IR.name("Array"));
    Node block1 = IR.block(IR.exprResult(callArrNoArgs));
    Node res1 = peephole.optimizeSubtree(callArrNoArgs);
    Assert.assertEquals(Token.ARRAYLIT, res1.getType());
    Assert.assertEquals(0, res1.getChildCount());

    Node callArrMultiArgs = IR.call(IR.name("Array"), IR.number(1), IR.number(2));
    Node block2 = IR.block(IR.exprResult(callArrMultiArgs));
    Node res2 = peephole.optimizeSubtree(callArrMultiArgs);
    Assert.assertEquals(Token.ARRAYLIT, res2.getType());
    Assert.assertEquals(2, res2.getChildCount());

    Node callArrString = IR.call(IR.name("Array"), IR.string("hello"));
    Node block3 = IR.block(IR.exprResult(callArrString));
    Node res3 = peephole.optimizeSubtree(callArrString);
    Assert.assertEquals(Token.ARRAYLIT, res3.getType());
    Assert.assertEquals(1, res3.getChildCount());

    Node callArrZero = IR.call(IR.name("Array"), IR.number(0));
    Node block4 = IR.block(IR.exprResult(callArrZero));
    Node res4 = peephole.optimizeSubtree(callArrZero);
    Assert.assertEquals(Token.ARRAYLIT, res4.getType());
    Assert.assertEquals(0, res4.getChildCount());

    Node callArrNonZeroNum = IR.call(IR.name("Array"), IR.number(5));
    Node block5 = IR.block(IR.exprResult(callArrNonZeroNum));
    Node res5 = peephole.optimizeSubtree(callArrNonZeroNum);
    Assert.assertEquals(Token.CALL, res5.getType());

    Node callArrArrayLit = IR.call(IR.name("Array"), IR.arraylit(IR.number(1)));
    Node block6 = IR.block(IR.exprResult(callArrArrayLit));
    Node res6 = peephole.optimizeSubtree(callArrArrayLit);
    Assert.assertEquals(Token.ARRAYLIT, res6.getType());
    Assert.assertEquals(1, res6.getChildCount());

    Node callArrName = IR.call(IR.name("Array"), IR.name("x"));
    Node block7 = IR.block(IR.exprResult(callArrName));
    Node res7 = peephole.optimizeSubtree(callArrName);
    Assert.assertEquals(Token.CALL, res7.getType());
  }

  @Test
  public void testTryFoldRegularExpressionConstructor_variousPatterns() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node regNoArgs = IR.call(IR.name("RegExp"));
    Node block0 = IR.block(IR.exprResult(regNoArgs));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(regNoArgs).getType());

    Node reg3Args = IR.call(IR.name("RegExp"), IR.string("a"), IR.string("g"), IR.string("extra"));
    Node block0b = IR.block(IR.exprResult(reg3Args));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(reg3Args).getType());

    Node regEmpty = IR.call(IR.name("RegExp"), IR.string(""));
    Node block1 = IR.block(IR.exprResult(regEmpty));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(regEmpty).getType());

    Node regNotString = IR.call(IR.name("RegExp"), IR.name("pattern"));
    Node block2 = IR.block(IR.exprResult(regNotString));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(regNotString).getType());

    StringBuilder longPattern = new StringBuilder();
    for (int i = 0; i < 105; i++) {
      longPattern.append("a");
    }
    Node regTooLong = IR.call(IR.name("RegExp"), IR.string(longPattern.toString()));
    Node block3 = IR.block(IR.exprResult(regTooLong));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(regTooLong).getType());

    Node regFlagsNotString = IR.call(IR.name("RegExp"), IR.string("abc"), IR.name("flags"));
    Node block4 = IR.block(IR.exprResult(regFlagsNotString));
    Assert.assertEquals(Token.CALL, peephole.optimizeSubtree(regFlagsNotString).getType());

    Node regValid = IR.call(IR.name("RegExp"), IR.string("abc"));
    Node block5 = IR.block(IR.exprResult(regValid));
    Node res5 = peephole.optimizeSubtree(regValid);
    Assert.assertEquals(Token.REGEXP, res5.getType());
    Assert.assertEquals("abc", res5.getFirstChild().getString());

    Node regValidWithEmptyFlags = IR.call(IR.name("RegExp"), IR.string("abc"), IR.string(""));
    Node block6 = IR.block(IR.exprResult(regValidWithEmptyFlags));
    Node res6 = peephole.optimizeSubtree(regValidWithEmptyFlags);
    Assert.assertEquals(Token.REGEXP, res6.getType());

    Node regValidWithFlags = IR.call(IR.name("RegExp"), IR.string("abc"), IR.string("gmi"));
    Node block7 = IR.block(IR.exprResult(regValidWithFlags));
    Node res7 = peephole.optimizeSubtree(regValidWithFlags);
    Assert.assertEquals(Token.REGEXP, res7.getType());
    Assert.assertEquals(2, res7.getChildCount());

    Node regInvalidFlags = IR.call(IR.name("RegExp"), IR.string("abc"), IR.string("invalid_flag"));
    Node block8 = IR.block(IR.exprResult(regInvalidFlags));
    Node res8 = peephole.optimizeSubtree(regInvalidFlags);
    Assert.assertEquals(Token.CALL, res8.getType());

    PeepholeSubstituteAlternateSyntax peepholeEs3 = createPeephole(false, true, false);
    Node regUnsafeGFlagEs3 = IR.call(IR.name("RegExp"), IR.string("abc"), IR.string("g"));
    Node block9 = IR.block(IR.exprResult(regUnsafeGFlagEs3));
    Node res9 = peepholeEs3.optimizeSubtree(regUnsafeGFlagEs3);
    Assert.assertEquals(Token.CALL, res9.getType());
  }

  @Test
  public void testMakeForwardSlashBracketSafe_escapesProperly() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node regSlash = IR.call(IR.name("RegExp"), IR.string("a/b"));
    Node block1 = IR.block(IR.exprResult(regSlash));
    Node res1 = peephole.optimizeSubtree(regSlash);
    Assert.assertEquals(Token.REGEXP, res1.getType());
    Assert.assertEquals("a\\/b", res1.getFirstChild().getString());

    Node regSlashInCharset = IR.call(IR.name("RegExp"), IR.string("[/]"));
    Node block2 = IR.block(IR.exprResult(regSlashInCharset));
    Node res2 = peephole.optimizeSubtree(regSlashInCharset);
    Assert.assertEquals(Token.REGEXP, res2.getType());
    Assert.assertEquals("[/]", res2.getFirstChild().getString());

    Node regLineTerminators = IR.call(IR.name("RegExp"), IR.string("a\r\n\u2028\u2029b"));
    Node block3 = IR.block(IR.exprResult(regLineTerminators));
    Node res3 = peephole.optimizeSubtree(regLineTerminators);
    Assert.assertEquals(Token.REGEXP, res3.getType());
    Assert.assertEquals("a\\r\\n\\u2028\\u2029b", res3.getFirstChild().getString());

    Node regEscapedLineTerminators = IR.call(IR.name("RegExp"), IR.string("a\\\r\\\n\\\u2028\\\u2029b"));
    Node block4 = IR.block(IR.exprResult(regEscapedLineTerminators));
    Node res4 = peephole.optimizeSubtree(regEscapedLineTerminators);
    Assert.assertEquals(Token.REGEXP, res4.getType());
    Assert.assertEquals("a\\r\\n\\u2028\\u2029b", res4.getFirstChild().getString());
  }

  @Test
  public void testTryFoldSimpleFunctionCall_stringCall() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node strCall = IR.call(IR.name("String"), IR.number(123));
    Node block1 = IR.block(IR.exprResult(strCall));
    Node res1 = peephole.optimizeSubtree(strCall);
    Assert.assertEquals(Token.ADD, res1.getType());
    Assert.assertEquals("", res1.getFirstChild().getString());
    Assert.assertEquals(123.0, res1.getLastChild().getDouble(), 0.0);

    Node strCallMutable = IR.call(IR.name("String"), IR.name("x"));
    Node block2 = IR.block(IR.exprResult(strCallMutable));
    Node res2 = peephole.optimizeSubtree(strCallMutable);
    Assert.assertEquals(Token.CALL, res2.getType());

    Node strCallNoArgs = IR.call(IR.name("String"));
    Node block3 = IR.block(IR.exprResult(strCallNoArgs));
    Node res3 = peephole.optimizeSubtree(strCallNoArgs);
    Assert.assertEquals(Token.CALL, res3.getType());
  }

  @Test
  public void testTryFoldImmediateCallToBoundFunction_bindRewriting() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node fn = IR.name("foo");
    Node bindCall = IR.call(IR.getprop(fn, IR.string("bind")), IR.name("thisObj"), IR.number(1));
    Node outerCall = IR.call(bindCall);
    Node block = IR.block(IR.exprResult(outerCall));
    Node res = peephole.optimizeSubtree(outerCall);
    Assert.assertEquals(Token.CALL, res.getType());
    Assert.assertEquals(Token.GETPROP, res.getFirstChild().getType());
    Assert.assertEquals("call", res.getFirstChild().getLastChild().getString());
    Assert.assertFalse(res.getBooleanProp(Node.FREE_CALL));

    Node fn2 = IR.name("bar");
    Node bindCallUndefined = IR.call(IR.getprop(fn2, IR.string("bind")), IR.name("undefined"), IR.number(2));
    Node outerCall2 = IR.call(bindCallUndefined);
    Node block2 = IR.block(IR.exprResult(outerCall2));
    Node res2 = peephole.optimizeSubtree(outerCall2);
    Assert.assertEquals(Token.CALL, res2.getType());
    Assert.assertTrue(res2.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testTrySplitComma_lateFalse_splitsWhenValid() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node comma = IR.comma(IR.assign(IR.name("a"), IR.number(1)), IR.assign(IR.name("b"), IR.number(2)));
    Node expr = IR.exprResult(comma);
    Node block = IR.block(expr);

    Node res = peephole.optimizeSubtree(comma);
    Assert.assertEquals(Token.ASSIGN, res.getType());
    Assert.assertEquals(2, block.getChildCount());

    PeepholeSubstituteAlternateSyntax peepholeLate = createPeephole(true, false, true);
    Node comma2 = IR.comma(IR.name("a"), IR.name("b"));
    Node expr2 = IR.exprResult(comma2);
    Node block2 = IR.block(expr2);
    Node res2 = peepholeLate.optimizeSubtree(comma2);
    Assert.assertEquals(Token.COMMA, res2.getType());

    Node commaInLabel = IR.comma(IR.name("a"), IR.name("b"));
    Node exprInLabel = IR.exprResult(commaInLabel);
    Node label = IR.label(IR.labelName("myLabel"), exprInLabel);
    Node block3 = IR.block(label);
    Node res3 = peephole.optimizeSubtree(commaInLabel);
    Assert.assertEquals(Token.COMMA, res3.getType());
  }

  @Test
  public void testTryReplaceUndefined_normalized() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, true, true);

    Node undefNode = IR.name("undefined");
    Node expr = IR.exprResult(undefNode);
    Node block = IR.block(expr);

    Node res = peephole.optimizeSubtree(undefNode);
    Assert.assertEquals(Token.VOID, res.getType());
    Assert.assertEquals(0.0, res.getFirstChild().getDouble(), 0.0);

    Node lvalUndef = IR.name("undefined");
    Node var = IR.var(lvalUndef, IR.number(1));
    Node res2 = peephole.optimizeSubtree(lvalUndef);
    Assert.assertEquals(Token.NAME, res2.getType());

    PeepholeSubstituteAlternateSyntax unnormalized = createPeephole(false, false, true);
    Node undefUnnorm = IR.name("undefined");
    Node expr3 = IR.exprResult(undefUnnorm);
    Node res3 = unnormalized.optimizeSubtree(undefUnnorm);
    Assert.assertEquals(Token.NAME, res3.getType());
  }

  @Test
  public void testTryReduceReturn_removesRedundantVoidAndUndefined() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node returnVoid = IR.returnNode(IR.voidNode(IR.number(0)));
    Node res1 = peephole.optimizeSubtree(returnVoid);
    Assert.assertNull(res1.getFirstChild());

    Node returnVoidSideEffect = IR.returnNode(IR.voidNode(IR.call(IR.name("foo"))));
    Node res2 = peephole.optimizeSubtree(returnVoidSideEffect);
    Assert.assertNotNull(res2.getFirstChild());

    Node returnUndefined = IR.returnNode(IR.name("undefined"));
    Node res3 = peephole.optimizeSubtree(returnUndefined);
    Assert.assertNull(res3.getFirstChild());

    Node returnNum = IR.returnNode(IR.number(42));
    Node res4 = peephole.optimizeSubtree(returnNum);
    Assert.assertNotNull(res4.getFirstChild());

    Node bareReturn = IR.returnNode();
    Node res5 = peephole.optimizeSubtree(bareReturn);
    Assert.assertNull(res5.getFirstChild());
  }

  @Test
  public void testTryMinimizeArrayLiteral_lateTrueAndFalse() {
    PeepholeSubstituteAlternateSyntax peepholeLate = createPeephole(true, false, true);

    Node arrSingleChars = IR.arraylit(
        IR.string("a"), IR.string("b"), IR.string("c"),
        IR.string("d"), IR.string("e"), IR.string("f"),
        IR.string("g"), IR.string("h"), IR.string("i"));
    Node block1 = IR.block(IR.exprResult(arrSingleChars));
    Node res1 = peepholeLate.optimizeSubtree(arrSingleChars);
    Assert.assertEquals(Token.CALL, res1.getType());
    Assert.assertEquals("", res1.getLastChild().getString());

    Node arrMultiChars = IR.arraylit(
        IR.string("alpha"), IR.string("beta"), IR.string("gamma"),
        IR.string("delta"), IR.string("epsilon"), IR.string("zeta"));
    Node block2 = IR.block(IR.exprResult(arrMultiChars));
    Node res2 = peepholeLate.optimizeSubtree(arrMultiChars);
    Assert.assertEquals(Token.CALL, res2.getType());
    Assert.assertEquals(" ", res2.getLastChild().getString());

    Node arrMixedDelim = IR.arraylit(
        IR.string("a "), IR.string("b;"), IR.string("c,"),
        IR.string("d{"), IR.string("e}"), IR.string("f_extra"));
    Node block3 = IR.block(IR.exprResult(arrMixedDelim));
    Node res3 = peepholeLate.optimizeSubtree(arrMixedDelim);
    Assert.assertEquals(Token.ARRAYLIT, res3.getType());

    Node arrSmall = IR.arraylit(IR.string("a"), IR.string("b"));
    Node block4 = IR.block(IR.exprResult(arrSmall));
    Node res4 = peepholeLate.optimizeSubtree(arrSmall);
    Assert.assertEquals(Token.ARRAYLIT, res4.getType());

    PeepholeSubstituteAlternateSyntax peepholeEarly = createPeephole(false, false, true);
    Node arrEarly = IR.arraylit(
        IR.string("a"), IR.string("b"), IR.string("c"),
        IR.string("d"), IR.string("e"), IR.string("f"),
        IR.string("g"), IR.string("h"), IR.string("i"));
    Node block5 = IR.block(IR.exprResult(arrEarly));
    Node res5 = peepholeEarly.optimizeSubtree(arrEarly);
    Assert.assertEquals(Token.ARRAYLIT, res5.getType());

    Node arrNonStrings = IR.arraylit(IR.string("a"), IR.number(1));
    Node block6 = IR.block(IR.exprResult(arrNonStrings));
    Node res6 = peepholeLate.optimizeSubtree(arrNonStrings);
    Assert.assertEquals(Token.ARRAYLIT, res6.getType());
  }

  @Test
  public void testContainsUnicodeEscape_detectsEscapes() {
    Assert.assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("abc"));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u0000"));
    Assert.assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\u1234"));
  }

  @Test
  public void testOptimizeSubtree_defaultNode_returnsUnchanged() {
    PeepholeSubstituteAlternateSyntax peephole = createPeephole(false, false, true);

    Node numberNode = IR.number(42);
    Node res = peephole.optimizeSubtree(numberNode);
    Assert.assertSame(numberNode, res);
  }
}
