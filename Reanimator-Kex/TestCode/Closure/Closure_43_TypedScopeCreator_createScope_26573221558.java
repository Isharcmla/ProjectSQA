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

public class TypedScopeCreator_createScope_26573221558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27705;
     Object term27775;
     Object term28059;

    public TypedScopeCreator_createScope_26573221558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27705 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term27705, term27705.getClass(), "compiler", null);
        term27775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27775, term27775.getClass(), "jsType", null);
        setIntField(term27775, term27775.getClass(), "type", 0);
        setField(term27775, term27775.getClass(), "parent", null);
        setField(term27845, term27845.getClass(), "next", term27915);
        setIntField(term27845, term27845.getClass(), "type", 0);
        setField(term27985, term27985.getClass(), "next", null);
        setIntField(term27985, term27985.getClass(), "type", 37);
        setField(term27985, term27985.getClass(), "first", null);
        setField(term27845, term27845.getClass(), "first", term27985);
        setField(term27775, term27775.getClass(), "first", term27845);
        term28059 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term28059, term28059.getClass(), "rootNode", null);
        setField(term28059, term28059.getClass(), "thisType", null);
        setIntField(term28059, term28059.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27775;
        args[1] = term28059;
        try {
            callMethod(klass, "createScope", argTypes, term27705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


