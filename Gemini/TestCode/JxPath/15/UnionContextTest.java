package org.apache.commons.jxpath.ri.axes;

import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class UnionContextTest {

    @Test
    public void testGetDocumentOrder_emptyContexts_returnsSuperDocumentOrder() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "data", Locale.getDefault());
        RootContext root = new RootContext(jxContext, ptr);
        InitialContext parentContext = new InitialContext(root);

        EvalContext[] contexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(parentContext, contexts);

        Assert.assertEquals(0, unionContext.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_singleContext_returnsSuperDocumentOrder() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "data", Locale.getDefault());
        RootContext root = new RootContext(jxContext, ptr);
        InitialContext singleContext = new InitialContext(root);

        EvalContext[] contexts = new EvalContext[] { singleContext };
        UnionContext unionContext = new UnionContext(null, contexts);

        Assert.assertEquals(0, unionContext.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_multipleContexts_returnsOne() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr1 = NodePointer.newNodePointer(new QName("test1"), "data1", Locale.getDefault());
        NodePointer ptr2 = NodePointer.newNodePointer(new QName("test2"), "data2", Locale.getDefault());

        InitialContext ctx1 = new InitialContext(new RootContext(jxContext, ptr1));
        InitialContext ctx2 = new InitialContext(new RootContext(jxContext, ptr2));

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        Assert.assertEquals(1, unionContext.getDocumentOrder());
    }

    @Test(expected = NullPointerException.class)
    public void testGetDocumentOrder_nullContextsArray_throwsNullPointerException() {
        UnionContext unionContext = new UnionContext(null, null);
        unionContext.getDocumentOrder();
    }

    @Test
    public void testSetPosition_emptyContexts_returnsFalse() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[0]);

        Assert.assertFalse(unionContext.setPosition(1));
        Assert.assertEquals(0, unionContext.getPosition());
    }

    @Test
    public void testSetPosition_multipleContexts_mergesAndSetsPosition() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr1 = NodePointer.newNodePointer(new QName("test1"), "data1", Locale.getDefault());
        NodePointer ptr2 = NodePointer.newNodePointer(new QName("test2"), "data2", Locale.getDefault());

        InitialContext ctx1 = new InitialContext(new RootContext(jxContext, ptr1));
        InitialContext ctx2 = new InitialContext(new RootContext(jxContext, ptr2));

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        Assert.assertTrue(unionContext.setPosition(1));
        Assert.assertEquals(1, unionContext.getPosition());
        Assert.assertEquals(ptr1, unionContext.getCurrentNodePointer());

        Assert.assertTrue(unionContext.setPosition(2));
        Assert.assertEquals(2, unionContext.getPosition());
        Assert.assertEquals(ptr2, unionContext.getCurrentNodePointer());

        Assert.assertFalse(unionContext.setPosition(3));
    }

    @Test
    public void testSetPosition_duplicatePointers_filtersOutDuplicates() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "data", Locale.getDefault());

        InitialContext ctx1 = new InitialContext(new RootContext(jxContext, ptr));
        InitialContext ctx2 = new InitialContext(new RootContext(jxContext, ptr));

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        Assert.assertTrue(unionContext.setPosition(1));
        Assert.assertEquals(ptr, unionContext.getCurrentNodePointer());

        Assert.assertFalse(unionContext.setPosition(2));
        Assert.assertEquals(1, unionContext.getNodeSet().getPointers().size());
    }

    @Test
    public void testSetPosition_calledMultipleTimes_executesPreparationOnlyOnce() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "data", Locale.getDefault());

        InitialContext ctx = new InitialContext(new RootContext(jxContext, ptr));
        UnionContext unionContext = new UnionContext(null, new EvalContext[] { ctx });

        Assert.assertTrue(unionContext.setPosition(1));
        Assert.assertEquals(ptr, unionContext.getCurrentNodePointer());

        Assert.assertTrue(unionContext.setPosition(1));
        Assert.assertEquals(ptr, unionContext.getCurrentNodePointer());
        Assert.assertEquals(1, unionContext.getNodeSet().getPointers().size());
    }

    @Test
    public void testSetPosition_zeroAndNegativePosition_returnsFalse() {
        JXPathContextReferenceImpl jxContext = (JXPathContextReferenceImpl) JXPathContext.newContext(new Object());
        NodePointer ptr = NodePointer.newNodePointer(new QName("test"), "data", Locale.getDefault());

        InitialContext ctx = new InitialContext(new RootContext(jxContext, ptr));
        UnionContext unionContext = new UnionContext(null, new EvalContext[] { ctx });

        Assert.assertFalse(unionContext.setPosition(0));
        Assert.assertFalse(unionContext.setPosition(-1));
    }

    @Test(expected = NullPointerException.class)
    public void testSetPosition_nullContextsArray_throwsNullPointerException() {
        UnionContext unionContext = new UnionContext(null, null);
        unionContext.setPosition(1);
    }
}
