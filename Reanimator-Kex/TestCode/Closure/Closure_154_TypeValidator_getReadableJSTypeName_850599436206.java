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

public class TypeValidator_getReadableJSTypeName_850599436206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66440;
     Object term66526;
     Object term66668;
     Object term66669;

    public TypeValidator_getReadableJSTypeName_850599436206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66440 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term66526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term66526, term66526.getClass(), "type", -34);
        setField(term66526, term66526.getClass(), "jsType", term66616);
        term66668 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term66668, term66668.getClass(), "compiler", null);
        setField(term66668, term66668.getClass(), "typeRegistry", null);
        setField(term66668, term66668.getClass(), "allValueTypes", null);
        setBooleanField(term66668, term66668.getClass(), "shouldReport", false);
        setField(term66668, term66668.getClass(), "nullOrUndefined", null);
        setField(term66668, term66668.getClass(), "mismatches", null);
        term66669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term66669, term66669.getClass(), "functionName", null);
        setBooleanField(term66669, term66669.getClass(), "itsNeedsActivation", false);
        setIntField(term66669, term66669.getClass(), "itsFunctionType", 0);
        setBooleanField(term66669, term66669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66669, term66669.getClass(), "encodedSourceStart", 0);
        setIntField(term66669, term66669.getClass(), "encodedSourceEnd", 0);
        setField(term66669, term66669.getClass(), "sourceName", null);
        setIntField(term66669, term66669.getClass(), "baseLineno", 0);
        setIntField(term66669, term66669.getClass(), "endLineno", 0);
        setField(term66669, term66669.getClass(), "functions", null);
        setField(term66669, term66669.getClass(), "regexps", null);
        setField(term66669, term66669.getClass(), "itsVariables", null);
        setField(term66669, term66669.getClass(), "itsConst", null);
        setField(term66669, term66669.getClass(), "itsVariableNames", null);
        setIntField(term66669, term66669.getClass(), "varStart", 0);
        setField(term66669, term66669.getClass(), "compilerData", null);
        setIntField(term66669, term66669.getClass(), "type", -34);
        setField(term66669, term66669.getClass(), "next", null);
        setField(term66669, term66669.getClass(), "first", null);
        setField(term66669, term66669.getClass(), "last", null);
        setField(term66669, term66669.getClass(), "propListHead", null);
        setIntField(term66669, term66669.getClass(), "sourcePosition", 0);
        setBooleanField(term66670, term66670.getClass(), "resolved", false);
        setField(term66670, term66670.getClass(), "resolveResult", null);
        setField(term66670, term66670.getClass(), "registry", null);
        setField(term66669, term66669.getClass(), "jsType", term66670);
        setField(term66669, term66669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term66526;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term66440, args);
        assertTrue(recursiveEquals(term66440, term66668));
        assertTrue(recursiveEquals(term66526, term66669));
        assertTrue(recursiveEquals(retValue, "*"));
    }

};


