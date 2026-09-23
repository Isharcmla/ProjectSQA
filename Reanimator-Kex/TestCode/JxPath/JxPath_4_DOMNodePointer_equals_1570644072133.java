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

public class DOMNodePointer_equals_1570644072133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24111;
     Object term24223;
     Object term24247;
     Object term24248;

    public DOMNodePointer_equals_1570644072133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24111 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term24223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term24247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24247, term24247.getClass(), "node", null);
        setField(term24247, term24247.getClass(), "namespaces", null);
        setField(term24247, term24247.getClass(), "defaultNamespace", null);
        setField(term24247, term24247.getClass(), "id", null);
        setIntField(term24247, term24247.getClass(), "index", 0);
        setBooleanField(term24247, term24247.getClass(), "attribute", false);
        setField(term24247, term24247.getClass(), "rootNode", null);
        setField(term24247, term24247.getClass(), "namespaceResolver", null);
        setField(term24247, term24247.getClass(), "parent", null);
        setField(term24247, term24247.getClass(), "locale", null);
        term24248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24248, term24248.getClass(), "node", null);
        setField(term24248, term24248.getClass(), "namespaces", null);
        setField(term24248, term24248.getClass(), "defaultNamespace", null);
        setField(term24248, term24248.getClass(), "id", null);
        setIntField(term24248, term24248.getClass(), "index", 0);
        setBooleanField(term24248, term24248.getClass(), "attribute", false);
        setField(term24248, term24248.getClass(), "rootNode", null);
        setField(term24248, term24248.getClass(), "namespaceResolver", null);
        setField(term24248, term24248.getClass(), "parent", null);
        setField(term24248, term24248.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24223;
        Object retValue = callMethod(klass, "equals", argTypes, term24111, args);
        assertTrue(recursiveEquals(term24111, term24247));
        assertTrue(recursiveEquals(term24223, term24248));
        assertTrue(recursiveEquals(retValue, true));
    }

};


