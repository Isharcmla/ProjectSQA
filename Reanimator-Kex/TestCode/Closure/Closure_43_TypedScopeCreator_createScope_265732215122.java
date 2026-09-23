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

public class TypedScopeCreator_createScope_265732215122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86835;
     Object term86985;
     Object term87199;

    public TypedScopeCreator_createScope_265732215122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86835 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term86915 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term86835, term86835.getClass(), "compiler", term86915);
        term86985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86985, term86985.getClass(), "jsType", null);
        setIntField(term86985, term86985.getClass(), "type", 0);
        setField(term86985, term86985.getClass(), "parent", null);
        setField(term87055, term87055.getClass(), "next", null);
        setIntField(term87055, term87055.getClass(), "type", 39);
        setField(term87125, term87125.getClass(), "next", null);
        setIntField(term87125, term87125.getClass(), "type", 0);
        setField(term87125, term87125.getClass(), "first", null);
        setField(term87055, term87055.getClass(), "first", term87125);
        setField(term86985, term86985.getClass(), "first", term87055);
        term87199 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term87199, term87199.getClass(), "rootNode", null);
        setField(term87199, term87199.getClass(), "thisType", null);
        setIntField(term87199, term87199.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term86985;
        args[1] = term87199;
        try {
            callMethod(klass, "createScope", argTypes, term86835, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


