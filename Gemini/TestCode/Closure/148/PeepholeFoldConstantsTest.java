package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private PeepholeFoldConstants peephole;

  @Before
  public void setUp() {
    peephole = new PeepholeFoldConstants();
  }

  private Node wrapInExpr(Node n) {
    Node parent = new Node(Token.EXPR_RESULT, n);
    return n;
  }

  private Node wrapInBlock(Node n) {
    Node parent = new Node(Token.BLOCK, n);
    return n;
  }

  private Node wrapInParent(int parentToken, Node n) {
    Node parent = new Node(parentToken, n);
    return n;
  }

  @Test
  public void testOptimizeSubtree_typeofString_foldsToString() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, Node.newString("hello")));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("string", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofNumber_foldsToNumber() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, Node.newNumber(42.0)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("number", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofBooleanTrue_foldsToBoolean() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, new Node(Token.TRUE)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("boolean", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofBooleanFalse_foldsToBoolean() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, new Node(Token.FALSE)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("boolean", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofNull_foldsToObject() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, new Node(Token.NULL)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("object", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofObjectLit_foldsToObject() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, new Node(Token.OBJECTLIT)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("object", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofArrayLit_foldsToObject() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, new Node(Token.ARRAYLIT)));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("object", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofUndefinedName_foldsToUndefined() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, Node.newString(Token.NAME, "undefined")));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("undefined", result.getString());
  }

  @Test
  public void testOptimizeSubtree_typeofNonLiteral_noFold() {
    Node typeofNode = wrapInBlock(new Node(Token.TYPEOF, Node.newString(Token.NAME, "foo")));
    Node result = peephole.optimizeSubtree(typeofNode);
    Assert.assertEquals(Token.TYPEOF, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryNot_insideExpression_dropsOperator() {
    Node notNode = wrapInExpr(new Node(Token.NOT, new Node(Token.TRUE)));
    Node result = peephole.optimizeSubtree(notNode);
    Assert.assertNull(result);
  }

  @Test
  public void testOptimizeSubtree_unaryNot_foldsTrueToFalse() {
    Node notNode = wrapInBlock(new Node(Token.NOT, new Node(Token.TRUE)));
    Node result = peephole.optimizeSubtree(notNode);
    Assert.assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryNot_foldsFalseToTrue() {
    Node notNode = wrapInBlock(new Node(Token.NOT, new Node(Token.FALSE)));
    Node result = peephole.optimizeSubtree(notNode);
    Assert.assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryNeg_number_foldsToNegatedNumber() {
    Node negNode = wrapInBlock(new Node(Token.NEG, Node.newNumber(5.0)));
    Node result = peephole.optimizeSubtree(negNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(-5.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_unaryNeg_infinity_noFold() {
    Node negNode = wrapInBlock(new Node(Token.NEG, Node.newString(Token.NAME, "Infinity")));
    Node result = peephole.optimizeSubtree(negNode);
    Assert.assertEquals(Token.NEG, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryNeg_NaN_foldsToNaN() {
    Node negNode = wrapInBlock(new Node(Token.NEG, Node.newString(Token.NAME, "NaN")));
    Node result = peephole.optimizeSubtree(negNode);
    Assert.assertEquals(Token.NAME, result.getType());
    Assert.assertEquals("NaN", result.getString());
  }

  @Test
  public void testOptimizeSubtree_unaryNeg_nonNumber_noFold() {
    Node negNode = wrapInBlock(new Node(Token.NEG, Node.newString("abc")));
    Node result = peephole.optimizeSubtree(negNode);
    Assert.assertEquals(Token.NEG, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryBitNot_validInteger_foldsBitwiseNot() {
    Node bitnotNode = wrapInBlock(new Node(Token.BITNOT, Node.newNumber(0.0)));
    Node result = peephole.optimizeSubtree(bitnotNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(~0, (int) result.getDouble());
  }

  @Test
  public void testOptimizeSubtree_unaryBitNot_fractional_noFold() {
    Node bitnotNode = wrapInBlock(new Node(Token.BITNOT, Node.newNumber(1.5)));
    Node result = peephole.optimizeSubtree(bitnotNode);
    Assert.assertEquals(Token.BITNOT, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryBitNot_outOfRange_noFold() {
    Node bitnotNode = wrapInBlock(new Node(Token.BITNOT, Node.newNumber(1e15)));
    Node result = peephole.optimizeSubtree(bitnotNode);
    Assert.assertEquals(Token.BITNOT, result.getType());
  }

  @Test
  public void testOptimizeSubtree_unaryBitNot_nonNumber_noFold() {
    Node bitnotNode = wrapInBlock(new Node(Token.BITNOT, Node.newString("str")));
    Node result = peephole.optimizeSubtree(bitnotNode);
    Assert.assertEquals(Token.BITNOT, result.getType());
  }

  @Test
  public void testOptimizeSubtree_binaryWithoutChildren_noFold() {
    Node addNode = wrapInBlock(new Node(Token.ADD));
    Node result = peephole.optimizeSubtree(addNode);
    Assert.assertEquals(Token.ADD, result.getType());

    Node addOneChild = wrapInBlock(new Node(Token.ADD, Node.newNumber(1.0)));
    Node resultOne = peephole.optimizeSubtree(addOneChild);
    Assert.assertEquals(Token.ADD, resultOne.getType());
  }

  @Test
  public void testOptimizeSubtree_arithmeticAddNumbers_foldsSum() {
    Node addNode = wrapInBlock(new Node(Token.ADD, Node.newNumber(5.0), Node.newNumber(7.0)));
    Node result = peephole.optimizeSubtree(addNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(12.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_addStrings_foldsConcatenation() {
    Node addNode = wrapInBlock(new Node(Token.ADD, Node.newString("foo"), Node.newString("bar")));
    Node result = peephole.optimizeSubtree(addNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("foobar", result.getString());
  }

  @Test
  public void testOptimizeSubtree_addStringAndNumber_foldsConcatenation() {
    Node addNode = wrapInBlock(new Node(Token.ADD, Node.newString("foo"), Node.newNumber(3.0)));
    Node result = peephole.optimizeSubtree(addNode);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("foo3", result.getString());
  }

  @Test
  public void testOptimizeSubtree_leftChildAdd_foldsNestedStringAdd() {
    Node leftAdd = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newString("a"));
    Node rootAdd = wrapInBlock(new Node(Token.ADD, leftAdd, Node.newString("b")));
    Node result = peephole.optimizeSubtree(rootAdd);
    Assert.assertEquals(Token.ADD, result.getType());
    Assert.assertEquals("ab", result.getLastChild().getString());
  }

  @Test
  public void testOptimizeSubtree_arithmeticSub_foldsDifference() {
    Node subNode = wrapInBlock(new Node(Token.SUB, Node.newNumber(10.0), Node.newNumber(4.0)));
    Node result = peephole.optimizeSubtree(subNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(6.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_arithmeticMul_foldsProduct() {
    Node mulNode = wrapInBlock(new Node(Token.MUL, Node.newNumber(3.0), Node.newNumber(4.0)));
    Node result = peephole.optimizeSubtree(mulNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(12.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_arithmeticDiv_foldsQuotient() {
    Node divNode = wrapInBlock(new Node(Token.DIV, Node.newNumber(12.0), Node.newNumber(3.0)));
    Node result = peephole.optimizeSubtree(divNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(4.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_arithmeticDivByZero_noFold() {
    Node divNode = wrapInBlock(new Node(Token.DIV, Node.newNumber(12.0), Node.newNumber(0.0)));
    Node result = peephole.optimizeSubtree(divNode);
    Assert.assertEquals(Token.DIV, result.getType());
  }

  @Test
  public void testOptimizeSubtree_bitAnd_validIntegers_foldsBitAnd() {
    Node bitAndNode = wrapInBlock(new Node(Token.BITAND, Node.newNumber(6.0), Node.newNumber(3.0)));
    Node result = peephole.optimizeSubtree(bitAndNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(2.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_bitOr_validIntegers_foldsBitOr() {
    Node bitOrNode = wrapInBlock(new Node(Token.BITOR, Node.newNumber(4.0), Node.newNumber(1.0)));
    Node result = peephole.optimizeSubtree(bitOrNode);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(5.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_bitAnd_fractionalOrOutOfRange_noFold() {
    Node bitAndFractional = wrapInBlock(new Node(Token.BITAND, Node.newNumber(1.5), Node.newNumber(2.0)));
    Assert.assertEquals(Token.BITAND, peephole.optimizeSubtree(bitAndFractional).getType());

    Node bitAndOutOfRange = wrapInBlock(new Node(Token.BITAND, Node.newNumber(1e15), Node.newNumber(2.0)));
    Assert.assertEquals(Token.BITAND, peephole.optimizeSubtree(bitAndOutOfRange).getType());
  }

  @Test
  public void testOptimizeSubtree_shift_lsh_foldsShift() {
    Node lsh = wrapInBlock(new Node(Token.LSH, Node.newNumber(1.0), Node.newNumber(3.0)));
    Node result = peephole.optimizeSubtree(lsh);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(8.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_shift_rsh_foldsShift() {
    Node rsh = wrapInBlock(new Node(Token.RSH, Node.newNumber(16.0), Node.newNumber(2.0)));
    Node result = peephole.optimizeSubtree(rsh);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(4.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_shift_ursh_foldsShift() {
    Node ursh = wrapInBlock(new Node(Token.URSH, Node.newNumber(-1.0), Node.newNumber(0.0)));
    Node result = peephole.optimizeSubtree(ursh);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(4294967295.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_shift_invalidBounds_noFold() {
    Node outOfRange = wrapInBlock(new Node(Token.LSH, Node.newNumber(1e15), Node.newNumber(2.0)));
    Assert.assertEquals(Token.LSH, peephole.optimizeSubtree(outOfRange).getType());

    Node shiftNeg = wrapInBlock(new Node(Token.LSH, Node.newNumber(1.0), Node.newNumber(-1.0)));
    Assert.assertEquals(Token.LSH, peephole.optimizeSubtree(shiftNeg).getType());

    Node shiftFraction = wrapInBlock(new Node(Token.LSH, Node.newNumber(1.5), Node.newNumber(2.0)));
    Assert.assertEquals(Token.LSH, peephole.optimizeSubtree(shiftFraction).getType());
  }

  @Test
  public void testOptimizeSubtree_assign_transformsCompoundAssign() {
    Node target = Node.newString(Token.NAME, "x");
    Node rhs = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newNumber(5.0));
    Node assignNode = wrapInBlock(new Node(Token.ASSIGN, target, rhs));
    Node result = peephole.optimizeSubtree(assignNode);
    Assert.assertEquals(Token.ASSIGN_ADD, result.getType());
  }

  @Test
  public void testOptimizeSubtree_assign_otherOperators() {
    int[][] ops = {
        {Token.BITAND, Token.ASSIGN_BITAND},
        {Token.BITOR, Token.ASSIGN_BITOR},
        {Token.BITXOR, Token.ASSIGN_BITXOR},
        {Token.DIV, Token.ASSIGN_DIV},
        {Token.LSH, Token.ASSIGN_LSH},
        {Token.MOD, Token.ASSIGN_MOD},
        {Token.MUL, Token.ASSIGN_MUL},
        {Token.RSH, Token.ASSIGN_RSH},
        {Token.SUB, Token.ASSIGN_SUB},
        {Token.URSH, Token.ASSIGN_URSH}
    };
    for (int[] opPair : ops) {
      Node target = Node.newString(Token.NAME, "x");
      Node rhs = new Node(opPair[0], Node.newString(Token.NAME, "x"), Node.newNumber(1.0));
      Node assignNode = wrapInBlock(new Node(Token.ASSIGN, target, rhs));
      Node result = peephole.optimizeSubtree(assignNode);
      Assert.assertEquals(opPair[1], result.getType());
    }
  }

  @Test
  public void testOptimizeSubtree_andOr_leftValueKnown() {
    Node orTrue = wrapInBlock(new Node(Token.OR, new Node(Token.TRUE), Node.newString(Token.NAME, "x")));
    Node resOrTrue = peephole.optimizeSubtree(orTrue);
    Assert.assertEquals(Token.TRUE, resOrTrue.getType());

    Node andFalse = wrapInBlock(new Node(Token.AND, new Node(Token.FALSE), Node.newString(Token.NAME, "x")));
    Node resAndFalse = peephole.optimizeSubtree(andFalse);
    Assert.assertEquals(Token.FALSE, resAndFalse.getType());

    Node orFalse = wrapInBlock(new Node(Token.OR, new Node(Token.FALSE), Node.newString(Token.NAME, "x")));
    Node resOrFalse = peephole.optimizeSubtree(orFalse);
    Assert.assertEquals(Token.NAME, resOrFalse.getType());

    Node andTrue = wrapInBlock(new Node(Token.AND, new Node(Token.TRUE), Node.newString(Token.NAME, "x")));
    Node resAndTrue = peephole.optimizeSubtree(andTrue);
    Assert.assertEquals(Token.NAME, resAndTrue.getType());
  }

  @Test
  public void testOptimizeSubtree_andOr_rightValueKnownInCondition() {
    Node orFalse = wrapInParent(Token.IF, new Node(Token.OR, Node.newString(Token.NAME, "x"), new Node(Token.FALSE)));
    Node resOrFalse = peephole.optimizeSubtree(orFalse);
    Assert.assertEquals(Token.NAME, resOrFalse.getType());

    Node andTrue = wrapInParent(Token.IF, new Node(Token.AND, Node.newString(Token.NAME, "x"), new Node(Token.TRUE)));
    Node resAndTrue = peephole.optimizeSubtree(andTrue);
    Assert.assertEquals(Token.NAME, resAndTrue.getType());

    Node orTrue = wrapInParent(Token.IF, new Node(Token.OR, Node.newString(Token.NAME, "x"), new Node(Token.TRUE)));
    Node resOrTrue = peephole.optimizeSubtree(orTrue);
    Assert.assertEquals(Token.TRUE, resOrTrue.getType());

    Node andFalse = wrapInParent(Token.IF, new Node(Token.AND, Node.newString(Token.NAME, "x"), new Node(Token.FALSE)));
    Node resAndFalse = peephole.optimizeSubtree(andFalse);
    Assert.assertEquals(Token.FALSE, resAndFalse.getType());
  }

  @Test
  public void testOptimizeSubtree_instanceof_folding() {
    Node instImmutable = wrapInBlock(new Node(Token.INSTANCEOF, Node.newString("abc"), Node.newString(Token.NAME, "Object")));
    Node resImmutable = peephole.optimizeSubtree(instImmutable);
    Assert.assertEquals(Token.FALSE, resImmutable.getType());

    Node instObj = wrapInBlock(new Node(Token.INSTANCEOF, new Node(Token.ARRAYLIT), Node.newString(Token.NAME, "Object")));
    Node resObj = peephole.optimizeSubtree(instObj);
    Assert.assertEquals(Token.TRUE, resObj.getType());
  }

  @Test
  public void testOptimizeSubtree_comparison_numbers() {
    int[] ops = {Token.EQ, Token.NE, Token.LE, Token.LT, Token.GE, Token.GT, Token.SHEQ, Token.SHNE};
    boolean[] expected = {false, true, true, true, false, false, false, true};
    for (int i = 0; i < ops.length; i++) {
      Node comp = wrapInBlock(new Node(ops[i], Node.newNumber(1.0), Node.newNumber(2.0)));
      Node res = peephole.optimizeSubtree(comp);
      Assert.assertEquals(expected[i] ? Token.TRUE : Token.FALSE, res.getType());
    }
  }

  @Test
  public void testOptimizeSubtree_comparison_strings() {
    Node eq = wrapInBlock(new Node(Token.EQ, Node.newString("a"), Node.newString("a")));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(eq).getType());

    Node ne = wrapInBlock(new Node(Token.NE, Node.newString("a"), Node.newString("b")));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(ne).getType());

    Node sheq = wrapInBlock(new Node(Token.SHEQ, Node.newString("a"), Node.newString("a")));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(sheq).getType());

    Node shne = wrapInBlock(new Node(Token.SHNE, Node.newString("a"), Node.newString("b")));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(shne).getType());
  }

  @Test
  public void testOptimizeSubtree_comparison_undefinedAndNull() {
    Node voidNode = new Node(Token.VOID, Node.newNumber(0.0));
    Node eqVoidNull = wrapInBlock(new Node(Token.EQ, voidNode, new Node(Token.NULL)));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(eqVoidNull).getType());

    Node nullEqUndef = wrapInBlock(new Node(Token.EQ, new Node(Token.NULL), Node.newString(Token.NAME, "undefined")));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(nullEqUndef).getType());

    Node nameUndefEqNull = wrapInBlock(new Node(Token.EQ, Node.newString(Token.NAME, "undefined"), new Node(Token.NULL)));
    Assert.assertEquals(Token.TRUE, peephole.optimizeSubtree(nameUndefEqNull).getType());
  }

  @Test
  public void testOptimizeSubtree_comparison_identicalNames() {
    Node lt = wrapInBlock(new Node(Token.LT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x")));
    Assert.assertEquals(Token.FALSE, peephole.optimizeSubtree(lt).getType());

    Node gt = wrapInBlock(new Node(Token.GT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x")));
    Assert.assertEquals(Token.FALSE, peephole.optimizeSubtree(gt).getType());
  }

  @Test
  public void testOptimizeSubtree_getElem_validIndex_foldsElement() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getElem = wrapInBlock(new Node(Token.GETELEM, array, Node.newNumber(1.0)));
    Node result = peephole.optimizeSubtree(getElem);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("b", result.getString());
  }

  @Test
  public void testOptimizeSubtree_getElem_invalidIndex_noFold() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node nonInt = wrapInBlock(new Node(Token.GETELEM, array, Node.newNumber(1.5)));
    Assert.assertEquals(Token.GETELEM, peephole.optimizeSubtree(nonInt).getType());

    Node negIndex = wrapInBlock(new Node(Token.GETELEM, array, Node.newNumber(-1.0)));
    Assert.assertEquals(Token.GETELEM, peephole.optimizeSubtree(negIndex).getType());

    Node outOfBounds = wrapInBlock(new Node(Token.GETELEM, array, Node.newNumber(5.0)));
    Assert.assertEquals(Token.GETELEM, peephole.optimizeSubtree(outOfBounds).getType());
  }

  @Test
  public void testOptimizeSubtree_getProp_arrayLength_foldsLength() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0), Node.newNumber(3.0));
    Node getProp = wrapInBlock(new Node(Token.GETPROP, array, Node.newString("length")));
    Node result = peephole.optimizeSubtree(getProp);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(3.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_getProp_stringLength_foldsLength() {
    Node strNode = Node.newString("closure");
    Node getProp = wrapInBlock(new Node(Token.GETPROP, strNode, Node.newString("length")));
    Node result = peephole.optimizeSubtree(getProp);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(7.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_call_arrayJoin_foldsToString() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("foo"), Node.newString("bar"));
    Node getProp = new Node(Token.GETPROP, array, Node.newString("join"));
    Node call = wrapInBlock(new Node(Token.CALL, getProp, Node.newString(",")));
    Node result = peephole.optimizeSubtree(call);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("foo,bar", result.getString());
  }

  @Test
  public void testOptimizeSubtree_call_emptyArrayJoin_foldsToEmptyString() {
    Node array = new Node(Token.ARRAYLIT);
    Node getProp = new Node(Token.GETPROP, array, Node.newString("join"));
    Node call = wrapInBlock(new Node(Token.CALL, getProp, Node.newString(",")));
    Node result = peephole.optimizeSubtree(call);
    Assert.assertEquals(Token.STRING, result.getType());
    Assert.assertEquals("", result.getString());
  }

  @Test
  public void testOptimizeSubtree_call_stringIndexOf_foldsToIndex() {
    Node getProp = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("indexOf"));
    Node call = wrapInBlock(new Node(Token.CALL, getProp, Node.newString("cd")));
    Node result = peephole.optimizeSubtree(call);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(2.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_call_stringLastIndexOf_foldsToIndex() {
    Node getProp = new Node(Token.GETPROP, Node.newString("abcdefbc"), Node.newString("lastIndexOf"));
    Node call = wrapInBlock(new Node(Token.CALL, getProp, Node.newString("bc"), Node.newNumber(4.0)));
    Node result = peephole.optimizeSubtree(call);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(1.0, result.getDouble(), 0.0);
  }

  @Test
  public void testOptimizeSubtree_call_unknownMethod_noFold() {
    Node getProp = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("slice"));
    Node call = wrapInBlock(new Node(Token.CALL, getProp, Node.newNumber(1.0)));
    Node result = peephole.optimizeSubtree(call);
    Assert.assertEquals(Token.CALL, result.getType());
  }
}
