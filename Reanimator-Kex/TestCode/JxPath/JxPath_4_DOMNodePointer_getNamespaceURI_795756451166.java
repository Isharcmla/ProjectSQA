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

public class DOMNodePointer_getNamespaceURI_795756451166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31757;
     Object term32211;

    public DOMNodePointer_getNamespaceURI_795756451166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31805 = new HashMap();
        ((HashMap) term31805).put(" ", " ");
        term31757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term31757, term31757.getClass(), "namespaces", term31805);
        HashMap term32212 = new HashMap();
        term32211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term32211, term32211.getClass(), "node", null);
        setField(term32211, term32211.getClass(), "namespaces", term32212);
        setField(term32211, term32211.getClass(), "defaultNamespace", null);
        setField(term32211, term32211.getClass(), "id", null);
        setIntField(term32211, term32211.getClass(), "index", 0);
        setBooleanField(term32211, term32211.getClass(), "attribute", false);
        setField(term32211, term32211.getClass(), "rootNode", null);
        setField(term32211, term32211.getClass(), "namespaceResolver", null);
        setField(term32211, term32211.getClass(), "parent", null);
        setField(term32211, term32211.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term31757, args);
        assertTrue(recursiveEquals(term31757, term32211));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


