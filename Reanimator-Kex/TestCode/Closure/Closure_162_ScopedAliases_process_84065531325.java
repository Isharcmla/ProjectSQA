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

public class ScopedAliases_process_84065531325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10805;
     Object term10875;
     Object term11262;
     Object term11263;

    public ScopedAliases_process_84065531325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10805 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term10805, term10805.getClass(), "compiler", null);
        term10875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10875, term10875.getClass(), "type", 0);
        setField(term10875, term10875.getClass(), "parent", null);
        setField(term10945, term10945.getClass(), "next", null);
        setIntField(term10945, term10945.getClass(), "type", 0);
        setField(term10945, term10945.getClass(), "first", null);
        setField(term10875, term10875.getClass(), "first", term10945);
        term11262 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term11262, term11262.getClass(), "compiler", null);
        setField(term11262, term11262.getClass(), "preprocessorSymbolTable", null);
        setField(term11262, term11262.getClass(), "transformationHandler", null);
        term11263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11263, term11263.getClass(), "type", 0);
        setField(term11263, term11263.getClass(), "next", null);
        setIntField(term11264, term11264.getClass(), "type", 0);
        setField(term11264, term11264.getClass(), "next", null);
        setField(term11264, term11264.getClass(), "first", null);
        setField(term11264, term11264.getClass(), "last", null);
        setField(term11264, term11264.getClass(), "propListHead", null);
        setIntField(term11264, term11264.getClass(), "sourcePosition", 0);
        setField(term11264, term11264.getClass(), "jsType", null);
        setField(term11264, term11264.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "first", term11264);
        setField(term11263, term11263.getClass(), "last", null);
        setField(term11263, term11263.getClass(), "propListHead", null);
        setIntField(term11263, term11263.getClass(), "sourcePosition", 0);
        setField(term11263, term11263.getClass(), "jsType", null);
        setField(term11263, term11263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10875;
        callMethod(klass, "process", argTypes, term10805, args);
        assertTrue(recursiveEquals(term10805, term11262));
        assertTrue(recursiveEquals(term10875, null));
    }

};


