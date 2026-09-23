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

public class TypedScopeCreator_createScope_26573221591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35377;
     Object term35469;
     Object term35635;

    public TypedScopeCreator_createScope_26573221591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35377 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term35377, term35377.getClass(), "compiler", null);
        term35469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35469, term35469.getClass(), "type", 0);
        setIntField(term35561, term35561.getClass(), "type", 0);
        setField(term35561, term35561.getClass(), "parent", null);
        setField(term35469, term35469.getClass(), "parent", term35561);
        term35635 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term35635, term35635.getClass(), "rootNode", null);
        setIntField(term35635, term35635.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term35469;
        args[1] = term35635;
        try {
            callMethod(klass, "createScope", argTypes, term35377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


