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

public class DOMNodePointer_getNamespaceURI_795756451187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36319;
     Object term36665;

    public DOMNodePointer_getNamespaceURI_795756451187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term36319, term36319.getClass(), "namespaces", null);
        setField(term36319, term36319.getClass(), "node", null);
        HashMap term36666 = new HashMap();
        term36665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term36665, term36665.getClass(), "node", null);
        setField(term36665, term36665.getClass(), "namespaces", term36666);
        setField(term36665, term36665.getClass(), "defaultNamespace", null);
        setField(term36665, term36665.getClass(), "id", null);
        setIntField(term36665, term36665.getClass(), "index", 0);
        setBooleanField(term36665, term36665.getClass(), "attribute", false);
        setField(term36665, term36665.getClass(), "rootNode", null);
        setField(term36665, term36665.getClass(), "namespaceResolver", null);
        setField(term36665, term36665.getClass(), "parent", null);
        setField(term36665, term36665.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xmlns:";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term36319, args);
        assertTrue(recursiveEquals(term36319, term36665));
        assertTrue(recursiveEquals(retValue, null));
    }

};
