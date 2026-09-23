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

public class ScopedAliases_hotSwapScript_88341709190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107877;
     Object term107969;
     Object term108390;
     Object term108391;

    public ScopedAliases_hotSwapScript_88341709190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107877 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term107877, term107877.getClass(), "compiler", null);
        term107969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108061 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term107969, term107969.getClass(), "type", 0);
        setField(term107969, term107969.getClass(), "parent", null);
        setField(term107969, term107969.getClass(), "first", term108061);
        term108390 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term108390, term108390.getClass(), "compiler", null);
        setField(term108390, term108390.getClass(), "preprocessorSymbolTable", null);
        setField(term108390, term108390.getClass(), "transformationHandler", null);
        term108391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term108391, term108391.getClass(), "number", 0.0);
        setIntField(term108391, term108391.getClass(), "type", 0);
        setField(term108391, term108391.getClass(), "next", null);
        setDoubleField(term108392, term108392.getClass(), "number", 0.0);
        setIntField(term108392, term108392.getClass(), "type", 0);
        setField(term108392, term108392.getClass(), "next", null);
        setField(term108392, term108392.getClass(), "first", null);
        setField(term108392, term108392.getClass(), "last", null);
        setField(term108392, term108392.getClass(), "propListHead", null);
        setIntField(term108392, term108392.getClass(), "sourcePosition", 0);
        setField(term108392, term108392.getClass(), "jsType", null);
        setField(term108392, term108392.getClass(), "parent", null);
        setField(term108391, term108391.getClass(), "first", term108392);
        setField(term108391, term108391.getClass(), "last", null);
        setField(term108391, term108391.getClass(), "propListHead", null);
        setIntField(term108391, term108391.getClass(), "sourcePosition", 0);
        setField(term108391, term108391.getClass(), "jsType", null);
        setField(term108391, term108391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term107969;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term107877, args);
        assertTrue(recursiveEquals(term107877, term108390));
        assertTrue(recursiveEquals(term107969, term108391));
    }

};


