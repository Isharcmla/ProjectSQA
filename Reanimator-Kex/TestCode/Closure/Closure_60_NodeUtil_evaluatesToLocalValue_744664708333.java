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

public class NodeUtil_evaluatesToLocalValue_744664708333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28174;
     Object term28235;

    public NodeUtil_evaluatesToLocalValue_744664708333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28174, term28174.getClass(), "type", 31);
        term28235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28235, term28235.getClass(), "type", 31);
        setField(term28235, term28235.getClass(), "next", null);
        setField(term28235, term28235.getClass(), "first", null);
        setField(term28235, term28235.getClass(), "last", null);
        setField(term28235, term28235.getClass(), "propListHead", null);
        setIntField(term28235, term28235.getClass(), "sourcePosition", 0);
        setField(term28235, term28235.getClass(), "jsType", null);
        setField(term28235, term28235.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28174;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28174, term28235));
    }

};


