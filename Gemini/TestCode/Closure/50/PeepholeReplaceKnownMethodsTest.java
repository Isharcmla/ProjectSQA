package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeReplaceKnownMethodsTest extends CompilerTestCase {

  private boolean isEcmaScript5 = true;

  public PeepholeReplaceKnownMethodsTest() {
    super();
  }

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    isEcmaScript5 = true;
    enableNormalize();
    enableEcmaScript5(isEcmaScript5);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler, new PeepholeReplaceKnownMethods());
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  // --- Non-call & Basic optimizeSubtree Tests ---

  @Test
  public void testOptimizeSubtree_nonCallNode_noChange() {
    testSame("var a = 1;");
    testSame("var s = 'hello';");
  }

  @Test
  public void testOptimizeSubtree_directNodeInvocationNonCall() {
    PeepholeReplaceKnownMethods peephole = new PeepholeReplaceKnownMethods();
    Node numberNode = Node.newNumber(42);
    Node result = peephole.optimizeSubtree(numberNode);
    assertEquals(numberNode, result);
  }

  @Test
  public void testOptimizeSubtree_callWithNoChildren() {
    PeepholeReplaceKnownMethods peephole = new PeepholeReplaceKnownMethods();
    Node callNode = new Node(Token.CALL);
    Node result = peephole.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  // --- Array.prototype.join Tests ---

  @Test
  public void testArrayJoin_emptyArray_foldsToEmptyString() {
    test("x = [].join()", "x = ''");
    test("x = [].join(',')", "x = ''");
    test("x = [].join('abc')", "x = ''");
  }

  @Test
  public void testArrayJoin_singleElement_foldsToString() {
    test("x = ['a'].join()", "x = 'a'");
    test("x = ['hello'].join(',')", "x = 'hello'");
    test("x = [1].join()", "x = '' + 1");
    test("x = [true].join()", "x = '' + true");
  }

  @Test
  public void testArrayJoin_multipleElements_defaultSeparator() {
    test("x = ['a', 'b', 'c'].join()", "x = 'a,b,c'");
    test("x = [1, 2, 3].join()", "x = '1,2,3'");
  }

  @Test
  public void testArrayJoin_multipleElements_customSeparator() {
    test("x = ['a', 'b', 'c'].join('')", "x = 'abc'");
    test("x = ['a', 'b', 'c'].join('-')", "x = 'a-b-c'");
    test("x = [1, 2, 3].join(' + ')", "x = '1 + 2 + 3'");
  }

  @Test
  public void testArrayJoin_sparseArray_foldsCorrectly() {
    test("x = [1, , 2].join(',')", "x = '1,,2'");
    test("x = [, ,].join(',')", "x = ',,'");
  }

  @Test
  public void testArrayJoin_partialFoldingWithDynamicNodes() {
    test("x = ['a', 'b', foo, 'c', 'd'].join(',')", "x = ['a,b', foo, 'c,d'].join(',')");
    test("x = [foo, 'b', 'c'].join(',')", "x = [foo, 'b,c'].join(',')");
    test("x = ['a', 'b', foo].join(',')", "x = ['a,b', foo].join(',')");
  }

  @Test
  public void testArrayJoin_noFoldingPossible_sameCode() {
    testSame("x = [foo, bar].join(',')");
    testSame("x = [foo].join(',')");
  }

  @Test
  public void testArrayJoin_nonArrayTarget_noChange() {
    testSame("x = y.join(',')");
    testSame("x = 'abc'.join(',')");
  }

  @Test
  public void testArrayJoin_nonJoinMethod_noChange() {
    testSame("x = [1, 2].pop()");
    testSame("x = [1, 2].slice(0)");
  }

  @Test
  public void testArrayJoin_nonImmutableSeparator_noChange() {
    testSame("x = ['a', 'b'].join(sep)");
  }

  // --- String.prototype.toLowerCase / toUpperCase Tests ---

  @Test
  public void testStringToLowerCase_validString_folds() {
    test("x = 'HELLO WORLD'.toLowerCase()", "x = 'hello world'");
    test("x = 'ABC'.toLowerCase()", "x = 'abc'");
    test("x = ''.toLowerCase()", "x = ''");
  }

  @Test
  public void testStringToUpperCase_validString_folds() {
    test("x = 'hello world'.toUpperCase()", "x = 'HELLO WORLD'");
    test("x = 'abc'.toUpperCase()", "x = 'ABC'");
    test("x = ''.toUpperCase()", "x = ''");
  }

  @Test
  public void testStringCaseChange_withArguments_noChange() {
    testSame("x = 'hello'.toUpperCase('extra')");
    testSame("x = 'HELLO'.toLowerCase('extra')");
  }

  @Test
  public void testStringCaseChange_nonStringTarget_noChange() {
    testSame("x = foo.toUpperCase()");
    testSame("x = (123).toUpperCase()");
  }

  // --- String.prototype.indexOf / lastIndexOf Tests ---

  @Test
  public void testStringIndexOf_singleArgument_folds() {
    test("x = 'abcdef'.indexOf('c')", "x = 2");
    test("x = 'abcdef'.indexOf('xyz')", "x = -1");
    test("x = 'abcdef'.indexOf('')", "x = 0");
  }

  @Test
  public void testStringIndexOf_withFromIndex_folds() {
    test("x = 'abcdefcd'.indexOf('cd', 3)", "x = 6");
    test("x = 'abcdefcd'.indexOf('cd', 7)", "x = -1");
  }

  @Test
  public void testStringIndexOf_invalidOrDynamicArgs_noChange() {
    testSame("x = 'abcdef'.indexOf(searchVar)");
    testSame("x = 'abcdef'.indexOf('cd', fromVar)");
    testSame("x = 'abcdef'.indexOf('cd', 1, 'extra')");
    testSame("x = strVar.indexOf('a')");
  }

  @Test
  public void testStringLastIndexOf_singleArgument_folds() {
    test("x = 'abcdefcd'.lastIndexOf('cd')", "x = 6");
    test("x = 'abcdef'.lastIndexOf('xyz')", "x = -1");
    test("x = 'abcdef'.lastIndexOf('a')", "x = 0");
  }

  @Test
  public void testStringLastIndexOf_withFromIndex_folds() {
    test("x = 'abcdefcd'.lastIndexOf('cd', 4)", "x = 2");
    test("x = 'abcdefcd'.lastIndexOf('cd', 1)", "x = -1");
  }

  @Test
  public void testStringLastIndexOf_invalidOrDynamicArgs_noChange() {
    testSame("x = 'abcdef'.lastIndexOf(searchVar)");
    testSame("x = 'abcdef'.lastIndexOf('cd', fromVar)");
    testSame("x = 'abcdef'.lastIndexOf('cd', 1, 'extra')");
  }

  // --- String.prototype.substr Tests ---

  @Test
  public void testStringSubstr_oneArg_folds() {
    test("x = 'abcdef'.substr(2)", "x = 'cdef'");
    test("x = 'abcdef'.substr(0)", "x = 'abcdef'");
    test("x = 'abcdef'.substr(6)", "x = ''");
  }

  @Test
  public void testStringSubstr_twoArgs_folds() {
    test("x = 'abcdef'.substr(2, 3)", "x = 'cde'");
    test("x = 'abcdef'.substr(0, 2)", "x = 'ab'");
    test("x = 'abcdef'.substr(1, 0)", "x = ''");
  }

  @Test
  public void testStringSubstr_outOfBoundsOrNegative_noChange() {
    testSame("x = 'abcdef'.substr(-1)");
    testSame("x = 'abcdef'.substr(2, -1)");
    testSame("x = 'abcdef'.substr(2, 10)");
    testSame("x = 'abcdef'.substr(7)");
  }

  @Test
  public void testStringSubstr_invalidArgs_noChange() {
    testSame("x = 'abcdef'.substr('a')");
    testSame("x = 'abcdef'.substr(1, 'b')");
    testSame("x = 'abcdef'.substr(1, 2, 3)");
    testSame("x = strVar.substr(1, 2)");
  }

  // --- String.prototype.substring Tests ---

  @Test
  public void testStringSubstring_oneArg_folds() {
    test("x = 'abcdef'.substring(2)", "x = 'cdef'");
    test("x = 'abcdef'.substring(0)", "x = 'abcdef'");
    test("x = 'abcdef'.substring(6)", "x = ''");
  }

  @Test
  public void testStringSubstring_twoArgs_folds() {
    test("x = 'abcdef'.substring(1, 4)", "x = 'bcd'");
    test("x = 'abcdef'.substring(0, 2)", "x = 'ab'");
    test("x = 'abcdef'.substring(3, 3)", "x = ''");
  }

  @Test
  public void testStringSubstring_outOfBoundsOrNegative_noChange() {
    testSame("x = 'abcdef'.substring(-1)");
    testSame("x = 'abcdef'.substring(1, -1)");
    testSame("x = 'abcdef'.substring(2, 10)");
    testSame("x = 'abcdef'.substring(7, 8)");
  }

  @Test
  public void testStringSubstring_invalidArgs_noChange() {
    testSame("x = 'abcdef'.substring('a')");
    testSame("x = 'abcdef'.substring(1, 'b')");
    testSame("x = 'abcdef'.substring(1, 2, 3)");
    testSame("x = strVar.substring(1, 2)");
  }

  // --- String.prototype.charAt Tests ---

  @Test
  public void testStringCharAt_validIndex_folds() {
    test("x = 'abcdef'.charAt(0)", "x = 'a'");
    test("x = 'abcdef'.charAt(2)", "x = 'c'");
    test("x = 'abcdef'.charAt(5)", "x = 'f'");
  }

  @Test
  public void testStringCharAt_outOfBoundsOrNegative_noChange() {
    testSame("x = 'abcdef'.charAt(-1)");
    testSame("x = 'abcdef'.charAt(6)");
    testSame("x = 'abcdef'.charAt(10)");
  }

  @Test
  public void testStringCharAt_invalidArgs_noChange() {
    testSame("x = 'abcdef'.charAt()");
    testSame("x = 'abcdef'.charAt('0')");
    testSame("x = 'abcdef'.charAt(1, 2)");
    testSame("x = strVar.charAt(0)");
  }

  // --- String.prototype.charCodeAt Tests ---

  @Test
  public void testStringCharCodeAt_validIndex_folds() {
    test("x = 'abcdef'.charCodeAt(0)", "x = 97");
    test("x = 'abcdef'.charCodeAt(2)", "x = 99");
    test("x = 'abcdef'.charCodeAt(5)", "x = 102");
  }

  @Test
  public void testStringCharCodeAt_outOfBoundsOrNegative_noChange() {
    testSame("x = 'abcdef'.charCodeAt(-1)");
    testSame("x = 'abcdef'.charCodeAt(6)");
    testSame("x = 'abcdef'.charCodeAt(10)");
  }

  @Test
  public void testStringCharCodeAt_invalidArgs_noChange() {
    testSame("x = 'abcdef'.charCodeAt()");
    testSame("x = 'abcdef'.charCodeAt('0')");
    testSame("x = 'abcdef'.charCodeAt(1, 2)");
    testSame("x = strVar.charCodeAt(0)");
  }

  // --- parseInt Tests ---

  @Test
  public void testParseInt_stringArgNoRadix_folds() {
    test("x = parseInt('123')", "x = 123");
    test("x = parseInt('  123  ')", "x = 123");
    test("x = parseInt('0')", "x = 0");
    test("x = parseInt('-123')", "x = -123");
  }

  @Test
  public void testParseInt_stringArgWithRadix_folds() {
    test("x = parseInt('123', 10)", "x = 123");
    test("x = parseInt('10', 16)", "x = 16");
    test("x = parseInt('ff', 16)", "x = 255");
    test("x = parseInt('11', 2)", "x = 3");
    test("x = parseInt('10', 8)", "x = 8");
    test("x = parseInt('z', 36)", "x = 35");
  }

  @Test
  public void testParseInt_hexPrefix_folds() {
    test("x = parseInt('0x10')", "x = 16");
    test("x = parseInt('0X10')", "x = 16");
    test("x = parseInt('0x10', 16)", "x = 16");
  }

  @Test
  public void testParseInt_octalPrefixInEs5_folds() {
    isEcmaScript5 = true;
    enableEcmaScript5(true);
    test("x = parseInt('010')", "x = 10");
    test("x = parseInt('08')", "x = 8");
  }

  @Test
  public void testParseInt_octalPrefixInEs3_noChange() {
    isEcmaScript5 = false;
    enableEcmaScript5(false);
    testSame("x = parseInt('010')");
  }

  @Test
  public void testParseInt_numberFirstArg_folds() {
    test("x = parseInt(123)", "x = 123");
    test("x = parseInt(123.45)", "x = 123");
    test("x = parseInt(123, 10)", "x = 123");
    test("x = parseInt(123, 16)", "x = 291");
  }

  @Test
  public void testParseInt_invalidRadix_noChange() {
    testSame("x = parseInt('123', -1)");
    testSame("x = parseInt('123', 0)");
    testSame("x = parseInt('123', 1)");
    testSame("x = parseInt('123', 37)");
    testSame("x = parseInt('123', 1.5)");
    testSame("x = parseInt('123', '10')");
  }

  @Test
  public void testParseInt_invalidOrExtraArgs_noChange() {
    testSame("x = parseInt()");
    testSame("x = parseInt('123', 10, 'extra')");
    testSame("x = parseInt(varName)");
    testSame("x = parseInt('not_a_number')");
    testSame("x = parseInt('123abc')");
  }

  @Test
  public void testParseInt_methodCallOnObject_noChange() {
    testSame("x = obj.parseInt('123')");
  }

  // --- parseFloat Tests ---

  @Test
  public void testParseFloat_stringArg_folds() {
    test("x = parseFloat('1.11')", "x = 1.11");
    test("x = parseFloat('  0.5  ')", "x = 0.5");
    test("x = parseFloat('123')", "x = 123");
    test("x = parseFloat('0')", "x = 0");
    test("x = parseFloat('-1.5')", "x = -1.5");
  }

  @Test
  public void testParseFloat_numberArg_folds() {
    test("x = parseFloat(1.11)", "x = 1.11");
    test("x = parseFloat(123)", "x = 123");
  }

  @Test
  public void testParseFloat_invalidOrExtraArgs_noChange() {
    testSame("x = parseFloat()");
    testSame("x = parseFloat('1.11', 10)");
    testSame("x = parseFloat(varName)");
    testSame("x = parseFloat('not_a_number')");
  }

  @Test
  public void testParseFloat_methodCallOnObject_noChange() {
    testSame("x = obj.parseFloat('1.11')");
  }

  // --- Known String Method Dispatch Edge Cases ---

  @Test
  public void testKnownStringMethods_unsupportedMethod_noChange() {
    testSame("x = 'hello'.trim()");
    testSame("x = 'hello'.slice(1)");
    testSame("x = 'hello'.split(',')");
  }

  @Test
  public void testKnownStringMethods_computedPropertyCall_noChange() {
    testSame("x = 'hello'['indexOf']('h')");
  }
}
