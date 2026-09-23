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

public class TypedScopeCreator_createScope_26573221545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18186;
     Object term18256;
     Object term18610;

    public TypedScopeCreator_createScope_26573221545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18186 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term18186, term18186.getClass(), "compiler", null);
        term18256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18256, term18256.getClass(), "jsType", null);
        setIntField(term18256, term18256.getClass(), "type", 0);
        setField(term18256, term18256.getClass(), "parent", null);
        setField(term18396, term18396.getClass(), "next", term18466);
        setIntField(term18396, term18396.getClass(), "type", 125);
        setField(term18326, term18326.getClass(), "next", term18396);
        setIntField(term18326, term18326.getClass(), "type", 0);
        setField(term18536, term18536.getClass(), "next", null);
        setIntField(term18536, term18536.getClass(), "type", 0);
        setField(term18536, term18536.getClass(), "first", null);
        setField(term18326, term18326.getClass(), "first", term18536);
        setField(term18256, term18256.getClass(), "first", term18326);
        term18610 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term18680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18610, term18610.getClass(), "rootNode", term18680);
        setField(term18610, term18610.getClass(), "thisType", null);
        setIntField(term18610, term18610.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term18256;
        args[1] = term18610;
        try {
            callMethod(klass, "createScope", argTypes, term18186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


