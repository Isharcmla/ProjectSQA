package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMAttributeIteratorTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    private Element createElementWithAttributes() {
        Element element = document.createElement("root");
        element.setAttribute("foo", "fooValue");
        element.setAttribute("bar", "barValue");
        document.appendChild(element);
        return element;
    }

    @Test
    public void testConstructor_specificAttributeExists_attributeFound() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "foo");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_specificAttributeDoesNotExist_attributeNotFound() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "notExist");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_wildcardName_allAttributesReturned() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructor_nonElementNode_noAttributes() {
        Node textNode = document.createTextNode("text");
        NodePointer parent = new DOMNodePointer(textNode, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_documentNode_noAttributes() {
        NodePointer parent = new DOMNodePointer(document, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_defaultXmlnsAttributeExcluded() {
        Element element = document.createElement("root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com/default");
        element.setAttribute("foo", "fooValue");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_prefixedXmlnsAttributeExcluded() {
        Element element = document.createElement("root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com/ns");
        element.setAttribute("foo", "fooValue");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_prefixedNameWithUnresolvedNamespace_fallsBackToPlainAttribute() {
        Element element = document.createElement("root");
        element.setAttribute("foo", "fooValue");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName("p", "foo");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        // testNS resolves to null since prefix "p" is unresolved; fallback uses plain getAttributeNode("foo")
        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testGetNodePointer_positionZero_withAttributes_returnsFirstAttribute() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_emptyAttributes_returnsNullAndSetsPositionInternally() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "notExist");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertNull(iterator.getNodePointer());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_afterSetPositionValid_returnsCorrectPointer() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        iterator.setPosition(1);
        NodePointer pointer1 = iterator.getNodePointer();
        assertNotNull(pointer1);

        iterator.setPosition(2);
        NodePointer pointer2 = iterator.getNodePointer();
        assertNotNull(pointer2);
    }

    @Test
    public void testGetPosition_initialValue_isZero() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetPosition_afterSetPosition_returnsSetValue() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        iterator.setPosition(2);
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testSetPosition_zero_returnsFalse() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(0));
    }

    @Test
    public void testSetPosition_negative_returnsFalse() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(-1));
    }

    @Test
    public void testSetPosition_withinBounds_returnsTrue() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testSetPosition_exceedsBounds_returnsFalse() {
        Element element = createElementWithAttributes();
        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(100));
    }

    @Test
    public void testConstructor_emptyElementNoAttributes_wildcard_resultsEmpty() {
        Element element = document.createElement("root");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }
}
