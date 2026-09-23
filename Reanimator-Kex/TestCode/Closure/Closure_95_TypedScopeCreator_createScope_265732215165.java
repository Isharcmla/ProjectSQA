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

public class TypedScopeCreator_createScope_265732215165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121224;
     Object term121294;
     Object term121508;

    public TypedScopeCreator_createScope_265732215165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121224 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term121224, term121224.getClass(), "compiler", null);
        term121294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121294, term121294.getClass(), "jsType", null);
        setIntField(term121294, term121294.getClass(), "type", 0);
        setField(term121364, term121364.getClass(), "next", null);
        setIntField(term121364, term121364.getClass(), "type", 0);
        setField(term121434, term121434.getClass(), "next", null);
        setIntField(term121434, term121434.getClass(), "type", 69);
        setField(term121434, term121434.getClass(), "first", null);
        setField(term121364, term121364.getClass(), "first", term121434);
        setField(term121294, term121294.getClass(), "first", term121364);
        term121508 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term121578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121508, term121508.getClass(), "rootNode", term121578);
        setField(term121508, term121508.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term121294;
        args[1] = term121508;
        try {
            callMethod(klass, "createScope", argTypes, term121224, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


