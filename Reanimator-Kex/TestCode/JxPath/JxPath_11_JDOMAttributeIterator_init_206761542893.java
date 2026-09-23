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

public class JDOMAttributeIterator_init_206761542893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32689;
     Object term32945;
     Object term32949;

    public JDOMAttributeIterator_init_206761542893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term32547, term32547.getClass(), "position", 0);
        setField(term32547, term32547.getClass(), "parent", null);
        term32689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term32689, term32689.getClass(), "parent", null);
        setField(term32689, term32689.getClass(), "name", "*");
        term32945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term32946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term32946, term32946.getClass(), "dynaBean", null);
        setField(term32946, term32946.getClass(), "name", "*");
        setField(term32946, term32946.getClass(), "names", null);
        setIntField(term32946, term32946.getClass(), "propertyIndex", 0);
        setField(term32946, term32946.getClass(), "bean", null);
        setField(term32946, term32946.getClass(), "value", null);
        setIntField(term32946, term32946.getClass(), "index", 0);
        setBooleanField(term32946, term32946.getClass(), "attribute", false);
        setField(term32946, term32946.getClass(), "rootNode", null);
        setField(term32946, term32946.getClass(), "namespaceResolver", null);
        setField(term32946, term32946.getClass(), "parent", null);
        setField(term32946, term32946.getClass(), "locale", null);
        setField(term32945, term32945.getClass(), "parent", term32946);
        setField(term32945, term32945.getClass(), "attributes", null);
        setIntField(term32945, term32945.getClass(), "position", 0);
        term32949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term32949, term32949.getClass(), "dynaBean", null);
        setField(term32949, term32949.getClass(), "name", "*");
        setField(term32949, term32949.getClass(), "names", null);
        setIntField(term32949, term32949.getClass(), "propertyIndex", 0);
        setField(term32949, term32949.getClass(), "bean", null);
        setField(term32949, term32949.getClass(), "value", null);
        setIntField(term32949, term32949.getClass(), "index", 0);
        setBooleanField(term32949, term32949.getClass(), "attribute", false);
        setField(term32949, term32949.getClass(), "rootNode", null);
        setField(term32949, term32949.getClass(), "namespaceResolver", null);
        setField(term32949, term32949.getClass(), "parent", null);
        setField(term32949, term32949.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term32689;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32945));
        assertTrue(recursiveEquals(term32689, term32949));
    }

};


