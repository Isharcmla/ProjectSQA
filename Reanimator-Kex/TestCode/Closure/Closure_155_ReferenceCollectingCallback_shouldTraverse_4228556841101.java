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

public class ReferenceCollectingCallback_shouldTraverse_4228556841101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285109;
     Object term285201;
     Object term285293;
     Object term285801;
     Object term285802;
     Object term285803;

    public ReferenceCollectingCallback_shouldTraverse_4228556841101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285109 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term285201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term285293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term285293, term285293.getClass(), "type", 4);
        term285801 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term285801, term285801.getClass(), "referenceMap", null);
        setField(term285801, term285801.getClass(), "blockStack", null);
        setField(term285801, term285801.getClass(), "behavior", null);
        setField(term285801, term285801.getClass(), "compiler", null);
        setField(term285801, term285801.getClass(), "varFilter", null);
        term285802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285802, term285802.getClass(), "str", null);
        setIntField(term285802, term285802.getClass(), "type", 4);
        setField(term285802, term285802.getClass(), "next", null);
        setField(term285802, term285802.getClass(), "first", null);
        setField(term285802, term285802.getClass(), "last", null);
        setField(term285802, term285802.getClass(), "propListHead", null);
        setIntField(term285802, term285802.getClass(), "sourcePosition", 0);
        setField(term285802, term285802.getClass(), "jsType", null);
        setField(term285802, term285802.getClass(), "parent", null);
        term285803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term285803, term285803.getClass(), "str", null);
        setIntField(term285803, term285803.getClass(), "type", 0);
        setField(term285803, term285803.getClass(), "next", null);
        setField(term285803, term285803.getClass(), "first", null);
        setField(term285803, term285803.getClass(), "last", null);
        setField(term285803, term285803.getClass(), "propListHead", null);
        setIntField(term285803, term285803.getClass(), "sourcePosition", 0);
        setField(term285803, term285803.getClass(), "jsType", null);
        setField(term285803, term285803.getClass(), "parent", null);
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
        args[1] = term285201;
        args[2] = term285293;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term285109, args);
        assertTrue(recursiveEquals(term285109, term285801));
        assertTrue(recursiveEquals(term285201, term285803));
        assertTrue(recursiveEquals(term285293, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


