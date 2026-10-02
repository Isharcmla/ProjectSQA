package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationCompareTest {

    private static class ConcreteOperationCompare extends CoreOperationCompare {

        public ConcreteOperationCompare(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        public Object computeValue(EvalContext context) {
            return equal(context, args[0], args[1]) ? Boolean.TRUE : Boolean.FALSE;
        }

        public String getSymbol() {
            return "==";
        }
    }

    private static class CustomObject {
        private final String value;

        public CustomObject(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CustomObject that = (CustomObject) obj;
            return value != null ? value.equals(that.value) : that.value == null;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    private ConcreteOperationCompare op;

    @Before
    public void setUp() {
        op = new ConcreteOperationCompare(new Constant("test1"), new Constant("test2"));
    }

    @Test
    public void testGetPrecedence_returnsTwo() {
        Assert.assertEquals(2, op.getPrecedence());
    }

    @Test
    public void testIsSymmetric_returnsTrue() {
        Assert.assertTrue(op.isSymmetric());
    }

    @Test
    public void testEqual_samePointers_returnsTrue() {
        NodePointer np1 = NodePointer.newNodePointer(new QName("test"), "value", Locale.getDefault());
        Assert.assertTrue(op.equal(np1, np1));
    }

    @Test
    public void testEqual_differentPointersSameValue_returnsTrue() {
        NodePointer np1 = NodePointer.newNodePointer(new QName("test1"), "value", Locale.getDefault());
        NodePointer np2 = NodePointer.newNodePointer(new QName("test2"), "value", Locale.getDefault());
        Assert.assertTrue(op.equal(np1, np2));
    }

    @Test
    public void testEqual_leftPointerRightObject_returnsTrue() {
        NodePointer np1 = NodePointer.newNodePointer(new QName("test"), "value", Locale.getDefault());
        Assert.assertTrue(op.equal(np1, "value"));
    }

    @Test
    public void testEqual_leftObjectRightPointer_returnsTrue() {
        NodePointer np2 = NodePointer.newNodePointer(new QName("test"), "value", Locale.getDefault());
        Assert.assertTrue(op.equal("value", np2));
    }

    @Test
    public void testEqual_bothNull_returnsTrue() {
        Assert.assertTrue(op.equal((Object) null, (Object) null));
    }

    @Test
    public void testEqual_leftNullRightNonNull_returnsFalse() {
        Assert.assertFalse(op.equal(null, "test"));
    }

    @Test
    public void testEqual_leftNonNullRightNull_returnsFalse() {
        Assert.assertFalse(op.equal("test", null));
    }

    @Test
    public void testEqual_booleans_returnsExpectedResult() {
        Assert.assertTrue(op.equal(Boolean.TRUE, Boolean.TRUE));
        Assert.assertFalse(op.equal(Boolean.TRUE, Boolean.FALSE));
        Assert.assertTrue(op.equal(Boolean.TRUE, "true"));
        Assert.assertTrue(op.equal("true", Boolean.TRUE));
        Assert.assertFalse(op.equal(Boolean.FALSE, "true"));
        Assert.assertTrue(op.equal(Boolean.TRUE, Double.valueOf(1.0)));
        Assert.assertTrue(op.equal(Boolean.FALSE, Double.valueOf(0.0)));
    }

    @Test
    public void testEqual_numbers_returnsExpectedResult() {
        Assert.assertTrue(op.equal(Integer.valueOf(10), Integer.valueOf(10)));
        Assert.assertTrue(op.equal(Integer.valueOf(10), Double.valueOf(10.0)));
        Assert.assertTrue(op.equal(Integer.valueOf(-5), Double.valueOf(-5.0)));
        Assert.assertTrue(op.equal(Integer.valueOf(0), Double.valueOf(0.0)));
        Assert.assertTrue(op.equal(Integer.valueOf(10), "10"));
        Assert.assertTrue(op.equal("10.0", Integer.valueOf(10)));
        Assert.assertFalse(op.equal(Integer.valueOf(10), Integer.valueOf(20)));
        Assert.assertFalse(op.equal(Double.valueOf(Double.NaN), Double.valueOf(Double.NaN)));
        Assert.assertFalse(op.equal(Double.valueOf(Double.NaN), Integer.valueOf(1)));
        Assert.assertFalse(op.equal(Integer.valueOf(1), Double.valueOf(Double.NaN)));
    }

    @Test
    public void testEqual_strings_returnsExpectedResult() {
        Assert.assertTrue(op.equal("hello", "hello"));
        Assert.assertTrue(op.equal("", ""));
        Assert.assertFalse(op.equal("hello", "world"));
        Assert.assertFalse(op.equal("", "world"));
    }

    @Test
    public void testEqual_customObjects_returnsExpectedResult() {
        CustomObject obj1 = new CustomObject("test");
        CustomObject obj2 = new CustomObject("test");
        CustomObject obj3 = new CustomObject("other");

        Assert.assertTrue(op.equal(obj1, obj2));
        Assert.assertFalse(op.equal(obj1, obj3));
        Assert.assertFalse(op.equal(obj1, new Object()));
    }

    @Test
    public void testContains_emptyIterator_returnsFalse() {
        Iterator it = Collections.emptyList().iterator();
        Assert.assertFalse(op.contains(it, "test"));
    }

    @Test
    public void testContains_matchingElementPresent_returnsTrue() {
        List list = Arrays.asList("a", "b", "c");
        Assert.assertTrue(op.contains(list.iterator(), "b"));
    }

    @Test
    public void testContains_matchingElementNotPresent_returnsFalse() {
        List list = Arrays.asList("a", "b", "c");
        Assert.assertFalse(op.contains(list.iterator(), "d"));
    }

    @Test
    public void testFindMatch_bothEmptyIterators_returnsFalse() {
        Iterator lit = Collections.emptyList().iterator();
        Iterator rit = Collections.emptyList().iterator();
        Assert.assertFalse(op.findMatch(lit, rit));
    }

    @Test
    public void testFindMatch_matchingElementExists_returnsTrue() {
        List l1 = Arrays.asList("a", "b", "c");
        List l2 = Arrays.asList("x", "b", "z");
        Assert.assertTrue(op.findMatch(l1.iterator(), l2.iterator()));
    }

    @Test
    public void testFindMatch_noMatchingElement_returnsFalse() {
        List l1 = Arrays.asList("a", "b", "c");
        List l2 = Arrays.asList("x", "y", "z");
        Assert.assertFalse(op.findMatch(l1.iterator(), l2.iterator()));
    }

    @Test
    public void testEqualContext_bothCollections_returnsMatchResult() {
        Expression left = new Constant("left") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("a", "b", "c");
            }
        };
        Expression right = new Constant("right") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("b", "d");
            }
        };
        Assert.assertTrue(op.equal(null, left, right));

        Expression rightNoMatch = new Constant("rightNoMatch") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("x", "y");
            }
        };
        Assert.assertFalse(op.equal(null, left, rightNoMatch));
    }

    @Test
    public void testEqualContext_leftCollectionRightScalar_returnsMatchResult() {
        Expression left = new Constant("left") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("a", "b", "c");
            }
        };
        Expression right = new Constant("b");
        Assert.assertTrue(op.equal(null, left, right));

        Expression rightNoMatch = new Constant("z");
        Assert.assertFalse(op.equal(null, left, rightNoMatch));
    }

    @Test
    public void testEqualContext_leftScalarRightCollection_returnsMatchResult() {
        Expression left = new Constant("b");
        Expression right = new Constant("right") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("a", "b", "c");
            }
        };
        Assert.assertTrue(op.equal(null, left, right));

        Expression leftNoMatch = new Constant("z");
        Assert.assertFalse(op.equal(null, leftNoMatch, right));
    }

    @Test
    public void testEqualContext_bothIterators_returnsMatchResult() {
        Expression left = new Constant("left") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("1", "2").iterator();
            }
        };
        Expression right = new Constant("right") {
            @Override
            public Object compute(EvalContext context) {
                return Arrays.asList("2", "3").iterator();
            }
        };
        Assert.assertTrue(op.equal(null, left, right));
    }

    @Test
    public void testEqualContext_initialContextLeftAndRight_handlesResetAndCompares() {
        JXPathContextReferenceImpl parentContext =
                (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        RootContext rootContext = new RootContext(parentContext, null);

        final InitialContext leftInitCtx = new InitialContext(rootContext);
        final InitialContext rightInitCtx = new InitialContext(rootContext);

        Expression left = new Constant("left") {
            @Override
            public Object compute(EvalContext context) {
                return leftInitCtx;
            }
        };
        Expression right = new Constant("right") {
            @Override
            public Object compute(EvalContext context) {
                return rightInitCtx;
            }
        };

        boolean result = op.equal(null, left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void testEqualContext_selfContextLeftAndRight_unwrapsSingleNodePointer() {
        JXPathContextReferenceImpl parentContext =
                (JXPathContextReferenceImpl) JXPathContext.newContext("sameValue");
        RootContext rootContext = new RootContext(parentContext, null);
        InitialContext initCtx1 = new InitialContext(rootContext);
        InitialContext initCtx2 = new InitialContext(rootContext);

        final SelfContext leftSelfCtx = new SelfContext(initCtx1, new NodeTypeTest(1));
        final SelfContext rightSelfCtx = new SelfContext(initCtx2, new NodeTypeTest(1));

        Expression left = new Constant("left") {
            @Override
            public Object compute(EvalContext context) {
                return leftSelfCtx;
            }
        };
        Expression right = new Constant("right") {
            @Override
            public Object compute(EvalContext context) {
                return rightSelfCtx;
            }
        };

        boolean result = op.equal(null, left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void testComputeValue_returnsTrueWhenEqual() {
        ConcreteOperationCompare eqOp = new ConcreteOperationCompare(new Constant("match"), new Constant("match"));
        Object result = eqOp.computeValue(null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_returnsFalseWhenNotEqual() {
        ConcreteOperationCompare neqOp = new ConcreteOperationCompare(new Constant("left"), new Constant("right"));
        Object result = neqOp.computeValue(null);
        Assert.assertEquals(Boolean.FALSE, result);
    }
}
