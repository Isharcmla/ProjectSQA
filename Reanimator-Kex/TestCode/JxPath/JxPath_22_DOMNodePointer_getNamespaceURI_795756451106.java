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

public class DOMNodePointer_getNamespaceURI_795756451106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16258;
     Object term18233;

    public DOMNodePointer_getNamespaceURI_795756451106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18233, term18233.getClass(), "node", null);
        setField(term18233, term18233.getClass(), "namespaces", null);
        setField(term18233, term18233.getClass(), "defaultNamespace", null);
        setField(term18233, term18233.getClass(), "id", null);
        setField(term18233, term18233.getClass(), "localNamespaceResolver", null);
        setIntField(term18233, term18233.getClass(), "index", 0);
        setBooleanField(term18233, term18233.getClass(), "attribute", false);
        setField(term18233, term18233.getClass(), "namespaceResolver", null);
        setField(term18233, term18233.getClass(), "exceptionHandler", null);
        setField(term18233, term18233.getClass(), "rootNode", null);
        setField(term18233, term18233.getClass(), "parent", null);
        setField(term18233, term18233.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xmlns";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term16258, args);
        assertTrue(recursiveEquals(term16258, term18233));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/2000/xmlns/"));
    }

};


