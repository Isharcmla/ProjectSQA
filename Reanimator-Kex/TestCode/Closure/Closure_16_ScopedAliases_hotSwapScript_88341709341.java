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

public class ScopedAliases_hotSwapScript_88341709341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229678;
     Object term229770;
     Object term231605;
     Object term231606;

    public ScopedAliases_hotSwapScript_88341709341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229678 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term229678, term229678.getClass(), "compiler", null);
        term229770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term229840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term230024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term230094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229770, term229770.getClass(), "type", 0);
        setField(term229770, term229770.getClass(), "parent", null);
        setField(term229932, term229932.getClass(), "next", null);
        setIntField(term229932, term229932.getClass(), "type", 37);
        setField(term230024, term230024.getClass(), "next", null);
        setIntField(term230024, term230024.getClass(), "type", 0);
        setField(term230024, term230024.getClass(), "first", null);
        setField(term229932, term229932.getClass(), "first", term230024);
        setField(term229840, term229840.getClass(), "next", term229932);
        setIntField(term229840, term229840.getClass(), "type", 0);
        setField(term230094, term230094.getClass(), "next", null);
        setIntField(term230094, term230094.getClass(), "type", 0);
        setField(term230094, term230094.getClass(), "first", null);
        setField(term229840, term229840.getClass(), "first", term230094);
        setField(term229770, term229770.getClass(), "first", term229840);
        term231605 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term231605, term231605.getClass(), "compiler", null);
        setField(term231605, term231605.getClass(), "preprocessorSymbolTable", null);
        setField(term231605, term231605.getClass(), "transformationHandler", null);
        term231606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term231607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term231609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term231610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term231606, term231606.getClass(), "number", 0.0);
        setIntField(term231606, term231606.getClass(), "type", 0);
        setField(term231606, term231606.getClass(), "next", null);
        setIntField(term231607, term231607.getClass(), "type", 0);
        setDoubleField(term231608, term231608.getClass(), "number", 0.0);
        setIntField(term231608, term231608.getClass(), "type", 37);
        setField(term231608, term231608.getClass(), "next", null);
        setDoubleField(term231609, term231609.getClass(), "number", 0.0);
        setIntField(term231609, term231609.getClass(), "type", 0);
        setField(term231609, term231609.getClass(), "next", null);
        setField(term231609, term231609.getClass(), "first", null);
        setField(term231609, term231609.getClass(), "last", null);
        setField(term231609, term231609.getClass(), "propListHead", null);
        setIntField(term231609, term231609.getClass(), "sourcePosition", 0);
        setField(term231609, term231609.getClass(), "jsType", null);
        setField(term231609, term231609.getClass(), "parent", null);
        setField(term231608, term231608.getClass(), "first", term231609);
        setField(term231608, term231608.getClass(), "last", null);
        setField(term231608, term231608.getClass(), "propListHead", null);
        setIntField(term231608, term231608.getClass(), "sourcePosition", 0);
        setField(term231608, term231608.getClass(), "jsType", null);
        setField(term231608, term231608.getClass(), "parent", null);
        setField(term231607, term231607.getClass(), "next", term231608);
        setIntField(term231610, term231610.getClass(), "type", 0);
        setField(term231610, term231610.getClass(), "next", null);
        setField(term231610, term231610.getClass(), "first", null);
        setField(term231610, term231610.getClass(), "last", null);
        setField(term231610, term231610.getClass(), "propListHead", null);
        setIntField(term231610, term231610.getClass(), "sourcePosition", 0);
        setField(term231610, term231610.getClass(), "jsType", null);
        setField(term231610, term231610.getClass(), "parent", null);
        setField(term231607, term231607.getClass(), "first", term231610);
        setField(term231607, term231607.getClass(), "last", null);
        setField(term231607, term231607.getClass(), "propListHead", null);
        setIntField(term231607, term231607.getClass(), "sourcePosition", 0);
        setField(term231607, term231607.getClass(), "jsType", null);
        setField(term231607, term231607.getClass(), "parent", null);
        setField(term231606, term231606.getClass(), "first", term231607);
        setField(term231606, term231606.getClass(), "last", null);
        setField(term231606, term231606.getClass(), "propListHead", null);
        setIntField(term231606, term231606.getClass(), "sourcePosition", 0);
        setField(term231606, term231606.getClass(), "jsType", null);
        setField(term231606, term231606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term229770;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term229678, args);
        assertTrue(recursiveEquals(term229678, term231605));
        assertTrue(recursiveEquals(term229770, term231606));
    }

};


