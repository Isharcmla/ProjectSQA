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

public class TypedScopeCreator_createScope_265732215185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127657;
     Object term127807;
     Object term128185;

    public TypedScopeCreator_createScope_265732215185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127657 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term127737 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127657, term127657.getClass(), "compiler", term127737);
        term127807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term127807, term127807.getClass(), "jsType", null);
        setIntField(term127807, term127807.getClass(), "type", 0);
        setField(term128017, term128017.getClass(), "next", null);
        setIntField(term128017, term128017.getClass(), "type", 47);
        setField(term128017, term128017.getClass(), "first", null);
        setField(term127947, term127947.getClass(), "next", term128017);
        setIntField(term127947, term127947.getClass(), "type", 0);
        setField(term127947, term127947.getClass(), "first", null);
        setField(term127877, term127877.getClass(), "next", term127947);
        setIntField(term127877, term127877.getClass(), "type", 64);
        setField(term127877, term127877.getClass(), "first", null);
        setField(term127877, term127877.getClass(), "jsType", term128111);
        setField(term127807, term127807.getClass(), "first", term127877);
        term128185 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term128185, term128185.getClass(), "rootNode", null);
        setField(term128185, term128185.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term127807;
        args[1] = term128185;
        try {
            callMethod(klass, "createScope", argTypes, term127657, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


