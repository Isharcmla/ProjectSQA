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

public class JDOMAttributeIterator_init_2067615428158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75641;
     Object term78622;
     Object term78627;

    public JDOMAttributeIterator_init_2067615428158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term75499, term75499.getClass(), "position", 0);
        setField(term75499, term75499.getClass(), "parent", null);
        term75641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term75777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term75777, term75777.getClass(), "parent", null);
        setField(term75641, term75641.getClass(), "parent", term75777);
        setField(term75641, term75641.getClass(), "name", "*");
        Object[] term75364 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term75951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term76069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term76191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term76333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term76473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term76607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term75364, 0, term75951);
        setElement(term75364, 1, term76069);
        setElement(term75364, 2, term76191);
        setElement(term75364, 3, term76333);
        setElement(term75364, 4, term76473);
        setElement(term75364, 5, term76607);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term75364);
        term78622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term78623 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term78626 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term78623, term78623.getClass(), "dynaBean", null);
        setField(term78623, term78623.getClass(), "name", "*");
        setField(term78623, term78623.getClass(), "names", null);
        setIntField(term78623, term78623.getClass(), "propertyIndex", 0);
        setField(term78623, term78623.getClass(), "bean", null);
        setField(term78623, term78623.getClass(), "value", null);
        setIntField(term78623, term78623.getClass(), "index", 0);
        setBooleanField(term78623, term78623.getClass(), "attribute", false);
        setField(term78623, term78623.getClass(), "rootNode", null);
        setField(term78623, term78623.getClass(), "namespaceResolver", null);
        setField(term78626, term78626.getClass(), "handler", null);
        setField(term78626, term78626.getClass(), "name", null);
        setField(term78626, term78626.getClass(), "names", null);
        setField(term78626, term78626.getClass(), "requiredPropertyName", null);
        setIntField(term78626, term78626.getClass(), "propertyIndex", 0);
        setField(term78626, term78626.getClass(), "bean", null);
        setField(term78626, term78626.getClass(), "value", null);
        setIntField(term78626, term78626.getClass(), "index", 0);
        setBooleanField(term78626, term78626.getClass(), "attribute", false);
        setField(term78626, term78626.getClass(), "rootNode", null);
        setField(term78626, term78626.getClass(), "namespaceResolver", null);
        setField(term78626, term78626.getClass(), "parent", null);
        setField(term78626, term78626.getClass(), "locale", null);
        setField(term78623, term78623.getClass(), "parent", term78626);
        setField(term78623, term78623.getClass(), "locale", null);
        setField(term78622, term78622.getClass(), "parent", term78623);
        setField(term78622, term78622.getClass(), "attributes", null);
        setIntField(term78622, term78622.getClass(), "position", 0);
        term78627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term78630 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term78627, term78627.getClass(), "dynaBean", null);
        setField(term78627, term78627.getClass(), "name", "*");
        setField(term78627, term78627.getClass(), "names", null);
        setIntField(term78627, term78627.getClass(), "propertyIndex", 0);
        setField(term78627, term78627.getClass(), "bean", null);
        setField(term78627, term78627.getClass(), "value", null);
        setIntField(term78627, term78627.getClass(), "index", 0);
        setBooleanField(term78627, term78627.getClass(), "attribute", false);
        setField(term78627, term78627.getClass(), "rootNode", null);
        setField(term78627, term78627.getClass(), "namespaceResolver", null);
        setField(term78630, term78630.getClass(), "handler", null);
        setField(term78630, term78630.getClass(), "name", null);
        setField(term78630, term78630.getClass(), "names", null);
        setField(term78630, term78630.getClass(), "requiredPropertyName", null);
        setIntField(term78630, term78630.getClass(), "propertyIndex", 0);
        setField(term78630, term78630.getClass(), "bean", null);
        setField(term78630, term78630.getClass(), "value", null);
        setIntField(term78630, term78630.getClass(), "index", 0);
        setBooleanField(term78630, term78630.getClass(), "attribute", false);
        setField(term78630, term78630.getClass(), "rootNode", null);
        setField(term78630, term78630.getClass(), "namespaceResolver", null);
        setField(term78630, term78630.getClass(), "parent", null);
        setField(term78630, term78630.getClass(), "locale", null);
        setField(term78627, term78627.getClass(), "parent", term78630);
        setField(term78627, term78627.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term75641;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78622));
        assertTrue(recursiveEquals(term75641, term78627));
    }

};


