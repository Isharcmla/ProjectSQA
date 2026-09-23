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

public class TypedScopeCreator_createScope_26573221575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53165;
     Object term53235;
     Object term53589;

    public TypedScopeCreator_createScope_26573221575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53165 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term53165, term53165.getClass(), "compiler", null);
        term53235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53235, term53235.getClass(), "jsType", null);
        setIntField(term53235, term53235.getClass(), "type", 0);
        setField(term53235, term53235.getClass(), "parent", null);
        setField(term53445, term53445.getClass(), "next", null);
        setIntField(term53445, term53445.getClass(), "type", 43);
        setField(term53445, term53445.getClass(), "first", null);
        setField(term53375, term53375.getClass(), "next", term53445);
        setIntField(term53375, term53375.getClass(), "type", 125);
        setField(term53375, term53375.getClass(), "first", null);
        setField(term53375, term53375.getClass(), "parent", null);
        setField(term53305, term53305.getClass(), "next", term53375);
        setIntField(term53305, term53305.getClass(), "type", 0);
        setField(term53515, term53515.getClass(), "next", null);
        setIntField(term53515, term53515.getClass(), "type", 0);
        setField(term53515, term53515.getClass(), "first", null);
        setField(term53515, term53515.getClass(), "parent", null);
        setField(term53305, term53305.getClass(), "first", term53515);
        setField(term53305, term53305.getClass(), "parent", null);
        setField(term53235, term53235.getClass(), "first", term53305);
        term53589 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term53589, term53589.getClass(), "rootNode", null);
        setField(term53589, term53589.getClass(), "thisType", null);
        setIntField(term53589, term53589.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term53235;
        args[1] = term53589;
        try {
            callMethod(klass, "createScope", argTypes, term53165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


