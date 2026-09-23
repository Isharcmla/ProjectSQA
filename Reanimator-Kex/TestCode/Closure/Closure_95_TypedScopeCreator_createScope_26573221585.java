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

public class TypedScopeCreator_createScope_26573221585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54088;
     Object term54238;
     Object term54382;

    public TypedScopeCreator_createScope_26573221585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54088 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term54168 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54088, term54088.getClass(), "compiler", term54168);
        term54238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54238, term54238.getClass(), "jsType", null);
        setIntField(term54238, term54238.getClass(), "type", 0);
        setField(term54308, term54308.getClass(), "next", null);
        setIntField(term54308, term54308.getClass(), "type", 0);
        setField(term54308, term54308.getClass(), "first", null);
        setField(term54238, term54238.getClass(), "first", term54308);
        term54382 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term54382, term54382.getClass(), "rootNode", null);
        setField(term54382, term54382.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term54238;
        args[1] = term54382;
        try {
            callMethod(klass, "createScope", argTypes, term54088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


