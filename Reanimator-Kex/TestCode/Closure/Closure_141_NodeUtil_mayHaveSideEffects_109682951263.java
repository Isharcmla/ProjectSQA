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

public class NodeUtil_mayHaveSideEffects_109682951263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21414;
     Object term21438;

    public NodeUtil_mayHaveSideEffects_109682951263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21414, term21414.getClass(), "type", 121);
        term21438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21438, term21438.getClass(), "type", 121);
        setField(term21438, term21438.getClass(), "next", null);
        setField(term21438, term21438.getClass(), "first", null);
        setField(term21438, term21438.getClass(), "last", null);
        setField(term21438, term21438.getClass(), "propListHead", null);
        setIntField(term21438, term21438.getClass(), "sourcePosition", 0);
        setField(term21438, term21438.getClass(), "jsType", null);
        setField(term21438, term21438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21414;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term21414, term21438));
    }

};


