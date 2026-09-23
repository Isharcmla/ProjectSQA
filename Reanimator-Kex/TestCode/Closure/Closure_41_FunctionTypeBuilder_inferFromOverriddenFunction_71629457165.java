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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20362;
     Object term22087;
     Object term22083;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20362 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term22087 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term22087, term22087.getClass(), "fnName", null);
        setField(term22087, term22087.getClass(), "compiler", null);
        setField(term22087, term22087.getClass(), "codingConvention", null);
        setField(term22087, term22087.getClass(), "typeRegistry", null);
        setField(term22087, term22087.getClass(), "errorRoot", null);
        setField(term22087, term22087.getClass(), "sourceName", null);
        setField(term22087, term22087.getClass(), "scope", null);
        setField(term22087, term22087.getClass(), "contents", null);
        setField(term22087, term22087.getClass(), "returnType", null);
        setBooleanField(term22087, term22087.getClass(), "returnTypeInferred", false);
        setField(term22087, term22087.getClass(), "implementedInterfaces", null);
        setField(term22087, term22087.getClass(), "extendedInterfaces", null);
        setField(term22087, term22087.getClass(), "baseType", null);
        setField(term22087, term22087.getClass(), "thisType", null);
        setBooleanField(term22087, term22087.getClass(), "isConstructor", false);
        setBooleanField(term22087, term22087.getClass(), "isInterface", false);
        setField(term22087, term22087.getClass(), "parametersNode", null);
        setField(term22087, term22087.getClass(), "templateTypeName", null);
        term22083 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term22083, term22083.getClass(), "fnName", null);
        setField(term22083, term22083.getClass(), "compiler", null);
        setField(term22083, term22083.getClass(), "codingConvention", null);
        setField(term22083, term22083.getClass(), "typeRegistry", null);
        setField(term22083, term22083.getClass(), "errorRoot", null);
        setField(term22083, term22083.getClass(), "sourceName", null);
        setField(term22083, term22083.getClass(), "scope", null);
        setField(term22083, term22083.getClass(), "contents", null);
        setField(term22083, term22083.getClass(), "returnType", null);
        setBooleanField(term22083, term22083.getClass(), "returnTypeInferred", false);
        setField(term22083, term22083.getClass(), "implementedInterfaces", null);
        setField(term22083, term22083.getClass(), "extendedInterfaces", null);
        setField(term22083, term22083.getClass(), "baseType", null);
        setField(term22083, term22083.getClass(), "thisType", null);
        setBooleanField(term22083, term22083.getClass(), "isConstructor", false);
        setBooleanField(term22083, term22083.getClass(), "isInterface", false);
        setField(term22083, term22083.getClass(), "parametersNode", null);
        setField(term22083, term22083.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term20362, args);
        assertTrue(recursiveEquals(term20362, term22087));
        assertTrue(recursiveEquals(retValue, term22083));
    }

};


