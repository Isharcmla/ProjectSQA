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

public class TypeValidator_getReadableJSTypeName_850599436226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72397;
     Object term72483;
     Object term72648;
     Object term72649;

    public TypeValidator_getReadableJSTypeName_850599436226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72397 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term72483 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term72483, term72483.getClass(), "type", 0);
        setField(term72483, term72483.getClass(), "jsType", term72575);
        term72648 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term72648, term72648.getClass(), "compiler", null);
        setField(term72648, term72648.getClass(), "typeRegistry", null);
        setField(term72648, term72648.getClass(), "allValueTypes", null);
        setBooleanField(term72648, term72648.getClass(), "shouldReport", false);
        setField(term72648, term72648.getClass(), "nullOrUndefined", null);
        setField(term72648, term72648.getClass(), "mismatches", null);
        term72649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term72649, term72649.getClass(), "functionName", null);
        setBooleanField(term72649, term72649.getClass(), "itsNeedsActivation", false);
        setIntField(term72649, term72649.getClass(), "itsFunctionType", 0);
        setBooleanField(term72649, term72649.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term72649, term72649.getClass(), "encodedSourceStart", 0);
        setIntField(term72649, term72649.getClass(), "encodedSourceEnd", 0);
        setField(term72649, term72649.getClass(), "sourceName", null);
        setIntField(term72649, term72649.getClass(), "baseLineno", 0);
        setIntField(term72649, term72649.getClass(), "endLineno", 0);
        setField(term72649, term72649.getClass(), "functions", null);
        setField(term72649, term72649.getClass(), "regexps", null);
        setField(term72649, term72649.getClass(), "itsVariables", null);
        setField(term72649, term72649.getClass(), "itsConst", null);
        setField(term72649, term72649.getClass(), "itsVariableNames", null);
        setIntField(term72649, term72649.getClass(), "varStart", 0);
        setField(term72649, term72649.getClass(), "compilerData", null);
        setIntField(term72649, term72649.getClass(), "type", 0);
        setField(term72649, term72649.getClass(), "next", null);
        setField(term72649, term72649.getClass(), "first", null);
        setField(term72649, term72649.getClass(), "last", null);
        setField(term72649, term72649.getClass(), "propListHead", null);
        setIntField(term72649, term72649.getClass(), "sourcePosition", 0);
        setField(term72650, term72650.getClass(), "elementsType", null);
        setField(term72650, term72650.getClass(), "elements", null);
        setField(term72650, term72650.getClass(), "className", null);
        setField(term72650, term72650.getClass(), "properties", null);
        setBooleanField(term72650, term72650.getClass(), "nativeType", false);
        setField(term72650, term72650.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72650, term72650.getClass(), "prettyPrint", false);
        setBooleanField(term72650, term72650.getClass(), "visited", false);
        setField(term72650, term72650.getClass(), "docInfo", null);
        setBooleanField(term72650, term72650.getClass(), "unknown", false);
        setBooleanField(term72650, term72650.getClass(), "resolved", false);
        setField(term72650, term72650.getClass(), "resolveResult", null);
        setField(term72650, term72650.getClass(), "registry", null);
        setField(term72649, term72649.getClass(), "jsType", term72650);
        setField(term72649, term72649.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72483;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term72397, args);
        assertTrue(recursiveEquals(term72397, term72648));
        assertTrue(recursiveEquals(term72483, term72649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


