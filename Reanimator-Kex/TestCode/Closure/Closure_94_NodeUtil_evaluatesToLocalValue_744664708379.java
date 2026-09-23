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

public class NodeUtil_evaluatesToLocalValue_744664708379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33838;
     Object term33896;

    public NodeUtil_evaluatesToLocalValue_744664708379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33838, term33838.getClass(), "type", 44);
        term33896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33896, term33896.getClass(), "type", 44);
        setField(term33896, term33896.getClass(), "next", null);
        setField(term33896, term33896.getClass(), "first", null);
        setField(term33896, term33896.getClass(), "last", null);
        setField(term33896, term33896.getClass(), "propListHead", null);
        setIntField(term33896, term33896.getClass(), "sourcePosition", 0);
        setField(term33896, term33896.getClass(), "jsType", null);
        setField(term33896, term33896.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33838;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term33838, term33896));
    }

};


