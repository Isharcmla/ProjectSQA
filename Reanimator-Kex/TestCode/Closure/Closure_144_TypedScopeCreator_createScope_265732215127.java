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

public class TypedScopeCreator_createScope_265732215127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63569;
     Object term63741;
     Object term63999;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63569 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term63649 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63569, term63569.getClass(), "compiler", term63649);
        term63741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term63741, term63741.getClass(), "jsType", null);
        setIntField(term63741, term63741.getClass(), "type", 0);
        setField(term63833, term63833.getClass(), "next", term63925);
        setIntField(term63833, term63833.getClass(), "type", 132);
        setField(term63741, term63741.getClass(), "first", term63833);
        term63999 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term63999, term63999.getClass(), "rootNode", null);
        setField(term63999, term63999.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term63741;
        args[1] = term63999;
        try {
            callMethod(klass, "createScope", argTypes, term63569, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


