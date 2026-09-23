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

public class TypedScopeCreator_createScope_26573221594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58095;
     Object term58245;
     Object term58529;

    public TypedScopeCreator_createScope_26573221594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58095 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term58175 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58095, term58095.getClass(), "compiler", term58175);
        term58245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58245, term58245.getClass(), "jsType", null);
        setIntField(term58245, term58245.getClass(), "type", 0);
        setField(term58245, term58245.getClass(), "parent", null);
        setField(term58385, term58385.getClass(), "next", null);
        setIntField(term58385, term58385.getClass(), "type", 83);
        setField(term58385, term58385.getClass(), "first", null);
        setField(term58315, term58315.getClass(), "next", term58385);
        setIntField(term58315, term58315.getClass(), "type", 0);
        setField(term58455, term58455.getClass(), "next", null);
        setIntField(term58455, term58455.getClass(), "type", 0);
        setField(term58455, term58455.getClass(), "first", null);
        setField(term58455, term58455.getClass(), "parent", null);
        setField(term58315, term58315.getClass(), "first", term58455);
        setField(term58315, term58315.getClass(), "parent", null);
        setField(term58245, term58245.getClass(), "first", term58315);
        term58529 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term58529, term58529.getClass(), "rootNode", null);
        setField(term58529, term58529.getClass(), "thisType", null);
        setIntField(term58529, term58529.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term58245;
        args[1] = term58529;
        callMethod(klass, "createScope", argTypes, term58095, args);
    }

};


