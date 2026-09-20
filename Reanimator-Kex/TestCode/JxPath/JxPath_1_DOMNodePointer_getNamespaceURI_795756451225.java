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

public class DOMNodePointer_getNamespaceURI_795756451225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53466;
     Object term53519;

    public DOMNodePointer_getNamespaceURI_795756451225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53466 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term53466, term53466.getClass(), "defaultNamespace", null);
        setField(term53466, term53466.getClass(), "node", null);
        term53519 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term53519, term53519.getClass(), "node", null);
        setField(term53519, term53519.getClass(), "namespaces", null);
        setField(term53519, term53519.getClass(), "defaultNamespace", "");
        setField(term53519, term53519.getClass(), "id", null);
        setIntField(term53519, term53519.getClass(), "index", 0);
        setBooleanField(term53519, term53519.getClass(), "attribute", false);
        setField(term53519, term53519.getClass(), "rootNode", null);
        setField(term53519, term53519.getClass(), "namespaceResolver", null);
        setField(term53519, term53519.getClass(), "parent", null);
        setField(term53519, term53519.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term53466, args);
        assertTrue(recursiveEquals(term53466, term53519));
        assertTrue(recursiveEquals(retValue, null));
    }

};
