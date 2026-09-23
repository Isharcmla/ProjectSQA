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
import java.lang.reflect.InvocationTargetException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85250;
     Object term85320;
     Object term85744;

    public TypedScopeCreator_createScope_265732215135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85250 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term85250, term85250.getClass(), "compiler", null);
        term85320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85320, term85320.getClass(), "jsType", null);
        setIntField(term85320, term85320.getClass(), "type", 0);
        setField(term85320, term85320.getClass(), "parent", null);
        setField(term85390, term85390.getClass(), "next", term85460);
        setIntField(term85390, term85390.getClass(), "type", 0);
        setField(term85600, term85600.getClass(), "next", null);
        setIntField(term85600, term85600.getClass(), "type", 0);
        setField(term85600, term85600.getClass(), "first", null);
        setField(term85600, term85600.getClass(), "parent", null);
        setField(term85530, term85530.getClass(), "next", term85600);
        setIntField(term85530, term85530.getClass(), "type", 0);
        setField(term85530, term85530.getClass(), "first", null);
        setField(term85530, term85530.getClass(), "parent", null);
        setField(term85390, term85390.getClass(), "first", term85530);
        setField(term85390, term85390.getClass(), "parent", term85670);
        setField(term85320, term85320.getClass(), "first", term85390);
        term85744 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term85814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term85744, term85744.getClass(), "rootNode", term85814);
        setField(term85744, term85744.getClass(), "thisType", term85938);
        setIntField(term85744, term85744.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term85320;
        args[1] = term85744;
        try {
            callMethod(klass, "createScope", argTypes, term85250, args);
            assertTrue(false);
        }
        catch (InvocationTargetException e) {
        }

    }

};


