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

public class TypeValidator_getReadableJSTypeName_850599436168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47952;
     Object term48038;
     Object term48242;
     Object term48243;

    public TypeValidator_getReadableJSTypeName_850599436168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47952 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term48038 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term48038, term48038.getClass(), "type", -34);
        setField(term48038, term48038.getClass(), "jsType", term48152);
        term48242 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term48242, term48242.getClass(), "compiler", null);
        setField(term48242, term48242.getClass(), "typeRegistry", null);
        setField(term48242, term48242.getClass(), "allValueTypes", null);
        setBooleanField(term48242, term48242.getClass(), "shouldReport", false);
        setField(term48242, term48242.getClass(), "nullOrUndefined", null);
        setField(term48242, term48242.getClass(), "mismatches", null);
        term48243 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term48243, term48243.getClass(), "functionName", null);
        setBooleanField(term48243, term48243.getClass(), "itsNeedsActivation", false);
        setIntField(term48243, term48243.getClass(), "itsFunctionType", 0);
        setBooleanField(term48243, term48243.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48243, term48243.getClass(), "encodedSourceStart", 0);
        setIntField(term48243, term48243.getClass(), "encodedSourceEnd", 0);
        setField(term48243, term48243.getClass(), "sourceName", null);
        setIntField(term48243, term48243.getClass(), "baseLineno", 0);
        setIntField(term48243, term48243.getClass(), "endLineno", 0);
        setField(term48243, term48243.getClass(), "functions", null);
        setField(term48243, term48243.getClass(), "regexps", null);
        setField(term48243, term48243.getClass(), "itsVariables", null);
        setField(term48243, term48243.getClass(), "itsConst", null);
        setField(term48243, term48243.getClass(), "itsVariableNames", null);
        setIntField(term48243, term48243.getClass(), "varStart", 0);
        setField(term48243, term48243.getClass(), "compilerData", null);
        setIntField(term48243, term48243.getClass(), "type", -34);
        setField(term48243, term48243.getClass(), "next", null);
        setField(term48243, term48243.getClass(), "first", null);
        setField(term48243, term48243.getClass(), "last", null);
        setField(term48243, term48243.getClass(), "propListHead", null);
        setIntField(term48243, term48243.getClass(), "sourcePosition", 0);
        setField(term48244, term48244.getClass(), "className", null);
        setField(term48244, term48244.getClass(), "properties", null);
        setBooleanField(term48244, term48244.getClass(), "nativeType", false);
        setField(term48244, term48244.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term48244, term48244.getClass(), "prettyPrint", false);
        setBooleanField(term48244, term48244.getClass(), "visited", false);
        setField(term48244, term48244.getClass(), "docInfo", null);
        setBooleanField(term48244, term48244.getClass(), "unknown", false);
        setBooleanField(term48244, term48244.getClass(), "resolved", false);
        setField(term48244, term48244.getClass(), "resolveResult", null);
        setField(term48244, term48244.getClass(), "registry", null);
        setField(term48243, term48243.getClass(), "jsType", term48244);
        setField(term48243, term48243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term48038;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term47952, args);
        assertTrue(recursiveEquals(term47952, term48242));
        assertTrue(recursiveEquals(term48038, term48243));
        assertTrue(recursiveEquals(retValue, "{...}"));
    }

};


