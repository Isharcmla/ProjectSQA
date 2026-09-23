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

public class NodeUtil_mayHaveSideEffects_1029731851364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30731;
     Object term30847;

    public NodeUtil_mayHaveSideEffects_1029731851364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30731, term30731.getClass(), "type", 43);
        term30847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30847, term30847.getClass(), "type", 43);
        setField(term30847, term30847.getClass(), "next", null);
        setField(term30847, term30847.getClass(), "first", null);
        setField(term30847, term30847.getClass(), "last", null);
        setField(term30847, term30847.getClass(), "propListHead", null);
        setIntField(term30847, term30847.getClass(), "sourcePosition", 0);
        setField(term30847, term30847.getClass(), "jsType", null);
        setField(term30847, term30847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term30731;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term30731, term30847));
    }

};


