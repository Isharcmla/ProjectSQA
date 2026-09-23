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

public class TypedScopeCreator_createScope_265732215157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112672;
     Object term112822;
     Object term113176;

    public TypedScopeCreator_createScope_265732215157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112672 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term112752 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term112672, term112672.getClass(), "compiler", term112752);
        term112822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112822, term112822.getClass(), "jsType", null);
        setIntField(term112822, term112822.getClass(), "type", 0);
        setField(term113246, term113246.getClass(), "next", term113281);
        setIntField(term113246, term113246.getClass(), "type", 105);
        setField(term113211, term113211.getClass(), "next", term113246);
        setIntField(term113211, term113211.getClass(), "type", 0);
        setField(term113316, term113316.getClass(), "next", null);
        setIntField(term113316, term113316.getClass(), "type", 0);
        setField(term113316, term113316.getClass(), "first", null);
        setField(term113211, term113211.getClass(), "first", term113316);
        setField(term112822, term112822.getClass(), "first", term113211);
        term113176 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term113428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term113176, term113176.getClass(), "rootNode", term113211);
        setField(term113176, term113176.getClass(), "thisType", term113428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term112822;
        args[1] = term113176;
        try {
            callMethod(klass, "createScope", argTypes, term112672, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


