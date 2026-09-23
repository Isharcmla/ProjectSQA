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

public class ScopedAliases_hotSwapScript_88341709297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193803;
     Object term193873;
     Object term194843;
     Object term194844;

    public ScopedAliases_hotSwapScript_88341709297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193803 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term193803, term193803.getClass(), "compiler", null);
        term193873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193873, term193873.getClass(), "type", 0);
        setField(term193873, term193873.getClass(), "parent", null);
        setField(term194083, term194083.getClass(), "next", null);
        setIntField(term194083, term194083.getClass(), "type", 0);
        setField(term194083, term194083.getClass(), "first", null);
        setField(term194013, term194013.getClass(), "next", term194083);
        setIntField(term194013, term194013.getClass(), "type", 0);
        setField(term194013, term194013.getClass(), "first", null);
        setField(term193943, term193943.getClass(), "next", term194013);
        setIntField(term193943, term193943.getClass(), "type", 0);
        setField(term194153, term194153.getClass(), "next", null);
        setIntField(term194153, term194153.getClass(), "type", 0);
        setField(term194153, term194153.getClass(), "first", null);
        setField(term193943, term193943.getClass(), "first", term194153);
        setField(term193873, term193873.getClass(), "first", term193943);
        term194843 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term194843, term194843.getClass(), "compiler", null);
        setField(term194843, term194843.getClass(), "preprocessorSymbolTable", null);
        setField(term194843, term194843.getClass(), "transformationHandler", null);
        term194844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term194844, term194844.getClass(), "type", 0);
        setField(term194844, term194844.getClass(), "next", null);
        setIntField(term194845, term194845.getClass(), "type", 0);
        setIntField(term194846, term194846.getClass(), "type", 0);
        setIntField(term194847, term194847.getClass(), "type", 0);
        setField(term194847, term194847.getClass(), "next", null);
        setField(term194847, term194847.getClass(), "first", null);
        setField(term194847, term194847.getClass(), "last", null);
        setField(term194847, term194847.getClass(), "propListHead", null);
        setIntField(term194847, term194847.getClass(), "sourcePosition", 0);
        setField(term194847, term194847.getClass(), "jsType", null);
        setField(term194847, term194847.getClass(), "parent", null);
        setField(term194846, term194846.getClass(), "next", term194847);
        setField(term194846, term194846.getClass(), "first", null);
        setField(term194846, term194846.getClass(), "last", null);
        setField(term194846, term194846.getClass(), "propListHead", null);
        setIntField(term194846, term194846.getClass(), "sourcePosition", 0);
        setField(term194846, term194846.getClass(), "jsType", null);
        setField(term194846, term194846.getClass(), "parent", null);
        setField(term194845, term194845.getClass(), "next", term194846);
        setIntField(term194848, term194848.getClass(), "type", 0);
        setField(term194848, term194848.getClass(), "next", null);
        setField(term194848, term194848.getClass(), "first", null);
        setField(term194848, term194848.getClass(), "last", null);
        setField(term194848, term194848.getClass(), "propListHead", null);
        setIntField(term194848, term194848.getClass(), "sourcePosition", 0);
        setField(term194848, term194848.getClass(), "jsType", null);
        setField(term194848, term194848.getClass(), "parent", null);
        setField(term194845, term194845.getClass(), "first", term194848);
        setField(term194845, term194845.getClass(), "last", null);
        setField(term194845, term194845.getClass(), "propListHead", null);
        setIntField(term194845, term194845.getClass(), "sourcePosition", 0);
        setField(term194845, term194845.getClass(), "jsType", null);
        setField(term194845, term194845.getClass(), "parent", null);
        setField(term194844, term194844.getClass(), "first", term194845);
        setField(term194844, term194844.getClass(), "last", null);
        setField(term194844, term194844.getClass(), "propListHead", null);
        setIntField(term194844, term194844.getClass(), "sourcePosition", 0);
        setField(term194844, term194844.getClass(), "jsType", null);
        setField(term194844, term194844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term193873;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term193803, args);
        assertTrue(recursiveEquals(term193803, term194843));
        assertTrue(recursiveEquals(term193873, term194844));
    }

};


