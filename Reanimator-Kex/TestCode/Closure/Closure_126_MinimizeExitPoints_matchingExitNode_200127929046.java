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

public class MinimizeExitPoints_matchingExitNode_200127929046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6849;
     Object term6902;

    public MinimizeExitPoints_matchingExitNode_200127929046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6849, term6849.getClass(), "type", -5);
        term6902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6902, term6902.getClass(), "type", -5);
        setField(term6902, term6902.getClass(), "next", null);
        setField(term6902, term6902.getClass(), "first", null);
        setField(term6902, term6902.getClass(), "last", null);
        setField(term6902, term6902.getClass(), "propListHead", null);
        setIntField(term6902, term6902.getClass(), "sourcePosition", 0);
        setField(term6902, term6902.getClass(), "jsType", null);
        setField(term6902, term6902.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term6849;
        args[1] = -5;
        args[2] = "";
        Object retValue = callMethod(klass, "matchingExitNode", argTypes, null, args);
        assertTrue(recursiveEquals(term6849, term6902));
        assertTrue(recursiveEquals(retValue, false));
    }

};


