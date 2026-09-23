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

public class NodeUtil_isBooleanResultHelper_1304367666495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64964;
     Object term73046;

    public NodeUtil_isBooleanResultHelper_1304367666495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64964, term64964.getClass(), "type", 12);
        term73046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73046, term73046.getClass(), "type", 12);
        setField(term73046, term73046.getClass(), "next", null);
        setField(term73046, term73046.getClass(), "first", null);
        setField(term73046, term73046.getClass(), "last", null);
        setField(term73046, term73046.getClass(), "propListHead", null);
        setIntField(term73046, term73046.getClass(), "sourcePosition", 0);
        setField(term73046, term73046.getClass(), "jsType", null);
        setField(term73046, term73046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term64964;
        Object retValue = callMethod(klass, "isBooleanResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term64964, term73046));
        assertTrue(recursiveEquals(retValue, true));
    }

};


