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

public class TypedScopeCreator_createScope_26573221573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27498;
     Object term27568;
     Object term27642;

    public TypedScopeCreator_createScope_26573221573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27498 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term27498, term27498.getClass(), "compiler", null);
        term27568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27568, term27568.getClass(), "type", 132);
        term27642 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term27642, term27642.getClass(), "rootNode", null);
        setIntField(term27642, term27642.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27568;
        args[1] = term27642;
        try {
            callMethod(klass, "createScope", argTypes, term27498, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


