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

public class JDOMAttributeIterator_init_206761542827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3899;
     Object term4817;
     Object term4819;

    public JDOMAttributeIterator_init_206761542827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term3779, term3779.getClass(), "position", 0);
        setField(term3779, term3779.getClass(), "parent", null);
        term3899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term4025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setField(term4025, term4025.getClass(), "UNINITIALIZED", term4025);
        setField(term3899, term3899.getClass(), "value", term4025);
        term4817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term4818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term4818, term4818.getClass(), "name", null);
        setField(term4818, term4818.getClass(), "bean", null);
        setField(term4818, term4818.getClass(), "handler", null);
        setField(term4818, term4818.getClass(), "value", null);
        setIntField(term4818, term4818.getClass(), "index", 0);
        setBooleanField(term4818, term4818.getClass(), "attribute", false);
        setField(term4818, term4818.getClass(), "rootNode", null);
        setField(term4818, term4818.getClass(), "namespaceResolver", null);
        setField(term4818, term4818.getClass(), "parent", null);
        setField(term4818, term4818.getClass(), "locale", null);
        setField(term4817, term4817.getClass(), "parent", term4818);
        setField(term4817, term4817.getClass(), "attributes", null);
        setIntField(term4817, term4817.getClass(), "position", 0);
        term4819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term4819, term4819.getClass(), "name", null);
        setField(term4819, term4819.getClass(), "bean", null);
        setField(term4819, term4819.getClass(), "handler", null);
        setField(term4819, term4819.getClass(), "value", null);
        setIntField(term4819, term4819.getClass(), "index", 0);
        setBooleanField(term4819, term4819.getClass(), "attribute", false);
        setField(term4819, term4819.getClass(), "rootNode", null);
        setField(term4819, term4819.getClass(), "namespaceResolver", null);
        setField(term4819, term4819.getClass(), "parent", null);
        setField(term4819, term4819.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term3899;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4817));
        assertTrue(recursiveEquals(term3899, term4819));
    }

};


