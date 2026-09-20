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

public class DOMNodePointer_equals_1570644072138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24311;
     Object term24317;
     Object term24318;

    public DOMNodePointer_equals_1570644072138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24311 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term24317 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24317, term24317.getClass(), "node", null);
        setField(term24317, term24317.getClass(), "namespaces", null);
        setField(term24317, term24317.getClass(), "defaultNamespace", null);
        setField(term24317, term24317.getClass(), "id", null);
        setIntField(term24317, term24317.getClass(), "index", 0);
        setBooleanField(term24317, term24317.getClass(), "attribute", false);
        setField(term24317, term24317.getClass(), "rootNode", null);
        setField(term24317, term24317.getClass(), "namespaceResolver", null);
        setField(term24317, term24317.getClass(), "parent", null);
        setField(term24317, term24317.getClass(), "locale", null);
        term24318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24318, term24318.getClass(), "node", null);
        setField(term24318, term24318.getClass(), "namespaces", null);
        setField(term24318, term24318.getClass(), "defaultNamespace", null);
        setField(term24318, term24318.getClass(), "id", null);
        setIntField(term24318, term24318.getClass(), "index", 0);
        setBooleanField(term24318, term24318.getClass(), "attribute", false);
        setField(term24318, term24318.getClass(), "rootNode", null);
        setField(term24318, term24318.getClass(), "namespaceResolver", null);
        setField(term24318, term24318.getClass(), "parent", null);
        setField(term24318, term24318.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24311;
        Object retValue = callMethod(klass, "equals", argTypes, term24311, args);
        assertTrue(recursiveEquals(term24311, term24317));
        assertTrue(recursiveEquals(term24311, term24318));
        assertTrue(recursiveEquals(retValue, true));
    }

};
