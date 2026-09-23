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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30923;
     Object term31311;

    public DOMNodePointer_getNamespaceURI_795756451162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term30923, term30923.getClass(), "namespaces", null);
        HashMap term31312 = new HashMap();
        term31311 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term31311, term31311.getClass(), "node", null);
        setField(term31311, term31311.getClass(), "namespaces", term31312);
        setField(term31311, term31311.getClass(), "defaultNamespace", null);
        setField(term31311, term31311.getClass(), "id", null);
        setIntField(term31311, term31311.getClass(), "index", 0);
        setBooleanField(term31311, term31311.getClass(), "attribute", false);
        setField(term31311, term31311.getClass(), "rootNode", null);
        setField(term31311, term31311.getClass(), "namespaceResolver", null);
        setField(term31311, term31311.getClass(), "parent", null);
        setField(term31311, term31311.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term30923, args);
        assertTrue(recursiveEquals(term30923, term31311));
        assertTrue(recursiveEquals(retValue, null));
    }

};


