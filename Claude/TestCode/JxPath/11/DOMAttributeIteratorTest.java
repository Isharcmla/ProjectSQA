package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMAttributeIteratorTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        document = db.newDocument();
    }

    private Element createRootWithAttributes() {
        Element root = document.createElement("root");
        root.setAttribute("attr1", "value1");
        root.setAttribute("attr2", "value2");
        document.appendChild(root);
        return root;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_nonElementNode_attributesEmpty() {
        // document node is not an ELEMENT_NODE
        NodePointer parent = new DOMNodePointer(document, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        // No attributes should have been collected since node is not an element
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_specificAttributeName_found() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "attr1");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_specificAttributeName_notFound() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "missingAttr");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_wildcardName_allAttributesCollected() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructor_wildcardName_xmlnsPrefixedAttributeSkipped() {
        Element root = createRootWithAttributes();
        root.setAttributeNS(
                "http://www.w3.org/2000/xmlns/", "xmlns:ns1",
                "http://example.com/ns1");
        document.appendChild(root);
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        // Only attr1 and attr2 should be collected; the xmlns:ns1 attribute
        // should be skipped by testAttr()
        assertTrue(iterator.setPosition(1));
        assertTrue(iterator.setPosition(2));
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testConstructor_wildcardName_defaultXmlnsAttributeSkipped() {
        Element root = document.createElement("root");
        root.setAttribute("attr1", "value1");
        root.setAttributeNS(
                "http://www.w3.org/2000/xmlns/", "xmlns",
                "http://example.com/default");
        document.appendChild(root);

        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        // Only attr1 should remain, default xmlns attribute must be skipped
        assertTrue(iterator.setPosition(1));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_elementWithNoAttributes_emptyList() {
        Element root = document.createElement("root");
        document.appendChild(root);
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_prefixedNameNoNamespaceDeclared_fallbackToPlainAttributeLookup() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        // prefix is not declared anywhere, so getNamespaceURI should return null
        // forcing the fallback to element.getAttributeNode(name.getName())
        QName name = new QName("undeclaredPrefix", "attr1");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(1));
    }

    // ---------- getNodePointer tests ----------

    @Test
    public void testGetNodePointer_noAttributes_returnsNull() {
        Element root = document.createElement("root");
        document.appendChild(root);
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetNodePointer_withAttributes_initialPositionZero_returnsPointer() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        // Internal position should remain 0 after the lazy lookup, as per implementation
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_afterSetPosition_returnsCorrectAttribute() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertTrue(iterator.setPosition(2));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(2, iterator.getPosition());
    }

    // ---------- getPosition tests ----------

    @Test
    public void testGetPosition_initialValue_isZero() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetPosition_afterSetPosition_returnsSetValue() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        iterator.setPosition(1);
        assertEquals(1, iterator.getPosition());
    }

    // ---------- setPosition tests (edge cases) ----------

    @Test
    public void testSetPosition_zero_returnsFalse() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(0));
    }

    @Test
    public void testSetPosition_negative_returnsFalse() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(-1));
    }

    @Test
    public void testSetPosition_exactlySize_returnsTrue() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        // two attributes exist, so position 2 should be valid
        assertTrue(iterator.setPosition(2));
    }

    @Test
    public void testSetPosition_greaterThanSize_returnsFalse() {
        Element root = createRootWithAttributes();
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(100));
    }

    @Test
    public void testSetPosition_emptyAttributeList_anyPositionReturnsFalse() {
        Element root = document.createElement("root");
        document.appendChild(root);
        NodePointer parent = new DOMNodePointer(root, Locale.getDefault());
        QName name = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);

        assertFalse(iterator.setPosition(1));
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(-5));
    }
}
