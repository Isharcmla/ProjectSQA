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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    public void testConstructorsAndBasicProperties() {
        Element root = document.createElement("root");
        document.appendChild(root);

        DOMNodePointer ptrWithLocale = new DOMNodePointer(root, Locale.ENGLISH);
        assertSame(root, ptrWithLocale.getBaseValue());
        assertSame(root, ptrWithLocale.getImmediateNode());
        assertSame(root, ptrWithLocale.getNode());
        assertEquals(Locale.ENGLISH, ptrWithLocale.getLocale());
        assertTrue(ptrWithLocale.isActual());
        assertFalse(ptrWithLocale.isCollection());
        assertEquals(1, ptrWithLocale.getLength());
        assertTrue(ptrWithLocale.isLeaf());

        DOMNodePointer ptrWithId = new DOMNodePointer(root, Locale.US, "myId");
        assertEquals("id('myId')", ptrWithId.asPath());

        DOMNodePointer ptrChild = new DOMNodePointer(ptrWithLocale, root);
        assertSame(ptrWithLocale, ptrChild.getParent());
        assertSame(root, ptrChild.getNode());
    }

    @Test
    public void testTestNodeWithNullTest() {
        Element elem = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.getDefault());
        assertTrue(pointer.testNode(null));
        assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNodeNameTest() {
        Element elem = document.createElementNS("http://example.com/ns", "p:test");
        Text text = document.createTextNode("text");

        assertFalse(DOMNodePointer.testNode(text, new NodeNameTest(new QName("test"))));

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(elem, wildcardNoPrefix));

        NodeNameTest wildcardWithNs = new NodeNameTest(new QName("p", "*"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(elem, wildcardWithNs));

        NodeNameTest wildcardWrongNs = new NodeNameTest(new QName("p", "*"), "http://wrong.com");
        assertFalse(DOMNodePointer.testNode(elem, wildcardWrongNs));

        NodeNameTest matchExact = new NodeNameTest(new QName("p", "test"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(elem, matchExact));

        NodeNameTest matchWrongName = new NodeNameTest(new QName("p", "other"), "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(elem, matchWrongName));

        NodeNameTest matchWrongNs = new NodeNameTest(new QName("p", "test"), "http://other.com");
        assertFalse(DOMNodePointer.testNode(elem, matchWrongNs));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("text");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        assertTrue(DOMNodePointer.testNode(document, nodeTest));
        assertFalse(DOMNodePointer.testNode(text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(text, textTest));
        assertTrue(DOMNodePointer.testNode(cdata, textTest));
        assertFalse(DOMNodePointer.testNode(elem, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, commentTest));
        assertFalse(DOMNodePointer.testNode(elem, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, piTest));
        assertFalse(DOMNodePointer.testNode(elem, piTest));

        NodeTypeTest unknownTypeTest = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(elem, unknownTypeTest));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest piTestMatch = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");

        assertTrue(DOMNodePointer.testNode(pi, piTestMatch));
        assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));
        assertFalse(DOMNodePointer.testNode(elem, piTestMatch));
    }

    @Test
    public void testGetName() {
        Element elemNoPrefix = document.createElement("elem");
        DOMNodePointer ptr1 = new DOMNodePointer(elemNoPrefix, Locale.getDefault());
        assertEquals(new QName(null, "elem"), ptr1.getName());

        Element elemPrefix = document.createElementNS("http://ns.com", "ns:elem");
        DOMNodePointer ptr2 = new DOMNodePointer(elemPrefix, Locale.getDefault());
        assertEquals(new QName("ns", "elem"), ptr2.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("piTarget", "data");
        DOMNodePointer ptr3 = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals(new QName(null, "piTarget"), ptr3.getName());

        Text text = document.createTextNode("txt");
        DOMNodePointer ptr4 = new DOMNodePointer(text, Locale.getDefault());
        assertEquals(new QName(null, null), ptr4.getName());
    }

    @Test
    public void testGetPrefixAndGetLocalNameStatic() {
        Element elem1 = document.createElement("simple");
        assertNull(DOMNodePointer.getPrefix(elem1));
        assertEquals("simple", DOMNodePointer.getLocalName(elem1));

        Element elem2 = document.createElementNS("http://foo.bar", "foo:bar");
        assertEquals("foo", DOMNodePointer.getPrefix(elem2));
        assertEquals("bar", DOMNodePointer.getLocalName(elem2));

        Element elemNonNS = document.createElement("foo:bar");
        assertEquals("foo", DOMNodePointer.getPrefix(elemNonNS));
        assertEquals("bar", DOMNodePointer.getLocalName(elemNonNS));
    }

    @Test
    public void testGetNamespaceURIFromNode() {
        Element root = document.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns:p", "http://prefix.com");
        document.appendChild(root);

        Element child = document.createElementNS("http://prefix.com", "p:child");
        root.appendChild(child);

        assertEquals("http://default.com", DOMNodePointer.getNamespaceURI(document));
        assertEquals("http://default.com", DOMNodePointer.getNamespaceURI(root));
        assertEquals("http://prefix.com", DOMNodePointer.getNamespaceURI(child));

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        assertEquals("http://default.com", rootPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIByPrefix() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns", "http://default.org");
        root.setAttribute("xmlns:foo", "http://foo.org");
        document.appendChild(root);

        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.getDefault());

        assertEquals("http://default.org", childPtr.getNamespaceURI((String) null));
        assertEquals("http://default.org", childPtr.getNamespaceURI(""));
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, childPtr.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, childPtr.getNamespaceURI("xmlns"));
        assertEquals("http://foo.org", childPtr.getNamespaceURI("foo"));
        assertEquals("http://foo.org", childPtr.getNamespaceURI("foo"));
        assertNull(childPtr.getNamespaceURI("unknownPrefix"));

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.getDefault());
        assertEquals("http://foo.org", docPtr.getNamespaceURI("foo"));
        assertEquals("http://default.org", docPtr.getDefaultNamespaceURI());

        Document emptyDoc = null;
        try {
            emptyDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (Exception ignored) {
        }
        DOMNodePointer emptyDocPtr = new DOMNodePointer(emptyDoc, Locale.getDefault());
        assertNull(emptyDocPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element root = document.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());

        NodeIterator childIt = ptr.childIterator(null, false, null);
        assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("test"));
        assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("foo");
        assertNotNull(nsPtr);
        assertEquals("foo", nsPtr.getName().getName());
    }

    @Test
    public void testIsLeaf() {
        Element elem = document.createElement("elem");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.getDefault());
        assertTrue(ptr.isLeaf());

        elem.appendChild(document.createTextNode("hello"));
        assertFalse(ptr.isLeaf());
    }

    @Test
    public void testIsLanguageAndGetLanguage() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(childPtr.isLanguage("en"));
        assertTrue(childPtr.isLanguage("EN-US"));
        assertFalse(childPtr.isLanguage("fr"));

        Element noLang = document.createElement("noLang");
        DOMNodePointer noLangPtr = new DOMNodePointer(noLang, Locale.GERMAN);
        assertTrue(noLangPtr.isLanguage("de"));
        assertFalse(noLangPtr.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextAndCData() {
        Element root = document.createElement("root");
        Text text = document.createTextNode("initial");
        root.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.getDefault());
        textPtr.setValue("updated");
        assertEquals("updated", text.getNodeValue());

        textPtr.setValue("");
        assertNull(text.getParentNode());

        CDATASection cdata = document.createCDATASection("cdataInitial");
        root.appendChild(cdata);
        DOMNodePointer cdataPtr = new DOMNodePointer(cdata, Locale.getDefault());
        cdataPtr.setValue("cdataUpdated");
        assertEquals("cdataUpdated", cdata.getNodeValue());
        cdataPtr.setValue(null);
        assertNull(cdata.getParentNode());
    }

    @Test
    public void testSetValueOnElement() {
        Element root = document.createElement("root");
        Element oldChild = document.createElement("oldChild");
        root.appendChild(oldChild);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());

        rootPtr.setValue("newText");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("newText", root.getFirstChild().getNodeValue());

        Element replacementElement = document.createElement("replacement");
        replacementElement.appendChild(document.createElement("c1"));
        replacementElement.appendChild(document.createElement("c2"));

        rootPtr.setValue(replacementElement);
        assertEquals(2, root.getChildNodes().getLength());
        assertEquals("c1", root.getChildNodes().item(0).getNodeName());
        assertEquals("c2", root.getChildNodes().item(1).getNodeName());

        Comment comment = document.createComment("myComment");
        rootPtr.setValue(comment);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("myComment", ((Comment) root.getFirstChild()).getData());

        Document otherDoc = null;
        try {
            otherDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element docElem = otherDoc.createElement("docElem");
            otherDoc.appendChild(docElem);
        } catch (Exception ignored) {
        }
        rootPtr.setValue(otherDoc);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("docElem", root.getFirstChild().getNodeName());
    }

    @Test
    public void testCreateChildWithFactorySuccess() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());

        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                Element newChild = document.createElement(name);
                ((Node) node).appendChild(newChild);
                return true;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("child"), 0);
        assertNotNull(childPtr);
        assertEquals("child", childPtr.getName().getName());

        NodePointer childWithValuePtr = rootPtr.createChild(context, new QName("childVal"), 0, "valText");
        assertNotNull(childWithValuePtr);
        assertEquals("valText", childWithValuePtr.getValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChildWithoutFactoryThrowsException() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(root);
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFactoryReturnsFalseThrowsException() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test
    public void testCreateAttribute() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns:foo", "http://foo.com");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(root);

        NodePointer attrPtr1 = rootPtr.createAttribute(context, new QName("simpleAttr"));
        assertNotNull(attrPtr1);
        assertTrue(root.hasAttribute("simpleAttr"));

        NodePointer attrPtr2 = rootPtr.createAttribute(context, new QName("foo", "barAttr"));
        assertNotNull(attrPtr2);
        assertTrue(root.hasAttributeNS("http://foo.com", "barAttr"));

        try {
            rootPtr.createAttribute(context, new QName("unknown", "attr"));
            fail("Expected JXPathException for unknown namespace prefix");
        } catch (JXPathException expected) {
        }

        Text textNode = document.createTextNode("sample");
        DOMNodePointer textPtr = new DOMNodePointer(textNode, Locale.getDefault());
        try {
            textPtr.createAttribute(context, new QName("attr"));
            fail("Expected JXPathException on non-element node");
        } catch (JXPathException expected) {
        }
    }

    @Test
    public void testRemove() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.getDefault());
        childPtr.remove();
        assertNull(child.getParentNode());

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        try {
            rootPtr.remove();
            fail("Expected JXPathException when removing root DOM node without parent");
        } catch (JXPathException expected) {
        }
    }

    @Test
    public void testAsPath() {
        DOMNodePointer idPtr = new DOMNodePointer(document.createElement("elem"), Locale.getDefault(), "elem'\"Id");
        assertEquals("id('elem&apos;&quot;Id')", idPtr.asPath());

        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.getDefault());
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);

        Element child1 = document.createElement("child");
        Element child2 = document.createElement("child");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer childPtr1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer childPtr2 = new DOMNodePointer(rootPtr, child2);
        assertEquals("/child[1]", childPtr1.asPath());
        assertEquals("/child[2]", childPtr2.asPath());

        Element nsChild = document.createElementNS("http://test.com", "t:item");
        root.appendChild(nsChild);
        DOMNodePointer nsChildPtr = new DOMNodePointer(rootPtr, nsChild);
        assertEquals("/node()[3]", nsChildPtr.asPath());

        Text textNode1 = document.createTextNode("text1");
        Text textNode2 = document.createTextNode("text2");
        root.appendChild(textNode1);
        root.appendChild(textNode2);

        DOMNodePointer textPtr1 = new DOMNodePointer(rootPtr, textNode1);
        DOMNodePointer textPtr2 = new DOMNodePointer(rootPtr, textNode2);
        assertEquals("/text()[1]", textPtr1.asPath());
        assertEquals("/text()[2]", textPtr2.asPath());

        CDATASection cdataNode = document.createCDATASection("cdata");
        root.appendChild(cdataNode);
        DOMNodePointer cdataPtr = new DOMNodePointer(rootPtr, cdataNode);
        assertEquals("/text()[3]", cdataPtr.asPath());

        ProcessingInstruction pi1 = document.createProcessingInstruction("myTarget", "d1");
        ProcessingInstruction pi2 = document.createProcessingInstruction("myTarget", "d2");
        root.appendChild(pi1);
        root.appendChild(pi2);

        DOMNodePointer piPtr1 = new DOMNodePointer(rootPtr, pi1);
        DOMNodePointer piPtr2 = new DOMNodePointer(rootPtr, pi2);
        assertEquals("/processing-instruction('myTarget')[1]", piPtr1.asPath());
        assertEquals("/processing-instruction('myTarget')[2]", piPtr2.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = document.createElement("elem1");
        Element elem2 = document.createElement("elem2");

        DOMNodePointer ptr1 = new DOMNodePointer(elem1, Locale.getDefault());
        DOMNodePointer ptr1Same = new DOMNodePointer(elem1, Locale.getDefault());
        DOMNodePointer ptr2 = new DOMNodePointer(elem2, Locale.getDefault());

        assertTrue(ptr1.equals(ptr1));
        assertTrue(ptr1.equals(ptr1Same));
        assertFalse(ptr1.equals(ptr2));
        assertFalse(ptr1.equals(null));
        assertFalse(ptr1.equals("string"));
        assertEquals(System.identityHashCode(elem1), ptr1.hashCode());
    }

    @Test
    public void testGetValue() {
        Comment comment = document.createComment("  a comment  ");
        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.getDefault());
        assertEquals("a comment", commentPtr.getValue());

        Element parent = document.createElement("parent");
        Text text1 = document.createTextNode(" Hello ");
        Element child = document.createElement("child");
        Text text2 = document.createTextNode(" World ");
        Comment comment2 = document.createComment("ignored");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "  piData  ");

        child.appendChild(text2);
        parent.appendChild(text1);
        parent.appendChild(child);
        parent.appendChild(comment2);
        parent.appendChild(pi);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        assertEquals("HelloWorldpiData", parentPtr.getValue());

        parent.setAttribute("xml:space", "preserve");
        assertEquals(" Hello  World   piData  ", parentPtr.getValue());
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        root.setAttribute("id", "rootId");
        document.appendChild(root);

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(document);

        Pointer ptrFound = docPtr.getPointerByID(context, "rootId");
        assertTrue(ptrFound instanceof DOMNodePointer || ptrFound instanceof NullPointer);

        Pointer ptrNotFound = docPtr.getPointerByID(context, "nonExistent");
        assertTrue(ptrNotFound instanceof NullPointer);

        DOMNodePointer elemPtr = new DOMNodePointer(root, Locale.getDefault());
        Pointer ptrFromElem = elemPtr.getPointerByID(context, "nonExistent");
        assertTrue(ptrFromElem instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.createElement("root");
        root.setAttribute("a1", "v1");
        root.setAttribute("a2", "v2");

        Element child1 = document.createElement("c1");
        Element child2 = document.createElement("c2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());

        Attr attr1 = root.getAttributeNode("a1");
        Attr attr2 = root.getAttributeNode("a2");

        DOMNodePointer pAttr1 = new DOMNodePointer(rootPtr, attr1);
        DOMNodePointer pAttr2 = new DOMNodePointer(rootPtr, attr2);
        DOMNodePointer pChild1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer pChild2 = new DOMNodePointer(rootPtr, child2);

        assertEquals(0, rootPtr.compareChildNodePointers(pChild1, pChild1));
        assertEquals(-1, rootPtr.compareChildNodePointers(pAttr1, pChild1));
        assertEquals(1, rootPtr.compareChildNodePointers(pChild1, pAttr1));

        int attrOrder = rootPtr.compareChildNodePointers(pAttr1, pAttr2);
        assertTrue(attrOrder == -1 || attrOrder == 1);

        assertEquals(-1, rootPtr.compareChildNodePointers(pChild1, pChild2));
        assertEquals(1, rootPtr.compareChildNodePointers(pChild2, pChild1));

        Element foreignChild = document.createElement("foreign");
        DOMNodePointer pForeign = new DOMNodePointer(rootPtr, foreignChild);
        assertEquals(0, rootPtr.compareChildNodePointers(pForeign, pForeign));
    }
}
