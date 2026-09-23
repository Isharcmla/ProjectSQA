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
import java.lang.Object;

public class MinimizeExitPoints_visit_1722018747217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69152;
     Object term69222;
     Object term70418;
     Object term70419;

    public MinimizeExitPoints_visit_1722018747217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69152 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term69222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69222, term69222.getClass(), "type", 105);
        setIntField(term69292, term69292.getClass(), "type", 4);
        setField(term69292, term69292.getClass(), "first", term69362);
        setField(term69222, term69222.getClass(), "last", term69292);
        term70418 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term70418, term70418.getClass(), "compiler", null);
        term70419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70419, term70419.getClass(), "type", 105);
        setField(term70419, term70419.getClass(), "next", null);
        setField(term70419, term70419.getClass(), "first", null);
        setIntField(term70420, term70420.getClass(), "type", 4);
        setField(term70420, term70420.getClass(), "next", null);
        setIntField(term70421, term70421.getClass(), "type", 0);
        setField(term70421, term70421.getClass(), "next", null);
        setField(term70421, term70421.getClass(), "first", null);
        setField(term70421, term70421.getClass(), "last", null);
        setField(term70421, term70421.getClass(), "propListHead", null);
        setIntField(term70421, term70421.getClass(), "sourcePosition", 0);
        setField(term70421, term70421.getClass(), "jsType", null);
        setField(term70421, term70421.getClass(), "parent", null);
        setField(term70420, term70420.getClass(), "first", term70421);
        setField(term70420, term70420.getClass(), "last", null);
        setField(term70420, term70420.getClass(), "propListHead", null);
        setIntField(term70420, term70420.getClass(), "sourcePosition", 0);
        setField(term70420, term70420.getClass(), "jsType", null);
        setField(term70420, term70420.getClass(), "parent", null);
        setField(term70419, term70419.getClass(), "last", term70420);
        setField(term70419, term70419.getClass(), "propListHead", null);
        setIntField(term70419, term70419.getClass(), "sourcePosition", 0);
        setField(term70419, term70419.getClass(), "jsType", null);
        setField(term70419, term70419.getClass(), "parent", null);
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
        args[1] = term69222;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term69152, args);
        assertTrue(recursiveEquals(term69152, term70418));
        assertTrue(recursiveEquals(term69222, null));
    }

};


