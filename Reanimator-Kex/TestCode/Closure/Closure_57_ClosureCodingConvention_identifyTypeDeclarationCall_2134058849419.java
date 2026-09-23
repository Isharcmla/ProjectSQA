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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146383;
     Object term146469;
     Object term146654;
     Object term146655;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146383 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term146469 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term146555 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term146469, term146469.getClass(), "first", term146555);
        term146654 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term146654, term146654.getClass(), "propertyTestFunctions", null);
        term146655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term146656 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term146655, term146655.getClass(), "functionName", null);
        setBooleanField(term146655, term146655.getClass(), "itsNeedsActivation", false);
        setIntField(term146655, term146655.getClass(), "itsFunctionType", 0);
        setBooleanField(term146655, term146655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term146655, term146655.getClass(), "encodedSourceStart", 0);
        setIntField(term146655, term146655.getClass(), "encodedSourceEnd", 0);
        setField(term146655, term146655.getClass(), "sourceName", null);
        setIntField(term146655, term146655.getClass(), "baseLineno", 0);
        setIntField(term146655, term146655.getClass(), "endLineno", 0);
        setField(term146655, term146655.getClass(), "functions", null);
        setField(term146655, term146655.getClass(), "regexps", null);
        setField(term146655, term146655.getClass(), "itsVariables", null);
        setField(term146655, term146655.getClass(), "itsConst", null);
        setField(term146655, term146655.getClass(), "itsVariableNames", null);
        setIntField(term146655, term146655.getClass(), "varStart", 0);
        setField(term146655, term146655.getClass(), "compilerData", null);
        setIntField(term146655, term146655.getClass(), "type", 0);
        setField(term146655, term146655.getClass(), "next", null);
        setField(term146656, term146656.getClass(), "functionName", null);
        setBooleanField(term146656, term146656.getClass(), "itsNeedsActivation", false);
        setIntField(term146656, term146656.getClass(), "itsFunctionType", 0);
        setBooleanField(term146656, term146656.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term146656, term146656.getClass(), "encodedSourceStart", 0);
        setIntField(term146656, term146656.getClass(), "encodedSourceEnd", 0);
        setField(term146656, term146656.getClass(), "sourceName", null);
        setIntField(term146656, term146656.getClass(), "baseLineno", 0);
        setIntField(term146656, term146656.getClass(), "endLineno", 0);
        setField(term146656, term146656.getClass(), "functions", null);
        setField(term146656, term146656.getClass(), "regexps", null);
        setField(term146656, term146656.getClass(), "itsVariables", null);
        setField(term146656, term146656.getClass(), "itsConst", null);
        setField(term146656, term146656.getClass(), "itsVariableNames", null);
        setIntField(term146656, term146656.getClass(), "varStart", 0);
        setField(term146656, term146656.getClass(), "compilerData", null);
        setIntField(term146656, term146656.getClass(), "type", 0);
        setField(term146656, term146656.getClass(), "next", null);
        setField(term146656, term146656.getClass(), "first", null);
        setField(term146656, term146656.getClass(), "last", null);
        setField(term146656, term146656.getClass(), "propListHead", null);
        setIntField(term146656, term146656.getClass(), "sourcePosition", 0);
        setField(term146656, term146656.getClass(), "jsType", null);
        setField(term146656, term146656.getClass(), "parent", null);
        setField(term146655, term146655.getClass(), "first", term146656);
        setField(term146655, term146655.getClass(), "last", null);
        setField(term146655, term146655.getClass(), "propListHead", null);
        setIntField(term146655, term146655.getClass(), "sourcePosition", 0);
        setField(term146655, term146655.getClass(), "jsType", null);
        setField(term146655, term146655.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term146469;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term146383, args);
        assertTrue(recursiveEquals(term146383, term146654));
        assertTrue(recursiveEquals(term146469, term146655));
        assertTrue(recursiveEquals(retValue, null));
    }

};


