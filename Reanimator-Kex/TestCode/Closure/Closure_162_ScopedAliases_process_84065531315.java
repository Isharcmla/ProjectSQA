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

public class ScopedAliases_process_84065531315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;
     Object term5817;
     Object term6204;
     Object term6205;

    public ScopedAliases_process_84065531315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5747 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term5747, term5747.getClass(), "compiler", null);
        term5817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5817, term5817.getClass(), "type", 0);
        setField(term5817, term5817.getClass(), "parent", null);
        setField(term5887, term5887.getClass(), "next", null);
        setIntField(term5887, term5887.getClass(), "type", 0);
        setField(term5887, term5887.getClass(), "first", null);
        setField(term5817, term5817.getClass(), "first", term5887);
        term6204 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term6204, term6204.getClass(), "compiler", null);
        setField(term6204, term6204.getClass(), "preprocessorSymbolTable", null);
        setField(term6204, term6204.getClass(), "transformationHandler", null);
        term6205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6205, term6205.getClass(), "type", 0);
        setField(term6205, term6205.getClass(), "next", null);
        setIntField(term6206, term6206.getClass(), "type", 0);
        setField(term6206, term6206.getClass(), "next", null);
        setField(term6206, term6206.getClass(), "first", null);
        setField(term6206, term6206.getClass(), "last", null);
        setField(term6206, term6206.getClass(), "propListHead", null);
        setIntField(term6206, term6206.getClass(), "sourcePosition", 0);
        setField(term6206, term6206.getClass(), "jsType", null);
        setField(term6206, term6206.getClass(), "parent", null);
        setField(term6205, term6205.getClass(), "first", term6206);
        setField(term6205, term6205.getClass(), "last", null);
        setField(term6205, term6205.getClass(), "propListHead", null);
        setIntField(term6205, term6205.getClass(), "sourcePosition", 0);
        setField(term6205, term6205.getClass(), "jsType", null);
        setField(term6205, term6205.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5817;
        callMethod(klass, "process", argTypes, term5747, args);
        assertTrue(recursiveEquals(term5747, term6204));
        assertTrue(recursiveEquals(term5817, null));
    }

};


