package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ReferenceCollectingCallback_shouldTraverse_422855684206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38845;
     Object term38937;
     Object term39029;
     Object term39267;
     Object term39268;
     Object term39269;

    public ReferenceCollectingCallback_shouldTraverse_422855684206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38845 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term38937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term39029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term39029, term39029.getClass(), "type", 12);
        term39267 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term39267, term39267.getClass(), "referenceMap", null);
        setField(term39267, term39267.getClass(), "blockStack", null);
        setField(term39267, term39267.getClass(), "behavior", null);
        setField(term39267, term39267.getClass(), "compiler", null);
        setField(term39267, term39267.getClass(), "varFilter", null);
        term39268 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39268, term39268.getClass(), "number", 0.0);
        setIntField(term39268, term39268.getClass(), "type", 12);
        setField(term39268, term39268.getClass(), "next", null);
        setField(term39268, term39268.getClass(), "first", null);
        setField(term39268, term39268.getClass(), "last", null);
        setField(term39268, term39268.getClass(), "propListHead", null);
        setIntField(term39268, term39268.getClass(), "sourcePosition", 0);
        setField(term39268, term39268.getClass(), "jsType", null);
        setField(term39268, term39268.getClass(), "parent", null);
        term39269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term39269, term39269.getClass(), "str", null);
        setIntField(term39269, term39269.getClass(), "type", 0);
        setField(term39269, term39269.getClass(), "next", null);
        setField(term39269, term39269.getClass(), "first", null);
        setField(term39269, term39269.getClass(), "last", null);
        setField(term39269, term39269.getClass(), "propListHead", null);
        setIntField(term39269, term39269.getClass(), "sourcePosition", 0);
        setField(term39269, term39269.getClass(), "jsType", null);
        setField(term39269, term39269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term38937;
        args[2] = term39029;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term38845, args);
        assertTrue(recursiveEquals(term38845, term39267));
        assertTrue(recursiveEquals(term38937, term39269));
        assertTrue(recursiveEquals(term39029, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


