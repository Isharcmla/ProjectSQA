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

public class TypedScopeCreator_createScope_26573221571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42718;
     Object term42788;
     Object term42932;

    public TypedScopeCreator_createScope_26573221571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42718 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term42718, term42718.getClass(), "compiler", null);
        term42788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42788, term42788.getClass(), "jsType", null);
        setIntField(term42788, term42788.getClass(), "type", 126);
        setField(term42788, term42788.getClass(), "parent", null);
        setIntField(term42858, term42858.getClass(), "type", 0);
        setField(term42858, term42858.getClass(), "next", null);
        setField(term42858, term42858.getClass(), "first", null);
        setField(term42858, term42858.getClass(), "parent", null);
        setField(term42788, term42788.getClass(), "first", term42858);
        term42932 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term42932, term42932.getClass(), "rootNode", null);
        setField(term42932, term42932.getClass(), "thisType", null);
        setIntField(term42932, term42932.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42788;
        args[1] = term42932;
        try {
            callMethod(klass, "createScope", argTypes, term42718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


