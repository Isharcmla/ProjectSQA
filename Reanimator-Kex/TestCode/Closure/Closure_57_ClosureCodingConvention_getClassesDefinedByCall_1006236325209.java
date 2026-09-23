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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95369;
     Object term95455;
     Object term95496;
     Object term95497;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95369 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term95455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95455, term95455.getClass(), "first", term95455);
        setIntField(term95455, term95455.getClass(), "type", -34);
        term95496 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term95496, term95496.getClass(), "propertyTestFunctions", null);
        term95497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95497, term95497.getClass(), "functionName", null);
        setBooleanField(term95497, term95497.getClass(), "itsNeedsActivation", false);
        setIntField(term95497, term95497.getClass(), "itsFunctionType", 0);
        setBooleanField(term95497, term95497.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95497, term95497.getClass(), "encodedSourceStart", 0);
        setIntField(term95497, term95497.getClass(), "encodedSourceEnd", 0);
        setField(term95497, term95497.getClass(), "sourceName", null);
        setIntField(term95497, term95497.getClass(), "baseLineno", 0);
        setIntField(term95497, term95497.getClass(), "endLineno", 0);
        setField(term95497, term95497.getClass(), "functions", null);
        setField(term95497, term95497.getClass(), "regexps", null);
        setField(term95497, term95497.getClass(), "itsVariables", null);
        setField(term95497, term95497.getClass(), "itsConst", null);
        setField(term95497, term95497.getClass(), "itsVariableNames", null);
        setIntField(term95497, term95497.getClass(), "varStart", 0);
        setField(term95497, term95497.getClass(), "compilerData", null);
        setIntField(term95497, term95497.getClass(), "type", -34);
        setField(term95497, term95497.getClass(), "next", null);
        setField(term95497, term95497.getClass(), "first", term95497);
        setField(term95497, term95497.getClass(), "last", null);
        setField(term95497, term95497.getClass(), "propListHead", null);
        setIntField(term95497, term95497.getClass(), "sourcePosition", 0);
        setField(term95497, term95497.getClass(), "jsType", null);
        setField(term95497, term95497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term95455;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term95369, args);
        assertTrue(recursiveEquals(term95369, term95496));
        assertTrue(recursiveEquals(term95455, term95497));
        assertTrue(recursiveEquals(retValue, null));
    }

};


