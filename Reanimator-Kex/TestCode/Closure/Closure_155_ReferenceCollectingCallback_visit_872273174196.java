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

public class ReferenceCollectingCallback_visit_872273174196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45979;
     Object term46154;
     Object term46119;
     Object term46446;
     Object term46447;
     Object term46448;

    public ReferenceCollectingCallback_visit_872273174196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45979 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term46154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46154, term46154.getClass(), "type", 108);
        term46119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46119, term46119.getClass(), "type", 108);
        setField(term46119, term46119.getClass(), "first", term46154);
        term46446 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term46446, term46446.getClass(), "referenceMap", null);
        setField(term46446, term46446.getClass(), "blockStack", null);
        setField(term46446, term46446.getClass(), "behavior", null);
        setField(term46446, term46446.getClass(), "compiler", null);
        setField(term46446, term46446.getClass(), "varFilter", null);
        term46447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46447, term46447.getClass(), "type", 108);
        setField(term46447, term46447.getClass(), "next", null);
        setField(term46447, term46447.getClass(), "first", null);
        setField(term46447, term46447.getClass(), "last", null);
        setField(term46447, term46447.getClass(), "propListHead", null);
        setIntField(term46447, term46447.getClass(), "sourcePosition", 0);
        setField(term46447, term46447.getClass(), "jsType", null);
        setField(term46447, term46447.getClass(), "parent", null);
        term46448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46448, term46448.getClass(), "type", 108);
        setField(term46448, term46448.getClass(), "next", null);
        setIntField(term46449, term46449.getClass(), "type", 108);
        setField(term46449, term46449.getClass(), "next", null);
        setField(term46449, term46449.getClass(), "first", null);
        setField(term46449, term46449.getClass(), "last", null);
        setField(term46449, term46449.getClass(), "propListHead", null);
        setIntField(term46449, term46449.getClass(), "sourcePosition", 0);
        setField(term46449, term46449.getClass(), "jsType", null);
        setField(term46449, term46449.getClass(), "parent", null);
        setField(term46448, term46448.getClass(), "first", term46449);
        setField(term46448, term46448.getClass(), "last", null);
        setField(term46448, term46448.getClass(), "propListHead", null);
        setIntField(term46448, term46448.getClass(), "sourcePosition", 0);
        setField(term46448, term46448.getClass(), "jsType", null);
        setField(term46448, term46448.getClass(), "parent", null);
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
        args[1] = term46154;
        args[2] = term46119;
        callMethod(klass, "visit", argTypes, term45979, args);
        assertTrue(recursiveEquals(term45979, term46446));
        assertTrue(recursiveEquals(term46154, term46448));
        assertTrue(recursiveEquals(term46119, null));
    }

};


