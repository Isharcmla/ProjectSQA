package org.apache.commons.jxpath.ri.model.jdom;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMAttributeIterator_init_2067615428109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40293;
     Object term41697;
     Object term41702;

    public JDOMAttributeIterator_init_2067615428109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term40151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setIntField(term40041, term40041.getClass(), "position", 0);
        setField(term40041, term40041.getClass(), "parent", term40151);
        term40293 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term39612 = (Object[]) newArray("java.lang.String", 0);
        setField(term40293, term40293.getClass(), "parent", null);
        setField(term40293, term40293.getClass(), "name", null);
        setField(term40293, term40293.getClass(), "names", term39612);
        setIntField(term40293, term40293.getClass(), "propertyIndex", 0);
        Object[] term39907 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term40429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term40547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term40669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term40811 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term40951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term41085 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term39907, 0, term40429);
        setElement(term39907, 1, term40547);
        setElement(term39907, 2, term40669);
        setElement(term39907, 3, term40811);
        setElement(term39907, 4, term40951);
        setElement(term39907, 5, term41085);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term39907);
        term41697 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term41698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term41701 = (Object[]) newArray("java.lang.String", 0);
        setField(term41698, term41698.getClass(), "dynaBean", null);
        setField(term41698, term41698.getClass(), "name", "*");
        setField(term41698, term41698.getClass(), "names", term41701);
        setIntField(term41698, term41698.getClass(), "propertyIndex", 0);
        setField(term41698, term41698.getClass(), "bean", null);
        setField(term41698, term41698.getClass(), "value", null);
        setIntField(term41698, term41698.getClass(), "index", 0);
        setBooleanField(term41698, term41698.getClass(), "attribute", false);
        setField(term41698, term41698.getClass(), "rootNode", null);
        setField(term41698, term41698.getClass(), "namespaceResolver", null);
        setField(term41698, term41698.getClass(), "parent", null);
        setField(term41698, term41698.getClass(), "locale", null);
        setField(term41697, term41697.getClass(), "parent", term41698);
        setField(term41697, term41697.getClass(), "attributes", null);
        setIntField(term41697, term41697.getClass(), "position", 0);
        term41702 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term41705 = (Object[]) newArray("java.lang.String", 0);
        setField(term41702, term41702.getClass(), "dynaBean", null);
        setField(term41702, term41702.getClass(), "name", "*");
        setField(term41702, term41702.getClass(), "names", term41705);
        setIntField(term41702, term41702.getClass(), "propertyIndex", 0);
        setField(term41702, term41702.getClass(), "bean", null);
        setField(term41702, term41702.getClass(), "value", null);
        setIntField(term41702, term41702.getClass(), "index", 0);
        setBooleanField(term41702, term41702.getClass(), "attribute", false);
        setField(term41702, term41702.getClass(), "rootNode", null);
        setField(term41702, term41702.getClass(), "namespaceResolver", null);
        setField(term41702, term41702.getClass(), "parent", null);
        setField(term41702, term41702.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term40293;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41697));
        assertTrue(recursiveEquals(term40293, term41702));
    }

};


