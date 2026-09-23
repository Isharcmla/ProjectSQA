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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209362;
     Object term209448;
     Object term220795;
     Object term220796;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209362 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term209448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term209540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term209448, term209448.getClass(), "first", term209540);
        term220795 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term220795, term220795.getClass(), "propertyTestFunctions", null);
        term220796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term220796, term220796.getClass(), "functionName", null);
        setBooleanField(term220796, term220796.getClass(), "itsNeedsActivation", false);
        setIntField(term220796, term220796.getClass(), "itsFunctionType", 0);
        setBooleanField(term220796, term220796.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term220796, term220796.getClass(), "encodedSourceStart", 0);
        setIntField(term220796, term220796.getClass(), "encodedSourceEnd", 0);
        setField(term220796, term220796.getClass(), "sourceName", null);
        setIntField(term220796, term220796.getClass(), "baseLineno", 0);
        setIntField(term220796, term220796.getClass(), "endLineno", 0);
        setField(term220796, term220796.getClass(), "functions", null);
        setField(term220796, term220796.getClass(), "regexps", null);
        setField(term220796, term220796.getClass(), "itsVariables", null);
        setField(term220796, term220796.getClass(), "itsConst", null);
        setField(term220796, term220796.getClass(), "itsVariableNames", null);
        setIntField(term220796, term220796.getClass(), "varStart", 0);
        setField(term220796, term220796.getClass(), "compilerData", null);
        setIntField(term220796, term220796.getClass(), "type", 0);
        setField(term220796, term220796.getClass(), "next", null);
        setDoubleField(term220797, term220797.getClass(), "number", 0.0);
        setIntField(term220797, term220797.getClass(), "type", 0);
        setField(term220797, term220797.getClass(), "next", null);
        setField(term220797, term220797.getClass(), "first", null);
        setField(term220797, term220797.getClass(), "last", null);
        setField(term220797, term220797.getClass(), "propListHead", null);
        setIntField(term220797, term220797.getClass(), "sourcePosition", 0);
        setField(term220797, term220797.getClass(), "jsType", null);
        setField(term220797, term220797.getClass(), "parent", null);
        setField(term220796, term220796.getClass(), "first", term220797);
        setField(term220796, term220796.getClass(), "last", null);
        setField(term220796, term220796.getClass(), "propListHead", null);
        setIntField(term220796, term220796.getClass(), "sourcePosition", 0);
        setField(term220796, term220796.getClass(), "jsType", null);
        setField(term220796, term220796.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209448;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term209362, args);
        assertTrue(recursiveEquals(term209362, term220795));
        assertTrue(recursiveEquals(term209448, term220796));
        assertTrue(recursiveEquals(retValue, null));
    }

};


