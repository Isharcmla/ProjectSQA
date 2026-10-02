package org.apache.commons.jxpath.ri.axes;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AttributeContextTest {

    private AttributeContext createDomAttributeContext(NodeTest nodeTest, String... attrNameValues) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document doc = factory.newDocumentBuilder().newDocument();
        Element elem = doc.createElement("root");
        for (int i = 0; i < attrNameValues.length; i += 2) {
            elem.setAttribute(attrNameValues[i], attrNameValues[i + 1]);
        }
        NodePointer rootPointer = NodePointer.newNodePointer(new QName("root"), elem, Locale.US);
        JXPathContextReferenceImpl jxPathContext = new JXPathContextReferenceImpl(null, elem, null);
        RootContext rootContext = new RootContext(jxPathContext, rootPointer);
        InitialContext parentContext = new InitialContext(rootContext);
        return new AttributeContext(parentContext, nodeTest);
    }

    @Test
    public void testGetCurrentNodePointer_initially_returnsNull() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("attr")), "attr", "val");
        Assert.assertNull(context.getCurrentNodePointer());
        Assert.assertEquals(0, context.getCurrentPosition());
    }

    @Test
    public void testNextNode_withMatchingAttribute_returnsTrueAndSetsPointer() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("id")), "id", "123");
        
        Assert.assertTrue(context.nextNode());
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());
        Assert.assertEquals("id", context.getCurrentNodePointer().getName().getName());

        Assert.assertFalse(context.nextNode());
        Assert.assertEquals(2, context.getCurrentPosition());
    }

    @Test
    public void testNextNode_wildcardAttribute_iteratesMultipleAttributes() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("*")), "a", "1", "b", "2");

        Assert.assertTrue(context.nextNode());
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());

        Assert.assertTrue(context.nextNode());
        Assert.assertEquals(2, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());

        Assert.assertFalse(context.nextNode());
        Assert.assertEquals(3, context.getCurrentPosition());
    }

    @Test
    public void testNextNode_nonExistentAttribute_returnsFalse() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("nonExistent")), "attr", "val");
        
        Assert.assertFalse(context.nextNode());
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_nonNodeNameTest_returnsFalse() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        AttributeContext context = createDomAttributeContext(nodeTypeTest, "attr", "val");

        Assert.assertFalse(context.nextNode());
        Assert.assertNull(context.getCurrentNodePointer());

        // Subsequent call when setStarted is already true and iterator is null
        Assert.assertFalse(context.nextNode());
    }

    @Test
    public void testNextNode_nullNodeTest_returnsFalse() throws Exception {
        AttributeContext context = createDomAttributeContext(null, "attr", "val");

        Assert.assertFalse(context.nextNode());
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_nullIteratorFromParent_returnsFalse() {
        EvalContext parentContext = new EvalContext(null) {
            @Override
            public NodePointer getCurrentNodePointer() {
                return new NodePointer(null, Locale.US) {
                    @Override
                    public NodeIterator attributeIterator(QName name) {
                        return null;
                    }

                    @Override
                    public boolean isLeaf() {
                        return true;
                    }

                    @Override
                    public boolean isCollection() {
                        return false;
                    }

                    @Override
                    public int getLength() {
                        return 1;
                    }

                    @Override
                    public QName getName() {
                        return null;
                    }

                    @Override
                    public Object getBaseValue() {
                        return null;
                    }

                    @Override
                    public Object getImmediateNode() {
                        return null;
                    }

                    @Override
                    public void setValue(Object value) {}

                    @Override
                    public int compareChildPosition(NodePointer pointer1, NodePointer pointer2) {
                        return 0;
                    }
                };
            }

            @Override
            public boolean nextNode() {
                return true;
            }

            @Override
            public boolean nextSet() {
                return true;
            }

            @Override
            public int getDocumentOrder() {
                return 0;
            }

            @Override
            public boolean setPosition(int position) {
                return true;
            }
        };

        AttributeContext context = new AttributeContext(parentContext, new NodeNameTest(new QName("test")));
        Assert.assertFalse(context.nextNode());
    }

    @Test
    public void testSetPosition_forwardValid_returnsTrue() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("*")), "k1", "v1", "k2", "v2");

        Assert.assertTrue(context.setPosition(2));
        Assert.assertEquals(2, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_forwardBeyondBounds_returnsFalse() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("id")), "id", "val");

        Assert.assertFalse(context.setPosition(3));
        Assert.assertEquals(2, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_backward_resetsAndRepoisitions() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("*")), "k1", "v1", "k2", "v2");

        Assert.assertTrue(context.setPosition(2));
        Assert.assertEquals(2, context.getCurrentPosition());

        Assert.assertTrue(context.setPosition(1));
        Assert.assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_toSamePosition_returnsTrue() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("id")), "id", "val");

        Assert.assertTrue(context.setPosition(1));
        Assert.assertTrue(context.setPosition(1));
        Assert.assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_toZeroAndNegative_resetsAndReturnsTrue() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("id")), "id", "val");

        Assert.assertTrue(context.setPosition(1));
        Assert.assertEquals(1, context.getCurrentPosition());

        Assert.assertTrue(context.setPosition(0));
        Assert.assertEquals(0, context.getCurrentPosition());

        Assert.assertTrue(context.setPosition(-1));
        Assert.assertEquals(0, context.getCurrentPosition());
    }

    @Test
    public void testReset_allowsReiteration() throws Exception {
        AttributeContext context = createDomAttributeContext(new NodeNameTest(new QName("id")), "id", "val");

        Assert.assertTrue(context.nextNode());
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());

        context.reset();
        Assert.assertEquals(0, context.getCurrentPosition());

        Assert.assertTrue(context.nextNode());
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertNotNull(context.getCurrentNodePointer());
    }
}
