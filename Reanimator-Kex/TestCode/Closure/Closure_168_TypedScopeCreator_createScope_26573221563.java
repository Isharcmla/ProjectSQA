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

public class TypedScopeCreator_createScope_26573221563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36517;
     Object term36587;
     Object term36871;

    public TypedScopeCreator_createScope_26573221563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36517 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term36517, term36517.getClass(), "compiler", null);
        term36587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36587, term36587.getClass(), "jsType", null);
        setIntField(term36587, term36587.getClass(), "type", 0);
        setField(term36587, term36587.getClass(), "parent", null);
        setField(term36657, term36657.getClass(), "next", term36727);
        setIntField(term36657, term36657.getClass(), "type", 122);
        setField(term36797, term36797.getClass(), "next", null);
        setIntField(term36797, term36797.getClass(), "type", 0);
        setField(term36797, term36797.getClass(), "first", null);
        setField(term36797, term36797.getClass(), "parent", null);
        setField(term36657, term36657.getClass(), "first", term36797);
        setField(term36587, term36587.getClass(), "first", term36657);
        term36871 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term36941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36871, term36871.getClass(), "rootNode", term36941);
        setField(term36871, term36871.getClass(), "thisType", null);
        setIntField(term36871, term36871.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term36587;
        args[1] = term36871;
        try {
            callMethod(klass, "createScope", argTypes, term36517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


