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

public class TypedScopeCreator_createScope_26573221590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68727;
     Object term68877;
     Object term69091;

    public TypedScopeCreator_createScope_26573221590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68727 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term68807 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term68727, term68727.getClass(), "compiler", term68807);
        term68877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68877, term68877.getClass(), "jsType", null);
        setIntField(term68877, term68877.getClass(), "type", 0);
        setField(term68877, term68877.getClass(), "parent", null);
        setField(term69017, term69017.getClass(), "next", null);
        setIntField(term69017, term69017.getClass(), "type", 0);
        setField(term69017, term69017.getClass(), "first", null);
        setField(term69017, term69017.getClass(), "parent", null);
        setField(term68947, term68947.getClass(), "next", term69017);
        setIntField(term68947, term68947.getClass(), "type", 47);
        setField(term68947, term68947.getClass(), "first", term69017);
        setField(term68877, term68877.getClass(), "first", term68947);
        term69091 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term69161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69091, term69091.getClass(), "rootNode", term69161);
        setField(term69091, term69091.getClass(), "thisType", null);
        setIntField(term69091, term69091.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term68877;
        args[1] = term69091;
        callMethod(klass, "createScope", argTypes, term68727, args);
    }

};


