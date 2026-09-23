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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47523;
     Object term47593;
     Object term47947;

    public TypedScopeCreator_createScope_26573221581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47523 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term47523, term47523.getClass(), "compiler", null);
        term47593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47593, term47593.getClass(), "jsType", null);
        setIntField(term47593, term47593.getClass(), "type", 0);
        setField(term47593, term47593.getClass(), "parent", null);
        setField(term47733, term47733.getClass(), "next", term47803);
        setIntField(term47733, term47733.getClass(), "type", 122);
        setField(term47733, term47733.getClass(), "first", null);
        setField(term47663, term47663.getClass(), "next", term47733);
        setIntField(term47663, term47663.getClass(), "type", 0);
        setField(term47873, term47873.getClass(), "next", null);
        setIntField(term47873, term47873.getClass(), "type", 125);
        setField(term47873, term47873.getClass(), "first", null);
        setField(term47663, term47663.getClass(), "first", term47873);
        setField(term47593, term47593.getClass(), "first", term47663);
        term47947 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term47947, term47947.getClass(), "rootNode", null);
        setField(term47947, term47947.getClass(), "thisType", null);
        setIntField(term47947, term47947.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term47593;
        args[1] = term47947;
        callMethod(klass, "createScope", argTypes, term47523, args);
    }

};


