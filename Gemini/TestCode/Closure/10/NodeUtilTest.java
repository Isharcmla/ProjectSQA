package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleSourceFile;
import com.google.javascript.rhino.StaticSourceFile;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

  @Test
  public void testIsStrWhiteSpaceChar() {
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2000'));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('0'));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('-'));
  }

  @Test
  public void testGetNearestFunctionName_notFunction_returnsNull() {
    Node node = IR.name("x");
    Assert.assertNull(NodeUtil.getNearestFunctionName(node));
  }

  @Test
  public void testGetNearestFunctionName_directFunctionDeclaration() {
    Node fn = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    IR.script(fn);
    Assert.assertEquals("foo", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_assignedFunction() {
    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    IR.assign(IR.name("myVar"), fn);
    Assert.assertEquals("myVar", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_varDeclarationFunction() {
    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node nameNode = IR.name("myVar");
    nameNode.addChildToBack(fn);
    IR.var(nameNode);
    Assert.assertEquals("myVar", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_objectLitKeys() {
    Node fn1 = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key1 = IR.stringKey("prop1");
    key1.addChildToBack(fn1);
    Assert.assertEquals("prop1", NodeUtil.getNearestFunctionName(fn1));

    Node fn2 = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key2 = IR.getterDef("prop2", fn2);
    Assert.assertEquals("prop2", NodeUtil.getNearestFunctionName(fn2));

    Node fn3 = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key3 = IR.setterDef("prop3", fn3);
    Assert.assertEquals("prop3", NodeUtil.getNearestFunctionName(fn3));

    Node fn4 = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node numKey = IR.number(123);
    numKey.addChildToBack(fn4);
    Assert.assertEquals("123", NodeUtil.getNearestFunctionName(fn4));
  }

  @Test
  public void testIsLValue_validCases() {
    Node name = IR.name("a");
    Node assign = IR.assign(name, IR.number(1));
    Assert.assertTrue(NodeUtil.isLValue(name));

    Node getProp = IR.getprop(IR.name("a"), IR.string("b"));
    IR.assign(getProp, IR.number(1));
    Assert.assertTrue(NodeUtil.isLValue(getProp));

    Node getElem = IR.getelem(IR.name("a"), IR.number(0));
    IR.assign(getElem, IR.number(1));
    Assert.assertTrue(NodeUtil.isLValue(getElem));

    Node forInVar = IR.name("x");
    IR.forIn(forInVar, IR.name("obj"), IR.block());
    Assert.assertTrue(NodeUtil.isLValue(forInVar));

    Node varName = IR.name("y");
    IR.var(varName);
    Assert.assertTrue(NodeUtil.isLValue(varName));

    Node fnName = IR.name("fn");
    IR.function(fnName, IR.paramList(), IR.block());
    Assert.assertTrue(NodeUtil.isLValue(fnName));

    Node decName = IR.name("d");
    IR.dec(decName);
    Assert.assertTrue(NodeUtil.isLValue(decName));

    Node incName = IR.name("i");
    IR.inc(incName);
    Assert.assertTrue(NodeUtil.isLValue(incName));

    Node paramName = IR.name("p");
    IR.paramList(paramName);
    Assert.assertTrue(NodeUtil.isLValue(paramName));

    Node catchName = IR.name("c");
    IR.catchNode(catchName, IR.block());
    Assert.assertTrue(NodeUtil.isLValue(catchName));
  }

  @Test
  public void testIsLValue_nonLValueCases() {
    Node orphan = IR.name("orphan");
    Assert.assertFalse(NodeUtil.isLValue(orphan));

    Node rvalue = IR.name("r");
    IR.assign(IR.name("l"), rvalue);
    Assert.assertFalse(NodeUtil.isLValue(rvalue));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIsLValue_invalidNodeType_throwsException() {
    NodeUtil.isLValue(IR.number(1));
  }

  @Test
  public void testNewQualifiedNameNode_singleName() {
    CodingConvention convention = new ClosureCodingConvention();
    Node node = NodeUtil.newQualifiedNameNode(convention, "foo");
    Assert.assertTrue(node.isName());
    Assert.assertEquals("foo", node.getString());
  }

  @Test
  public void testNewQualifiedNameNode_multipleParts() {
    CodingConvention convention = new ClosureCodingConvention();
    Node node = NodeUtil.newQualifiedNameNode(convention, "foo.bar.baz");
    Assert.assertTrue(node.isGetProp());
    Assert.assertEquals("foo.bar.baz", node.getQualifiedName());
  }

  @Test
  public void testIsValidQualifiedName() {
    Assert.assertTrue(NodeUtil.isValidQualifiedName("a.b.c"));
    Assert.assertTrue(NodeUtil.isValidQualifiedName("a"));
    Assert.assertTrue(NodeUtil.isValidQualifiedName("$foo._bar.baz123"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName(""));
    Assert.assertFalse(NodeUtil.isValidQualifiedName(".a.b"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a.b."));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a..b"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a.class.b"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a.123.b"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a.b\u1234"));
  }

  @Test
  public void testGetFunctionParameters() {
    Node params = IR.paramList(IR.name("a"), IR.name("b"));
    Node fn = IR.function(IR.name("f"), params, IR.block());
    Assert.assertSame(params, NodeUtil.getFunctionParameters(fn));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetFunctionParameters_nonFunction_throwsException() {
    NodeUtil.getFunctionParameters(IR.name("f"));
  }

  @Test
  public void testGetFunctionJSDocInfo() {
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    JSDocInfo info = new JSDocInfo();
    fn.setJSDocInfo(info);
    Assert.assertSame(info, NodeUtil.getFunctionJSDocInfo(fn));

    Node fnExpr = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("f"), fnExpr);
    assign.setJSDocInfo(info);
    Assert.assertSame(info, NodeUtil.getFunctionJSDocInfo(fnExpr));

    Node fnExprVar = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node name = IR.name("v");
    name.addChildToBack(fnExprVar);
    Node varNode = IR.var(name);
    varNode.setJSDocInfo(info);
    Assert.assertSame(info, NodeUtil.getFunctionJSDocInfo(fnExprVar));
  }

  @Test
  public void testGetSourceNameAndFile() {
    StaticSourceFile file = new SimpleSourceFile("test.js", false);
    Node root = IR.script();
    root.setStaticSourceFile(file);
    Node child = IR.exprResult(IR.number(1));
    root.addChildToBack(child);

    Assert.assertEquals("test.js", NodeUtil.getSourceName(child));
    Assert.assertSame(file, NodeUtil.getSourceFile(child));

    Node orphan = IR.number(1);
    Assert.assertNull(NodeUtil.getSourceName(orphan));
    Assert.assertNull(NodeUtil.getSourceFile(orphan));
  }

  @Test
  public void testGetInputId() {
    Node script = IR.script();
    InputId id = new InputId("file.js");
    script.setInputId(id);
    Node inner = IR.exprResult(IR.string("hello"));
    script.addChildToBack(inner);

    Assert.assertEquals(id, NodeUtil.getInputId(inner));
    Assert.assertNull(NodeUtil.getInputId(IR.number(1)));
  }

  @Test
  public void testGetImpureBooleanValue() {
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.assign(IR.name("x"), IR.number(1))));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.comma(IR.number(1), IR.number(0))));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.not(IR.trueNode())));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.and(IR.trueNode(), IR.trueNode())));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.or(IR.falseNode(), IR.trueNode())));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.hook(IR.name("c"), IR.trueNode(), IR.trueNode())));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(IR.hook(IR.name("c"), IR.trueNode(), IR.falseNode())));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.arraylit()));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.objectlit()));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.voidNode(IR.number(0))));
  }

  @Test
  public void testGetPureBooleanValue() {
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.string("abc")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.string("")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.number(5)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.number(0)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.not(IR.trueNode())));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.nullNode()));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.falseNode()));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.voidNode(IR.number(0))));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.voidNode(IR.call(IR.name("f")))));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("undefined")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("NaN")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.name("Infinity")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.name("otherVar")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.trueNode()));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.regexp(IR.string("a"))));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.arraylit()));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.objectlit()));
  }

  @Test
  public void testGetStringValue() {
    Assert.assertEquals("str", NodeUtil.getStringValue(IR.string("str")));
    Assert.assertEquals("undefined", NodeUtil.getStringValue(IR.name("undefined")));
    Assert.assertEquals("Infinity", NodeUtil.getStringValue(IR.name("Infinity")));
    Assert.assertEquals("NaN", NodeUtil.getStringValue(IR.name("NaN")));
    Assert.assertNull(NodeUtil.getStringValue(IR.name("x")));
    Assert.assertEquals("5", NodeUtil.getStringValue(IR.number(5.0)));
    Assert.assertEquals("5.5", NodeUtil.getStringValue(IR.number(5.5)));
    Assert.assertEquals("false", NodeUtil.getStringValue(IR.falseNode()));
    Assert.assertEquals("true", NodeUtil.getStringValue(IR.trueNode()));
    Assert.assertEquals("null", NodeUtil.getStringValue(IR.nullNode()));
    Assert.assertEquals("undefined", NodeUtil.getStringValue(IR.voidNode(IR.number(0))));
    Assert.assertEquals("false", NodeUtil.getStringValue(IR.not(IR.trueNode())));
    Assert.assertEquals("true", NodeUtil.getStringValue(IR.not(IR.falseNode())));
    Assert.assertEquals("[object Object]", NodeUtil.getStringValue(IR.objectlit()));

    Node arrayLit = IR.arraylit(IR.string("a"), IR.nullNode(), IR.empty(), IR.number(1));
    Assert.assertEquals("a,,,1", NodeUtil.getStringValue(arrayLit));

    Node nonConvertibleArray = IR.arraylit(IR.name("unknown"));
    Assert.assertNull(NodeUtil.getStringValue(nonConvertibleArray));
  }

  @Test
  public void testGetNumberValue() {
    Assert.assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(IR.trueNode()));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.falseNode()));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.nullNode()));
    Assert.assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(IR.number(42.0)));
    Assert.assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(IR.voidNode(IR.number(0))));
    Assert.assertNull(NodeUtil.getNumberValue(IR.voidNode(IR.call(IR.name("f")))));
    Assert.assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(IR.name("undefined")));
    Assert.assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(IR.name("NaN")));
    Assert.assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(IR.name("Infinity")));
    Assert.assertNull(NodeUtil.getNumberValue(IR.name("foo")));
    Assert.assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(IR.neg(IR.name("Infinity"))));
    Assert.assertNull(NodeUtil.getNumberValue(IR.neg(IR.name("x"))));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.not(IR.trueNode())));
    Assert.assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(IR.not(IR.falseNode())));
    Assert.assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(IR.string("123")));
    Assert.assertEquals(Double.valueOf(10.0), NodeUtil.getNumberValue(IR.arraylit(IR.number(10))));
  }

  @Test
  public void testGetStringNumberValue() {
    Assert.assertNull(NodeUtil.getStringNumberValue("foo\u000bbar"));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
    Assert.assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    Assert.assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("0xZZ"));
    Assert.assertNull(NodeUtil.getStringNumberValue("+0x10"));
    Assert.assertNull(NodeUtil.getStringNumberValue("-0x10"));
    Assert.assertNull(NodeUtil.getStringNumberValue("infinity"));
    Assert.assertNull(NodeUtil.getStringNumberValue("-infinity"));
    Assert.assertNull(NodeUtil.getStringNumberValue("+infinity"));
    Assert.assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("  123.45  "));
    Assert.assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("invalid_num"));
  }

  @Test
  public void testIsImmutableValue() {
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.string("abc")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.number(123)));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.nullNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.falseNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.not(IR.trueNode())));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.neg(IR.number(1))));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("undefined")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("Infinity")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("NaN")));
    Assert.assertFalse(NodeUtil.isImmutableValue(IR.name("myVar")));
    Assert.assertFalse(NodeUtil.isImmutableValue(IR.arraylit()));
  }

  @Test
  public void testIsSymmetricAndRelationalAndInverse() {
    Assert.assertTrue(NodeUtil.isSymmetricOperation(IR.eq(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(IR.ne(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(IR.sheq(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(IR.shne(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(IR.mul(IR.name("a"), IR.name("b"))));
    Assert.assertFalse(NodeUtil.isSymmetricOperation(IR.add(IR.name("a"), IR.name("b"))));

    Assert.assertTrue(NodeUtil.isRelationalOperation(IR.gt(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isRelationalOperation(IR.ge(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isRelationalOperation(IR.lt(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isRelationalOperation(IR.le(IR.name("a"), IR.name("b"))));
    Assert.assertFalse(NodeUtil.isRelationalOperation(IR.eq(IR.name("a"), IR.name("b"))));

    Assert.assertEquals(Token.LT, NodeUtil.getInverseOperator(Token.GT));
    Assert.assertEquals(Token.GT, NodeUtil.getInverseOperator(Token.LT));
    Assert.assertEquals(Token.LE, NodeUtil.getInverseOperator(Token.GE));
    Assert.assertEquals(Token.GE, NodeUtil.getInverseOperator(Token.LE));
    Assert.assertEquals(Token.ERROR, NodeUtil.getInverseOperator(Token.ADD));
  }

  @Test
  public void testIsLiteralValue() {
    Assert.assertTrue(NodeUtil.isLiteralValue(IR.arraylit(IR.number(1), IR.string("a")), false));
    Assert.assertFalse(NodeUtil.isLiteralValue(IR.arraylit(IR.name("x")), false));
    Assert.assertTrue(NodeUtil.isLiteralValue(IR.regexp(IR.string("abc")), false));
    Assert.assertFalse(NodeUtil.isLiteralValue(IR.regexp(IR.name("x")), false));

    Node objLit = IR.objectlit();
    Node key = IR.stringKey("k");
    key.addChildToBack(IR.number(1));
    objLit.addChildToBack(key);
    Assert.assertTrue(NodeUtil.isLiteralValue(objLit, false));

    Node keyWithVar = IR.stringKey("k2");
    keyWithVar.addChildToBack(IR.name("x"));
    Node objLitBad = IR.objectlit(keyWithVar);
    Assert.assertFalse(NodeUtil.isLiteralValue(objLitBad, false));

    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Assert.assertTrue(NodeUtil.isLiteralValue(fn, true));
    Assert.assertFalse(NodeUtil.isLiteralValue(fn, false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = ImmutableSet.of("DEF_A", "DEF_B");
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.string("hello"), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.number(10), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.trueNode(), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.falseNode(), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.add(IR.number(1), IR.number(2)), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.not(IR.trueNode()), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.name("DEF_A"), defines));
    Assert.assertFalse(NodeUtil.isValidDefineValue(IR.name("UNKNOWN_DEF"), defines));
    Assert.assertFalse(NodeUtil.isValidDefineValue(IR.objectlit(), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    Assert.assertTrue(NodeUtil.isEmptyBlock(IR.block()));
    Assert.assertTrue(NodeUtil.isEmptyBlock(IR.block(IR.empty())));
    Assert.assertFalse(NodeUtil.isEmptyBlock(IR.block(IR.exprResult(IR.number(1)))));
    Assert.assertFalse(NodeUtil.isEmptyBlock(IR.exprResult(IR.number(1))));
  }

  @Test
  public void testIsSimpleOperator() {
    Assert.assertTrue(NodeUtil.isSimpleOperator(IR.add(IR.number(1), IR.number(2))));
    Assert.assertTrue(NodeUtil.isSimpleOperator(IR.bitnot(IR.number(1))));
    Assert.assertTrue(NodeUtil.isSimpleOperator(IR.typeof(IR.name("a"))));
    Assert.assertFalse(NodeUtil.isSimpleOperator(IR.call(IR.name("f"))));
    Assert.assertFalse(NodeUtil.isSimpleOperator(IR.hook(IR.name("a"), IR.number(1), IR.number(2))));
  }

  @Test
  public void testNewExpr() {
    Node num = IR.number(1);
    Node expr = NodeUtil.newExpr(num);
    Assert.assertTrue(expr.isExprResult());
    Assert.assertSame(num, expr.getFirstChild());
  }

  @Test
  public void testMayHaveSideEffectsAndMayEffectMutableState() {
    Compiler compiler = new Compiler();
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(IR.number(1), compiler));
    Assert.assertFalse(NodeUtil.mayEffectMutableState(IR.number(1), compiler));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(IR.throwNode(IR.string("err")), compiler));

    Node objLit = IR.objectlit();
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(objLit, compiler));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(objLit, compiler));

    Node newObj = IR.newNode(IR.name("Object"));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newObj, compiler));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(newObj, compiler));

    Node newCustom = IR.newNode(IR.name("CustomClass"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(newCustom, compiler));

    Node callBuiltin = IR.call(IR.name("String"), IR.number(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callBuiltin, compiler));

    Node callCustom = IR.call(IR.name("customFunc"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(callCustom, compiler));

    Node mathFloor = IR.call(IR.getprop(IR.name("Math"), IR.string("floor")), IR.number(1.5));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(mathFloor, compiler));

    Node strMatch = IR.call(IR.getprop(IR.string("a"), IR.string("match")), IR.string("a"));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(strMatch, compiler));

    Node reTest = IR.call(IR.getprop(IR.regexp(IR.string("a")), IR.string("test")), IR.string("a"));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(reTest, compiler));

    Node noSideEffectCall = IR.call(IR.name("f"));
    noSideEffectCall.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(noSideEffectCall, compiler));

    Node assignName = IR.assign(IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignName, compiler));

    Node assignPropLocal = IR.assign(IR.getprop(IR.objectlit(), IR.string("p")), IR.number(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(assignPropLocal, compiler));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_notNew_throwsException() {
    NodeUtil.constructorCallHasSideEffects(IR.call(IR.name("f")));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_notCall_throwsException() {
    NodeUtil.functionCallHasSideEffects(IR.newNode(IR.name("f")));
  }

  @Test
  public void testCallAndNewLocalResults() {
    Node call = IR.call(IR.name("f"));
    call.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    Assert.assertTrue(NodeUtil.callHasLocalResult(call));

    Node newNode = IR.newNode(IR.name("f"));
    newNode.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    Assert.assertTrue(NodeUtil.newHasLocalResult(newNode));
  }

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(IR.delprop(IR.name("x"))));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(IR.inc(IR.name("x"), false)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(IR.dec(IR.name("x"), false)));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(IR.throwNode(IR.string("err"))));
    Node nameWithChild = IR.name("x");
    nameWithChild.addChildToBack(IR.number(1));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(IR.name("x")));
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(IR.number(1)));
  }

  @Test
  public void testCanBeSideEffected() {
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.call(IR.name("f"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.newNode(IR.name("f"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.name("variable")));
    Assert.assertFalse(NodeUtil.canBeSideEffected(IR.name("variable"), ImmutableSet.of("variable")));

    Node constName = IR.name("CONST_VAR");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Assert.assertFalse(NodeUtil.canBeSideEffected(constName));

    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.getprop(IR.name("a"), IR.string("b"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.getelem(IR.name("a"), IR.number(0))));

    Node fnExpr = IR.function(IR.name(""), IR.paramList(), IR.block());
    IR.assign(IR.name("f"), fnExpr);
    Assert.assertFalse(NodeUtil.canBeSideEffected(fnExpr));
  }

  @Test
  public void testPrecedence() {
    Assert.assertEquals(0, NodeUtil.precedence(Token.COMMA));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_ADD));
    Assert.assertEquals(2, NodeUtil.precedence(Token.HOOK));
    Assert.assertEquals(3, NodeUtil.precedence(Token.OR));
    Assert.assertEquals(4, NodeUtil.precedence(Token.AND));
    Assert.assertEquals(5, NodeUtil.precedence(Token.BITOR));
    Assert.assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    Assert.assertEquals(7, NodeUtil.precedence(Token.BITAND));
    Assert.assertEquals(8, NodeUtil.precedence(Token.EQ));
    Assert.assertEquals(9, NodeUtil.precedence(Token.LT));
    Assert.assertEquals(10, NodeUtil.precedence(Token.LSH));
    Assert.assertEquals(11, NodeUtil.precedence(Token.ADD));
    Assert.assertEquals(12, NodeUtil.precedence(Token.MUL));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NOT));
    Assert.assertEquals(15, NodeUtil.precedence(Token.CALL));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknownToken_throwsError() {
    NodeUtil.precedence(Token.SCRIPT);
  }

  @Test
  public void testIsNullOrUndefined() {
    Assert.assertTrue(NodeUtil.isUndefined(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.isUndefined(IR.name("undefined")));
    Assert.assertFalse(NodeUtil.isUndefined(IR.name("foo")));
    Assert.assertTrue(NodeUtil.isNullOrUndefined(IR.nullNode()));
    Assert.assertTrue(NodeUtil.isNullOrUndefined(IR.name("undefined")));
    Assert.assertFalse(NodeUtil.isNullOrUndefined(IR.number(1)));
  }

  @Test
  public void testAllResultsMatchAndAnyResultsMatch() {
    Predicate<Node> isNum = new Predicate<Node>() {
      @Override public boolean apply(Node n) { return n.isNumber(); }
    };

    Node hook1 = IR.hook(IR.name("c"), IR.number(1), IR.number(2));
    Assert.assertTrue(NodeUtil.allResultsMatch(hook1, isNum));
    Assert.assertTrue(NodeUtil.anyResultsMatch(hook1, isNum));

    Node hook2 = IR.hook(IR.name("c"), IR.number(1), IR.string("str"));
    Assert.assertFalse(NodeUtil.allResultsMatch(hook2, isNum));
    Assert.assertTrue(NodeUtil.anyResultsMatch(hook2, isNum));

    Node andNode = IR.and(IR.string("a"), IR.string("b"));
    Assert.assertFalse(NodeUtil.anyResultsMatch(andNode, isNum));
  }

  @Test
  public void testIsNumericResultAndIsBooleanResult() {
    Assert.assertTrue(NodeUtil.isNumericResult(IR.number(123)));
    Assert.assertTrue(NodeUtil.isNumericResult(IR.sub(IR.number(1), IR.number(2))));
    Assert.assertTrue(NodeUtil.isNumericResult(IR.name("NaN")));
    Assert.assertTrue(NodeUtil.isNumericResult(IR.name("Infinity")));
    Assert.assertFalse(NodeUtil.isNumericResult(IR.string("123")));

    Assert.assertTrue(NodeUtil.isBooleanResult(IR.trueNode()));
    Assert.assertTrue(NodeUtil.isBooleanResult(IR.falseNode()));
    Assert.assertTrue(NodeUtil.isBooleanResult(IR.eq(IR.name("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.isBooleanResult(IR.delprop(IR.name("a"))));
    Assert.assertFalse(NodeUtil.isBooleanResult(IR.number(1)));
  }

  @Test
  public void testMayBeString() {
    Assert.assertTrue(NodeUtil.mayBeString(IR.string("abc")));
    Assert.assertTrue(NodeUtil.mayBeString(IR.name("foo")));
    Assert.assertFalse(NodeUtil.mayBeString(IR.number(123)));
    Assert.assertFalse(NodeUtil.mayBeString(IR.trueNode()));
    Assert.assertFalse(NodeUtil.mayBeString(IR.nullNode()));
    Assert.assertFalse(NodeUtil.mayBeString(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.mayBeString(IR.string("abc"), false));
  }

  @Test
  public void testIsAssociativeAndIsCommutative() {
    Assert.assertTrue(NodeUtil.isAssociative(Token.MUL));
    Assert.assertTrue(NodeUtil.isAssociative(Token.AND));
    Assert.assertTrue(NodeUtil.isAssociative(Token.OR));
    Assert.assertTrue(NodeUtil.isAssociative(Token.BITOR));
    Assert.assertFalse(NodeUtil.isAssociative(Token.ADD));
    Assert.assertFalse(NodeUtil.isAssociative(Token.SUB));

    Assert.assertTrue(NodeUtil.isCommutative(Token.MUL));
    Assert.assertTrue(NodeUtil.isCommutative(Token.BITOR));
    Assert.assertFalse(NodeUtil.isCommutative(Token.AND));
    Assert.assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOpAndGetOpFromAssignmentOp() {
    Node assignAdd = IR.assignAdd(IR.name("a"), IR.number(1));
    Assert.assertTrue(NodeUtil.isAssignmentOp(assignAdd));
    Assert.assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(assignAdd));

    Node assignBitor = new Node(Token.ASSIGN_BITOR, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(assignBitor));
    Node assignBitxor = new Node(Token.ASSIGN_BITXOR, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.BITXOR, NodeUtil.getOpFromAssignmentOp(assignBitxor));
    Node assignBitand = new Node(Token.ASSIGN_BITAND, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(assignBitand));
    Node assignLsh = new Node(Token.ASSIGN_LSH, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.LSH, NodeUtil.getOpFromAssignmentOp(assignLsh));
    Node assignRsh = new Node(Token.ASSIGN_RSH, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.RSH, NodeUtil.getOpFromAssignmentOp(assignRsh));
    Node assignUrsh = new Node(Token.ASSIGN_URSH, IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(assignUrsh));
    Node assignSub = IR.assignSub(IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(assignSub));
    Node assignMul = IR.assignMul(IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(assignMul));
    Node assignDiv = IR.assignDiv(IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.DIV, NodeUtil.getOpFromAssignmentOp(assignDiv));
    Node assignMod = IR.assignMod(IR.name("a"), IR.number(1));
    Assert.assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(assignMod));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_nonAssignOp_throwsException() {
    NodeUtil.getOpFromAssignmentOp(IR.add(IR.number(1), IR.number(2)));
  }

  @Test
  public void testContainsFunctionAndReferencesThis() {
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block(IR.exprResult(IR.thisNode())));
    Assert.assertTrue(NodeUtil.containsFunction(fn));
    Assert.assertTrue(NodeUtil.referencesThis(fn));

    Node block = IR.block(IR.exprResult(IR.number(1)));
    Assert.assertFalse(NodeUtil.containsFunction(block));
    Assert.assertFalse(NodeUtil.referencesThis(block));
  }

  @Test
  public void testIsGetAndIsVarDeclarationAndGetAssignedValue() {
    Node getProp = IR.getprop(IR.name("a"), IR.string("b"));
    Assert.assertTrue(NodeUtil.isGet(getProp));
    Assert.assertFalse(NodeUtil.isGet(IR.name("a")));

    Node varName = IR.name("v");
    Node val = IR.number(10);
    varName.addChildToBack(val);
    IR.var(varName);

    Assert.assertTrue(NodeUtil.isVarDeclaration(varName));
    Assert.assertSame(val, NodeUtil.getAssignedValue(varName));

    Node assignName = IR.name("x");
    Node assignVal = IR.number(20);
    IR.assign(assignName, assignVal);
    Assert.assertSame(assignVal, NodeUtil.getAssignedValue(assignName));

    Node orphanName = IR.name("orphan");
    Assert.assertNull(NodeUtil.getAssignedValue(orphanName));
  }

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node exprAssign = IR.exprResult(IR.assign(IR.name("a"), IR.number(1)));
    Assert.assertTrue(NodeUtil.isExprAssign(exprAssign));
    Assert.assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = IR.exprResult(IR.call(IR.name("f")));
    Assert.assertTrue(NodeUtil.isExprCall(exprCall));
    Assert.assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  @Test
  public void testLoopsAndControlStructures() {
    Node forIn = IR.forIn(IR.name("k"), IR.name("obj"), IR.block());
    Assert.assertTrue(NodeUtil.isForIn(forIn));
    Assert.assertTrue(NodeUtil.isLoopStructure(forIn));
    Assert.assertTrue(NodeUtil.isControlStructure(forIn));

    Node whileNode = IR.whileNode(IR.trueNode(), IR.block());
    Assert.assertTrue(NodeUtil.isLoopStructure(whileNode));
    Assert.assertEquals(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));

    Node doNode = IR.doNode(IR.block(), IR.trueNode());
    Assert.assertTrue(NodeUtil.isLoopStructure(doNode));
    Assert.assertEquals(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));

    Assert.assertNull(NodeUtil.getLoopCodeBlock(IR.exprResult(IR.number(1))));

    Node inner = IR.number(1);
    whileNode.getLastChild().addChildToBack(inner);
    Assert.assertTrue(NodeUtil.isWithinLoop(inner));
    Assert.assertFalse(NodeUtil.isWithinLoop(IR.number(2)));

    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(whileNode, whileNode.getLastChild()));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doNode.getFirstChild()));

    Node ifNode = IR.ifNode(IR.trueNode(), IR.block());
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));

    Assert.assertEquals(ifNode.getFirstChild(), NodeUtil.getConditionExpression(ifNode));
    Assert.assertEquals(whileNode.getFirstChild(), NodeUtil.getConditionExpression(whileNode));
    Assert.assertEquals(doNode.getLastChild(), NodeUtil.getConditionExpression(doNode));

    Node for4 = new Node(Token.FOR, IR.var(IR.name("i")), IR.lt(IR.name("i"), IR.number(10)), IR.inc(IR.name("i"), false), IR.block());
    Assert.assertEquals(for4.getFirstChild().getNext(), NodeUtil.getConditionExpression(for4));
    Assert.assertNull(NodeUtil.getConditionExpression(forIn));
  }

  @Test
  public void testIsStatementBlockAndIsStatement() {
    Node script = IR.script();
    Node block = IR.block();
    Assert.assertTrue(NodeUtil.isStatementBlock(script));
    Assert.assertTrue(NodeUtil.isStatementBlock(block));
    Assert.assertFalse(NodeUtil.isStatementBlock(IR.number(1)));

    Node stmt = IR.exprResult(IR.number(1));
    script.addChildToBack(stmt);
    Assert.assertTrue(NodeUtil.isStatement(stmt));
  }

  @Test
  public void testIsSwitchCaseAndReferenceName() {
    Node caseNode = IR.caseNode(IR.number(1), IR.block());
    Node defaultNode = IR.defaultCase(IR.block());
    Assert.assertTrue(NodeUtil.isSwitchCase(caseNode));
    Assert.assertTrue(NodeUtil.isSwitchCase(defaultNode));
    Assert.assertFalse(NodeUtil.isSwitchCase(IR.block()));

    Assert.assertTrue(NodeUtil.isReferenceName(IR.name("varName")));
    Assert.assertFalse(NodeUtil.isReferenceName(IR.name("")));
    Assert.assertFalse(NodeUtil.isReferenceName(IR.number(1)));
  }

  @Test
  public void testRemoveChild() {
    Node parentBlock = IR.block();
    Node stmt1 = IR.exprResult(IR.number(1));
    Node stmt2 = IR.exprResult(IR.number(2));
    parentBlock.addChildToBack(stmt1);
    parentBlock.addChildToBack(stmt2);

    NodeUtil.removeChild(parentBlock, stmt1);
    Assert.assertEquals(1, parentBlock.getChildCount());
    Assert.assertSame(stmt2, parentBlock.getFirstChild());

    Node varNode = IR.var(IR.name("a"), IR.name("b"));
    parentBlock.addChildToBack(varNode);
    NodeUtil.removeChild(varNode, varNode.getFirstChild());
    Assert.assertEquals(1, varNode.getChildCount());

    Node blockInside = IR.block(IR.exprResult(IR.number(5)));
    parentBlock.addChildToBack(blockInside);
    NodeUtil.removeChild(parentBlock, blockInside);
    Assert.assertEquals(0, blockInside.getChildCount());
  }

  @Test
  public void testMaybeAddFinallyAndTryCatchFinallyOperations() {
    Node tryNode = IR.tryNode(IR.block(), IR.catchNode(IR.name("e"), IR.block()));
    Assert.assertFalse(NodeUtil.hasFinally(tryNode));
    NodeUtil.maybeAddFinally(tryNode);
    Assert.assertTrue(NodeUtil.hasFinally(tryNode));

    Node catchBlock = NodeUtil.getCatchBlock(tryNode);
    Assert.assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    Assert.assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));
    Assert.assertTrue(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
  }

  @Test
  public void testTryMergeBlock() {
    Node parent = IR.block();
    Node childBlock = IR.block(IR.exprResult(IR.number(1)), IR.exprResult(IR.number(2)));
    parent.addChildToBack(childBlock);

    boolean merged = NodeUtil.tryMergeBlock(childBlock);
    Assert.assertTrue(merged);
    Assert.assertEquals(2, parent.getChildCount());

    Node nonParent = IR.exprResult(IR.number(1));
    Node standaloneBlock = IR.block();
    nonParent.addChildToBack(standaloneBlock);
    Assert.assertFalse(NodeUtil.tryMergeBlock(standaloneBlock));
  }

  @Test
  public void testFunctionClassification() {
    Node body = IR.block();
    Node fnDecl = IR.function(IR.name("decl"), IR.paramList(), body);
    IR.script(fnDecl);

    Assert.assertTrue(NodeUtil.isCallOrNew(IR.call(IR.name("f"))));
    Assert.assertTrue(NodeUtil.isCallOrNew(IR.newNode(IR.name("f"))));
    Assert.assertFalse(NodeUtil.isCallOrNew(IR.name("f")));

    Assert.assertSame(body, NodeUtil.getFunctionBody(fnDecl));
    Assert.assertTrue(NodeUtil.isFunctionDeclaration(fnDecl));
    Assert.assertTrue(NodeUtil.isHoistedFunctionDeclaration(fnDecl));
    Assert.assertFalse(NodeUtil.isFunctionExpression(fnDecl));

    Node fnExpr = IR.function(IR.name("expr"), IR.paramList(), IR.block());
    IR.assign(IR.name("f"), fnExpr);
    Assert.assertTrue(NodeUtil.isFunctionExpression(fnExpr));
    Assert.assertFalse(NodeUtil.isFunctionDeclaration(fnExpr));
    Assert.assertTrue(NodeUtil.isBleedingFunctionName(fnExpr.getFirstChild()));
    Assert.assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));

    Node varArgsFn = IR.function(IR.name("va"), IR.paramList(), IR.block(IR.exprResult(IR.name("arguments"))));
    Assert.assertTrue(NodeUtil.isVarArgsFunction(varArgsFn));
  }

  @Test
  public void testFunctionCalls() {
    Node objCall = IR.call(IR.getprop(IR.name("obj"), IR.string("call")), IR.thisNode());
    Node objApply = IR.call(IR.getprop(IR.name("obj"), IR.string("apply")), IR.thisNode());
    Assert.assertTrue(NodeUtil.isFunctionObjectCall(objCall));
    Assert.assertTrue(NodeUtil.isFunctionObjectApply(objApply));
    Assert.assertTrue(NodeUtil.isObjectCallMethod(objCall, "call"));
  }

  @Test
  public void testIsVarOrSimpleAssignLhs() {
    Node lhs = IR.name("x");
    Node assign = IR.assign(lhs, IR.number(1));
    Assert.assertTrue(NodeUtil.isVarOrSimpleAssignLhs(lhs, assign));

    Node varName = IR.name("y");
    Node varNode = IR.var(varName);
    Assert.assertTrue(NodeUtil.isVarOrSimpleAssignLhs(varName, varNode));
  }

  @Test
  public void testObjectLiteralKeyHelpers() {
    Node strKey = IR.stringKey("k1");
    Node getDef = IR.getterDef("k2", IR.function(IR.name(""), IR.paramList(), IR.block()));
    Node setDef = IR.setterDef("k3", IR.function(IR.name(""), IR.paramList(IR.name("val")), IR.block()));
    Node objLit = IR.objectlit(strKey, getDef, setDef);

    Assert.assertTrue(NodeUtil.isObjectLitKey(strKey, objLit));
    Assert.assertTrue(NodeUtil.isObjectLitKey(getDef, objLit));
    Assert.assertTrue(NodeUtil.isObjectLitKey(setDef, objLit));
    Assert.assertFalse(NodeUtil.isObjectLitKey(IR.name("x"), objLit));

    Assert.assertEquals("k1", NodeUtil.getObjectLitKeyName(strKey));
    Assert.assertEquals("k2", NodeUtil.getObjectLitKeyName(getDef));
    Assert.assertEquals("k3", NodeUtil.getObjectLitKeyName(setDef));

    Assert.assertFalse(NodeUtil.isGetOrSetKey(strKey));
    Assert.assertTrue(NodeUtil.isGetOrSetKey(getDef));
    Assert.assertTrue(NodeUtil.isGetOrSetKey(setDef));

    JSTypeRegistry registry = new JSTypeRegistry(null);
    JSType stringType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    JSType getterFnType = registry.createFunctionType(stringType);
    Assert.assertEquals(stringType, NodeUtil.getObjectLitKeyTypeFromValueType(getDef, getterFnType));
    Assert.assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(getDef, stringType));

    JSType setterFnType = registry.createFunctionType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), stringType);
    Assert.assertEquals(stringType, NodeUtil.getObjectLitKeyTypeFromValueType(setDef, setterFnType));
    Assert.assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(setDef, stringType));
  }

  @Test
  public void testOpToStrAndNoFail() {
    Assert.assertEquals("+", NodeUtil.opToStr(Token.ADD));
    Assert.assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    Assert.assertEquals("typeof", NodeUtil.opToStr(Token.TYPEOF));
    Assert.assertNull(NodeUtil.opToStr(Token.SCRIPT));

    Assert.assertEquals("-", NodeUtil.opToStrNoFail(Token.SUB));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_invalidOp_throwsError() {
    NodeUtil.opToStrNoFail(Token.SCRIPT);
  }

  @Test
  public void testTraversalsAndPredicates() {
    Node tree = IR.block(IR.var(IR.name("a")), IR.var(IR.name("b")), IR.exprResult(IR.name("a")));
    Assert.assertTrue(NodeUtil.containsType(tree, Token.VAR));
    Assert.assertEquals(2, NodeUtil.getNodeTypeReferenceCount(tree, Token.VAR, Predicates.<Node>alwaysTrue()));
    Assert.assertTrue(NodeUtil.isNameReferenced(tree, "a"));
    Assert.assertEquals(2, NodeUtil.getNameReferenceCount(tree, "a"));

    final int[] visitCount = new int[2];
    NodeUtil.visitPreOrder(tree, new NodeUtil.Visitor() {
      @Override public void visit(Node node) { visitCount[0]++; }
    }, Predicates.<Node>alwaysTrue());

    NodeUtil.visitPostOrder(tree, new NodeUtil.Visitor() {
      @Override public void visit(Node node) { visitCount[1]++; }
    }, Predicates.<Node>alwaysTrue());

    Assert.assertTrue(visitCount[0] > 0);
    Assert.assertEquals(visitCount[0], visitCount[1]);

    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(tree);
    Assert.assertEquals(2, vars.size());

    Node script = IR.script(tree);
    NodeUtil.redeclareVarsInsideBranch(tree);
    Assert.assertTrue(script.getFirstChild().isVar());
  }

  @Test
  public void testNewQualifiedNameNodeWithBasis() {
    CodingConvention convention = new ClosureCodingConvention();
    Node basis = IR.name("orig");
    basis.setSourceEncodedPosition(10);
    Node node = NodeUtil.newQualifiedNameNode(convention, "foo.bar", basis, "origName");
    Assert.assertEquals("foo.bar", node.getQualifiedName());
    Assert.assertEquals("origName", node.getProp(Node.ORIGINALNAME_PROP));
    Assert.assertEquals(basis.getSourceOffset(), node.getSourceOffset());

    Node root = NodeUtil.getRootOfQualifiedName(node);
    Assert.assertTrue(root.isName());
    Assert.assertEquals("foo", root.getString());
  }

  @Test
  public void testNewName() {
    CodingConvention convention = new ClosureCodingConvention();
    Node basis = IR.name("orig");
    Node nameNode = NodeUtil.newName(convention, "newName", basis, "origName");
    Assert.assertEquals("newName", nameNode.getString());
    Assert.assertEquals("origName", nameNode.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testIsLatinAndIsValidSimpleNameAndIsValidPropertyName() {
    Assert.assertTrue(NodeUtil.isLatin("abcXYZ012_$-"));
    Assert.assertFalse(NodeUtil.isLatin("abc\u0100"));

    Assert.assertTrue(NodeUtil.isValidSimpleName("validVar"));
    Assert.assertTrue(NodeUtil.isValidPropertyName("validVar"));
    Assert.assertFalse(NodeUtil.isValidSimpleName("var")); // keyword
    Assert.assertFalse(NodeUtil.isValidSimpleName("123num"));
    Assert.assertFalse(NodeUtil.isValidSimpleName("var\u0100"));
  }

  @Test
  public void testPrototypeHelpers() {
    Node qName = IR.getprop(IR.getprop(IR.name("MyClass"), IR.string("prototype")), IR.string("method"));
    Node assign = IR.exprResult(IR.assign(qName, IR.function(IR.name(""), IR.paramList(), IR.block())));

    Assert.assertTrue(NodeUtil.isPrototypePropertyDeclaration(assign));
    Assert.assertTrue(NodeUtil.isPrototypeProperty(qName));
    Assert.assertEquals("MyClass", NodeUtil.getPrototypeClassName(qName).getString());
    Assert.assertEquals("method", NodeUtil.getPrototypePropertyName(qName));
    Assert.assertFalse(NodeUtil.isPrototypeProperty(IR.name("x")));
    Assert.assertNull(NodeUtil.getPrototypeClassName(IR.name("x")));
  }

  @Test
  public void testNewUndefinedNodeAndNewVarNode() {
    Node src = IR.name("ref");
    Node undef = NodeUtil.newUndefinedNode(src);
    Assert.assertTrue(undef.isVoid());

    Node varNode = NodeUtil.newVarNode("myVar", IR.number(123));
    Assert.assertTrue(varNode.isVar());
    Assert.assertEquals("myVar", varNode.getFirstChild().getString());
    Assert.assertTrue(varNode.getFirstChild().getFirstChild().isNumber());
  }

  @Test
  public void testConstantConventions() {
    CodingConvention convention = new ClosureCodingConvention();
    Node constNode = IR.name("CONSTANT_VAL");
    Assert.assertTrue(NodeUtil.isConstantByConvention(convention, constNode, IR.var(constNode)));

    Node propKey = IR.string("CONSTANT_KEY");
    Node getProp = IR.getprop(IR.name("obj"), propKey);
    Assert.assertTrue(NodeUtil.isConstantByConvention(convention, propKey, getProp));
    Assert.assertFalse(NodeUtil.isConstantName(propKey));
  }

  @Test
  public void testNewCallNode() {
    Node call = NodeUtil.newCallNode(IR.name("foo"), IR.number(1), IR.string("a"));
    Assert.assertTrue(call.isCall());
    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
    Assert.assertEquals(3, call.getChildCount());

    Node methodCall = NodeUtil.newCallNode(IR.getprop(IR.name("obj"), IR.string("m")));
    Assert.assertFalse(methodCall.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testEvaluatesToLocalValue() {
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.number(1)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.string("str")));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.arraylit()));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.objectlit()));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.function(IR.name(""), IR.paramList(), IR.block())));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.regexp(IR.string("a"))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.delprop(IR.name("x"))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.in(IR.string("a"), IR.name("b"))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.comma(IR.name("a"), IR.number(1))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.and(IR.number(1), IR.number(2))));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.hook(IR.name("c"), IR.number(1), IR.number(2))));

    Node inc = IR.inc(IR.name("x"), false);
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(inc));

    Node toStringCall = IR.call(IR.getprop(IR.name("x"), IR.string("toString")));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(toStringCall));
  }

  @Test
  public void testGetArgumentForFunctionAndCall() {
    Node p1 = IR.name("p1");
    Node p2 = IR.name("p2");
    Node fn = IR.function(IR.name("f"), IR.paramList(p1, p2), IR.block());
    Assert.assertSame(p1, NodeUtil.getArgumentForFunction(fn, 0));
    Assert.assertSame(p2, NodeUtil.getArgumentForFunction(fn, 1));
    Assert.assertNull(NodeUtil.getArgumentForFunction(fn, 2));

    Node arg1 = IR.number(10);
    Node call = IR.call(IR.name("f"), arg1);
    Assert.assertSame(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
    Assert.assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));
  }

  @Test
  public void testGetBestJSDocInfoAndLValueHelpers() {
    JSDocInfo info = new JSDocInfo();
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node name = IR.name("f");
    name.setJSDocInfo(info);
    Node assign = IR.assign(name, fn);

    Assert.assertSame(info, NodeUtil.getBestJSDocInfo(fn));
    Assert.assertSame(name, NodeUtil.getBestLValue(fn));
    Assert.assertSame(fn, NodeUtil.getRValueOfLValue(name));
    Assert.assertNull(NodeUtil.getBestLValueOwner(name));
    Assert.assertEquals("f", NodeUtil.getBestLValueName(name));

    Node getProp = IR.getprop(IR.name("myObj"), IR.string("prop"));
    Assert.assertEquals("myObj", NodeUtil.getBestLValueOwner(getProp).getString());

    Node objKey = IR.stringKey("key");
    Node objLit = IR.objectlit(objKey);
    IR.assign(IR.name("container"), objLit);
    Assert.assertEquals("container.key", NodeUtil.getBestLValueName(objKey));
  }

  @Test
  public void testIsExpressionResultUsed() {
    Node block = IR.block();
    Node expr = IR.number(1);
    block.addChildToBack(expr);
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(expr));

    Node hook = IR.hook(IR.name("cond"), IR.number(1), IR.number(2));
    IR.exprResult(hook);
    Assert.assertTrue(NodeUtil.isExpressionResultUsed(hook.getFirstChild()));

    Node comma = IR.comma(IR.number(1), IR.number(2));
    IR.exprResult(comma);
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(comma.getFirstChild()));

    Node evalCall = IR.call(IR.comma(IR.number(0), IR.name("eval")), IR.string("1+1"));
    Node evalComma = evalCall.getFirstChild();
    Assert.assertTrue(NodeUtil.isExpressionResultUsed(evalComma.getFirstChild()));
  }

  @Test
  public void testIsExecutedExactlyOnce() {
    Node script = IR.script();
    Node stmt1 = IR.exprResult(IR.number(1));
    script.addChildToBack(stmt1);
    Assert.assertTrue(NodeUtil.isExecutedExactlyOnce(stmt1.getFirstChild()));

    Node ifNode = IR.ifNode(IR.name("cond"), IR.block(IR.exprResult(IR.number(2))));
    script.addChildToBack(ifNode);
    Node insideIf = ifNode.getLastChild().getFirstChild().getFirstChild();
    Assert.assertFalse(NodeUtil.isExecutedExactlyOnce(insideIf));

    Node whileNode = IR.whileNode(IR.trueNode(), IR.block(IR.exprResult(IR.number(3))));
    script.addChildToBack(whileNode);
    Node insideWhile = whileNode.getLastChild().getFirstChild().getFirstChild();
    Assert.assertFalse(NodeUtil.isExecutedExactlyOnce(insideWhile));
  }

  @Test
  public void testBooleanNodeAndNumberNode() {
    Node t = NodeUtil.booleanNode(true);
    Node f = NodeUtil.booleanNode(false);
    Assert.assertTrue(t.isTrue());
    Assert.assertTrue(f.isFalse());

    Node nan = NodeUtil.numberNode(Double.NaN, null);
    Assert.assertTrue(nan.isName());
    Assert.assertEquals("NaN", nan.getString());

    Node posInf = NodeUtil.numberNode(Double.POSITIVE_INFINITY, null);
    Assert.assertTrue(posInf.isName());
    Assert.assertEquals("Infinity", posInf.getString());

    Node negInf = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, null);
    Assert.assertTrue(negInf.isNeg());
    Assert.assertEquals("Infinity", negInf.getFirstChild().getString());

    Node regularNum = NodeUtil.numberNode(42.0, t);
    Assert.assertTrue(regularNum.isNumber());
    Assert.assertEquals(42.0, regularNum.getDouble(), 0.0);
  }

  @Test
  public void testPredicateImplementations() {
    NodeUtil.MatchNodeType matchBlock = new NodeUtil.MatchNodeType(Token.BLOCK);
    Assert.assertTrue(matchBlock.apply(IR.block()));
    Assert.assertFalse(matchBlock.apply(IR.script()));

    NodeUtil.MatchDeclaration matchDecl = new NodeUtil.MatchDeclaration();
    Assert.assertTrue(matchDecl.apply(IR.var()));
    Assert.assertFalse(matchDecl.apply(IR.exprResult(IR.number(1))));

    NodeUtil.MatchShallowStatement matchStmt = new NodeUtil.MatchShallowStatement();
    Assert.assertTrue(matchStmt.apply(IR.block()));
    Node script = IR.script();
    Node expr = IR.exprResult(IR.number(1));
    script.addChildToBack(expr);
    Assert.assertTrue(matchStmt.apply(expr));
  }
}
