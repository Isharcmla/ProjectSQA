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

public class TypedScopeCreator_createScope_26573221567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37721;
     Object term37871;
     Object term38155;

    public TypedScopeCreator_createScope_26573221567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37721 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term37801 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37721, term37721.getClass(), "compiler", term37801);
        term37871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37871, term37871.getClass(), "jsType", null);
        setIntField(term37871, term37871.getClass(), "type", 0);
        setField(term37871, term37871.getClass(), "parent", null);
        setField(term37941, term37941.getClass(), "next", term38011);
        setIntField(term37941, term37941.getClass(), "type", 83);
        setField(term38081, term38081.getClass(), "next", null);
        setIntField(term38081, term38081.getClass(), "type", 0);
        setField(term38081, term38081.getClass(), "first", null);
        setField(term37941, term37941.getClass(), "first", term38081);
        setField(term37871, term37871.getClass(), "first", term37941);
        term38155 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term38225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38155, term38155.getClass(), "rootNode", term38225);
        setField(term38155, term38155.getClass(), "thisType", null);
        setIntField(term38155, term38155.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term37871;
        args[1] = term38155;
        try {
            callMethod(klass, "createScope", argTypes, term37721, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


