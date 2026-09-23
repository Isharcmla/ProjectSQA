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

public class TypedScopeCreator_createScope_26573221567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40372;
     Object term40522;
     Object term40666;

    public TypedScopeCreator_createScope_26573221567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40372 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term40452 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40372, term40372.getClass(), "compiler", term40452);
        term40522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40522, term40522.getClass(), "jsType", null);
        setIntField(term40522, term40522.getClass(), "type", 126);
        setField(term40522, term40522.getClass(), "parent", null);
        setIntField(term40592, term40592.getClass(), "type", 122);
        setField(term40592, term40592.getClass(), "next", null);
        setField(term40592, term40592.getClass(), "first", null);
        setField(term40522, term40522.getClass(), "first", term40592);
        term40666 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term40736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40666, term40666.getClass(), "rootNode", term40736);
        setField(term40666, term40666.getClass(), "thisType", null);
        setIntField(term40666, term40666.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term40522;
        args[1] = term40666;
        try {
            callMethod(klass, "createScope", argTypes, term40372, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


