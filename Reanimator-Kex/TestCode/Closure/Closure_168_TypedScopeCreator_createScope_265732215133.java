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

public class TypedScopeCreator_createScope_265732215133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80598;
     Object term80770;
     Object term80936;

    public TypedScopeCreator_createScope_265732215133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80598 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term80678 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term80598, term80598.getClass(), "compiler", term80678);
        term80770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term80770, term80770.getClass(), "jsType", null);
        setIntField(term80770, term80770.getClass(), "type", -133);
        setField(term80770, term80770.getClass(), "parent", term80862);
        term80936 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term81028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term80936, term80936.getClass(), "rootNode", term81028);
        setField(term80936, term80936.getClass(), "thisType", null);
        setIntField(term80936, term80936.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term80770;
        args[1] = term80936;
        try {
            callMethod(klass, "createScope", argTypes, term80598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


