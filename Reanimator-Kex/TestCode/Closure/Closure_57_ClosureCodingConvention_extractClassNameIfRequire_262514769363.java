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

public class ClosureCodingConvention_extractClassNameIfRequire_262514769363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136588;
     Object term136674;
     Object term136705;
     Object term136706;

    public ClosureCodingConvention_extractClassNameIfRequire_262514769363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136588 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term136674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term136705 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term136705, term136705.getClass(), "propertyTestFunctions", null);
        term136706 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term136706, term136706.getClass(), "functionName", null);
        setBooleanField(term136706, term136706.getClass(), "itsNeedsActivation", false);
        setIntField(term136706, term136706.getClass(), "itsFunctionType", 0);
        setBooleanField(term136706, term136706.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136706, term136706.getClass(), "encodedSourceStart", 0);
        setIntField(term136706, term136706.getClass(), "encodedSourceEnd", 0);
        setField(term136706, term136706.getClass(), "sourceName", null);
        setIntField(term136706, term136706.getClass(), "baseLineno", 0);
        setIntField(term136706, term136706.getClass(), "endLineno", 0);
        setField(term136706, term136706.getClass(), "functions", null);
        setField(term136706, term136706.getClass(), "regexps", null);
        setField(term136706, term136706.getClass(), "itsVariables", null);
        setField(term136706, term136706.getClass(), "itsConst", null);
        setField(term136706, term136706.getClass(), "itsVariableNames", null);
        setIntField(term136706, term136706.getClass(), "varStart", 0);
        setField(term136706, term136706.getClass(), "compilerData", null);
        setIntField(term136706, term136706.getClass(), "type", 0);
        setField(term136706, term136706.getClass(), "next", null);
        setField(term136706, term136706.getClass(), "first", null);
        setField(term136706, term136706.getClass(), "last", null);
        setField(term136706, term136706.getClass(), "propListHead", null);
        setIntField(term136706, term136706.getClass(), "sourcePosition", 0);
        setField(term136706, term136706.getClass(), "jsType", null);
        setField(term136706, term136706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term136674;
        Object retValue = callMethod(klass, "extractClassNameIfRequire", argTypes, term136588, args);
        assertTrue(recursiveEquals(term136588, term136705));
        assertTrue(recursiveEquals(term136674, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


