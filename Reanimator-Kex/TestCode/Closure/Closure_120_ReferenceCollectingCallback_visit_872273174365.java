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

public class ReferenceCollectingCallback_visit_872273174365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81292;
     Object term81522;
     Object term81476;
     Object term81929;
     Object term81930;
     Object term81931;

    public ReferenceCollectingCallback_visit_872273174365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81292 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term81522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term81522, term81522.getClass(), "type", 108);
        term81476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term81476, term81476.getClass(), "type", 108);
        setField(term81476, term81476.getClass(), "first", term81522);
        term81929 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term81929, term81929.getClass(), "referenceMap", null);
        setField(term81929, term81929.getClass(), "blockStack", null);
        setField(term81929, term81929.getClass(), "behavior", null);
        setField(term81929, term81929.getClass(), "compiler", null);
        setField(term81929, term81929.getClass(), "varFilter", null);
        term81930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81930, term81930.getClass(), "str", null);
        setIntField(term81930, term81930.getClass(), "type", 108);
        setField(term81930, term81930.getClass(), "next", null);
        setField(term81930, term81930.getClass(), "first", null);
        setField(term81930, term81930.getClass(), "last", null);
        setField(term81930, term81930.getClass(), "propListHead", null);
        setIntField(term81930, term81930.getClass(), "sourcePosition", 0);
        setField(term81930, term81930.getClass(), "jsType", null);
        setField(term81930, term81930.getClass(), "parent", null);
        term81931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81931, term81931.getClass(), "str", null);
        setIntField(term81931, term81931.getClass(), "type", 108);
        setField(term81931, term81931.getClass(), "next", null);
        setField(term81932, term81932.getClass(), "str", null);
        setIntField(term81932, term81932.getClass(), "type", 108);
        setField(term81932, term81932.getClass(), "next", null);
        setField(term81932, term81932.getClass(), "first", null);
        setField(term81932, term81932.getClass(), "last", null);
        setField(term81932, term81932.getClass(), "propListHead", null);
        setIntField(term81932, term81932.getClass(), "sourcePosition", 0);
        setField(term81932, term81932.getClass(), "jsType", null);
        setField(term81932, term81932.getClass(), "parent", null);
        setField(term81931, term81931.getClass(), "first", term81932);
        setField(term81931, term81931.getClass(), "last", null);
        setField(term81931, term81931.getClass(), "propListHead", null);
        setIntField(term81931, term81931.getClass(), "sourcePosition", 0);
        setField(term81931, term81931.getClass(), "jsType", null);
        setField(term81931, term81931.getClass(), "parent", null);
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
        args[1] = term81522;
        args[2] = term81476;
        callMethod(klass, "visit", argTypes, term81292, args);
        assertTrue(recursiveEquals(term81292, term81929));
        assertTrue(recursiveEquals(term81522, term81931));
        assertTrue(recursiveEquals(term81476, null));
    }

};


