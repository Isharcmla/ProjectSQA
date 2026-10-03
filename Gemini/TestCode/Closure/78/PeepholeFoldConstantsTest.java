package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private Compiler compiler;
  private PeepholeFoldConstants peephole;

  @Before
  public void setUp() {
    compiler = new Compiler();
    peephole = new PeepholeFoldConstants();
    peephole.beginTraversal(compiler);
  }

  private Node fold(Node n) {
    Node parent = new Node(Token.EXPR_RESULT, n);
    return peephole.optimizeSubtree(n);
  }

  @Test
  public void testOptimizeSubtree_nullOrSingleChildBinaryOp_returnsUnchanged() {
    Node addNoChild = new Node(Token.ADD);
    Assert.assertSame(addNoChild, fold(addNoChild));

    Node addOneChild = new Node(Token.ADD, Node.newNumber(1.0));
    Assert.assertSame(addOneChild, fold(addOneChild));
  }

  @Test
  public void testTryReduceVoid_variousOperands() {
    Node void0 = new Node(Token.VOID, Node.newNumber(0.0));
    Node res0 = fold(void0);
    Assert.assertEquals(Token.VOID, res0.getType());
    Assert.assertEquals(0.0, res0.getFirstChild().getDouble(), 0.0);

    Node voidStr = new Node(Token.VOID, Node.newString("hello"));
    Node resStr = fold(voidStr);
    Assert.assertEquals(Token.VOID, resStr.getType());
    Assert.assertEquals(Token.NUMBER, resStr.getFirstChild().getType());
    Assert.assertEquals(0.0, resStr.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testTryFoldTypeof_allLiteralTypes() {
    Node typeofStr = fold(new Node(Token.TYPEOF, Node.newString("abc")));
    Assert.assertEquals("string", typeofStr.getString());

    Node typeofNum = fold(new Node(Token.TYPEOF, Node.newNumber(123)));
    Assert.assertEquals("number", typeofNum.getString());

    Node typeofTrue = fold(new Node(Token.TYPEOF, new Node(Token.TRUE)));
    Assert.assertEquals("boolean", typeofTrue.getString());

    Node typeofFalse = fold(new Node(Token.TYPEOF, new Node(Token.FALSE)));
    Assert.assertEquals("boolean", typeofFalse.getString());

    Node typeofNull = fold(new Node(Token.TYPEOF, new Node(Token.NULL)));
    Assert.assertEquals("object", typeofNull.getString());

    Node typeofObj = fold(new Node(Token.TYPEOF, new Node(Token.OBJECTLIT)));
    Assert.assertEquals("object", typeofObj.getString());

    Node typeofArr = fold(new Node(Token.TYPEOF, new Node(Token.ARRAYLIT)));
    Assert.assertEquals("object", typeofArr.getString());

    Node typeofVoid = fold(new Node(Token.TYPEOF, new Node(Token.VOID, Node.newNumber(0))));
    Assert.assertEquals("undefined", typeofVoid.getString());

    Node typeofUndefName = fold(new Node(Token.TYPEOF, Node.newString(Token.NAME, "undefined")));
    Assert.assertEquals("undefined", typeofUndefName.getString());

    Node typeofFunc = fold(new Node(Token.TYPEOF, new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK))));
    Assert.assertEquals("function", typeofFunc.getString());

    Node typeofVar = new Node(Token.TYPEOF, Node.newString(Token.NAME, "otherVar"));
    Node resVar = fold(typeofVar);
    Assert.assertEquals(Token.TYPEOF, resVar.getType());
  }

  @Test
  public void testTryFoldUnaryOperator_not() {
    Node notTrue = fold(new Node(Token.NOT, new Node(Token.TRUE)));
    Assert.assertEquals(Token.FALSE, notTrue.getType());

    Node notFalse = fold(new Node(Token.NOT, new Node(Token.FALSE)));
    Assert.assertEquals(Token.TRUE, notFalse.getType());

    Node not0 = new Node(Token.NOT, Node.newNumber(0));
    Assert.assertSame(not0, fold(not0));

    Node not1 = new Node(Token.NOT, Node.newNumber(1));
    Assert.assertSame(not1, fold(not1));

    Node not2 = fold(new Node(Token.NOT, Node.newNumber(2)));
    Assert.assertEquals(Token.FALSE, not2.getType());
  }

  @Test
  public void testTryFoldUnaryOperator_pos() {
    Node posNum = fold(new Node(Token.POS, Node.newNumber(5.0)));
    Assert.assertEquals(5.0, posNum.getDouble(), 0.0);

    Node posStr = new Node(Token.POS, Node.newString("notNumeric"));
    Node res = fold(posStr);
    Assert.assertEquals(Token.POS, res.getType());
  }

  @Test
  public void testTryFoldUnaryOperator_neg() {
    Node negNum = fold(new Node(Token.NEG, Node.newNumber(5.0)));
    Assert.assertEquals(-5.0, negNum.getDouble(), 0.0);

    Node negInfinity = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    Assert.assertSame(negInfinity, fold(negInfinity));

    Node negNaN = fold(new Node(Token.NEG, Node.newString(Token.NAME, "NaN")));
    Assert.assertEquals(Token.NAME, negNaN.getType());
    Assert.assertEquals("NaN", negNaN.getString());

    Node negObj = new Node(Token.NEG, new Node(Token.OBJECTLIT));
    Node resObj = fold(negObj);
    Assert.assertEquals(Token.NEG, resObj.getType());
  }

  @Test
  public void testTryFoldUnaryOperator_bitnot() {
    Node bitnot = fold(new Node(Token.BITNOT, Node.newNumber(0.0)));
    Assert.assertEquals(~0, (int) bitnot.getDouble());

    Node fracBitnot = new Node(Token.BITNOT, Node.newNumber(1.5));
    Assert.assertSame(fracBitnot, fold(fracBitnot));

    Node largeBitnot = new Node(Token.BITNOT, Node.newNumber(1e15));
    Assert.assertSame(largeBitnot, fold(largeBitnot));

    Node bitnotStr = new Node(Token.BITNOT, Node.newString("xyz"));
    Assert.assertSame(bitnotStr, fold(bitnotStr));
  }

  @Test
  public void testTryFoldInstanceof() {
    Node inst1 = fold(new Node(Token.INSTANCEOF, Node.newNumber(123), Node.newString(Token.NAME, "Object")));
    Assert.assertEquals(Token.FALSE, inst1.getType());

    Node inst2 = fold(new Node(Token.INSTANCEOF, new Node(Token.OBJECTLIT), Node.newString(Token.NAME, "Object")));
    Assert.assertEquals(Token.TRUE, inst2.getType());

    Node inst3 = new Node(Token.INSTANCEOF, new Node(Token.OBJECTLIT), Node.newString(Token.NAME, "CustomType"));
    Assert.assertSame(inst3, fold(inst3));
  }

  @Test
  public void testTryFoldAssign() {
    Node assignAdd = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Node resAdd = fold(assignAdd);
    Assert.assertEquals(Token.ASSIGN_ADD, resAdd.getType());

    Node assignComm = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.MUL, Node.newNumber(2), Node.newString(Token.NAME, "x")));
    Node resComm = fold(assignComm);
    Assert.assertEquals(Token.ASSIGN_MUL, resComm.getType());

    Node assignSub = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.SUB, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_SUB, fold(assignSub).getType());

    Node assignBitAnd = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.BITAND, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_BITAND, fold(assignBitAnd).getType());

    Node assignBitOr = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.BITOR, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_BITOR, fold(assignBitOr).getType());

    Node assignBitXor = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.BITXOR, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_BITXOR, fold(assignBitXor).getType());

    Node assignDiv = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.DIV, Node.newString(Token.NAME, "x"), Node.newNumber(2)));
    Assert.assertEquals(Token.ASSIGN_DIV, fold(assignDiv).getType());

    Node assignMod = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.MOD, Node.newString(Token.NAME, "x"), Node.newNumber(2)));
    Assert.assertEquals(Token.ASSIGN_MOD, fold(assignMod).getType());

    Node assignLsh = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.LSH, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_LSH, fold(assignLsh).getType());

    Node assignRsh = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.RSH, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_RSH, fold(assignRsh).getType());

    Node assignUrsh = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.URSH, Node.newString(Token.NAME, "x"), Node.newNumber(1)));
    Assert.assertEquals(Token.ASSIGN_URSH, fold(assignUrsh).getType());

    Node noFold = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.SUB, Node.newNumber(1), Node.newString(Token.NAME, "y")));
    Assert.assertSame(noFold, fold(noFold));
  }

  @Test
  public void testTryFoldAndOr() {
    Node andTrue = fold(new Node(Token.AND, new Node(Token.TRUE), Node.newString(Token.NAME, "y")));
    Assert.assertEquals(Token.NAME, andTrue.getType());
    Assert.assertEquals("y", andTrue.getString());

    Node andFalse = fold(new Node(Token.AND, new Node(Token.FALSE), Node.newString(Token.NAME, "y")));
    Assert.assertEquals(Token.FALSE, andFalse.getType());

    Node orTrue = fold(new Node(Token.OR, new Node(Token.TRUE), Node.newString(Token.NAME, "y")));
    Assert.assertEquals(Token.TRUE, orTrue.getType());

    Node orFalse = fold(new Node(Token.OR, new Node(Token.FALSE), Node.newString(Token.NAME, "y")));
    Assert.assertEquals(Token.NAME, orFalse.getType());
    Assert.assertEquals("y", orFalse.getString());
  }

  @Test
  public void testTryFoldAdd_stringAndNumbers() {
    Node addStrs = fold(new Node(Token.ADD, Node.newString("a"), Node.newString("b")));
    Assert.assertEquals("ab", addStrs.getString());

    Node addStrNum = fold(new Node(Token.ADD, Node.newString("a"), Node.newNumber(1)));
    Assert.assertEquals("a1", addStrNum.getString());

    Node addNums = fold(new Node(Token.ADD, Node.newNumber(10), Node.newNumber(20)));
    Assert.assertEquals(30.0, addNums.getDouble(), 0.0);

    Node nestedLeftAdd = fold(new Node(Token.ADD,
        new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newString("a")),
        Node.newString("b")));
    Assert.assertEquals(Token.ADD, nestedLeftAdd.getType());
    Assert.assertEquals("ab", nestedLeftAdd.getLastChild().getString());

    Node nestedRightAdd = fold(new Node(Token.ADD,
        Node.newString("a"),
        new Node(Token.ADD, Node.newString("b"), Node.newString(Token.NAME, "x"))));
    Assert.assertEquals(Token.ADD, nestedRightAdd.getType());
    Assert.assertEquals("ab", nestedRightAdd.getFirstChild().getString());
  }

  @Test
  public void testTryFoldArithmeticOp_allOperations() {
    Assert.assertEquals(7.0, fold(new Node(Token.SUB, Node.newNumber(10), Node.newNumber(3))).getDouble(), 0.0);
    Assert.assertEquals(30.0, fold(new Node(Token.MUL, Node.newNumber(10), Node.newNumber(3))).getDouble(), 0.0);
    Assert.assertEquals(5.0, fold(new Node(Token.DIV, Node.newNumber(10), Node.newNumber(2))).getDouble(), 0.0);
    Assert.assertEquals(1.0, fold(new Node(Token.MOD, Node.newNumber(10), Node.newNumber(3))).getDouble(), 0.0);
    Assert.assertEquals(2.0, fold(new Node(Token.BITAND, Node.newNumber(6), Node.newNumber(3))).getDouble(), 0.0);
    Assert.assertEquals(7.0, fold(new Node(Token.BITOR, Node.newNumber(6), Node.newNumber(3))).getDouble(), 0.0);
    Assert.assertEquals(5.0, fold(new Node(Token.BITXOR, Node.newNumber(6), Node.newNumber(3))).getDouble(), 0.0);

    Node divZero = new Node(Token.DIV, Node.newNumber(10), Node.newNumber(0));
    Assert.assertSame(divZero, fold(divZero));

    Node modZero = new Node(Token.MOD, Node.newNumber(10), Node.newNumber(0));
    Assert.assertSame(modZero, fold(modZero));
  }

  @Test
  public void testTryFoldLeftChildOp_associative() {
    Node mulLeft = fold(new Node(Token.MUL,
        new Node(Token.MUL, Node.newString(Token.NAME, "x"), Node.newNumber(2)),
        Node.newNumber(3)));
    Assert.assertEquals(Token.MUL, mulLeft.getType());
    Assert.assertEquals(6.0, mulLeft.getLastChild().getDouble(), 0.0);

    Node mulLeftFirst = fold(new Node(Token.MUL,
        new Node(Token.MUL, Node.newNumber(2), Node.newString(Token.NAME, "x")),
        Node.newNumber(3)));
    Assert.assertEquals(Token.MUL, mulLeftFirst.getType());
    Assert.assertEquals(6.0, mulLeftFirst.getLastChild().getDouble(), 0.0);
  }

  @Test
  public void testTryFoldShift_allShiftTypes() {
    Assert.assertEquals(4.0, fold(new Node(Token.LSH, Node.newNumber(1), Node.newNumber(2))).getDouble(), 0.0);
    Assert.assertEquals(2.0, fold(new Node(Token.RSH, Node.newNumber(8), Node.newNumber(2))).getDouble(), 0.0);
    Assert.assertEquals(2.0, fold(new Node(Token.URSH, Node.newNumber(8), Node.newNumber(2))).getDouble(), 0.0);

    Node outOfRangeShift = new Node(Token.LSH, Node.newNumber(1e15), Node.newNumber(2));
    Assert.assertSame(outOfRangeShift, fold(outOfRangeShift));

    Node badShiftAmount = new Node(Token.LSH, Node.newNumber(1), Node.newNumber(35));
    Assert.assertSame(badShiftAmount, fold(badShiftAmount));

    Node fracLsh = new Node(Token.LSH, Node.newNumber(1.5), Node.newNumber(2));
    Assert.assertSame(fracLsh, fold(fracLsh));

    Node fracRsh = new Node(Token.LSH, Node.newNumber(1), Node.newNumber(2.5));
    Assert.assertSame(fracRsh, fold(fracRsh));
  }

  @Test
  public void testTryFoldComparison_variousTypes() {
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, Node.newNumber(5), Node.newNumber(5))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.EQ, Node.newNumber(5), Node.newNumber(6))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.NE, Node.newNumber(5), Node.newNumber(6))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.LT, Node.newNumber(3), Node.newNumber(5))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.LE, Node.newNumber(5), Node.newNumber(5))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.GT, Node.newNumber(6), Node.newNumber(5))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.GE, Node.newNumber(5), Node.newNumber(5))).getType());

    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, Node.newString("a"), Node.newString("a"))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.EQ, Node.newString("a"), Node.newString("b"))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.NE, Node.newString("a"), Node.newString("b"))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.SHEQ, Node.newString("a"), Node.newString("a"))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.SHNE, Node.newString("a"), Node.newString("b"))).getType());

    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.TRUE), new Node(Token.TRUE))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.EQ, new Node(Token.TRUE), new Node(Token.FALSE))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.NE, new Node(Token.TRUE), new Node(Token.NULL))).getType());

    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.THIS), new Node(Token.THIS))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.NE, new Node(Token.THIS), new Node(Token.THIS))).getType());

    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.NULL), Node.newString(Token.NAME, "undefined"))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.SHEQ, new Node(Token.NULL), Node.newString(Token.NAME, "undefined"))).getType());
    Assert.assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.VOID, Node.newNumber(0)), Node.newString(Token.NAME, "undefined"))).getType());

    Assert.assertEquals(Token.FALSE, fold(new Node(Token.LT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x"))).getType());
    Assert.assertEquals(Token.FALSE, fold(new Node(Token.GT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x"))).getType());
  }

  @Test
  public void testTryFoldCtorCall_inForcedStringContext() {
    Node newStr = new Node(Token.NEW, Node.newString(Token.NAME, "String"), Node.newString("hello"));
    Node getElem = new Node(Token.GETELEM, Node.newString(Token.NAME, "obj"), newStr);
    Node expr = new Node(Token.EXPR_RESULT, getElem);
    Node res = peephole.optimizeSubtree(newStr);
    Assert.assertEquals(Token.STRING, res.getType());
    Assert.assertEquals("hello", res.getString());

    Node newStrEmpty = new Node(Token.NEW, Node.newString(Token.NAME, "String"));
    Node getElemEmpty = new Node(Token.GETELEM, Node.newString(Token.NAME, "obj"), newStrEmpty);
    Node exprEmpty = new Node(Token.EXPR_RESULT, getElemEmpty);
    Node resEmpty = peephole.optimizeSubtree(newStrEmpty);
    Assert.assertEquals(Token.STRING, resEmpty.getType());
    Assert.assertEquals("", resEmpty.getString());

    Node newOther = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    Assert.assertSame(newOther, fold(newOther));
  }

  @Test
  public void testTryFoldKnownStringMethods() {
    Node toLower = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("HELLO"), Node.newString("toLowerCase"))));
    Assert.assertEquals("hello", toLower.getString());

    Node toUpper = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("hello"), Node.newString("toUpperCase"))));
    Assert.assertEquals("HELLO", toUpper.getString());

    Node indexOf1 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("indexOf")), Node.newString("cd")));
    Assert.assertEquals(2.0, indexOf1.getDouble(), 0.0);

    Node indexOf2 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdefcd"), Node.newString("indexOf")), Node.newString("cd"), Node.newNumber(3)));
    Assert.assertEquals(6.0, indexOf2.getDouble(), 0.0);

    Node lastIndexOf = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdefcd"), Node.newString("lastIndexOf")), Node.newString("cd")));
    Assert.assertEquals(6.0, lastIndexOf.getDouble(), 0.0);

    Node substr1 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substr")), Node.newNumber(2)));
    Assert.assertEquals("cdef", substr1.getString());

    Node substr2 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substr")), Node.newNumber(2), Node.newNumber(3)));
    Assert.assertEquals("cde", substr2.getString());

    Node substring1 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substring")), Node.newNumber(2)));
    Assert.assertEquals("cdef", substring1.getString());

    Node substring2 = fold(new Node(Token.CALL, new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substring")), Node.newNumber(2), Node.newNumber(4)));
    Assert.assertEquals("cd", substring2.getString());
  }

  @Test
  public void testTryFoldArrayJoin() {
    Node joinEmpty = fold(new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.ARRAYLIT), Node.newString("join"))));
    Assert.assertEquals("", joinEmpty.getString());

    Node joinSingle = fold(new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.ARRAYLIT, Node.newString("a")), Node.newString("join"))));
    Assert.assertEquals("a", joinSingle.getString());

    Node joinMultiple = fold(new Node(Token.CALL,
        new Node(Token.GETPROP, new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b")), Node.newString("join")),
        Node.newString(",")));
    Assert.assertEquals("a,b", joinMultiple.getString());

    Node joinEmptySlot = fold(new Node(Token.CALL,
        new Node(Token.GETPROP, new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.EMPTY), Node.newString("b")), Node.newString("join")),
        Node.newString(",")));
    Assert.assertEquals("a,,b", joinEmptySlot.getString());
  }

  @Test
  public void testTryFoldGetElem() {
    Node arr = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getElem0 = fold(new Node(Token.GETELEM, arr, Node.newNumber(1)));
    Assert.assertEquals("b", getElem0.getString());

    Node arrEmpty = new Node(Token.ARRAYLIT, new Node(Token.EMPTY));
    Node getElemEmpty = fold(new Node(Token.GETELEM, arrEmpty, Node.newNumber(0)));
    Assert.assertEquals(Token.VOID, getElemEmpty.getType());

    Node arrOutOfBounds = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node getElemOOB = new Node(Token.GETELEM, arrOutOfBounds, Node.newNumber(5));
    Assert.assertSame(getElemOOB, fold(getElemOOB));

    Node arrNeg = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node getElemNeg = new Node(Token.GETELEM, arrNeg, Node.newNumber(-1));
    Assert.assertSame(getElemNeg, fold(getElemNeg));

    Node arrFrac = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node getElemFrac = new Node(Token.GETELEM, arrFrac, Node.newNumber(0.5));
    Assert.assertSame(getElemFrac, fold(getElemFrac));
  }

  @Test
  public void testTryFoldGetProp_length() {
    Node arrLen = fold(new Node(Token.GETPROP, new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2)), Node.newString("length")));
    Assert.assertEquals(2.0, arrLen.getDouble(), 0.0);

    Node strLen = fold(new Node(Token.GETPROP, Node.newString("hello"), Node.newString("length")));
    Assert.assertEquals(5.0, strLen.getDouble(), 0.0);

    Node otherProp = new Node(Token.GETPROP, Node.newString("hello"), Node.newString("custom"));
    Assert.assertSame(otherProp, fold(otherProp));
  }
}
