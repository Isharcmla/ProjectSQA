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

public class TypedScopeCreator_createScope_265732215129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95030;
     Object term95100;
     Object term95314;

    public TypedScopeCreator_createScope_265732215129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95030 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term95030, term95030.getClass(), "compiler", null);
        term95100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95100, term95100.getClass(), "jsType", null);
        setIntField(term95100, term95100.getClass(), "type", 0);
        setField(term95100, term95100.getClass(), "parent", null);
        setField(term95240, term95240.getClass(), "next", null);
        setIntField(term95240, term95240.getClass(), "type", 39);
        setField(term95240, term95240.getClass(), "first", null);
        setField(term95170, term95170.getClass(), "next", term95240);
        setIntField(term95170, term95170.getClass(), "type", 0);
        setField(term95170, term95170.getClass(), "first", null);
        setField(term95100, term95100.getClass(), "first", term95170);
        term95314 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term95384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95314, term95314.getClass(), "rootNode", term95384);
        setField(term95314, term95314.getClass(), "thisType", null);
        setIntField(term95314, term95314.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term95100;
        args[1] = term95314;
        try {
            callMethod(klass, "createScope", argTypes, term95030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


