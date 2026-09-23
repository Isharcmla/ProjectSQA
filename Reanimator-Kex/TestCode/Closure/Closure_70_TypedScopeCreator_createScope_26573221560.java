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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17086;
     Object term17236;
     Object term17380;

    public TypedScopeCreator_createScope_26573221560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17086 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17166 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17086, term17086.getClass(), "compiler", term17166);
        term17236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17236, term17236.getClass(), "jsType", null);
        setIntField(term17236, term17236.getClass(), "type", 0);
        setField(term17306, term17306.getClass(), "next", null);
        setIntField(term17306, term17306.getClass(), "type", 47);
        setField(term17306, term17306.getClass(), "first", null);
        setField(term17236, term17236.getClass(), "first", term17306);
        term17380 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term17380, term17380.getClass(), "rootNode", null);
        setField(term17380, term17380.getClass(), "thisType", null);
        setIntField(term17380, term17380.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term17236;
        args[1] = term17380;
        callMethod(klass, "createScope", argTypes, term17086, args);
    }

};


