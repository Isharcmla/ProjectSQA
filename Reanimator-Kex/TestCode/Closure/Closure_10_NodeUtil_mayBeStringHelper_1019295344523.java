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

public class NodeUtil_mayBeStringHelper_1019295344523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559401;
     Object term569888;

    public NodeUtil_mayBeStringHelper_1019295344523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term559401, term559401.getClass(), "type", 19);
        term569888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term569888, term569888.getClass(), "type", 19);
        setField(term569888, term569888.getClass(), "next", null);
        setField(term569888, term569888.getClass(), "first", null);
        setField(term569888, term569888.getClass(), "last", null);
        setField(term569888, term569888.getClass(), "propListHead", null);
        setIntField(term569888, term569888.getClass(), "sourcePosition", 0);
        setField(term569888, term569888.getClass(), "jsType", null);
        setField(term569888, term569888.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term559401;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term559401, term569888));
        assertTrue(recursiveEquals(retValue, false));
    }

};


