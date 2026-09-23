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

public class NodeUtil_mayHaveSideEffects_109682951371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29651;
     Object term29920;

    public NodeUtil_mayHaveSideEffects_109682951371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29651, term29651.getClass(), "type", 39);
        term29920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29920, term29920.getClass(), "type", 39);
        setField(term29920, term29920.getClass(), "next", null);
        setField(term29920, term29920.getClass(), "first", null);
        setField(term29920, term29920.getClass(), "last", null);
        setField(term29920, term29920.getClass(), "propListHead", null);
        setIntField(term29920, term29920.getClass(), "sourcePosition", 0);
        setField(term29920, term29920.getClass(), "jsType", null);
        setField(term29920, term29920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29651;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term29651, term29920));
    }

};


