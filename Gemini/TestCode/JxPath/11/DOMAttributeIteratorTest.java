package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DOMAttributeIteratorTest {

    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;

    @Before
    public void setUp() throws Exception {
        factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    @Test
    public void testConstructor_nonElementNode_emptyAttributes() {
        Text text = document.createTextNode("sample text");
        NodePointer parent = new DOMNodePointer(text, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("test"));

        assertEquals(0, iterator.getPosition());
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testWildcard_noAttributes_emptyIterator() {
        Element element = document.createElement("root");
        document.appendChild(element);
        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);

        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("*"));
        assertEquals(0, iterator.getPosition());
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testWildcard_withXmlnsAttributes_filtersOutXmlnsAttributes() {
        Element element = document.createElementNS("http://example.com/ns", "test:root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com/ns");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:test", "http://example.com/ns");
        element.setAttribute("attr1", "val1");
        element.setAttribute("attr2", "val2");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("*"));

        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        assertNotNull(iterator.getNodePointer());

        assertTrue(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());
        assertNotNull(iterator.getNodePointer());

        assertFalse(iterator.setPosition(3));
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(-1));
    }

    @Test
    public void testGetNodePointer_positionZero_automaticallyAdvancesAndReturnsPointer() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "val1");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("*"));

        assertEquals(0, iterator.getPosition());
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_emptyAttributes_returnsNull() {
        Element element = document.createElement("root");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("attr1"));

        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testSpecificAttribute_unprefixedExisting_found() {
        Element element = document.createElement("root");
        element.setAttribute("targetAttr", "123");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("targetAttr"));

        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testSpecificAttribute_unprefixedNonExisting_notFound() {
        Element element = document.createElement("root");
        element.setAttribute("otherAttr", "123");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("targetAttr"));

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testSpecificAttribute_withNamespace_foundNS() {
        Element element = document.createElementNS("http://example.com/ns", "t:root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:t", "http://example.com/ns");
        element.setAttributeNS("http://example.com/ns", "t:attr1", "val1");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("t", "attr1"));

        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testSpecificAttribute_withNamespace_fallbackToIteratingAttributes() throws Exception {
        DocumentBuilder nonNsBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document nonNsDoc = nonNsBuilder.newDocument();
        Element element = nonNsDoc.createElement("root");
        element.setAttribute("xmlns:t", "http://example.com/ns");
        element.setAttribute("t:attr1", "val1");
        nonNsDoc.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("t", "attr1"));

        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testSpecificAttribute_withNamespace_fallbackNotFoundReturnsNull() throws Exception {
        DocumentBuilder nonNsBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document nonNsDoc = nonNsBuilder.newDocument();
        Element element = nonNsDoc.createElement("root");
        element.setAttribute("xmlns:t", "http://example.com/ns");
        element.setAttribute("t:otherAttr", "val1");
        nonNsDoc.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("t", "attr1"));

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testWildcard_withPrefix_matchesOnlyPrefixNamespace() {
        Element element = document.createElementNS("http://example.com/ns", "t:root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:t", "http://example.com/ns");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:other", "http://other.com/ns");
        element.setAttributeNS("http://example.com/ns", "t:attr1", "v1");
        element.setAttributeNS("http://example.com/ns", "t:attr2", "v2");
        element.setAttributeNS("http://other.com/ns", "other:attr3", "v3");
        element.setAttribute("unprefixed", "v4");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("t", "*"));

        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        assertTrue(iterator.setPosition(2));
        assertNotNull(iterator.getNodePointer());
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testPrefixMismatch_sameNamespaceURI_matchesSuccessfully() {
        Element element = document.createElementNS("http://example.com/ns", "root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:p1", "http://example.com/ns");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:p2", "http://example.com/ns");
        element.setAttributeNS("http://example.com/ns", "p1:attr1", "v1");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("p2", "attr1"));

        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testPrefixMismatch_differentNamespaceURI_doesNotMatch() {
        Element element = document.createElementNS("http://example.com/ns1", "root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:p1", "http://example.com/ns1");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:p2", "http://example.com/ns2");
        element.setAttributeNS("http://example.com/ns1", "p1:attr1", "v1");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("p2", "*"));

        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testSetPosition_boundaryValues() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "val1");
        element.setAttribute("attr2", "val2");
        document.appendChild(element);

        NodePointer parent = new DOMNodePointer(element, Locale.ENGLISH);
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, new QName("*"));

        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(-10));
        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
        assertFalse(iterator.setPosition(100));
    }
}
