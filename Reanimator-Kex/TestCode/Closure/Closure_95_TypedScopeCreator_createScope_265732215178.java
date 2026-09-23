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

public class TypedScopeCreator_createScope_265732215178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132562;
     Object term132712;
     Object term132926;

    public TypedScopeCreator_createScope_265732215178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132562 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term132642 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term132562, term132562.getClass(), "compiler", term132642);
        term132712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132712, term132712.getClass(), "jsType", null);
        setIntField(term132712, term132712.getClass(), "type", 0);
        setField(term132782, term132782.getClass(), "next", null);
        setIntField(term132782, term132782.getClass(), "type", 43);
        setField(term132852, term132852.getClass(), "next", null);
        setIntField(term132852, term132852.getClass(), "type", 0);
        setField(term132852, term132852.getClass(), "first", null);
        setField(term132782, term132782.getClass(), "first", term132852);
        setField(term132712, term132712.getClass(), "first", term132782);
        term132926 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term132996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132926, term132926.getClass(), "rootNode", term132996);
        setField(term132926, term132926.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term132712;
        args[1] = term132926;
        try {
            callMethod(klass, "createScope", argTypes, term132562, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


