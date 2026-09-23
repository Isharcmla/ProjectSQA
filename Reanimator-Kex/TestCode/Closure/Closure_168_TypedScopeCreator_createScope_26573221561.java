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

public class TypedScopeCreator_createScope_26573221561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34283;
     Object term34433;
     Object term34717;

    public TypedScopeCreator_createScope_26573221561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34283 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term34363 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34283, term34283.getClass(), "compiler", term34363);
        term34433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34433, term34433.getClass(), "jsType", null);
        setIntField(term34433, term34433.getClass(), "type", 0);
        setField(term34433, term34433.getClass(), "parent", null);
        setField(term34503, term34503.getClass(), "next", term34573);
        setIntField(term34503, term34503.getClass(), "type", 0);
        setField(term34643, term34643.getClass(), "next", null);
        setIntField(term34643, term34643.getClass(), "type", 122);
        setField(term34643, term34643.getClass(), "first", null);
        setField(term34503, term34503.getClass(), "first", term34643);
        setField(term34433, term34433.getClass(), "first", term34503);
        term34717 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term34787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34717, term34717.getClass(), "rootNode", term34787);
        setField(term34717, term34717.getClass(), "thisType", null);
        setIntField(term34717, term34717.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term34433;
        args[1] = term34717;
        try {
            callMethod(klass, "createScope", argTypes, term34283, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


