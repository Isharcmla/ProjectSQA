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

public class ScopedAliases_process_840655313219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135453;
     Object term135545;
     Object term137194;
     Object term137195;

    public ScopedAliases_process_840655313219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135453 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term135453, term135453.getClass(), "compiler", null);
        term135545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term135545, term135545.getClass(), "type", 37);
        setField(term135545, term135545.getClass(), "parent", null);
        setField(term135729, term135729.getClass(), "next", null);
        setIntField(term135729, term135729.getClass(), "type", 0);
        setField(term135729, term135729.getClass(), "first", null);
        setField(term135637, term135637.getClass(), "next", term135729);
        setIntField(term135637, term135637.getClass(), "type", 0);
        setField(term135821, term135821.getClass(), "next", null);
        setIntField(term135821, term135821.getClass(), "type", 0);
        setField(term135821, term135821.getClass(), "first", null);
        setField(term135637, term135637.getClass(), "first", term135821);
        setField(term135545, term135545.getClass(), "first", term135637);
        term137194 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term137194, term137194.getClass(), "compiler", null);
        setField(term137194, term137194.getClass(), "preprocessorSymbolTable", null);
        setField(term137194, term137194.getClass(), "transformationHandler", null);
        term137195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137195, term137195.getClass(), "number", 0.0);
        setIntField(term137195, term137195.getClass(), "type", 37);
        setField(term137195, term137195.getClass(), "next", null);
        setDoubleField(term137196, term137196.getClass(), "number", 0.0);
        setIntField(term137196, term137196.getClass(), "type", 0);
        setDoubleField(term137197, term137197.getClass(), "number", 0.0);
        setIntField(term137197, term137197.getClass(), "type", 0);
        setField(term137197, term137197.getClass(), "next", null);
        setField(term137197, term137197.getClass(), "first", null);
        setField(term137197, term137197.getClass(), "last", null);
        setField(term137197, term137197.getClass(), "propListHead", null);
        setIntField(term137197, term137197.getClass(), "sourcePosition", 0);
        setField(term137197, term137197.getClass(), "jsType", null);
        setField(term137197, term137197.getClass(), "parent", null);
        setField(term137196, term137196.getClass(), "next", term137197);
        setDoubleField(term137198, term137198.getClass(), "number", 0.0);
        setIntField(term137198, term137198.getClass(), "type", 0);
        setField(term137198, term137198.getClass(), "next", null);
        setField(term137198, term137198.getClass(), "first", null);
        setField(term137198, term137198.getClass(), "last", null);
        setField(term137198, term137198.getClass(), "propListHead", null);
        setIntField(term137198, term137198.getClass(), "sourcePosition", 0);
        setField(term137198, term137198.getClass(), "jsType", null);
        setField(term137198, term137198.getClass(), "parent", null);
        setField(term137196, term137196.getClass(), "first", term137198);
        setField(term137196, term137196.getClass(), "last", null);
        setField(term137196, term137196.getClass(), "propListHead", null);
        setIntField(term137196, term137196.getClass(), "sourcePosition", 0);
        setField(term137196, term137196.getClass(), "jsType", null);
        setField(term137196, term137196.getClass(), "parent", null);
        setField(term137195, term137195.getClass(), "first", term137196);
        setField(term137195, term137195.getClass(), "last", null);
        setField(term137195, term137195.getClass(), "propListHead", null);
        setIntField(term137195, term137195.getClass(), "sourcePosition", 0);
        setField(term137195, term137195.getClass(), "jsType", null);
        setField(term137195, term137195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term135545;
        callMethod(klass, "process", argTypes, term135453, args);
        assertTrue(recursiveEquals(term135453, term137194));
        assertTrue(recursiveEquals(term135545, null));
    }

};


