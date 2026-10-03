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
        factory.setNamespaceAware(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.newDocument();

        DocumentBuilderFactory factoryNS = DocumentBuilderFactory.newInstance();
        factoryNS.setNamespaceAware(true);
        DocumentBuilder builderNS = factoryNS.newDocumentBuilder();
        docNS = builderNS.newDocument();
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        Element root = doc.createElement("root");
        doc.appendChild(root);

        DOMNodePointer pointer1 = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals(root, pointer1.getBaseValue());
        Assert.assertEquals(root, pointer1.getImmediateNode());
        Assert.assertTrue(pointer1.isActual());
        Assert.assertFalse(pointer1.isCollection());
        Assert.assertEquals(1, pointer1.getLength());
        Assert.assertTrue(pointer1.isLeaf());

        DOMNodePointer pointer2 = new DOMNodePointer(root, Locale.US, "myId");
        Assert.assertEquals("id('myId')", pointer2.asPath());

        DOMNodePointer childPointer = new DOMNodePointer(pointer1, root);
        Assert.assertEquals(pointer1, childPointer.getParent());
    }

    @Test
    public void testTestNode_nullTest() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(root, null));
    }

    @Test
    public void testTestNode_nodeNameTest() {
        Element root = docNS.createElementNS("http://example.com/ns", "ns:root");
        Text text = docNS.createTextNode("text");

        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeNameTest(new QName("ns", "root"))));

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(DOMNodePointer.testNode(root, wildcardNoPrefix));

        NodeNameTest wildcardWithPrefix = new NodeNameTest(new QName("ns", "*"), "http://example.com/ns");
        Assert.assertTrue(DOMNodePointer.testNode(root, wildcardWithPrefix));

        NodeNameTest wildcardMismatchNS = new NodeNameTest(new QName("ns", "*"), "http://other.com");
        Assert.assertFalse(DOMNodePointer.testNode(root, wildcardMismatchNS));

        NodeNameTest matchNameAndNS = new NodeNameTest(new QName("ns", "root"), "http://example.com/ns");
        Assert.assertTrue(DOMNodePointer.testNode(root, matchNameAndNS));

        NodeNameTest mismatchName = new NodeNameTest(new QName("ns", "other"), "http://example.com/ns");
        Assert.assertFalse(DOMNodePointer.testNode(root, mismatchName));

        Element simpleElem = doc.createElement("item");
        NodeNameTest matchNoNS = new NodeNameTest(new QName("item"), null);
        Assert.assertTrue(DOMNodePointer.testNode(simpleElem, matchNoNS));

        NodeNameTest emptyNSMatch = new NodeNameTest(new QName("item"), "   ");
        Assert.assertTrue(DOMNodePointer.testNode(simpleElem, emptyNSMatch));
    }

    @Test
    public void testTestNode_nodeTypeTest() {
        Element elem = doc.createElement("elem");
        Text text = doc.createTextNode("txt");
        CDATASection cdata = doc.createCDATASection("cdata");
        Comment comment = doc.createComment("comment");
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");

        Assert.assertTrue(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        Assert.assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Assert.assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        Assert.assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(999)));
    }

    @Test
    public void testTestNode_processingInstructionTest() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        Element elem = doc.createElement("elem");

        ProcessingInstructionTest piTestMatch = new ProcessingInstructionTest("target");
        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("other");

        Assert.assertTrue(DOMNodePointer.testNode(pi, piTestMatch));
        Assert.assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTestMatch));
    }

    @Test
    public void testGetName() {
        Element elem = doc.createElement("prefix:tag");
        DOMNodePointer ptrElem = new DOMNodePointer(elem, Locale.US);
        Assert.assertEquals(new QName("prefix", "tag"), ptrElem.getName());

        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        DOMNodePointer ptrPI = new DOMNodePointer(pi, Locale.US);
        Assert.assertEquals(new QName(null, "target"), ptrPI.getName());

        Text text = doc.createTextNode("text");
        DOMNodePointer ptrText = new DOMNodePointer(text, Locale.US);
        Assert.assertEquals(new QName(null, null), ptrText.getName());
    }

    @Test
    public void testGetNamespaceURI_Prefixes() {
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:foo", "http://foo.com");
        root.setAttribute("xmlns", "http://default.com");
        doc.appendChild(root);

        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);

        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://foo.com", ptr.getNamespaceURI("foo"));
        Assert.assertEquals("http://foo.com", ptr.getNamespaceURI("foo")); // test cached
        Assert.assertNull(ptr.getNamespaceURI("unknown"));
        Assert.assertNull(ptr.getNamespaceURI("unknown")); // test cached unknown

        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://default.com", docPtr.getNamespaceURI(""));
        Assert.assertEquals("http://foo.com", docPtr.getNamespaceURI("foo"));
    }

    @Test
    public void testGetDefaultNamespaceURI_NoNamespace() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);
        Assert.assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_StaticMethod() {
        Element rootNS = docNS.createElementNS("http://ns.com", "ns:elem");
        Assert.assertEquals("http://ns.com", DOMNodePointer.getNamespaceURI(rootNS));

        docNS.appendChild(rootNS);
        Assert.assertEquals("http://ns.com", DOMNodePointer.getNamespaceURI(docNS));

        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://mydefault.com");
        Assert.assertEquals("http://mydefault.com", DOMNodePointer.getNamespaceURI(root));

        Element child = doc.createElement("child");
        root.appendChild(child);
        Assert.assertEquals("http://mydefault.com", DOMNodePointer.getNamespaceURI(child));

        Element noNS = doc.createElement("noNS");
        Assert.assertNull(DOMNodePointer.getNamespaceURI(noNS));
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elemNS = docNS.createElementNS("http://ns.com", "p:name");
        Assert.assertEquals("p", DOMNodePointer.getPrefix(elemNS));
        Assert.assertEquals("name", DOMNodePointer.getLocalName(elemNS));

        Element elemSimple = doc.createElement("name");
        Assert.assertNull(DOMNodePointer.getPrefix(elemSimple));
        Assert.assertEquals("name", DOMNodePointer.getLocalName(elemSimple));

        Element elemColon = doc.createElement("pre:test");
        Assert.assertEquals("pre", DOMNodePointer.getPrefix(elemColon));
        Assert.assertEquals("test", DOMNodePointer.getLocalName(elemColon));
    }

    @Test
    public void testIterators() {
        Element root = doc.createElement("root");
        root.setAttribute("attr1", "val1");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);

        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr1"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("foo");
        Assert.assertNotNull(nsPtr);
    }

    @Test
    public void testIsLanguageAndGetLanguage() {
        Element root = doc.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("en-US"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element rootNoLang = doc.createElement("root2");
        DOMNodePointer noLangPtr = new DOMNodePointer(rootNoLang, Locale.US);
        Assert.assertTrue(noLangPtr.isLanguage("en"));
        Assert.assertFalse(noLangPtr.isLanguage("fr"));
    }

    @Test
    public void testGetValue() {
        Comment comment = doc.createComment(" a comment ");
        Assert.assertEquals("a comment", new DOMNodePointer(comment, Locale.US).getValue());

        Comment emptyComment = doc.createComment(null);
        Assert.assertEquals("", new DOMNodePointer(emptyComment, Locale.US).getValue());

        Text text = doc.createTextNode(" hello ");
        Assert.assertEquals("hello", new DOMNodePointer(text, Locale.US).getValue());

        CDATASection cdata = doc.createCDATASection(" cdata ");
        Assert.assertEquals("cdata", new DOMNodePointer(cdata, Locale.US).getValue());

        ProcessingInstruction pi = doc.createProcessingInstruction("target", " some data ");
        Assert.assertEquals("some data", new DOMNodePointer(pi, Locale.US).getValue());

        Element parent = doc.createElement("parent");
        Text t1 = doc.createTextNode("Hello ");
        Element child = doc.createElement("child");
        Text t2 = doc.createTextNode("World");
        child.appendChild(t2);
        parent.appendChild(t1);
        parent.appendChild(child);
        Assert.assertEquals("Hello World", new DOMNodePointer(parent, Locale.US).getValue());
    }

    @Test
    public void testSetValue_TextAndCDATA() {
        Element parent = doc.createElement("parent");
        Text text = doc.createTextNode("init");
        parent.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        textPtr.setValue("");
        Assert.assertFalse(parent.hasChildNodes());
    }

    @Test
    public void testSetValue_ElementWithStringAndNode() {
        Element parent = doc.createElement("parent");
        parent.appendChild(doc.createElement("oldChild"));
        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.US);

        parentPtr.setValue("new text");
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("new text", parent.getFirstChild().getNodeValue());

        parentPtr.setValue("");
        Assert.assertEquals(0, parent.getChildNodes().getLength());

        Element newChildContainer = doc.createElement("container");
        newChildContainer.appendChild(doc.createElement("c1"));
        newChildContainer.appendChild(doc.createElement("c2"));
        parentPtr.setValue(newChildContainer);
        Assert.assertEquals(2, parent.getChildNodes().getLength());

        Text singleNode = doc.createTextNode("single");
        parentPtr.setValue(singleNode);
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("single", parent.getFirstChild().getNodeValue());
    }

    @Test
    public void testCreateAttribute() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);

        NodePointer attrPtr = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(root.hasAttribute("attr1"));

        root.setAttribute("xmlns:foo", "http://foo.com");
        NodePointer nsAttrPtr = ptr.createAttribute(context, new QName("foo", "attr2"));
        Assert.assertNotNull(nsAttrPtr);

        Text text = doc.createTextNode("txt");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.US);
        try {
            textPtr.createAttribute(context, new QName("attr"));
            Assert.fail("Should throw exception for non-element attribute creation");
        } catch (JXPathException expected) {
        }
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownPrefix() {
        Element root = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        ptr.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void testRemove() {
        Element parent = doc.createElement("parent");
        Element child = doc.createElement("child");
        parent.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.US);
        childPtr.remove();
        Assert.assertFalse(parent.hasChildNodes());

        try {
            DOMNodePointer rootPtr = new DOMNodePointer(parent, Locale.US);
            rootPtr.remove();
            Assert.fail("Removing root should throw exception");
        } catch (JXPathException expected) {
        }
    }

    @Test
    public void testAsPath() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        Element child1 = doc.createElement("child");
        Element child2 = doc.createElement("child");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer childPtr1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer childPtr2 = new DOMNodePointer(rootPtr, child2);

        Assert.assertEquals("/child[1]", childPtr1.asPath());
        Assert.assertEquals("/child[2]", childPtr2.asPath());

        Text t1 = doc.createTextNode("t1");
        Text t2 = doc.createTextNode("t2");
        root.appendChild(t1);
        root.appendChild(t2);

        DOMNodePointer t1Ptr = new DOMNodePointer(rootPtr, t1);
        DOMNodePointer t2Ptr = new DOMNodePointer(rootPtr, t2);
        Assert.assertEquals("/text()[1]", t1Ptr.asPath());
        Assert.assertEquals("/text()[2]", t2Ptr.asPath());

        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('target')[1]", piPtr.asPath());

        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);
        Assert.assertEquals("", docPtr.asPath());

        DOMNodePointer idPtr = new DOMNodePointer(root, Locale.US, "my'id\"test");
        Assert.assertEquals("id('my&apos;id&quot;test')", idPtr.asPath());
    }

    @Test
    public void testAsPath_WithNamespaces() {
        Element root = docNS.createElementNS("http://example.com/ns1", "p1:root");
        docNS.appendChild(root);

        Element child = docNS.createElementNS("http://example.com/ns2", "p2:child");
        root.appendChild(child);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p2", "http://example.com/ns2");
        childPtr.setNamespaceResolver(resolver);

        Assert.assertEquals("/p2:child[1]", childPtr.asPath());

        NamespaceResolver emptyResolver = new NamespaceResolver();
        childPtr.setNamespaceResolver(emptyResolver);
        Assert.assertEquals("/node()[1]", childPtr.asPath());
    }

    @Test
    public void testHashCodeAndEquals() {
        Element elem1 = doc.createElement("elem");
        Element elem2 = doc.createElement("elem");

        DOMNodePointer ptr1a = new DOMNodePointer(elem1, Locale.US);
        DOMNodePointer ptr1b = new DOMNodePointer(elem1, Locale.US);
        DOMNodePointer ptr2 = new DOMNodePointer(elem2, Locale.US);

        Assert.assertEquals(ptr1a, ptr1a);
        Assert.assertEquals(ptr1a, ptr1b);
        Assert.assertNotEquals(ptr1a, ptr2);
        Assert.assertNotEquals(ptr1a, "some string");
        Assert.assertNotEquals(ptr1a, null);
        Assert.assertEquals(ptr1a.hashCode(), ptr1b.hashCode());
    }

    @Test
    public void testGetPointerByID() {
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.US);

        Pointer pNull = docPtr.getPointerByID(null, "nonexistent");
        Assert.assertTrue(pNull instanceof NullPointer);

        DOMNodePointer elemPtr = new DOMNodePointer(root, Locale.US);
        Pointer pNullFromElem = elemPtr.getPointerByID(null, "nonexistent");
        Assert.assertTrue(pNullFromElem instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = doc.createElement("root");
        root.setAttribute("attr1", "v1");
        root.setAttribute("attr2", "v2");
        Element c1 = doc.createElement("c1");
        Element c2 = doc.createElement("c2");
        root.appendChild(c1);
        root.appendChild(c2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        Attr a1 = root.getAttributeNode("attr1");
        Attr a2 = root.getAttributeNode("attr2");

        DOMNodePointer ptrA1 = new DOMNodePointer(rootPtr, a1);
        DOMNodePointer ptrA2 = new DOMNodePointer(rootPtr, a2);
        DOMNodePointer ptrC1 = new DOMNodePointer(rootPtr, c1);
        DOMNodePointer ptrC2 = new DOMNodePointer(rootPtr, c2);

        Assert.assertEquals(0, rootPtr.compareChildNodePointers(ptrC1, ptrC1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrA1, ptrC1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrC1, ptrA1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrA1, ptrA2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrA2, ptrA1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(ptrC1, ptrC2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(ptrC2, ptrC1));
    }

    @Test
    public void testCreateChild_Success() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);

        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) {
                Element parentElem = (Element) parent;
                Element child = parentElem.getOwnerDocument().createElement(name);
                parentElem.appendChild(child);
                return true;
            }
        });

        NodePointer created = rootPtr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(created);
        Assert.assertEquals("child", ((Node) created.getBaseValue()).getNodeName());

        NodePointer createdWithValue = rootPtr.createChild(context, new QName("childWithValue"), 0, "testVal");
        Assert.assertNotNull(createdWithValue);
        Assert.assertEquals("testVal", createdWithValue.getValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_NoFactoryThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryReturnsFalseThrowsException() {
        Element root = doc.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) {
                return false;
            }
        });
        rootPtr.createChild(context, new QName("child"), 0);
    }
}
```
