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

public class DOMAttributeIterator_init_7810902351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8570715;
     Object term8570873;
     Object term8748229;
     Object term8748590;
     Object term8748593;

    public DOMAttributeIterator_init_7810902351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8570595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term8570595, term8570595.getClass(), "position", 0);
        setField(term8570595, term8570595.getClass(), "parent", null);
        setField(term8570595, term8570595.getClass(), "name", null);
        setField(term8570595, term8570595.getClass(), "attributes", null);
        term8570715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term8570799 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setShortField(term8570799, term8570799.getClass(), "flags", (short) 0);
        setField(term8570799, term8570799.getClass(), "attributes", null);
        setField(term8570715, term8570715.getClass(), "value", term8570799);
        term8570873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term8570873, term8570873.getClass(), "name", "*");
        ArrayList term8748527 = new ArrayList();
        term8748229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term8748263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term8748314 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term8748325 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term8748429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term8748263, term8748263.getClass(), "name", null);
        setField(term8748263, term8748263.getClass(), "bean", null);
        setField(term8748263, term8748263.getClass(), "handler", null);
        setField(term8748314, term8748314.getClass(), "name", null);
        setShortField(term8748325, term8748325.getClass(), "flags", (short) 0);
        setField(term8748325, term8748325.getClass(), "nodes", null);
        setField(term8748325, term8748325.getClass(), "ownerNode", term8748314);
        setField(term8748314, term8748314.getClass(), "attributes", term8748325);
        setField(term8748314, term8748314.getClass(), "ownerDocument", null);
        setField(term8748314, term8748314.getClass(), "firstChild", null);
        setField(term8748314, term8748314.getClass(), "fNodeListCache", null);
        setField(term8748314, term8748314.getClass(), "previousSibling", null);
        setField(term8748314, term8748314.getClass(), "nextSibling", null);
        setField(term8748314, term8748314.getClass(), "ownerNode", null);
        setShortField(term8748314, term8748314.getClass(), "flags", (short) 0);
        setField(term8748263, term8748263.getClass(), "value", term8748314);
        setIntField(term8748263, term8748263.getClass(), "index", 0);
        setBooleanField(term8748263, term8748263.getClass(), "attribute", false);
        setField(term8748263, term8748263.getClass(), "rootNode", null);
        setField(term8748263, term8748263.getClass(), "namespaceResolver", null);
        setField(term8748263, term8748263.getClass(), "parent", null);
        setField(term8748263, term8748263.getClass(), "locale", null);
        setField(term8748229, term8748229.getClass(), "parent", term8748263);
        setField(term8748429, term8748429.getClass(), "prefix", null);
        setField(term8748429, term8748429.getClass(), "name", "*");
        setField(term8748429, term8748429.getClass(), "qualifiedName", null);
        setField(term8748229, term8748229.getClass(), "name", term8748429);
        setField(term8748229, term8748229.getClass(), "attributes", term8748527);
        setIntField(term8748229, term8748229.getClass(), "position", 0);
        term8748590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term8748591 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term8748592 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term8748590, term8748590.getClass(), "name", null);
        setField(term8748590, term8748590.getClass(), "bean", null);
        setField(term8748590, term8748590.getClass(), "handler", null);
        setField(term8748591, term8748591.getClass(), "name", null);
        setShortField(term8748592, term8748592.getClass(), "flags", (short) 0);
        setField(term8748592, term8748592.getClass(), "nodes", null);
        setField(term8748592, term8748592.getClass(), "ownerNode", term8748591);
        setField(term8748591, term8748591.getClass(), "attributes", term8748592);
        setField(term8748591, term8748591.getClass(), "ownerDocument", null);
        setField(term8748591, term8748591.getClass(), "firstChild", null);
        setField(term8748591, term8748591.getClass(), "fNodeListCache", null);
        setField(term8748591, term8748591.getClass(), "previousSibling", null);
        setField(term8748591, term8748591.getClass(), "nextSibling", null);
        setField(term8748591, term8748591.getClass(), "ownerNode", null);
        setShortField(term8748591, term8748591.getClass(), "flags", (short) 0);
        setField(term8748590, term8748590.getClass(), "value", term8748591);
        setIntField(term8748590, term8748590.getClass(), "index", 0);
        setBooleanField(term8748590, term8748590.getClass(), "attribute", false);
        setField(term8748590, term8748590.getClass(), "rootNode", null);
        setField(term8748590, term8748590.getClass(), "namespaceResolver", null);
        setField(term8748590, term8748590.getClass(), "parent", null);
        setField(term8748590, term8748590.getClass(), "locale", null);
        term8748593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term8748593, term8748593.getClass(), "prefix", null);
        setField(term8748593, term8748593.getClass(), "name", "*");
        setField(term8748593, term8748593.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term8570715;
        args[1] = term8570873;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8748229));
        assertTrue(recursiveEquals(term8570715, term8748590));
        assertTrue(recursiveEquals(term8570873, term8748593));
    }

};


