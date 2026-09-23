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

public class FunctionTypeBuilder_inferThisType_171301819536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2785;
     Object term12204;
     Object term12197;

    public FunctionTypeBuilder_inferThisType_171301819536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2785 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term2785, term2785.getClass(), "fnName", null);
        setField(term2785, term2785.getClass(), "compiler", null);
        setField(term2785, term2785.getClass(), "codingConvention", null);
        setField(term2785, term2785.getClass(), "typeRegistry", null);
        setField(term2785, term2785.getClass(), "errorRoot", null);
        setField(term2785, term2785.getClass(), "sourceName", null);
        setField(term2785, term2785.getClass(), "scope", null);
        setField(term2785, term2785.getClass(), "contents", null);
        setField(term2785, term2785.getClass(), "returnType", null);
        setBooleanField(term2785, term2785.getClass(), "returnTypeInferred", false);
        setField(term2785, term2785.getClass(), "implementedInterfaces", null);
        setField(term2785, term2785.getClass(), "extendedInterfaces", null);
        setField(term2785, term2785.getClass(), "baseType", null);
        setField(term2785, term2785.getClass(), "thisType", null);
        setBooleanField(term2785, term2785.getClass(), "isConstructor", false);
        setBooleanField(term2785, term2785.getClass(), "isInterface", false);
        setField(term2785, term2785.getClass(), "parametersNode", null);
        setField(term2785, term2785.getClass(), "templateTypeName", null);
        term12204 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12204, term12204.getClass(), "fnName", null);
        setField(term12204, term12204.getClass(), "compiler", null);
        setField(term12204, term12204.getClass(), "codingConvention", null);
        setField(term12204, term12204.getClass(), "typeRegistry", null);
        setField(term12204, term12204.getClass(), "errorRoot", null);
        setField(term12204, term12204.getClass(), "sourceName", null);
        setField(term12204, term12204.getClass(), "scope", null);
        setField(term12204, term12204.getClass(), "contents", null);
        setField(term12204, term12204.getClass(), "returnType", null);
        setBooleanField(term12204, term12204.getClass(), "returnTypeInferred", false);
        setField(term12204, term12204.getClass(), "implementedInterfaces", null);
        setField(term12204, term12204.getClass(), "extendedInterfaces", null);
        setField(term12204, term12204.getClass(), "baseType", null);
        setField(term12204, term12204.getClass(), "thisType", null);
        setBooleanField(term12204, term12204.getClass(), "isConstructor", false);
        setBooleanField(term12204, term12204.getClass(), "isInterface", false);
        setField(term12204, term12204.getClass(), "parametersNode", null);
        setField(term12204, term12204.getClass(), "templateTypeName", null);
        term12197 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12197, term12197.getClass(), "fnName", null);
        setField(term12197, term12197.getClass(), "compiler", null);
        setField(term12197, term12197.getClass(), "codingConvention", null);
        setField(term12197, term12197.getClass(), "typeRegistry", null);
        setField(term12197, term12197.getClass(), "errorRoot", null);
        setField(term12197, term12197.getClass(), "sourceName", null);
        setField(term12197, term12197.getClass(), "scope", null);
        setField(term12197, term12197.getClass(), "contents", null);
        setField(term12197, term12197.getClass(), "returnType", null);
        setBooleanField(term12197, term12197.getClass(), "returnTypeInferred", false);
        setField(term12197, term12197.getClass(), "implementedInterfaces", null);
        setField(term12197, term12197.getClass(), "extendedInterfaces", null);
        setField(term12197, term12197.getClass(), "baseType", null);
        setField(term12197, term12197.getClass(), "thisType", null);
        setBooleanField(term12197, term12197.getClass(), "isConstructor", false);
        setBooleanField(term12197, term12197.getClass(), "isInterface", false);
        setField(term12197, term12197.getClass(), "parametersNode", null);
        setField(term12197, term12197.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "inferThisType", argTypes, term2785, args);
        assertTrue(recursiveEquals(term2785, term12204));
        assertTrue(recursiveEquals(retValue, term12197));
    }

};


