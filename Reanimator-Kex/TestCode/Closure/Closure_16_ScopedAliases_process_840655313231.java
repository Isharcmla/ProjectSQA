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

public class ScopedAliases_process_840655313231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145028;
     Object term145098;
     Object term145826;
     Object term145827;

    public ScopedAliases_process_840655313231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145028 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term145028, term145028.getClass(), "compiler", null);
        term145098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145098, term145098.getClass(), "type", 0);
        setIntField(term145168, term145168.getClass(), "type", 0);
        setField(term145168, term145168.getClass(), "parent", null);
        setField(term145098, term145098.getClass(), "parent", term145168);
        setField(term145238, term145238.getClass(), "next", null);
        setIntField(term145238, term145238.getClass(), "type", 0);
        setField(term145308, term145308.getClass(), "next", null);
        setIntField(term145308, term145308.getClass(), "type", 0);
        setField(term145308, term145308.getClass(), "first", null);
        setField(term145238, term145238.getClass(), "first", term145308);
        setField(term145098, term145098.getClass(), "first", term145238);
        term145826 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term145826, term145826.getClass(), "compiler", null);
        setField(term145826, term145826.getClass(), "preprocessorSymbolTable", null);
        setField(term145826, term145826.getClass(), "transformationHandler", null);
        term145827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145827, term145827.getClass(), "type", 0);
        setField(term145827, term145827.getClass(), "next", null);
        setIntField(term145828, term145828.getClass(), "type", 0);
        setField(term145828, term145828.getClass(), "next", null);
        setIntField(term145829, term145829.getClass(), "type", 0);
        setField(term145829, term145829.getClass(), "next", null);
        setField(term145829, term145829.getClass(), "first", null);
        setField(term145829, term145829.getClass(), "last", null);
        setField(term145829, term145829.getClass(), "propListHead", null);
        setIntField(term145829, term145829.getClass(), "sourcePosition", 0);
        setField(term145829, term145829.getClass(), "jsType", null);
        setField(term145829, term145829.getClass(), "parent", null);
        setField(term145828, term145828.getClass(), "first", term145829);
        setField(term145828, term145828.getClass(), "last", null);
        setField(term145828, term145828.getClass(), "propListHead", null);
        setIntField(term145828, term145828.getClass(), "sourcePosition", 0);
        setField(term145828, term145828.getClass(), "jsType", null);
        setField(term145828, term145828.getClass(), "parent", null);
        setField(term145827, term145827.getClass(), "first", term145828);
        setField(term145827, term145827.getClass(), "last", null);
        setField(term145827, term145827.getClass(), "propListHead", null);
        setIntField(term145827, term145827.getClass(), "sourcePosition", 0);
        setField(term145827, term145827.getClass(), "jsType", null);
        setIntField(term145830, term145830.getClass(), "type", 0);
        setField(term145830, term145830.getClass(), "next", null);
        setField(term145830, term145830.getClass(), "first", null);
        setField(term145830, term145830.getClass(), "last", null);
        setField(term145830, term145830.getClass(), "propListHead", null);
        setIntField(term145830, term145830.getClass(), "sourcePosition", 0);
        setField(term145830, term145830.getClass(), "jsType", null);
        setField(term145830, term145830.getClass(), "parent", null);
        setField(term145827, term145827.getClass(), "parent", term145830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term145098;
        callMethod(klass, "process", argTypes, term145028, args);
        assertTrue(recursiveEquals(term145028, term145826));
        assertTrue(recursiveEquals(term145098, null));
    }

};


