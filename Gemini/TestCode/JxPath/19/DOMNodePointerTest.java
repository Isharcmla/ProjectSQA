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
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
    public void testConstructorsAndBasicGetters() {
        Element root = document.createElement("root");
        document.appendChild(root);

        DOMNodePointer pointer1 = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals(root, pointer1.getBaseValue());
        Assert.assertEquals(root, pointer1.getImmediateNode());
        Assert.assertTrue(pointer1.isActual());
        Assert.assertFalse(pointer1.isCollection());
        Assert.assertEquals(1, pointer1.getLength());
        Assert.assertTrue(pointer1.isLeaf());

        DOMNodePointer pointer2 = new DOMNodePointer(root, Locale.GERMANY, "myId");
        Assert.assertEquals("id('myId')", pointer2.asPath());

        Element child = document.createElement("child");
        root.appendChild(child);
        Assert.assertFalse(pointer1.isLeaf());

        DOMNodePointer childPointer = new DOMNodePointer(pointer1, child);
        Assert.assertEquals(pointer1, childPointer.getParent());
        Assert.assertEquals(child, childPointer.getNode());
    }

    @Test
    public void testTestNode_NullTest() {
        Element elem = document.createElement("test");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.US);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNode_NodeNameTest() {
        Element elem = document.createElementNS("http://example.com/ns", "p:test");
        document.appendChild(elem);
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.US);

        // Non-element node
        Text text = document.createTextNode("text");
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeNameTest(new QName("test"))));

        // Wildcard with null prefix
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName(null, "*"))));

        // Wildcard with matching prefix
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName("p", "*"), "http://example.com/ns")));

        // Specific local name and matching namespace URI
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName("p", "test"), "http://example.com/ns")));

        // Matching name, mismatching namespace
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName("p", "test"), "http://wrong.com")));

        // Mismatching local name
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName("other"))));

        // Element with no namespace URI, test prefix matches node prefix
        Element noNsElem = document.createElement("p:localOnly");
        DOMNodePointer noNsPtr = new DOMNodePointer(noNsElem, Locale.US);
        Assert.assertTrue(noNsPtr.testNode(new NodeNameTest(new QName("p", "localOnly"))));
        Assert.assertFalse(noNsPtr.testNode(new NodeNameTest(new QName("otherPrefix", "localOnly"))));
    }

    @Test
    public void testTestNode_NodeTypeTest() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("hello");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        Assert.assertTrue(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Assert.assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        Assert.assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(9999)));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "someData");
        Element elem = document.createElement("elem");

        Assert.assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("myTarget")));
        Assert.assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("otherTarget")));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new ProcessingInstructionTest("myTarget")));
    }

    @Test
    public void testGetName() {
        Element elem = document.createElementNS("http://example.com", "ns:tag");
        DOMNodePointer elemPtr = new DOMNodePointer(elem, Locale.US);
        QName elemName = elemPtr.getName();
        Assert.assertEquals("ns", elemName.getPrefix());
        Assert.assertEquals("tag", elemName.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("piTarget", "data");
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.US);
        QName piName = piPtr.getName();
        Assert.assertNull(piName.getPrefix());
        Assert.assertEquals("piTarget", piName.getName());

        Comment comment = document.createComment("text");
        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.US);
        QName commentName = commentPtr.getName();
        Assert.assertNull(commentName.getPrefix());
        Assert.assertNull(commentName.getName());
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elem = document.createElementNS("http://example.com", "p:name");
        Assert.assertEquals("p", DOMNodePointer.getPrefix(elem));
        Assert.assertEquals("name", DOMNodePointer.getLocalName(elem));

        // Non-namespace aware node containing colon
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        try {
            Document nonNsDoc = dbf.newDocumentBuilder().newDocument();
            Element nonNsElem = nonNsDoc.createElement("colon:tag");
            Assert.assertEquals("colon", DOMNodePointer.getPrefix(nonNsElem));
            Assert.assertEquals("tag", DOMNodePointer.getLocalName(nonNsElem));

            Element noColonElem = nonNsDoc.createElement("plain");
            Assert.assertNull(DOMNodePointer.getPrefix(noColonElem));
            Assert.assertEquals("plain", DOMNodePointer.getLocalName(noColonElem));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testGetNamespaceURI_Node() {
        Element parent = document.createElement("parent");
        parent.setAttribute("xmlns:p", "http://parent.com");
        parent.setAttribute("xmlns", "http://default.com");
        document.appendChild(parent);

        Element child = document.createElement("p:child");
        parent.appendChild(child);

        Assert.assertEquals("http://parent.com", DOMNodePointer.getNamespaceURI(child));
        Assert.assertEquals("http://default.com", DOMNodePointer.getNamespaceURI(parent));
        Assert.assertEquals("http://default.com", DOMNodePointer.getNamespaceURI(document));

        Element unattached = document.createElement("unattached");
        Assert.assertNull(DOMNodePointer.getNamespaceURI(unattached));
    }

    @Test
    public void testGetNamespaceURI_Prefix() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns:custom", "http://custom.com");
        root.setAttribute("xmlns", "http://default.com");
        document.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://custom.com", ptr.getNamespaceURI("custom"));
        // Cached lookup
        Assert.assertEquals("http://custom.com", ptr.getNamespaceURI("custom"));
        // Unknown prefix
        Assert.assertNull(ptr.getNamespaceURI("nonExistentPrefix"));
        // Cached unknown lookup
        Assert.assertNull(ptr.getNamespaceURI("nonExistentPrefix"));

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("http://custom.com", docPtr.getNamespaceURI("custom"));
        Assert.assertEquals("http://default.com", docPtr.getDefaultNamespaceURI());

        Element emptyDocRoot = document.createElement("emptyRoot");
        DOMNodePointer emptyPtr = new DOMNodePointer(emptyDocRoot, Locale.US);
        Assert.assertNull(emptyPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testIteratorsAndResolver() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);

        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodePointer nsPtr = ptr.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NamespaceResolver resolver = ptr.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, ptr.getNamespaceResolver());
    }

    @Test
    public void testIsLanguageAndLanguageAttribute() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        document.appendChild(root);

        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("EN-US"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = document.createElement("noLang");
        DOMNodePointer noLangPtr = new DOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
        Assert.assertFalse(noLangPtr.isLanguage("en"));
    }

    @Test
    public void testSetValue_TextAndCDATA() {
        Element root = document.createElement("root");
        document.appendChild(root);
        Text text = document.createTextNode("initial");
        root.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        // Empty string removes the text node
        textPtr.setValue("");
        Assert.assertNull(text.getParentNode());

        CDATASection cdata = document.createCDATASection("cdataInitial");
        root.appendChild(cdata);
        DOMNodePointer cdataPtr = new DOMNodePointer(cdata, Locale.US);
        cdataPtr.setValue("cdataUpdated");
        Assert.assertEquals("cdataUpdated", cdata.getNodeValue());
        cdataPtr.setValue(null);
        Assert.assertNull(cdata.getParentNode());
    }

    @Test
    public void testSetValue_Element() {
        Element root = document.createElement("root");
        root.appendChild(document.createElement("oldChild"));
        document.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        // Set string value
        rootPtr.setValue("newText");
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("newText", root.getFirstChild().getNodeValue());

        // Set empty string value
        rootPtr.setValue("");
        Assert.assertEquals(0, root.getChildNodes().getLength());

        // Set Element value (children copied)
        Element donor = document.createElement("donor");
        donor.appendChild(document.createElement("donorChild1"));
        donor.appendChild(document.createElement("donorChild2"));
        rootPtr.setValue(donor);
        Assert.assertEquals(2, root.getChildNodes().getLength());
        Assert.assertEquals("donorChild1", root.getChildNodes().item(0).getNodeName());

        // Set Document value (children copied)
        Document donorDoc = document.getImplementation().createDocument(null, null, null);
        donorDoc.appendChild(donorDoc.createElement("docChild"));
        rootPtr.setValue(donorDoc);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("docChild", root.getFirstChild().getNodeName());

        // Set another node type (e.g. comment appended)
        Comment donorComment = document.createComment("donorComment");
        rootPtr.setValue(donorComment);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals(Node.COMMENT_NODE, root.getFirstChild().getNodeType());
    }

    @Test
    public void testCreateChild() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                if (node instanceof Element) {
                    Element elem = (Element) node;
                    Element child = elem.getOwnerDocument().createElement(name);
                    elem.appendChild(child);
                    return true;
                }
                return false;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("item"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("item", childPtr.getName().getName());

        NodePointer childWithValuePtr = rootPtr.createChild(context, new QName("itemWithValue"), 0, "val");
        Assert.assertNotNull(childWithValuePtr);
        Assert.assertEquals("val", childWithValuePtr.getValue());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_Failure() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });

        rootPtr.createChild(context, new QName("missing"), 0);
    }

    @Test
    public void testCreateAttribute() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(document);

        // Attribute without prefix
        NodePointer attrPtr = rootPtr.createAttribute(context, new QName("myAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(root.hasAttribute("myAttr"));

        // Duplicate attribute without prefix
        NodePointer attrPtr2 = rootPtr.createAttribute(context, new QName("myAttr"));
        Assert.assertNotNull(attrPtr2);

        // Attribute with known prefix
        root.setAttribute("xmlns:ns", "http://test.com/ns");
        rootPtr.getNamespaceResolver().registerNamespace("ns", "http://test.com/ns");
        NodePointer nsAttrPtr = rootPtr.createAttribute(context, new QName("ns", "myAttr2"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertEquals("http://test.com/ns", root.getAttributeNodeNS("http://test.com/ns", "myAttr2").getNamespaceURI());

        // On non-element node
        Text text = document.createTextNode("txt");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        try {
            textPtr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception when creating attribute on text node");
        }
        catch (JXPathException expected) {
            // Expected
        }
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownPrefix() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(document);
        rootPtr.createAttribute(context, new QName("unregistered", "attr"));
    }

    @Test
    public void testRemove() {
        Element root = document.createElement("root");
        document.appendChild(root);
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        childPtr.remove();
        Assert.assertNull(child.getParentNode());

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        try {
            rootPtr.remove();
            Assert.fail("Expected exception when removing root DOM node without parent");
        }
        catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testAsPath() {
        Element root = document.createElementNS("http://test.com", "ns:root");
        document.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        Element child1 = document.createElement("child");
        root.appendChild(child1);
        DOMNodePointer child1Ptr = new DOMNodePointer(rootPtr, child1);

        Element child2 = document.createElement("child");
        root.appendChild(child2);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);

        Assert.assertEquals("/child[1]", child1Ptr.asPath());
        Assert.assertEquals("/child[2]", child2Ptr.asPath());

        // Child with namespace and registered prefix
        Element nsChild = document.createElementNS("http://test.com", "ns:elem");
        root.appendChild(nsChild);
        DOMNodePointer nsChildPtr = new DOMNodePointer(rootPtr, nsChild);
        rootPtr.getNamespaceResolver().registerNamespace("pfx", "http://test.com");
        Assert.assertEquals("/pfx:elem[1]", nsChildPtr.asPath());

        // Child with namespace but no prefix registered in resolver -> node()[index]
        Element anonNsChild = document.createElementNS("http://unknown.com", "anon");
        root.appendChild(anonNsChild);
        DOMNodePointer anonNsChildPtr = new DOMNodePointer(rootPtr, anonNsChild);
        Assert.assertEquals("/node()[4]", anonNsChildPtr.asPath());

        // Text nodes
        Text text1 = document.createTextNode("t1");
        Text text2 = document.createTextNode("t2");
        root.appendChild(text1);
        root.appendChild(text2);
        DOMNodePointer text1Ptr = new DOMNodePointer(rootPtr, text1);
        DOMNodePointer text2Ptr = new DOMNodePointer(rootPtr, text2);
        Assert.assertEquals("/text()[1]", text1Ptr.asPath());
        Assert.assertEquals("/text()[2]", text2Ptr.asPath());

        // Processing instruction nodes
        ProcessingInstruction pi1 = document.createProcessingInstruction("target1", "d1");
        ProcessingInstruction pi2 = document.createProcessingInstruction("target1", "d2");
        root.appendChild(pi1);
        root.appendChild(pi2);
        DOMNodePointer pi1Ptr = new DOMNodePointer(rootPtr, pi1);
        DOMNodePointer pi2Ptr = new DOMNodePointer(rootPtr, pi2);
        Assert.assertEquals("/processing-instruction('target1')[1]", pi1Ptr.asPath());
        Assert.assertEquals("/processing-instruction('target1')[2]", pi2Ptr.asPath());

        // Document pointer path
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("", docPtr.asPath());

        // Under non-DOMNodePointer parent
        VariablePointer varPtr = new VariablePointer(new QName("var"));
        DOMNodePointer childUnderVar = new DOMNodePointer(varPtr, child1);
        Assert.assertEquals("$var", childUnderVar.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = document.createElement("elem");
        Element elem2 = document.createElement("elem");
        DOMNodePointer ptr1 = new DOMNodePointer(elem1, Locale.US);
        DOMNodePointer ptr1Same = new DOMNodePointer(elem1, Locale.GERMANY);
        DOMNodePointer ptr2 = new DOMNodePointer(elem2, Locale.US);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr1Same));
        Assert.assertFalse(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("StringObject"));
        Assert.assertEquals(elem1.hashCode(), ptr1.hashCode());
    }

    @Test
    public void testGetValueAndStringValue() {
        Comment comment = document.createComment("  a comment  ");
        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.US);
        Assert.assertEquals("a comment", commentPtr.getValue());

        Element root = document.createElement("root");
        root.appendChild(document.createTextNode("  hello  "));
        root.appendChild(document.createComment("comment"));
        root.appendChild(document.createCDATASection("  world  "));
        root.appendChild(document.createProcessingInstruction("pi", "  pidata  "));

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        // By default, whitespace is trimmed on text/cdata/pi
        Assert.assertEquals("helloworldpidata", rootPtr.getValue());

        // With xml:space="preserve"
        root.setAttribute("xml:space", "preserve");
        Assert.assertEquals("  hello    world    pidata  ", rootPtr.getValue());
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        root.setAttribute("id", "rootId");
        document.appendChild(root);

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.US);
        JXPathContext context = JXPathContext.newContext(document);

        Pointer notFound = docPtr.getPointerByID(context, "nonExistent");
        Assert.assertTrue(notFound instanceof NullPointer);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        Pointer notFoundFromElem = rootPtr.getPointerByID(context, "nonExistent");
        Assert.assertTrue(notFoundFromElem instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element parent = document.createElement("parent");
        parent.setAttribute("a", "1");
        parent.setAttribute("b", "2");

        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        parent.appendChild(child1);
        parent.appendChild(child2);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.US);

        DOMNodePointer c1Ptr = new DOMNodePointer(parentPtr, child1);
        DOMNodePointer c2Ptr = new DOMNodePointer(parentPtr, child2);
        DOMNodePointer a1Ptr = new DOMNodePointer(parentPtr, parent.getAttributeNode("a"));
        DOMNodePointer a2Ptr = new DOMNodePointer(parentPtr, parent.getAttributeNode("b"));

        // Same pointer / same node
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(c1Ptr, c1Ptr));

        // Attribute vs Non-attribute
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(a1Ptr, c1Ptr));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(c1Ptr, a1Ptr));

        // Attribute vs Attribute
        int attrComp = parentPtr.compareChildNodePointers(a1Ptr, a2Ptr);
        Assert.assertTrue(attrComp == -1 || attrComp == 1);

        // Child vs Child
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(c1Ptr, c2Ptr));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(c2Ptr, c1Ptr));

        // Unknown child not in parent
        Element alien = document.createElement("alien");
        DOMNodePointer alienPtr = new DOMNodePointer(parentPtr, alien);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(alienPtr, alienPtr));
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(alienPtr, c1Ptr));
    }
}
