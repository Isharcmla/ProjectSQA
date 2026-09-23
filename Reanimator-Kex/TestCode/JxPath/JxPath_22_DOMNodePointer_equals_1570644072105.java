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

public class DOMNodePointer_equals_1570644072105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15901;
     Object term16013;
     Object term18185;
     Object term18186;

    public DOMNodePointer_equals_1570644072105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15901 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term16013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18185, term18185.getClass(), "node", null);
        setField(term18185, term18185.getClass(), "namespaces", null);
        setField(term18185, term18185.getClass(), "defaultNamespace", null);
        setField(term18185, term18185.getClass(), "id", null);
        setField(term18185, term18185.getClass(), "localNamespaceResolver", null);
        setIntField(term18185, term18185.getClass(), "index", 0);
        setBooleanField(term18185, term18185.getClass(), "attribute", false);
        setField(term18185, term18185.getClass(), "namespaceResolver", null);
        setField(term18185, term18185.getClass(), "exceptionHandler", null);
        setField(term18185, term18185.getClass(), "rootNode", null);
        setField(term18185, term18185.getClass(), "parent", null);
        setField(term18185, term18185.getClass(), "locale", null);
        term18186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18186, term18186.getClass(), "node", null);
        setField(term18186, term18186.getClass(), "namespaces", null);
        setField(term18186, term18186.getClass(), "defaultNamespace", null);
        setField(term18186, term18186.getClass(), "id", null);
        setField(term18186, term18186.getClass(), "localNamespaceResolver", null);
        setIntField(term18186, term18186.getClass(), "index", 0);
        setBooleanField(term18186, term18186.getClass(), "attribute", false);
        setField(term18186, term18186.getClass(), "namespaceResolver", null);
        setField(term18186, term18186.getClass(), "exceptionHandler", null);
        setField(term18186, term18186.getClass(), "rootNode", null);
        setField(term18186, term18186.getClass(), "parent", null);
        setField(term18186, term18186.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16013;
        Object retValue = callMethod(klass, "equals", argTypes, term15901, args);
        assertTrue(recursiveEquals(term15901, term18185));
        assertTrue(recursiveEquals(term16013, term18186));
        assertTrue(recursiveEquals(retValue, true));
    }

};


