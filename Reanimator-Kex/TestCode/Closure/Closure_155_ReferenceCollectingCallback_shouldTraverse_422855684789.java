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

public class ReferenceCollectingCallback_shouldTraverse_422855684789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203490;
     Object term203582;
     Object term203674;
     Object term203691;
     Object term203692;
     Object term203693;

    public ReferenceCollectingCallback_shouldTraverse_422855684789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203490 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term203582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term203674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term203674, term203674.getClass(), "type", 4);
        term203691 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term203691, term203691.getClass(), "referenceMap", null);
        setField(term203691, term203691.getClass(), "blockStack", null);
        setField(term203691, term203691.getClass(), "behavior", null);
        setField(term203691, term203691.getClass(), "compiler", null);
        setField(term203691, term203691.getClass(), "varFilter", null);
        term203692 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203692, term203692.getClass(), "number", 0.0);
        setIntField(term203692, term203692.getClass(), "type", 4);
        setField(term203692, term203692.getClass(), "next", null);
        setField(term203692, term203692.getClass(), "first", null);
        setField(term203692, term203692.getClass(), "last", null);
        setField(term203692, term203692.getClass(), "propListHead", null);
        setIntField(term203692, term203692.getClass(), "sourcePosition", 0);
        setField(term203692, term203692.getClass(), "jsType", null);
        setField(term203692, term203692.getClass(), "parent", null);
        term203693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203693, term203693.getClass(), "number", 0.0);
        setIntField(term203693, term203693.getClass(), "type", 0);
        setField(term203693, term203693.getClass(), "next", null);
        setField(term203693, term203693.getClass(), "first", null);
        setField(term203693, term203693.getClass(), "last", null);
        setField(term203693, term203693.getClass(), "propListHead", null);
        setIntField(term203693, term203693.getClass(), "sourcePosition", 0);
        setField(term203693, term203693.getClass(), "jsType", null);
        setField(term203693, term203693.getClass(), "parent", null);
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
        args[1] = term203582;
        args[2] = term203674;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term203490, args);
        assertTrue(recursiveEquals(term203490, term203691));
        assertTrue(recursiveEquals(term203582, term203693));
        assertTrue(recursiveEquals(term203674, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


