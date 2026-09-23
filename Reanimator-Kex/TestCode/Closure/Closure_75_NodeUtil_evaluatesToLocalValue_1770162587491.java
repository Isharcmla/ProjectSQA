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

public class NodeUtil_evaluatesToLocalValue_1770162587491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37974;
     Object term75493;

    public NodeUtil_evaluatesToLocalValue_1770162587491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37974, term37974.getClass(), "type", 51);
        term75493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75493, term75493.getClass(), "type", 51);
        setField(term75493, term75493.getClass(), "next", null);
        setField(term75493, term75493.getClass(), "first", null);
        setField(term75493, term75493.getClass(), "last", null);
        setField(term75493, term75493.getClass(), "propListHead", null);
        setIntField(term75493, term75493.getClass(), "sourcePosition", 0);
        setField(term75493, term75493.getClass(), "jsType", null);
        setField(term75493, term75493.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term37974;
        args[1] = null;
        Object retValue = callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term37974, term75493));
        assertTrue(recursiveEquals(retValue, true));
    }

};


