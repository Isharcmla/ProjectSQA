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

public class ScopedAliases_hotSwapScript_88341709239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149409;
     Object term149501;
     Object term151227;
     Object term151228;

    public ScopedAliases_hotSwapScript_88341709239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149409 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term149409, term149409.getClass(), "compiler", null);
        term149501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term149803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term149501, term149501.getClass(), "type", 0);
        setField(term149501, term149501.getClass(), "parent", null);
        setField(term149641, term149641.getClass(), "next", null);
        setIntField(term149641, term149641.getClass(), "type", 37);
        setField(term149733, term149733.getClass(), "next", null);
        setIntField(term149733, term149733.getClass(), "type", 0);
        setField(term149733, term149733.getClass(), "first", null);
        setField(term149641, term149641.getClass(), "first", term149733);
        setField(term149571, term149571.getClass(), "next", term149641);
        setIntField(term149571, term149571.getClass(), "type", 0);
        setField(term149803, term149803.getClass(), "next", null);
        setIntField(term149803, term149803.getClass(), "type", 0);
        setField(term149803, term149803.getClass(), "first", null);
        setField(term149571, term149571.getClass(), "first", term149803);
        setField(term149501, term149501.getClass(), "first", term149571);
        term151227 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term151227, term151227.getClass(), "compiler", null);
        setField(term151227, term151227.getClass(), "preprocessorSymbolTable", null);
        setField(term151227, term151227.getClass(), "transformationHandler", null);
        term151228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term151228, term151228.getClass(), "number", 0.0);
        setIntField(term151228, term151228.getClass(), "type", 0);
        setField(term151228, term151228.getClass(), "next", null);
        setIntField(term151229, term151229.getClass(), "type", 0);
        setIntField(term151230, term151230.getClass(), "type", 37);
        setField(term151230, term151230.getClass(), "next", null);
        setDoubleField(term151231, term151231.getClass(), "number", 0.0);
        setIntField(term151231, term151231.getClass(), "type", 0);
        setField(term151231, term151231.getClass(), "next", null);
        setField(term151231, term151231.getClass(), "first", null);
        setField(term151231, term151231.getClass(), "last", null);
        setField(term151231, term151231.getClass(), "propListHead", null);
        setIntField(term151231, term151231.getClass(), "sourcePosition", 0);
        setField(term151231, term151231.getClass(), "jsType", null);
        setField(term151231, term151231.getClass(), "parent", null);
        setField(term151230, term151230.getClass(), "first", term151231);
        setField(term151230, term151230.getClass(), "last", null);
        setField(term151230, term151230.getClass(), "propListHead", null);
        setIntField(term151230, term151230.getClass(), "sourcePosition", 0);
        setField(term151230, term151230.getClass(), "jsType", null);
        setField(term151230, term151230.getClass(), "parent", null);
        setField(term151229, term151229.getClass(), "next", term151230);
        setIntField(term151232, term151232.getClass(), "type", 0);
        setField(term151232, term151232.getClass(), "next", null);
        setField(term151232, term151232.getClass(), "first", null);
        setField(term151232, term151232.getClass(), "last", null);
        setField(term151232, term151232.getClass(), "propListHead", null);
        setIntField(term151232, term151232.getClass(), "sourcePosition", 0);
        setField(term151232, term151232.getClass(), "jsType", null);
        setField(term151232, term151232.getClass(), "parent", null);
        setField(term151229, term151229.getClass(), "first", term151232);
        setField(term151229, term151229.getClass(), "last", null);
        setField(term151229, term151229.getClass(), "propListHead", null);
        setIntField(term151229, term151229.getClass(), "sourcePosition", 0);
        setField(term151229, term151229.getClass(), "jsType", null);
        setField(term151229, term151229.getClass(), "parent", null);
        setField(term151228, term151228.getClass(), "first", term151229);
        setField(term151228, term151228.getClass(), "last", null);
        setField(term151228, term151228.getClass(), "propListHead", null);
        setIntField(term151228, term151228.getClass(), "sourcePosition", 0);
        setField(term151228, term151228.getClass(), "jsType", null);
        setField(term151228, term151228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term149501;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term149409, args);
        assertTrue(recursiveEquals(term149409, term151227));
        assertTrue(recursiveEquals(term149501, term151228));
    }

};


