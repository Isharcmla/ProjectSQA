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

public class ReferenceCollectingCallback_visit_872273174479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119279;
     Object term119509;
     Object term119463;
     Object term119893;
     Object term119894;
     Object term119895;

    public ReferenceCollectingCallback_visit_872273174479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119279 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term119509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term119509, term119509.getClass(), "type", 101);
        term119463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term119463, term119463.getClass(), "type", 101);
        setField(term119463, term119463.getClass(), "first", term119509);
        term119893 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term119893, term119893.getClass(), "referenceMap", null);
        setField(term119893, term119893.getClass(), "blockStack", null);
        setField(term119893, term119893.getClass(), "behavior", null);
        setField(term119893, term119893.getClass(), "compiler", null);
        setField(term119893, term119893.getClass(), "varFilter", null);
        term119894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term119894, term119894.getClass(), "str", null);
        setIntField(term119894, term119894.getClass(), "type", 101);
        setField(term119894, term119894.getClass(), "next", null);
        setField(term119894, term119894.getClass(), "first", null);
        setField(term119894, term119894.getClass(), "last", null);
        setField(term119894, term119894.getClass(), "propListHead", null);
        setIntField(term119894, term119894.getClass(), "sourcePosition", 0);
        setField(term119894, term119894.getClass(), "jsType", null);
        setField(term119894, term119894.getClass(), "parent", null);
        term119895 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119896 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term119895, term119895.getClass(), "str", null);
        setIntField(term119895, term119895.getClass(), "type", 101);
        setField(term119895, term119895.getClass(), "next", null);
        setField(term119896, term119896.getClass(), "str", null);
        setIntField(term119896, term119896.getClass(), "type", 101);
        setField(term119896, term119896.getClass(), "next", null);
        setField(term119896, term119896.getClass(), "first", null);
        setField(term119896, term119896.getClass(), "last", null);
        setField(term119896, term119896.getClass(), "propListHead", null);
        setIntField(term119896, term119896.getClass(), "sourcePosition", 0);
        setField(term119896, term119896.getClass(), "jsType", null);
        setField(term119896, term119896.getClass(), "parent", null);
        setField(term119895, term119895.getClass(), "first", term119896);
        setField(term119895, term119895.getClass(), "last", null);
        setField(term119895, term119895.getClass(), "propListHead", null);
        setIntField(term119895, term119895.getClass(), "sourcePosition", 0);
        setField(term119895, term119895.getClass(), "jsType", null);
        setField(term119895, term119895.getClass(), "parent", null);
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
        args[1] = term119509;
        args[2] = term119463;
        callMethod(klass, "visit", argTypes, term119279, args);
        assertTrue(recursiveEquals(term119279, term119893));
        assertTrue(recursiveEquals(term119509, term119895));
        assertTrue(recursiveEquals(term119463, null));
    }

};


