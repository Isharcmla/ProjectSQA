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

public class DOMAttributeIterator_init_7810902271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147646;
     Object term147804;
     Object term147891;
     Object term147899;
     Object term147901;

    public DOMAttributeIterator_init_7810902271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term147526 = new ArrayList();
        Object term147400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term147474 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term147400, term147400.getClass(), "position", 0);
        setField(term147400, term147400.getClass(), "parent", null);
        setField(term147400, term147400.getClass(), "name", term147474);
        setField(term147400, term147400.getClass(), "attributes", term147526);
        term147646 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term147730 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term147646, term147646.getClass(), "value", term147730);
        term147804 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term147804, term147804.getClass(), "name", "");
        ArrayList term147897 = new ArrayList();
        term147891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term147892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term147893 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term147894 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term147892, term147892.getClass(), "name", null);
        setField(term147892, term147892.getClass(), "bean", null);
        setField(term147892, term147892.getClass(), "handler", null);
        setField(term147893, term147893.getClass(), "name", null);
        setField(term147893, term147893.getClass(), "attributes", null);
        setField(term147893, term147893.getClass(), "ownerDocument", null);
        setField(term147893, term147893.getClass(), "firstChild", null);
        setField(term147893, term147893.getClass(), "fNodeListCache", null);
        setField(term147893, term147893.getClass(), "previousSibling", null);
        setField(term147893, term147893.getClass(), "nextSibling", null);
        setField(term147893, term147893.getClass(), "ownerNode", null);
        setShortField(term147893, term147893.getClass(), "flags", (short) 0);
        setField(term147892, term147892.getClass(), "value", term147893);
        setIntField(term147892, term147892.getClass(), "index", 0);
        setBooleanField(term147892, term147892.getClass(), "attribute", false);
        setField(term147892, term147892.getClass(), "rootNode", null);
        setField(term147892, term147892.getClass(), "namespaceResolver", null);
        setField(term147892, term147892.getClass(), "parent", null);
        setField(term147892, term147892.getClass(), "locale", null);
        setField(term147891, term147891.getClass(), "parent", term147892);
        setField(term147894, term147894.getClass(), "prefix", null);
        setField(term147894, term147894.getClass(), "name", "");
        setField(term147894, term147894.getClass(), "qualifiedName", null);
        setField(term147891, term147891.getClass(), "name", term147894);
        setField(term147891, term147891.getClass(), "attributes", term147897);
        setIntField(term147891, term147891.getClass(), "position", 0);
        term147899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term147900 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term147899, term147899.getClass(), "name", null);
        setField(term147899, term147899.getClass(), "bean", null);
        setField(term147899, term147899.getClass(), "handler", null);
        setField(term147900, term147900.getClass(), "name", null);
        setField(term147900, term147900.getClass(), "attributes", null);
        setField(term147900, term147900.getClass(), "ownerDocument", null);
        setField(term147900, term147900.getClass(), "firstChild", null);
        setField(term147900, term147900.getClass(), "fNodeListCache", null);
        setField(term147900, term147900.getClass(), "previousSibling", null);
        setField(term147900, term147900.getClass(), "nextSibling", null);
        setField(term147900, term147900.getClass(), "ownerNode", null);
        setShortField(term147900, term147900.getClass(), "flags", (short) 0);
        setField(term147899, term147899.getClass(), "value", term147900);
        setIntField(term147899, term147899.getClass(), "index", 0);
        setBooleanField(term147899, term147899.getClass(), "attribute", false);
        setField(term147899, term147899.getClass(), "rootNode", null);
        setField(term147899, term147899.getClass(), "namespaceResolver", null);
        setField(term147899, term147899.getClass(), "parent", null);
        setField(term147899, term147899.getClass(), "locale", null);
        term147901 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term147901, term147901.getClass(), "prefix", null);
        setField(term147901, term147901.getClass(), "name", "");
        setField(term147901, term147901.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term147646;
        args[1] = term147804;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term147891));
        assertTrue(recursiveEquals(term147646, term147899));
        assertTrue(recursiveEquals(term147804, term147901));
    }

};


