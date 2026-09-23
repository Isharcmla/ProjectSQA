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

public class ScopedAliases_process_84065531335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20022;
     Object term20092;
     Object term21471;
     Object term21472;

    public ScopedAliases_process_84065531335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20022 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term20022, term20022.getClass(), "compiler", null);
        term20092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20092, term20092.getClass(), "type", 0);
        setField(term20092, term20092.getClass(), "parent", null);
        setField(term20232, term20232.getClass(), "next", null);
        setIntField(term20232, term20232.getClass(), "type", 105);
        setField(term20162, term20162.getClass(), "next", term20232);
        setIntField(term20162, term20162.getClass(), "type", 0);
        setField(term20302, term20302.getClass(), "next", null);
        setIntField(term20302, term20302.getClass(), "type", 0);
        setField(term20302, term20302.getClass(), "first", null);
        setField(term20162, term20162.getClass(), "first", term20302);
        setField(term20092, term20092.getClass(), "first", term20162);
        term21471 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term21471, term21471.getClass(), "compiler", null);
        setField(term21471, term21471.getClass(), "preprocessorSymbolTable", null);
        setField(term21471, term21471.getClass(), "transformationHandler", null);
        term21472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21472, term21472.getClass(), "type", 0);
        setField(term21472, term21472.getClass(), "next", null);
        setIntField(term21473, term21473.getClass(), "type", 0);
        setIntField(term21474, term21474.getClass(), "type", 105);
        setField(term21474, term21474.getClass(), "next", null);
        setField(term21474, term21474.getClass(), "first", null);
        setField(term21474, term21474.getClass(), "last", null);
        setField(term21474, term21474.getClass(), "propListHead", null);
        setIntField(term21474, term21474.getClass(), "sourcePosition", 0);
        setField(term21474, term21474.getClass(), "jsType", null);
        setField(term21474, term21474.getClass(), "parent", null);
        setField(term21473, term21473.getClass(), "next", term21474);
        setIntField(term21475, term21475.getClass(), "type", 0);
        setField(term21475, term21475.getClass(), "next", null);
        setField(term21475, term21475.getClass(), "first", null);
        setField(term21475, term21475.getClass(), "last", null);
        setField(term21475, term21475.getClass(), "propListHead", null);
        setIntField(term21475, term21475.getClass(), "sourcePosition", 0);
        setField(term21475, term21475.getClass(), "jsType", null);
        setField(term21475, term21475.getClass(), "parent", null);
        setField(term21473, term21473.getClass(), "first", term21475);
        setField(term21473, term21473.getClass(), "last", null);
        setField(term21473, term21473.getClass(), "propListHead", null);
        setIntField(term21473, term21473.getClass(), "sourcePosition", 0);
        setField(term21473, term21473.getClass(), "jsType", null);
        setField(term21473, term21473.getClass(), "parent", null);
        setField(term21472, term21472.getClass(), "first", term21473);
        setField(term21472, term21472.getClass(), "last", null);
        setField(term21472, term21472.getClass(), "propListHead", null);
        setIntField(term21472, term21472.getClass(), "sourcePosition", 0);
        setField(term21472, term21472.getClass(), "jsType", null);
        setField(term21472, term21472.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20092;
        callMethod(klass, "process", argTypes, term20022, args);
        assertTrue(recursiveEquals(term20022, term21471));
        assertTrue(recursiveEquals(term20092, null));
    }

};


