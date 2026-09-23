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

public class ScopedAliases_process_84065531349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29498;
     Object term29590;
     Object term29858;
     Object term29859;

    public ScopedAliases_process_84065531349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29498 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term29498, term29498.getClass(), "compiler", null);
        term29590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term29590, term29590.getClass(), "type", 105);
        setField(term29590, term29590.getClass(), "parent", null);
        term29858 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term29858, term29858.getClass(), "compiler", null);
        setField(term29858, term29858.getClass(), "preprocessorSymbolTable", null);
        setField(term29858, term29858.getClass(), "transformationHandler", null);
        term29859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term29859, term29859.getClass(), "number", 0.0);
        setIntField(term29859, term29859.getClass(), "type", 105);
        setField(term29859, term29859.getClass(), "next", null);
        setField(term29859, term29859.getClass(), "first", null);
        setField(term29859, term29859.getClass(), "last", null);
        setField(term29859, term29859.getClass(), "propListHead", null);
        setIntField(term29859, term29859.getClass(), "sourcePosition", 0);
        setField(term29859, term29859.getClass(), "jsType", null);
        setField(term29859, term29859.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29590;
        callMethod(klass, "process", argTypes, term29498, args);
        assertTrue(recursiveEquals(term29498, term29858));
        assertTrue(recursiveEquals(term29590, null));
    }

};


