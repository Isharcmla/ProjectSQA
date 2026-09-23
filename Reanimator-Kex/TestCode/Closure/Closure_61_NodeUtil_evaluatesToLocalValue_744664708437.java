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

public class NodeUtil_evaluatesToLocalValue_744664708437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36709;
     Object term36804;

    public NodeUtil_evaluatesToLocalValue_744664708437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36709, term36709.getClass(), "type", 43);
        term36804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36804, term36804.getClass(), "type", 43);
        setField(term36804, term36804.getClass(), "next", null);
        setField(term36804, term36804.getClass(), "first", null);
        setField(term36804, term36804.getClass(), "last", null);
        setField(term36804, term36804.getClass(), "propListHead", null);
        setIntField(term36804, term36804.getClass(), "sourcePosition", 0);
        setField(term36804, term36804.getClass(), "jsType", null);
        setField(term36804, term36804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36709;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term36709, term36804));
    }

};


