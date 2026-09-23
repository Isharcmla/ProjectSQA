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

public class IR_throwNode_940306539151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17725;
     Object term17966;
     Object term17890;

    public IR_throwNode_940306539151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17725, term17725.getClass(), "type", 95);
        term17966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17966, term17966.getClass(), "type", 95);
        setField(term17966, term17966.getClass(), "next", null);
        setField(term17966, term17966.getClass(), "first", null);
        setField(term17966, term17966.getClass(), "last", null);
        setField(term17966, term17966.getClass(), "propListHead", null);
        setIntField(term17966, term17966.getClass(), "sourcePosition", 0);
        setField(term17966, term17966.getClass(), "jsType", null);
        setIntField(term17967, term17967.getClass(), "type", 49);
        setField(term17967, term17967.getClass(), "next", null);
        setField(term17967, term17967.getClass(), "first", term17966);
        setField(term17967, term17967.getClass(), "last", term17966);
        setField(term17967, term17967.getClass(), "propListHead", null);
        setIntField(term17967, term17967.getClass(), "sourcePosition", -1);
        setField(term17967, term17967.getClass(), "jsType", null);
        setField(term17967, term17967.getClass(), "parent", null);
        setField(term17966, term17966.getClass(), "parent", term17967);
        term17890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17890, term17890.getClass(), "type", 49);
        setField(term17890, term17890.getClass(), "next", null);
        setIntField(term17887, term17887.getClass(), "type", 95);
        setField(term17887, term17887.getClass(), "next", null);
        setField(term17887, term17887.getClass(), "first", null);
        setField(term17887, term17887.getClass(), "last", null);
        setField(term17887, term17887.getClass(), "propListHead", null);
        setIntField(term17887, term17887.getClass(), "sourcePosition", 0);
        setField(term17887, term17887.getClass(), "jsType", null);
        setField(term17887, term17887.getClass(), "parent", term17890);
        setField(term17890, term17890.getClass(), "first", term17887);
        setField(term17890, term17890.getClass(), "last", term17887);
        setField(term17890, term17890.getClass(), "propListHead", null);
        setIntField(term17890, term17890.getClass(), "sourcePosition", -1);
        setField(term17890, term17890.getClass(), "jsType", null);
        setField(term17890, term17890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17725;
        Object retValue = callMethod(klass, "throwNode", argTypes, null, args);
        assertTrue(recursiveEquals(term17725, term17966));
        assertTrue(recursiveEquals(retValue, term17890));
    }

};


