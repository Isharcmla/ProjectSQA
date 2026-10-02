package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Assert;
import org.junit.Test;

public class JDOMAttributeIteratorTest {

    @Test
    public void testNonElementNode_returnsFalseAndNull() {
        NodePointer parent = new JDOMNodePointer("not-an-element", Locale.ENGLISH);
        QName name = new QName("attr");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testUnknownPrefixNamespace_returnsEmptyAndNull() {
        Element element = new Element("test");
        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);
        QName name = new QName("unknownPrefix", "attr");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testXmlPrefix_specificAttributeFound() {
        Element element = new Element("test");
        element.setAttribute(new Attribute("lang", "en", Namespace.XML_NAMESPACE));
        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);
        QName name = new QName("xml", "lang");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        Assert.assertEquals(0, iterator.getPosition());
        NodePointer nodePointer = iterator.getNodePointer();
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals(0, iterator.getPosition());

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        NodePointer ptrAt1 = iterator.getNodePointer();
        Assert.assertNotNull(ptrAt1);

        Assert.assertFalse(iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testCustomPrefix_specificAttributeFoundAndNotFound() {
        Namespace customNs = Namespace.getNamespace("custom", "http://example.com/custom");
        Element element = new Element("test");
        element.addNamespaceDeclaration(customNs);
        element.setAttribute(new Attribute("myAttr", "value1", customNs));
        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);

        QName foundName = new QName("custom", "myAttr");
        JDOMAttributeIterator iterFound = new JDOMAttributeIterator(parent, foundName);
        Assert.assertTrue(iterFound.setPosition(1));
        Assert.assertNotNull(iterFound.getNodePointer());

        QName notFoundName = new QName("custom", "nonExistent");
        JDOMAttributeIterator iterNotFound = new JDOMAttributeIterator(parent, notFoundName);
        Assert.assertFalse(iterNotFound.setPosition(1));
        Assert.assertNull(iterNotFound.getNodePointer());
    }

    @Test
    public void testNoPrefix_specificAttributeFound() {
        Element element = new Element("test");
        element.setAttribute(new Attribute("id", "123"));
        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);

        QName name = new QName("id");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(0));
        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testNoPrefix_wildcardMatching() {
        Element element = new Element("test");
        element.setAttribute(new Attribute("attr1", "val1"));
        element.setAttribute(new Attribute("attr2", "val2"));
        Namespace customNs = Namespace.getNamespace("ns", "http://example.com/ns");
        element.setAttribute(new Attribute("attr3", "val3", customNs));

        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);
        QName wildcardName = new QName("*");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, wildcardName);

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testPrefix_wildcardMatching() {
        Namespace customNs = Namespace.getNamespace("custom", "http://example.com/custom");
        Element element = new Element("test");
        element.addNamespaceDeclaration(customNs);
        element.setAttribute(new Attribute("attr1", "val1", customNs));
        element.setAttribute(new Attribute("attr2", "val2", customNs));
        element.setAttribute(new Attribute("attr3", "val3"));

        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);
        QName wildcardName = new QName("custom", "*");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, wildcardName);

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        Assert.assertNotNull(iterator.getNodePointer());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());
        Assert.assertNotNull(iterator.getNodePointer());

        Assert.assertFalse(iterator.setPosition(3));
        Assert.assertFalse(iterator.setPosition(-1));
    }

    @Test
    public void testGetNodePointer_withNegativePositionBranch() {
        Element element = new Element("test");
        element.setAttribute(new Attribute("attr1", "val1"));
        NodePointer parent = new JDOMNodePointer(element, Locale.ENGLISH);

        QName name = new QName("attr1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        Assert.assertFalse(iterator.setPosition(-1));
        Assert.assertEquals(-1, iterator.getPosition());

        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
    }
}
