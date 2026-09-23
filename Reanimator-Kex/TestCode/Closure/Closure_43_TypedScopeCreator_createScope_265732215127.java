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
     Object term92969;
     Object term93039;
     Object term93323;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92969 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term92969, term92969.getClass(), "compiler", null);
        term93039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93039, term93039.getClass(), "jsType", null);
        setIntField(term93039, term93039.getClass(), "type", 0);
        setField(term93039, term93039.getClass(), "parent", null);
        setField(term93109, term93109.getClass(), "next", term93179);
        setIntField(term93109, term93109.getClass(), "type", 39);
        setField(term93249, term93249.getClass(), "next", null);
        setIntField(term93249, term93249.getClass(), "type", 83);
        setField(term93249, term93249.getClass(), "first", null);
        setField(term93109, term93109.getClass(), "first", term93249);
        setField(term93039, term93039.getClass(), "first", term93109);
        term93323 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term93393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93323, term93323.getClass(), "rootNode", term93393);
        setField(term93323, term93323.getClass(), "thisType", null);
        setIntField(term93323, term93323.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term93039;
        args[1] = term93323;
        try {
            callMethod(klass, "createScope", argTypes, term92969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


