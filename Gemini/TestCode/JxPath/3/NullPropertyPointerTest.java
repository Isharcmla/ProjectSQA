package org.apache.commons.jxpath.ri.model.beans;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NullPropertyPointerTest {

    public static class TestBean {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void testDefaultsAndSimpleGetters() {
        NullPointer parent = new NullPointer(Locale.getDefault(), "parent");
        NullPropertyPointer pointer = new NullPropertyPointer(parent);

        assertEquals(new QName("*"), pointer.getName());
        assertEquals("*", pointer.getPropertyName());
        assertEquals(0, pointer.getLength());
        assertEquals(0, pointer.getPropertyCount());
        assertArrayEquals(new String[0], pointer.getPropertyNames());
        assertNull(pointer.getBaseValue());
        assertNull(pointer.getImmediateNode());
        assertTrue(pointer.isLeaf());
        assertFalse(pointer.isActual());
        assertFalse(pointer.isActualProperty());
        assertTrue(pointer.isContainer());
        assertFalse(pointer.isCollection());

        pointer.setPropertyIndex(10);
        pointer.setPropertyIndex(-1);
    }

    @Test
    public void testSetPropertyNameAndGetName() {
        NullPointer parent = new NullPointer(Locale.getDefault(), "parent");
        NullPropertyPointer pointer = new NullPropertyPointer(parent);

        pointer.setPropertyName("customProp");
        assertEquals("customProp", pointer.getPropertyName());
        assertEquals(new QName("customProp"), pointer.getName());

        pointer.setPropertyName("");
        assertEquals("", pointer.getPropertyName());
        assertEquals(new QName(""), pointer.getName());

        pointer.setPropertyName(null);
        assertNull(pointer.getPropertyName());
        assertEquals(new QName(null), pointer.getName());
    }

    @Test
    public void testGetValuePointer() {
        NullPointer parent = new NullPointer(Locale.getDefault(), "parent");
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setPropertyName("childProp");

        NodePointer valuePointer = pointer.getValuePointer();
        assertNotNull(valuePointer);
        assertTrue(valuePointer instanceof NullPointer);
        assertEquals(new QName("childProp"), valuePointer.getName());
        assertEquals(pointer, valuePointer.getParent());
    }

    @Test
    public void testIsCollection() {
        NullPointer parent = new NullPointer(Locale.getDefault(), "parent");
        NullPropertyPointer pointer = new NullPropertyPointer(parent);

        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertFalse(pointer.isCollection());

        pointer.setIndex(0);
        assertTrue(pointer.isCollection());

        pointer.setIndex(2);
        assertTrue(pointer.isCollection());

        pointer.setIndex(-5);
        assertTrue(pointer.isCollection());
    }

    @Test
    public void testSetValueWithNullParentThrowsException() {
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        pointer.setPropertyName("test");
        try {
            pointer.setValue("value");
            fail("Expected JXPathInvalidAccessException when parent is null");
        }
        catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("the target object is null"));
        }
    }

    @Test
    public void testSetValueWithContainerParentThrowsException() {
        NullPointer parent = new NullPointer(Locale.getDefault(), "id");
        assertTrue(parent.isContainer());
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        pointer.setPropertyName("test");
        try {
            pointer.setValue("value");
            fail("Expected JXPathInvalidAccessException when parent is a container");
        }
        catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("the target object is null"));
        }
    }

    @Test
    public void testSetValueWithDynamicPropertyOwnerParentSuccess() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("dynamicKey");
        pointer.setValue("dynamicValue");

        assertEquals("dynamicValue", map.get("dynamicKey"));
    }

    @Test
    public void testSetValueWithNonDynamicParentThrowsException() {
        TestBean bean = new TestBean();
        JXPathContext context = JXPathContext.newContext(bean);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("nonExistentProperty");
        try {
            pointer.setValue("someValue");
            fail("Expected JXPathInvalidAccessException on non-dynamic parent");
        }
        catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("path does not match a changeable location"));
        }
    }

    @Test
    public void testCreatePathOnDynamicPropertyOwner() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("key1");
        NodePointer createdPath = pointer.createPath(context);
        assertNotNull(createdPath);
        assertTrue(map.containsKey("key1"));
    }

    @Test
    public void testCreatePathWithValueOnDynamicPropertyOwner() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("key2");
        NodePointer createdPath = pointer.createPath(context, "myValue");
        assertNotNull(createdPath);
        assertEquals("myValue", map.get("key2"));
    }

    @Test
    public void testCreateChild() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("nestedMap");

        NodePointer childPointer = pointer.createChild(context, new QName("childKey"), 0, "childValue");
        assertNotNull(childPointer);

        NodePointer childPathOnly = pointer.createChild(context, new QName("childKey2"), 0);
        assertNotNull(childPathOnly);
    }

    @Test
    public void testAsPathDefault() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setPropertyName("testProp");

        assertEquals("/.[@name='testProp']", pointer.asPath());
    }

    @Test
    public void testAsPathByNameAttributeWithoutQuotes() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setNameAttributeValue("simpleName");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        assertEquals("/[@name='simpleName']", pointer.asPath());
    }

    @Test
    public void testAsPathByNameAttributeWithIndex() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setNameAttributeValue("element");
        pointer.setIndex(0);
        assertEquals("/[@name='element'][1]", pointer.asPath());

        pointer.setIndex(2);
        assertEquals("/[@name='element'][3]", pointer.asPath());
    }

    @Test
    public void testAsPathByNameAttributeWithEscapedQuotes() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setNameAttributeValue("it's a \"quoted\" 'name'");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        assertEquals("/[@name='it&apos;s a &quot;quoted&quot; &apos;name&apos;']", pointer.asPath());
    }

    @Test
    public void testAsPathByNameAttributeWithMultipleSingleAndDoubleQuotes() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setNameAttributeValue("'''\"\"\"");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        assertEquals("/[@name='&apos;&apos;&apos;&quot;&quot;&quot;']", pointer.asPath());
    }

    @Test
    public void testCreatePathWithAttributeTrueThrowsExceptionWhenNotSupported() {
        Map<String, Object> map = new HashMap<String, Object>();
        JXPathContext context = JXPathContext.newContext(map);
        NodePointer rootPointer = (NodePointer) context.getPointer("");

        NullPropertyPointer pointer = new NullPropertyPointer(rootPointer);
        pointer.setAttribute(true);
        pointer.setPropertyName("attr");

        try {
            pointer.createPath(context);
            fail("Expected exception when creating attribute on map node pointer");
        }
        catch (Exception e) {
            assertTrue(e instanceof org.apache.commons.jxpath.JXPathException);
        }

        try {
            pointer.createPath(context, "attrVal");
            fail("Expected exception when creating attribute on map node pointer");
        }
        catch (Exception e) {
            assertTrue(e instanceof org.apache.commons.jxpath.JXPathException);
        }
    }
}
