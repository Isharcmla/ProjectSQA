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

public class ScopedAliases_hotSwapScript_88341709337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226161;
     Object term226253;
     Object term228118;
     Object term228119;

    public ScopedAliases_hotSwapScript_88341709337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226161 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term226161, term226161.getClass(), "compiler", null);
        term226253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term226345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term226437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term226529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term226621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term226253, term226253.getClass(), "type", 0);
        setField(term226253, term226253.getClass(), "parent", null);
        setField(term226437, term226437.getClass(), "next", null);
        setIntField(term226437, term226437.getClass(), "type", 37);
        setField(term226529, term226529.getClass(), "next", null);
        setIntField(term226529, term226529.getClass(), "type", 0);
        setField(term226529, term226529.getClass(), "first", null);
        setField(term226437, term226437.getClass(), "first", term226529);
        setField(term226345, term226345.getClass(), "next", term226437);
        setIntField(term226345, term226345.getClass(), "type", 0);
        setField(term226621, term226621.getClass(), "next", null);
        setIntField(term226621, term226621.getClass(), "type", 0);
        setField(term226621, term226621.getClass(), "first", null);
        setField(term226345, term226345.getClass(), "first", term226621);
        setField(term226253, term226253.getClass(), "first", term226345);
        term228118 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term228118, term228118.getClass(), "compiler", null);
        setField(term228118, term228118.getClass(), "preprocessorSymbolTable", null);
        setField(term228118, term228118.getClass(), "transformationHandler", null);
        term228119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228121 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228123 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term228119, term228119.getClass(), "number", 0.0);
        setIntField(term228119, term228119.getClass(), "type", 0);
        setField(term228119, term228119.getClass(), "next", null);
        setDoubleField(term228120, term228120.getClass(), "number", 0.0);
        setIntField(term228120, term228120.getClass(), "type", 0);
        setDoubleField(term228121, term228121.getClass(), "number", 0.0);
        setIntField(term228121, term228121.getClass(), "type", 37);
        setField(term228121, term228121.getClass(), "next", null);
        setDoubleField(term228122, term228122.getClass(), "number", 0.0);
        setIntField(term228122, term228122.getClass(), "type", 0);
        setField(term228122, term228122.getClass(), "next", null);
        setField(term228122, term228122.getClass(), "first", null);
        setField(term228122, term228122.getClass(), "last", null);
        setField(term228122, term228122.getClass(), "propListHead", null);
        setIntField(term228122, term228122.getClass(), "sourcePosition", 0);
        setField(term228122, term228122.getClass(), "jsType", null);
        setField(term228122, term228122.getClass(), "parent", null);
        setField(term228121, term228121.getClass(), "first", term228122);
        setField(term228121, term228121.getClass(), "last", null);
        setField(term228121, term228121.getClass(), "propListHead", null);
        setIntField(term228121, term228121.getClass(), "sourcePosition", 0);
        setField(term228121, term228121.getClass(), "jsType", null);
        setField(term228121, term228121.getClass(), "parent", null);
        setField(term228120, term228120.getClass(), "next", term228121);
        setDoubleField(term228123, term228123.getClass(), "number", 0.0);
        setIntField(term228123, term228123.getClass(), "type", 0);
        setField(term228123, term228123.getClass(), "next", null);
        setField(term228123, term228123.getClass(), "first", null);
        setField(term228123, term228123.getClass(), "last", null);
        setField(term228123, term228123.getClass(), "propListHead", null);
        setIntField(term228123, term228123.getClass(), "sourcePosition", 0);
        setField(term228123, term228123.getClass(), "jsType", null);
        setField(term228123, term228123.getClass(), "parent", null);
        setField(term228120, term228120.getClass(), "first", term228123);
        setField(term228120, term228120.getClass(), "last", null);
        setField(term228120, term228120.getClass(), "propListHead", null);
        setIntField(term228120, term228120.getClass(), "sourcePosition", 0);
        setField(term228120, term228120.getClass(), "jsType", null);
        setField(term228120, term228120.getClass(), "parent", null);
        setField(term228119, term228119.getClass(), "first", term228120);
        setField(term228119, term228119.getClass(), "last", null);
        setField(term228119, term228119.getClass(), "propListHead", null);
        setIntField(term228119, term228119.getClass(), "sourcePosition", 0);
        setField(term228119, term228119.getClass(), "jsType", null);
        setField(term228119, term228119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term226253;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term226161, args);
        assertTrue(recursiveEquals(term226161, term228118));
        assertTrue(recursiveEquals(term226253, term228119));
    }

};


