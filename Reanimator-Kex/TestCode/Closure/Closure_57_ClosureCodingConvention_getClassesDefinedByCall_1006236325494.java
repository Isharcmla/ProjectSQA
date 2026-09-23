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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159098;
     Object term159190;
     Object term160399;
     Object term160400;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159098 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term159190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term159276 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term159190, term159190.getClass(), "first", term159276);
        term160399 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term160399, term160399.getClass(), "propertyTestFunctions", null);
        term160400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term160401 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term160400, term160400.getClass(), "number", 0.0);
        setIntField(term160400, term160400.getClass(), "type", 0);
        setField(term160400, term160400.getClass(), "next", null);
        setField(term160401, term160401.getClass(), "functionName", null);
        setBooleanField(term160401, term160401.getClass(), "itsNeedsActivation", false);
        setIntField(term160401, term160401.getClass(), "itsFunctionType", 0);
        setBooleanField(term160401, term160401.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160401, term160401.getClass(), "encodedSourceStart", 0);
        setIntField(term160401, term160401.getClass(), "encodedSourceEnd", 0);
        setField(term160401, term160401.getClass(), "sourceName", null);
        setIntField(term160401, term160401.getClass(), "baseLineno", 0);
        setIntField(term160401, term160401.getClass(), "endLineno", 0);
        setField(term160401, term160401.getClass(), "functions", null);
        setField(term160401, term160401.getClass(), "regexps", null);
        setField(term160401, term160401.getClass(), "itsVariables", null);
        setField(term160401, term160401.getClass(), "itsConst", null);
        setField(term160401, term160401.getClass(), "itsVariableNames", null);
        setIntField(term160401, term160401.getClass(), "varStart", 0);
        setField(term160401, term160401.getClass(), "compilerData", null);
        setIntField(term160401, term160401.getClass(), "type", 0);
        setField(term160401, term160401.getClass(), "next", null);
        setField(term160401, term160401.getClass(), "first", null);
        setField(term160401, term160401.getClass(), "last", null);
        setField(term160401, term160401.getClass(), "propListHead", null);
        setIntField(term160401, term160401.getClass(), "sourcePosition", 0);
        setField(term160401, term160401.getClass(), "jsType", null);
        setField(term160401, term160401.getClass(), "parent", null);
        setField(term160400, term160400.getClass(), "first", term160401);
        setField(term160400, term160400.getClass(), "last", null);
        setField(term160400, term160400.getClass(), "propListHead", null);
        setIntField(term160400, term160400.getClass(), "sourcePosition", 0);
        setField(term160400, term160400.getClass(), "jsType", null);
        setField(term160400, term160400.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term159190;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term159098, args);
        assertTrue(recursiveEquals(term159098, term160399));
        assertTrue(recursiveEquals(term159190, term160400));
        assertTrue(recursiveEquals(retValue, null));
    }

};


