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

public class DOMNodePointer_escape_525200669145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23493;
     Object term23541;

    public DOMNodePointer_escape_525200669145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23493 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term23541 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term23541, term23541.getClass(), "node", null);
        setField(term23541, term23541.getClass(), "namespaces", null);
        setField(term23541, term23541.getClass(), "defaultNamespace", null);
        setField(term23541, term23541.getClass(), "id", null);
        setIntField(term23541, term23541.getClass(), "index", 0);
        setBooleanField(term23541, term23541.getClass(), "attribute", false);
        setField(term23541, term23541.getClass(), "rootNode", null);
        setField(term23541, term23541.getClass(), "namespaceResolver", null);
        setField(term23541, term23541.getClass(), "parent", null);
        setField(term23541, term23541.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term23493, args);
        assertTrue(recursiveEquals(term23493, term23541));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


