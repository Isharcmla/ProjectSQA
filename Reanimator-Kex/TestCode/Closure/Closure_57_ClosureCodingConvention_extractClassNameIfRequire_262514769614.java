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

public class ClosureCodingConvention_extractClassNameIfRequire_262514769614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211799;
     Object term211885;
     Object term230009;
     Object term230010;

    public ClosureCodingConvention_extractClassNameIfRequire_262514769614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211799 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term211885 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term211971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term211885, term211885.getClass(), "type", 130);
        setField(term211885, term211885.getClass(), "first", term211971);
        term230009 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term230009, term230009.getClass(), "propertyTestFunctions", null);
        term230010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term230011 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230010, term230010.getClass(), "functionName", null);
        setBooleanField(term230010, term230010.getClass(), "itsNeedsActivation", false);
        setIntField(term230010, term230010.getClass(), "itsFunctionType", 0);
        setBooleanField(term230010, term230010.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230010, term230010.getClass(), "encodedSourceStart", 0);
        setIntField(term230010, term230010.getClass(), "encodedSourceEnd", 0);
        setField(term230010, term230010.getClass(), "sourceName", null);
        setIntField(term230010, term230010.getClass(), "baseLineno", 0);
        setIntField(term230010, term230010.getClass(), "endLineno", 0);
        setField(term230010, term230010.getClass(), "functions", null);
        setField(term230010, term230010.getClass(), "regexps", null);
        setField(term230010, term230010.getClass(), "itsVariables", null);
        setField(term230010, term230010.getClass(), "itsConst", null);
        setField(term230010, term230010.getClass(), "itsVariableNames", null);
        setIntField(term230010, term230010.getClass(), "varStart", 0);
        setField(term230010, term230010.getClass(), "compilerData", null);
        setIntField(term230010, term230010.getClass(), "type", 130);
        setField(term230010, term230010.getClass(), "next", null);
        setField(term230011, term230011.getClass(), "functionName", null);
        setBooleanField(term230011, term230011.getClass(), "itsNeedsActivation", false);
        setIntField(term230011, term230011.getClass(), "itsFunctionType", 0);
        setBooleanField(term230011, term230011.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230011, term230011.getClass(), "encodedSourceStart", 0);
        setIntField(term230011, term230011.getClass(), "encodedSourceEnd", 0);
        setField(term230011, term230011.getClass(), "sourceName", null);
        setIntField(term230011, term230011.getClass(), "baseLineno", 0);
        setIntField(term230011, term230011.getClass(), "endLineno", 0);
        setField(term230011, term230011.getClass(), "functions", null);
        setField(term230011, term230011.getClass(), "regexps", null);
        setField(term230011, term230011.getClass(), "itsVariables", null);
        setField(term230011, term230011.getClass(), "itsConst", null);
        setField(term230011, term230011.getClass(), "itsVariableNames", null);
        setIntField(term230011, term230011.getClass(), "varStart", 0);
        setField(term230011, term230011.getClass(), "compilerData", null);
        setIntField(term230011, term230011.getClass(), "type", 0);
        setField(term230011, term230011.getClass(), "next", null);
        setField(term230011, term230011.getClass(), "first", null);
        setField(term230011, term230011.getClass(), "last", null);
        setField(term230011, term230011.getClass(), "propListHead", null);
        setIntField(term230011, term230011.getClass(), "sourcePosition", 0);
        setField(term230011, term230011.getClass(), "jsType", null);
        setField(term230011, term230011.getClass(), "parent", null);
        setField(term230010, term230010.getClass(), "first", term230011);
        setField(term230010, term230010.getClass(), "last", null);
        setField(term230010, term230010.getClass(), "propListHead", null);
        setIntField(term230010, term230010.getClass(), "sourcePosition", 0);
        setField(term230010, term230010.getClass(), "jsType", null);
        setField(term230010, term230010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term211885;
        Object retValue = callMethod(klass, "extractClassNameIfRequire", argTypes, term211799, args);
        assertTrue(recursiveEquals(term211799, term230009));
        assertTrue(recursiveEquals(term211885, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


