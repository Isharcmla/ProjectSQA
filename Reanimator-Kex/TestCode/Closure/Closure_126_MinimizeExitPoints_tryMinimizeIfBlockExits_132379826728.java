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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589;
     Object term3694;
     Object term3744;
     Object term3745;
     Object term3746;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3589 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term3694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3694, term3694.getClass(), "type", 0);
        setField(term3694, term3694.getClass(), "first", null);
        term3744 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term3744, term3744.getClass(), "compiler", null);
        term3745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3745, term3745.getClass(), "type", 0);
        setField(term3745, term3745.getClass(), "next", null);
        setField(term3745, term3745.getClass(), "first", null);
        setField(term3745, term3745.getClass(), "last", null);
        setField(term3745, term3745.getClass(), "propListHead", null);
        setIntField(term3745, term3745.getClass(), "sourcePosition", 0);
        setField(term3745, term3745.getClass(), "jsType", null);
        setField(term3745, term3745.getClass(), "parent", null);
        term3746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3746, term3746.getClass(), "type", 0);
        setField(term3746, term3746.getClass(), "next", null);
        setField(term3746, term3746.getClass(), "first", null);
        setField(term3746, term3746.getClass(), "last", null);
        setField(term3746, term3746.getClass(), "propListHead", null);
        setIntField(term3746, term3746.getClass(), "sourcePosition", 0);
        setField(term3746, term3746.getClass(), "jsType", null);
        setField(term3746, term3746.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term3694;
        args[1] = null;
        args[2] = term3694;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term3589, args);
        assertTrue(recursiveEquals(term3589, term3744));
        assertTrue(recursiveEquals(term3694, term3745));
        assertTrue(recursiveEquals(term3694, null));
    }

};


