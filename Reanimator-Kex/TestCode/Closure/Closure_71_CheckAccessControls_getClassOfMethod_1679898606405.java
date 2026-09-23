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

public class CheckAccessControls_getClassOfMethod_1679898606405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203753;
     Object term203839;
     Object term203925;
     Object term204804;
     Object term204805;
     Object term204806;

    public CheckAccessControls_getClassOfMethod_1679898606405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203753 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term203839 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term203925 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term203925, term203925.getClass(), "type", -87);
        term204804 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term204804, term204804.getClass(), "compiler", null);
        setField(term204804, term204804.getClass(), "validator", null);
        setIntField(term204804, term204804.getClass(), "deprecatedDepth", 0);
        setIntField(term204804, term204804.getClass(), "methodDepth", 0);
        setField(term204804, term204804.getClass(), "currentClass", null);
        setField(term204804, term204804.getClass(), "initializedConstantProperties", null);
        term204805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term204805, term204805.getClass(), "functionName", null);
        setBooleanField(term204805, term204805.getClass(), "itsNeedsActivation", false);
        setIntField(term204805, term204805.getClass(), "itsFunctionType", 0);
        setBooleanField(term204805, term204805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term204805, term204805.getClass(), "encodedSourceStart", 0);
        setIntField(term204805, term204805.getClass(), "encodedSourceEnd", 0);
        setField(term204805, term204805.getClass(), "sourceName", null);
        setIntField(term204805, term204805.getClass(), "baseLineno", 0);
        setIntField(term204805, term204805.getClass(), "endLineno", 0);
        setField(term204805, term204805.getClass(), "functions", null);
        setField(term204805, term204805.getClass(), "regexps", null);
        setField(term204805, term204805.getClass(), "itsVariables", null);
        setField(term204805, term204805.getClass(), "itsConst", null);
        setField(term204805, term204805.getClass(), "itsVariableNames", null);
        setIntField(term204805, term204805.getClass(), "varStart", 0);
        setField(term204805, term204805.getClass(), "compilerData", null);
        setIntField(term204805, term204805.getClass(), "type", -87);
        setField(term204805, term204805.getClass(), "next", null);
        setField(term204805, term204805.getClass(), "first", null);
        setField(term204805, term204805.getClass(), "last", null);
        setField(term204805, term204805.getClass(), "propListHead", null);
        setIntField(term204805, term204805.getClass(), "sourcePosition", 0);
        setField(term204805, term204805.getClass(), "jsType", null);
        setField(term204805, term204805.getClass(), "parent", null);
        term204806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term204806, term204806.getClass(), "functionName", null);
        setBooleanField(term204806, term204806.getClass(), "itsNeedsActivation", false);
        setIntField(term204806, term204806.getClass(), "itsFunctionType", 0);
        setBooleanField(term204806, term204806.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term204806, term204806.getClass(), "encodedSourceStart", 0);
        setIntField(term204806, term204806.getClass(), "encodedSourceEnd", 0);
        setField(term204806, term204806.getClass(), "sourceName", null);
        setIntField(term204806, term204806.getClass(), "baseLineno", 0);
        setIntField(term204806, term204806.getClass(), "endLineno", 0);
        setField(term204806, term204806.getClass(), "functions", null);
        setField(term204806, term204806.getClass(), "regexps", null);
        setField(term204806, term204806.getClass(), "itsVariables", null);
        setField(term204806, term204806.getClass(), "itsConst", null);
        setField(term204806, term204806.getClass(), "itsVariableNames", null);
        setIntField(term204806, term204806.getClass(), "varStart", 0);
        setField(term204806, term204806.getClass(), "compilerData", null);
        setIntField(term204806, term204806.getClass(), "type", 0);
        setField(term204806, term204806.getClass(), "next", null);
        setField(term204806, term204806.getClass(), "first", null);
        setField(term204806, term204806.getClass(), "last", null);
        setField(term204806, term204806.getClass(), "propListHead", null);
        setIntField(term204806, term204806.getClass(), "sourcePosition", 0);
        setField(term204806, term204806.getClass(), "jsType", null);
        setField(term204806, term204806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term203839;
        args[1] = term203925;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term203753, args);
        assertTrue(recursiveEquals(term203753, term204804));
        assertTrue(recursiveEquals(term203839, term204805));
        assertTrue(recursiveEquals(term203925, term204806));
        assertTrue(recursiveEquals(retValue, null));
    }

};


