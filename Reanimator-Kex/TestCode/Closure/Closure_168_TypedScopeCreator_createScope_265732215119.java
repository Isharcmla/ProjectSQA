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

public class TypedScopeCreator_createScope_265732215119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71297;
     Object term71447;
     Object term71731;

    public TypedScopeCreator_createScope_265732215119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71297 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term71377 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71297, term71297.getClass(), "compiler", term71377);
        term71447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71447, term71447.getClass(), "jsType", null);
        setIntField(term71447, term71447.getClass(), "type", 0);
        setField(term71447, term71447.getClass(), "parent", null);
        setField(term71517, term71517.getClass(), "next", null);
        setIntField(term71517, term71517.getClass(), "type", 0);
        setField(term71657, term71657.getClass(), "next", null);
        setIntField(term71657, term71657.getClass(), "type", 39);
        setField(term71657, term71657.getClass(), "first", null);
        setField(term71587, term71587.getClass(), "next", term71657);
        setIntField(term71587, term71587.getClass(), "type", 0);
        setField(term71587, term71587.getClass(), "first", null);
        setField(term71587, term71587.getClass(), "parent", null);
        setField(term71517, term71517.getClass(), "first", term71587);
        setField(term71447, term71447.getClass(), "first", term71517);
        term71731 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term71801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71731, term71731.getClass(), "rootNode", term71801);
        setField(term71731, term71731.getClass(), "thisType", null);
        setIntField(term71731, term71731.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term71447;
        args[1] = term71731;
        try {
            callMethod(klass, "createScope", argTypes, term71297, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


