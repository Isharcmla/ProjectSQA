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

public class TypedScopeCreator_createScope_26573221581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59369;
     Object term59519;
     Object term59803;

    public TypedScopeCreator_createScope_26573221581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59369 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term59449 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59369, term59369.getClass(), "compiler", term59449);
        term59519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59519, term59519.getClass(), "jsType", null);
        setIntField(term59519, term59519.getClass(), "type", 0);
        setField(term59519, term59519.getClass(), "parent", null);
        setField(term59659, term59659.getClass(), "next", null);
        setIntField(term59659, term59659.getClass(), "type", 47);
        setField(term59659, term59659.getClass(), "first", null);
        setField(term59589, term59589.getClass(), "next", term59659);
        setIntField(term59589, term59589.getClass(), "type", 0);
        setField(term59729, term59729.getClass(), "next", null);
        setIntField(term59729, term59729.getClass(), "type", 0);
        setField(term59729, term59729.getClass(), "first", null);
        setField(term59729, term59729.getClass(), "parent", null);
        setField(term59589, term59589.getClass(), "first", term59729);
        setField(term59589, term59589.getClass(), "parent", null);
        setField(term59519, term59519.getClass(), "first", term59589);
        term59803 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term59803, term59803.getClass(), "rootNode", null);
        setField(term59803, term59803.getClass(), "thisType", null);
        setIntField(term59803, term59803.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term59519;
        args[1] = term59803;
        try {
            callMethod(klass, "createScope", argTypes, term59369, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


