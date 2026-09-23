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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210391;
     Object term210477;
     Object term221159;
     Object term221160;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210391 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term210477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term210569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term210477, term210477.getClass(), "first", term210569);
        term221159 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term221159, term221159.getClass(), "propertyTestFunctions", null);
        term221160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term221160, term221160.getClass(), "functionName", null);
        setBooleanField(term221160, term221160.getClass(), "itsNeedsActivation", false);
        setIntField(term221160, term221160.getClass(), "itsFunctionType", 0);
        setBooleanField(term221160, term221160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term221160, term221160.getClass(), "encodedSourceStart", 0);
        setIntField(term221160, term221160.getClass(), "encodedSourceEnd", 0);
        setField(term221160, term221160.getClass(), "sourceName", null);
        setIntField(term221160, term221160.getClass(), "baseLineno", 0);
        setIntField(term221160, term221160.getClass(), "endLineno", 0);
        setField(term221160, term221160.getClass(), "functions", null);
        setField(term221160, term221160.getClass(), "regexps", null);
        setField(term221160, term221160.getClass(), "itsVariables", null);
        setField(term221160, term221160.getClass(), "itsConst", null);
        setField(term221160, term221160.getClass(), "itsVariableNames", null);
        setIntField(term221160, term221160.getClass(), "varStart", 0);
        setField(term221160, term221160.getClass(), "compilerData", null);
        setIntField(term221160, term221160.getClass(), "type", 0);
        setField(term221160, term221160.getClass(), "next", null);
        setField(term221161, term221161.getClass(), "str", null);
        setIntField(term221161, term221161.getClass(), "type", 0);
        setField(term221161, term221161.getClass(), "next", null);
        setField(term221161, term221161.getClass(), "first", null);
        setField(term221161, term221161.getClass(), "last", null);
        setField(term221161, term221161.getClass(), "propListHead", null);
        setIntField(term221161, term221161.getClass(), "sourcePosition", 0);
        setField(term221161, term221161.getClass(), "jsType", null);
        setField(term221161, term221161.getClass(), "parent", null);
        setField(term221160, term221160.getClass(), "first", term221161);
        setField(term221160, term221160.getClass(), "last", null);
        setField(term221160, term221160.getClass(), "propListHead", null);
        setIntField(term221160, term221160.getClass(), "sourcePosition", 0);
        setField(term221160, term221160.getClass(), "jsType", null);
        setField(term221160, term221160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term210477;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term210391, args);
        assertTrue(recursiveEquals(term210391, term221159));
        assertTrue(recursiveEquals(term210477, term221160));
        assertTrue(recursiveEquals(retValue, null));
    }

};


