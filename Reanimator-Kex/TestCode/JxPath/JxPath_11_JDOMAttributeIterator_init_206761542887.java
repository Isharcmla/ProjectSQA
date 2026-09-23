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

public class JDOMAttributeIterator_init_206761542887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29209;
     Object term30695;
     Object term30700;

    public JDOMAttributeIterator_init_206761542887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term29067, term29067.getClass(), "position", 0);
        setField(term29067, term29067.getClass(), "parent", null);
        term29209 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term28900 = (Object[]) newArray("java.lang.String", 0);
        setField(term29209, term29209.getClass(), "parent", null);
        setField(term29209, term29209.getClass(), "name", null);
        setField(term29209, term29209.getClass(), "names", term28900);
        term30695 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term30696 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term30699 = (Object[]) newArray("java.lang.String", 0);
        setField(term30696, term30696.getClass(), "dynaBean", null);
        setField(term30696, term30696.getClass(), "name", "*");
        setField(term30696, term30696.getClass(), "names", term30699);
        setIntField(term30696, term30696.getClass(), "propertyIndex", 0);
        setField(term30696, term30696.getClass(), "bean", null);
        setField(term30696, term30696.getClass(), "value", null);
        setIntField(term30696, term30696.getClass(), "index", 0);
        setBooleanField(term30696, term30696.getClass(), "attribute", false);
        setField(term30696, term30696.getClass(), "rootNode", null);
        setField(term30696, term30696.getClass(), "namespaceResolver", null);
        setField(term30696, term30696.getClass(), "parent", null);
        setField(term30696, term30696.getClass(), "locale", null);
        setField(term30695, term30695.getClass(), "parent", term30696);
        setField(term30695, term30695.getClass(), "attributes", null);
        setIntField(term30695, term30695.getClass(), "position", 0);
        term30700 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term30703 = (Object[]) newArray("java.lang.String", 0);
        setField(term30700, term30700.getClass(), "dynaBean", null);
        setField(term30700, term30700.getClass(), "name", "*");
        setField(term30700, term30700.getClass(), "names", term30703);
        setIntField(term30700, term30700.getClass(), "propertyIndex", 0);
        setField(term30700, term30700.getClass(), "bean", null);
        setField(term30700, term30700.getClass(), "value", null);
        setIntField(term30700, term30700.getClass(), "index", 0);
        setBooleanField(term30700, term30700.getClass(), "attribute", false);
        setField(term30700, term30700.getClass(), "rootNode", null);
        setField(term30700, term30700.getClass(), "namespaceResolver", null);
        setField(term30700, term30700.getClass(), "parent", null);
        setField(term30700, term30700.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term29209;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30695));
        assertTrue(recursiveEquals(term29209, term30700));
    }

};


