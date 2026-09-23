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

public class NodeUtil_mayHaveSideEffects_109682951463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60907;
     Object term60924;

    public NodeUtil_mayHaveSideEffects_109682951463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60907, term60907.getClass(), "type", 84);
        term60924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60924, term60924.getClass(), "type", 84);
        setField(term60924, term60924.getClass(), "next", null);
        setField(term60924, term60924.getClass(), "first", null);
        setField(term60924, term60924.getClass(), "last", null);
        setField(term60924, term60924.getClass(), "propListHead", null);
        setIntField(term60924, term60924.getClass(), "sourcePosition", 0);
        setField(term60924, term60924.getClass(), "jsType", null);
        setField(term60924, term60924.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term60907;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term60907, term60924));
    }

};


