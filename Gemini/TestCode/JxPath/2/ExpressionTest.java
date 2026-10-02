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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {

    private static class DummyExpression extends Expression {
        private boolean contextDependentResult;
        private int computeContextDependentCallCount = 0;
        private Object computeResult;
        private Object computeValueResult;

        public DummyExpression(boolean contextDependentResult, Object computeResult, Object computeValueResult) {
            this.contextDependentResult = contextDependentResult;
            this.computeResult = computeResult;
            this.computeValueResult = computeValueResult;
        }

        public boolean computeContextDependent() {
            computeContextDependentCallCount++;
            return contextDependentResult;
        }

        public Object computeValue(EvalContext context) {
            return computeValueResult;
        }

        public Object compute(EvalContext context) {
            return computeResult;
        }

        public int getComputeContextDependentCallCount() {
            return computeContextDependentCallCount;
        }
    }

    private EvalContext createTestEvalContext(Object rootObject) {
        JXPathContextReferenceImpl context = (JXPathContextReferenceImpl) JXPathContext.newContext(rootObject);
        RootContext rootContext = context.getRootContext();
        return new InitialContext(rootContext);
    }

    @Test
    public void testConstants_initialization_valuesCorrect() {
        Assert.assertEquals(Double.valueOf(0.0), Expression.ZERO);
        Assert.assertEquals(Double.valueOf(1.0), Expression.ONE);
        Assert.assertTrue(Double.isNaN(Expression.NOT_A_NUMBER.doubleValue()));
    }

    @Test
    public void testIsContextDependent_whenTrue_cachedAfterFirstCall() {
        DummyExpression expr = new DummyExpression(true, null, null);
        Assert.assertEquals(0, expr.getComputeContextDependentCallCount());

        boolean firstCall = expr.isContextDependent();
        Assert.assertTrue(firstCall);
        Assert.assertEquals(1, expr.getComputeContextDependentCallCount());

        boolean secondCall = expr.isContextDependent();
        Assert.assertTrue(secondCall);
        Assert.assertEquals(1, expr.getComputeContextDependentCallCount());
    }

    @Test
    public void testIsContextDependent_whenFalse_cachedAfterFirstCall() {
        DummyExpression expr = new DummyExpression(false, null, null);
        Assert.assertEquals(0, expr.getComputeContextDependentCallCount());

        boolean firstCall = expr.isContextDependent();
        Assert.assertFalse(firstCall);
        Assert.assertEquals(1, expr.getComputeContextDependentCallCount());

        boolean secondCall = expr.isContextDependent();
        Assert.assertFalse(secondCall);
        Assert.assertEquals(1, expr.getComputeContextDependentCallCount());
    }

    @Test
    public void testComputeValue_returnsConfiguredValue() {
        DummyExpression expr = new DummyExpression(false, "computeResult", "computeValueResult");
        EvalContext context = createTestEvalContext(new Object());
        Assert.assertEquals("computeValueResult", expr.computeValue(context));
    }

    @Test
    public void testIterate_whenComputeReturnsEvalContext_returnsValueIterator() {
        EvalContext context = createTestEvalContext("rootValue");
        DummyExpression expr = new DummyExpression(false, context, null);

        Iterator iterator = expr.iterate(context);
        Assert.assertNotNull(iterator);
        Assert.assertTrue(iterator instanceof Expression.ValueIterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("rootValue", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterate_whenComputeReturnsList_returnsValueUtilsIterator() {
        List<String> list = Arrays.asList("item1", "item2");
        DummyExpression expr = new DummyExpression(false, list, null);
        EvalContext context = createTestEvalContext(new Object());

        Iterator iterator = expr.iterate(context);
        Assert.assertNotNull(iterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("item1", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("item2", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterate_whenComputeReturnsNull_returnsEmptyIterator() {
        DummyExpression expr = new DummyExpression(false, null, null);
        EvalContext context = createTestEvalContext(new Object());

        Iterator iterator = expr.iterate(context);
        Assert.assertNotNull(iterator);
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratePointers_whenComputeReturnsNull_returnsEmptyIterator() {
        DummyExpression expr = new DummyExpression(false, null, null);
        EvalContext context = createTestEvalContext(new Object());

        Iterator iterator = expr.iteratePointers(context);
        Assert.assertNotNull(iterator);
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratePointers_whenComputeReturnsEvalContext_returnsEvalContextDirectly() {
        EvalContext context = createTestEvalContext("testRoot");
        DummyExpression expr = new DummyExpression(false, context, null);

        Iterator iterator = expr.iteratePointers(context);
        Assert.assertSame(context, iterator);
    }

    @Test
    public void testIteratePointers_whenComputeReturnsValueList_returnsPointerIterator() {
        List<String> list = Arrays.asList("alpha", "beta");
        DummyExpression expr = new DummyExpression(false, list, null);
        EvalContext context = createTestEvalContext(new Object());

        Iterator iterator = expr.iteratePointers(context);
        Assert.assertNotNull(iterator);
        Assert.assertTrue(iterator instanceof Expression.PointerIterator);
        Assert.assertTrue(iterator.hasNext());

        Object first = iterator.next();
        Assert.assertTrue(first instanceof Pointer);
        Assert.assertEquals("alpha", ((Pointer) first).getValue());

        Assert.assertTrue(iterator.hasNext());
        Object second = iterator.next();
        Assert.assertTrue(second instanceof Pointer);
        Assert.assertEquals("beta", ((Pointer) second).getValue());

        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testPointerIterator_whenItemIsPointer_returnsDirectly() {
        NodePointer pointer1 = NodePointer.newNodePointer(new QName("test"), "value1", Locale.US);
        NodePointer pointer2 = NodePointer.newNodePointer(new QName("test"), "value2", Locale.US);
        List<Object> list = Arrays.<Object>asList(pointer1, pointer2);

        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), new QName("default"), Locale.US);

        Assert.assertTrue(it.hasNext());
        Assert.assertSame(pointer1, it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertSame(pointer2, it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testPointerIterator_whenItemIsNotPointer_wrapsInNodePointer() {
        List<Object> list = Arrays.<Object>asList("value1", Integer.valueOf(100));
        QName qName = new QName("customName");
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), qName, Locale.GERMANY);

        Assert.assertTrue(it.hasNext());
        Object first = it.next();
        Assert.assertTrue(first instanceof NodePointer);
        NodePointer np1 = (NodePointer) first;
        Assert.assertEquals("value1", np1.getValue());
        Assert.assertEquals(qName, np1.getName());
        Assert.assertEquals(Locale.GERMANY, np1.getLocale());

        Assert.assertTrue(it.hasNext());
        Object second = it.next();
        Assert.assertTrue(second instanceof NodePointer);
        NodePointer np2 = (NodePointer) second;
        Assert.assertEquals(Integer.valueOf(100), np2.getValue());
        Assert.assertEquals(Locale.GERMANY, np2.getLocale());

        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testPointerIterator_emptyIterator_hasNextFalse() {
        Expression.PointerIterator it = new Expression.PointerIterator(
                Collections.emptyList().iterator(), new QName("test"), Locale.ENGLISH);
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPointerIterator_remove_throwsException() {
        List<String> list = Arrays.asList("item");
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), new QName("test"), Locale.US);
        it.remove();
    }

    @Test
    public void testValueIterator_whenItemIsPointer_unwrapsValue() {
        NodePointer pointer1 = NodePointer.newNodePointer(new QName("test"), "unwrapped1", Locale.US);
        NodePointer pointer2 = NodePointer.newNodePointer(new QName("test"), Integer.valueOf(42), Locale.US);
        List<Object> list = Arrays.<Object>asList(pointer1, pointer2);

        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("unwrapped1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Integer.valueOf(42), it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testValueIterator_whenItemIsNotPointer_returnsRawValue() {
        List<Object> list = Arrays.<Object>asList("rawString", Integer.valueOf(123), null);

        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("rawString", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Integer.valueOf(123), it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertNull(it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testValueIterator_emptyIterator_hasNextFalse() {
        Expression.ValueIterator it = new Expression.ValueIterator(Collections.emptyList().iterator());
        Assert.assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValueIterator_remove_throwsException() {
        List<String> list = Arrays.asList("item");
        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());
        it.remove();
    }
}
