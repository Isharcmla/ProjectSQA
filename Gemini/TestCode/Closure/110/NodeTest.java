package com.google.javascript.rhino;

import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testConstructors_singleNode_success() {
    Node n = new Node(Token.NAME);
    assertEquals(Token.NAME, n.getType());
    assertNull(n.getParent());
    assertEquals(-1, n.getSourcePosition());
    assertEquals(-1, n.getLineno());
    assertEquals(-1, n.getCharno());
    assertFalse(n.hasChildren());
  }

  @Test
  public void testConstructors_withLineAndChar_success() {
    Node n = new Node(Token.NAME, 10, 20);
    assertEquals(10, n.getLineno());
    assertEquals(20, n.getCharno());
  }

  @Test
  public void testConstructors_withOneChild_success() {
    Node child = new Node(Token.TRUE);
    Node parent = new Node(Token.EXPR_RESULT, child);
    assertEquals(1, parent.getChildCount());
    assertSame(child, parent.getFirstChild());
    assertSame(child, parent.getLastChild());
    assertSame(parent, child.getParent());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructors_withOneChildHavingParent_throwsException() {
    Node child = new Node(Token.TRUE);
    new Node(Token.EXPR_RESULT, child);
    new Node(Token.BLOCK, child);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructors_withOneChildHavingSibling_throwsException() {
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    new Node(Token.BLOCK, c1, c2);
    new Node(Token.EXPR_RESULT, c1);
  }

  @Test
  public void testConstructors_withTwoChildren_success() {
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    Node parent = new Node(Token.ADD, c1, c2, 1, 2);
    assertEquals(2, parent.getChildCount());
    assertSame(c1, parent.getFirstChild());
    assertSame(c2, parent.getLastChild());
    assertSame(c2, c1.getNext());
    assertSame(parent, c1.getParent());
    assertSame(parent, c2.getParent());
  }

  @Test
  public void testConstructors_withThreeChildren_success() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.TRUE);
    Node c3 = new Node(Token.FALSE);
    Node parent = new Node(Token.HOOK, c1, c2, c3, 5, 10);
    assertEquals(3, parent.getChildCount());
    assertSame(c1, parent.getFirstChild());
    assertSame(c3, parent.getLastChild());
  }

  @Test
  public void testConstructors_withFourChildren_success() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.TRUE);
    Node c3 = new Node(Token.FALSE);
    Node c4 = new Node(Token.NULL);
    Node parent = new Node(Token.FUNCTION, c1, c2, c3, c4);
    assertEquals(4, parent.getChildCount());
    assertSame(c4, parent.getLastChild());

    Node parent2 = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.TRUE), new Node(Token.FALSE), new Node(Token.NULL), 2, 4);
    assertEquals(4, parent2.getChildCount());
  }

  @Test
  public void testConstructors_withArrayChildren_success() {
    Node[] children = new Node[]{new Node(Token.NAME), new Node(Token.TRUE), new Node(Token.FALSE)};
    Node parent = new Node(Token.BLOCK, children, 12, 34);
    assertEquals(3, parent.getChildCount());

    Node emptyParent = new Node(Token.BLOCK, new Node[0]);
    assertEquals(0, emptyParent.getChildCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructors_withArrayChildrenDuplicate_throwsException() {
    Node c = new Node(Token.NAME);
    new Node(Token.BLOCK, new Node[]{c, c});
  }

  @Test
  public void testFactoryMethods_newNumber() {
    Node num = Node.newNumber(42.5);
    assertTrue(num.isNumber());
    assertEquals(42.5, num.getDouble(), 0.0001);

    num.setDouble(100.0);
    assertEquals(100.0, num.getDouble(), 0.0001);

    Node numWithPos = Node.newNumber(3.14, 2, 8);
    assertEquals(2, numWithPos.getLineno());
    assertEquals(8, numWithPos.getCharno());
    assertEquals(3.14, numWithPos.getDouble(), 0.0001);
  }

  @Test
  public void testNumberNode_equivalenceZeroAndNegativeZero() {
    Node zero = Node.newNumber(0.0);
    Node negZero = Node.newNumber(-0.0);
    Node zero2 = Node.newNumber(0.0);

    assertTrue(zero.isEquivalentTo(zero2));
    assertFalse(zero.isEquivalentTo(negZero));

    Node num1 = Node.newNumber(5.0);
    Node num2 = Node.newNumber(5.0);
    Node num3 = Node.newNumber(6.0);
    assertTrue(num1.isEquivalentTo(num2));
    assertFalse(num1.isEquivalentTo(num3));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetDouble_onNonFactoryNumber_throwsException() {
    Node n = new Node(Token.NUMBER);
    n.getDouble();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetDouble_onNonNumber_throwsException() {
    Node n = new Node(Token.NAME);
    n.getDouble();
  }

  @Test(expected = IllegalStateException.class)
  public void testSetDouble_onNonFactoryNumber_throwsException() {
    Node n = new Node(Token.NUMBER);
    n.setDouble(1.0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testSetDouble_onNonNumber_throwsException() {
    Node n = new Node(Token.NAME);
    n.setDouble(1.0);
  }

  @Test
  public void testFactoryMethods_newString() {
    Node str = Node.newString("hello");
    assertTrue(str.isString());
    assertEquals("hello", str.getString());

    str.setString("world");
    assertEquals("world", str.getString());

    Node strTyped = Node.newString(Token.NAME, "varName");
    assertTrue(strTyped.isName());
    assertEquals("varName", strTyped.getString());

    Node strPos = Node.newString("pos", 3, 4);
    assertEquals(3, strPos.getLineno());
    assertEquals(4, strPos.getCharno());

    Node strTypedPos = Node.newString(Token.STRING_KEY, "key", 7, 8);
    assertTrue(strTypedPos.isStringKey());
    assertEquals(7, strTypedPos.getLineno());
    assertEquals(8, strTypedPos.getCharno());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewString_nullString_throwsException() {
    Node.newString(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewString_nullStringWithPos_throwsException() {
    Node.newString(Token.STRING, null, 1, 1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSetString_nullString_throwsException() {
    Node str = Node.newString("abc");
    str.setString(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetString_onNonFactoryString_throwsException() {
    Node n = new Node(Token.STRING);
    n.getString();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetString_onNonString_throwsException() {
    Node n = new Node(Token.TRUE);
    n.getString();
  }

  @Test(expected = IllegalStateException.class)
  public void testSetString_onNonFactoryString_throwsException() {
    Node n = new Node(Token.STRING);
    n.setString("test");
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testSetString_onNonString_throwsException() {
    Node n = new Node(Token.TRUE);
    n.setString("test");
  }

  @Test
  public void testStringNode_quotedString() {
    Node str = Node.newString("key");
    assertFalse(str.isQuotedString());
    str.setQuotedString();
    assertTrue(str.isQuotedString());

    Node nonStr = new Node(Token.TRUE);
    assertFalse(nonStr.isQuotedString());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetQuotedString_onNonStringNode_throwsException() {
    Node n = new Node(Token.TRUE);
    n.setQuotedString();
  }

  @Test
  public void testStringNode_equivalence() {
    Node str1 = Node.newString("a");
    Node str2 = Node.newString("a");
    Node str3 = Node.newString("b");
    assertTrue(str1.isEquivalentTo(str2));
    assertFalse(str1.isEquivalentTo(str3));
  }

  @Test
  public void testTypeGetSet() {
    Node n = new Node(Token.VAR);
    assertEquals(Token.VAR, n.getType());
    n.setType(Token.LET);
    assertEquals(Token.LET, n.getType());
  }

  @Test
  public void testChildrenManagement_addAndRemove() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    Node c3 = new Node(Token.NULL);

    parent.addChildToFront(c2);
    parent.addChildToFront(c1);
    parent.addChildToBack(c3);

    assertEquals(3, parent.getChildCount());
    assertTrue(parent.hasMoreThanOneChild());
    assertFalse(parent.hasOneChild());
    assertSame(c1, parent.getFirstChild());
    assertSame(c3, parent.getLastChild());

    assertSame(c1, parent.getChildAtIndex(0));
    assertSame(c2, parent.getChildAtIndex(1));
    assertSame(c3, parent.getChildAtIndex(2));
    assertNull(parent.getChildAtIndex(3));

    assertEquals(0, parent.getIndexOfChild(c1));
    assertEquals(1, parent.getIndexOfChild(c2));
    assertEquals(2, parent.getIndexOfChild(c3));
    assertEquals(-1, parent.getIndexOfChild(new Node(Token.THIS)));

    assertTrue(parent.hasChild(c2));
    assertFalse(parent.hasChild(new Node(Token.THIS)));

    assertNull(parent.getChildBefore(c1));
    assertSame(c1, parent.getChildBefore(c2));
    assertSame(c2, parent.getChildBefore(c3));

    parent.removeChild(c2);
    assertEquals(2, parent.getChildCount());
    assertSame(c3, c1.getNext());

    parent.removeChild(c3);
    assertEquals(1, parent.getChildCount());
    assertTrue(parent.hasOneChild());
    assertFalse(parent.hasMoreThanOneChild());

    parent.removeChild(c1);
    assertFalse(parent.hasChildren());
    assertNull(parent.getFirstChild());
    assertNull(parent.getLastChild());
  }

  @Test(expected = RuntimeException.class)
  public void testGetChildBefore_notAChild_throwsException() {
    Node parent = new Node(Token.BLOCK, new Node(Token.TRUE));
    parent.getChildBefore(new Node(Token.FALSE));
  }

  @Test
  public void testAddChildrenToFrontAndBack() {
    Node parent = new Node(Token.BLOCK);
    Node g1 = new Node(Token.TRUE);
    Node g2 = new Node(Token.FALSE);
    g1.next = g2;

    parent.addChildrenToFront(g1);
    assertEquals(2, parent.getChildCount());
    assertSame(g1, parent.getFirstChild());
    assertSame(g2, parent.getLastChild());

    Node g3 = new Node(Token.NULL);
    Node g4 = new Node(Token.THIS);
    g3.next = g4;

    parent.addChildrenToBack(g3);
    assertEquals(4, parent.getChildCount());
    assertSame(g4, parent.getLastChild());
  }

  @Test
  public void testAddChildBeforeAndAfter() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);

    Node c0 = new Node(Token.NULL);
    parent.addChildBefore(c0, c1);
    assertSame(c0, parent.getFirstChild());

    Node cMid = new Node(Token.THIS);
    parent.addChildBefore(cMid, c2);
    assertSame(cMid, c1.getNext());

    Node cAfter = new Node(Token.NUMBER);
    parent.addChildAfter(cAfter, c2);
    assertSame(cAfter, parent.getLastChild());
  }

  @Test
  public void testAddChildrenAfter_nullNodePrepends() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    parent.addChildrenAfter(c1, null);
    assertSame(c1, parent.getFirstChild());

    Node c2 = new Node(Token.FALSE);
    parent.addChildrenAfter(c2, null);
    assertSame(c2, parent.getFirstChild());
    assertSame(c1, parent.getLastChild());
  }

  @Test
  public void testReplaceChild_andReplaceChildAfter() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    Node c3 = new Node(Token.NULL);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);
    parent.addChildToBack(c3);

    Node rep1 = new Node(Token.THIS);
    parent.replaceChild(c1, rep1);
    assertSame(rep1, parent.getFirstChild());
    assertNull(c1.getParent());

    Node rep3 = new Node(Token.NAME);
    parent.replaceChild(c3, rep3);
    assertSame(rep3, parent.getLastChild());

    Node rep2 = new Node(Token.VOID);
    parent.replaceChild(c2, rep2);
    assertSame(rep2, rep1.getNext());

    Node repAfter = new Node(Token.BREAK);
    parent.replaceChildAfter(rep1, repAfter);
    assertSame(repAfter, rep1.getNext());
  }

  @Test
  public void testDetachFromParent_andRemoveChildren() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);

    c2.detachFromParent();
    assertNull(c2.getParent());
    assertEquals(1, parent.getChildCount());

    parent.addChildToBack(new Node(Token.NULL));
    Node first = parent.removeFirstChild();
    assertSame(c1, first);
    assertNull(c1.getParent());

    Node remaining = parent.removeChildren();
    assertNotNull(remaining);
    assertFalse(parent.hasChildren());
  }

  @Test
  public void testDetachChildren() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);

    parent.detachChildren();
    assertFalse(parent.hasChildren());
    assertNull(c1.getParent());
    assertNull(c1.getNext());
    assertNull(c2.getParent());
  }

  @Test
  public void testRemoveChildAfter() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    Node c3 = new Node(Token.NULL);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);
    parent.addChildToBack(c3);

    Node removed = parent.removeChildAfter(c1);
    assertSame(c2, removed);
    assertSame(c3, c1.getNext());

    Node removedLast = parent.removeChildAfter(c1);
    assertSame(c3, removedLast);
    assertSame(c1, parent.getLastChild());
  }

  @Test
  public void testCloneNode_andCloneTree() {
    Node parent = Node.newString(Token.NAME, "foo", 1, 2);
    parent.putIntProp(Node.LENGTH, 10);
    Node child = new Node(Token.TRUE);
    parent.addChildToBack(child);

    Node shallow = parent.cloneNode();
    assertEquals(Token.NAME, shallow.getType());
    assertEquals("foo", shallow.getString());
    assertEquals(10, shallow.getLength());
    assertFalse(shallow.hasChildren());

    Node tree = parent.cloneTree();
    assertEquals(1, tree.getChildCount());
    assertTrue(tree.getFirstChild().isTrue());
    assertNotSame(child, tree.getFirstChild());
    assertSame(tree, tree.getFirstChild().getParent());
  }

  @Test
  public void testProperties_putGetRemove() {
    Node n = new Node(Token.BLOCK);
    assertEquals(0, n.getIntProp(Node.LENGTH));
    assertNull(n.getProp(Node.ORIGINALNAME_PROP));
    assertFalse(n.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));

    n.putIntProp(Node.LENGTH, 42);
    assertEquals(42, n.getIntProp(Node.LENGTH));
    assertEquals(42, n.getExistingIntProp(Node.LENGTH));

    n.putBooleanProp(Node.SYNTHETIC_BLOCK_PROP, true);
    assertTrue(n.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));

    n.putProp(Node.ORIGINALNAME_PROP, "orig");
    assertEquals("orig", n.getProp(Node.ORIGINALNAME_PROP));

    // replace prop
    n.putProp(Node.ORIGINALNAME_PROP, "newOrig");
    assertEquals("newOrig", n.getProp(Node.ORIGINALNAME_PROP));

    // remove middle / head
    n.removeProp(Node.LENGTH);
    assertEquals(0, n.getIntProp(Node.LENGTH));
    assertTrue(n.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));

    n.putIntProp(Node.LENGTH, 0); // putting 0 removes it
    assertEquals(0, n.getIntProp(Node.LENGTH));

    n.putProp(Node.ORIGINALNAME_PROP, null); // putting null removes it
    assertNull(n.getProp(Node.ORIGINALNAME_PROP));

    n.removeProp(999); // removing non-existent prop does nothing
  }

  @Test(expected = IllegalStateException.class)
  public void testGetExistingIntProp_missing_throwsException() {
    Node n = new Node(Token.BLOCK);
    n.getExistingIntProp(Node.LENGTH);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testIntProp_getObjectValue_throwsException() {
    Node n = new Node(Token.BLOCK);
    n.putIntProp(Node.LENGTH, 10);
    n.getPropListHeadForTesting().getObjectValue();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testObjectProp_getIntValue_throwsException() {
    Node n = new Node(Token.BLOCK);
    n.putProp(Node.ORIGINALNAME_PROP, "test");
    n.getPropListHeadForTesting().getIntValue();
  }

  @Test
  public void testClonePropsFrom() {
    Node src = new Node(Token.BLOCK);
    src.putIntProp(Node.LENGTH, 10);
    src.putProp(Node.ORIGINALNAME_PROP, "test");

    Node dst = new Node(Token.BLOCK);
    dst.clonePropsFrom(src);
    assertEquals(10, dst.getLength());
    assertEquals("test", dst.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test(expected = IllegalStateException.class)
  public void testClonePropsFrom_existingProps_throwsException() {
    Node src = new Node(Token.BLOCK);
    src.putIntProp(Node.LENGTH, 10);
    Node dst = new Node(Token.BLOCK);
    dst.putIntProp(Node.LENGTH, 5);
    dst.clonePropsFrom(src);
  }

  @Test
  public void testSourcePositionManagement() {
    Node n = new Node(Token.BLOCK);
    n.setLineno(10);
    assertEquals(10, n.getLineno());
    assertEquals(0, n.getCharno());

    n.setCharno(25);
    assertEquals(10, n.getLineno());
    assertEquals(25, n.getCharno());

    n.setSourceEncodedPosition(100);
    assertEquals(100, n.getSourcePosition());

    Node tree = new Node(Token.BLOCK, new Node(Token.TRUE));
    tree.setSourceEncodedPositionForTree(50);
    assertEquals(50, tree.getSourcePosition());
    assertEquals(50, tree.getFirstChild().getSourcePosition());

    // Edge cases for mergeLineCharNo
    assertEquals(-1, Node.mergeLineCharNo(-1, 0));
    assertEquals(-1, Node.mergeLineCharNo(0, -1));
    int overflowPos = Node.mergeLineCharNo(1, Node.MAX_COLUMN_NUMBER + 10);
    assertEquals(Node.MAX_COLUMN_NUMBER, Node.extractCharno(overflowPos));
    assertEquals(1, Node.extractLineno(overflowPos));

    assertEquals(-1, Node.extractLineno(-1));
    assertEquals(-1, Node.extractCharno(-1));
  }

  @Test
  public void testSourceFileAndOffset() {
    Node n = new Node(Token.BLOCK);
    assertNull(n.getStaticSourceFile());
    assertNull(n.getSourceFileName());
    assertFalse(n.isFromExterns());
    assertEquals(-1, n.getSourceOffset());

    SimpleSourceFile file = new SimpleSourceFile("test.js", false);
    n.setStaticSourceFile(file);
    assertSame(file, n.getStaticSourceFile());
    assertEquals("test.js", n.getSourceFileName());
    assertFalse(n.isFromExterns());

    n.setSourceFileForTesting("test2.js");
    assertEquals("test2.js", n.getSourceFileName());

    InputId inputId = new InputId("input1");
    n.setInputId(inputId);
    assertSame(inputId, n.getInputId());

    n.setLength(15);
    assertEquals(15, n.getLength());
  }

  @Test
  public void testCopyAndUseSourceInfo() {
    Node src = new Node(Token.BLOCK, 10, 20);
    src.putProp(Node.ORIGINALNAME_PROP, "original");
    src.setSourceFileForTesting("src.js");

    Node dst = new Node(Token.EMPTY);
    dst.copyInformationFrom(src);
    assertEquals(10, dst.getLineno());
    assertEquals(20, dst.getCharno());
    assertEquals("original", dst.getProp(Node.ORIGINALNAME_PROP));
    assertEquals("src.js", dst.getSourceFileName());

    Node treeDst = new Node(Token.BLOCK, new Node(Token.EMPTY));
    treeDst.copyInformationFromForTree(src);
    assertEquals("src.js", treeDst.getFirstChild().getSourceFileName());

    Node dst2 = new Node(Token.EMPTY);
    dst2.useSourceInfoFrom(src);
    assertEquals(10, dst2.getLineno());
    dst2.srcref(src);
    assertEquals(10, dst2.getLineno());

    Node treeDst2 = new Node(Token.BLOCK, new Node(Token.EMPTY));
    treeDst2.useSourceInfoFromForTree(src);
    assertEquals(10, treeDst2.getFirstChild().getLineno());
    treeDst2.srcrefTree(src);
    assertEquals(10, treeDst2.getFirstChild().getLineno());

    Node dst3 = new Node(Token.EMPTY);
    dst3.useSourceInfoIfMissingFrom(src);
    assertEquals(10, dst3.getLineno());

    Node treeDst3 = new Node(Token.BLOCK, new Node(Token.EMPTY));
    treeDst3.useSourceInfoIfMissingFromForTree(src);
    assertEquals(10, treeDst3.getFirstChild().getLineno());
  }

  @Test
  public void testIteration_childrenAndSiblings() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.TRUE);
    Node c2 = new Node(Token.FALSE);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);

    int count = 0;
    for (Node child : parent.children()) {
      assertNotNull(child);
      count++;
    }
    assertEquals(2, count);

    // Empty children
    Node empty = new Node(Token.EMPTY);
    for (Node ignored : empty.children()) {
      fail("Should not have children");
    }

    count = 0;
    for (Node sib : c1.siblings()) {
      assertNotNull(sib);
      count++;
    }
    assertEquals(2, count);

    // Reuse iterator instance branch
    Iterable<Node> iterable = c1.siblings();
    Iterator<Node> it1 = iterable.iterator();
    Iterator<Node> it2 = iterable.iterator();
    assertNotSame(it1, it2);

    while (it1.hasNext()) {
      it1.next();
    }
    try {
      it1.next();
      fail("Should throw NoSuchElementException");
    } catch (NoSuchElementException expected) {
    }

    try {
      it1.remove();
      fail("Should throw UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
    }
  }

  @Test
  public void testIteration_ancestors() {
    Node root = new Node(Token.BLOCK);
    Node mid = new Node(Token.EXPR_RESULT);
    Node leaf = new Node(Token.TRUE);
    root.addChildToBack(mid);
    mid.addChildToBack(leaf);

    assertSame(leaf, leaf.getAncestor(0));
    assertSame(mid, leaf.getAncestor(1));
    assertSame(root, leaf.getAncestor(2));
    assertNull(leaf.getAncestor(3));

    int count = 0;
    for (Node ancestor : leaf.getAncestors()) {
      assertNotNull(ancestor);
      count++;
    }
    assertEquals(2, count);

    Iterator<Node> it = leaf.getAncestors().iterator();
    assertTrue(it.hasNext());
    assertSame(mid, it.next());
    assertTrue(it.hasNext());
    assertSame(root, it.next());
    assertFalse(it.hasNext());

    try {
      it.next();
      fail("Should throw NoSuchElementException");
    } catch (NoSuchElementException expected) {
    }

    try {
      it.remove();
      fail("Should throw UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
    }
  }

  @Test
  public void testEquivalenceAndTreeEquals() {
    Node t1 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    Node t2 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    Node t3 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(3));

    assertTrue(t1.isEquivalentTo(t2));
    assertFalse(t1.isEquivalentTo(t3));
    assertNull(t1.checkTreeEquals(t2));
    assertNotNull(t1.checkTreeEquals(t3));
    assertNull(t1.checkTreeTypeAwareEqualsImpl(t2));

    Node inc1 = new Node(Token.INC);
    inc1.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG);
    Node inc2 = new Node(Token.INC);
    inc2.putIntProp(Node.INCRDECR_PROP, Node.DECR_FLAG);
    assertFalse(inc1.isEquivalentTo(inc2));

    Node key1 = Node.newString(Token.STRING_KEY, "k");
    key1.setQuotedString();
    Node key2 = Node.newString(Token.STRING_KEY, "k");
    assertFalse(key1.isEquivalentTo(key2));

    Node slashV1 = Node.newString("a");
    slashV1.putIntProp(Node.SLASH_V, 1);
    Node slashV2 = Node.newString("a");
    assertFalse(slashV1.isEquivalentTo(slashV2));

    Node call1 = new Node(Token.CALL);
    call1.putBooleanProp(Node.FREE_CALL, true);
    Node call2 = new Node(Token.CALL);
    assertFalse(call1.isEquivalentTo(call2));

    Node fnParent1 = new Node(Token.BLOCK, new Node(Token.FUNCTION));
    Node fnParent2 = new Node(Token.BLOCK, new Node(Token.FUNCTION));
    assertTrue(fnParent1.isEquivalentToShallow(fnParent2));
    assertTrue(fnParent1.isEquivalentToTyped(fnParent2));
  }

  @Test
  public void testQualifiedNames() {
    Node name = Node.newString(Token.NAME, "a");
    assertEquals("a", name.getQualifiedName());
    assertTrue(name.isQualifiedName());
    assertTrue(name.isUnscopedQualifiedName());

    Node emptyName = Node.newString(Token.NAME, "");
    assertNull(emptyName.getQualifiedName());
    assertFalse(emptyName.isQualifiedName());
    assertFalse(emptyName.isUnscopedQualifiedName());

    Node thisNode = new Node(Token.THIS);
    assertEquals("this", thisNode.getQualifiedName());
    assertTrue(thisNode.isQualifiedName());
    assertFalse(thisNode.isUnscopedQualifiedName());

    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b"));
    assertEquals("a.b", getprop.getQualifiedName());
    assertTrue(getprop.isQualifiedName());
    assertTrue(getprop.isUnscopedQualifiedName());

    Node invalidGetprop = new Node(Token.GETPROP, new Node(Token.NUMBER), Node.newString("b"));
    assertNull(invalidGetprop.getQualifiedName());

    Node notName = new Node(Token.TRUE);
    assertNull(notName.getQualifiedName());
    assertFalse(notName.isQualifiedName());
    assertFalse(notName.isUnscopedQualifiedName());
  }

  @Test
  public void testToStringAndToStringTree() throws IOException {
    Node root = Node.newString(Token.NAME, "x", 1, 0);
    root.putIntProp(Node.LENGTH, 5);
    String str = root.toString();
    assertTrue(str.contains("NAME x 1"));
    assertTrue(str.contains("length: 5"));

    Node fn = new Node(Token.FUNCTION);
    assertTrue(fn.toString().contains("<invalid>"));

    Node fnValid = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"));
    assertTrue(fnValid.toString().contains("myFunc"));

    Node num = Node.newNumber(12.3);
    assertTrue(num.toString().contains("12.3"));

    Node tree = new Node(Token.BLOCK, root);
    String treeStr = tree.toStringTree();
    assertTrue(treeStr.contains("BLOCK"));
    assertTrue(treeStr.contains("NAME x"));

    StringBuilder sb = new StringBuilder();
    tree.appendStringTree(sb);
    assertEquals(treeStr, sb.toString());
  }

  @Test
  public void testAllPropToStringCases() {
    int[] props = new int[]{
        Node.VAR_ARGS_NAME, Node.JSDOC_INFO_PROP, Node.INCRDECR_PROP,
        Node.QUOTED_PROP, Node.OPT_ARG_NAME, Node.SYNTHETIC_BLOCK_PROP,
        Node.EMPTY_BLOCK, Node.ORIGINALNAME_PROP, Node.SIDE_EFFECT_FLAGS,
        Node.IS_CONSTANT_NAME, Node.IS_NAMESPACE, Node.IS_DISPATCHER,
        Node.DIRECTIVES, Node.DIRECT_EVAL, Node.FREE_CALL,
        Node.STATIC_SOURCE_FILE, Node.INPUT_ID, Node.LENGTH,
        Node.SLASH_V, Node.INFERRED_FUNCTION, Node.CHANGE_TIME,
        Node.REFLECTED_OBJECT
    };
    for (int p : props) {
      Node n = new Node(Token.BLOCK);
      n.putIntProp(p, 1);
      String s = n.toString(false, true, false);
      assertNotNull(s);
      assertTrue(s.contains("["));
    }
  }

  @Test(expected = IllegalStateException.class)
  public void testPropToString_invalid_throwsException() {
    Node n = new Node(Token.BLOCK);
    n.putIntProp(9999, 1);
    n.toString(false, true, false);
  }

  @Test
  public void testAnnotationsAndCustomFlags() {
    Node n = new Node(Token.NAME);
    n.setChangeTime(12345);
    assertEquals(12345, n.getChangeTime());

    n.setVarArgs(true);
    assertTrue(n.isVarArgs());

    n.setOptionalArg(true);
    assertTrue(n.isOptionalArg());

    n.setIsSyntheticBlock(true);
    assertTrue(n.isSyntheticBlock());

    n.setWasEmptyNode(true);
    assertTrue(n.wasEmptyNode());

    Set<String> directives = new HashSet<String>();
    directives.add("use strict");
    n.setDirectives(directives);
    assertEquals(directives, n.getDirectives());

    n.setJSType(null);
    assertNull(n.getJSType());

    n.addSuppression("missingProperties");
    assertNotNull(n.getJSDocInfo());
    assertTrue(n.getJSDocInfo().getSuppressions().contains("missingProperties"));

    Node fnNode = new Node(Token.SCRIPT);
    fnNode.getJsDocBuilderForNode().append("/* license */");
    assertNotNull(fnNode.getJSDocInfo());
    assertEquals("/* license */", fnNode.getJSDocInfo().getLicense());
    fnNode.getJsDocBuilderForNode().append(" extra");
    assertEquals("/* license */ extra", fnNode.getJSDocInfo().getLicense());
  }

  @Test
  public void testSideEffectFlags() {
    Node call = new Node(Token.CALL);
    Node.SideEffectFlags flags = new Node.SideEffectFlags();
    assertTrue(flags.areAllFlagsSet());

    flags.clearAllFlags();
    assertFalse(flags.areAllFlagsSet());

    flags.clearSideEffectFlags();
    flags.setMutatesGlobalState();
    flags.setThrows();
    flags.setMutatesThis();
    flags.setMutatesArguments();
    flags.setReturnsTainted();
    flags.setAllFlags();
    assertTrue(flags.areAllFlagsSet());

    Node.SideEffectFlags custom = new Node.SideEffectFlags(Node.NO_SIDE_EFFECTS);
    call.setSideEffectFlags(custom);
    assertTrue(call.isNoSideEffectsCall());

    call.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    assertTrue(call.isLocalResultCall());

    call.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_ARGUMENTS_UNMODIFIED | Node.FLAG_NO_THROWS);
    assertTrue(call.isOnlyModifiesThisCall());

    call.setSideEffectFlags(Node.FLAG_GLOBAL_STATE_UNMODIFIED | Node.FLAG_THIS_UNMODIFIED | Node.FLAG_NO_THROWS);
    assertTrue(call.isOnlyModifiesArgumentsCall());

    call.setSideEffectFlags(0);
    assertTrue(call.mayMutateArguments());
    assertTrue(call.mayMutateGlobalStateOrThrow());

    Node newNode = new Node(Token.NEW);
    newNode.setSideEffectFlags(0);
    assertEquals(0, newNode.getSideEffectFlags());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSetSideEffectFlags_invalidNode_throwsException() {
    Node n = new Node(Token.BLOCK);
    n.setSideEffectFlags(0);
  }

  @Test
  public void testNodeMismatch_equalsAndHashCode() {
    Node a = new Node(Token.TRUE);
    Node b = new Node(Token.FALSE);
    Node.NodeMismatch m1 = new Node.NodeMismatch(a, b);
    Node.NodeMismatch m2 = new Node.NodeMismatch(a, b);
    Node.NodeMismatch m3 = new Node.NodeMismatch(b, a);

    assertEquals(m1, m2);
    assertFalse(m1.equals(m3));
    assertFalse(m1.equals("string"));
    assertEquals(m1.hashCode(), m2.hashCode());
  }

  @Test
  public void testAstTypePredicates() {
    int[] tokens = new int[]{
        Token.ADD, Token.AND, Token.ARRAYLIT, Token.ASSIGN, Token.ASSIGN_ADD,
        Token.BLOCK, Token.BREAK, Token.CALL, Token.CASE, Token.CAST,
        Token.CATCH, Token.COMMA, Token.CONTINUE, Token.DEBUGGER, Token.DEC,
        Token.DEFAULT_CASE, Token.DELPROP, Token.DO, Token.EMPTY, Token.EXPR_RESULT,
        Token.FALSE, Token.FOR, Token.FUNCTION, Token.GETTER_DEF, Token.GETELEM,
        Token.GETPROP, Token.HOOK, Token.IF, Token.IN, Token.INC,
        Token.INSTANCEOF, Token.LABEL, Token.LABEL_NAME, Token.NAME, Token.NE,
        Token.NEW, Token.NOT, Token.NULL, Token.NUMBER, Token.OBJECTLIT,
        Token.OR, Token.PARAM_LIST, Token.REGEXP, Token.RETURN, Token.SCRIPT,
        Token.SETTER_DEF, Token.STRING, Token.STRING_KEY, Token.SWITCH, Token.THIS,
        Token.THROW, Token.TRUE, Token.TRY, Token.TYPEOF, Token.VAR,
        Token.VOID, Token.WHILE, Token.WITH
    };

    for (int t : tokens) {
      Node n = new Node(t);
      assertEquals(t == Token.ADD, n.isAdd());
      assertEquals(t == Token.AND, n.isAnd());
      assertEquals(t == Token.ARRAYLIT, n.isArrayLit());
      assertEquals(t == Token.ASSIGN, n.isAssign());
      assertEquals(t == Token.ASSIGN_ADD, n.isAssignAdd());
      assertEquals(t == Token.BLOCK, n.isBlock());
      assertEquals(t == Token.BREAK, n.isBreak());
      assertEquals(t == Token.CALL, n.isCall());
      assertEquals(t == Token.CASE, n.isCase());
      assertEquals(t == Token.CAST, n.isCast());
      assertEquals(t == Token.CATCH, n.isCatch());
      assertEquals(t == Token.COMMA, n.isComma());
      assertEquals(t == Token.CONTINUE, n.isContinue());
      assertEquals(t == Token.DEBUGGER, n.isDebugger());
      assertEquals(t == Token.DEC, n.isDec());
      assertEquals(t == Token.DEFAULT_CASE, n.isDefaultCase());
      assertEquals(t == Token.DELPROP, n.isDelProp());
      assertEquals(t == Token.DO, n.isDo());
      assertEquals(t == Token.EMPTY, n.isEmpty());
      assertEquals(t == Token.EXPR_RESULT, n.isExprResult());
      assertEquals(t == Token.FALSE, n.isFalse());
      assertEquals(t == Token.FOR, n.isFor());
      assertEquals(t == Token.FUNCTION, n.isFunction());
      assertEquals(t == Token.GETTER_DEF, n.isGetterDef());
      assertEquals(t == Token.GETELEM, n.isGetElem());
      assertEquals(t == Token.GETPROP, n.isGetProp());
      assertEquals(t == Token.HOOK, n.isHook());
      assertEquals(t == Token.IF, n.isIf());
      assertEquals(t == Token.IN, n.isIn());
      assertEquals(t == Token.INC, n.isInc());
      assertEquals(t == Token.INSTANCEOF, n.isInstanceOf());
      assertEquals(t == Token.LABEL, n.isLabel());
      assertEquals(t == Token.LABEL_NAME, n.isLabelName());
      assertEquals(t == Token.NAME, n.isName());
      assertEquals(t == Token.NE, n.isNE());
      assertEquals(t == Token.NEW, n.isNew());
      assertEquals(t == Token.NOT, n.isNot());
      assertEquals(t == Token.NULL, n.isNull());
      assertEquals(t == Token.NUMBER, n.isNumber());
      assertEquals(t == Token.OBJECTLIT, n.isObjectLit());
      assertEquals(t == Token.OR, n.isOr());
      assertEquals(t == Token.PARAM_LIST, n.isParamList());
      assertEquals(t == Token.REGEXP, n.isRegExp());
      assertEquals(t == Token.RETURN, n.isReturn());
      assertEquals(t == Token.SCRIPT, n.isScript());
      assertEquals(t == Token.SETTER_DEF, n.isSetterDef());
      assertEquals(t == Token.STRING, n.isString());
      assertEquals(t == Token.STRING_KEY, n.isStringKey());
      assertEquals(t == Token.SWITCH, n.isSwitch());
      assertEquals(t == Token.THIS, n.isThis());
      assertEquals(t == Token.THROW, n.isThrow());
      assertEquals(t == Token.TRUE, n.isTrue());
      assertEquals(t == Token.TRY, n.isTry());
      assertEquals(t == Token.TYPEOF, n.isTypeOf());
      assertEquals(t == Token.VAR, n.isVar());
      assertEquals(t == Token.VOID, n.isVoid());
      assertEquals(t == Token.WHILE, n.isWhile());
      assertEquals(t == Token.WITH, n.isWith());
    }
  }
}
