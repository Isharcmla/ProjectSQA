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

public class TypedScopeCreator_createScope_265732215136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93103;
     Object term93253;
     Object term93563;

    public TypedScopeCreator_createScope_265732215136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93103 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term93183 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term93103, term93103.getClass(), "compiler", term93183);
        term93253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term93253, term93253.getClass(), "jsType", null);
        setIntField(term93253, term93253.getClass(), "type", 0);
        setField(term93393, term93393.getClass(), "next", null);
        setIntField(term93393, term93393.getClass(), "type", 132);
        setField(term93323, term93323.getClass(), "next", term93393);
        setIntField(term93323, term93323.getClass(), "type", 64);
        setField(term93323, term93323.getClass(), "first", null);
        setField(term93323, term93323.getClass(), "jsType", term93489);
        setField(term93253, term93253.getClass(), "first", term93323);
        term93563 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term93633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93563, term93563.getClass(), "rootNode", term93633);
        setField(term93563, term93563.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term93253;
        args[1] = term93563;
        try {
            callMethod(klass, "createScope", argTypes, term93103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


