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

public class NodeUtil_evaluatesToLocalValue_1770162587476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40970;
     Object term41137;

    public NodeUtil_evaluatesToLocalValue_1770162587476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40970, term40970.getClass(), "type", 30);
        term41137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41137, term41137.getClass(), "type", 30);
        setField(term41137, term41137.getClass(), "next", null);
        setField(term41137, term41137.getClass(), "first", null);
        setField(term41137, term41137.getClass(), "last", null);
        setField(term41137, term41137.getClass(), "propListHead", null);
        setIntField(term41137, term41137.getClass(), "sourcePosition", 0);
        setField(term41137, term41137.getClass(), "jsType", null);
        setField(term41137, term41137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term40970;
        args[1] = null;
        Object retValue = callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term40970, term41137));
        assertTrue(recursiveEquals(retValue, true));
    }

};


