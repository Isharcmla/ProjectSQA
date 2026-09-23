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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class CodeConsumer_breakAfterBlockFor_144815601559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term186;

    public CodeConsumer_breakAfterBlockFor_144815601559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term159, term159.getClass(), "type", -655067527);
        setIntField(term161, term161.getClass(), "type", -6029667);
        setIntField(term163, term163.getClass(), "type", -2068769794);
        setIntField(term165, term165.getClass(), "type", -117576464);
        setIntField(term167, term167.getClass(), "type", -1007160944);
        setField(term167, term167.getClass(), "next", null);
        setField(term167, term167.getClass(), "first", null);
        setField(term167, term167.getClass(), "last", null);
        setField(term167, term167.getClass(), "propListHead", null);
        setIntField(term167, term167.getClass(), "sourcePosition", 0);
        setField(term167, term167.getClass(), "jsType", null);
        setField(term167, term167.getClass(), "parent", null);
        setField(term165, term165.getClass(), "next", term167);
        setIntField(term170, term170.getClass(), "type", 1135664017);
        setField(term170, term170.getClass(), "next", null);
        setField(term170, term170.getClass(), "first", null);
        setField(term170, term170.getClass(), "last", term167);
        setField(term170, term170.getClass(), "propListHead", null);
        setIntField(term170, term170.getClass(), "sourcePosition", 0);
        setField(term170, term170.getClass(), "jsType", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term165, term165.getClass(), "first", term170);
        setField(term165, term165.getClass(), "last", term163);
        setField(term165, term165.getClass(), "propListHead", null);
        setIntField(term165, term165.getClass(), "sourcePosition", 0);
        setField(term165, term165.getClass(), "jsType", null);
        setField(term165, term165.getClass(), "parent", null);
        setField(term163, term163.getClass(), "next", term165);
        setField(term163, term163.getClass(), "first", term167);
        setIntField(term174, term174.getClass(), "type", 865208305);
        setIntField(term176, term176.getClass(), "type", -1275173084);
        setField(term176, term176.getClass(), "next", null);
        setField(term176, term176.getClass(), "first", term170);
        setField(term176, term176.getClass(), "last", term165);
        setField(term176, term176.getClass(), "propListHead", null);
        setIntField(term176, term176.getClass(), "sourcePosition", 0);
        setField(term176, term176.getClass(), "jsType", null);
        setField(term176, term176.getClass(), "parent", null);
        setField(term174, term174.getClass(), "next", term176);
        setField(term174, term174.getClass(), "first", term161);
        setField(term174, term174.getClass(), "last", term161);
        setField(term174, term174.getClass(), "propListHead", null);
        setIntField(term174, term174.getClass(), "sourcePosition", 0);
        setField(term174, term174.getClass(), "jsType", null);
        setField(term174, term174.getClass(), "parent", null);
        setField(term163, term163.getClass(), "last", term174);
        setField(term163, term163.getClass(), "propListHead", null);
        setIntField(term163, term163.getClass(), "sourcePosition", 0);
        setField(term163, term163.getClass(), "jsType", null);
        setField(term163, term163.getClass(), "parent", null);
        setField(term161, term161.getClass(), "next", term163);
        setIntField(term181, term181.getClass(), "type", -244121226);
        setField(term181, term181.getClass(), "next", term174);
        setField(term181, term181.getClass(), "first", term176);
        setField(term181, term181.getClass(), "last", term159);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        setField(term161, term161.getClass(), "first", term181);
        setField(term161, term161.getClass(), "last", term181);
        setField(term161, term161.getClass(), "propListHead", null);
        setIntField(term161, term161.getClass(), "sourcePosition", 0);
        setField(term161, term161.getClass(), "jsType", null);
        setField(term161, term161.getClass(), "parent", null);
        setField(term159, term159.getClass(), "next", term161);
        setField(term159, term159.getClass(), "first", term165);
        setField(term159, term159.getClass(), "last", term167);
        setField(term159, term159.getClass(), "propListHead", null);
        setIntField(term159, term159.getClass(), "sourcePosition", 0);
        setField(term159, term159.getClass(), "jsType", null);
        setField(term159, term159.getClass(), "parent", null);
        term186 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeConsumer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term159;
        args[1] = term186;
        try {
            callMethod(klass, "breakAfterBlockFor", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


