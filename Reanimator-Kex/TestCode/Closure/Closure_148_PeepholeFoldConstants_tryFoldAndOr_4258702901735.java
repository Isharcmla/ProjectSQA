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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449225;
     Object term449317;
     Object term449409;
     Object term449966;
     Object term449967;
     Object term449968;
     Object term449934;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term449317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term449317, term449317.getClass(), "parent", null);
        setIntField(term449317, term449317.getClass(), "type", 47);
        term449409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term449409, term449409.getClass(), "type", 47);
        term449966 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term449966, term449966.getClass(), "currentTraversal", null);
        term449967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term449967, term449967.getClass(), "number", 0.0);
        setIntField(term449967, term449967.getClass(), "type", 47);
        setField(term449967, term449967.getClass(), "next", null);
        setField(term449967, term449967.getClass(), "first", null);
        setField(term449967, term449967.getClass(), "last", null);
        setField(term449967, term449967.getClass(), "propListHead", null);
        setIntField(term449967, term449967.getClass(), "sourcePosition", 0);
        setField(term449967, term449967.getClass(), "jsType", null);
        setField(term449967, term449967.getClass(), "parent", null);
        term449968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term449968, term449968.getClass(), "str", null);
        setIntField(term449968, term449968.getClass(), "type", 47);
        setField(term449968, term449968.getClass(), "next", null);
        setField(term449968, term449968.getClass(), "first", null);
        setField(term449968, term449968.getClass(), "last", null);
        setField(term449968, term449968.getClass(), "propListHead", null);
        setIntField(term449968, term449968.getClass(), "sourcePosition", 0);
        setField(term449968, term449968.getClass(), "jsType", null);
        setField(term449968, term449968.getClass(), "parent", null);
        term449934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term449934, term449934.getClass(), "number", 0.0);
        setIntField(term449934, term449934.getClass(), "type", 47);
        setField(term449934, term449934.getClass(), "next", null);
        setField(term449934, term449934.getClass(), "first", null);
        setField(term449934, term449934.getClass(), "last", null);
        setField(term449934, term449934.getClass(), "propListHead", null);
        setIntField(term449934, term449934.getClass(), "sourcePosition", 0);
        setField(term449934, term449934.getClass(), "jsType", null);
        setField(term449934, term449934.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term449317;
        args[1] = term449409;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term449225, args);
        assertTrue(recursiveEquals(term449225, term449966));
        assertTrue(recursiveEquals(term449317, term449967));
        assertTrue(recursiveEquals(term449409, term449968));
        assertTrue(recursiveEquals(retValue, term449934));
    }

};


