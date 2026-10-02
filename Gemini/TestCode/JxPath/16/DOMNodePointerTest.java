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

    private Document document;
    private Element rootElement;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElementNS("http://example.com/ns", "ns:root");
        rootElement.setAttribute("id", "rootId");
        document.appendChild(rootElement);
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertSame(rootElement, pointer1.getBaseValue());
        Assert.assertSame(rootElement, pointer1.getImmediateNode());
        Assert.assertSame(rootElement, pointer1.getNode());
        Assert.assertEquals(1, pointer1.getLength());
        Assert.assertTrue(pointer1.isActual());
        Assert.assertFalse(pointer1.isCollection());
        Assert.assertTrue(pointer1.isLeaf());

        DOMNodePointer pointerWithId = new DOMNodePointer(rootElement, Locale.US, "custom'\"Id");
        Assert.assertEquals("id('custom&apos;&quot;Id')", pointerWithId.asPath());

        DOMNodePointer childPointer = new DOMNodePointer(pointer1, rootElement);
        Assert.assertSame(pointer1, childPointer.getParent());
    }

    @Test
    public void testTestNode_nullTest() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertTrue(pointer.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNode_nodeNameTest() {
        Element child = document.createElementNS("http://example.com/ns", "ns:child");
        rootElement.appendChild(child);

        Text text = document.createTextNode("text");
        rootElement.appendChild(text);

        // Non-element node should return false for NodeNameTest
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeNameTest(new QName("child"))));

        // Wildcard with null prefix matches any element
        Assert.assertTrue(DOMNodePointer.testNode(child, new NodeNameTest(new QName(null, "*"))));

        // Wildcard with prefix
        Assert.assertTrue(DOMNodePointer.testNode(child, new NodeNameTest(new QName("ns", "*"), "http://example.com/ns")));

        // Exact name match and namespace match
        Assert.assertTrue(DOMNodePointer.testNode(child, new NodeNameTest(new QName("ns", "child"), "http://example.com/ns")));

        // Exact name match, different namespace
        Assert.assertFalse(DOMNodePointer.testNode(child, new NodeNameTest(new QName("ns", "child"), "http://other.com")));

        // Name mismatch
        Assert.assertFalse(DOMNodePointer.testNode(child, new NodeNameTest(new QName("ns", "other"), "http://example.com/ns")));

        // Element without namespace
        Element noNsElem = document.createElement("plain");
        Assert.assertTrue(DOMNodePointer.testNode(noNsElem, new NodeNameTest(new QName("plain"))));
        Assert.assertFalse(DOMNodePointer.testNode(noNsElem, new NodeNameTest(new QName("p", "plain"), "http://example.com")));
    }

    @Test
    public void testTestNode_nodeTypeTest() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("txt");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        // NODE_TYPE_NODE (Element or Document)
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

        // NODE_TYPE_TEXT (Text or CDATA)
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, textTest));

        // NODE_TYPE_COMMENT
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, commentTest));

        // NODE_TYPE_PI
        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));

        // Invalid type
        NodeTypeTest invalidTest = new NodeTypeTest(999);
        Assert.assertFalse(DOMNodePointer.testNode(elem, invalidTest));
    }

    @Test
    public void testTestNode_processingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data1");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest piTestMatch = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");

        Assert.assertTrue(DOMNodePointer.testNode(pi, piTestMatch));
        Assert.assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTestMatch));
    }

    @Test
    public void testGetName() {
        Element elem = document.createElementNS("http://example.com", "p:test");
        DOMNodePointer elemPointer = new DOMNodePointer(elem, Locale.ENGLISH);
        QName name = elemPointer.getName();
        Assert.assertEquals("p", name.getPrefix());
        Assert.assertEquals("test", name.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("target", piPointer.getName().getName());

        Comment comment = document.createComment("comment");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertNull(commentPointer.getName().getName());
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elem1 = document.createElementNS("http://example.com", "ns1:elem1");
        Assert.assertEquals("ns1", DOMNodePointer.getPrefix(elem1));
        Assert.assertEquals("elem1", DOMNodePointer.getLocalName(elem1));

        Element elem2 = document.createElement("elem2");
        Assert.assertNull(DOMNodePointer.getPrefix(elem2));
        Assert.assertEquals("elem2", DOMNodePointer.getLocalName(elem2));
    }

    @Test
    public void testGetNamespaceURI_standardPrefixes() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_elementAndHierarchy() {
        Element parent = document.createElement("parent");
        parent.setAttribute("xmlns:p", "http://parent.com");
        parent.setAttribute("xmlns", "http://default.com");
        Element child = document.createElement("child");
        parent.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertEquals("http://parent.com", childPointer.getNamespaceURI("p"));
        Assert.assertEquals("http://default.com", childPointer.getNamespaceURI(""));
        Assert.assertEquals("http://default.com", childPointer.getNamespaceURI((String) null));
        Assert.assertNull(childPointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURI_documentNode() {
        Document emptyDoc = document.getImplementation().createDocument(null, null, null);
        DOMNodePointer docPointer = new DOMNodePointer(emptyDoc, Locale.ENGLISH);
        Assert.assertNull(docPointer.getNamespaceURI());
        Assert.assertNull(docPointer.getDefaultNamespaceURI());

        Element docElem = document.createElement("docElem");
        docElem.setAttribute("xmlns:doc", "http://doc.com");
        docElem.setAttribute("xmlns", "http://docdefault.com");
        emptyDoc.appendChild(docElem);

        Assert.assertEquals("http://doc.com", docPointer.getNamespaceURI("doc"));
        Assert.assertEquals("http://docdefault.com", docPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testIteratorsAndResolvers() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        NodeIterator childIt = pointer.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = pointer.attributeIterator(new QName("id"));
        Assert.assertNotNull(attrIt);

        NodePointer nsPtr = pointer.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);

        NodeIterator nsIt = pointer.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NamespaceResolver resolver = pointer.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, pointer.getNamespaceResolver()); // cached
    }

    @Test
    public void testLanguageHandling() {
        Element elem = document.createElement("elem");
        elem.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        Assert.assertEquals("en-US", pointer.getLanguage());
        Assert.assertTrue(pointer.isLanguage("en"));
        Assert.assertTrue(pointer.isLanguage("en-US"));
        Assert.assertFalse(pointer.isLanguage("fr"));

        Element noLangElem = document.createElement("noLang");
        DOMNodePointer noLangPointer = new DOMNodePointer(noLangElem, Locale.ENGLISH);
        Assert.assertTrue(noLangPointer.isLanguage("en")); // fallback to super (Locale.ENGLISH)
    }

    @Test
    public void testGetValue() {
        Comment comment = document.createComment("  my comment  ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("my comment", commentPointer.getValue());

        Comment emptyComment = document.createComment(null);
        DOMNodePointer emptyCommentPointer = new DOMNodePointer(emptyComment, Locale.ENGLISH);
        Assert.assertEquals("", emptyCommentPointer.getValue());

        Element parent = document.createElement("parent");
        Text text1 = document.createTextNode("  hello  ");
        CDATASection cdata = document.createCDATASection("  world  ");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "  piData  ");
        Comment ignoredComment = document.createComment("ignored");

        parent.appendChild(text1);
        parent.appendChild(cdata);
        parent.appendChild(pi);
        parent.appendChild(ignoredComment);

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.ENGLISH);
        Assert.assertEquals("helloworldpiData", parentPointer.getValue());

        // Preserving space
        Element spacePreserve = document.createElement("preserveSpace");
        spacePreserve.setAttribute("xml:space", "preserve");
        Text textPreserved = document.createTextNode("  keep spaces  ");
        spacePreserve.appendChild(textPreserved);
        DOMNodePointer preservePointer = new DOMNodePointer(spacePreserve, Locale.ENGLISH);
        Assert.assertEquals("  keep spaces  ", preservePointer.getValue());
    }

    @Test
    public void testSetValue_textAndCData() {
        Text textNode = document.createTextNode("initial");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.ENGLISH);

        textPointer.setValue("updated");
        Assert.assertEquals("updated", textNode.getNodeValue());

        // Empty string removes the text node from parent
        textPointer.setValue("");
        Assert.assertNull(textNode.getParentNode());

        CDATASection cdataNode = document.createCDATASection("initial");
        rootElement.appendChild(cdataNode);
        DOMNodePointer cdataPointer = new DOMNodePointer(cdataNode, Locale.ENGLISH);
        cdataPointer.setValue(null);
        Assert.assertNull(cdataNode.getParentNode());
    }

    @Test
    public void testSetValue_element() {
        Element elem = document.createElement("container");
        elem.appendChild(document.createTextNode("old"));
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Set string value
        pointer.setValue("new text");
        Assert.assertEquals(1, elem.getChildNodes().getLength());
        Assert.assertEquals("new text", elem.getFirstChild().getNodeValue());

        // Set Element value
        Element sourceElem = document.createElement("source");
        sourceElem.appendChild(document.createElement("child1"));
        sourceElem.appendChild(document.createElement("child2"));
        pointer.setValue(sourceElem);
        Assert.assertEquals(2, elem.getChildNodes().getLength());
        Assert.assertEquals("child1", elem.getFirstChild().getNodeName());

        // Set Other Node value (e.g. Text node)
        Text sourceText = document.createTextNode("appendedText");
        pointer.setValue(sourceText);
        Assert.assertEquals(1, elem.getChildNodes().getLength());
        Assert.assertEquals("appendedText", elem.getFirstChild().getNodeValue());

        // Set empty value clears all children
        pointer.setValue("");
        Assert.assertEquals(0, elem.getChildNodes().getLength());
    }

    @Test
    public void testCreateChild_andCreateChildWithValue() {
        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, Pointer parent, Object contextBean, String name, int index) {
                if ("child".equals(name) && contextBean instanceof Element) {
                    Element child = document.createElement("child");
                    ((Element) contextBean).appendChild(child);
                    return true;
                }
                return false;
            }
        });

        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        NodePointer childPtr = rootPointer.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", childPtr.getName().getName());

        NodePointer childWithValuePtr = rootPointer.createChild(context, new QName("child"), 1, "testValue");
        Assert.assertNotNull(childWithValuePtr);
        Assert.assertEquals("testValue", childWithValuePtr.getValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_noFactoryThrowsException() {
        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        rootPointer.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_factoryReturnsFalseThrowsException() {
        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext context, Pointer parent, Object contextBean, String name, int index) {
                return false;
            }
        });
        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        rootPointer.createChild(context, new QName("child"), 0);
    }

    @Test
    public void testCreateAttribute() {
        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);

        // Non-prefixed attribute
        NodePointer attrPtr = pointer.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(rootElement.hasAttribute("attr1"));

        // Creating existing attribute returns iterator pointer
        NodePointer sameAttrPtr = pointer.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(sameAttrPtr);

        // Attribute on non-Element falls back to super (NullPointer created)
        Text text = document.createTextNode("txt");
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ENGLISH);
        NodePointer nonElemAttr = textPointer.createAttribute(context, new QName("attr"));
        Assert.assertNotNull(nonElemAttr);
    }

    @Test
    public void testCreateAttribute_withPrefix() {
        JXPathContext context = JXPathContext.newContext(document);
        rootElement.setAttribute("xmlns:p", "http://test.com");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);

        NodePointer attrPtr = pointer.createAttribute(context, new QName("p", "attr2"));
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("http://test.com", rootElement.getAttributeNodeNS("http://test.com", "attr2").getNamespaceURI());
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_withUnknownPrefixThrowsException() {
        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        pointer.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void testRemove() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);

        childPointer.remove();
        Assert.assertNull(child.getParentNode());
    }

    @Test(expected = JXPathException.class)
    public void testRemove_rootNodeThrowsException() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        docPointer.remove();
    }

    @Test
    public void testAsPath() {
        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertEquals("", rootPointer.asPath());

        Element child1 = document.createElement("item");
        Element child2 = document.createElement("item");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);

        DOMNodePointer child1Pointer = new DOMNodePointer(rootPointer, child1);
        Assert.assertEquals("/item[1]", child1Pointer.asPath());

        DOMNodePointer child2Pointer = new DOMNodePointer(rootPointer, child2);
        Assert.assertEquals("/item[2]", child2Pointer.asPath());

        Text text = document.createTextNode("text");
        child2.appendChild(text);
        DOMNodePointer textPointer = new DOMNodePointer(child2Pointer, text);
        Assert.assertEquals("/item[2]/text()[1]", textPointer.asPath());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        child2.appendChild(pi);
        DOMNodePointer piPointer = new DOMNodePointer(child2Pointer, pi);
        Assert.assertEquals("/item[2]/processing-instruction('target')[1]", piPointer.asPath());

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("", docPointer.asPath());
    }

    @Test
    public void testAsPath_withNamespaceAndUnresolvedPrefix() {
        Element parent = document.createElementNS("http://ns1.com", "p1:parent");
        Element childWithKnownNs = document.createElementNS("http://ns1.com", "p1:child");
        Element childWithUnknownNs = document.createElementNS("http://nsUnknown.com", "unknown:child");
        parent.appendChild(childWithKnownNs);
        parent.appendChild(childWithUnknownNs);

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.ENGLISH);
        parent.setAttribute("xmlns:p1", "http://ns1.com");

        DOMNodePointer childKnownPointer = new DOMNodePointer(parentPointer, childWithKnownNs);
        Assert.assertEquals("/p1:child[1]", childKnownPointer.asPath());

        DOMNodePointer childUnknownPointer = new DOMNodePointer(parentPointer, childWithUnknownNs);
        Assert.assertEquals("/node()[2]", childUnknownPointer.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        DOMNodePointer ptr1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Element otherElem = document.createElement("other");
        DOMNodePointer ptr3 = new DOMNodePointer(otherElem, Locale.ENGLISH);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(ptr3));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("aString"));

        Assert.assertEquals(System.identityHashCode(rootElement), ptr1.hashCode());
    }

    @Test
    public void testGetPointerByID() {
        JXPathContext context = JXPathContext.newContext(document);
        rootElement.setIdAttribute("id", true);

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Pointer ptr = docPointer.getPointerByID(context, "rootId");
        Assert.assertNotNull(ptr);
        Assert.assertSame(rootElement, ptr.getNode());

        Pointer nullPtr = docPointer.getPointerByID(context, "nonExistent");
        Assert.assertTrue(nullPtr instanceof NullPointer);

        DOMNodePointer elemPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Pointer ptrFromElem = elemPointer.getPointerByID(context, "rootId");
        Assert.assertSame(rootElement, ptrFromElem.getNode());
    }

    @Test
    public void testCompareChildNodePointers() {
        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);

        rootElement.setAttribute("a", "1");
        rootElement.setAttribute("b", "2");
        Attr attrA = rootElement.getAttributeNode("a");
        Attr attrB = rootElement.getAttributeNode("b");

        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);

        NodePointer pAttrA = rootPointer.createAttribute(JXPathContext.newContext(document), new QName("a"));
        NodePointer pAttrB = rootPointer.createAttribute(JXPathContext.newContext(document), new QName("b"));
        NodePointer pChild1 = new DOMNodePointer(rootPointer, child1);
        NodePointer pChild2 = new DOMNodePointer(rootPointer, child2);

        // Same pointer
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(pChild1, pChild1));

        // Attribute vs Element
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pAttrA, pChild1));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pChild1, pAttrA));

        // Attribute vs Attribute
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pAttrA, pAttrB));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pAttrB, pAttrA));

        // Element vs Element
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pChild2, pChild1));

        // Element not in hierarchy
        Element unrelated = document.createElement("unrelated");
        NodePointer pUnrelated = new DOMNodePointer(rootPointer, unrelated);
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(pChild1, pUnrelated));
    }
}
