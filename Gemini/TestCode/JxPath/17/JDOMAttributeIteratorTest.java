package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class JDOMAttributeIteratorTest {

    @Test
    public void testConstructor_nonElementNode_attributesIsNull() {
        Document doc = new Document();
        NodePointer parent = new JDOMNodePointer(doc, Locale.getDefault());
        QName name = new QName("name");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_xmlPrefix_findsXmlAttribute() {
        Element element = new Element("test");
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("xml", "lang");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        assertNotNull(ptr);
        assertTrue(ptr instanceof JDOMAttributePointer);
        assertEquals("en", ptr.getValue());
    }

    @Test
    public void testConstructor_unknownPrefix_attributesIsEmptyList() {
        Element element = new Element("test");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("unknown", "attr");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_customPrefixResolved_findsAttribute() {
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        Element element = new Element("test");
        element.addNamespaceDeclaration(customNs);
        element.setAttribute("attr", "val", customNs);
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("custom", "attr");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        assertNotNull(ptr);
        assertEquals("val", ptr.getValue());
    }

    @Test
    public void testConstructor_customPrefixResolved_attributeNotFound() {
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        Element element = new Element("test");
        element.addNamespaceDeclaration(customNs);
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("custom", "nonExisting");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_noPrefixExistingAttribute_findsAttribute() {
        Element element = new Element("test");
        element.setAttribute("name", "sample");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("name");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        assertNotNull(ptr);
        assertEquals("sample", ptr.getValue());
    }

    @Test
    public void testConstructor_noPrefixNonExistingAttribute_emptyAttributes() {
        Element element = new Element("test");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("missing");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_wildcardWithoutPrefix_returnsMatchingNoNamespaceAttributes() {
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        Element element = new Element("test");
        element.setAttribute("a1", "v1");
        element.setAttribute("a2", "v2", customNs);
        element.setAttribute("a3", "v3");

        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("*");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertEquals("v1", iterator.getNodePointer().getValue());

        assertTrue(iterator.setPosition(2));
        assertEquals("v3", iterator.getNodePointer().getValue());

        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructor_wildcardWithPrefix_returnsMatchingNamespaceAttributes() {
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        Element element = new Element("test");
        element.addNamespaceDeclaration(customNs);
        element.setAttribute("a1", "v1");
        element.setAttribute("a2", "v2", customNs);
        element.setAttribute("a3", "v3", customNs);

        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("custom", "*");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertEquals("v2", iterator.getNodePointer().getValue());

        assertTrue(iterator.setPosition(2));
        assertEquals("v3", iterator.getNodePointer().getValue());

        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testGetNodePointer_positionZero_retrievesFirstPointerAndKeepsPositionZero() {
        Element element = new Element("test");
        element.setAttribute("attr1", "val1");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("attr1");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        assertNotNull(ptr);
        assertEquals("val1", ptr.getValue());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_positionZeroWhenEmpty_returnsNull() {
        Element element = new Element("test");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("*");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
        assertNull(iterator.getNodePointer());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSetPosition_boundaryValues() {
        Element element = new Element("test");
        element.setAttribute("attr1", "val1");
        element.setAttribute("attr2", "val2");
        NodePointer parent = new JDOMNodePointer(element, Locale.getDefault());
        QName name = new QName("*");

        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(-1));
        assertEquals(-1, iterator.getPosition());

        assertFalse(iterator.setPosition(0));
        assertEquals(0, iterator.getPosition());

        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());

        assertTrue(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());

        assertFalse(iterator.setPosition(3));
        assertEquals(3, iterator.getPosition());

        assertFalse(iterator.setPosition(100));
        assertEquals(100, iterator.getPosition());
    }
}
