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

public class TypedScopeCreator_createScope_265732215103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62590;
     Object term62660;
     Object term62974;

    public TypedScopeCreator_createScope_265732215103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62590 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term62590, term62590.getClass(), "compiler", null);
        term62660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62660, term62660.getClass(), "jsType", null);
        setIntField(term62660, term62660.getClass(), "type", 0);
        setField(term62730, term62730.getClass(), "next", term62800);
        setIntField(term62730, term62730.getClass(), "type", 64);
        setField(term62730, term62730.getClass(), "first", null);
        setField(term62730, term62730.getClass(), "jsType", term62900);
        setField(term62660, term62660.getClass(), "first", term62730);
        term62974 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term63044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term62974, term62974.getClass(), "rootNode", term63044);
        setField(term62974, term62974.getClass(), "thisType", term63150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term62660;
        args[1] = term62974;
        try {
            callMethod(klass, "createScope", argTypes, term62590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


