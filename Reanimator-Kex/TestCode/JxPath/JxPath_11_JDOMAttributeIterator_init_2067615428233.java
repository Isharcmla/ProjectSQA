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

public class JDOMAttributeIterator_init_2067615428233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143883;
     Object term145129;
     Object term145134;

    public JDOMAttributeIterator_init_2067615428233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term143741, term143741.getClass(), "position", 0);
        setField(term143741, term143741.getClass(), "parent", null);
        term143883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term143289 = (Object[]) newArray("java.lang.String", 0);
        setField(term143883, term143883.getClass(), "parent", null);
        setField(term143883, term143883.getClass(), "name", null);
        setField(term143883, term143883.getClass(), "names", term143289);
        setIntField(term143883, term143883.getClass(), "propertyIndex", 0);
        Object[] term143605 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 8);
        Object term144019 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term144137 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term144259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term144401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term144521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term144661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term144781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term144915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term143605, 0, term144019);
        setElement(term143605, 1, term144137);
        setElement(term143605, 2, term144259);
        setElement(term143605, 3, term144401);
        setElement(term143605, 4, term144521);
        setElement(term143605, 5, term144661);
        setElement(term143605, 6, term144781);
        setElement(term143605, 7, term144915);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term143605);
        term145129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term145130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term145133 = (Object[]) newArray("java.lang.String", 0);
        setField(term145130, term145130.getClass(), "dynaBean", null);
        setField(term145130, term145130.getClass(), "name", "*");
        setField(term145130, term145130.getClass(), "names", term145133);
        setIntField(term145130, term145130.getClass(), "propertyIndex", 0);
        setField(term145130, term145130.getClass(), "bean", null);
        setField(term145130, term145130.getClass(), "value", null);
        setIntField(term145130, term145130.getClass(), "index", 0);
        setBooleanField(term145130, term145130.getClass(), "attribute", false);
        setField(term145130, term145130.getClass(), "rootNode", null);
        setField(term145130, term145130.getClass(), "namespaceResolver", null);
        setField(term145130, term145130.getClass(), "parent", null);
        setField(term145130, term145130.getClass(), "locale", null);
        setField(term145129, term145129.getClass(), "parent", term145130);
        setField(term145129, term145129.getClass(), "attributes", null);
        setIntField(term145129, term145129.getClass(), "position", 0);
        term145134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term145137 = (Object[]) newArray("java.lang.String", 0);
        setField(term145134, term145134.getClass(), "dynaBean", null);
        setField(term145134, term145134.getClass(), "name", "*");
        setField(term145134, term145134.getClass(), "names", term145137);
        setIntField(term145134, term145134.getClass(), "propertyIndex", 0);
        setField(term145134, term145134.getClass(), "bean", null);
        setField(term145134, term145134.getClass(), "value", null);
        setIntField(term145134, term145134.getClass(), "index", 0);
        setBooleanField(term145134, term145134.getClass(), "attribute", false);
        setField(term145134, term145134.getClass(), "rootNode", null);
        setField(term145134, term145134.getClass(), "namespaceResolver", null);
        setField(term145134, term145134.getClass(), "parent", null);
        setField(term145134, term145134.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term143883;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term145129));
        assertTrue(recursiveEquals(term143883, term145134));
    }

};


