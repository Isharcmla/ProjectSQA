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

public class IR_not_1431350902228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29329;
     Object term29603;
     Object term29521;

    public IR_not_1431350902228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29329, term29329.getClass(), "type", 91);
        term29603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29603, term29603.getClass(), "type", 91);
        setField(term29603, term29603.getClass(), "next", null);
        setField(term29603, term29603.getClass(), "first", null);
        setField(term29603, term29603.getClass(), "last", null);
        setField(term29603, term29603.getClass(), "propListHead", null);
        setIntField(term29603, term29603.getClass(), "sourcePosition", 0);
        setField(term29603, term29603.getClass(), "jsType", null);
        setIntField(term29604, term29604.getClass(), "type", 26);
        setField(term29604, term29604.getClass(), "next", null);
        setField(term29604, term29604.getClass(), "first", term29603);
        setField(term29604, term29604.getClass(), "last", term29603);
        setField(term29604, term29604.getClass(), "propListHead", null);
        setIntField(term29604, term29604.getClass(), "sourcePosition", -1);
        setField(term29604, term29604.getClass(), "jsType", null);
        setField(term29604, term29604.getClass(), "parent", null);
        setField(term29603, term29603.getClass(), "parent", term29604);
        term29521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29521, term29521.getClass(), "type", 26);
        setField(term29521, term29521.getClass(), "next", null);
        setIntField(term29518, term29518.getClass(), "type", 91);
        setField(term29518, term29518.getClass(), "next", null);
        setField(term29518, term29518.getClass(), "first", null);
        setField(term29518, term29518.getClass(), "last", null);
        setField(term29518, term29518.getClass(), "propListHead", null);
        setIntField(term29518, term29518.getClass(), "sourcePosition", 0);
        setField(term29518, term29518.getClass(), "jsType", null);
        setField(term29518, term29518.getClass(), "parent", term29521);
        setField(term29521, term29521.getClass(), "first", term29518);
        setField(term29521, term29521.getClass(), "last", term29518);
        setField(term29521, term29521.getClass(), "propListHead", null);
        setIntField(term29521, term29521.getClass(), "sourcePosition", -1);
        setField(term29521, term29521.getClass(), "jsType", null);
        setField(term29521, term29521.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29329;
        Object retValue = callMethod(klass, "not", argTypes, null, args);
        assertTrue(recursiveEquals(term29329, term29603));
        assertTrue(recursiveEquals(retValue, term29521));
    }

};


