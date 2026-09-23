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

public class NodeUtil_evaluatesToLocalValue_1770162587319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28582;
     Object term28851;

    public NodeUtil_evaluatesToLocalValue_1770162587319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28582, term28582.getClass(), "type", 97);
        term28851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28851, term28851.getClass(), "type", 97);
        setField(term28851, term28851.getClass(), "next", null);
        setField(term28851, term28851.getClass(), "first", null);
        setField(term28851, term28851.getClass(), "last", null);
        setField(term28851, term28851.getClass(), "propListHead", null);
        setIntField(term28851, term28851.getClass(), "sourcePosition", 0);
        setField(term28851, term28851.getClass(), "jsType", null);
        setField(term28851, term28851.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term28582;
        args[1] = null;
        Object retValue = callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28582, term28851));
        assertTrue(recursiveEquals(retValue, true));
    }

};


