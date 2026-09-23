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

public class ScopedAliases_process_84065531379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46588;
     Object term46658;
     Object term47076;
     Object term47077;

    public ScopedAliases_process_84065531379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46588 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term46588, term46588.getClass(), "compiler", null);
        term46658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term46658, term46658.getClass(), "type", 0);
        setIntField(term46750, term46750.getClass(), "type", 0);
        setField(term46750, term46750.getClass(), "parent", null);
        setField(term46658, term46658.getClass(), "parent", term46750);
        setField(term46658, term46658.getClass(), "first", null);
        term47076 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term47076, term47076.getClass(), "compiler", null);
        setField(term47076, term47076.getClass(), "preprocessorSymbolTable", null);
        setField(term47076, term47076.getClass(), "transformationHandler", null);
        term47077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47078 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term47077, term47077.getClass(), "type", 0);
        setField(term47077, term47077.getClass(), "next", null);
        setField(term47077, term47077.getClass(), "first", null);
        setField(term47077, term47077.getClass(), "last", null);
        setField(term47077, term47077.getClass(), "propListHead", null);
        setIntField(term47077, term47077.getClass(), "sourcePosition", 0);
        setField(term47077, term47077.getClass(), "jsType", null);
        setField(term47078, term47078.getClass(), "str", null);
        setIntField(term47078, term47078.getClass(), "type", 0);
        setField(term47078, term47078.getClass(), "next", null);
        setField(term47078, term47078.getClass(), "first", null);
        setField(term47078, term47078.getClass(), "last", null);
        setField(term47078, term47078.getClass(), "propListHead", null);
        setIntField(term47078, term47078.getClass(), "sourcePosition", 0);
        setField(term47078, term47078.getClass(), "jsType", null);
        setField(term47078, term47078.getClass(), "parent", null);
        setField(term47077, term47077.getClass(), "parent", term47078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46658;
        callMethod(klass, "process", argTypes, term46588, args);
        assertTrue(recursiveEquals(term46588, term47076));
        assertTrue(recursiveEquals(term46658, null));
    }

};


