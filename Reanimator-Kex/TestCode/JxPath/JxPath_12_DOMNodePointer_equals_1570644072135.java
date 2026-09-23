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

public class DOMNodePointer_equals_1570644072135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20963;
     Object term21218;
     Object term21219;

    public DOMNodePointer_equals_1570644072135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20963 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term21218 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21218, term21218.getClass(), "node", null);
        setField(term21218, term21218.getClass(), "namespaces", null);
        setField(term21218, term21218.getClass(), "defaultNamespace", null);
        setField(term21218, term21218.getClass(), "id", null);
        setIntField(term21218, term21218.getClass(), "index", 0);
        setBooleanField(term21218, term21218.getClass(), "attribute", false);
        setField(term21218, term21218.getClass(), "rootNode", null);
        setField(term21218, term21218.getClass(), "namespaceResolver", null);
        setField(term21218, term21218.getClass(), "parent", null);
        setField(term21218, term21218.getClass(), "locale", null);
        term21219 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21219, term21219.getClass(), "node", null);
        setField(term21219, term21219.getClass(), "namespaces", null);
        setField(term21219, term21219.getClass(), "defaultNamespace", null);
        setField(term21219, term21219.getClass(), "id", null);
        setIntField(term21219, term21219.getClass(), "index", 0);
        setBooleanField(term21219, term21219.getClass(), "attribute", false);
        setField(term21219, term21219.getClass(), "rootNode", null);
        setField(term21219, term21219.getClass(), "namespaceResolver", null);
        setField(term21219, term21219.getClass(), "parent", null);
        setField(term21219, term21219.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20963;
        Object retValue = callMethod(klass, "equals", argTypes, term20963, args);
        assertTrue(recursiveEquals(term20963, term21218));
        assertTrue(recursiveEquals(term20963, term21219));
        assertTrue(recursiveEquals(retValue, true));
    }

};


