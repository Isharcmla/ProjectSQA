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
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document doc;
    private Document nsDoc;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.newDocument();

        DocumentBuilderFactory nsFactory = DocumentBuilderFactory.newInstance();
        nsFactory.setNamespaceAware(true);
        DocumentBuilder nsBuilder = nsFactory.newDocumentBuilder();
        nsDoc = nsBuilder.newDocument();
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        Element element = doc.createElement("root");
        doc.appendChild(element);

        DOMNodePointer ptr1 = new DOMNodePointer(element, Locale.US);
        DOMNodePointer ptr2 = new DOMNodePointer(element, Locale.US, "myId");
        DOMNodePointer ptr3 = new DOMNodePointer(ptr1, element);

        Assert.assertSame(element, ptr1.getBaseValue());
        Assert.assertSame(element, ptr1.getImmediateNode());
        Assert.assertTrue(ptr1.isActual());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertTrue(ptr1.isLeaf());

        element.appendChild(doc.createElement("child"));
        Assert.assertFalse(ptr1.isLeaf());

        Assert.assertEquals(System.identityHashCode(element), ptr1.hashCode());
        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("NotAPointer"));
        Assert.assertFalse(ptr1.equals(new DOMNodePointer(doc.createElement("other"), Locale.US)));
    }

    @Test
    public void testGetName() {
        Element elemNoPrefix = doc.createElement("item");
        DOMNodePointer ptrElem = new DOMNodePointer(elemNoPrefix, Locale.US);
        Assert.assertEquals(new QName(null, "item"), ptrElem.getName());

        Element elemWithPrefix = nsDoc.createElementNS("http://test.org", "test:item");
        DOMNodePointer ptrElemWithPrefix = new DOMNodePointer(elemWithPrefix, Locale.US);
        Assert.assertEquals(new QName("test", "item"), ptrElemWithPrefix.getName());

        ProcessingInstruction pi = doc.createProcessingInstruction("targetPI", "data");
        DOMNodePointer ptrPI = new DOMNodePointer(pi, Locale.US);
        Assert.assertEquals(new QName(null, "targetPI"), ptrPI.getName());

        Comment comment = doc.createComment("a comment");
        DOMNodePointer ptrComment = new DOMNodePointer(comment, Locale.US);
        Assert.assertEquals(new QName(null, null), ptrComment.getName());
    }

    @Test
    public void testStaticGetPrefixAndLocalName() {
        Element el = doc.createElement("foo:bar");
        Assert.assertEquals("foo", DOMNodePointer.getPrefix(el));
        Assert.assertEquals("bar", DOMNodePointer.getLocalName(el));

        Element simpleEl = doc.createElement("simple");
        Assert.assertNull(DOMNodePointer.getPrefix(simpleEl));
        Assert.assertEquals("simple", DOMNodePointer.getLocalName(simpleEl));

        Element nsEl = nsDoc.createElementNS("http://ns", "p:child");
        Assert.assertEquals("p", DOMNodePointer.getPrefix(nsEl));
        Assert.assertEquals("child", DOMNodePointer.getLocalName(nsEl));
    }

    @Test
    public void testGetNamespaceURIStaticAndInstance() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setAttribute("xmlns:ns", "http://example.com/ns");
        root.setAttribute("xmlns", "http://example.com/default");

        Element child = doc.createElement("ns:child");
        root.appendChild(child);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);

        Assert.assertEquals("http://example.com/ns", DOMNodePointer.getNamespaceURI(child));
        Assert.assertEquals("http://example.com/default", DOMNodePointer.getNamespaceURI(root));
        Assert.assertEquals("http://example.com/ns", childPtr.getNamespaceURI());

        Element directNsEl = nsDoc.createElementNS("http://direct.ns", "direct:node");
        Assert.assertEquals("http://direct.ns", DOMNodePointer.getNamespaceURI(directNsEl));

        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://example.com/default", docPtr.getNamespaceURI());

        Element detached = doc.createElement("detached");
        Assert.assertNull(DOMNodePointer.getNamespaceURI(detached));
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setAttribute("xmlns:ns", "http://example.com/ns");
        root.setAttribute("xmlns", "http://example.com/default");
        root.setAttribute("xmlns:empty", "");

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        Assert.assertEquals("http://example.com/default", rootPtr.getNamespaceURI(null));
        Assert.assertEquals("http://example.com/default", rootPtr.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, rootPtr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, rootPtr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://example.com/ns", rootPtr.getNamespaceURI("ns"));
        Assert.assertNull(rootPtr.getNamespaceURI("empty"));
        Assert.assertNull(rootPtr.getNamespaceURI("unknownPrefix"));

        // Document target
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://example.com/ns", docPtr.getNamespaceURI("ns"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setAttribute("xmlns", "http://default.ns");

        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        Assert.assertEquals("http://default.ns", childPtr.getDefaultNamespaceURI());

        Element noNsElem = doc.createElement("noNs");
        DOMNodePointer noNsPtr = new DOMNodePointer(noNsElem, Locale.US);
        Assert.assertNull(noNsPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testTestNode() {
        Element element = nsDoc.createElementNS("http://example.com", "ns:elem");
        Text text = nsDoc.createTextNode("hello");
        CDATASection cdata = nsDoc.createCDATASection("data");
        Comment comment = nsDoc.createComment("comment");
        ProcessingInstruction pi = nsDoc.createProcessingInstruction("test-pi", "pi-data");

        DOMNodePointer ptr = new DOMNodePointer(element, Locale.US);

        Assert.assertTrue(ptr.testNode(null));

        // NodeNameTest
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeNameTest(new QName("elem"))));
        Assert.assertTrue(DOMNodePointer.testNode(element, new NodeNameTest(new QName("elem"), "http://example.com")));
        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeNameTest(new QName("other"), "http://example.com")));
        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeNameTest(new QName("elem"), "http://other.com")));
        Assert.assertTrue(DOMNodePointer.testNode(element, new NodeNameTest(new QName((String) null, "*"))));
        Assert.assertTrue(DOMNodePointer.testNode(element, new NodeNameTest(new QName("ns", "*"), "http://example.com")));

        // NodeTypeTest
        Assert.assertTrue(DOMNodePointer.testNode(element, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(DOMNodePointer.testNode(nsDoc, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        Assert.assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Assert.assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        Assert.assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        Assert.assertFalse(DOMNodePointer.testNode(element, new NodeTypeTest(9999)));

        // ProcessingInstructionTest
        Assert.assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("test-pi")));
        Assert.assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("other-pi")));
        Assert.assertFalse(DOMNodePointer.testNode(element, new ProcessingInstructionTest("test-pi")));
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        NodeIterator childIt = rootPtr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = rootPtr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodePointer nsPtr = rootPtr.namespacePointer("ns");
        Assert.assertNotNull(nsPtr);

        NodeIterator nsIt = rootPtr.namespaceIterator();
        Assert.assertNotNull(nsIt);
    }

    @Test
    public void testLanguage() {
        Element root = doc.createElement("root");
        root.setAttribute("xml:lang", "EN-us");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("EN"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = doc.createElement("noLang");
        DOMNodePointer noLangPtr = new DOMNodePointer(noLangElem, Locale.US);
        Assert.assertTrue(noLangPtr.isLanguage("en")); // defaults to Locale.US language
    }

    @Test
    public void testGetValueAndStringValue() {
        Comment comment = doc.createComment(" a comment ");
        Assert.assertEquals("a comment", new DOMNodePointer(comment, Locale.US).getValue());

        Text text = doc.createTextNode(" text value ");
        Assert.assertEquals("text value", new DOMNodePointer(text, Locale.US).getValue());

        CDATASection cdata = doc.createCDATASection(" cdata value ");
        Assert.assertEquals("cdata value", new DOMNodePointer(cdata, Locale.US).getValue());

        ProcessingInstruction pi = doc.createProcessingInstruction("target", " pi data ");
        Assert.assertEquals("pi data", new DOMNodePointer(pi, Locale.US).getValue());

        Element root = doc.createElement("root");
        root.appendChild(doc.createTextNode("Hello "));
        Element sub = doc.createElement("sub");
        sub.appendChild(doc.createTextNode("World"));
        root.appendChild(sub);
        Assert.assertEquals("Hello World", new DOMNodePointer(root, Locale.US).getValue());
    }

    @Test
    public void testSetValue() {
        Element parent = doc.createElement("parent");
        Text text = doc.createTextNode("original");
        parent.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        // Empty string on text removes it
        textPtr.setValue("");
        Assert.assertEquals(0, parent.getChildNodes().getLength());

        Element element = doc.createElement("elem");
        parent.appendChild(element);
        DOMNodePointer elemPtr = new DOMNodePointer(element, Locale.US);

        elemPtr.setValue("new text child");
        Assert.assertEquals(1, element.getChildNodes().getLength());
        Assert.assertEquals("new text child", element.getFirstChild().getNodeValue());

        // Replace with another element
        Element otherElem = doc.createElement("other");
        otherElem.appendChild(doc.createTextNode("childContent"));
        elemPtr.setValue(otherElem);
        Assert.assertEquals(1, element.getChildNodes().getLength());
        Assert.assertEquals("childContent", element.getFirstChild().getNodeValue());

        // Replace with a non-element Node (e.g. Text node directly)
        Text singleTextNode = doc.createTextNode("directTextNode");
        elemPtr.setValue(singleTextNode);
        Assert.assertEquals(1, element.getChildNodes().getLength());
        Assert.assertEquals("directTextNode", element.getFirstChild().getNodeValue());

        // Set to empty string
        elemPtr.setValue("");
        Assert.assertEquals(0, element.getChildNodes().getLength());
    }

    @Test
    public void testCreateAttribute() {
        Element element = nsDoc.createElementNS("http://ns", "ns:root");
        element.setAttribute("xmlns:ns", "http://ns");
        nsDoc.appendChild(element);

        DOMNodePointer elemPtr = new DOMNodePointer(element, Locale.US);
        JXPathContext context = JXPathContext.newContext(element);

        NodePointer attrPtr1 = elemPtr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtr1);
        Assert.assertTrue(element.hasAttribute("attr1"));

        NodePointer attrPtr2 = elemPtr.createAttribute(context, new QName("ns", "attr2"));
        Assert.assertNotNull(attrPtr2);
        Assert.assertTrue(element.hasAttributeNS("http://ns", "attr2"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeUnknownPrefixThrowsException() {
        Element element = doc.createElement("root");
        DOMNodePointer elemPtr = new DOMNodePointer(element, Locale.US);
        elemPtr.createAttribute(JXPathContext.newContext(element), new QName("unregistered", "attr"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeOnNonElementThrowsException() {
        Text text = doc.createTextNode("txt");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        textPtr.createAttribute(JXPathContext.newContext(text), new QName("attr"));
    }

    @Test
    public void testCreateChild() {
        Element root = doc.createElement("root");
        doc.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                Element parentElem = (Element) node;
                Element child = parentElem.getOwnerDocument().createElement(name);
                parentElem.appendChild(child);
                return true;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", childPtr.getName().getName());

        NodePointer childWithValue = rootPtr.createChild(context, new QName("child"), 1, "val");
        Assert.assertNotNull(childWithValue);
        Assert.assertEquals("val", childWithValue.getValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChildWithoutFactoryThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        rootPtr.createChild(JXPathContext.newContext(root), new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFactoryReturnsFalseThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test
    public void testRemove() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        childPtr.remove();
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        rootPtr.remove();
    }

    @Test
    public void testAsPath() {
        // ID path
        DOMNodePointer idPtr = new DOMNodePointer(doc.createElement("a"), Locale.US, "my'id\"test");
        Assert.assertEquals("id('my&apos;id&quot;test')", idPtr.asPath());

        // Document path
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Assert.assertEquals("", docPtr.asPath());

        // Element hierarchy
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);

        Element child1 = doc.createElement("child");
        root.appendChild(child1);
        Element child2 = doc.createElement("child");
        root.appendChild(child2);

        DOMNodePointer child1Ptr = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);

        Assert.assertEquals("/root[1]/child[1]", child1Ptr.asPath());
        Assert.assertEquals("/root[1]/child[2]", child2Ptr.asPath());

        // Text & CDATA & PI paths
        Text text1 = doc.createTextNode("txt1");
        Text text2 = doc.createTextNode("txt2");
        root.appendChild(text1);
        root.appendChild(text2);
        DOMNodePointer text2Ptr = new DOMNodePointer(rootPtr, text2);
        Assert.assertEquals("/root[1]/text()[2]", text2Ptr.asPath());

        CDATASection cdata = doc.createCDATASection("data");
        root.appendChild(cdata);
        DOMNodePointer cdataPtr = new DOMNodePointer(rootPtr, cdata);
        Assert.assertEquals("/root[1]/text()[3]", cdataPtr.asPath());

        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/root[1]/processing-instruction('target')[1]", piPtr.asPath());

        // Namespaced elements without registered prefix in resolver -> node()[i]
        Element nsElem = nsDoc.createElementNS("http://custom.ns", "item");
        DOMNodePointer nsDocPtr = new DOMNodePointer(nsDoc, Locale.US);
        DOMNodePointer nsElemPtr = new DOMNodePointer(nsDocPtr, nsElem);
        Assert.assertEquals("/node()[1]", nsElemPtr.asPath());
    }

    @Test
    public void testGetPointerByID() {
        Element root = doc.createElement("root");
        root.setAttribute("id", "elem1");
        root.setIdAttribute("id", true);
        doc.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext ctx = JXPathContext.newContext(doc);

        Pointer ptrFound = rootPtr.getPointerByID(ctx, "elem1");
        Assert.assertNotNull(ptrFound);
        Assert.assertTrue(ptrFound instanceof DOMNodePointer);
        Assert.assertSame(root, ptrFound.getBaseValue());

        Pointer ptrNotFound = rootPtr.getPointerByID(ctx, "nonExistent");
        Assert.assertTrue(ptrNotFound instanceof NullPointer);

        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Pointer docPtrFound = docPtr.getPointerByID(ctx, "elem1");
        Assert.assertSame(root, docPtrFound.getBaseValue());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = doc.createElement("root");
        root.setAttribute("attr1", "v1");
        root.setAttribute("attr2", "v2");
        Attr attr1 = root.getAttributeNode("attr1");
        Attr attr2 = root.getAttributeNode("attr2");

        Element child1 = doc.createElement("child1");
        Element child2 = doc.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        DOMNodePointer ptrAttr1 = new DOMNodePointer(rootPtr, attr1);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(rootPtr, attr2);
        DOMNodePointer ptrChild1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer ptrChild2 = new DOMNodePointer(rootPtr, child2);

        // Same pointers
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(ptrChild1, ptrChild1));

        // Attribute vs Element
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrAttr1, ptrChild1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrChild1, ptrAttr1));

        // Attribute vs Attribute
        int attrComp = rootPtr.compareChildNodePointers(ptrAttr1, ptrAttr2);
        Assert.assertTrue(attrComp == -1 || attrComp == 1);
        Assert.assertEquals(-attrComp, rootPtr.compareChildNodePointers(ptrAttr2, ptrAttr1));

        // Child vs Child
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrChild1, ptrChild2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrChild2, ptrChild1));

        // Foreign child
        Element foreign = doc.createElement("foreign");
        DOMNodePointer foreignPtr = new DOMNodePointer(rootPtr, foreign);
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(foreignPtr, foreignPtr));
    }
}
