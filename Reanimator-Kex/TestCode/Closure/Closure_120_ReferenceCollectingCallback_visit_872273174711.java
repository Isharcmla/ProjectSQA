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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252426;
     Object term252656;
     Object term252610;
     Object term252678;
     Object term252679;
     Object term252680;

    public ReferenceCollectingCallback_visit_872273174711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252426 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term252656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term252656, term252656.getClass(), "type", 98);
        term252610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term252610, term252610.getClass(), "type", 98);
        setField(term252610, term252610.getClass(), "first", term252656);
        term252678 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term252678, term252678.getClass(), "referenceMap", null);
        setField(term252678, term252678.getClass(), "blockStack", null);
        setField(term252678, term252678.getClass(), "behavior", null);
        setField(term252678, term252678.getClass(), "compiler", null);
        setField(term252678, term252678.getClass(), "varFilter", null);
        term252679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term252679, term252679.getClass(), "number", 0.0);
        setIntField(term252679, term252679.getClass(), "type", 98);
        setField(term252679, term252679.getClass(), "next", null);
        setField(term252679, term252679.getClass(), "first", null);
        setField(term252679, term252679.getClass(), "last", null);
        setField(term252679, term252679.getClass(), "propListHead", null);
        setIntField(term252679, term252679.getClass(), "sourcePosition", 0);
        setField(term252679, term252679.getClass(), "jsType", null);
        setField(term252679, term252679.getClass(), "parent", null);
        term252680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term252680, term252680.getClass(), "str", null);
        setIntField(term252680, term252680.getClass(), "type", 98);
        setField(term252680, term252680.getClass(), "next", null);
        setDoubleField(term252681, term252681.getClass(), "number", 0.0);
        setIntField(term252681, term252681.getClass(), "type", 98);
        setField(term252681, term252681.getClass(), "next", null);
        setField(term252681, term252681.getClass(), "first", null);
        setField(term252681, term252681.getClass(), "last", null);
        setField(term252681, term252681.getClass(), "propListHead", null);
        setIntField(term252681, term252681.getClass(), "sourcePosition", 0);
        setField(term252681, term252681.getClass(), "jsType", null);
        setField(term252681, term252681.getClass(), "parent", null);
        setField(term252680, term252680.getClass(), "first", term252681);
        setField(term252680, term252680.getClass(), "last", null);
        setField(term252680, term252680.getClass(), "propListHead", null);
        setIntField(term252680, term252680.getClass(), "sourcePosition", 0);
        setField(term252680, term252680.getClass(), "jsType", null);
        setField(term252680, term252680.getClass(), "parent", null);
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
        args[1] = term252656;
        args[2] = term252610;
        callMethod(klass, "visit", argTypes, term252426, args);
        assertTrue(recursiveEquals(term252426, term252678));
        assertTrue(recursiveEquals(term252656, term252680));
        assertTrue(recursiveEquals(term252610, null));
    }

};


