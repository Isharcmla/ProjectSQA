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

public class TypedScopeCreator_createScope_26573221582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48374;
     Object term48524;
     Object term48878;

    public TypedScopeCreator_createScope_26573221582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48374 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term48454 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48374, term48374.getClass(), "compiler", term48454);
        term48524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48524, term48524.getClass(), "jsType", null);
        setIntField(term48524, term48524.getClass(), "type", 0);
        setField(term48524, term48524.getClass(), "parent", null);
        setField(term48664, term48664.getClass(), "next", term48734);
        setIntField(term48664, term48664.getClass(), "type", 83);
        setField(term48664, term48664.getClass(), "first", null);
        setField(term48594, term48594.getClass(), "next", term48664);
        setIntField(term48594, term48594.getClass(), "type", 0);
        setField(term48804, term48804.getClass(), "next", null);
        setIntField(term48804, term48804.getClass(), "type", 125);
        setField(term48804, term48804.getClass(), "first", null);
        setField(term48594, term48594.getClass(), "first", term48804);
        setField(term48524, term48524.getClass(), "first", term48594);
        term48878 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term48948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48878, term48878.getClass(), "rootNode", term48948);
        setField(term48878, term48878.getClass(), "thisType", null);
        setIntField(term48878, term48878.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term48524;
        args[1] = term48878;
        callMethod(klass, "createScope", argTypes, term48374, args);
    }

};


