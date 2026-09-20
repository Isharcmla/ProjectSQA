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

public class DOMNodePointer_equals_1570644072109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18002;
     Object term18114;
     Object term18125;
     Object term18126;

    public DOMNodePointer_equals_1570644072109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18125, term18125.getClass(), "node", null);
        setField(term18125, term18125.getClass(), "namespaces", null);
        setField(term18125, term18125.getClass(), "defaultNamespace", null);
        setField(term18125, term18125.getClass(), "id", null);
        setIntField(term18125, term18125.getClass(), "index", 0);
        setBooleanField(term18125, term18125.getClass(), "attribute", false);
        setField(term18125, term18125.getClass(), "rootNode", null);
        setField(term18125, term18125.getClass(), "namespaceResolver", null);
        setField(term18125, term18125.getClass(), "parent", null);
        setField(term18125, term18125.getClass(), "locale", null);
        term18126 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18126, term18126.getClass(), "node", null);
        setField(term18126, term18126.getClass(), "namespaces", null);
        setField(term18126, term18126.getClass(), "defaultNamespace", null);
        setField(term18126, term18126.getClass(), "id", null);
        setIntField(term18126, term18126.getClass(), "index", 0);
        setBooleanField(term18126, term18126.getClass(), "attribute", false);
        setField(term18126, term18126.getClass(), "rootNode", null);
        setField(term18126, term18126.getClass(), "namespaceResolver", null);
        setField(term18126, term18126.getClass(), "parent", null);
        setField(term18126, term18126.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18114;
        Object retValue = callMethod(klass, "equals", argTypes, term18002, args);
        assertTrue(recursiveEquals(term18002, term18125));
        assertTrue(recursiveEquals(term18114, term18126));
        assertTrue(recursiveEquals(retValue, true));
    }

};
