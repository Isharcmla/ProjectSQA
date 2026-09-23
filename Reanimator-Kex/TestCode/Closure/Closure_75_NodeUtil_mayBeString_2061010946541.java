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

public class NodeUtil_mayBeString_2061010946541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42018;
     Object term81391;

    public NodeUtil_mayBeString_2061010946541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42018, term42018.getClass(), "type", 16);
        term81391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81391, term81391.getClass(), "type", 16);
        setField(term81391, term81391.getClass(), "next", null);
        setField(term81391, term81391.getClass(), "first", null);
        setField(term81391, term81391.getClass(), "last", null);
        setField(term81391, term81391.getClass(), "propListHead", null);
        setIntField(term81391, term81391.getClass(), "sourcePosition", 0);
        setField(term81391, term81391.getClass(), "jsType", null);
        setField(term81391, term81391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42018;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term42018, term81391));
    }

};


