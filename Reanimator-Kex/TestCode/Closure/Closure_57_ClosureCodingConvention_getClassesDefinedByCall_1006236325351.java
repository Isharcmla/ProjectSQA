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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133109;
     Object term133195;
     Object term133597;
     Object term133598;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133109 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term133195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term133195, term133195.getClass(), "first", term133195);
        setIntField(term133195, term133195.getClass(), "type", 33);
        setField(term133195, term133195.getClass(), "last", term133287);
        term133597 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term133597, term133597.getClass(), "propertyTestFunctions", null);
        term133598 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term133599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term133598, term133598.getClass(), "functionName", null);
        setBooleanField(term133598, term133598.getClass(), "itsNeedsActivation", false);
        setIntField(term133598, term133598.getClass(), "itsFunctionType", 0);
        setBooleanField(term133598, term133598.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term133598, term133598.getClass(), "encodedSourceStart", 0);
        setIntField(term133598, term133598.getClass(), "encodedSourceEnd", 0);
        setField(term133598, term133598.getClass(), "sourceName", null);
        setIntField(term133598, term133598.getClass(), "baseLineno", 0);
        setIntField(term133598, term133598.getClass(), "endLineno", 0);
        setField(term133598, term133598.getClass(), "functions", null);
        setField(term133598, term133598.getClass(), "regexps", null);
        setField(term133598, term133598.getClass(), "itsVariables", null);
        setField(term133598, term133598.getClass(), "itsConst", null);
        setField(term133598, term133598.getClass(), "itsVariableNames", null);
        setIntField(term133598, term133598.getClass(), "varStart", 0);
        setField(term133598, term133598.getClass(), "compilerData", null);
        setIntField(term133598, term133598.getClass(), "type", 33);
        setField(term133598, term133598.getClass(), "next", null);
        setField(term133598, term133598.getClass(), "first", term133598);
        setField(term133599, term133599.getClass(), "str", null);
        setIntField(term133599, term133599.getClass(), "type", 0);
        setField(term133599, term133599.getClass(), "next", null);
        setField(term133599, term133599.getClass(), "first", null);
        setField(term133599, term133599.getClass(), "last", null);
        setField(term133599, term133599.getClass(), "propListHead", null);
        setIntField(term133599, term133599.getClass(), "sourcePosition", 0);
        setField(term133599, term133599.getClass(), "jsType", null);
        setField(term133599, term133599.getClass(), "parent", null);
        setField(term133598, term133598.getClass(), "last", term133599);
        setField(term133598, term133598.getClass(), "propListHead", null);
        setIntField(term133598, term133598.getClass(), "sourcePosition", 0);
        setField(term133598, term133598.getClass(), "jsType", null);
        setField(term133598, term133598.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term133195;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term133109, args);
        assertTrue(recursiveEquals(term133109, term133597));
        assertTrue(recursiveEquals(term133195, term133598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


