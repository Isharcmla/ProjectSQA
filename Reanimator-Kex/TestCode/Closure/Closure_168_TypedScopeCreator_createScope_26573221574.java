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

public class TypedScopeCreator_createScope_26573221574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44708;
     Object term44800;
     Object term44874;

    public TypedScopeCreator_createScope_26573221574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44708 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term44708, term44708.getClass(), "compiler", null);
        term44800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term44800, term44800.getClass(), "jsType", null);
        setIntField(term44800, term44800.getClass(), "type", -133);
        setField(term44800, term44800.getClass(), "parent", null);
        term44874 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term44966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term44874, term44874.getClass(), "rootNode", term44966);
        setField(term44874, term44874.getClass(), "thisType", null);
        setIntField(term44874, term44874.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term44800;
        args[1] = term44874;
        try {
            callMethod(klass, "createScope", argTypes, term44708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


