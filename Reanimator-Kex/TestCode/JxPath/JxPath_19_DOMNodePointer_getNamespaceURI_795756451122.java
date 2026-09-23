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

public class DOMNodePointer_getNamespaceURI_795756451122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23231;
     Object term23914;

    public DOMNodePointer_getNamespaceURI_795756451122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23279 = new HashMap();
        ((HashMap) term23279).put(" ", " ");
        term23231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term23231, term23231.getClass(), "namespaces", term23279);
        HashMap term23915 = new HashMap();
        term23914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term23914, term23914.getClass(), "node", null);
        setField(term23914, term23914.getClass(), "namespaces", term23915);
        setField(term23914, term23914.getClass(), "defaultNamespace", null);
        setField(term23914, term23914.getClass(), "id", null);
        setField(term23914, term23914.getClass(), "localNamespaceResolver", null);
        setIntField(term23914, term23914.getClass(), "index", 0);
        setBooleanField(term23914, term23914.getClass(), "attribute", false);
        setField(term23914, term23914.getClass(), "namespaceResolver", null);
        setField(term23914, term23914.getClass(), "rootNode", null);
        setField(term23914, term23914.getClass(), "parent", null);
        setField(term23914, term23914.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term23231, args);
        assertTrue(recursiveEquals(term23231, term23914));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


