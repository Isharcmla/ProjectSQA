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

public class CheckAccessControls_getClassOfMethod_1679898606300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94294;
     Object term94380;
     Object term94472;
     Object term95253;
     Object term95254;
     Object term95255;

    public CheckAccessControls_getClassOfMethod_1679898606300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94294 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term94380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94380, term94380.getClass(), "type", 0);
        term94472 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term94472, term94472.getClass(), "type", 38);
        term95253 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term95253, term95253.getClass(), "compiler", null);
        setField(term95253, term95253.getClass(), "validator", null);
        setIntField(term95253, term95253.getClass(), "deprecatedDepth", 0);
        setIntField(term95253, term95253.getClass(), "methodDepth", 0);
        setField(term95253, term95253.getClass(), "currentClass", null);
        setField(term95253, term95253.getClass(), "initializedConstantProperties", null);
        term95254 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95254, term95254.getClass(), "str", null);
        setIntField(term95254, term95254.getClass(), "type", 38);
        setField(term95254, term95254.getClass(), "next", null);
        setField(term95254, term95254.getClass(), "first", null);
        setField(term95254, term95254.getClass(), "last", null);
        setField(term95254, term95254.getClass(), "propListHead", null);
        setIntField(term95254, term95254.getClass(), "sourcePosition", 0);
        setField(term95254, term95254.getClass(), "jsType", null);
        setField(term95254, term95254.getClass(), "parent", null);
        term95255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95255, term95255.getClass(), "functionName", null);
        setBooleanField(term95255, term95255.getClass(), "itsNeedsActivation", false);
        setIntField(term95255, term95255.getClass(), "itsFunctionType", 0);
        setBooleanField(term95255, term95255.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95255, term95255.getClass(), "encodedSourceStart", 0);
        setIntField(term95255, term95255.getClass(), "encodedSourceEnd", 0);
        setField(term95255, term95255.getClass(), "sourceName", null);
        setIntField(term95255, term95255.getClass(), "baseLineno", 0);
        setIntField(term95255, term95255.getClass(), "endLineno", 0);
        setField(term95255, term95255.getClass(), "functions", null);
        setField(term95255, term95255.getClass(), "regexps", null);
        setField(term95255, term95255.getClass(), "itsVariables", null);
        setField(term95255, term95255.getClass(), "itsConst", null);
        setField(term95255, term95255.getClass(), "itsVariableNames", null);
        setIntField(term95255, term95255.getClass(), "varStart", 0);
        setField(term95255, term95255.getClass(), "compilerData", null);
        setIntField(term95255, term95255.getClass(), "type", 0);
        setField(term95255, term95255.getClass(), "next", null);
        setField(term95255, term95255.getClass(), "first", null);
        setField(term95255, term95255.getClass(), "last", null);
        setField(term95255, term95255.getClass(), "propListHead", null);
        setIntField(term95255, term95255.getClass(), "sourcePosition", 0);
        setField(term95255, term95255.getClass(), "jsType", null);
        setField(term95255, term95255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term94380;
        args[1] = term94472;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term94294, args);
        assertTrue(recursiveEquals(term94294, term95253));
        assertTrue(recursiveEquals(term94380, term95254));
        assertTrue(recursiveEquals(term94472, term95255));
        assertTrue(recursiveEquals(retValue, null));
    }

};


