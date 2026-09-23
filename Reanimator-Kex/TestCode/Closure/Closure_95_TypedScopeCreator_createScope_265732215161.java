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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117036;
     Object term117186;
     Object term117400;

    public TypedScopeCreator_createScope_265732215161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117036 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term117116 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term117036, term117036.getClass(), "compiler", term117116);
        term117186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117186, term117186.getClass(), "jsType", null);
        setIntField(term117186, term117186.getClass(), "type", 0);
        setField(term117256, term117256.getClass(), "next", null);
        setIntField(term117256, term117256.getClass(), "type", 64);
        setField(term117326, term117326.getClass(), "next", null);
        setIntField(term117326, term117326.getClass(), "type", 0);
        setField(term117326, term117326.getClass(), "first", null);
        setField(term117256, term117256.getClass(), "first", term117326);
        setField(term117186, term117186.getClass(), "first", term117256);
        term117400 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term117470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117400, term117400.getClass(), "rootNode", term117470);
        setField(term117400, term117400.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term117186;
        args[1] = term117400;
        try {
            callMethod(klass, "createScope", argTypes, term117036, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


