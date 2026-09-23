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

public class TypedScopeCreator_createScope_265732215139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95176;
     Object term95326;
     Object term95634;

    public TypedScopeCreator_createScope_265732215139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95176 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term95256 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term95176, term95176.getClass(), "compiler", term95256);
        term95326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term95326, term95326.getClass(), "jsType", null);
        setIntField(term95326, term95326.getClass(), "type", 0);
        setField(term95466, term95466.getClass(), "next", null);
        setIntField(term95466, term95466.getClass(), "type", 83);
        setField(term95466, term95466.getClass(), "first", null);
        setField(term95396, term95396.getClass(), "next", term95466);
        setIntField(term95396, term95396.getClass(), "type", 64);
        setField(term95396, term95396.getClass(), "first", null);
        setField(term95396, term95396.getClass(), "jsType", term95560);
        setField(term95326, term95326.getClass(), "first", term95396);
        term95634 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term95704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95634, term95634.getClass(), "rootNode", term95704);
        setField(term95634, term95634.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term95326;
        args[1] = term95634;
        try {
            callMethod(klass, "createScope", argTypes, term95176, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


