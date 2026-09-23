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

public class JDOMAttributeIterator_init_206761542814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345;
     Object term1813;
     Object term1815;

    public JDOMAttributeIterator_init_206761542814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1225 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term1225, term1225.getClass(), "position", 0);
        setField(term1225, term1225.getClass(), "parent", null);
        term1345 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        term1813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term1814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term1814, term1814.getClass(), "name", null);
        setField(term1814, term1814.getClass(), "bean", null);
        setField(term1814, term1814.getClass(), "handler", null);
        setField(term1814, term1814.getClass(), "value", null);
        setIntField(term1814, term1814.getClass(), "index", 0);
        setBooleanField(term1814, term1814.getClass(), "attribute", false);
        setField(term1814, term1814.getClass(), "rootNode", null);
        setField(term1814, term1814.getClass(), "namespaceResolver", null);
        setField(term1814, term1814.getClass(), "parent", null);
        setField(term1814, term1814.getClass(), "locale", null);
        setField(term1813, term1813.getClass(), "parent", term1814);
        setField(term1813, term1813.getClass(), "attributes", null);
        setIntField(term1813, term1813.getClass(), "position", 0);
        term1815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term1815, term1815.getClass(), "name", null);
        setField(term1815, term1815.getClass(), "bean", null);
        setField(term1815, term1815.getClass(), "handler", null);
        setField(term1815, term1815.getClass(), "value", null);
        setIntField(term1815, term1815.getClass(), "index", 0);
        setBooleanField(term1815, term1815.getClass(), "attribute", false);
        setField(term1815, term1815.getClass(), "rootNode", null);
        setField(term1815, term1815.getClass(), "namespaceResolver", null);
        setField(term1815, term1815.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term1345;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1813));
        assertTrue(recursiveEquals(term1345, term1815));
    }

};


