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

public class DOMNodePointer_getNamespaceURI_795756451118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19438;
     Object term20375;

    public DOMNodePointer_getNamespaceURI_795756451118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19438, term19438.getClass(), "namespaces", null);
        HashMap term20376 = new HashMap();
        term20375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20375, term20375.getClass(), "node", null);
        setField(term20375, term20375.getClass(), "namespaces", term20376);
        setField(term20375, term20375.getClass(), "defaultNamespace", null);
        setField(term20375, term20375.getClass(), "id", null);
        setField(term20375, term20375.getClass(), "localNamespaceResolver", null);
        setIntField(term20375, term20375.getClass(), "index", 0);
        setBooleanField(term20375, term20375.getClass(), "attribute", false);
        setField(term20375, term20375.getClass(), "namespaceResolver", null);
        setField(term20375, term20375.getClass(), "exceptionHandler", null);
        setField(term20375, term20375.getClass(), "rootNode", null);
        setField(term20375, term20375.getClass(), "parent", null);
        setField(term20375, term20375.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term19438, args);
        assertTrue(recursiveEquals(term19438, term20375));
        assertTrue(recursiveEquals(retValue, null));
    }

};


