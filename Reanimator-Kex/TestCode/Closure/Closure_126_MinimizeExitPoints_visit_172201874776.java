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

public class MinimizeExitPoints_visit_172201874776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14155;
     Object term14225;
     Object term14604;
     Object term14605;

    public MinimizeExitPoints_visit_172201874776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14155 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term14225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14225, term14225.getClass(), "type", 115);
        setField(term14225, term14225.getClass(), "last", term14225);
        term14604 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term14604, term14604.getClass(), "compiler", null);
        term14605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14605, term14605.getClass(), "type", 115);
        setField(term14605, term14605.getClass(), "next", null);
        setField(term14605, term14605.getClass(), "first", null);
        setField(term14605, term14605.getClass(), "last", term14605);
        setField(term14605, term14605.getClass(), "propListHead", null);
        setIntField(term14605, term14605.getClass(), "sourcePosition", 0);
        setField(term14605, term14605.getClass(), "jsType", null);
        setField(term14605, term14605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term14225;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term14155, args);
        assertTrue(recursiveEquals(term14155, term14604));
        assertTrue(recursiveEquals(term14225, null));
    }

};


