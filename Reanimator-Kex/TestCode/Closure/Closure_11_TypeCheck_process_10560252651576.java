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

public class TypeCheck_process_10560252651576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498348;
     Object term498590;

    public TypeCheck_process_10560252651576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498348 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term498446 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term498520 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term498348, term498348.getClass(), "scopeCreator", term498446);
        setField(term498520, term498520.getClass(), "parent", null);
        setField(term498348, term498348.getClass(), "topScope", term498520);
        setField(term498348, term498348.getClass(), "compiler", null);
        setBooleanField(term498348, term498348.getClass(), "inExterns", false);
        term498590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term498590, term498590.getClass(), "parent", term498660);
        setIntField(term498590, term498590.getClass(), "type", 28);
        setField(term498590, term498590.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term498590;
        try {
            callMethod(klass, "process", argTypes, term498348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


