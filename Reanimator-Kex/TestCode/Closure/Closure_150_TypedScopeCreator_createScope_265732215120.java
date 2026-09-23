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

public class TypedScopeCreator_createScope_265732215120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71758;
     Object term71908;
     Object term72234;

    public TypedScopeCreator_createScope_265732215120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71758 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term71838 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term71758, term71758.getClass(), "compiler", term71838);
        term71908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term71908, term71908.getClass(), "jsType", null);
        setIntField(term71908, term71908.getClass(), "type", 0);
        setField(term72048, term72048.getClass(), "next", null);
        setIntField(term72048, term72048.getClass(), "type", 47);
        setField(term72048, term72048.getClass(), "first", null);
        setField(term71978, term71978.getClass(), "next", term72048);
        setIntField(term71978, term71978.getClass(), "type", 64);
        setField(term71978, term71978.getClass(), "first", null);
        setField(term71978, term71978.getClass(), "jsType", term72160);
        setField(term71908, term71908.getClass(), "first", term71978);
        term72234 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term72304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72234, term72234.getClass(), "rootNode", term72304);
        setField(term72234, term72234.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term71908;
        args[1] = term72234;
        try {
            callMethod(klass, "createScope", argTypes, term71758, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


