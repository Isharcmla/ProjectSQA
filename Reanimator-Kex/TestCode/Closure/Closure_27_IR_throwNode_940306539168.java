package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_throwNode_940306539168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20269;
     Object term20430;
     Object term20354;

    public IR_throwNode_940306539168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20269, term20269.getClass(), "type", 90);
        term20430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20430, term20430.getClass(), "type", 90);
        setField(term20430, term20430.getClass(), "next", null);
        setField(term20430, term20430.getClass(), "first", null);
        setField(term20430, term20430.getClass(), "last", null);
        setField(term20430, term20430.getClass(), "propListHead", null);
        setIntField(term20430, term20430.getClass(), "sourcePosition", 0);
        setField(term20430, term20430.getClass(), "jsType", null);
        setIntField(term20431, term20431.getClass(), "type", 49);
        setField(term20431, term20431.getClass(), "next", null);
        setField(term20431, term20431.getClass(), "first", term20430);
        setField(term20431, term20431.getClass(), "last", term20430);
        setField(term20431, term20431.getClass(), "propListHead", null);
        setIntField(term20431, term20431.getClass(), "sourcePosition", -1);
        setField(term20431, term20431.getClass(), "jsType", null);
        setField(term20431, term20431.getClass(), "parent", null);
        setField(term20430, term20430.getClass(), "parent", term20431);
        term20354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20354, term20354.getClass(), "type", 49);
        setField(term20354, term20354.getClass(), "next", null);
        setIntField(term20351, term20351.getClass(), "type", 90);
        setField(term20351, term20351.getClass(), "next", null);
        setField(term20351, term20351.getClass(), "first", null);
        setField(term20351, term20351.getClass(), "last", null);
        setField(term20351, term20351.getClass(), "propListHead", null);
        setIntField(term20351, term20351.getClass(), "sourcePosition", 0);
        setField(term20351, term20351.getClass(), "jsType", null);
        setField(term20351, term20351.getClass(), "parent", term20354);
        setField(term20354, term20354.getClass(), "first", term20351);
        setField(term20354, term20354.getClass(), "last", term20351);
        setField(term20354, term20354.getClass(), "propListHead", null);
        setIntField(term20354, term20354.getClass(), "sourcePosition", -1);
        setField(term20354, term20354.getClass(), "jsType", null);
        setField(term20354, term20354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20269;
        Object retValue = callMethod(klass, "throwNode", argTypes, null, args);
        assertTrue(recursiveEquals(term20269, term20430));
        assertTrue(recursiveEquals(retValue, term20354));
    }

};


