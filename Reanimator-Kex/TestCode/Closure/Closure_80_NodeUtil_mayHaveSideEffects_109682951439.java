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

public class NodeUtil_mayHaveSideEffects_109682951439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38640;
     Object term46610;

    public NodeUtil_mayHaveSideEffects_109682951439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38640, term38640.getClass(), "type", 34);
        term46610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46610, term46610.getClass(), "type", 34);
        setField(term46610, term46610.getClass(), "next", null);
        setField(term46610, term46610.getClass(), "first", null);
        setField(term46610, term46610.getClass(), "last", null);
        setField(term46610, term46610.getClass(), "propListHead", null);
        setIntField(term46610, term46610.getClass(), "sourcePosition", 0);
        setField(term46610, term46610.getClass(), "jsType", null);
        setField(term46610, term46610.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38640;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term38640, term46610));
    }

};


