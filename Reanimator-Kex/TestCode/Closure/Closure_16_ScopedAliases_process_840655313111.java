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

public class ScopedAliases_process_840655313111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65020;
     Object term65090;
     Object term66151;
     Object term66152;

    public ScopedAliases_process_840655313111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65020 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term65020, term65020.getClass(), "compiler", null);
        term65090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term65090, term65090.getClass(), "type", 0);
        setIntField(term65182, term65182.getClass(), "type", 0);
        setField(term65182, term65182.getClass(), "parent", null);
        setField(term65090, term65090.getClass(), "parent", term65182);
        setField(term65090, term65090.getClass(), "first", null);
        term66151 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term66151, term66151.getClass(), "compiler", null);
        setField(term66151, term66151.getClass(), "preprocessorSymbolTable", null);
        setField(term66151, term66151.getClass(), "transformationHandler", null);
        term66152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66152, term66152.getClass(), "type", 0);
        setField(term66152, term66152.getClass(), "next", null);
        setField(term66152, term66152.getClass(), "first", null);
        setField(term66152, term66152.getClass(), "last", null);
        setField(term66152, term66152.getClass(), "propListHead", null);
        setIntField(term66152, term66152.getClass(), "sourcePosition", 0);
        setField(term66152, term66152.getClass(), "jsType", null);
        setDoubleField(term66153, term66153.getClass(), "number", 0.0);
        setIntField(term66153, term66153.getClass(), "type", 0);
        setField(term66153, term66153.getClass(), "next", null);
        setField(term66153, term66153.getClass(), "first", null);
        setField(term66153, term66153.getClass(), "last", null);
        setField(term66153, term66153.getClass(), "propListHead", null);
        setIntField(term66153, term66153.getClass(), "sourcePosition", 0);
        setField(term66153, term66153.getClass(), "jsType", null);
        setField(term66153, term66153.getClass(), "parent", null);
        setField(term66152, term66152.getClass(), "parent", term66153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term65090;
        callMethod(klass, "process", argTypes, term65020, args);
        assertTrue(recursiveEquals(term65020, term66151));
        assertTrue(recursiveEquals(term65090, null));
    }

};


