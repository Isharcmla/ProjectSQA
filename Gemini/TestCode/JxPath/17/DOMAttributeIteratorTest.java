package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DOMAttributeIteratorTest {

    private Document docNS;
    private Element elementNS;
    private DOMNodePointer parentPointerNS;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        docNS = dbf.newDocumentBuilder().newDocument();

        elementNS = docNS.createElementNS("http://example.com/ns/root", "root");
        elementNS.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:foo", "http://example.com/ns/foo");
        elementNS.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://example.com/ns/default");
        elementNS.setAttributeNS("http://example.com/ns/foo", "foo:attr1", "value1");
        elementNS.setAttribute("attr2", "value2");
        docNS.appendChild(elementNS);

        parentPointerNS = new DOMNodePointer(elementNS, Locale.getDefault());
        parentPointerNS.getNamespaceResolver().registerNamespace("foo", "http://example.com/ns/foo");
    }

    @Test
    public void testConstructor_nonElementNode_emptyAttributes() {
        Text textNode = docNS.createTextNode("sample text");
        DOMNodePointer textPointer = new DOMNodePointer(textNode, Locale.getDefault());

        DOMAttributeIterator iterator = new DOMAttributeIterator(textPointer, new QName("attr2"));
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());

        Comment commentNode = docNS.createComment("sample comment");
        DOMNodePointer commentPointer = new DOMNodePointer(commentNode, Locale.getDefault());
        DOMAttributeIterator commentIterator = new DOMAttributeIterator(commentPointer, new QName("*"));
        Assert.assertFalse(commentIterator.setPosition(1));
        Assert.assertNull(commentIterator.getNodePointer());
    }

    @Test
    public void testConstructor_wildcard_filtersXmlnsAndIncludesRegularAttributes() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("*"));

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr1 = iterator.getNodePointer();
        Assert.assertNotNull(ptr1);

        Assert.assertTrue(iterator.setPosition(2));
        NodePointer ptr2 = iterator.getNodePointer();
        Assert.assertNotNull(ptr2);

        Assert.assertFalse(iterator.setPosition(3));
        Assert.assertEquals(3, iterator.getPosition());
    }

    @Test
    public void testConstructor_wildcardWithPrefix_matchesPrefix() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("foo", "*"));

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr instanceof DOMAttributePointer);
        Assert.assertEquals("foo:attr1", ((DOMAttributePointer) ptr).getName().toString());

        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_wildcardWithDifferentPrefixSameNamespaceURI() {
        parentPointerNS.getNamespaceResolver().registerNamespace("fooAlias", "http://example.com/ns/foo");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("fooAlias", "*"));

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals("foo:attr1", ((DOMAttributePointer) ptr).getName().toString());
        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_wildcardWithDifferentNamespaceURI_noMatch() {
        parentPointerNS.getNamespaceResolver().registerNamespace("other", "http://example.com/ns/other");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("other", "*"));

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_specificNameNoPrefix_found() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("attr2"));

        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals("attr2", ((DOMAttributePointer) ptr).getName().getName());

        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testConstructor_specificNameNoPrefix_notFound() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("nonexistent"));

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructor_specificNameWithPrefix_foundNS() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("foo", "attr1"));

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals("attr1", ((DOMAttributePointer) ptr).getName().getName());
        Assert.assertEquals("foo", ((DOMAttributePointer) ptr).getName().getPrefix());
    }

    @Test
    public void testConstructor_specificNameWithPrefix_fallbackNnmFound() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        Document nonNSDoc = dbf.newDocumentBuilder().newDocument();
        Element nonNSElem = nonNSDoc.createElement("root");
        nonNSElem.setAttribute("foo:custom", "val");
        nonNSDoc.appendChild(nonNSElem);

        DOMNodePointer ptr = new DOMNodePointer(nonNSElem, Locale.getDefault());
        ptr.getNamespaceResolver().registerNamespace("foo", "http://example.com/ns/foo");

        DOMAttributeIterator iterator = new DOMAttributeIterator(ptr, new QName("foo", "custom"));
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer attrPtr = iterator.getNodePointer();
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("custom", ((DOMAttributePointer) attrPtr).getName().getName());
    }

    @Test
    public void testConstructor_specificNameWithPrefix_fallbackNnmNotFound() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        Document nonNSDoc = dbf.newDocumentBuilder().newDocument();
        Element nonNSElem = nonNSDoc.createElement("root");
        nonNSElem.setAttribute("foo:custom", "val");
        nonNSDoc.appendChild(nonNSElem);

        DOMNodePointer ptr = new DOMNodePointer(nonNSElem, Locale.getDefault());
        ptr.getNamespaceResolver().registerNamespace("foo", "http://example.com/ns/foo");

        DOMAttributeIterator iterator = new DOMAttributeIterator(ptr, new QName("foo", "notfound"));
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetNodePointer_positionZeroWithAttributes_returnsFirstPointerAndResetsPosition() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("attr2"));

        Assert.assertEquals(0, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals("attr2", ((DOMAttributePointer) ptr).getName().getName());
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testGetNodePointer_positionZeroWithoutAttributes_returnsNull() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("notfound"));

        Assert.assertEquals(0, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNull(ptr);
    }

    @Test
    public void testGetNodePointer_afterSetPosition() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("*"));

        iterator.setPosition(2);
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testSetPosition_boundaryValues() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointerNS, new QName("attr2"));

        Assert.assertFalse(iterator.setPosition(-10));
        Assert.assertEquals(-10, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(0));
        Assert.assertEquals(0, iterator.getPosition());

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testXmlnsFiltering_defaultAndPrefixedXmlns() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        Document doc = dbf.newDocumentBuilder().newDocument();
        Element elem = doc.createElement("test");
        elem.setAttribute("xmlns", "http://default.com");
        elem.setAttribute("xmlns:p", "http://prefix.com");
        elem.setAttribute("regular", "value");
        doc.appendChild(elem);

        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.getDefault());
        DOMAttributeIterator iterator = new DOMAttributeIterator(ptr, new QName("*"));

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals("regular", ((DOMAttributePointer) iterator.getNodePointer()).getName().getName());
        Assert.assertFalse(iterator.setPosition(2));
    }
}
