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

public class DOMNodePointer_equals_1570644072147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28329;
     Object term28361;
     Object term28362;

    public DOMNodePointer_equals_1570644072147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28329 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term28361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term28361, term28361.getClass(), "node", null);
        setField(term28361, term28361.getClass(), "namespaces", null);
        setField(term28361, term28361.getClass(), "defaultNamespace", null);
        setField(term28361, term28361.getClass(), "id", null);
        setIntField(term28361, term28361.getClass(), "index", 0);
        setBooleanField(term28361, term28361.getClass(), "attribute", false);
        setField(term28361, term28361.getClass(), "rootNode", null);
        setField(term28361, term28361.getClass(), "namespaceResolver", null);
        setField(term28361, term28361.getClass(), "parent", null);
        setField(term28361, term28361.getClass(), "locale", null);
        term28362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term28362, term28362.getClass(), "node", null);
        setField(term28362, term28362.getClass(), "namespaces", null);
        setField(term28362, term28362.getClass(), "defaultNamespace", null);
        setField(term28362, term28362.getClass(), "id", null);
        setIntField(term28362, term28362.getClass(), "index", 0);
        setBooleanField(term28362, term28362.getClass(), "attribute", false);
        setField(term28362, term28362.getClass(), "rootNode", null);
        setField(term28362, term28362.getClass(), "namespaceResolver", null);
        setField(term28362, term28362.getClass(), "parent", null);
        setField(term28362, term28362.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28329;
        Object retValue = callMethod(klass, "equals", argTypes, term28329, args);
        assertTrue(recursiveEquals(term28329, term28361));
        assertTrue(recursiveEquals(term28329, term28362));
        assertTrue(recursiveEquals(retValue, true));
    }

};


