package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

  private PeepholeFoldConstants peephole;
  private Compiler compiler;

  @Before
  public void setUp() {
    peephole = new PeepholeFoldConstants();
    compiler = new Compiler();
    peephole.beginTraversal(compiler);
  }

  private Node fold(Node n) {
    Node parent = new Node(Token.EXPR_RESULT, n);
    return peephole.optimizeSubtree(n);
  }

  private Node foldInParent(Node parent, Node n) {
    return peephole.optimizeSubtree(n);
  }

  // ===================== TYPEOF =====================

  @Test
  public void testFoldTypeof_literals() {
    // string
    Node n1 = fold(new Node(Token.TYPEOF, Node.newString("hello")));
    assertEquals(Token.STRING, n1.getType());
    assertEquals("string", n1.getString());

    // number
    Node n2 = fold(new Node(Token.TYPEOF, Node.newNumber(123)));
    assertEquals(Token.STRING, n2.getType());
    assertEquals("number", n2.getString());

    // boolean
    Node n3 = fold(new Node(Token.TYPEOF, new Node(Token.TRUE)));
    assertEquals(Token.STRING, n3.getType());
    assertEquals("boolean", n3.getString());

    Node n4 = fold(new Node(Token.TYPEOF, new Node(Token.FALSE)));
    assertEquals(Token.STRING, n4.getType());
    assertEquals("boolean", n4.getString());

    // null
    Node n5 = fold(new Node(Token.TYPEOF, new Node(Token.NULL)));
    assertEquals(Token.STRING, n5.getType());
    assertEquals("object", n5.getString());

    // objectlit
    Node n6 = fold(new Node(Token.TYPEOF, new Node(Token.OBJECTLIT)));
    assertEquals(Token.STRING, n6.getType());
    assertEquals("object", n6.getString());

    // arraylit
    Node n7 = fold(new Node(Token.TYPEOF, new Node(Token.ARRAYLIT)));
    assertEquals(Token.STRING, n7.getType());
    assertEquals("object", n7.getString());

    // void
    Node n8 = fold(new Node(Token.TYPEOF, new Node(Token.VOID, Node.newNumber(0))));
    assertEquals(Token.STRING, n8.getType());
    assertEquals("undefined", n8.getString());

    // name "undefined"
    Node n9 = fold(new Node(Token.TYPEOF, Node.newString(Token.NAME, "undefined")));
    assertEquals(Token.STRING, n9.getType());
    assertEquals("undefined", n9.getString());

    // function
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node n10 = fold(new Node(Token.TYPEOF, fn));
    assertEquals(Token.STRING, n10.getType());
    assertEquals("function", n10.getString());
  }

  @Test
  public void testFoldTypeof_nonLiteral() {
    Node nameNode = Node.newString(Token.NAME, "customVar");
    Node typeofNode = new Node(Token.TYPEOF, nameNode);
    Node result = fold(typeofNode);
    assertSame(typeofNode, result);
  }

  // ===================== UNARY OPERATORS =====================

  @Test
  public void testFoldUnary_not() {
    Node notTrue = fold(new Node(Token.NOT, new Node(Token.TRUE)));
    assertEquals(Token.FALSE, notTrue.getType());

    Node notFalse = fold(new Node(Token.NOT, new Node(Token.FALSE)));
    assertEquals(Token.TRUE, notFalse.getType());

    // !0 and !1 should not fold back to boolean
    Node notZero = fold(new Node(Token.NOT, Node.newNumber(0)));
    assertEquals(Token.NOT, notZero.getType());

    Node notOne = fold(new Node(Token.NOT, Node.newNumber(1)));
    assertEquals(Token.NOT, notOne.getType());

    // !2 should fold to false
    Node notTwo = fold(new Node(Token.NOT, Node.newNumber(2)));
    assertEquals(Token.FALSE, notTwo.getType());
  }

  @Test
  public void testFoldUnary_pos() {
    Node posNum = fold(new Node(Token.POS, Node.newNumber(42)));
    assertEquals(Token.NUMBER, posNum.getType());
    assertEquals(42.0, posNum.getDouble(), 0.0);

    Node posName = fold(new Node(Token.POS, Node.newString(Token.NAME, "x")));
    assertEquals(Token.POS, posName.getType());
  }

  @Test
  public void testFoldUnary_neg() {
    Node negNum = fold(new Node(Token.NEG, Node.newNumber(42)));
    assertEquals(Token.NUMBER, negNum.getType());
    assertEquals(-42.0, negNum.getDouble(), 0.0);

    Node negInfinity = fold(new Node(Token.NEG, Node.newString(Token.NAME, "Infinity")));
    assertEquals(Token.NEG, negInfinity.getType());

    Node negNaN = fold(new Node(Token.NEG, Node.newString(Token.NAME, "NaN")));
    assertEquals(Token.NAME, negNaN.getType());
    assertEquals("NaN", negNaN.getString());

    // Negating a non-number should report error
    Node negStr = fold(new Node(Token.NEG, Node.newString("abc")));
    assertEquals(Token.NEG, negStr.getType());
  }

  @Test
  public void testFoldUnary_bitnot() {
    Node bitnot = fold(new Node(Token.BITNOT, Node.newNumber(5)));
    assertEquals(Token.NUMBER, bitnot.getType());
    assertEquals(~5, (int) bitnot.getDouble());

    // Fractional bitwise operand
    Node bitnotFrac = fold(new Node(Token.BITNOT, Node.newNumber(5.5)));
    assertEquals(Token.BITNOT, bitnotFrac.getType());

    // Out of range
    Node bitnotOutOfRange = fold(new Node(Token.BITNOT, Node.newNumber(1e15)));
    assertEquals(Token.BITNOT, bitnotOutOfRange.getType());

    // Non-number
    Node bitnotStr = fold(new Node(Token.BITNOT, Node.newString("str")));
    assertEquals(Token.BITNOT, bitnotStr.getType());
  }

  // ===================== VOID =====================

  @Test
  public void testReduceVoid() {
    Node voidNonZero = fold(new Node(Token.VOID, Node.newNumber(100)));
    assertEquals(Token.VOID, voidNonZero.getType());
    assertEquals(0.0, voidNonZero.getFirstChild().getDouble(), 0.0);

    Node voidZero = fold(new Node(Token.VOID, Node.newNumber(0)));
    assertEquals(Token.VOID, voidZero.getType());
  }

  // ===================== OPERANDS CONVERSION =====================

  @Test
  public void testReduceOperandsForOp_arithmeticAndAssign() {
    // ADD with non-strings converts operands
    Node addWithBool = fold(new Node(Token.ADD, new Node(Token.TRUE), Node.newNumber(5)));
    assertEquals(Token.NUMBER, addWithBool.getType());
    assertEquals(6.0, addWithBool.getDouble(), 0.0);

    // Compound assignment operations
    Node assignSub = new Node(Token.ASSIGN_SUB, Node.newString(Token.NAME, "x"), new Node(Token.TRUE));
    fold(assignSub);
    assertEquals(Token.NUMBER, assignSub.getLastChild().getType());
    assertEquals(1.0, assignSub.getLastChild().getDouble(), 0.0);

    // Logical AND inside conversion
    Node hook = new Node(Token.HOOK, new Node(Token.TRUE), new Node(Token.TRUE), new Node(Token.FALSE));
    Node addHook = fold(new Node(Token.SUB, Node.newNumber(10), hook));
    assertNotNull(addHook);
  }

  // ===================== INSTANCEOF =====================

  @Test
  public void testFoldInstanceof() {
    // Immutable left -> FALSE
    Node inst1 = fold(new Node(Token.INSTANCEOF, Node.newString("str"), Node.newString(Token.NAME, "Object")));
    assertEquals(Token.FALSE, inst1.getType());

    // Array literal instanceof Object -> TRUE
    Node inst2 = fold(new Node(Token.INSTANCEOF, new Node(Token.ARRAYLIT), Node.newString(Token.NAME, "Object")));
    assertEquals(Token.TRUE, inst2.getType());

    // Array literal instanceof Array -> unchanged (not folded)
    Node inst3 = fold(new Node(Token.INSTANCEOF, new Node(Token.ARRAYLIT), Node.newString(Token.NAME, "Array")));
    assertEquals(Token.INSTANCEOF, inst3.getType());
  }

  // ===================== ASSIGN =====================

  @Test
  public void testFoldAssign() {
    // x = x + y -> x += y
    Node assignAdd = fold(new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "x"),
        new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"))));
    assertEquals(Token.ASSIGN_ADD, assignAdd.getType());

    // x = y + x -> x += y (commutative)
    Node assignAddComm = fold(new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "x"),
        new Node(Token.ADD, Node.newString(Token.NAME, "y"), Node.newString(Token.NAME, "x"))));
    assertEquals(Token.ASSIGN_ADD, assignAddComm.getType());

    // x = x - y -> x -= y
    Node assignSub = fold(new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "x"),
        new Node(Token.SUB, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"))));
    assertEquals(Token.ASSIGN_SUB, assignSub.getType());

    // Non-matching target: x = a + b
    Node assignNoMatch = fold(new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "x"),
        new Node(Token.ADD, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"))));
    assertEquals(Token.ASSIGN, assignNoMatch.getType());
  }

  // ===================== AND / OR =====================

  @Test
  public void testFoldAndOr() {
    // true || x -> true
    Node orTrue = fold(new Node(Token.OR, new Node(Token.TRUE), Node.newString(Token.NAME, "x")));
    assertEquals(Token.TRUE, orTrue.getType());

    // false || x -> x
    Node orFalse = fold(new Node(Token.OR, new Node(Token.FALSE), Node.newString(Token.NAME, "x")));
    assertEquals(Token.NAME, orFalse.getType());
    assertEquals("x", orFalse.getString());

    // false && x -> false
    Node andFalse = fold(new Node(Token.AND, new Node(Token.FALSE), Node.newString(Token.NAME, "x")));
    assertEquals(Token.FALSE, andFalse.getType());

    // true && x -> x
    Node andTrue = fold(new Node(Token.AND, new Node(Token.TRUE), Node.newString(Token.NAME, "x")));
    assertEquals(Token.NAME, andTrue.getType());
    assertEquals("x", andTrue.getString());
  }

  // ===================== ADD / STRING CONCAT =====================

  @Test
  public void testFoldAdd_stringConcatenation() {
    // "a" + "b" -> "ab"
    Node addConst = fold(new Node(Token.ADD, Node.newString("a"), Node.newString("b")));
    assertEquals(Token.STRING, addConst.getType());
    assertEquals("ab", addConst.getString());

    // (x + "a") + "b" -> x + "ab"
    Node leftAdd = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newString("a"));
    Node addNestedLeft = fold(new Node(Token.ADD, leftAdd, Node.newString("b")));
    assertEquals(Token.ADD, addNestedLeft.getType());
    assertEquals("ab", addNestedLeft.getLastChild().getString());

    // "a" + ("b" + x) -> "ab" + x
    Node rightAdd = new Node(Token.ADD, Node.newString("b"), Node.newString(Token.NAME, "x"));
    Node addNestedRight = fold(new Node(Token.ADD, Node.newString("a"), rightAdd));
    assertEquals(Token.ADD, addNestedRight.getType());
    assertEquals("ab", addNestedRight.getFirstChild().getString());
  }

  // ===================== ARITHMETIC OPERATORS =====================

  @Test
  public void testFoldArithmeticOp() {
    assertEquals(8.0, fold(new Node(Token.ADD, Node.newNumber(3), Node.newNumber(5))).getDouble(), 0.0);
    assertEquals(2.0, fold(new Node(Token.SUB, Node.newNumber(5), Node.newNumber(3))).getDouble(), 0.0);
    assertEquals(15.0, fold(new Node(Token.MUL, Node.newNumber(3), Node.newNumber(5))).getDouble(), 0.0);
    assertEquals(2.0, fold(new Node(Token.DIV, Node.newNumber(6), Node.newNumber(3))).getDouble(), 0.0);
    assertEquals(1.0, fold(new Node(Token.MOD, Node.newNumber(7), Node.newNumber(3))).getDouble(), 0.0);
    assertEquals(1.0, fold(new Node(Token.BITAND, Node.newNumber(5), Node.newNumber(3))).getDouble(), 0.0);
    assertEquals(7.0, fold(new Node(Token.BITOR, Node.newNumber(5), Node.newNumber(3))).getDouble(), 0.0);
    assertEquals(6.0, fold(new Node(Token.BITXOR, Node.newNumber(5), Node.newNumber(3))).getDouble(), 0.0);

    // Division / Mod by 0
    Node divZero = fold(new Node(Token.DIV, Node.newNumber(5), Node.newNumber(0)));
    assertEquals(Token.DIV, divZero.getType());

    Node modZero = fold(new Node(Token.MOD, Node.newNumber(5), Node.newNumber(0)));
    assertEquals(Token.MOD, modZero.getType());
  }

  @Test
  public void testFoldLeftChildOp_associative() {
    // (x * 2) * 3 -> x * 6
    Node leftMul = new Node(Token.MUL, Node.newString(Token.NAME, "x"), Node.newNumber(2));
    Node mul = fold(new Node(Token.MUL, leftMul, Node.newNumber(3)));
    assertEquals(Token.MUL, mul.getType());
    assertEquals(6.0, mul.getLastChild().getDouble(), 0.0);

    // (2 * x) * 3 -> x * 6
    Node leftMul2 = new Node(Token.MUL, Node.newNumber(2), Node.newString(Token.NAME, "x"));
    Node mul2 = fold(new Node(Token.MUL, leftMul2, Node.newNumber(3)));
    assertEquals(Token.MUL, mul2.getType());
    assertEquals(6.0, mul2.getLastChild().getDouble(), 0.0);
  }

  // ===================== SHIFTS =====================

  @Test
  public void testFoldShift() {
    assertEquals(4.0, fold(new Node(Token.LSH, Node.newNumber(1), Node.newNumber(2))).getDouble(), 0.0);
    assertEquals(2.0, fold(new Node(Token.RSH, Node.newNumber(8), Node.newNumber(2))).getDouble(), 0.0);
    assertEquals(1073741823.0, fold(new Node(Token.URSH, Node.newNumber(-4), Node.newNumber(2))).getDouble(), 0.0);

    // Operand out of range
    Node lshOutOfRange = fold(new Node(Token.LSH, Node.newNumber(1e15), Node.newNumber(2)));
    assertEquals(Token.LSH, lshOutOfRange.getType());

    // Shift amount out of bounds
    Node lshBadAmount = fold(new Node(Token.LSH, Node.newNumber(1), Node.newNumber(33)));
    assertEquals(Token.LSH, lshBadAmount.getType());

    // Fractional operands
    Node lshFrac1 = fold(new Node(Token.LSH, Node.newNumber(1.5), Node.newNumber(2)));
    assertEquals(Token.LSH, lshFrac1.getType());

    Node lshFrac2 = fold(new Node(Token.LSH, Node.newNumber(1), Node.newNumber(2.5)));
    assertEquals(Token.LSH, lshFrac2.getType());
  }

  // ===================== COMPARISONS =====================

  @Test
  public void testFoldComparison_booleansAndNull() {
    assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.TRUE), new Node(Token.TRUE))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.EQ, new Node(Token.TRUE), new Node(Token.FALSE))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.NE, new Node(Token.TRUE), new Node(Token.NULL))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.SHEQ, new Node(Token.TRUE), new Node(Token.NULL))).getType());

    // Undefined comparisons
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.NULL), voidNode)).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.SHEQ, new Node(Token.NULL), voidNode)).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.SHNE, new Node(Token.NULL), voidNode)).getType());
  }

  @Test
  public void testFoldComparison_numbers() {
    assertEquals(Token.TRUE, fold(new Node(Token.LT, Node.newNumber(1), Node.newNumber(2))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.LT, Node.newNumber(2), Node.newNumber(1))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.LE, Node.newNumber(2), Node.newNumber(2))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.GT, Node.newNumber(3), Node.newNumber(2))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.GE, Node.newNumber(3), Node.newNumber(3))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.EQ, Node.newNumber(5), Node.newNumber(5))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.NE, Node.newNumber(5), Node.newNumber(6))).getType());
  }

  @Test
  public void testFoldComparison_strings() {
    assertEquals(Token.TRUE, fold(new Node(Token.EQ, Node.newString("abc"), Node.newString("abc"))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.EQ, Node.newString("abc"), Node.newString("def"))).getType());
    assertEquals(Token.TRUE, fold(new Node(Token.NE, Node.newString("abc"), Node.newString("def"))).getType());
  }

  @Test
  public void testFoldComparison_thisAndNames() {
    assertEquals(Token.TRUE, fold(new Node(Token.EQ, new Node(Token.THIS), new Node(Token.THIS))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.NE, new Node(Token.THIS), new Node(Token.THIS))).getType());

    assertEquals(Token.FALSE, fold(new Node(Token.LT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x"))).getType());
    assertEquals(Token.FALSE, fold(new Node(Token.GT, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "x"))).getType());
  }

  // ===================== CONSTRUCTOR CALL (NEW) =====================

  @Test
  public void testFoldCtorCall() {
    // GETELEM -> this[new String('eval')]
    Node newStr = new Node(Token.NEW, Node.newString(Token.NAME, "String"), Node.newString("eval"));
    Node getElem = new Node(Token.GETELEM, new Node(Token.THIS), newStr);
    Node expr = new Node(Token.EXPR_RESULT, getElem);

    Node result = foldInParent(getElem, newStr);
    assertEquals(Token.STRING, result.getType());
    assertEquals("eval", result.getString());

    // new String() without arguments -> ""
    Node newEmptyStr = new Node(Token.NEW, Node.newString(Token.NAME, "String"));
    Node getElemEmpty = new Node(Token.GETELEM, new Node(Token.THIS), newEmptyStr);
    new Node(Token.EXPR_RESULT, getElemEmpty);

    Node resultEmpty = foldInParent(getElemEmpty, newEmptyStr);
    assertEquals(Token.STRING, resultEmpty.getType());
    assertEquals("", resultEmpty.getString());
  }

  // ===================== GETPROP =====================

  @Test
  public void testFoldGetProp_length() {
    // [1, 2, 3].length -> 3
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2), Node.newNumber(3));
    Node getProp = fold(new Node(Token.GETPROP, arrayLit, Node.newString("length")));
    assertEquals(Token.NUMBER, getProp.getType());
    assertEquals(3.0, getProp.getDouble(), 0.0);

    // "hello".length -> 5
    Node strNode = Node.newString("hello");
    Node getPropStr = fold(new Node(Token.GETPROP, strNode, Node.newString("length")));
    assertEquals(Token.NUMBER, getPropStr.getType());
    assertEquals(5.0, getPropStr.getDouble(), 0.0);
  }

  @Test
  public void testFoldGetProp_objectLit() {
    // ({a: 10}).a -> 10
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING, "a");
    key.addChildToFront(Node.newNumber(10));
    objLit.addChildToFront(key);

    Node getProp = fold(new Node(Token.GETPROP, objLit, Node.newString("a")));
    assertEquals(Token.NUMBER, getProp.getType());
    assertEquals(10.0, getProp.getDouble(), 0.0);

    // Getter property: ({get a() { return 1; }}).a -> (call)
    Node objLitGet = new Node(Token.OBJECTLIT);
    Node getKey = Node.newString(Token.GET, "a");
    Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    getKey.addChildToFront(fn);
    objLitGet.addChildToFront(getKey);

    Node getPropCall = fold(new Node(Token.GETPROP, objLitGet, Node.newString("a")));
    assertEquals(Token.CALL, getPropCall.getType());
  }

  // ===================== GETELEM =====================

  @Test
  public void testFoldGetElem_arrayAccess() {
    // [10, 20, 30][1] -> 20
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20), Node.newNumber(30));
    Node getElem = fold(new Node(Token.GETELEM, arrayLit, Node.newNumber(1)));
    assertEquals(Token.NUMBER, getElem.getType());
    assertEquals(20.0, getElem.getDouble(), 0.0);

    // [10, , 30][1] (EMPTY token) -> undefined (VOID 0)
    Node arrayWithHole = new Node(Token.ARRAYLIT, Node.newNumber(10), new Node(Token.EMPTY), Node.newNumber(30));
    Node getElemHole = fold(new Node(Token.GETELEM, arrayWithHole, Node.newNumber(1)));
    assertEquals(Token.VOID, getElemHole.getType());

    // Out of bounds / invalid indices
    Node getElemOOB = fold(new Node(Token.GETELEM, new Node(Token.ARRAYLIT), Node.newNumber(5)));
    assertEquals(Token.GETELEM, getElemOOB.getType());

    Node getElemNeg = fold(new Node(Token.GETELEM, new Node(Token.ARRAYLIT), Node.newNumber(-1)));
    assertEquals(Token.GETELEM, getElemNeg.getType());

    Node getElemFrac = fold(new Node(Token.GETELEM, new Node(Token.ARRAYLIT), Node.newNumber(1.5)));
    assertEquals(Token.GETELEM, getElemFrac.getType());
  }

  @Test
  public void testFoldBinaryOperator_singleChildOrEmpty() {
    // Node without children should return subtree unmodified
    Node emptyNode = new Node(Token.ADD);
    Node result = fold(emptyNode);
    assertSame(emptyNode, result);

    // Node with one child should return subtree unmodified
    Node singleChildNode = new Node(Token.ADD, Node.newNumber(1));
    Node resultSingle = fold(singleChildNode);
    assertSame(singleChildNode, resultSingle);
  }
}
