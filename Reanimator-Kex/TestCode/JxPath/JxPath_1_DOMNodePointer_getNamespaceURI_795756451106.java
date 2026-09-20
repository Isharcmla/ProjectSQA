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

public class DOMNodePointer_getNamespaceURI_795756451106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17412;
     Object term17558;

    public DOMNodePointer_getNamespaceURI_795756451106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17412, term17412.getClass(), "namespaces", null);
        HashMap term17559 = new HashMap();
        term17558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17558, term17558.getClass(), "node", null);
        setField(term17558, term17558.getClass(), "namespaces", term17559);
        setField(term17558, term17558.getClass(), "defaultNamespace", null);
        setField(term17558, term17558.getClass(), "id", null);
        setIntField(term17558, term17558.getClass(), "index", 0);
        setBooleanField(term17558, term17558.getClass(), "attribute", false);
        setField(term17558, term17558.getClass(), "rootNode", null);
        setField(term17558, term17558.getClass(), "namespaceResolver", null);
        setField(term17558, term17558.getClass(), "parent", null);
        setField(term17558, term17558.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term17412, args);
        assertTrue(recursiveEquals(term17412, term17558));
        assertTrue(recursiveEquals(retValue, null));
    }

};
