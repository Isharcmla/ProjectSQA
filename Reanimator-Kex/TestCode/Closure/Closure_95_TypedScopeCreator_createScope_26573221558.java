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

public class TypedScopeCreator_createScope_26573221558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31804;
     Object term31954;
     Object term32168;

    public TypedScopeCreator_createScope_26573221558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31804 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term31884 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31804, term31804.getClass(), "compiler", term31884);
        term31954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31954, term31954.getClass(), "jsType", null);
        setIntField(term31954, term31954.getClass(), "type", 0);
        setField(term32024, term32024.getClass(), "next", term32094);
        setIntField(term32024, term32024.getClass(), "type", 69);
        setField(term32024, term32024.getClass(), "first", null);
        setField(term31954, term31954.getClass(), "first", term32024);
        term32168 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term32238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32168, term32168.getClass(), "rootNode", term32238);
        setField(term32168, term32168.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term31954;
        args[1] = term32168;
        try {
            callMethod(klass, "createScope", argTypes, term31804, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


