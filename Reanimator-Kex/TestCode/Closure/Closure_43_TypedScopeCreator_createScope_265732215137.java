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

public class TypedScopeCreator_createScope_265732215137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101444;
     Object term101514;
     Object term101658;

    public TypedScopeCreator_createScope_265732215137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101444 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term101444, term101444.getClass(), "compiler", null);
        term101514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101514, term101514.getClass(), "jsType", null);
        setIntField(term101514, term101514.getClass(), "type", 0);
        setField(term101514, term101514.getClass(), "parent", null);
        setField(term101584, term101584.getClass(), "next", null);
        setIntField(term101584, term101584.getClass(), "type", 0);
        setField(term101584, term101584.getClass(), "first", null);
        setField(term101514, term101514.getClass(), "first", term101584);
        term101658 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term101728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101658, term101658.getClass(), "rootNode", term101728);
        setField(term101658, term101658.getClass(), "thisType", null);
        setIntField(term101658, term101658.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term101514;
        args[1] = term101658;
        try {
            callMethod(klass, "createScope", argTypes, term101444, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


