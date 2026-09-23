package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34054;
     Object term34202;
     Object term34743;
     Object term34749;
     Object term34751;

    public DOMAttributeIterator_init_7810902118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33808 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term33934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setIntField(term33808, term33808.getClass(), "position", 0);
        setField(term33808, term33808.getClass(), "parent", term33934);
        setField(term33808, term33808.getClass(), "name", null);
        setField(term33808, term33808.getClass(), "attributes", null);
        term34054 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term34128 = newInstance(Class.forName("org.apache.xerces.dom.NotationImpl"));
        setField(term34054, term34054.getClass(), "value", term34128);
        term34202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        ArrayList term34747 = new ArrayList();
        term34743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term34744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term34745 = newInstance(Class.forName("org.apache.xerces.dom.NotationImpl"));
        Object term34746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term34744, term34744.getClass(), "name", null);
        setField(term34744, term34744.getClass(), "bean", null);
        setField(term34744, term34744.getClass(), "handler", null);
        setField(term34745, term34745.getClass(), "name", null);
        setField(term34745, term34745.getClass(), "publicId", null);
        setField(term34745, term34745.getClass(), "systemId", null);
        setField(term34745, term34745.getClass(), "baseURI", null);
        setField(term34745, term34745.getClass(), "ownerNode", null);
        setShortField(term34745, term34745.getClass(), "flags", (short) 0);
        setField(term34744, term34744.getClass(), "value", term34745);
        setIntField(term34744, term34744.getClass(), "index", 0);
        setBooleanField(term34744, term34744.getClass(), "attribute", false);
        setField(term34744, term34744.getClass(), "rootNode", null);
        setField(term34744, term34744.getClass(), "namespaceResolver", null);
        setField(term34744, term34744.getClass(), "parent", null);
        setField(term34744, term34744.getClass(), "locale", null);
        setField(term34743, term34743.getClass(), "parent", term34744);
        setField(term34746, term34746.getClass(), "prefix", null);
        setField(term34746, term34746.getClass(), "name", null);
        setField(term34746, term34746.getClass(), "qualifiedName", null);
        setField(term34743, term34743.getClass(), "name", term34746);
        setField(term34743, term34743.getClass(), "attributes", term34747);
        setIntField(term34743, term34743.getClass(), "position", 0);
        term34749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term34750 = newInstance(Class.forName("org.apache.xerces.dom.NotationImpl"));
        setField(term34749, term34749.getClass(), "name", null);
        setField(term34749, term34749.getClass(), "bean", null);
        setField(term34749, term34749.getClass(), "handler", null);
        setField(term34750, term34750.getClass(), "name", null);
        setField(term34750, term34750.getClass(), "publicId", null);
        setField(term34750, term34750.getClass(), "systemId", null);
        setField(term34750, term34750.getClass(), "baseURI", null);
        setField(term34750, term34750.getClass(), "ownerNode", null);
        setShortField(term34750, term34750.getClass(), "flags", (short) 0);
        setField(term34749, term34749.getClass(), "value", term34750);
        setIntField(term34749, term34749.getClass(), "index", 0);
        setBooleanField(term34749, term34749.getClass(), "attribute", false);
        setField(term34749, term34749.getClass(), "rootNode", null);
        setField(term34749, term34749.getClass(), "namespaceResolver", null);
        setField(term34749, term34749.getClass(), "parent", null);
        setField(term34749, term34749.getClass(), "locale", null);
        term34751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term34751, term34751.getClass(), "prefix", null);
        setField(term34751, term34751.getClass(), "name", null);
        setField(term34751, term34751.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term34054;
        args[1] = term34202;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34743));
        assertTrue(recursiveEquals(term34054, term34749));
        assertTrue(recursiveEquals(term34202, term34751));
    }

};


