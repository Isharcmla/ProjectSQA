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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62454;
     Object term62540;
     Object term62678;
     Object term62679;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62454 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term62540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term62626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62540, term62540.getClass(), "first", term62626);
        term62678 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term62678, term62678.getClass(), "propertyTestFunctions", null);
        term62679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term62680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62679, term62679.getClass(), "functionName", null);
        setBooleanField(term62679, term62679.getClass(), "itsNeedsActivation", false);
        setIntField(term62679, term62679.getClass(), "itsFunctionType", 0);
        setBooleanField(term62679, term62679.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62679, term62679.getClass(), "encodedSourceStart", 0);
        setIntField(term62679, term62679.getClass(), "encodedSourceEnd", 0);
        setField(term62679, term62679.getClass(), "sourceName", null);
        setIntField(term62679, term62679.getClass(), "baseLineno", 0);
        setIntField(term62679, term62679.getClass(), "endLineno", 0);
        setField(term62679, term62679.getClass(), "functions", null);
        setField(term62679, term62679.getClass(), "regexps", null);
        setField(term62679, term62679.getClass(), "itsVariables", null);
        setField(term62679, term62679.getClass(), "itsConst", null);
        setField(term62679, term62679.getClass(), "itsVariableNames", null);
        setIntField(term62679, term62679.getClass(), "varStart", 0);
        setField(term62679, term62679.getClass(), "compilerData", null);
        setIntField(term62679, term62679.getClass(), "type", 0);
        setField(term62679, term62679.getClass(), "next", null);
        setField(term62680, term62680.getClass(), "functionName", null);
        setBooleanField(term62680, term62680.getClass(), "itsNeedsActivation", false);
        setIntField(term62680, term62680.getClass(), "itsFunctionType", 0);
        setBooleanField(term62680, term62680.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62680, term62680.getClass(), "encodedSourceStart", 0);
        setIntField(term62680, term62680.getClass(), "encodedSourceEnd", 0);
        setField(term62680, term62680.getClass(), "sourceName", null);
        setIntField(term62680, term62680.getClass(), "baseLineno", 0);
        setIntField(term62680, term62680.getClass(), "endLineno", 0);
        setField(term62680, term62680.getClass(), "functions", null);
        setField(term62680, term62680.getClass(), "regexps", null);
        setField(term62680, term62680.getClass(), "itsVariables", null);
        setField(term62680, term62680.getClass(), "itsConst", null);
        setField(term62680, term62680.getClass(), "itsVariableNames", null);
        setIntField(term62680, term62680.getClass(), "varStart", 0);
        setField(term62680, term62680.getClass(), "compilerData", null);
        setIntField(term62680, term62680.getClass(), "type", 0);
        setField(term62680, term62680.getClass(), "next", null);
        setField(term62680, term62680.getClass(), "first", null);
        setField(term62680, term62680.getClass(), "last", null);
        setField(term62680, term62680.getClass(), "propListHead", null);
        setIntField(term62680, term62680.getClass(), "sourcePosition", 0);
        setField(term62680, term62680.getClass(), "jsType", null);
        setField(term62680, term62680.getClass(), "parent", null);
        setField(term62679, term62679.getClass(), "first", term62680);
        setField(term62679, term62679.getClass(), "last", null);
        setField(term62679, term62679.getClass(), "propListHead", null);
        setIntField(term62679, term62679.getClass(), "sourcePosition", 0);
        setField(term62679, term62679.getClass(), "jsType", null);
        setField(term62679, term62679.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62540;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term62454, args);
        assertTrue(recursiveEquals(term62454, term62678));
        assertTrue(recursiveEquals(term62540, term62679));
        assertTrue(recursiveEquals(retValue, null));
    }

};


