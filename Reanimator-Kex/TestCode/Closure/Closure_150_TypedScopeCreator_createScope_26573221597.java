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

public class TypedScopeCreator_createScope_26573221597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58106;
     Object term58256;
     Object term58470;

    public TypedScopeCreator_createScope_26573221597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58106 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term58186 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58106, term58106.getClass(), "compiler", term58186);
        term58256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58256, term58256.getClass(), "jsType", null);
        setIntField(term58256, term58256.getClass(), "type", 0);
        setField(term58326, term58326.getClass(), "next", term58396);
        setIntField(term58326, term58326.getClass(), "type", 64);
        setField(term58326, term58326.getClass(), "first", null);
        setField(term58326, term58326.getClass(), "jsType", null);
        setField(term58256, term58256.getClass(), "first", term58326);
        term58470 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term58470, term58470.getClass(), "rootNode", null);
        setField(term58470, term58470.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term58256;
        args[1] = term58470;
        try {
            callMethod(klass, "createScope", argTypes, term58106, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


