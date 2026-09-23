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

public class CheckAccessControls_getClassOfMethod_1679898606155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42493;
     Object term42585;
     Object term42671;
     Object term42729;
     Object term42730;
     Object term42731;

    public CheckAccessControls_getClassOfMethod_1679898606155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42493 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term42585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term42671 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term42671, term42671.getClass(), "type", -87);
        term42729 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term42729, term42729.getClass(), "compiler", null);
        setField(term42729, term42729.getClass(), "validator", null);
        setIntField(term42729, term42729.getClass(), "deprecatedDepth", 0);
        setIntField(term42729, term42729.getClass(), "methodDepth", 0);
        setField(term42729, term42729.getClass(), "currentClass", null);
        setField(term42729, term42729.getClass(), "initializedConstantProperties", null);
        term42730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term42730, term42730.getClass(), "functionName", null);
        setBooleanField(term42730, term42730.getClass(), "itsNeedsActivation", false);
        setIntField(term42730, term42730.getClass(), "itsFunctionType", 0);
        setBooleanField(term42730, term42730.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42730, term42730.getClass(), "encodedSourceStart", 0);
        setIntField(term42730, term42730.getClass(), "encodedSourceEnd", 0);
        setField(term42730, term42730.getClass(), "sourceName", null);
        setIntField(term42730, term42730.getClass(), "baseLineno", 0);
        setIntField(term42730, term42730.getClass(), "endLineno", 0);
        setField(term42730, term42730.getClass(), "functions", null);
        setField(term42730, term42730.getClass(), "regexps", null);
        setField(term42730, term42730.getClass(), "itsVariables", null);
        setField(term42730, term42730.getClass(), "itsConst", null);
        setField(term42730, term42730.getClass(), "itsVariableNames", null);
        setIntField(term42730, term42730.getClass(), "varStart", 0);
        setField(term42730, term42730.getClass(), "compilerData", null);
        setIntField(term42730, term42730.getClass(), "type", -87);
        setField(term42730, term42730.getClass(), "next", null);
        setField(term42730, term42730.getClass(), "first", null);
        setField(term42730, term42730.getClass(), "last", null);
        setField(term42730, term42730.getClass(), "propListHead", null);
        setIntField(term42730, term42730.getClass(), "sourcePosition", 0);
        setField(term42730, term42730.getClass(), "jsType", null);
        setField(term42730, term42730.getClass(), "parent", null);
        term42731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42731, term42731.getClass(), "str", null);
        setIntField(term42731, term42731.getClass(), "type", 0);
        setField(term42731, term42731.getClass(), "next", null);
        setField(term42731, term42731.getClass(), "first", null);
        setField(term42731, term42731.getClass(), "last", null);
        setField(term42731, term42731.getClass(), "propListHead", null);
        setIntField(term42731, term42731.getClass(), "sourcePosition", 0);
        setField(term42731, term42731.getClass(), "jsType", null);
        setField(term42731, term42731.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42585;
        args[1] = term42671;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term42493, args);
        assertTrue(recursiveEquals(term42493, term42729));
        assertTrue(recursiveEquals(term42585, term42730));
        assertTrue(recursiveEquals(term42671, term42731));
        assertTrue(recursiveEquals(retValue, null));
    }

};


