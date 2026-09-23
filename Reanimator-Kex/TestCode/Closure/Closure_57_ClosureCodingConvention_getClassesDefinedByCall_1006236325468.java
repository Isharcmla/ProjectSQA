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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154422;
     Object term154508;
     Object term155105;
     Object term155106;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154422 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term154508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term154594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term154686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154594, term154594.getClass(), "type", 33);
        setField(term154686, term154686.getClass(), "str", "");
        setField(term154594, term154594.getClass(), "last", term154686);
        setField(term154508, term154508.getClass(), "first", term154594);
        term155105 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term155105, term155105.getClass(), "propertyTestFunctions", null);
        term155106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term155106, term155106.getClass(), "functionName", null);
        setBooleanField(term155106, term155106.getClass(), "itsNeedsActivation", false);
        setIntField(term155106, term155106.getClass(), "itsFunctionType", 0);
        setBooleanField(term155106, term155106.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155106, term155106.getClass(), "encodedSourceStart", 0);
        setIntField(term155106, term155106.getClass(), "encodedSourceEnd", 0);
        setField(term155106, term155106.getClass(), "sourceName", null);
        setIntField(term155106, term155106.getClass(), "baseLineno", 0);
        setIntField(term155106, term155106.getClass(), "endLineno", 0);
        setField(term155106, term155106.getClass(), "functions", null);
        setField(term155106, term155106.getClass(), "regexps", null);
        setField(term155106, term155106.getClass(), "itsVariables", null);
        setField(term155106, term155106.getClass(), "itsConst", null);
        setField(term155106, term155106.getClass(), "itsVariableNames", null);
        setIntField(term155106, term155106.getClass(), "varStart", 0);
        setField(term155106, term155106.getClass(), "compilerData", null);
        setIntField(term155106, term155106.getClass(), "type", 0);
        setField(term155106, term155106.getClass(), "next", null);
        setField(term155107, term155107.getClass(), "functionName", null);
        setBooleanField(term155107, term155107.getClass(), "itsNeedsActivation", false);
        setIntField(term155107, term155107.getClass(), "itsFunctionType", 0);
        setBooleanField(term155107, term155107.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155107, term155107.getClass(), "encodedSourceStart", 0);
        setIntField(term155107, term155107.getClass(), "encodedSourceEnd", 0);
        setField(term155107, term155107.getClass(), "sourceName", null);
        setIntField(term155107, term155107.getClass(), "baseLineno", 0);
        setIntField(term155107, term155107.getClass(), "endLineno", 0);
        setField(term155107, term155107.getClass(), "functions", null);
        setField(term155107, term155107.getClass(), "regexps", null);
        setField(term155107, term155107.getClass(), "itsVariables", null);
        setField(term155107, term155107.getClass(), "itsConst", null);
        setField(term155107, term155107.getClass(), "itsVariableNames", null);
        setIntField(term155107, term155107.getClass(), "varStart", 0);
        setField(term155107, term155107.getClass(), "compilerData", null);
        setIntField(term155107, term155107.getClass(), "type", 33);
        setField(term155107, term155107.getClass(), "next", null);
        setField(term155107, term155107.getClass(), "first", null);
        setField(term155108, term155108.getClass(), "str", "");
        setIntField(term155108, term155108.getClass(), "type", 0);
        setField(term155108, term155108.getClass(), "next", null);
        setField(term155108, term155108.getClass(), "first", null);
        setField(term155108, term155108.getClass(), "last", null);
        setField(term155108, term155108.getClass(), "propListHead", null);
        setIntField(term155108, term155108.getClass(), "sourcePosition", 0);
        setField(term155108, term155108.getClass(), "jsType", null);
        setField(term155108, term155108.getClass(), "parent", null);
        setField(term155107, term155107.getClass(), "last", term155108);
        setField(term155107, term155107.getClass(), "propListHead", null);
        setIntField(term155107, term155107.getClass(), "sourcePosition", 0);
        setField(term155107, term155107.getClass(), "jsType", null);
        setField(term155107, term155107.getClass(), "parent", null);
        setField(term155106, term155106.getClass(), "first", term155107);
        setField(term155106, term155106.getClass(), "last", null);
        setField(term155106, term155106.getClass(), "propListHead", null);
        setIntField(term155106, term155106.getClass(), "sourcePosition", 0);
        setField(term155106, term155106.getClass(), "jsType", null);
        setField(term155106, term155106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term154508;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term154422, args);
        assertTrue(recursiveEquals(term154422, term155105));
        assertTrue(recursiveEquals(term154508, term155106));
        assertTrue(recursiveEquals(retValue, null));
    }

};


