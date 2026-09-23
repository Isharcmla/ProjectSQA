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

public class TypedScopeCreator_createScope_265732215117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83613;
     Object term83683;
     Object term83897;

    public TypedScopeCreator_createScope_265732215117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83613 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term83613, term83613.getClass(), "compiler", null);
        term83683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83683, term83683.getClass(), "jsType", null);
        setIntField(term83683, term83683.getClass(), "type", 0);
        setField(term83683, term83683.getClass(), "parent", null);
        setField(term83753, term83753.getClass(), "next", null);
        setIntField(term83753, term83753.getClass(), "type", 0);
        setField(term83932, term83932.getClass(), "next", null);
        setIntField(term83932, term83932.getClass(), "type", 122);
        setField(term83932, term83932.getClass(), "first", null);
        setField(term83753, term83753.getClass(), "first", term83932);
        setField(term83683, term83683.getClass(), "first", term83753);
        term83897 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term83897, term83897.getClass(), "rootNode", term83932);
        setField(term83897, term83897.getClass(), "thisType", null);
        setIntField(term83897, term83897.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term83683;
        args[1] = term83897;
        try {
            callMethod(klass, "createScope", argTypes, term83613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


