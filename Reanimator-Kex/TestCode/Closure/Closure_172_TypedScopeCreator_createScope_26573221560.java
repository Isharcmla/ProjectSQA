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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25342;
     Object term25492;
     Object term25636;

    public TypedScopeCreator_createScope_26573221560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25342 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term25422 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25422, term25422.getClass(), "phaseOptimizer", null);
        setField(term25342, term25342.getClass(), "compiler", term25422);
        term25492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25492, term25492.getClass(), "type", 0);
        setIntField(term25562, term25562.getClass(), "type", 0);
        setField(term25562, term25562.getClass(), "parent", null);
        setField(term25492, term25492.getClass(), "parent", term25562);
        setField(term25492, term25492.getClass(), "first", null);
        term25636 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term25706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25636, term25636.getClass(), "rootNode", term25706);
        setIntField(term25636, term25636.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term25492;
        args[1] = term25636;
        callMethod(klass, "createScope", argTypes, term25342, args);
    }

};


