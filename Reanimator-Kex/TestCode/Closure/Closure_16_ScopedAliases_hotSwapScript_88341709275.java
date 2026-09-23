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

public class ScopedAliases_hotSwapScript_88341709275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176154;
     Object term176224;
     Object term178453;
     Object term178454;

    public ScopedAliases_hotSwapScript_88341709275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176154 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term176154, term176154.getClass(), "compiler", null);
        term176224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176224, term176224.getClass(), "type", 37);
        setField(term176224, term176224.getClass(), "parent", null);
        setField(term176434, term176434.getClass(), "next", null);
        setIntField(term176434, term176434.getClass(), "type", 0);
        setField(term176434, term176434.getClass(), "first", null);
        setField(term176364, term176364.getClass(), "next", term176434);
        setIntField(term176364, term176364.getClass(), "type", 37);
        setField(term176504, term176504.getClass(), "next", null);
        setIntField(term176504, term176504.getClass(), "type", 0);
        setField(term176504, term176504.getClass(), "first", null);
        setField(term176364, term176364.getClass(), "first", term176504);
        setField(term176294, term176294.getClass(), "next", term176364);
        setIntField(term176294, term176294.getClass(), "type", 0);
        setField(term176574, term176574.getClass(), "next", null);
        setIntField(term176574, term176574.getClass(), "type", 0);
        setField(term176574, term176574.getClass(), "first", null);
        setField(term176294, term176294.getClass(), "first", term176574);
        setField(term176224, term176224.getClass(), "first", term176294);
        term178453 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term178453, term178453.getClass(), "compiler", null);
        setField(term178453, term178453.getClass(), "preprocessorSymbolTable", null);
        setField(term178453, term178453.getClass(), "transformationHandler", null);
        term178454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178454, term178454.getClass(), "type", 37);
        setField(term178454, term178454.getClass(), "next", null);
        setIntField(term178455, term178455.getClass(), "type", 0);
        setIntField(term178456, term178456.getClass(), "type", 37);
        setIntField(term178457, term178457.getClass(), "type", 0);
        setField(term178457, term178457.getClass(), "next", null);
        setField(term178457, term178457.getClass(), "first", null);
        setField(term178457, term178457.getClass(), "last", null);
        setField(term178457, term178457.getClass(), "propListHead", null);
        setIntField(term178457, term178457.getClass(), "sourcePosition", 0);
        setField(term178457, term178457.getClass(), "jsType", null);
        setField(term178457, term178457.getClass(), "parent", null);
        setField(term178456, term178456.getClass(), "next", term178457);
        setIntField(term178458, term178458.getClass(), "type", 0);
        setField(term178458, term178458.getClass(), "next", null);
        setField(term178458, term178458.getClass(), "first", null);
        setField(term178458, term178458.getClass(), "last", null);
        setField(term178458, term178458.getClass(), "propListHead", null);
        setIntField(term178458, term178458.getClass(), "sourcePosition", 0);
        setField(term178458, term178458.getClass(), "jsType", null);
        setField(term178458, term178458.getClass(), "parent", null);
        setField(term178456, term178456.getClass(), "first", term178458);
        setField(term178456, term178456.getClass(), "last", null);
        setField(term178456, term178456.getClass(), "propListHead", null);
        setIntField(term178456, term178456.getClass(), "sourcePosition", 0);
        setField(term178456, term178456.getClass(), "jsType", null);
        setField(term178456, term178456.getClass(), "parent", null);
        setField(term178455, term178455.getClass(), "next", term178456);
        setIntField(term178459, term178459.getClass(), "type", 0);
        setField(term178459, term178459.getClass(), "next", null);
        setField(term178459, term178459.getClass(), "first", null);
        setField(term178459, term178459.getClass(), "last", null);
        setField(term178459, term178459.getClass(), "propListHead", null);
        setIntField(term178459, term178459.getClass(), "sourcePosition", 0);
        setField(term178459, term178459.getClass(), "jsType", null);
        setField(term178459, term178459.getClass(), "parent", null);
        setField(term178455, term178455.getClass(), "first", term178459);
        setField(term178455, term178455.getClass(), "last", null);
        setField(term178455, term178455.getClass(), "propListHead", null);
        setIntField(term178455, term178455.getClass(), "sourcePosition", 0);
        setField(term178455, term178455.getClass(), "jsType", null);
        setField(term178455, term178455.getClass(), "parent", null);
        setField(term178454, term178454.getClass(), "first", term178455);
        setField(term178454, term178454.getClass(), "last", null);
        setField(term178454, term178454.getClass(), "propListHead", null);
        setIntField(term178454, term178454.getClass(), "sourcePosition", 0);
        setField(term178454, term178454.getClass(), "jsType", null);
        setField(term178454, term178454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term176224;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term176154, args);
        assertTrue(recursiveEquals(term176154, term178453));
        assertTrue(recursiveEquals(term176224, term178454));
    }

};


