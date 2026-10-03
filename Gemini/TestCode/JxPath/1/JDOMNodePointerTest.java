package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.junit.Assert;
import org.junit.Test;

public class JDOMNodePointerTest {

    @Test
    public void testConstructorsAndBasicGetters() {
        Element root = new Element("root");
        JDOMNodePointer ptr1 = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals(root, ptr1.getBaseValue());
        Assert.assertEquals(root, ptr1.getImmediateNode());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertTrue(ptr1.isLeaf());

        JDOMNodePointer ptr2 = new JDOMNodePointer(root, Locale.US, "testId");
        Assert.assertEquals("id('testId')", ptr2.asPath());

        JDOMNodePointer childPtr = new JDOMNodePointer(ptr1, root);
        Assert.assertEquals(ptr1, childPtr.getParent());
    }

    @Test
    public void testEscapeIdInAsPath() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US, "id'with\"quotes");
        Assert.assertEquals("id('id&apos;with&quot;quotes')", ptr.asPath());
    }

    @Test
    public void testIsLeaf() {
        Element emptyElem = new Element("empty");
        JDOMNodePointer elemPtr = new JDOMNodePointer(emptyElem, Locale.US);
        Assert.assertTrue(elemPtr.isLeaf());

        emptyElem.addContent(new Text("content"));
        Assert.assertFalse(elemPtr.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer docPtr = new JDOMNodePointer(emptyDoc, Locale.US);
        Assert.assertTrue(docPtr.isLeaf());

        emptyDoc.setRootElement(new Element("root"));
        Assert.assertFalse(docPtr.isLeaf());

        Text textNode = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(textNode, Locale.US);
        Assert.assertTrue(textPtr.isLeaf());
    }

    @Test
    public void testGetName() {
        Element elemNoNs = new Element("test");
        JDOMNodePointer ptrNoNs = new JDOMNodePointer(elemNoNs, Locale.US);
        Assert.assertEquals(new QName(null, "test"), ptrNoNs.getName());

        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element elemWithNs = new Element("test", ns);
        JDOMNodePointer ptrWithNs = new JDOMNodePointer(elemWithNs, Locale.US);
        Assert.assertEquals(new QName("pfx", "test"), ptrWithNs.getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptrPi = new JDOMNodePointer(pi, Locale.US);
        Assert.assertEquals(new QName(null, "target"), ptrPi.getName());

        Text text = new Text("sample");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.US);
        Assert.assertEquals(new QName(null, null), ptrText.getName());
    }

    @Test
    public void testGetNamespaceURI() {
        Element elem = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        Assert.assertNull(ptr.getNamespaceURI());

        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element elemNs = new Element("elem", ns);
        JDOMNodePointer ptrNs = new JDOMNodePointer(elemNs, Locale.US);
        Assert.assertEquals("http://example.com", ptrNs.getNamespaceURI());

        Text text = new Text("txt");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.US);
        Assert.assertNull(ptrText.getNamespaceURI());

        // getNamespaceURI(String prefix) for Element
        elemNs.addNamespaceDeclaration(Namespace.getNamespace("other", "http://other.com"));
        Assert.assertEquals("http://other.com", ptrNs.getNamespaceURI("other"));
        Assert.assertNull(ptrNs.getNamespaceURI("unknown"));

        // getNamespaceURI(String prefix) for Document
        Document doc = new Document(elemNs);
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://other.com", docPtr.getNamespaceURI("other"));
        Assert.assertNull(docPtr.getNamespaceURI("unknown"));

        Assert.assertNull(ptrText.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetValue() {
        Element elem = new Element("elem");
        elem.setText("  hello  ");
        Assert.assertEquals("hello", new JDOMNodePointer(elem, Locale.US).getValue());

        Comment comment = new Comment("  comment  ");
        Assert.assertEquals("comment", new JDOMNodePointer(comment, Locale.US).getValue());

        Comment emptyComment = new Comment("");
        Assert.assertEquals("", new JDOMNodePointer(emptyComment, Locale.US).getValue());

        Text text = new Text("  text  ");
        Assert.assertEquals("text", new JDOMNodePointer(text, Locale.US).getValue());

        CDATA cdata = new CDATA("  cdata  ");
        Assert.assertEquals("cdata", new JDOMNodePointer(cdata, Locale.US).getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  data  ");
        Assert.assertEquals("data", new JDOMNodePointer(pi, Locale.US).getValue());

        Assert.assertNull(new JDOMNodePointer(new Object(), Locale.US).getValue());
    }

    @Test
    public void testSetValueOnText() {
        Element parent = new Element("parent");
        Text text = new Text("initial");
        parent.addContent(text);
        JDOMNodePointer ptr = new JDOMNodePointer(parent, text);

        ptr.setValue("updated");
        Assert.assertEquals("updated", text.getText());

        ptr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void testSetValueOnElement() {
        Element target = new Element("target");
        JDOMNodePointer ptr = new JDOMNodePointer(target, Locale.US);

        // String value
        ptr.setValue("text value");
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("text value", ((Text) target.getContent().get(0)).getText());

        // Empty string value clears
        ptr.setValue("");
        Assert.assertEquals(0, target.getContent().size());

        // Element with mixed children
        Element srcElem = new Element("src");
        srcElem.addContent(new Element("childElem"));
        srcElem.addContent(new Text("childText"));
        srcElem.addContent(new CDATA("childCDATA"));
        srcElem.addContent(new ProcessingInstruction("pi", "data"));
        srcElem.addContent(new Comment("childComment"));
        ptr.setValue(srcElem);
        Assert.assertEquals(5, target.getContent().size());

        // Document value
        Document srcDoc = new Document();
        Element docRoot = new Element("docRoot");
        srcDoc.setRootElement(docRoot);
        ptr.setValue(srcDoc);
        Assert.assertEquals(1, target.getContent().size());

        // Single Text/CDATA value
        ptr.setValue(new Text("standaloneText"));
        Assert.assertEquals(1, target.getContent().size());

        ptr.setValue(new CDATA("standaloneCDATA"));
        Assert.assertEquals(1, target.getContent().size());

        // Single ProcessingInstruction value
        ptr.setValue(new ProcessingInstruction("targetPI", "piData"));
        Assert.assertEquals(1, target.getContent().size());

        // Single Comment value
        ptr.setValue(new Comment("standaloneComment"));
        Assert.assertEquals(1, target.getContent().size());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element parent = new Element("parent");
        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2");
        parent.setAttribute(attr1);
        parent.setAttribute(attr2);

        Element child1 = new Element("c1");
        Element child2 = new Element("c2");
        parent.addContent(child1);
        parent.addContent(child2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.US);
        NodePointer pAttr1 = parentPtr.createAttribute(JXPathContext.newContext(parent), new QName("a1"));
        NodePointer pAttr2 = parentPtr.createAttribute(JXPathContext.newContext(parent), new QName("a2"));
        NodePointer pChild1 = new JDOMNodePointer(parentPtr, child1);
        NodePointer pChild2 = new JDOMNodePointer(parentPtr, child2);

        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pChild1, pChild1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pAttr1, pChild1));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pChild1, pAttr1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pAttr1, pAttr2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pAttr2, pAttr1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pChild2, pChild1));

        // Unknown attribute not in element
        Attribute foreignAttr = new Attribute("foreign", "val");
        NodePointer pForeignAttr = new JDOMNodePointer(parentPtr, foreignAttr);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pForeignAttr, pForeignAttr));

        // Unknown child not in element
        Element foreignChild = new Element("foreignChild");
        NodePointer pForeignChild = new JDOMNodePointer(parentPtr, foreignChild);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pForeignChild, new Element("another")));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointersNonElementParentThrows() {
        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.US);
        NodePointer p1 = new JDOMNodePointer(textPtr, new Element("a"));
        NodePointer p2 = new JDOMNodePointer(textPtr, new Element("b"));
        textPtr.compareChildNodePointers(p1, p2);
    }

    @Test
    public void testTestNode() {
        Element elem = new Element("tag", Namespace.getNamespace("pfx", "http://example.com"));
        Text text = new Text("text");
        CDATA cdata = new CDATA("cdata");
        Comment comment = new Comment("comment");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        // null test
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, null));

        // NodeNameTest
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, new NodeNameTest(new QName("tag"))));
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, new NodeNameTest(new QName("*"))));
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, new NodeNameTest(new QName("pfx", "tag"), "http://example.com")));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeNameTest(new QName("pfx", "tag"), "http://other.com")));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeNameTest(new QName("otherTag"))));

        // NodeTypeTest
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new NodeTypeTest(999)));

        // ProcessingInstructionTest
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, new ProcessingInstructionTest("target")));
        Assert.assertFalse(JDOMNodePointer.testNode(null, pi, new ProcessingInstructionTest("other")));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, new ProcessingInstructionTest("target")));

        // Instance testNode invocation
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        Assert.assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elemNoPrefix = new Element("elem");
        Assert.assertNull(JDOMNodePointer.getPrefix(elemNoPrefix));
        Assert.assertEquals("elem", JDOMNodePointer.getLocalName(elemNoPrefix));

        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element elemWithPrefix = new Element("elem", ns);
        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(elemWithPrefix));

        Attribute attrNoPrefix = new Attribute("attr", "val");
        Assert.assertNull(JDOMNodePointer.getPrefix(attrNoPrefix));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attrNoPrefix));

        Attribute attrWithPrefix = new Attribute("attr", "val", ns);
        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(attrWithPrefix));

        Text text = new Text("text");
        Assert.assertNull(JDOMNodePointer.getPrefix(text));
        Assert.assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void testIsLanguage() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(new JDOMNodePointer(root, Locale.US), child);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = new Element("noLang");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
    }

    @Test
    public void testIterators() {
        Element root = new Element("root");
        root.setAttribute("attr", "val");
        root.addNamespaceDeclaration(Namespace.getNamespace("pfx", "http://example.com"));
        root.addContent(new Element("child"));

        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        NodeIterator childIt = ptr.childIterator(new NodeTypeTest(Compiler.NODE_TYPE_NODE), false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("pfx");
        Assert.assertNotNull(nsPtr);
    }

    @Test
    public void testCreateAttribute() {
        Element elem = new Element("elem");
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        elem.addNamespaceDeclaration(ns);
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        JXPathContext ctx = JXPathContext.newContext(elem);

        NodePointer attrPtr = ptr.createAttribute(ctx, new QName("testAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("", elem.getAttributeValue("testAttr"));

        // Calling again returns existing
        NodePointer attrPtr2 = ptr.createAttribute(ctx, new QName("testAttr"));
        Assert.assertNotNull(attrPtr2);

        // Attribute with known namespace
        NodePointer nsAttrPtr = ptr.createAttribute(ctx, new QName("pfx", "nsAttr"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertEquals("", elem.getAttributeValue("nsAttr", ns));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeUnknownNamespaceThrows() {
        Element elem = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        JXPathContext ctx = JXPathContext.newContext(elem);
        ptr.createAttribute(ctx, new QName("unknown", "attr"));
    }

    @Test
    public void testCreateAttributeNonElement() {
        Text text = new Text("txt");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.US);
        JXPathContext ctx = JXPathContext.newContext(text);
        try {
            ptr.createAttribute(ctx, new QName("attr"));
            Assert.fail("Expected exception for non-element attribute creation");
        } catch (JXPathException expected) {
            // super.createAttribute throws JXPathException
        }
    }

    @Test
    public void testRemove() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.US);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        childPtr.remove();
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootThrows() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        ptr.remove();
    }

    @Test
    public void testCreateChild() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        JXPathContext ctx = JXPathContext.newContext(root);

        // Factory not set
        try {
            ptr.createChild(ctx, new QName("child"), 0);
            Assert.fail("Expected exception when factory is not set");
        } catch (JXPathException expected) {
            // expected
        }

        // Factory returning true
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextNode, String name, int index) {
                ((Element) contextNode).addContent(new Element(name));
                return true;
            }
        });

        NodePointer created = ptr.createChild(ctx, new QName("child"), 0);
        Assert.assertNotNull(created);
        Assert.assertEquals("child", created.getName().getName());

        // createChild with index == WHOLE_COLLECTION (-1) and value
        NodePointer createdWithValue = ptr.createChild(ctx, new QName("childWithValue"), NodePointer.WHOLE_COLLECTION, "someValue");
        Assert.assertNotNull(createdWithValue);
        Assert.assertEquals("someValue", createdWithValue.getValue());

        // Factory returning false
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextNode, String name, int index) {
                return false;
            }
        });

        try {
            ptr.createChild(ctx, new QName("uncreatable"), 0);
            Assert.fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException expected) {
            // expected
        }
    }

    @Test
    public void testAsPath() {
        Element root = new Element("root");
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        Element nsChild = new Element("child", ns);
        Text text = new Text("sample");
        CDATA cdata = new CDATA("cdataText");
        ProcessingInstruction pi = new ProcessingInstruction("testPI", "data");

        root.addContent(child1);
        root.addContent(child2);
        root.addContent(nsChild);
        root.addContent(text);
        root.addContent(cdata);
        root.addContent(pi);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals("", rootPtr.asPath());

        JDOMNodePointer child1Ptr = new JDOMNodePointer(rootPtr, child1);
        Assert.assertEquals("/child[1]", child1Ptr.asPath());

        JDOMNodePointer child2Ptr = new JDOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/child[2]", child2Ptr.asPath());

        // Namespace child without registered prefix in resolver produces node()
        JDOMNodePointer nsChildPtr = new JDOMNodePointer(rootPtr, nsChild);
        Assert.assertEquals("/node()[3]", nsChildPtr.asPath());

        // Register prefix in resolver
        rootPtr.getNamespaceResolver().registerNamespace("pfx", "http://example.com");
        Assert.assertEquals("/pfx:child[1]", nsChildPtr.asPath());

        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata);
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());

        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('testPI')[1]", piPtr.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = new Element("elem");
        Element elem2 = new Element("elem");

        JDOMNodePointer ptr1a = new JDOMNodePointer(elem1, Locale.US);
        JDOMNodePointer ptr1b = new JDOMNodePointer(elem1, Locale.US);
        JDOMNodePointer ptr2 = new JDOMNodePointer(elem2, Locale.US);

        Assert.assertTrue(ptr1a.equals(ptr1a));
        Assert.assertTrue(ptr1a.equals(ptr1b));
        Assert.assertFalse(ptr1a.equals(ptr2));
        Assert.assertFalse(ptr1a.equals(null));
        Assert.assertFalse(ptr1a.equals("not a pointer"));

        Assert.assertEquals(ptr1a.hashCode(), ptr1b.hashCode());
    }
}
