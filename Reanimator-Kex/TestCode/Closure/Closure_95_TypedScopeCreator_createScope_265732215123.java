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

public class TypedScopeCreator_createScope_265732215123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82019;
     Object term82169;
     Object term82479;

    public TypedScopeCreator_createScope_265732215123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82019 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term82099 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82019, term82019.getClass(), "compiler", term82099);
        term82169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term82169, term82169.getClass(), "jsType", null);
        setIntField(term82169, term82169.getClass(), "type", 0);
        setField(term82309, term82309.getClass(), "next", null);
        setIntField(term82309, term82309.getClass(), "type", 69);
        setField(term82309, term82309.getClass(), "first", null);
        setField(term82239, term82239.getClass(), "next", term82309);
        setIntField(term82239, term82239.getClass(), "type", 64);
        setField(term82239, term82239.getClass(), "first", null);
        setField(term82239, term82239.getClass(), "jsType", term82405);
        setField(term82169, term82169.getClass(), "first", term82239);
        term82479 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term82479, term82479.getClass(), "rootNode", null);
        setField(term82479, term82479.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term82169;
        args[1] = term82479;
        try {
            callMethod(klass, "createScope", argTypes, term82019, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


