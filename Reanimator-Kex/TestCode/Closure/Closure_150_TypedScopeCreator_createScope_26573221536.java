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

public class TypedScopeCreator_createScope_26573221536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17511;
     Object term17661;
     Object term17805;

    public TypedScopeCreator_createScope_26573221536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17511 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17591 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17511, term17511.getClass(), "compiler", term17591);
        term17661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17661, term17661.getClass(), "jsType", null);
        setIntField(term17661, term17661.getClass(), "type", 0);
        setField(term17731, term17731.getClass(), "next", null);
        setIntField(term17731, term17731.getClass(), "type", 39);
        setField(term17731, term17731.getClass(), "first", null);
        setField(term17661, term17661.getClass(), "first", term17731);
        term17805 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term17805, term17805.getClass(), "rootNode", null);
        setField(term17805, term17805.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term17661;
        args[1] = term17805;
        try {
            callMethod(klass, "createScope", argTypes, term17511, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


