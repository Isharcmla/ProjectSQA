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

public class JDOMAttributeIterator_init_2067615428347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246083;
     Object term247335;
     Object term247340;

    public JDOMAttributeIterator_init_2067615428347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term245941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term245941, term245941.getClass(), "position", 0);
        setField(term245941, term245941.getClass(), "parent", null);
        term246083 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term245509 = (Object[]) newArray("java.lang.String", 0);
        setField(term246083, term246083.getClass(), "parent", null);
        setField(term246083, term246083.getClass(), "name", null);
        setField(term246083, term246083.getClass(), "names", term245509);
        setIntField(term246083, term246083.getClass(), "propertyIndex", 0);
        Object[] term245805 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 8);
        Object term246219 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term246337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term246459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term246601 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term246721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term246861 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term246985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        Object term247125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        setElement(term245805, 0, term246219);
        setElement(term245805, 1, term246337);
        setElement(term245805, 2, term246459);
        setElement(term245805, 3, term246601);
        setElement(term245805, 4, term246721);
        setElement(term245805, 5, term246861);
        setElement(term245805, 6, term246985);
        setElement(term245805, 7, term247125);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term245805);
        term247335 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term247336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term247339 = (Object[]) newArray("java.lang.String", 0);
        setField(term247336, term247336.getClass(), "dynaBean", null);
        setField(term247336, term247336.getClass(), "name", "*");
        setField(term247336, term247336.getClass(), "names", term247339);
        setIntField(term247336, term247336.getClass(), "propertyIndex", 0);
        setField(term247336, term247336.getClass(), "bean", null);
        setField(term247336, term247336.getClass(), "value", null);
        setIntField(term247336, term247336.getClass(), "index", 0);
        setBooleanField(term247336, term247336.getClass(), "attribute", false);
        setField(term247336, term247336.getClass(), "rootNode", null);
        setField(term247336, term247336.getClass(), "namespaceResolver", null);
        setField(term247336, term247336.getClass(), "parent", null);
        setField(term247336, term247336.getClass(), "locale", null);
        setField(term247335, term247335.getClass(), "parent", term247336);
        setField(term247335, term247335.getClass(), "attributes", null);
        setIntField(term247335, term247335.getClass(), "position", 0);
        term247340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term247343 = (Object[]) newArray("java.lang.String", 0);
        setField(term247340, term247340.getClass(), "dynaBean", null);
        setField(term247340, term247340.getClass(), "name", "*");
        setField(term247340, term247340.getClass(), "names", term247343);
        setIntField(term247340, term247340.getClass(), "propertyIndex", 0);
        setField(term247340, term247340.getClass(), "bean", null);
        setField(term247340, term247340.getClass(), "value", null);
        setIntField(term247340, term247340.getClass(), "index", 0);
        setBooleanField(term247340, term247340.getClass(), "attribute", false);
        setField(term247340, term247340.getClass(), "rootNode", null);
        setField(term247340, term247340.getClass(), "namespaceResolver", null);
        setField(term247340, term247340.getClass(), "parent", null);
        setField(term247340, term247340.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term246083;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term247335));
        assertTrue(recursiveEquals(term246083, term247340));
    }

};


