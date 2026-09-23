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

public class ScopedAliases_process_840655313243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152885;
     Object term152977;
     Object term153837;
     Object term153838;

    public ScopedAliases_process_840655313243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152885 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term152885, term152885.getClass(), "compiler", null);
        term152977 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152977, term152977.getClass(), "type", 0);
        setField(term152977, term152977.getClass(), "parent", null);
        setField(term153161, term153161.getClass(), "next", null);
        setIntField(term153161, term153161.getClass(), "type", 0);
        setField(term153161, term153161.getClass(), "first", null);
        setField(term153069, term153069.getClass(), "next", term153161);
        setIntField(term153069, term153069.getClass(), "type", 0);
        setField(term153231, term153231.getClass(), "next", null);
        setIntField(term153231, term153231.getClass(), "type", 0);
        setField(term153231, term153231.getClass(), "first", null);
        setField(term153069, term153069.getClass(), "first", term153231);
        setField(term152977, term152977.getClass(), "first", term153069);
        term153837 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term153837, term153837.getClass(), "compiler", null);
        setField(term153837, term153837.getClass(), "preprocessorSymbolTable", null);
        setField(term153837, term153837.getClass(), "transformationHandler", null);
        term153838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term153838, term153838.getClass(), "number", 0.0);
        setIntField(term153838, term153838.getClass(), "type", 0);
        setField(term153838, term153838.getClass(), "next", null);
        setDoubleField(term153839, term153839.getClass(), "number", 0.0);
        setIntField(term153839, term153839.getClass(), "type", 0);
        setDoubleField(term153840, term153840.getClass(), "number", 0.0);
        setIntField(term153840, term153840.getClass(), "type", 0);
        setField(term153840, term153840.getClass(), "next", null);
        setField(term153840, term153840.getClass(), "first", null);
        setField(term153840, term153840.getClass(), "last", null);
        setField(term153840, term153840.getClass(), "propListHead", null);
        setIntField(term153840, term153840.getClass(), "sourcePosition", 0);
        setField(term153840, term153840.getClass(), "jsType", null);
        setField(term153840, term153840.getClass(), "parent", null);
        setField(term153839, term153839.getClass(), "next", term153840);
        setIntField(term153841, term153841.getClass(), "type", 0);
        setField(term153841, term153841.getClass(), "next", null);
        setField(term153841, term153841.getClass(), "first", null);
        setField(term153841, term153841.getClass(), "last", null);
        setField(term153841, term153841.getClass(), "propListHead", null);
        setIntField(term153841, term153841.getClass(), "sourcePosition", 0);
        setField(term153841, term153841.getClass(), "jsType", null);
        setField(term153841, term153841.getClass(), "parent", null);
        setField(term153839, term153839.getClass(), "first", term153841);
        setField(term153839, term153839.getClass(), "last", null);
        setField(term153839, term153839.getClass(), "propListHead", null);
        setIntField(term153839, term153839.getClass(), "sourcePosition", 0);
        setField(term153839, term153839.getClass(), "jsType", null);
        setField(term153839, term153839.getClass(), "parent", null);
        setField(term153838, term153838.getClass(), "first", term153839);
        setField(term153838, term153838.getClass(), "last", null);
        setField(term153838, term153838.getClass(), "propListHead", null);
        setIntField(term153838, term153838.getClass(), "sourcePosition", 0);
        setField(term153838, term153838.getClass(), "jsType", null);
        setField(term153838, term153838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term152977;
        callMethod(klass, "process", argTypes, term152885, args);
        assertTrue(recursiveEquals(term152885, term153837));
        assertTrue(recursiveEquals(term152977, null));
    }

};


