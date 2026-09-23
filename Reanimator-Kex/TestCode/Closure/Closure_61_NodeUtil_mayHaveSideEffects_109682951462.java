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

public class NodeUtil_mayHaveSideEffects_109682951462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38669;
     Object term39033;

    public NodeUtil_mayHaveSideEffects_109682951462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38669, term38669.getClass(), "type", 113);
        term39033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39033, term39033.getClass(), "type", 113);
        setField(term39033, term39033.getClass(), "next", null);
        setField(term39033, term39033.getClass(), "first", null);
        setField(term39033, term39033.getClass(), "last", null);
        setField(term39033, term39033.getClass(), "propListHead", null);
        setIntField(term39033, term39033.getClass(), "sourcePosition", 0);
        setField(term39033, term39033.getClass(), "jsType", null);
        setField(term39033, term39033.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38669;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term38669, term39033));
    }

};


