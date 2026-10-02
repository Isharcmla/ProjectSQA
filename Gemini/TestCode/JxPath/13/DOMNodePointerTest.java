package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    @Test
    public void testConstructorsAndGetters() {
        Element root = document.createElement("root");
        document.appendChild(root);

        DOMNodePointer pointer1 = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertSame(root, pointer1.getBaseValue());
        Assert.assertSame(root, pointer1.getImmediateNode());
        Assert.assertSame(root, pointer1.getNode());
        Assert.assertEquals(1, pointer1.getLength());
        Assert.assertTrue(pointer1.isActual());
        Assert.assertFalse(pointer1.isCollection());
        Assert.assertTrue(pointer1.isLeaf());

        DOMNodePointer pointer2 = new DOMNodePointer(root, Locale.FRENCH, "id123");
        Assert.assertEquals("id('id123')", pointer2.asPath());

        DOMNodePointer pointer3 = new DOMNodePointer(pointer1, root);
        Assert.assertSame(pointer1, pointer3.getParent());
    }

    @Test
    public void testTestNode_nullTest() {
        Element elem = document.createElement("test");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNode_nodeNameTest() {
        Element elem = document.createElementNS("http://example.com/ns", "p:test");
        Text text = document.createTextNode("text");

        NodeNameTest nameTestMatch = new NodeNameTest(new QName("p", "test"), "http://example.com/ns");
        NodeNameTest nameTestMismatch = new NodeNameTest(new QName("other"), "http://example.com/ns");
        NodeNameTest wildcardTestNoPrefix = new NodeNameTest(new QName(null, "*"));
        NodeNameTest wildcardTestWithPrefix = new NodeNameTest(new QName("p", "*"), "http://example.com/ns");
        NodeNameTest wildcardMismatchNS = new NodeNameTest(new QName("p", "*"), "http://other.com/ns");

        Assert.assertFalse(DOMNodePointer.testNode(text, nameTestMatch));
        Assert.assertTrue(DOMNodePointer.testNode(elem, nameTestMatch));
        Assert.assertFalse(DOMNodePointer.testNode(elem, nameTestMismatch));
        Assert.assertTrue(DOMNodePointer.testNode(elem, wildcardTestNoPrefix));
        Assert.assertTrue(DOMNodePointer.testNode(elem, wildcardTestWithPrefix));
        Assert.assertFalse(DOMNodePointer.testNode(elem, wildcardMismatchNS));

        Element elemNoNS = document.createElement("foo");
        NodeNameTest nameTestNoNS = new NodeNameTest(new QName("foo"));
        Assert.assertTrue(DOMNodePointer.testNode(elemNoNS, nameTestNoNS));
    }

    @Test
    public void testTestNode_nodeTypeTest() {
        Element elem = document.createElement("test");
        Text text = document.createTextNode("content");
        CDATASection cdata = document.createCDATASection("data");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        NodeTypeTest unknownTypeTest = new NodeTypeTest(999);

        Assert.assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, textTest));

        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, commentTest));

        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));

        Assert.assertFalse(DOMNodePointer.testNode(elem, unknownTypeTest));
    }

    @Test
    public void testTestNode_processingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest piTestMatch = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");

        Assert.assertTrue(DOMNodePointer.testNode(pi, piTestMatch));
        Assert.assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTestMatch));
    }

    @Test
    public void testGetName() {
        Element elem = document.createElementNS("http://example.com", "ns:item");
        DOMNodePointer elemPtr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertEquals(new QName("ns", "item"), elemPtr.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "target"), piPtr.getName());

        Text text = document.createTextNode("text");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, null), textPtr.getName());
    }

    @Test
    public void testGetNamespaceURI_andPrefixes() {
        Element root = document.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns:foo", "http://foo.com");
        root.setAttribute("xmlns", "http://default.com");
        document.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("http://default.com", rootPtr.getDefaultNamespaceURI());
        Assert.assertEquals("http://default.com", rootPtr.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", rootPtr.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, rootPtr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, rootPtr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://foo.com", rootPtr.getNamespaceURI("foo"));
        // Cached value retrieval
        Assert.assertEquals("http://foo.com", rootPtr.getNamespaceURI("foo"));
        Assert.assertNull(rootPtr.getNamespaceURI("unknown"));

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("http://foo.com", docPtr.getNamespaceURI("foo"));
        Assert.assertEquals("http://default.com", docPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetPrefixAndLocalName_staticMethods() {
        Element elem = document.createElementNS("http://foo.com", "pre:local");
        Assert.assertEquals("pre", DOMNodePointer.getPrefix(elem));
        Assert.assertEquals("local", DOMNodePointer.getLocalName(elem));

        Element simpleElem = document.createElement("tag");
        Assert.assertNull(DOMNodePointer.getPrefix(simpleElem));
        Assert.assertEquals("tag", DOMNodePointer.getLocalName(simpleElem));
    }

    @Test
    public void testGetNamespaceURI_fromDocumentAndParentChain() {
        Element parent = document.createElement("parent");
        parent.setAttribute("xmlns:p", "http://parent.com");
        Element child = document.createElement("child");
        parent.appendChild(child);

        Assert.assertEquals("http://parent.com", DOMNodePointer.getNamespaceURI(child));
        Assert.assertNull(DOMNodePointer.getNamespaceURI(parent));
    }

    @Test
    public void testIteratorsAndPointers() {
        Element elem = document.createElement("item");
        elem.setAttribute("attr", "val");
        elem.appendChild(document.createElement("subitem"));

        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);

        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
    }

    @Test
    public void testIsLanguage() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("en-US"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = document.createElement("standalone");
        DOMNodePointer noLangPtr = new DOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
    }

    @Test
    public void testSetValue_textNode() {
        Element root = document.createElement("root");
        Text text = document.createTextNode("initial");
        root.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        textPtr.setValue("");
        Assert.assertNull(text.getParentNode());
    }

    @Test
    public void testSetValue_elementWithVariousObjects() {
        Element root = document.createElement("root");
        root.appendChild(document.createTextNode("old"));
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);

        rootPtr.setValue("new text");
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("new text", root.getFirstChild().getNodeValue());

        Element newChildHolder = document.createElement("holder");
        newChildHolder.appendChild(document.createElement("child1"));
        newChildHolder.appendChild(document.createElement("child2"));

        rootPtr.setValue(newChildHolder);
        Assert.assertEquals(2, root.getChildNodes().getLength());
        Assert.assertEquals("child1", root.getFirstChild().getNodeName());

        Document docSource = document.getImplementation().createDocument(null, "docElem", null);
        rootPtr.setValue(docSource);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("docElem", root.getFirstChild().getNodeName());

        Comment comment = document.createComment("a comment");
        rootPtr.setValue(comment);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals(Node.COMMENT_NODE, root.getFirstChild().getNodeType());
    }

    @Test
    public void testGetValue() {
        Element root = document.createElement("root");
        root.appendChild(document.createTextNode("Hello "));
        CDATASection cdata = document.createCDATASection("World");
        root.appendChild(cdata);
        Comment comment = document.createComment(" ignore ");
        root.appendChild(comment);
        ProcessingInstruction pi = document.createProcessingInstruction("target", " data ");
        root.appendChild(pi);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("Hello Worlddata", rootPtr.getValue());

        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("ignore", commentPtr.getValue());

        root.setAttribute("xml:space", "preserve");
        Assert.assertEquals("Hello World data ", rootPtr.getValue());
    }

    @Test
    public void testAsPath_andEscapes() {
        Element root = document.createElement("root");
        document.appendChild(root);
        Element child1 = document.createElement("item");
        Element child2 = document.createElement("item");
        Text text = document.createTextNode("text");
        ProcessingInstruction pi = document.createProcessingInstruction("piTarget", "piData");

        root.appendChild(child1);
        root.appendChild(child2);
        root.appendChild(text);
        root.appendChild(pi);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);
        DOMNodePointer textPtr = new DOMNodePointer(rootPtr, text);
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);

        Assert.assertEquals("", rootPtr.asPath());
        Assert.assertEquals("/item[2]", child2Ptr.asPath());
        Assert.assertEquals("/text()[1]", textPtr.asPath());
        Assert.assertEquals("/processing-instruction('piTarget')[1]", piPtr.asPath());

        DOMNodePointer idPtr = new DOMNodePointer(root, Locale.ENGLISH, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", idPtr.asPath());

        Element nsChild = document.createElementNS("http://example.com/ns", "item");
        root.appendChild(nsChild);
        DOMNodePointer nsChildPtr = new DOMNodePointer(rootPtr, nsChild);
        Assert.assertEquals("/node()[3]", nsChildPtr.asPath());
    }

    @Test
    public void testRemove_successAndRootException() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        childPtr.remove();
        Assert.assertEquals(0, root.getChildNodes().getLength());

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        try {
            rootPtr.remove();
            Assert.fail("Removing root node should throw JXPathException");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = document.createElement("elem1");
        Element elem2 = document.createElement("elem2");

        DOMNodePointer ptr1a = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer ptr1b = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertEquals(ptr1a, ptr1a);
        Assert.assertEquals(ptr1a, ptr1b);
        Assert.assertNotEquals(ptr1a, ptr2);
        Assert.assertNotEquals(ptr1a, "different_type");
        Assert.assertNotEquals(ptr1a, null);
        Assert.assertEquals(ptr1a.hashCode(), ptr1b.hashCode());
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        child.setAttribute("id", "targetId");
        child.setIdAttribute("id", true);
        root.appendChild(child);
        document.appendChild(root);

        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);

        Pointer found = docPtr.getPointerByID(context, "targetId");
        Assert.assertTrue(found instanceof DOMNodePointer);
        Assert.assertSame(child, found.getNode());

        Pointer notFound = docPtr.getPointerByID(context, "nonExistent");
        Assert.assertTrue(notFound instanceof NullPointer);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        Pointer foundFromChild = childPtr.getPointerByID(context, "targetId");
        Assert.assertSame(child, foundFromChild.getNode());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.createElement("root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");

        Attr attr1 = root.getAttributeNode("attr1");
        Attr attr2 = root.getAttributeNode("attr2");

        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer pAttr1 = new DOMNodePointer(rootPtr, attr1);
        DOMNodePointer pAttr2 = new DOMNodePointer(rootPtr, attr2);
        DOMNodePointer pChild1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer pChild2 = new DOMNodePointer(rootPtr, child2);

        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pAttr1, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pAttr1, pChild1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pChild1, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pAttr1, pAttr2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pAttr2, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pChild2, pChild1));
    }

    @Test
    public void testCreateAttribute_successAndFailure() {
        Element elem = document.createElement("elem");
        elem.setAttribute("xmlns:foo", "http://foo.com");
        DOMNodePointer elemPtr = new DOMNodePointer(elem, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(elem);

        NodePointer attrPtr = elemPtr.createAttribute(context, new QName("simpleAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(elem.hasAttribute("simpleAttr"));

        NodePointer nsAttrPtr = elemPtr.createAttribute(context, new QName("foo", "bar"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertNotNull(elem.getAttributeNodeNS("http://foo.com", "bar"));

        try {
            elemPtr.createAttribute(context, new QName("unknownPrefix", "bar"));
            Assert.fail("Expected exception on unknown namespace prefix");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Unknown namespace prefix"));
        }

        Text text = document.createTextNode("txt");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception for non-element attribute creation");
        } catch (JXPathException expected) {
            Assert.assertNotNull(expected);
        }
    }

    @Test
    public void testCreateChild_withFactory() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);

        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object parentNode, String name, int index) {
                if (parentNode instanceof Element && "item".equals(name)) {
                    Element child = ((Element) parentNode).getOwnerDocument().createElement(name);
                    ((Element) parentNode).appendChild(child);
                    return true;
                }
                return false;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("item"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("item", childPtr.getName().getName());

        NodePointer childWithValuePtr = rootPtr.createChild(context, new QName("item"), 1, "value123");
        Assert.assertNotNull(childWithValuePtr);
        Assert.assertEquals("value123", childWithValuePtr.getValue());

        try {
            rootPtr.createChild(context, new QName("cannotCreate"), 0);
            Assert.fail("Expected JXPathAbstractFactoryException when factory fails");
        } catch (JXPathAbstractFactoryException expected) {
            Assert.assertTrue(expected.getMessage().contains("Factory could not create a child node"));
        }
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_noFactoryThrowsException() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);
        rootPtr.createChild(context, new QName("test"), 0);
    }
}
