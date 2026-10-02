package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyPointerTest {

    private NodePointer parentPointer;
    private TestBean rootBean;

    public static class TestBean {
        private String name = "testBean";
        private String[] items = new String[] { "item1", "item2" };

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String[] getItems() {
            return items;
        }

        public void setItems(String[] items) {
            this.items = items;
        }
    }

    private static class ConcretePropertyPointer extends PropertyPointer {
        private String propertyName = "testProp";
        private Object baseValue;
        private boolean actualProperty = true;
        private int propertyCount = 1;
        private String[] propertyNames = new String[] { "testProp" };

        public ConcretePropertyPointer(NodePointer parent) {
            super(parent);
        }

        public void setBaseValue(Object baseValue) {
            this.baseValue = baseValue;
        }

        public void setActualProperty(boolean actualProperty) {
            this.actualProperty = actualProperty;
        }

        public void setPropertyCount(int count) {
            this.propertyCount = count;
        }

        public void setPropertyNames(String[] names) {
            this.propertyNames = names;
        }

        public void setDirectBean(Object bean) {
            this.bean = bean;
        }

        @Override
        public String getPropertyName() {
            return propertyName;
        }

        @Override
        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        @Override
        public int getPropertyCount() {
            return propertyCount;
        }

        @Override
        public String[] getPropertyNames() {
            return propertyNames;
        }

        @Override
        protected boolean isActualProperty() {
            return actualProperty;
        }

        @Override
        public Object getBaseValue() {
            return baseValue;
        }

        @Override
        public void setValue(Object value) {
            this.baseValue = value;
        }
    }

    @Before
    public void setUp() {
        rootBean = new TestBean();
        parentPointer = NodePointer.newNodePointer(new QName("root"), rootBean, Locale.getDefault());
    }

    @Test
    public void testGetAndSetPropertyIndex() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        Assert.assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.getPropertyIndex());

        pointer.setIndex(2);
        pointer.setPropertyIndex(5);
        Assert.assertEquals(5, pointer.getPropertyIndex());
        Assert.assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());

        pointer.setIndex(3);
        pointer.setPropertyIndex(5);
        Assert.assertEquals(3, pointer.getIndex());
    }

    @Test
    public void testGetBean_lazyLoadFromParent() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        Assert.assertSame(rootBean, pointer.getBean());
    }

    @Test
    public void testGetBean_alreadySet() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        Object customBean = new Object();
        pointer.setDirectBean(customBean);
        Assert.assertSame(customBean, pointer.getBean());
    }

    @Test
    public void testGetName() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setPropertyName("myProperty");
        QName name = pointer.getName();
        Assert.assertNull(name.getPrefix());
        Assert.assertEquals("myProperty", name.getName());
    }

    @Test
    public void testGetPropertyCountAndNames() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setPropertyCount(2);
        pointer.setPropertyNames(new String[] { "prop1", "prop2" });

        Assert.assertEquals(2, pointer.getPropertyCount());
        Assert.assertArrayEquals(new String[] { "prop1", "prop2" }, pointer.getPropertyNames());
    }

    @Test
    public void testIsActual_whenActualPropertyIsFalse() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setActualProperty(false);
        Assert.assertFalse(pointer.isActual());
    }

    @Test
    public void testIsActual_whenActualPropertyIsTrue() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setActualProperty(true);
        Assert.assertTrue(pointer.isActual());
    }

    @Test
    public void testGetImmediateNode_wholeCollection() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("singleValue");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        Assert.assertEquals("singleValue", pointer.getImmediateNode());
        // Second call returns cached value
        Assert.assertEquals("singleValue", pointer.getImmediateNode());
    }

    @Test
    public void testGetImmediateNode_specificIndex() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        String[] items = new String[] { "first", "second" };
        pointer.setBaseValue(items);
        pointer.setIndex(1);
        Assert.assertEquals("second", pointer.getImmediateNode());
    }

    @Test
    public void testIsCollection() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        Assert.assertFalse(pointer.isCollection());

        pointer.setBaseValue("string");
        Assert.assertFalse(pointer.isCollection());

        pointer.setBaseValue(new String[] { "a", "b" });
        Assert.assertTrue(pointer.isCollection());

        List<String> list = new ArrayList<String>();
        list.add("item");
        pointer.setBaseValue(list);
        Assert.assertTrue(pointer.isCollection());
    }

    @Test
    public void testIsLeaf() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        Assert.assertTrue(pointer.isLeaf());

        pointer.setBaseValue("atomicString");
        Assert.assertTrue(pointer.isLeaf());

        ConcretePropertyPointer beanPointer = new ConcretePropertyPointer(parentPointer);
        beanPointer.setBaseValue(new TestBean());
        Assert.assertFalse(beanPointer.isLeaf());
    }

    @Test
    public void testGetLength() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        Assert.assertEquals(0, pointer.getLength());

        pointer.setBaseValue("single");
        Assert.assertEquals(1, pointer.getLength());

        pointer.setBaseValue(new String[] { "a", "b", "c" });
        Assert.assertEquals(3, pointer.getLength());
    }

    @Test
    public void testGetImmediateValuePointer() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("testValue");
        NodePointer valuePointer = pointer.getImmediateValuePointer();
        Assert.assertNotNull(valuePointer);
        Assert.assertEquals("testValue", valuePointer.getImmediateNode());
    }

    @Test
    public void testCreatePath_valueNotNull_returnsSelf() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("existingValue");
        JXPathContext context = JXPathContext.newContext(rootBean);
        NodePointer result = pointer.createPath(context);
        Assert.assertSame(pointer, result);
    }

    @Test
    public void testCreatePath_valueNull_factorySuccess_wholeCollection() {
        final ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        pointer.setPropertyName("name");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        JXPathContext context = JXPathContext.newContext(rootBean);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, NodePointer ptr, Object parent, String name, int index) {
                if ("name".equals(name) && index == 0) {
                    pointer.setBaseValue("created");
                    return true;
                }
                return false;
            }
        });

        NodePointer result = pointer.createPath(context);
        Assert.assertSame(pointer, result);
    }

    @Test
    public void testCreatePath_valueNull_factorySuccess_indexed() {
        final ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        pointer.setPropertyName("items");
        pointer.setIndex(2);

        JXPathContext context = JXPathContext.newContext(rootBean);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, NodePointer ptr, Object parent, String name, int index) {
                if ("items".equals(name) && index == 2) {
                    pointer.setBaseValue("itemAtIndex2");
                    return true;
                }
                return false;
            }
        });

        NodePointer result = pointer.createPath(context);
        Assert.assertSame(pointer, result);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreatePath_valueNull_factoryFailure_throwsException() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(null);
        pointer.setPropertyName("nonExistent");

        JXPathContext context = JXPathContext.newContext(rootBean);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, NodePointer ptr, Object parent, String name, int index) {
                return false;
            }
        });

        pointer.createPath(context);
    }

    @Test
    public void testCreatePathWithValue_wholeCollection() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("oldValue");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        JXPathContext context = JXPathContext.newContext(rootBean);
        NodePointer result = pointer.createPath(context, "newValue");
        Assert.assertSame(pointer, result);
        Assert.assertEquals("newValue", pointer.getBaseValue());
    }

    @Test
    public void testCreatePathWithValue_expandingCollection() {
        final ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue(new String[] { "item0" });
        pointer.setPropertyName("items");
        pointer.setIndex(3);

        JXPathContext context = JXPathContext.newContext(rootBean);
        context.setFactory(new AbstractFactory() {
            @Override
            public boolean createObject(JXPathContext ctx, NodePointer ptr, Object parent, String name, int index) {
                pointer.setBaseValue(new String[] { "item0", "item1", "item2", "item3" });
                return true;
            }
        });

        NodePointer result = pointer.createPath(context, "newItem");
        Assert.assertSame(pointer, result);
        Assert.assertEquals("newItem", pointer.getBaseValue());
    }

    @Test
    public void testCreateChild_withValue_nameNotNull() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("init");

        JXPathContext context = JXPathContext.newContext(rootBean);
        QName childName = new QName("childProp");
        NodePointer child = pointer.createChild(context, childName, 0, "childValue");

        Assert.assertNotNull(child);
        Assert.assertTrue(child instanceof PropertyPointer);
        PropertyPointer childProp = (PropertyPointer) child;
        Assert.assertEquals("childProp", childProp.getPropertyName());
        Assert.assertEquals(0, childProp.getIndex());
        Assert.assertEquals("childValue", childProp.getBaseValue());
    }

    @Test
    public void testCreateChild_withValue_nameNull() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setPropertyName("originalProp");
        pointer.setBaseValue("init");

        JXPathContext context = JXPathContext.newContext(rootBean);
        NodePointer child = pointer.createChild(context, null, 1, "childValue");

        Assert.assertNotNull(child);
        PropertyPointer childProp = (PropertyPointer) child;
        Assert.assertEquals("originalProp", childProp.getPropertyName());
        Assert.assertEquals(1, childProp.getIndex());
    }

    @Test
    public void testCreateChild_withoutValue_nameNotNull() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setBaseValue("init");

        JXPathContext context = JXPathContext.newContext(rootBean);
        QName childName = new QName("childProp2");
        NodePointer child = pointer.createChild(context, childName, 0);

        Assert.assertNotNull(child);
        PropertyPointer childProp = (PropertyPointer) child;
        Assert.assertEquals("childProp2", childProp.getPropertyName());
        Assert.assertEquals(0, childProp.getIndex());
    }

    @Test
    public void testCreateChild_withoutValue_nameNull() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setPropertyName("origName");
        pointer.setBaseValue("init");

        JXPathContext context = JXPathContext.newContext(rootBean);
        NodePointer child = pointer.createChild(context, null, 2);

        Assert.assertNotNull(child);
        PropertyPointer childProp = (PropertyPointer) child;
        Assert.assertEquals("origName", childProp.getPropertyName());
        Assert.assertEquals(2, childProp.getIndex());
    }

    @Test
    public void testHashCode() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        pointer.setPropertyIndex(2);
        pointer.setIndex(3);

        int expectedHashCode = parentPointer.hashCode() + 2 + 3;
        Assert.assertEquals(expectedHashCode, pointer.hashCode());
    }

    @Test
    public void testEquals_sameObject() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        Assert.assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEquals_nullOrDifferentClass() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parentPointer);
        Assert.assertFalse(pointer.equals(null));
        Assert.assertFalse(pointer.equals("someString"));
    }

    @Test
    public void testEquals_differentParent() {
        NodePointer otherParent = NodePointer.newNodePointer(new QName("other"), new TestBean(), Locale.getDefault());
        ConcretePropertyPointer pointer1 = new ConcretePropertyPointer(parentPointer);
        ConcretePropertyPointer pointer2 = new ConcretePropertyPointer(otherParent);

        Assert.assertFalse(pointer1.equals(pointer2));

        ConcretePropertyPointer nullParent1 = new ConcretePropertyPointer(null);
        ConcretePropertyPointer nullParent2 = new ConcretePropertyPointer(null);
        Assert.assertTrue(nullParent1.equals(nullParent2));

        Assert.assertFalse(pointer1.equals(nullParent1));
        Assert.assertFalse(nullParent1.equals(pointer1));
    }

    @Test
    public void testEquals_differentPropertyIndex() {
        ConcretePropertyPointer pointer1 = new ConcretePropertyPointer(parentPointer);
        ConcretePropertyPointer pointer2 = new ConcretePropertyPointer(parentPointer);
        pointer1.setPropertyIndex(1);
        pointer2.setPropertyIndex(2);

        Assert.assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testEquals_differentPropertyName() {
        ConcretePropertyPointer pointer1 = new ConcretePropertyPointer(parentPointer);
        ConcretePropertyPointer pointer2 = new ConcretePropertyPointer(parentPointer);
        pointer1.setPropertyName("propA");
        pointer2.setPropertyName("propB");

        Assert.assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testEquals_indexComparison() {
        ConcretePropertyPointer pointer1 = new ConcretePropertyPointer(parentPointer);
        ConcretePropertyPointer pointer2 = new ConcretePropertyPointer(parentPointer);
        pointer1.setPropertyName("sameProp");
        pointer2.setPropertyName("sameProp");

        // WHOLE_COLLECTION (-1) and 0 are treated as equivalent (0 == 0)
        pointer1.setIndex(NodePointer.WHOLE_COLLECTION);
        pointer2.setIndex(0);
        Assert.assertTrue(pointer1.equals(pointer2));

        pointer1.setIndex(1);
        pointer2.setIndex(1);
        Assert.assertTrue(pointer1.equals(pointer2));

        pointer1.setIndex(1);
        pointer2.setIndex(2);
        Assert.assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testCompareChildNodePointers() {
        JXPathContext context = JXPathContext.newContext(rootBean);
        NodePointer ptr = context.getPointer("items");
        Assert.assertTrue(ptr instanceof PropertyPointer);
        PropertyPointer propPointer = (PropertyPointer) ptr;

        NodePointer child1 = propPointer.createChild(context, null, 0);
        NodePointer child2 = propPointer.createChild(context, null, 1);

        int cmp = propPointer.compareChildNodePointers(child1, child2);
        Assert.assertTrue(cmp < 0);
    }
}
