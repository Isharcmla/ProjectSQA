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

public class TypeValidator_getReadableJSTypeName_850599436316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113964;
     Object term114050;
     Object term114197;
     Object term114198;

    public TypeValidator_getReadableJSTypeName_850599436316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term114050 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term114140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term114050, term114050.getClass(), "type", 42);
        setField(term114050, term114050.getClass(), "jsType", term114140);
        term114197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term114197, term114197.getClass(), "compiler", null);
        setField(term114197, term114197.getClass(), "typeRegistry", null);
        setField(term114197, term114197.getClass(), "allValueTypes", null);
        setBooleanField(term114197, term114197.getClass(), "shouldReport", false);
        setField(term114197, term114197.getClass(), "nullOrUndefined", null);
        setField(term114197, term114197.getClass(), "mismatches", null);
        term114198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term114199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term114198, term114198.getClass(), "functionName", null);
        setBooleanField(term114198, term114198.getClass(), "itsNeedsActivation", false);
        setIntField(term114198, term114198.getClass(), "itsFunctionType", 0);
        setBooleanField(term114198, term114198.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term114198, term114198.getClass(), "encodedSourceStart", 0);
        setIntField(term114198, term114198.getClass(), "encodedSourceEnd", 0);
        setField(term114198, term114198.getClass(), "sourceName", null);
        setIntField(term114198, term114198.getClass(), "baseLineno", 0);
        setIntField(term114198, term114198.getClass(), "endLineno", 0);
        setField(term114198, term114198.getClass(), "functions", null);
        setField(term114198, term114198.getClass(), "regexps", null);
        setField(term114198, term114198.getClass(), "itsVariables", null);
        setField(term114198, term114198.getClass(), "itsConst", null);
        setField(term114198, term114198.getClass(), "itsVariableNames", null);
        setIntField(term114198, term114198.getClass(), "varStart", 0);
        setField(term114198, term114198.getClass(), "compilerData", null);
        setIntField(term114198, term114198.getClass(), "type", 42);
        setField(term114198, term114198.getClass(), "next", null);
        setField(term114198, term114198.getClass(), "first", null);
        setField(term114198, term114198.getClass(), "last", null);
        setField(term114198, term114198.getClass(), "propListHead", null);
        setIntField(term114198, term114198.getClass(), "sourcePosition", 0);
        setBooleanField(term114199, term114199.getClass(), "resolved", false);
        setField(term114199, term114199.getClass(), "resolveResult", null);
        setField(term114199, term114199.getClass(), "registry", null);
        setField(term114198, term114198.getClass(), "jsType", term114199);
        setField(term114198, term114198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term114050;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term113964, args);
        assertTrue(recursiveEquals(term113964, term114197));
        assertTrue(recursiveEquals(term114050, term114198));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};


