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
    public void testConstructorsAndBasics() {
        Element element = new Element("root");
        JDOMNodePointer ptr1 = new JDOMNodePointer(element, Locale.ENGLISH);
        Assert.assertEquals(element, ptr1.getBaseValue());
        Assert.assertEquals(element, ptr1.getImmediateNode());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertEquals(System.identityHashCode(element), ptr1.hashCode());
        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("not a pointer"));

        JDOMNodePointer ptr2 = new JDOMNodePointer(element, Locale.ENGLISH, "id'1\"2");
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertEquals("id('id&apos;1&quot;2')", ptr2.asPath());

        JDOMNodePointer childPtr = new JDOMNodePointer(ptr1, element);
        Assert.assertEquals(ptr1, childPtr.getParent());
    }

    @Test
    public void testIteratorsAndNamespacePointer() {
        Element element = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.ENGLISH);

        NodeIterator childIt = ptr.childIterator(new NodeTypeTest(Compiler.NODE_TYPE_NODE), false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("test"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("prefix");
        Assert.assertNotNull(nsPtr);
        Assert.assertTrue(nsPtr instanceof JDOMNamespacePointer);
    }

    @Test
    public void testGetNamespaceResolverAndURI() {
        Element root = new Element("root", "ns", "http://example.com/ns");
        Document doc = new Document(root);

        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals(JDOMNodePointer.XML_NAMESPACE_URI, docPtr.getNamespaceURI("xml"));
        Assert.assertEquals("http://example.com/ns", docPtr.getNamespaceURI("ns"));
        Assert.assertNull(docPtr.getNamespaceURI("unknown"));

        JDOMNodePointer elemPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("http://example.com/ns", elemPtr.getNamespaceURI());
        Assert.assertEquals("http://example.com/ns", elemPtr.getNamespaceURI("ns"));
        Assert.assertNull(elemPtr.getNamespaceURI("unknown"));

        Element noNsElem = new Element("noNs");
        JDOMNodePointer noNsPtr = new JDOMNodePointer(noNsElem, Locale.ENGLISH);
        Assert.assertNull(noNsPtr.getNamespaceURI());

        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(textPtr.getNamespaceURI());
        Assert.assertNull(textPtr.getNamespaceURI("prefix"));

        NamespaceResolver resolver = elemPtr.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, elemPtr.getNamespaceResolver());
    }

    @Test
    public void testIsLeaf() {
        Element emptyElem = new Element("empty");
        JDOMNodePointer emptyElemPtr = new JDOMNodePointer(emptyElem, Locale.ENGLISH);
        Assert.assertTrue(emptyElemPtr.isLeaf());

        Element parentElem = new Element("parent");
        parentElem.addContent(new Element("child"));
        JDOMNodePointer parentElemPtr = new JDOMNodePointer(parentElem, Locale.ENGLISH);
        Assert.assertFalse(parentElemPtr.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer emptyDocPtr = new JDOMNodePointer(emptyDoc, Locale.ENGLISH);
        Assert.assertTrue(emptyDocPtr.isLeaf());

        Document docWithContent = new Document(new Element("root"));
        JDOMNodePointer docWithContentPtr = new JDOMNodePointer(docWithContent, Locale.ENGLISH);
        Assert.assertFalse(docWithContentPtr.isLeaf());

        Text text = new Text("sample");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertTrue(textPtr.isLeaf());
    }

    @Test
    public void testGetName() {
        Element elemNoNs = new Element("test");
        JDOMNodePointer ptr1 = new JDOMNodePointer(elemNoNs, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "test"), ptr1.getName());

        Element elemWithNs = new Element("test", "pfx", "http://foo.com");
        JDOMNodePointer ptr2 = new JDOMNodePointer(elemWithNs, Locale.ENGLISH);
        Assert.assertEquals(new QName("pfx", "test"), ptr2.getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptr3 = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "target"), ptr3.getName());

        Text text = new Text("sample");
        JDOMNodePointer ptr4 = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, null), ptr4.getName());
    }

    @Test
    public void testGetValue() {
        Element root = new Element("root");
        Element child = new Element("child");
        child.addContent(new Text(" child text "));
        root.addContent(child);
        root.addContent(new Text(" root text "));
        root.addContent(new Comment("ignored comment"));

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("child textroot text", rootPtr.getValue());

        Comment comment = new Comment("  comment content  ");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("comment content", commentPtr.getValue());

        Text text = new Text("  text content  ");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals("text content", textPtr.getValue());

        Element spacePreserveElem = new Element("wrapper");
        spacePreserveElem.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text preservedText = new Text("  preserved  ");
        spacePreserveElem.addContent(preservedText);
        JDOMNodePointer preservedTextPtr = new JDOMNodePointer(preservedText, Locale.ENGLISH);
        Assert.assertEquals("  preserved  ", preservedTextPtr.getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  pi data  ");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("pi data", piPtr.getValue());
    }

    @Test
    public void testSetValueOnText() {
        Element root = new Element("root");
        Text text = new Text("initial");
        root.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);

        textPtr.setValue("modified");
        Assert.assertEquals("modified", text.getText());

        textPtr.setValue("");
        Assert.assertEquals(0, root.getContent().size());
    }

    @Test
    public void testSetValueOnElement() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);

        Element otherElem = new Element("other");
        otherElem.addContent(new Element("c1"));
        rootPtr.setValue(otherElem);
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertEquals("c1", ((Element) root.getContent().get(0)).getName());

        Document doc = new Document();
        doc.addContent(new Element("docChild"));
        rootPtr.setValue(doc);
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertEquals("docChild", ((Element) root.getContent().get(0)).getName());

        rootPtr.setValue(new Text("new text"));
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertEquals("new text", ((Text) root.getContent().get(0)).getText());

        rootPtr.setValue(new CDATA("cdata val"));
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertEquals("cdata val", ((Text) root.getContent().get(0)).getText());

        rootPtr.setValue(new ProcessingInstruction("piTarget", "piData"));
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertTrue(root.getContent().get(0) instanceof ProcessingInstruction);

        rootPtr.setValue(new Comment("comment text"));
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertTrue(root.getContent().get(0) instanceof Comment);

        rootPtr.setValue("simple string");
        Assert.assertEquals(1, root.getContent().size());
        Assert.assertEquals("simple string", ((Text) root.getContent().get(0)).getText());

        rootPtr.setValue(null);
        Assert.assertEquals(0, root.getContent().size());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = new Element("root");
        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);

        Element child1 = new Element("c1");
        Element child2 = new Element("c2");
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pAttr1 = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer pAttr2 = new JDOMNodePointer(rootPtr, attr2);
        JDOMNodePointer pChild1 = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer pChild2 = new JDOMNodePointer(rootPtr, child2);

        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pAttr1, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pAttr1, pChild1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pChild1, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pAttr1, pAttr2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pAttr2, pAttr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(pChild2, pChild1));

        Attribute foreignAttr = new Attribute("foreign", "val");
        JDOMNodePointer pForeignAttr = new JDOMNodePointer(rootPtr, foreignAttr);
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pForeignAttr, pAttr1));

        Element foreignElem = new Element("foreign");
        JDOMNodePointer pForeignElem = new JDOMNodePointer(rootPtr, foreignElem);
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(pForeignElem, pChild1));

        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("txt"), Locale.ENGLISH);
        try {
            textPtr.compareChildNodePointers(pChild1, pChild2);
            Assert.fail("Expected RuntimeException when compareChildNodes called for non-Element");
        } catch (RuntimeException expected) {
            Assert.assertTrue(expected.getMessage().contains("compareChildNodes called for"));
        }
    }

    @Test
    public void testTestNode() {
        Element elem = new Element("elem", "pfx", "http://example.com");
        Element noNsElem = new Element("elem");
        Document doc = new Document(elem);
        Text text = new Text("text");
        CDATA cdata = new CDATA("cdata");
        Comment comment = new Comment("comment");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, null));

        NodeNameTest wildTest = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, wildTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, wildTest));

        NodeNameTest wildWithPrefixTest = new NodeNameTest(new QName("pfx", "*"), "http://example.com");
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, wildWithPrefixTest));

        NodeNameTest matchTest = new NodeNameTest(new QName("pfx", "elem"), "http://example.com");
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, matchTest));

        NodeNameTest noNsMatchTest = new NodeNameTest(new QName(null, "elem"));
        Assert.assertTrue(JDOMNodePointer.testNode(null, noNsElem, noNsMatchTest));

        NodeNameTest mismatchTest = new NodeNameTest(new QName(null, "other"));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, mismatchTest));

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, nodeTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, doc, nodeTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, textTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, textTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, commentTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, commentTest));

        NodeTypeTest piTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTypeTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, piTypeTest));

        NodeTypeTest unknownTypeTest = new NodeTypeTest(999);
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, unknownTypeTest));

        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target");
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, new ProcessingInstruction("other", "data"), piTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, piTest));

        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertTrue(ptr.testNode(matchTest));
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elem1 = new Element("name", "pfx", "http://foo");
        Element elem2 = new Element("name");
        Attribute attr1 = new Attribute("aname", "val", Namespace.getNamespace("apfx", "http://bar"));
        Attribute attr2 = new Attribute("aname", "val");
        Text text = new Text("txt");

        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(elem1));
        Assert.assertNull(JDOMNodePointer.getPrefix(elem2));
        Assert.assertEquals("apfx", JDOMNodePointer.getPrefix(attr1));
        Assert.assertNull(JDOMNodePointer.getPrefix(attr2));
        Assert.assertNull(JDOMNodePointer.getPrefix(text));

        Assert.assertEquals("name", JDOMNodePointer.getLocalName(elem1));
        Assert.assertEquals("aname", JDOMNodePointer.getLocalName(attr1));
        Assert.assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void testLanguageMethods() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        Assert.assertEquals("en-US", childPtr.getLanguage());
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("EN-US"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element noLangElem = new Element("noLang");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertNull(noLangPtr.getLanguage());
        Assert.assertTrue(noLangPtr.isLanguage("de"));
    }

    @Test
    public void testCreateAttribute() {
        Element element = new Element("root");
        JDOMNodePointer elemPtr = new JDOMNodePointer(element, Locale.ENGLISH);
        elemPtr.getNamespaceResolver().registerNamespace("pfx", "http://example.com/ns");
        JXPathContext context = JXPathContext.newContext(element);

        NodePointer noNsAttrPtr = elemPtr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(noNsAttrPtr);
        Assert.assertEquals("", element.getAttributeValue("attr1"));

        NodePointer noNsAttrPtrExisting = elemPtr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(noNsAttrPtrExisting);

        NodePointer nsAttrPtr = elemPtr.createAttribute(context, new QName("pfx", "attr2"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertEquals("", element.getAttributeValue("attr2", Namespace.getNamespace("pfx", "http://example.com/ns")));

        NodePointer nsAttrPtrExisting = elemPtr.createAttribute(context, new QName("pfx", "attr2"));
        Assert.assertNotNull(nsAttrPtrExisting);

        try {
            elemPtr.createAttribute(context, new QName("unknownPfx", "attr3"));
            Assert.fail("Expected exception for unknown namespace prefix");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Unknown namespace prefix"));
        }

        Text text = new Text("text");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception on createAttribute for Text pointer");
        } catch (JXPathException expected) {
            // expected from super.createAttribute
        }
    }

    @Test
    public void testCreateChild() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        try {
            rootPtr.createChild(context, new QName("child"), 0);
            Assert.fail("Expected exception when factory is not set");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Factory is not set"));
        }

        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, NodePointer parent, Object node, String name, int index) {
                if (index == 0) {
                    ((Element) node).addContent(new Element(name));
                    return true;
                }
                return false;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", ((Element) childPtr.getBaseValue()).getName());

        NodePointer childValPtr = rootPtr.createChild(context, new QName("child2"), NodePointer.WHOLE_COLLECTION, "childValue");
        Assert.assertNotNull(childValPtr);
        Assert.assertEquals("childValue", childValPtr.getValue());

        try {
            rootPtr.createChild(context, new QName("failChild"), 1);
            Assert.fail("Expected JXPathAbstractFactoryException when factory returns false");
        } catch (JXPathAbstractFactoryException expected) {
            Assert.assertTrue(expected.getMessage().contains("Factory could not create"));
        }
    }

    @Test
    public void testRemove() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(child, Locale.ENGLISH);
        childPtr.remove();
        Assert.assertEquals(0, root.getContent().size());

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        try {
            rootPtr.remove();
            Assert.fail("Expected exception removing root node");
        } catch (JXPathException expected) {
            Assert.assertTrue(expected.getMessage().contains("Cannot remove root"));
        }
    }

    @Test
    public void testAsPath() {
        Element root = new Element("root");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        Element nsChild = new Element("child", "pfx", "http://example.com/ns");
        Element orphanNsChild = new Element("child", "other", "http://other.com/ns");
        Text text = new Text("content");
        CDATA cdata = new CDATA("cdata_content");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        root.addContent(child1);
        root.addContent(child2);
        root.addContent(nsChild);
        root.addContent(orphanNsChild);
        root.addContent(text);
        root.addContent(cdata);
        root.addContent(pi);

        Document doc = new Document(root);
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.ENGLISH);
        docPtr.getNamespaceResolver().registerNamespace("pfx", "http://example.com/ns");

        JDOMNodePointer rootPtr = new JDOMNodePointer(docPtr, root);
        Assert.assertEquals("", rootPtr.asPath());

        JDOMNodePointer c1Ptr = new JDOMNodePointer(rootPtr, child1);
        Assert.assertEquals("/child[1]", c1Ptr.asPath());

        JDOMNodePointer c2Ptr = new JDOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/child[2]", c2Ptr.asPath());

        JDOMNodePointer nsPtr = new JDOMNodePointer(rootPtr, nsChild);
        Assert.assertEquals("/pfx:child[1]", nsPtr.asPath());

        JDOMNodePointer orphanNsPtr = new JDOMNodePointer(rootPtr, orphanNsChild);
        Assert.assertEquals("/node()[4]", orphanNsPtr.asPath());

        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata);
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());

        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('target')[1]", piPtr.asPath());

        Text detachedText = new Text("detached");
        JDOMNodePointer detachedTextPtr = new JDOMNodePointer(null, detachedText);
        Assert.assertEquals("/text()[1]", detachedTextPtr.asPath());

        ProcessingInstruction detachedPI = new ProcessingInstruction("target", "data");
        JDOMNodePointer detachedPIPtr = new JDOMNodePointer(null, detachedPI);
        Assert.assertEquals("/processing-instruction('target')[1]", detachedPIPtr.asPath());
    }
}
