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

public class FunctionTypeBuilder_inferReturnType_213724920191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28670;
     Object term28842;
     Object term28832;

    public FunctionTypeBuilder_inferReturnType_213724920191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28670 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term28670, term28670.getClass(), "templateTypeName", "");
        setField(term28670, term28670.getClass(), "returnType", term28818);
        term28842 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term28842, term28842.getClass(), "fnName", null);
        setField(term28842, term28842.getClass(), "compiler", null);
        setField(term28842, term28842.getClass(), "codingConvention", null);
        setField(term28842, term28842.getClass(), "typeRegistry", null);
        setField(term28842, term28842.getClass(), "errorRoot", null);
        setField(term28842, term28842.getClass(), "sourceName", null);
        setField(term28842, term28842.getClass(), "scope", null);
        setField(term28842, term28842.getClass(), "contents", null);
        setField(term28843, term28843.getClass(), "parameterType", null);
        setField(term28843, term28843.getClass(), "referencedType", null);
        setField(term28843, term28843.getClass(), "referencedObjType", null);
        setBooleanField(term28843, term28843.getClass(), "visited", false);
        setField(term28843, term28843.getClass(), "docInfo", null);
        setBooleanField(term28843, term28843.getClass(), "unknown", false);
        setBooleanField(term28843, term28843.getClass(), "resolved", false);
        setField(term28843, term28843.getClass(), "resolveResult", null);
        setField(term28843, term28843.getClass(), "registry", null);
        setField(term28842, term28842.getClass(), "returnType", term28843);
        setBooleanField(term28842, term28842.getClass(), "returnTypeInferred", false);
        setField(term28842, term28842.getClass(), "implementedInterfaces", null);
        setField(term28842, term28842.getClass(), "extendedInterfaces", null);
        setField(term28842, term28842.getClass(), "baseType", null);
        setField(term28842, term28842.getClass(), "thisType", null);
        setBooleanField(term28842, term28842.getClass(), "isConstructor", false);
        setBooleanField(term28842, term28842.getClass(), "isInterface", false);
        setField(term28842, term28842.getClass(), "parametersNode", null);
        setField(term28842, term28842.getClass(), "templateTypeName", "");
        term28832 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term28832, term28832.getClass(), "fnName", null);
        setField(term28832, term28832.getClass(), "compiler", null);
        setField(term28832, term28832.getClass(), "codingConvention", null);
        setField(term28832, term28832.getClass(), "typeRegistry", null);
        setField(term28832, term28832.getClass(), "errorRoot", null);
        setField(term28832, term28832.getClass(), "sourceName", null);
        setField(term28832, term28832.getClass(), "scope", null);
        setField(term28832, term28832.getClass(), "contents", null);
        setField(term28833, term28833.getClass(), "parameterType", null);
        setField(term28833, term28833.getClass(), "referencedType", null);
        setField(term28833, term28833.getClass(), "referencedObjType", null);
        setBooleanField(term28833, term28833.getClass(), "visited", false);
        setField(term28833, term28833.getClass(), "docInfo", null);
        setBooleanField(term28833, term28833.getClass(), "unknown", false);
        setBooleanField(term28833, term28833.getClass(), "resolved", false);
        setField(term28833, term28833.getClass(), "resolveResult", null);
        setField(term28833, term28833.getClass(), "registry", null);
        setField(term28832, term28832.getClass(), "returnType", term28833);
        setBooleanField(term28832, term28832.getClass(), "returnTypeInferred", false);
        setField(term28832, term28832.getClass(), "implementedInterfaces", null);
        setField(term28832, term28832.getClass(), "extendedInterfaces", null);
        setField(term28832, term28832.getClass(), "baseType", null);
        setField(term28832, term28832.getClass(), "thisType", null);
        setBooleanField(term28832, term28832.getClass(), "isConstructor", false);
        setBooleanField(term28832, term28832.getClass(), "isInterface", false);
        setField(term28832, term28832.getClass(), "parametersNode", null);
        setField(term28832, term28832.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term28670, args);
        assertTrue(recursiveEquals(term28670, term28842));
        assertTrue(recursiveEquals(retValue, term28832));
    }

};


