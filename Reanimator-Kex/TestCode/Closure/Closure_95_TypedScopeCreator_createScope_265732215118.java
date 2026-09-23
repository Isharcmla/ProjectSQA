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

public class TypedScopeCreator_createScope_265732215118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77437;
     Object term77507;
     Object term77813;

    public TypedScopeCreator_createScope_265732215118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77437 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term77437, term77437.getClass(), "compiler", null);
        term77507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term77507, term77507.getClass(), "jsType", null);
        setIntField(term77507, term77507.getClass(), "type", 0);
        setField(term77647, term77647.getClass(), "next", null);
        setIntField(term77647, term77647.getClass(), "type", 40);
        setField(term77647, term77647.getClass(), "first", null);
        setField(term77577, term77577.getClass(), "next", term77647);
        setIntField(term77577, term77577.getClass(), "type", 64);
        setField(term77577, term77577.getClass(), "first", null);
        setField(term77577, term77577.getClass(), "jsType", term77739);
        setField(term77507, term77507.getClass(), "first", term77577);
        term77813 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term77883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77813, term77813.getClass(), "rootNode", term77883);
        setField(term77813, term77813.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term77507;
        args[1] = term77813;
        try {
            callMethod(klass, "createScope", argTypes, term77437, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


