package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
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
    public void testConstructorsAndBasicAccessors() {
        Element root = new Element("root");
        JDOMNodePointer ptr1 = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals(root, ptr1.getNode());
        Assert.assertEquals(root, ptr1.getBaseValue());
        Assert.assertEquals(root, ptr1.getImmediateNode());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(Locale.ENGLISH, ptr1.getLocale());

        JDOMNodePointer ptr2 = new JDOMNodePointer(root, Locale.FRENCH, "id1'\"test");
        Assert.assertEquals("id('id&apos;&quot;test')", ptr2.asPath());

        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, child);
        Assert.assertEquals(ptr1, ptr3.getParent());
        Assert.assertEquals(child, ptr3.getNode());
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element root = new Element("root");
        root.setAttribute("attr", "val");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);

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
    public void testGetNamespaceURI_elementAndDocument() {
        Namespace ns = Namespace.getNamespace("p", "http://example.com/ns");
        Element root = new Element("root", ns);
        Document doc = new Document(root);

        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("http://example.com/ns", docPtr.getNamespaceURI("p"));
        Assert.assertNull(docPtr.getNamespaceURI("unknown"));

        JDOMNodePointer elemPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("http://example.com/ns", elemPtr.getNamespaceURI());
        Assert.assertEquals("http://example.com/ns", elemPtr.getNamespaceURI("p"));
        Assert.assertNull(elemPtr.getNamespaceURI("unknown"));

        Element noNsElem = new Element("noNs");
        JDOMNodePointer noNsPtr = new JDOMNodePointer(noNsElem, Locale.ENGLISH);
        Assert.assertNull(noNsPtr.getNamespaceURI());

        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(textPtr.getNamespaceURI());
        Assert.assertNull(textPtr.getNamespaceURI("p"));
    }

    @Test
    public void testCompareChildNodePointers_sameNode() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        parent.addContent(child1);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, child1);

        Assert.assertEquals(0, parentPtr.compareChildNodePointers(p1, p1));
    }

    @Test
    public void testCompareChildNodePointers_attributeVersusElement() {
        Element parent = new Element("parent");
        Attribute attr = new Attribute("attr", "val");
        Element child = new Element("child");
        parent.setAttribute(attr);
        parent.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer attrPtr = new JDOMNodePointer(parentPtr, attr);
        JDOMNodePointer elemPtr = new JDOMNodePointer(parentPtr, child);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, elemPtr));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(elemPtr, attrPtr));
    }

    @Test
    public void testCompareChildNodePointers_attributes() {
        Element parent = new Element("parent");
        Attribute a1 = new Attribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2");
        Attribute a3 = new Attribute("a3", "v3"); // not added to element
        parent.setAttribute(a1);
        parent.setAttribute(a2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, a1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, a2);
        JDOMNodePointer p3 = new JDOMNodePointer(parentPtr, a3);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(p3, p3));
    }

    @Test
    public void testCompareChildNodePointers_elements() {
        Element parent = new Element("parent");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        Element c3 = new Element("c3"); // not added
        parent.addContent(c1);
        parent.addContent(c2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, c1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, c2);
        JDOMNodePointer p3 = new JDOMNodePointer(parentPtr, c3);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(p3, p3));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_nonElementParentThrowsException() {
        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        JDOMNodePointer child1 = new JDOMNodePointer(textPtr, new Element("e1"));
        JDOMNodePointer child2 = new JDOMNodePointer(textPtr, new Element("e2"));
        textPtr.compareChildNodePointers(child1, child2);
    }

    @Test
    public void testIsLeaf() {
        Element emptyElem = new Element("empty");
        Assert.assertTrue(new JDOMNodePointer(emptyElem, Locale.ENGLISH).isLeaf());

        Element nonEmptyElem = new Element("nonEmpty");
        nonEmptyElem.addContent(new Text("content"));
        Assert.assertFalse(new JDOMNodePointer(nonEmptyElem, Locale.ENGLISH).isLeaf());

        Document emptyDoc = new Document();
        Assert.assertTrue(new JDOMNodePointer(emptyDoc, Locale.ENGLISH).isLeaf());

        Document nonEmptyDoc = new Document(new Element("root"));
        Assert.assertFalse(new JDOMNodePointer(nonEmptyDoc, Locale.ENGLISH).isLeaf());

        Text text = new Text("val");
        Assert.assertTrue(new JDOMNodePointer(text, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testGetName() {
        Namespace ns = Namespace.getNamespace("pref", "http://example.com");
        Element elemWithPrefix = new Element("item", ns);
        Assert.assertEquals(new QName("pref", "item"), new JDOMNodePointer(elemWithPrefix, Locale.ENGLISH).getName());

        Element elemNoPrefix = new Element("item");
        Assert.assertEquals(new QName(null, "item"), new JDOMNodePointer(elemNoPrefix, Locale.ENGLISH).getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        Assert.assertEquals(new QName(null, "target"), new JDOMNodePointer(pi, Locale.ENGLISH).getName());

        Text text = new Text("text");
        Assert.assertEquals(new QName(null, null), new JDOMNodePointer(text, Locale.ENGLISH).getName());
    }

    @Test
    public void testGetValue() {
        Element elem = new Element("root");
        elem.setText("  elem text  ");
        Assert.assertEquals("elem text", new JDOMNodePointer(elem, Locale.ENGLISH).getValue());

        Comment comment = new Comment("  comment text  ");
        Assert.assertEquals("comment text", new JDOMNodePointer(comment, Locale.ENGLISH).getValue());

        Comment emptyComment = new Comment("");
        Assert.assertEquals("", new JDOMNodePointer(emptyComment, Locale.ENGLISH).getValue());

        Text text = new Text("  text val  ");
        Assert.assertEquals("text val", new JDOMNodePointer(text, Locale.ENGLISH).getValue());

        CDATA cdata = new CDATA("  cdata val  ");
        Assert.assertEquals("cdata val", new JDOMNodePointer(cdata, Locale.ENGLISH).getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  pi data  ");
        Assert.assertEquals("pi data", new JDOMNodePointer(pi, Locale.ENGLISH).getValue());

        ProcessingInstruction emptyPi = new ProcessingInstruction("target", "");
        Assert.assertEquals("", new JDOMNodePointer(emptyPi, Locale.ENGLISH).getValue());

        Document doc = new Document();
        Assert.assertNull(new JDOMNodePointer(doc, Locale.ENGLISH).getValue());
    }

    @Test
    public void testSetValue_textNode() {
        Element parent = new Element("parent");
        Text text = new Text("initial");
        parent.addContent(text);

        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getText());

        textPtr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void testSetValue_elementWithVariousTypes() {
        Element parent = new Element("parent");
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);

        Element sourceElem = new Element("src");
        sourceElem.addContent(new Element("child1"));
        sourceElem.addContent(new Text("textChild"));
        parentPtr.setValue(sourceElem);
        Assert.assertEquals(2, parent.getContent().size());

        Document sourceDoc = new Document();
        sourceDoc.addContent(new Element("docChild"));
        parentPtr.setValue(sourceDoc);
        Assert.assertEquals(1, parent.getContent().size());

        parentPtr.setValue(new Text("just text"));
        Assert.assertEquals(1, parent.getContent().size());
        Assert.assertEquals("just text", parent.getText());

        parentPtr.setValue(new CDATA("just cdata"));
        Assert.assertEquals(1, parent.getContent().size());
        Assert.assertEquals("just cdata", parent.getText());

        parentPtr.setValue(new ProcessingInstruction("target", "data"));
        Assert.assertEquals(1, parent.getContent().size());
        Assert.assertTrue(parent.getContent().get(0) instanceof ProcessingInstruction);

        parentPtr.setValue(new Comment("comment text"));
        Assert.assertEquals(1, parent.getContent().size());
        Assert.assertTrue(parent.getContent().get(0) instanceof Comment);

        parentPtr.setValue("plain string");
        Assert.assertEquals("plain string", parent.getText());

        parentPtr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void testTestNode() {
        Element elem = new Element("item");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        Assert.assertTrue(ptr.testNode(null));

        // NodeNameTest
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName(null, "item"))));
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName(null, "other"))));
        Assert.assertTrue(ptr.testNode(new NodeNameTest(new QName(null, "*"))));
        Assert.assertFalse(ptr.testNode(new NodeNameTest(new QName("p", "*"))));

        Namespace ns = Namespace.getNamespace("p", "http://example.com");
        Element nsElem = new Element("item", ns);
        JDOMNodePointer nsPtr = new JDOMNodePointer(nsElem, Locale.ENGLISH);
        Assert.assertTrue(nsPtr.testNode(new NodeNameTest(new QName("p", "item"), "http://example.com")));
        Assert.assertFalse(nsPtr.testNode(new NodeNameTest(new QName("p", "item"), "http://different.com")));

        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertFalse(textPtr.testNode(new NodeNameTest(new QName(null, "item"))));

        // NodeTypeTest
        Assert.assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(new JDOMNodePointer(new Document(elem), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(textPtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(new JDOMNodePointer(new CDATA("cdata"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Comment comment = new Comment("comm");
        Assert.assertTrue(new JDOMNodePointer(comment, Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        Assert.assertTrue(new JDOMNodePointer(pi, Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(9999)));

        // ProcessingInstructionTest
        Assert.assertTrue(new JDOMNodePointer(pi, Locale.ENGLISH).testNode(new ProcessingInstructionTest("target")));
        Assert.assertFalse(new JDOMNodePointer(pi, Locale.ENGLISH).testNode(new ProcessingInstructionTest("otherTarget")));
        Assert.assertFalse(ptr.testNode(new ProcessingInstructionTest("target")));
    }

    @Test
    public void testGetPrefixAndGetLocalName() {
        Namespace ns = Namespace.getNamespace("p", "http://example.com");
        Element elemWithPrefix = new Element("name", ns);
        Element elemNoPrefix = new Element("name");
        Attribute attrWithPrefix = new Attribute("attr", "val", ns);
        Attribute attrNoPrefix = new Attribute("attr", "val");
        Comment comment = new Comment("text");

        Assert.assertEquals("p", JDOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(elemNoPrefix));
        Assert.assertEquals("p", JDOMNodePointer.getPrefix(attrWithPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(attrNoPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(comment));

        Assert.assertEquals("name", JDOMNodePointer.getLocalName(elemWithPrefix));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attrWithPrefix));
        Assert.assertNull(JDOMNodePointer.getLocalName(comment));
    }

    @Test
    public void testIsLanguage() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);

        Element child = new Element("child");
        root.addContent(child);

        Element grandChild = new Element("grandChild");
        child.addContent(grandChild);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, grandChild);

        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("EN-us"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = new Element("item");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
        Assert.assertFalse(noLangPtr.isLanguage("en"));

        // Coverage for nodeParent on different types
        CDATA cdata = new CDATA("cdata");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        Comment comment = new Comment("comment");
        root.addContent(cdata);
        root.addContent(pi);
        root.addContent(comment);

        Assert.assertTrue(new JDOMNodePointer(rootPtr, cdata).isLanguage("en"));
        Assert.assertTrue(new JDOMNodePointer(rootPtr, pi).isLanguage("en"));
        Assert.assertTrue(new JDOMNodePointer(rootPtr, comment).isLanguage("en"));
    }

    @Test
    public void testCreateAttribute() {
        Element elem = new Element("root");
        Namespace ns = Namespace.getNamespace("p", "http://example.com");
        elem.addNamespaceDeclaration(ns);

        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(elem);

        NodePointer attrPtr1 = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtr1);
        Assert.assertEquals("", elem.getAttributeValue("attr1"));

        // Repeated creation doesn't wipe
        elem.setAttribute("attr1", "val1");
        NodePointer attrPtr1Again = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertEquals("val1", elem.getAttributeValue("attr1"));

        NodePointer attrPtr2 = ptr.createAttribute(context, new QName("p", "attr2"));
        Assert.assertNotNull(attrPtr2);
        Assert.assertEquals("", elem.getAttributeValue("attr2", ns));

        elem.setAttribute("attr2", "val2", ns);
        ptr.createAttribute(context, new QName("p", "attr2"));
        Assert.assertEquals("val2", elem.getAttributeValue("attr2", ns));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_unknownPrefixThrowsException() {
        Element elem = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(elem);
        ptr.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test(expected = RuntimeException.class)
    public void testCreateAttribute_onNonElementCallsSuper() {
        Text text = new Text("sample");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(text);
        ptr.createAttribute(context, new QName("attr"));
    }

    @Test
    public void testCreateChild_withFactory() {
        Element root = new Element("root");
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextBean, String name, int index) {
                if (contextBean instanceof Element && "item".equals(name)) {
                    ((Element) contextBean).addContent(new Element("item"));
                    return true;
                }
                return false;
            }
        });

        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer childPtr = ptr.createChild(context, new QName("item"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals(1, root.getChildren("item").size());

        NodePointer childWithValPtr = ptr.createChild(context, new QName("item"), 1, "testValue");
        Assert.assertNotNull(childWithValPtr);
        Assert.assertEquals(2, root.getChildren("item").size());
        Assert.assertEquals("testValue", root.getChildren("item").get(1).getText());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_noFactoryThrowsException() {
        Element root = new Element("root");
        JXPathContext context = JXPathContext.newContext(root);
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        ptr.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_factoryReturnsFalseThrowsException() {
        Element root = new Element("root");
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer parent, Object contextBean, String name, int index) {
                return false;
            }
        });
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        ptr.createChild(context, new QName("child"), 0);
    }

    @Test
    public void testRemove() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);

        childPtr.remove();
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test(expected = JXPathException.class)
    public void testRemove_rootThrowsException() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        rootPtr.remove();
    }

    @Test
    public void testAsPath() {
        Element root = new Element("root");
        Document doc = new Document(root);
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        Text text1 = new Text("text");
        CDATA cdata1 = new CDATA("cdata");
        ProcessingInstruction pi1 = new ProcessingInstruction("piTarget", "piData");
        ProcessingInstruction pi2 = new ProcessingInstruction("piTarget", "piData2");

        root.addContent(child1);
        root.addContent(child2);
        root.addContent(text1);
        root.addContent(cdata1);
        root.addContent(pi1);
        root.addContent(pi2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer c1Ptr = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer c2Ptr = new JDOMNodePointer(rootPtr, child2);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text1);
        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata1);
        JDOMNodePointer pi1Ptr = new JDOMNodePointer(rootPtr, pi1);
        JDOMNodePointer pi2Ptr = new JDOMNodePointer(rootPtr, pi2);

        Assert.assertEquals("/child[1]", c1Ptr.asPath());
        Assert.assertEquals("/child[2]", c2Ptr.asPath());
        Assert.assertEquals("/text()[1]", textPtr.asPath());
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());
        Assert.assertEquals("/processing-instruction('piTarget')[1]", pi1Ptr.asPath());
        Assert.assertEquals("/processing-instruction('piTarget')[2]", pi2Ptr.asPath());

        // Namespace prefix resolution in path
        Namespace ns = Namespace.getNamespace("myPref", "http://example.com/ns");
        Element nsChild = new Element("nsChild", ns);
        root.addContent(nsChild);

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("myPref", "http://example.com/ns");
        rootPtr.setNamespaceResolver(resolver);

        JDOMNodePointer nsChildPtr = new JDOMNodePointer(rootPtr, nsChild);
        Assert.assertEquals("/myPref:nsChild[1]", nsChildPtr.asPath());

        // Namespace without prefix registered fallback to node()[x]
        Namespace ns2 = Namespace.getNamespace("unknownPref", "http://unregistered.com");
        Element nsChild2 = new Element("nsChild2", ns2);
        root.addContent(nsChild2);
        JDOMNodePointer nsChild2Ptr = new JDOMNodePointer(rootPtr, nsChild2);
        Assert.assertTrue(nsChild2Ptr.asPath().contains("node()["));

        // Standalone text/cdata/pi relative position when parent is null
        Text orphanText = new Text("orphan");
        Assert.assertEquals("/text()[1]", new JDOMNodePointer(orphanText, Locale.ENGLISH).asPath());
        ProcessingInstruction orphanPi = new ProcessingInstruction("orphanPi", "");
        Assert.assertEquals("/processing-instruction('orphanPi')[1]", new JDOMNodePointer(orphanPi, Locale.ENGLISH).asPath());

        // Document parent relative position
        Element docElem = new Element("docElem");
        Document singleDoc = new Document(docElem);
        JDOMNodePointer docElemPtr = new JDOMNodePointer(docElem, Locale.ENGLISH);
        Assert.assertEquals("", docElemPtr.asPath());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element e1 = new Element("elem");
        Element e2 = new Element("elem");

        JDOMNodePointer p1 = new JDOMNodePointer(e1, Locale.ENGLISH);
        JDOMNodePointer p1Copy = new JDOMNodePointer(e1, Locale.FRENCH);
        JDOMNodePointer p2 = new JDOMNodePointer(e2, Locale.ENGLISH);

        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p1.equals(p1Copy));
        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p1.equals("non-pointer"));
        Assert.assertFalse(p1.equals(null));

        Assert.assertEquals(p1.hashCode(), p1Copy.hashCode());
    }

    @Test
    public void testNamespaceConstants() {
        Assert.assertEquals("http://www.w3.org/XML/1998/namespace", JDOMNodePointer.XML_NAMESPACE_URI);
        Assert.assertEquals("http://www.w3.org/2000/xmlns/", JDOMNodePointer.XMLNS_NAMESPACE_URI);
    }
}
