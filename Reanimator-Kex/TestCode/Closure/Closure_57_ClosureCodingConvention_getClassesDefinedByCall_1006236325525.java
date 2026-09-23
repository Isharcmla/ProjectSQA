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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165321;
     Object term165407;
     Object term177563;
     Object term177564;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165321 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term165407 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term165493 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term165585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term165493, term165493.getClass(), "type", 33);
        setField(term165585, term165585.getClass(), "str", "mixin");
        setField(term165493, term165493.getClass(), "last", term165585);
        setField(term165407, term165407.getClass(), "first", term165493);
        term177563 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term177563, term177563.getClass(), "propertyTestFunctions", null);
        term177564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term177565 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term177566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177564, term177564.getClass(), "functionName", null);
        setBooleanField(term177564, term177564.getClass(), "itsNeedsActivation", false);
        setIntField(term177564, term177564.getClass(), "itsFunctionType", 0);
        setBooleanField(term177564, term177564.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term177564, term177564.getClass(), "encodedSourceStart", 0);
        setIntField(term177564, term177564.getClass(), "encodedSourceEnd", 0);
        setField(term177564, term177564.getClass(), "sourceName", null);
        setIntField(term177564, term177564.getClass(), "baseLineno", 0);
        setIntField(term177564, term177564.getClass(), "endLineno", 0);
        setField(term177564, term177564.getClass(), "functions", null);
        setField(term177564, term177564.getClass(), "regexps", null);
        setField(term177564, term177564.getClass(), "itsVariables", null);
        setField(term177564, term177564.getClass(), "itsConst", null);
        setField(term177564, term177564.getClass(), "itsVariableNames", null);
        setIntField(term177564, term177564.getClass(), "varStart", 0);
        setField(term177564, term177564.getClass(), "compilerData", null);
        setIntField(term177564, term177564.getClass(), "type", 0);
        setField(term177564, term177564.getClass(), "next", null);
        setField(term177565, term177565.getClass(), "functionName", null);
        setBooleanField(term177565, term177565.getClass(), "itsNeedsActivation", false);
        setIntField(term177565, term177565.getClass(), "itsFunctionType", 0);
        setBooleanField(term177565, term177565.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term177565, term177565.getClass(), "encodedSourceStart", 0);
        setIntField(term177565, term177565.getClass(), "encodedSourceEnd", 0);
        setField(term177565, term177565.getClass(), "sourceName", null);
        setIntField(term177565, term177565.getClass(), "baseLineno", 0);
        setIntField(term177565, term177565.getClass(), "endLineno", 0);
        setField(term177565, term177565.getClass(), "functions", null);
        setField(term177565, term177565.getClass(), "regexps", null);
        setField(term177565, term177565.getClass(), "itsVariables", null);
        setField(term177565, term177565.getClass(), "itsConst", null);
        setField(term177565, term177565.getClass(), "itsVariableNames", null);
        setIntField(term177565, term177565.getClass(), "varStart", 0);
        setField(term177565, term177565.getClass(), "compilerData", null);
        setIntField(term177565, term177565.getClass(), "type", 33);
        setField(term177565, term177565.getClass(), "next", null);
        setField(term177565, term177565.getClass(), "first", null);
        setField(term177566, term177566.getClass(), "str", "mixin");
        setIntField(term177566, term177566.getClass(), "type", 0);
        setField(term177566, term177566.getClass(), "next", null);
        setField(term177566, term177566.getClass(), "first", null);
        setField(term177566, term177566.getClass(), "last", null);
        setField(term177566, term177566.getClass(), "propListHead", null);
        setIntField(term177566, term177566.getClass(), "sourcePosition", 0);
        setField(term177566, term177566.getClass(), "jsType", null);
        setField(term177566, term177566.getClass(), "parent", null);
        setField(term177565, term177565.getClass(), "last", term177566);
        setField(term177565, term177565.getClass(), "propListHead", null);
        setIntField(term177565, term177565.getClass(), "sourcePosition", 0);
        setField(term177565, term177565.getClass(), "jsType", null);
        setField(term177565, term177565.getClass(), "parent", null);
        setField(term177564, term177564.getClass(), "first", term177565);
        setField(term177564, term177564.getClass(), "last", null);
        setField(term177564, term177564.getClass(), "propListHead", null);
        setIntField(term177564, term177564.getClass(), "sourcePosition", 0);
        setField(term177564, term177564.getClass(), "jsType", null);
        setField(term177564, term177564.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term165407;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term165321, args);
        assertTrue(recursiveEquals(term165321, term177563));
        assertTrue(recursiveEquals(term165407, term177564));
        assertTrue(recursiveEquals(retValue, null));
    }

};


