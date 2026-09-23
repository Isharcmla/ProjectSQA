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

public class FoldConstants_tryFoldBlock_1167048042227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59239;
     Object term59309;
     Object term59919;
     Object term59920;

    public FoldConstants_tryFoldBlock_1167048042227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59239 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term59309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59379, term59379.getClass(), "next", term59309);
        setIntField(term59379, term59379.getClass(), "type", 31);
        setField(term59309, term59309.getClass(), "first", term59379);
        setField(term59309, term59309.getClass(), "next", term59449);
        setIntField(term59309, term59309.getClass(), "type", 113);
        term59919 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term59919, term59919.getClass(), "compiler", null);
        term59920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59920, term59920.getClass(), "type", 113);
        setIntField(term59921, term59921.getClass(), "type", 0);
        setField(term59921, term59921.getClass(), "next", null);
        setField(term59921, term59921.getClass(), "first", null);
        setField(term59921, term59921.getClass(), "last", null);
        setField(term59921, term59921.getClass(), "propListHead", null);
        setIntField(term59921, term59921.getClass(), "sourcePosition", 0);
        setField(term59921, term59921.getClass(), "jsType", null);
        setField(term59921, term59921.getClass(), "parent", null);
        setField(term59920, term59920.getClass(), "next", term59921);
        setIntField(term59922, term59922.getClass(), "type", 31);
        setField(term59922, term59922.getClass(), "next", term59920);
        setField(term59922, term59922.getClass(), "first", null);
        setField(term59922, term59922.getClass(), "last", null);
        setField(term59922, term59922.getClass(), "propListHead", null);
        setIntField(term59922, term59922.getClass(), "sourcePosition", 0);
        setField(term59922, term59922.getClass(), "jsType", null);
        setField(term59922, term59922.getClass(), "parent", null);
        setField(term59920, term59920.getClass(), "first", term59922);
        setField(term59920, term59920.getClass(), "last", null);
        setField(term59920, term59920.getClass(), "propListHead", null);
        setIntField(term59920, term59920.getClass(), "sourcePosition", 0);
        setField(term59920, term59920.getClass(), "jsType", null);
        setField(term59920, term59920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term59309;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term59239, args);
        assertTrue(recursiveEquals(term59239, term59919));
        assertTrue(recursiveEquals(term59309, null));
    }

};


