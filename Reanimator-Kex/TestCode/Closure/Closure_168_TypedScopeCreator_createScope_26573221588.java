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

public class TypedScopeCreator_createScope_26573221588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54109;
     Object term54179;
     Object term54393;

    public TypedScopeCreator_createScope_26573221588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54109 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term54109, term54109.getClass(), "compiler", null);
        term54179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54179, term54179.getClass(), "jsType", null);
        setIntField(term54179, term54179.getClass(), "type", 0);
        setField(term54179, term54179.getClass(), "parent", null);
        setField(term54249, term54249.getClass(), "next", null);
        setIntField(term54249, term54249.getClass(), "type", 0);
        setField(term54319, term54319.getClass(), "next", null);
        setIntField(term54319, term54319.getClass(), "type", 0);
        setField(term54319, term54319.getClass(), "first", null);
        setField(term54319, term54319.getClass(), "parent", null);
        setField(term54249, term54249.getClass(), "first", term54319);
        setField(term54249, term54249.getClass(), "parent", null);
        setField(term54179, term54179.getClass(), "first", term54249);
        term54393 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term54393, term54393.getClass(), "rootNode", null);
        setField(term54393, term54393.getClass(), "thisType", null);
        setIntField(term54393, term54393.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term54179;
        args[1] = term54393;
        callMethod(klass, "createScope", argTypes, term54109, args);
    }

};


