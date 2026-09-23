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

public class DOMNodePointer_equals_1570644072128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20072;
     Object term20184;
     Object term20390;
     Object term20391;

    public DOMNodePointer_equals_1570644072128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term20184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term20390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20390, term20390.getClass(), "node", null);
        setField(term20390, term20390.getClass(), "namespaces", null);
        setField(term20390, term20390.getClass(), "defaultNamespace", null);
        setField(term20390, term20390.getClass(), "id", null);
        setIntField(term20390, term20390.getClass(), "index", 0);
        setBooleanField(term20390, term20390.getClass(), "attribute", false);
        setField(term20390, term20390.getClass(), "rootNode", null);
        setField(term20390, term20390.getClass(), "namespaceResolver", null);
        setField(term20390, term20390.getClass(), "parent", null);
        setField(term20390, term20390.getClass(), "locale", null);
        term20391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20391, term20391.getClass(), "node", null);
        setField(term20391, term20391.getClass(), "namespaces", null);
        setField(term20391, term20391.getClass(), "defaultNamespace", null);
        setField(term20391, term20391.getClass(), "id", null);
        setIntField(term20391, term20391.getClass(), "index", 0);
        setBooleanField(term20391, term20391.getClass(), "attribute", false);
        setField(term20391, term20391.getClass(), "rootNode", null);
        setField(term20391, term20391.getClass(), "namespaceResolver", null);
        setField(term20391, term20391.getClass(), "parent", null);
        setField(term20391, term20391.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20184;
        Object retValue = callMethod(klass, "equals", argTypes, term20072, args);
        assertTrue(recursiveEquals(term20072, term20390));
        assertTrue(recursiveEquals(term20184, term20391));
        assertTrue(recursiveEquals(retValue, true));
    }

};


