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

public class ScopedAliases_process_84065531320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11949;
     Object term12019;
     Object term13126;
     Object term13127;

    public ScopedAliases_process_84065531320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11949 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term11949, term11949.getClass(), "compiler", null);
        term12019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12019, term12019.getClass(), "type", -133);
        setField(term12019, term12019.getClass(), "parent", term12089);
        term13126 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term13126, term13126.getClass(), "compiler", null);
        setField(term13126, term13126.getClass(), "preprocessorSymbolTable", null);
        setField(term13126, term13126.getClass(), "transformationHandler", null);
        term13127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13127, term13127.getClass(), "type", -133);
        setField(term13127, term13127.getClass(), "next", null);
        setField(term13127, term13127.getClass(), "first", null);
        setField(term13127, term13127.getClass(), "last", null);
        setField(term13127, term13127.getClass(), "propListHead", null);
        setIntField(term13127, term13127.getClass(), "sourcePosition", 0);
        setField(term13127, term13127.getClass(), "jsType", null);
        setIntField(term13128, term13128.getClass(), "type", 0);
        setField(term13128, term13128.getClass(), "next", null);
        setField(term13128, term13128.getClass(), "first", null);
        setField(term13128, term13128.getClass(), "last", null);
        setField(term13128, term13128.getClass(), "propListHead", null);
        setIntField(term13128, term13128.getClass(), "sourcePosition", 0);
        setField(term13128, term13128.getClass(), "jsType", null);
        setField(term13128, term13128.getClass(), "parent", null);
        setField(term13127, term13127.getClass(), "parent", term13128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12019;
        callMethod(klass, "process", argTypes, term11949, args);
        assertTrue(recursiveEquals(term11949, term13126));
        assertTrue(recursiveEquals(term12019, null));
    }

};


