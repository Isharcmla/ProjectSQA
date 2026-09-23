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

public class DOMNodePointer_equals_1570644072113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20178;
     Object term20290;
     Object term20301;
     Object term20302;

    public DOMNodePointer_equals_1570644072113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term20290 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term20301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20301, term20301.getClass(), "node", null);
        setField(term20301, term20301.getClass(), "namespaces", null);
        setField(term20301, term20301.getClass(), "defaultNamespace", null);
        setField(term20301, term20301.getClass(), "id", null);
        setField(term20301, term20301.getClass(), "localNamespaceResolver", null);
        setIntField(term20301, term20301.getClass(), "index", 0);
        setBooleanField(term20301, term20301.getClass(), "attribute", false);
        setField(term20301, term20301.getClass(), "namespaceResolver", null);
        setField(term20301, term20301.getClass(), "rootNode", null);
        setField(term20301, term20301.getClass(), "parent", null);
        setField(term20301, term20301.getClass(), "locale", null);
        term20302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20302, term20302.getClass(), "node", null);
        setField(term20302, term20302.getClass(), "namespaces", null);
        setField(term20302, term20302.getClass(), "defaultNamespace", null);
        setField(term20302, term20302.getClass(), "id", null);
        setField(term20302, term20302.getClass(), "localNamespaceResolver", null);
        setIntField(term20302, term20302.getClass(), "index", 0);
        setBooleanField(term20302, term20302.getClass(), "attribute", false);
        setField(term20302, term20302.getClass(), "namespaceResolver", null);
        setField(term20302, term20302.getClass(), "rootNode", null);
        setField(term20302, term20302.getClass(), "parent", null);
        setField(term20302, term20302.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20290;
        Object retValue = callMethod(klass, "equals", argTypes, term20178, args);
        assertTrue(recursiveEquals(term20178, term20301));
        assertTrue(recursiveEquals(term20290, term20302));
        assertTrue(recursiveEquals(retValue, true));
    }

};


