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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660188;
     Object term660280;
     Object term661064;
     Object term661065;
     Object term661019;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660188 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term660280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term660366 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term660366, term660366.getClass(), "next", term660436);
        setIntField(term660366, term660366.getClass(), "type", 39);
        setField(term660280, term660280.getClass(), "first", term660366);
        setIntField(term660280, term660280.getClass(), "type", 18);
        term661064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term661064, term661064.getClass(), "currentTraversal", null);
        term661065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term661066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term661067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661065, term661065.getClass(), "str", null);
        setIntField(term661065, term661065.getClass(), "type", 18);
        setField(term661065, term661065.getClass(), "next", null);
        setField(term661066, term661066.getClass(), "functionName", null);
        setBooleanField(term661066, term661066.getClass(), "itsNeedsActivation", false);
        setIntField(term661066, term661066.getClass(), "itsFunctionType", 0);
        setBooleanField(term661066, term661066.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term661066, term661066.getClass(), "encodedSourceStart", 0);
        setIntField(term661066, term661066.getClass(), "encodedSourceEnd", 0);
        setField(term661066, term661066.getClass(), "sourceName", null);
        setIntField(term661066, term661066.getClass(), "baseLineno", 0);
        setIntField(term661066, term661066.getClass(), "endLineno", 0);
        setField(term661066, term661066.getClass(), "functions", null);
        setField(term661066, term661066.getClass(), "regexps", null);
        setField(term661066, term661066.getClass(), "itsVariables", null);
        setField(term661066, term661066.getClass(), "itsConst", null);
        setField(term661066, term661066.getClass(), "itsVariableNames", null);
        setIntField(term661066, term661066.getClass(), "varStart", 0);
        setField(term661066, term661066.getClass(), "compilerData", null);
        setIntField(term661066, term661066.getClass(), "type", 39);
        setIntField(term661067, term661067.getClass(), "type", 0);
        setField(term661067, term661067.getClass(), "next", null);
        setField(term661067, term661067.getClass(), "first", null);
        setField(term661067, term661067.getClass(), "last", null);
        setField(term661067, term661067.getClass(), "propListHead", null);
        setIntField(term661067, term661067.getClass(), "sourcePosition", 0);
        setField(term661067, term661067.getClass(), "jsType", null);
        setField(term661067, term661067.getClass(), "parent", null);
        setField(term661066, term661066.getClass(), "next", term661067);
        setField(term661066, term661066.getClass(), "first", null);
        setField(term661066, term661066.getClass(), "last", null);
        setField(term661066, term661066.getClass(), "propListHead", null);
        setIntField(term661066, term661066.getClass(), "sourcePosition", 0);
        setField(term661066, term661066.getClass(), "jsType", null);
        setField(term661066, term661066.getClass(), "parent", null);
        setField(term661065, term661065.getClass(), "first", term661066);
        setField(term661065, term661065.getClass(), "last", null);
        setField(term661065, term661065.getClass(), "propListHead", null);
        setIntField(term661065, term661065.getClass(), "sourcePosition", 0);
        setField(term661065, term661065.getClass(), "jsType", null);
        setField(term661065, term661065.getClass(), "parent", null);
        term661019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term661021 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term661031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661019, term661019.getClass(), "str", null);
        setIntField(term661019, term661019.getClass(), "type", 18);
        setField(term661019, term661019.getClass(), "next", null);
        setField(term661021, term661021.getClass(), "functionName", null);
        setBooleanField(term661021, term661021.getClass(), "itsNeedsActivation", false);
        setIntField(term661021, term661021.getClass(), "itsFunctionType", 0);
        setBooleanField(term661021, term661021.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term661021, term661021.getClass(), "encodedSourceStart", 0);
        setIntField(term661021, term661021.getClass(), "encodedSourceEnd", 0);
        setField(term661021, term661021.getClass(), "sourceName", null);
        setIntField(term661021, term661021.getClass(), "baseLineno", 0);
        setIntField(term661021, term661021.getClass(), "endLineno", 0);
        setField(term661021, term661021.getClass(), "functions", null);
        setField(term661021, term661021.getClass(), "regexps", null);
        setField(term661021, term661021.getClass(), "itsVariables", null);
        setField(term661021, term661021.getClass(), "itsConst", null);
        setField(term661021, term661021.getClass(), "itsVariableNames", null);
        setIntField(term661021, term661021.getClass(), "varStart", 0);
        setField(term661021, term661021.getClass(), "compilerData", null);
        setIntField(term661021, term661021.getClass(), "type", 39);
        setIntField(term661031, term661031.getClass(), "type", 0);
        setField(term661031, term661031.getClass(), "next", null);
        setField(term661031, term661031.getClass(), "first", null);
        setField(term661031, term661031.getClass(), "last", null);
        setField(term661031, term661031.getClass(), "propListHead", null);
        setIntField(term661031, term661031.getClass(), "sourcePosition", 0);
        setField(term661031, term661031.getClass(), "jsType", null);
        setField(term661031, term661031.getClass(), "parent", null);
        setField(term661021, term661021.getClass(), "next", term661031);
        setField(term661021, term661021.getClass(), "first", null);
        setField(term661021, term661021.getClass(), "last", null);
        setField(term661021, term661021.getClass(), "propListHead", null);
        setIntField(term661021, term661021.getClass(), "sourcePosition", 0);
        setField(term661021, term661021.getClass(), "jsType", null);
        setField(term661021, term661021.getClass(), "parent", null);
        setField(term661019, term661019.getClass(), "first", term661021);
        setField(term661019, term661019.getClass(), "last", null);
        setField(term661019, term661019.getClass(), "propListHead", null);
        setIntField(term661019, term661019.getClass(), "sourcePosition", 0);
        setField(term661019, term661019.getClass(), "jsType", null);
        setField(term661019, term661019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term660280;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term660188, args);
        assertTrue(recursiveEquals(term660188, term661064));
        assertTrue(recursiveEquals(term660280, term661065));
        assertTrue(recursiveEquals(retValue, term661019));
    }

};


