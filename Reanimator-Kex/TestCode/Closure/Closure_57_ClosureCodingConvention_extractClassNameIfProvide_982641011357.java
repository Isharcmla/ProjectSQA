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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134417;
     Object term134509;
     Object term134653;
     Object term134654;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134417 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term134509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term134509, term134509.getClass(), "type", 130);
        setField(term134509, term134509.getClass(), "first", term134595);
        term134653 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term134653, term134653.getClass(), "propertyTestFunctions", null);
        term134654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term134654, term134654.getClass(), "str", null);
        setIntField(term134654, term134654.getClass(), "type", 130);
        setField(term134654, term134654.getClass(), "next", null);
        setField(term134655, term134655.getClass(), "functionName", null);
        setBooleanField(term134655, term134655.getClass(), "itsNeedsActivation", false);
        setIntField(term134655, term134655.getClass(), "itsFunctionType", 0);
        setBooleanField(term134655, term134655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term134655, term134655.getClass(), "encodedSourceStart", 0);
        setIntField(term134655, term134655.getClass(), "encodedSourceEnd", 0);
        setField(term134655, term134655.getClass(), "sourceName", null);
        setIntField(term134655, term134655.getClass(), "baseLineno", 0);
        setIntField(term134655, term134655.getClass(), "endLineno", 0);
        setField(term134655, term134655.getClass(), "functions", null);
        setField(term134655, term134655.getClass(), "regexps", null);
        setField(term134655, term134655.getClass(), "itsVariables", null);
        setField(term134655, term134655.getClass(), "itsConst", null);
        setField(term134655, term134655.getClass(), "itsVariableNames", null);
        setIntField(term134655, term134655.getClass(), "varStart", 0);
        setField(term134655, term134655.getClass(), "compilerData", null);
        setIntField(term134655, term134655.getClass(), "type", 0);
        setField(term134655, term134655.getClass(), "next", null);
        setField(term134655, term134655.getClass(), "first", null);
        setField(term134655, term134655.getClass(), "last", null);
        setField(term134655, term134655.getClass(), "propListHead", null);
        setIntField(term134655, term134655.getClass(), "sourcePosition", 0);
        setField(term134655, term134655.getClass(), "jsType", null);
        setField(term134655, term134655.getClass(), "parent", null);
        setField(term134654, term134654.getClass(), "first", term134655);
        setField(term134654, term134654.getClass(), "last", null);
        setField(term134654, term134654.getClass(), "propListHead", null);
        setIntField(term134654, term134654.getClass(), "sourcePosition", 0);
        setField(term134654, term134654.getClass(), "jsType", null);
        setField(term134654, term134654.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term134509;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term134417, args);
        assertTrue(recursiveEquals(term134417, term134653));
        assertTrue(recursiveEquals(term134509, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


