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

public class TypedScopeCreator_createScope_26573221571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47350;
     Object term47500;
     Object term47784;

    public TypedScopeCreator_createScope_26573221571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47350 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term47430 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47350, term47350.getClass(), "compiler", term47430);
        term47500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47500, term47500.getClass(), "jsType", null);
        setIntField(term47500, term47500.getClass(), "type", 0);
        setField(term47500, term47500.getClass(), "parent", null);
        setField(term47640, term47640.getClass(), "next", null);
        setIntField(term47640, term47640.getClass(), "type", 0);
        setField(term47640, term47640.getClass(), "first", null);
        setField(term47640, term47640.getClass(), "parent", null);
        setField(term47570, term47570.getClass(), "next", term47640);
        setIntField(term47570, term47570.getClass(), "type", 0);
        setField(term47710, term47710.getClass(), "next", null);
        setIntField(term47710, term47710.getClass(), "type", 0);
        setField(term47710, term47710.getClass(), "first", null);
        setField(term47710, term47710.getClass(), "parent", null);
        setField(term47570, term47570.getClass(), "first", term47710);
        setField(term47570, term47570.getClass(), "parent", null);
        setField(term47500, term47500.getClass(), "first", term47570);
        term47784 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term47854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term47784, term47784.getClass(), "rootNode", term47854);
        setField(term47784, term47784.getClass(), "thisType", term47952);
        setIntField(term47784, term47784.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term47500;
        args[1] = term47784;
        try {
            callMethod(klass, "createScope", argTypes, term47350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


