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

public class TypedScopeCreator_createScope_26573221530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16304;
     Object term16374;
     Object term16518;

    public TypedScopeCreator_createScope_26573221530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16304 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term16304, term16304.getClass(), "compiler", null);
        term16374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16374, term16374.getClass(), "jsType", null);
        setIntField(term16374, term16374.getClass(), "type", 0);
        setField(term16444, term16444.getClass(), "next", null);
        setIntField(term16444, term16444.getClass(), "type", 43);
        setField(term16444, term16444.getClass(), "first", null);
        setField(term16374, term16374.getClass(), "first", term16444);
        term16518 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term16588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16518, term16518.getClass(), "rootNode", term16588);
        setField(term16518, term16518.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16374;
        args[1] = term16518;
        try {
            callMethod(klass, "createScope", argTypes, term16304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


