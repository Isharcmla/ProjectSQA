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

public class NodeUtil_mayBeString_2061010946383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42030;
     Object term42460;

    public NodeUtil_mayBeString_2061010946383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42030, term42030.getClass(), "type", 30);
        term42460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42460, term42460.getClass(), "type", 30);
        setField(term42460, term42460.getClass(), "next", null);
        setField(term42460, term42460.getClass(), "first", null);
        setField(term42460, term42460.getClass(), "last", null);
        setField(term42460, term42460.getClass(), "propListHead", null);
        setIntField(term42460, term42460.getClass(), "sourcePosition", 0);
        setField(term42460, term42460.getClass(), "jsType", null);
        setField(term42460, term42460.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42030;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term42030, term42460));
    }

};


