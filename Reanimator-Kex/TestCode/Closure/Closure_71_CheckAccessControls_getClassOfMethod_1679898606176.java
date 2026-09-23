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

public class CheckAccessControls_getClassOfMethod_1679898606176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49313;
     Object term49399;
     Object term49491;
     Object term49540;
     Object term49541;
     Object term49542;

    public CheckAccessControls_getClassOfMethod_1679898606176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49313 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term49399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term49491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49491, term49491.getClass(), "type", -87);
        term49540 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term49540, term49540.getClass(), "compiler", null);
        setField(term49540, term49540.getClass(), "validator", null);
        setIntField(term49540, term49540.getClass(), "deprecatedDepth", 0);
        setIntField(term49540, term49540.getClass(), "methodDepth", 0);
        setField(term49540, term49540.getClass(), "currentClass", null);
        setField(term49540, term49540.getClass(), "initializedConstantProperties", null);
        term49541 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49541, term49541.getClass(), "str", null);
        setIntField(term49541, term49541.getClass(), "type", -87);
        setField(term49541, term49541.getClass(), "next", null);
        setField(term49541, term49541.getClass(), "first", null);
        setField(term49541, term49541.getClass(), "last", null);
        setField(term49541, term49541.getClass(), "propListHead", null);
        setIntField(term49541, term49541.getClass(), "sourcePosition", 0);
        setField(term49541, term49541.getClass(), "jsType", null);
        setField(term49541, term49541.getClass(), "parent", null);
        term49542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49542, term49542.getClass(), "functionName", null);
        setBooleanField(term49542, term49542.getClass(), "itsNeedsActivation", false);
        setIntField(term49542, term49542.getClass(), "itsFunctionType", 0);
        setBooleanField(term49542, term49542.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49542, term49542.getClass(), "encodedSourceStart", 0);
        setIntField(term49542, term49542.getClass(), "encodedSourceEnd", 0);
        setField(term49542, term49542.getClass(), "sourceName", null);
        setIntField(term49542, term49542.getClass(), "baseLineno", 0);
        setIntField(term49542, term49542.getClass(), "endLineno", 0);
        setField(term49542, term49542.getClass(), "functions", null);
        setField(term49542, term49542.getClass(), "regexps", null);
        setField(term49542, term49542.getClass(), "itsVariables", null);
        setField(term49542, term49542.getClass(), "itsConst", null);
        setField(term49542, term49542.getClass(), "itsVariableNames", null);
        setIntField(term49542, term49542.getClass(), "varStart", 0);
        setField(term49542, term49542.getClass(), "compilerData", null);
        setIntField(term49542, term49542.getClass(), "type", 0);
        setField(term49542, term49542.getClass(), "next", null);
        setField(term49542, term49542.getClass(), "first", null);
        setField(term49542, term49542.getClass(), "last", null);
        setField(term49542, term49542.getClass(), "propListHead", null);
        setIntField(term49542, term49542.getClass(), "sourcePosition", 0);
        setField(term49542, term49542.getClass(), "jsType", null);
        setField(term49542, term49542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term49399;
        args[1] = term49491;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term49313, args);
        assertTrue(recursiveEquals(term49313, term49540));
        assertTrue(recursiveEquals(term49399, term49541));
        assertTrue(recursiveEquals(term49491, term49542));
        assertTrue(recursiveEquals(retValue, null));
    }

};


