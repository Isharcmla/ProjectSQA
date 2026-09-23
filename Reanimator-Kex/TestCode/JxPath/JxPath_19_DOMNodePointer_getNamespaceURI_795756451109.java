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

public class DOMNodePointer_getNamespaceURI_795756451109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18498;
     Object term19226;

    public DOMNodePointer_getNamespaceURI_795756451109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18498 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18498, term18498.getClass(), "namespaces", null);
        HashMap term19227 = new HashMap();
        term19226 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19226, term19226.getClass(), "node", null);
        setField(term19226, term19226.getClass(), "namespaces", term19227);
        setField(term19226, term19226.getClass(), "defaultNamespace", null);
        setField(term19226, term19226.getClass(), "id", null);
        setField(term19226, term19226.getClass(), "localNamespaceResolver", null);
        setIntField(term19226, term19226.getClass(), "index", 0);
        setBooleanField(term19226, term19226.getClass(), "attribute", false);
        setField(term19226, term19226.getClass(), "namespaceResolver", null);
        setField(term19226, term19226.getClass(), "rootNode", null);
        setField(term19226, term19226.getClass(), "parent", null);
        setField(term19226, term19226.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term18498, args);
        assertTrue(recursiveEquals(term18498, term19226));
        assertTrue(recursiveEquals(retValue, null));
    }

};


