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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeValidator_expectUndeclaredVariable_59719754200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64288;
     Object term64393;
     Object term64475;
     Object term64495;
     Object term64496;
     Object term64497;
     Object term64498;

    public TypeValidator_expectUndeclaredVariable_59719754200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64288 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term64393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64393, term64393.getClass(), "type", 33);
        setField(term64393, term64393.getClass(), "propListHead", null);
        term64475 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term64495 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term64495, term64495.getClass(), "compiler", null);
        setField(term64495, term64495.getClass(), "typeRegistry", null);
        setField(term64495, term64495.getClass(), "allValueTypes", null);
        setBooleanField(term64495, term64495.getClass(), "shouldReport", false);
        setField(term64495, term64495.getClass(), "nullOrUndefined", null);
        setField(term64495, term64495.getClass(), "mismatches", null);
        term64496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64496, term64496.getClass(), "type", 33);
        setField(term64496, term64496.getClass(), "next", null);
        setField(term64496, term64496.getClass(), "first", null);
        setField(term64496, term64496.getClass(), "last", null);
        setField(term64496, term64496.getClass(), "propListHead", null);
        setIntField(term64496, term64496.getClass(), "sourcePosition", 0);
        setField(term64496, term64496.getClass(), "jsType", null);
        setField(term64496, term64496.getClass(), "parent", null);
        term64497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64497, term64497.getClass(), "type", 33);
        setField(term64497, term64497.getClass(), "next", null);
        setField(term64497, term64497.getClass(), "first", null);
        setField(term64497, term64497.getClass(), "last", null);
        setField(term64497, term64497.getClass(), "propListHead", null);
        setIntField(term64497, term64497.getClass(), "sourcePosition", 0);
        setField(term64497, term64497.getClass(), "jsType", null);
        setField(term64497, term64497.getClass(), "parent", null);
        term64498 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term64498, term64498.getClass(), "name", null);
        setField(term64498, term64498.getClass(), "nameNode", null);
        setField(term64498, term64498.getClass(), "type", null);
        setField(term64498, term64498.getClass(), "info", null);
        setBooleanField(term64498, term64498.getClass(), "typeInferred", false);
        setField(term64498, term64498.getClass(), "input", null);
        setBooleanField(term64498, term64498.getClass(), "isDefine", false);
        setIntField(term64498, term64498.getClass(), "index", 0);
        setField(term64498, term64498.getClass(), "scope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term64393;
        args[2] = term64393;
        args[3] = term64475;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term64288, args);
        assertTrue(recursiveEquals(term64288, term64495));
        assertTrue(recursiveEquals(term64393, term64497));
        assertTrue(recursiveEquals(term64393, term64498));
        assertTrue(recursiveEquals(term64475, null));
    }

};


