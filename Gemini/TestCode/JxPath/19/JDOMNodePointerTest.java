package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

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
        Element element = new Element("root");
        JDOMNodePointer ptr1 = new JDOMNodePointer(element, Locale.US);
        Assert.assertEquals(element, ptr1.getBaseValue());
        Assert.assertEquals(element, ptr1.getImmediateNode());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(element.hashCode(), ptr1.hashCode());

        JDOMNodePointer ptr2 = new JDOMNodePointer(element, Locale.US, "test-id");
        Assert.assertEquals("id('test-id')", ptr2.asPath());

        Element child = new Element("child");
        element.addContent(child);
        JDOMNodePointer childPtr = new JDOMNodePointer(ptr1, child);
        Assert.assertEquals(ptr1, childPtr.getParent());
        Assert.assertEquals(child, childPtr.getBaseValue());
    }

    @Test
    public void testEquals() {
        Element el1 = new Element("test");
        Element el2 = new Element("test");
        JDOMNodePointer ptr1 = new JDOMNodePointer(el1, Locale.US);
        JDOMNodePointer ptr2 = new JDOMNodePointer(el1, Locale.US);
        JDOMNodePointer ptr3 = new JDOMNodePointer(el2, Locale.US);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(ptr3));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("string"));
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);

        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
        Assert.assertTrue(nsPtr instanceof JDOMNamespacePointer);
    }

    @Test
    public void testGetNamespaceResolverAndURI() {
        Namespace nsFoo = Namespace.getNamespace("foo", "http://foo.com");
        Element root = new Element("root", nsFoo);
        Document doc = new Document(root);

        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        NamespaceResolver resolver = ptr.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, ptr.getNamespaceResolver()); // Test synchronization / caching

        Assert.assertEquals("http://foo.com", ptr.getNamespaceURI());
        Assert.assertEquals("http://www.w3.org/XML/1998/namespace", ptr.getNamespaceURI("xml"));
        Assert.assertEquals("http://foo.com", ptr.getNamespaceURI("foo"));
        Assert.assertNull(ptr.getNamespaceURI("unknown"));

        // Document pointer
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://foo.com", docPtr.getNamespaceURI("foo"));

        // Non-element / non-document node
        Text text = new Text("hello");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.US);
        Assert.assertNull(textPtr.getNamespaceURI());
        Assert.assertNull(textPtr.getNamespaceURI("foo"));

        // Element with empty namespace
        Element emptyNsEl = new Element("empty");
        JDOMNodePointer emptyNsPtr = new JDOMNodePointer(emptyNsEl, Locale.US);
        Assert.assertNull(emptyNsPtr.getNamespaceURI());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = new Element("root");
        Attribute a1 = new Attribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2");
        root.setAttribute(a1);
        root.setAttribute(a2);

        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        root.addContent(c1);
        root.addContent(c2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        NodePointer pA1 = new JDOMNodePointer(rootPtr, a1);
        NodePointer pA2 = new JDOMNodePointer(rootPtr, a2);
        NodePointer pC1 = new JDOMNodePointer(rootPtr, c1);
        NodePointer pC2 = new JDOMNodePointer(rootPtr, c2);

        // Same pointer
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pA1, pA1));

        // Attribute vs Element
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pA1, pC1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pC1, pA1));

        // Attribute vs Attribute
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pA1, pA2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pA2, pA1));

        // Element vs Element
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pC1, pC2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pC2, pC1));

        // Attribute not in element list
        Attribute a3 = new Attribute("a3", "v3");
        NodePointer pA3 = new JDOMNodePointer(rootPtr, a3);
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pA3, pA3));

        // Child not in list
        Element c3 = new Element("c3");
        NodePointer pC3 = new JDOMNodePointer(rootPtr, c3);
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pC3, pC3));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NotElement() {
        Text text = new Text("hello");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.US);
        textPtr.compareChildNodePointers(textPtr, textPtr);
    }

    @Test
    public void testIsLeaf() {
        Element emptyEl = new Element("empty");
        JDOMNodePointer emptyElPtr = new JDOMNodePointer(emptyEl, Locale.US);
        Assert.assertTrue(emptyElPtr.isLeaf());

        Element nonEl = new Element("nonEmpty");
        nonEl.addContent(new Text("content"));
        JDOMNodePointer nonElPtr = new JDOMNodePointer(nonEl, Locale.US);
        Assert.assertFalse(nonElPtr.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer emptyDocPtr = new JDOMNodePointer(emptyDoc, Locale.US);
        Assert.assertTrue(emptyDocPtr.isLeaf());

        Document nonDoc = new Document(new Element("root"));
        JDOMNodePointer nonDocPtr = new JDOMNodePointer(nonDoc, Locale.US);
        Assert.assertFalse(nonDocPtr.isLeaf());

        Comment comment = new Comment("test");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        Assert.assertTrue(commentPtr.isLeaf());
    }

    @Test
    public void testGetName() {
        Element elNoNs = new Element("tag");
        JDOMNodePointer ptrNoNs = new JDOMNodePointer(elNoNs, Locale.US);
        Assert.assertEquals(new QName(null, "tag"), ptrNoNs.getName());

        Namespace ns = Namespace.getNamespace("p", "http://test");
        Element elNs = new Element("tag", ns);
        JDOMNodePointer ptrNs = new JDOMNodePointer(elNs, Locale.US);
        Assert.assertEquals(new QName("p", "tag"), ptrNs.getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.US);
        Assert.assertEquals(new QName(null, "target"), piPtr.getName());

        Comment comment = new Comment("comment");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        Assert.assertEquals(new QName(null, null), commentPtr.getName());
    }

    @Test
    public void testGetValue() {
        // Element with text and child elements
        Element root = new Element("root");
        root.addContent(new Text("Hello "));
        Element sub = new Element("sub");
        sub.addContent(new Text("World"));
        root.addContent(sub);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals("Hello World", rootPtr.getValue());

        // Comment
        Comment comment = new Comment("  some comment  ");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        Assert.assertEquals("some comment", commentPtr.getValue());

        Comment emptyComment = new Comment(null);
        JDOMNodePointer emptyCommentPtr = new JDOMNodePointer(emptyComment, Locale.US);
        Assert.assertEquals("", emptyCommentPtr.getValue());

        // Text trimmed vs preserve
        Element parent = new Element("p");
        Text text = new Text("  spaces  ");
        parent.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(parent, text);
        Assert.assertEquals("spaces", textPtr.getValue());

        parent.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Assert.assertEquals("  spaces  ", textPtr.getValue());

        // ProcessingInstruction
        ProcessingInstruction pi = new ProcessingInstruction("target", "  some data  ");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.US);
        Assert.assertEquals("some data", piPtr.getValue());
    }

    @Test
    public void testSetValueOnText() {
        Element parent = new Element("root");
        Text text = new Text("original");
        parent.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(parent, text);

        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getText());

        textPtr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void testSetValueOnElement() {
        Element element = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.US);

        // Set Element content
        Element sourceElem = new Element("src");
        sourceElem.addContent(new Element("childElem"));
        sourceElem.addContent(new Text("childText"));
        sourceElem.addContent(new ProcessingInstruction("pi", "data"));
        sourceElem.addContent(new Comment("comment"));
        ptr.setValue(sourceElem);
        Assert.assertEquals(4, element.getContent().size());

        // Set Document content
        Document sourceDoc = new Document();
        Element docElem = new Element("docElem");
        sourceDoc.setRootElement(docElem);
        ptr.setValue(sourceDoc);
        Assert.assertEquals(1, element.getContent().size());

        // Set Text / CDATA
        ptr.setValue(new Text("simple text"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertEquals("simple text", ((Text) element.getContent().get(0)).getText());

        ptr.setValue(new CDATA("cdata text"));
        Assert.assertEquals(1, element.getContent().size());

        // Set PI
        ptr.setValue(new ProcessingInstruction("piTarget", "piData"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertTrue(element.getContent().get(0) instanceof ProcessingInstruction);

        // Set Comment
        ptr.setValue(new Comment("a comment"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertTrue(element.getContent().get(0) instanceof Comment);

        // Set String
        ptr.setValue("plain text");
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertEquals("plain text", ((Text) element.getContent().get(0)).getText());

        // Set empty String
        ptr.setValue("");
        Assert.assertEquals(0, element.getContent().size());
    }

    @Test
    public void testTestNode() {
        Element element = new Element("test", "p", "http://test");
        Text text = new Text("content");
        CDATA cdata = new CDATA("cdata");
        Comment comment = new Comment("comment");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        // null test
        Assert.assertTrue(JDOMNodePointer.testNode(null, element, null));

        // NodeNameTest
        NodeNameTest wildTest = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(JDOMNodePointer.testNode(null, element, wildTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, wildTest));

        NodeNameTest matchTest = new NodeNameTest(new QName("p", "test"), "http://test");
        Assert.assertTrue(JDOMNodePointer.testNode(null, element, matchTest));

        NodeNameTest prefixMatchNoNs = new NodeNameTest(new QName("p", "test"), null);
        Element noNsElem = new Element("test");
        Assert.assertFalse(JDOMNodePointer.testNode(null, noNsElem, prefixMatchNoNs));

        NodeNameTest mismatchTest = new NodeNameTest(new QName("other"));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, mismatchTest));

        // NodeTypeTest
        NodeTypeTest nodeTestNode = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(JDOMNodePointer.testNode(null, element, nodeTestNode));

        NodeTypeTest nodeTestText = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, nodeTestText));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, nodeTestText));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, nodeTestText));

        NodeTypeTest nodeTestComment = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, nodeTestComment));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, nodeTestComment));

        NodeTypeTest nodeTestPI = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, nodeTestPI));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, nodeTestPI));

        NodeTypeTest invalidType = new NodeTypeTest(999);
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, invalidType));

        // ProcessingInstructionTest
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target");
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, piTest));
        ProcessingInstructionTest piMismatch = new ProcessingInstructionTest("other");
        Assert.assertFalse(JDOMNodePointer.testNode(null, pi, piMismatch));

        // testNode instance method
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.US);
        Assert.assertTrue(ptr.testNode(wildTest));
    }

    @Test
    public void testGetPrefixAndGetLocalName() {
        Element el = new Element("tag", "p", "http://test");
        Attribute attr = new Attribute("attr", "val", Namespace.getNamespace("a", "http://attr"));
        Element noNsEl = new Element("tag");
        Attribute noNsAttr = new Attribute("attr", "val");

        Assert.assertEquals("p", JDOMNodePointer.getPrefix(el));
        Assert.assertNull(JDOMNodePointer.getPrefix(noNsEl));
        Assert.assertEquals("a", JDOMNodePointer.getPrefix(attr));
        Assert.assertNull(JDOMNodePointer.getPrefix(noNsAttr));
        Assert.assertNull(JDOMNodePointer.getPrefix(new Text("txt")));

        Assert.assertEquals("tag", JDOMNodePointer.getLocalName(el));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attr));
        Assert.assertNull(JDOMNodePointer.getLocalName(new Text("txt")));
    }

    @Test
    public void testLanguage() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(new JDOMNodePointer(root, Locale.US), child);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("EN"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLang = new Element("noLang");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLang, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
    }

    @Test
    public void testCreateChildAndCreateAttribute() {
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, Pointer parent, Object context, String name, int index) {
                if (context instanceof Element) {
                    Element parentElem = (Element) context;
                    Element newElem = new Element(name);
                    parentElem.addContent(newElem);
                    return true;
                }
                return false;
            }
        });

        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);

        NodePointer childPtr = ptr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", ((Element) childPtr.getBaseValue()).getName());

        NodePointer childWithVal = ptr.createChild(context, new QName("childVal"), NodePointer.WHOLE_COLLECTION, "someVal");
        Assert.assertNotNull(childWithVal);
        Assert.assertEquals("someVal", childWithVal.getValue());

        // createAttribute unqualified
        NodePointer attrPtr = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtr);
        Assert.assertNotNull(root.getAttribute("attr1"));

        // createAttribute existing
        NodePointer attrPtrExisting = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attrPtrExisting);

        // createAttribute with prefix registered
        ptr.getNamespaceResolver().registerNamespace("ns", "http://ns");
        NodePointer nsAttrPtr = ptr.createAttribute(context, new QName("ns", "attr2"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertNotNull(root.getAttribute("attr2", Namespace.getNamespace("ns", "http://ns")));

        // createAttribute on non-element fallback
        Text textNode = new Text("txt");
        JDOMNodePointer textPtr = new JDOMNodePointer(textNode, Locale.US);
        try {
            textPtr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception when creating attribute on non-element");
        } catch (Exception expected) {
        }
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryFailure() {
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, Pointer parent, Object context, String name, int index) {
                return false;
            }
        });

        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        ptr.createChild(context, new QName("fail"), 0);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownPrefix() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.US);
        ptr.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void testRemove() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        Assert.assertEquals(1, root.getContent().size());
        childPtr.remove();
        Assert.assertEquals(0, root.getContent().size());
    }

    @Test(expected = JXPathException.class)
    public void testRemove_RootThrowsException() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        rootPtr.remove();
    }

    @Test
    public void testAsPath() {
        Element root = new Element("root");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        root.addContent(child1);
        root.addContent(child2);

        Namespace ns = Namespace.getNamespace("custom", "http://custom.com");
        Element childNs = new Element("elem", ns);
        root.addContent(childNs);

        Text text = new Text("textVal");
        CDATA cdata = new CDATA("cdataVal");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        root.addContent(text);
        root.addContent(cdata);
        root.addContent(pi);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals("", rootPtr.asPath());

        JDOMNodePointer child1Ptr = new JDOMNodePointer(rootPtr, child1);
        Assert.assertEquals("/child[1]", child1Ptr.asPath());

        JDOMNodePointer child2Ptr = new JDOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/child[2]", child2Ptr.asPath());

        JDOMNodePointer childNsPtr = new JDOMNodePointer(rootPtr, childNs);
        // Namespace not registered on resolver -> node()[3]
        Assert.assertEquals("/node()[3]", childNsPtr.asPath());

        // Namespace registered
        rootPtr.getNamespaceResolver().registerNamespace("custom", "http://custom.com");
        Assert.assertEquals("/custom:elem[1]", childNsPtr.asPath());

        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata);
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());

        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('target')[1]", piPtr.asPath());
    }

    @Test
    public void testFindEnclosingAttributeAndParentHelpers() {
        Element root = new Element("root");
        CDATA cdata = new CDATA("cdata");
        ProcessingInstruction pi = new ProcessingInstruction("pi", "data");
        Comment comment = new Comment("comm");
        root.addContent(cdata);
        root.addContent(pi);
        root.addContent(comment);

        root.setAttribute("lang", "fr", Namespace.XML_NAMESPACE);

        JDOMNodePointer cdataPtr = new JDOMNodePointer(root, cdata);
        Assert.assertTrue(cdataPtr.isLanguage("fr"));

        JDOMNodePointer piPtr = new JDOMNodePointer(root, pi);
        Assert.assertTrue(piPtr.isLanguage("fr"));

        JDOMNodePointer commPtr = new JDOMNodePointer(root, comment);
        Assert.assertTrue(commPtr.isLanguage("fr"));
    }
}
