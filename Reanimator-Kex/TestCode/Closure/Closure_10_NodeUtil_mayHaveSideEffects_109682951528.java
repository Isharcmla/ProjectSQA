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

public class NodeUtil_mayHaveSideEffects_109682951528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570743;
     Object term571107;

    public NodeUtil_mayHaveSideEffects_109682951528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term570743, term570743.getClass(), "type", 71);
        term571107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term571107, term571107.getClass(), "type", 71);
        setField(term571107, term571107.getClass(), "next", null);
        setField(term571107, term571107.getClass(), "first", null);
        setField(term571107, term571107.getClass(), "last", null);
        setField(term571107, term571107.getClass(), "propListHead", null);
        setIntField(term571107, term571107.getClass(), "sourcePosition", 0);
        setField(term571107, term571107.getClass(), "jsType", null);
        setField(term571107, term571107.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570743;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term570743, term571107));
    }

};


