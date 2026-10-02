package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoreOperationCompareTest {

    private static class ConcreteCompareOperation extends CoreOperationCompare {
        public ConcreteCompareOperation(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        @Override
        public Object computeValue(EvalContext context) {
            return equal(context, args[0], args[1]) ? Boolean.TRUE : Boolean.FALSE;
        }

        @Override
        public String getSymbol() {
            return "==";
        }

        @Override
        public boolean isSymmetric() {
            return true;
        }

        @Override
        public int getPrecedence() {
            return 2;
        }

        public boolean invokeEqual(EvalContext context, Expression left, Expression right) {
            return equal(context, left, right);
        }

        public boolean invokeContains(Iterator it, Object value) {
            return contains(it, value);
        }

        public boolean invokeFindMatch(Iterator lit, Iterator rit) {
            return findMatch(lit, rit);
        }

        public boolean invokeEqual(Object l, Object r) {
            return equal(l, r);
        }
    }

    private static class ValueExpression extends Expression {
        private final Object value;

        public ValueExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static class CustomObject {
        private final int id;

        public CustomObject(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CustomObject that = (CustomObject) obj;
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    private ConcreteCompareOperation operation;

    @Before
    public void setUp() {
        operation = new ConcreteCompareOperation(new Constant("left"), new Constant("right"));
    }

    @Test
    public void testConstructor_initializesArgumentsCorrectly() {
        Expression arg1 = new Constant("a");
        Expression arg2 = new Constant("b");
        ConcreteCompareOperation op = new ConcreteCompareOperation(arg1, arg2);

        assertArrayEquals(new Expression[]{arg1, arg2}, op.getArguments());
        assertEquals("==", op.getSymbol());
        assertTrue(op.isSymmetric());
        assertEquals(2, op.getPrecedence());
    }

    @Test
    public void testEqualObject_sameReferenceOrBothNull_returnsTrue() {
        assertTrue(operation.invokeEqual((Object) null, (Object) null));

        Object obj = new Object();
        assertTrue(operation.invokeEqual(obj, obj));
    }

    @Test
    public void testEqualObject_oneNullOtherNotNull_returnsFalse() {
        assertFalse(operation.invokeEqual(null, "test"));
        assertFalse(operation.invokeEqual("test", null));
        assertFalse(operation.invokeEqual(null, new CustomObject(1)));
        assertFalse(operation.invokeEqual(new CustomObject(1), null));
    }

    @Test
    public void testEqualObject_bothPointersEqual_returnsTrue() {
        QName name = new QName("var");
        VariablePointer p1 = new VariablePointer(name);
        VariablePointer p2 = new VariablePointer(name);

        assertTrue(operation.invokeEqual(p1, p2));
    }

    @Test
    public void testEqualObject_pointersWithEqualValues_returnsTrue() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer p1 = context.getPointer("'hello'");
        Pointer p2 = context.getPointer("'hello'");

        assertTrue(operation.invokeEqual(p1, p2));
    }

    @Test
    public void testEqualObject_pointersWithDifferentValues_returnsFalse() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer p1 = context.getPointer("'hello'");
        Pointer p2 = context.getPointer("'world'");

        assertFalse(operation.invokeEqual(p1, p2));
    }

    @Test
    public void testEqualObject_leftPointerRightValue() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer p1 = context.getPointer("'testVal'");

        assertTrue(operation.invokeEqual(p1, "testVal"));
        assertFalse(operation.invokeEqual(p1, "otherVal"));
    }

    @Test
    public void testEqualObject_leftValueRightPointer() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer p2 = context.getPointer("100");

        assertTrue(operation.invokeEqual(100.0, p2));
        assertFalse(operation.invokeEqual(50, p2));
    }

    @Test
    public void testEqualObject_booleanComparisons() {
        assertTrue(operation.invokeEqual(Boolean.TRUE, Boolean.TRUE));
        assertTrue(operation.invokeEqual(Boolean.FALSE, Boolean.FALSE));
        assertFalse(operation.invokeEqual(Boolean.TRUE, Boolean.FALSE));

        assertTrue(operation.invokeEqual(Boolean.TRUE, "true"));
        assertTrue(operation.invokeEqual(Boolean.TRUE, 1));
        assertFalse(operation.invokeEqual(Boolean.TRUE, 0));
        assertTrue(operation.invokeEqual(Boolean.FALSE, 0));
        assertTrue(operation.invokeEqual("true", Boolean.TRUE));
        assertTrue(operation.invokeEqual(0, Boolean.FALSE));
    }

    @Test
    public void testEqualObject_numberComparisons() {
        assertTrue(operation.invokeEqual(10, 10));
        assertTrue(operation.invokeEqual(10.0, 10));
        assertTrue(operation.invokeEqual(0, -0.0));
        assertTrue(operation.invokeEqual(-5.5, -5.5));
        assertFalse(operation.invokeEqual(10, 20));

        assertTrue(operation.invokeEqual(100, "100"));
        assertTrue(operation.invokeEqual("25.5", 25.5));
        assertFalse(operation.invokeEqual(100, "invalidNumber"));
        assertFalse(operation.invokeEqual(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualObject_stringComparisons() {
        assertTrue(operation.invokeEqual("abc", "abc"));
        assertTrue(operation.invokeEqual("", ""));
        assertFalse(operation.invokeEqual("abc", "def"));
        assertFalse(operation.invokeEqual("abc", ""));

        assertTrue(operation.invokeEqual("Custom", new Object() {
            @Override
            public String toString() {
                return "Custom";
            }
        }));
    }

    @Test
    public void testEqualObject_customObjectsFallback() {
        CustomObject obj1 = new CustomObject(42);
        CustomObject obj2 = new CustomObject(42);
        CustomObject obj3 = new CustomObject(99);

        assertTrue(operation.invokeEqual(obj1, obj2));
        assertFalse(operation.invokeEqual(obj1, obj3));
    }

    @Test
    public void testContains_emptyIterator_returnsFalse() {
        assertFalse(operation.invokeContains(Collections.emptyIterator(), "target"));
    }

    @Test
    public void testContains_matchingElementPresent_returnsTrue() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertTrue(operation.invokeContains(list.iterator(), "b"));
    }

    @Test
    public void testContains_matchingElementAbsent_returnsFalse() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertFalse(operation.invokeContains(list.iterator(), "d"));
    }

    @Test
    public void testFindMatch_bothEmpty_returnsFalse() {
        assertFalse(operation.invokeFindMatch(Collections.emptyIterator(), Collections.emptyIterator()));
    }

    @Test
    public void testFindMatch_leftEmptyRightNonEmpty_returnsFalse() {
        List<String> right = Arrays.asList("a", "b");
        assertFalse(operation.invokeFindMatch(Collections.emptyIterator(), right.iterator()));
    }

    @Test
    public void testFindMatch_leftNonEmptyRightEmpty_returnsFalse() {
        List<String> left = Arrays.asList("a", "b");
        assertFalse(operation.invokeFindMatch(left.iterator(), Collections.emptyIterator()));
    }

    @Test
    public void testFindMatch_matchExists_returnsTrue() {
        List<Integer> left = Arrays.asList(1, 2, 3);
        List<Double> right = Arrays.asList(4.0, 3.0, 5.0);
        assertTrue(operation.invokeFindMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testFindMatch_noMatchExists_returnsFalse() {
        List<String> left = Arrays.asList("a", "b");
        List<String> right = Arrays.asList("c", "d");
        assertFalse(operation.invokeFindMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testEqualContext_bothScalarValues() {
        Expression left = new Constant("value");
        Expression right = new Constant("value");
        assertTrue(operation.invokeEqual(null, left, right));

        Expression rightDiff = new Constant("different");
        assertFalse(operation.invokeEqual(null, left, rightDiff));
    }

    @Test
    public void testEqualContext_leftCollectionRightScalar() {
        List<String> list = Arrays.asList("x", "y", "z");
        Expression left = new ValueExpression(list);
        Expression right = new Constant("y");

        assertTrue(operation.invokeEqual(null, left, right));

        Expression rightNonMatch = new Constant("w");
        assertFalse(operation.invokeEqual(null, left, rightNonMatch));
    }

    @Test
    public void testEqualContext_leftScalarRightCollection() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        Expression left = new Constant(20);
        Expression right = new ValueExpression(list);

        assertTrue(operation.invokeEqual(null, left, right));

        Expression leftNonMatch = new Constant(40);
        assertFalse(operation.invokeEqual(null, leftNonMatch, right));
    }

    @Test
    public void testEqualContext_leftIteratorRightScalar() {
        Expression left = new ValueExpression(Arrays.asList("one", "two").iterator());
        Expression right = new Constant("two");

        assertTrue(operation.invokeEqual(null, left, right));
    }

    @Test
    public void testEqualContext_leftScalarRightIterator() {
        Expression left = new Constant("one");
        Expression right = new ValueExpression(Arrays.asList("one", "two").iterator());

        assertTrue(operation.invokeEqual(null, left, right));
    }

    @Test
    public void testEqualContext_bothCollections() {
        Expression leftMatch = new ValueExpression(Arrays.asList("a", "b"));
        Expression rightMatch = new ValueExpression(Arrays.asList("b", "c"));
        assertTrue(operation.invokeEqual(null, leftMatch, rightMatch));

        Expression leftNoMatch = new ValueExpression(Arrays.asList("a", "b"));
        Expression rightNoMatch = new ValueExpression(Arrays.asList("c", "d"));
        assertFalse(operation.invokeEqual(null, leftNoMatch, rightNoMatch));
    }

    @Test
    public void testEqualContext_bothIterators() {
        Expression left = new ValueExpression(Arrays.asList(1, 2).iterator());
        Expression right = new ValueExpression(Arrays.asList(2, 3).iterator());

        assertTrue(operation.invokeEqual(null, left, right));
    }

    @Test
    public void testEqualContext_initialContextHandling() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext("rootValue");
        RootContext rootContext = new RootContext(jxContext, (NodePointer) jxContext.getPointer("/"));
        InitialContext initCtx = new InitialContext(rootContext);

        Expression left = new ValueExpression(initCtx);
        Expression right = new Constant("rootValue");

        assertTrue(operation.invokeEqual(null, left, right));

        Expression leftScalar = new Constant("rootValue");
        Expression rightCtx = new ValueExpression(initCtx);
        assertTrue(operation.invokeEqual(null, leftScalar, rightCtx));
    }

    @Test
    public void testEqualContext_selfContextHandling() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext("nodeVal");
        RootContext rootContext = new RootContext(jxContext, (NodePointer) jxContext.getPointer("/"));
        InitialContext initCtx = new InitialContext(rootContext);
        SelfContext selfCtx = new SelfContext(initCtx, new NodeTypeTest(Compiler.NODE_TYPE_NODE));

        Expression left = new ValueExpression(selfCtx);
        Expression right = new Constant("nodeVal");

        assertTrue(operation.invokeEqual(null, left, right));

        Expression leftScalar = new Constant("different");
        Expression rightCtx = new ValueExpression(selfCtx);
        assertFalse(operation.invokeEqual(null, leftScalar, rightCtx));
    }

    @Test
    public void testComputeValue_returnsExpectedBooleanObject() {
        ConcreteCompareOperation equalOp = new ConcreteCompareOperation(new Constant("same"), new Constant("same"));
        assertEquals(Boolean.TRUE, equalOp.computeValue(null));

        ConcreteCompareOperation notEqualOp = new ConcreteCompareOperation(new Constant("a"), new Constant("b"));
        assertEquals(Boolean.FALSE, notEqualOp.computeValue(null));
    }
}
