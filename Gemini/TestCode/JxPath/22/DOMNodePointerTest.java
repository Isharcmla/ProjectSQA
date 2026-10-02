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
import org.apache.commons.jxpath.ri.NamespaceResolver;
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

    private Document doc;
    private Document docNS;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.newDocument();

        DocumentBuilderFactory nsFactory = DocumentBuilderFactory.newInstance();
        nsFactory.setNamespaceAware(true);
        DocumentBuilder nsBuilder = nsFactory.newDocumentBuilder();
        docNS = nsBuilder.newDocument();
    }

    @Test
    public void testConstructors_variousSignatures() {
        Element root = doc.createElement("root");
        doc.appendChild(root);

        DOMNodePointer ptr1 = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertNull(ptr1.getParent());
        Assert.assertEquals(Locale.ENGLISH, ptr1.getLocale());
        Assert.assertSame(root, ptr1.getBaseValue());

        DOMNodePointer ptr2 = new DOMNodePointer(root, Locale.US, "rootId");
        Assert.assertNull(ptr2.getParent());
        Assert.assertEquals("id('rootId')", ptr2.asPath());

        DOMNodePointer ptr3 = new DOMNodePointer(ptr1, root);
        Assert.assertSame(ptr1, ptr3.getParent());
        Assert.assertSame(root, ptr3.getImmediateNode());
    }

    @Test
    public void testTestNode_nullTest() {
        Element elem = doc.createElement("test");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNode_nodeNameTest() {
        Element elem = docNS.createElementNS("http://example.com/ns", "ns:item");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);

        // Non-element node should return false for NodeNameTest
        Text textNode = docNS.createTextNode("text");
        Assert.assertFalse(DOMNodePointer.testNode(textNode, new NodeNameTest(new QName("item"))));

        // Wildcard with null prefix
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName(null, "*"))));

        // Wildcard with prefix matching
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName("ns", "*"), "http://example.com/ns")));

        // Exact name and matching namespace URI
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName("ns", "item"), "http://example.com/ns")));

        // Exact name but mismatched namespace URI
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName("ns", "item"), "http://other.com/ns")));

        // Non-matching local name
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName("ns", "other"), "http://example.com/ns")));

        // Element without namespace URI matching prefix
        Element elemNoNS = doc.createElement("foo:item");
        DOMNodePointer ptrNoNS = new DOMNodePointer(elemNoNS, Locale.ENGLISH);
        Assert.assertTrue(ptrNoNS.testNode(new NodeNameTest(new QName("foo", "item"))));
        Assert.assertFalse(ptrNoNS.testNode(new NodeNameTest(new QName("bar", "item"))));
    }

    @Test
    public void testTestNode_nodeTypeTest() {
        Element elem = doc.createElement("elem");
        Text text = doc.createTextNode("hello");
        CDATASection cdata = doc.createCDATASection("cdata");
        Comment comment = doc.createComment("comment");
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");

        // NODE_TYPE_NODE matches any node
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(text, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(comment, nodeTest));

        // NODE_TYPE_TEXT matches Text and CDATA
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, textTest));

        // NODE_TYPE_COMMENT matches Comment
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, commentTest));

        // NODE_TYPE_PI matches ProcessingInstruction
        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));

        // Unknown node type
        NodeTypeTest unknownTest = new NodeTypeTest(999);
        Assert.assertFalse(DOMNodePointer.testNode(elem, unknownTest));
    }

    @Test
    public void testTestNode_processingInstructionTest() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest matchTest = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest mismatchTest = new ProcessingInstructionTest("target2");

        Assert.assertTrue(DOMNodePointer.testNode(pi, matchTest));
        Assert.assertFalse(DOMNodePointer.testNode(pi, mismatchTest));

        Element elem = doc.createElement("elem");
        Assert.assertFalse(DOMNodePointer.testNode(elem, matchTest));
    }

    @Test
    public void testGetName() {
        Element elem = doc.createElement("myPrefix:myTag");
        DOMNodePointer ptrElem = new DOMNodePointer(elem, Locale.ENGLISH);
        QName nameElem = ptrElem.getName();
        Assert.assertEquals("myPrefix", nameElem.getPrefix());
        Assert.assertEquals("myTag", nameElem.getName());

        ProcessingInstruction pi = doc.createProcessingInstruction("xml-stylesheet", "href='foo.xsl'");
        DOMNodePointer ptrPI = new DOMNodePointer(pi, Locale.ENGLISH);
        QName namePI = ptrPI.getName();
        Assert.assertNull(namePI.getPrefix());
        Assert.assertEquals("xml-stylesheet", namePI.getName());

        Text text = doc.createTextNode("sample");
        DOMNodePointer ptrText = new DOMNodePointer(text, Locale.ENGLISH);
        QName nameText = ptrText.getName();
        Assert.assertNull(nameText.getPrefix());
        Assert.assertNull(nameText.getName());
    }

    @Test
    public void testGetNamespaceURI_elementAndDocument() {
        Element root = docNS.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns:p", "http://prefix.com");
        root.setAttribute("xmlns", "http://default.com");
        docNS.appendChild(root);

        Element child = docNS.createElementNS("http://prefix.com", "p:child");
        root.appendChild(child);

        DOMNodePointer ptrChild = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertEquals("http://prefix.com", ptrChild.getNamespaceURI());

        DOMNodePointer ptrDoc = new DOMNodePointer(docNS, Locale.ENGLISH);
        Assert.assertEquals("http://default.com", ptrDoc.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_withPrefix() {
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:p1", "http://uri1.com");
        root.setAttribute("xmlns", "http://default.com");
        doc.appendChild(root);

        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://uri1.com", ptr.getNamespaceURI("p1"));
        // Cached lookup
        Assert.assertEquals("http://uri1.com", ptr.getNamespaceURI("p1"));
        // Unknown prefix
        Assert.assertNull(ptr.getNamespaceURI("pUnknown"));
    }

    @Test
    public void testGetDefaultNamespaceURI_documentAndElement() {
        DOMNodePointer ptrNoNs = new DOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertNull(ptrNoNs.getDefaultNamespaceURI());

        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://example.com");
        doc.appendChild(root);

        DOMNodePointer ptrDoc = new DOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", ptrDoc.getDefaultNamespaceURI());

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", ptrRoot.getDefaultNamespaceURI());
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element root = doc.createElement("root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("xmlns:p", "http://p.com");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);

        NodeIterator childIt = ptr.childIterator(new NodeNameTest(new QName("child")), false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr1"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("p");
        Assert.assertNotNull(nsPtr);

        NamespaceResolver nsr = ptr.getNamespaceResolver();
        Assert.assertNotNull(nsr);
        Assert.assertSame(nsr, ptr.getNamespaceResolver()); // synchronized cached
    }

    @Test
    public void testGetBaseValue_and_getImmediateNode() {
        Element elem = doc.createElement("elem");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertSame(elem, ptr.getBaseValue());
        Assert.assertSame(elem, ptr.getImmediateNode());
        Assert.assertTrue(ptr.isActual());
        Assert.assertFalse(ptr.isCollection());
        Assert.assertEquals(1, ptr.getLength());
    }

    @Test
    public void testIsLeaf() {
        Element elem = doc.createElement("elem");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertTrue(ptr.isLeaf());

        elem.appendChild(doc.createTextNode("text"));
        Assert.assertFalse(ptr.isLeaf());
    }

    @Test
    public void testIsLanguage_and_getLanguage() {
        Element parent = doc.createElement("parent");
        parent.setAttribute("xml:lang", "en-US");
        Element child = doc.createElement("child");
        parent.appendChild(child);

        DOMNodePointer ptrParent = new DOMNodePointer(parent, Locale.ENGLISH);
        DOMNodePointer ptrChild = new DOMNodePointer(child, Locale.ENGLISH);

        Assert.assertTrue(ptrParent.isLanguage("en"));
        Assert.assertTrue(ptrParent.isLanguage("EN-US"));
        Assert.assertFalse(ptrParent.isLanguage("fr"));

        Assert.assertTrue(ptrChild.isLanguage("en"));

        // No xml:lang fallback to super.isLanguage
        Element elemNoLang = doc.createElement("noLang");
        DOMNodePointer ptrNoLang = new DOMNodePointer(elemNoLang, Locale.FRENCH);
        Assert.assertTrue(ptrNoLang.isLanguage("fr"));
        Assert.assertFalse(ptrNoLang.isLanguage("de"));
    }

    @Test
    public void testSetValue_textAndCDataNode() {
        Element root = doc.createElement("root");
        Text text = doc.createTextNode("initial");
        root.appendChild(text);

        DOMNodePointer ptrText = new DOMNodePointer(text, Locale.ENGLISH);
        ptrText.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        // Empty string removes text node from parent
        ptrText.setValue("");
        Assert.assertNull(text.getParentNode());

        CDATASection cdata = doc.createCDATASection("initial cdata");
        root.appendChild(cdata);
        DOMNodePointer ptrCData = new DOMNodePointer(cdata, Locale.ENGLISH);
        ptrCData.setValue("updated cdata");
        Assert.assertEquals("updated cdata", cdata.getNodeValue());
        ptrCData.setValue(null);
        Assert.assertNull(cdata.getParentNode());
    }

    @Test
    public void testSetValue_elementNodeWithString() {
        Element root = doc.createElement("root");
        root.appendChild(doc.createElement("oldChild"));
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);

        ptr.setValue("newText");
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("newText", root.getFirstChild().getNodeValue());

        ptr.setValue("");
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_elementNodeWithNodeValues() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);

        Element sourceElem = doc.createElement("source");
        sourceElem.appendChild(doc.createElement("childA"));
        sourceElem.appendChild(doc.createElement("childB"));

        ptr.setValue(sourceElem);
        Assert.assertEquals(2, root.getChildNodes().getLength());
        Assert.assertEquals("childA", root.getChildNodes().item(0).getNodeName());
        Assert.assertEquals("childB", root.getChildNodes().item(1).getNodeName());

        Text singleTextNode = doc.createTextNode("singleText");
        ptr.setValue(singleTextNode);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("singleText", root.getFirstChild().getNodeValue());
    }

    @Test
    public void testCreateChild_and_createChildWithValue_success() {
        Element root = doc.createElement("root");
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) {
                if ("child".equals(name) || "item".equals(name)) {
                    Element p = (Element) parent;
                    Element c = p.getOwnerDocument().createElement(name);
                    p.appendChild(c);
                    return true;
                }
                return false;
            }
        });

        NodePointer childPtr = ptr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", childPtr.getName().getName());

        NodePointer itemPtr = ptr.createChild(context, new QName("item"), NodePointer.WHOLE_COLLECTION, "itemValue");
        Assert.assertNotNull(itemPtr);
        Assert.assertEquals("itemValue", itemPtr.getValue());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_failureThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) {
                return false;
            }
        });
        ptr.createChild(context, new QName("unknown"), 0);
    }

    @Test
    public void testCreateAttribute_successAndFailure() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(doc);

        // Attribute without prefix
        NodePointer attrPtr = ptr.createAttribute(context, new QName("testAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(root.hasAttribute("testAttr"));

        // Attribute with registered prefix
        root.setAttribute("xmlns:p", "http://example.com/p");
        NodePointer nsAttrPtr = ptr.createAttribute(context, new QName("p", "attr"));
        Assert.assertNotNull(nsAttrPtr);

        // Non-element node delegates to super
        Text text = doc.createTextNode("text");
        DOMNodePointer ptrText = new DOMNodePointer(text, Locale.ENGLISH);
        try {
            ptrText.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception on non-element createAttribute");
        } catch (Exception expected) {
            // expected
        }
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_unknownPrefixThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(doc);
        ptr.createAttribute(context, new QName("unresolvedPrefix", "attr"));
    }

    @Test
    public void testRemove_successAndRootException() {
        Element root = doc.createElement("root");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer ptrChild = new DOMNodePointer(child, Locale.ENGLISH);
        ptrChild.remove();
        Assert.assertEquals(0, root.getChildNodes().getLength());

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        try {
            ptrRoot.remove();
            Assert.fail("Expected JXPathException when removing root node");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testAsPath_elementsAndPositions() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        Element item1 = doc.createElement("item");
        Element item2 = doc.createElement("item");
        root.appendChild(item1);
        root.appendChild(item2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer item1Ptr = new DOMNodePointer(rootPtr, item1);
        DOMNodePointer item2Ptr = new DOMNodePointer(rootPtr, item2);

        Assert.assertEquals("/item[1]", item1Ptr.asPath());
        Assert.assertEquals("/item[2]", item2Ptr.asPath());
    }

    @Test
    public void testAsPath_withNamespaces() {
        Element root = docNS.createElementNS("http://example.com/ns", "p:root");
        root.setAttribute("xmlns:p", "http://example.com/ns");
        docNS.appendChild(root);

        Element child = docNS.createElementNS("http://example.com/ns", "p:child");
        root.appendChild(child);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);

        Assert.assertEquals("/p:child[1]", childPtr.asPath());

        // Sibling with unmapped prefix will result in node()[index]
        Element child2 = docNS.createElementNS("http://other.com/ns", "other:child2");
        root.appendChild(child2);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/node()[2]", child2Ptr.asPath());
    }

    @Test
    public void testAsPath_textCDataPIAndDocument() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        Text text1 = doc.createTextNode("t1");
        CDATASection cdata = doc.createCDATASection("cd");
        ProcessingInstruction pi1 = doc.createProcessingInstruction("target", "data1");
        ProcessingInstruction pi2 = doc.createProcessingInstruction("target", "data2");
        root.appendChild(text1);
        root.appendChild(cdata);
        root.appendChild(pi1);
        root.appendChild(pi2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer text1Ptr = new DOMNodePointer(rootPtr, text1);
        DOMNodePointer cdataPtr = new DOMNodePointer(rootPtr, cdata);
        DOMNodePointer pi1Ptr = new DOMNodePointer(rootPtr, pi1);
        DOMNodePointer pi2Ptr = new DOMNodePointer(rootPtr, pi2);

        Assert.assertEquals("/text()[1]", text1Ptr.asPath());
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());
        Assert.assertEquals("/processing-instruction('target')[1]", pi1Ptr.asPath());
        Assert.assertEquals("/processing-instruction('target')[2]", pi2Ptr.asPath());

        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("", docPtr.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = doc.createElement("elem");
        Element elem2 = doc.createElement("elem");

        DOMNodePointer ptr1 = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer ptr1Duplicate = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertEquals(ptr1, ptr1);
        Assert.assertEquals(ptr1, ptr1Duplicate);
        Assert.assertNotEquals(ptr1, ptr2);
        Assert.assertNotEquals(ptr1, "someString");
        Assert.assertNotEquals(ptr1, null);

        Assert.assertEquals(elem1.hashCode(), ptr1.hashCode());
    }

    @Test
    public void testStaticGetPrefixAndLocalName() {
        Element elemWithPrefix = doc.createElement("ns:myTag");
        Assert.assertEquals("ns", DOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertEquals("myTag", DOMNodePointer.getLocalName(elemWithPrefix));

        Element elemNoPrefix = doc.createElement("tagOnly");
        Assert.assertNull(DOMNodePointer.getPrefix(elemNoPrefix));
        Assert.assertEquals("tagOnly", DOMNodePointer.getLocalName(elemNoPrefix));
    }

    @Test
    public void testGetValue_commentTextPIElementAndSpacePreserve() {
        Comment comment = doc.createComment("  a comment  ");
        DOMNodePointer ptrComment = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("a comment", ptrComment.getValue());

        Element root = doc.createElement("root");
        Text text = doc.createTextNode("  trimmed text  ");
        root.appendChild(text);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "  pi data  ");
        root.appendChild(pi);
        Comment innerComment = doc.createComment("ignore");
        root.appendChild(innerComment);

        DOMNodePointer ptrRoot = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("trimmed textpi data", ptrRoot.getValue());

        // With xml:space="preserve"
        Element preserveElem = doc.createElement("preserveElem");
        preserveElem.setAttribute("xml:space", "preserve");
        Text preserveText = doc.createTextNode("  keep spaces  ");
        preserveElem.appendChild(preserveText);
        DOMNodePointer ptrPreserve = new DOMNodePointer(preserveElem, Locale.ENGLISH);
        Assert.assertEquals("  keep spaces  ", ptrPreserve.getValue());
    }

    @Test
    public void testGetPointerByID() {
        Element root = doc.createElement("root");
        root.setAttribute("id", "root1");
        root.setIdAttribute("id", true);
        doc.appendChild(root);

        JXPathContext ctx = JXPathContext.newContext(doc);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);

        Pointer pFound = docPtr.getPointerByID(ctx, "root1");
        Assert.assertTrue(pFound instanceof DOMNodePointer);
        Assert.assertSame(root, pFound.getBaseValue());

        Pointer pNotFound = docPtr.getPointerByID(ctx, "nonexistent");
        Assert.assertTrue(pNotFound instanceof NullPointer);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        Pointer pFoundFromElem = rootPtr.getPointerByID(ctx, "root1");
        Assert.assertSame(root, pFoundFromElem.getBaseValue());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = doc.createElement("root");
        root.setAttribute("attr1", "v1");
        root.setAttribute("attr2", "v2");
        Element child1 = doc.createElement("child1");
        Element child2 = doc.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);

        Attr a1 = root.getAttributeNode("attr1");
        Attr a2 = root.getAttributeNode("attr2");

        DOMNodePointer ptrAttr1 = new DOMNodePointer(rootPtr, a1);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(rootPtr, a2);
        DOMNodePointer ptrChild1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer ptrChild2 = new DOMNodePointer(rootPtr, child2);

        // Same pointer
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(ptrChild1, ptrChild1));

        // Attribute vs Element
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrAttr1, ptrChild1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrChild1, ptrAttr1));

        // Attribute vs Attribute
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrAttr1, ptrAttr2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrAttr2, ptrAttr1));

        // Element vs Element
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrChild1, ptrChild2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrChild2, ptrChild1));
    }
}
