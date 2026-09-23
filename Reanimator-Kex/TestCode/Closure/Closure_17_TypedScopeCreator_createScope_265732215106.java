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

public class TypedScopeCreator_createScope_265732215106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78915;
     Object term79065;
     Object term79279;

    public TypedScopeCreator_createScope_265732215106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78915 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term78995 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78915, term78915.getClass(), "compiler", term78995);
        term79065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79065, term79065.getClass(), "jsType", null);
        setIntField(term79065, term79065.getClass(), "type", 0);
        setField(term79065, term79065.getClass(), "parent", null);
        setField(term79135, term79135.getClass(), "next", null);
        setIntField(term79135, term79135.getClass(), "type", 83);
        setField(term79205, term79205.getClass(), "next", null);
        setIntField(term79205, term79205.getClass(), "type", 0);
        setField(term79205, term79205.getClass(), "first", null);
        setField(term79205, term79205.getClass(), "parent", null);
        setField(term79135, term79135.getClass(), "first", term79205);
        setField(term79065, term79065.getClass(), "first", term79135);
        term79279 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term79279, term79279.getClass(), "rootNode", null);
        setField(term79279, term79279.getClass(), "thisType", null);
        setIntField(term79279, term79279.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term79065;
        args[1] = term79279;
        callMethod(klass, "createScope", argTypes, term78915, args);
    }

};


