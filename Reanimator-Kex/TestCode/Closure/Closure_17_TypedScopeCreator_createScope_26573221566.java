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

public class TypedScopeCreator_createScope_26573221566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41951;
     Object term42101;
     Object term42315;

    public TypedScopeCreator_createScope_26573221566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41951 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42031 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41951, term41951.getClass(), "compiler", term42031);
        term42101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42101, term42101.getClass(), "jsType", null);
        setIntField(term42101, term42101.getClass(), "type", 0);
        setField(term42101, term42101.getClass(), "parent", null);
        setField(term42171, term42171.getClass(), "next", null);
        setIntField(term42171, term42171.getClass(), "type", 43);
        setField(term42241, term42241.getClass(), "next", null);
        setIntField(term42241, term42241.getClass(), "type", 0);
        setField(term42241, term42241.getClass(), "first", null);
        setField(term42241, term42241.getClass(), "parent", null);
        setField(term42171, term42171.getClass(), "first", term42241);
        setField(term42101, term42101.getClass(), "first", term42171);
        term42315 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term42315, term42315.getClass(), "rootNode", null);
        setField(term42315, term42315.getClass(), "thisType", null);
        setIntField(term42315, term42315.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42101;
        args[1] = term42315;
        try {
            callMethod(klass, "createScope", argTypes, term41951, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


