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

public class FunctionTypeBuilder_inferParameterTypes_21288357239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4782;
     Object term12470;
     Object term12466;

    public FunctionTypeBuilder_inferParameterTypes_21288357239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4782 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term4782, term4782.getClass(), "fnName", null);
        setField(term4782, term4782.getClass(), "compiler", null);
        setField(term4782, term4782.getClass(), "codingConvention", null);
        setField(term4782, term4782.getClass(), "typeRegistry", null);
        setField(term4782, term4782.getClass(), "errorRoot", null);
        setField(term4782, term4782.getClass(), "sourceName", null);
        setField(term4782, term4782.getClass(), "scope", null);
        setField(term4782, term4782.getClass(), "contents", null);
        setField(term4782, term4782.getClass(), "returnType", null);
        setBooleanField(term4782, term4782.getClass(), "returnTypeInferred", false);
        setField(term4782, term4782.getClass(), "implementedInterfaces", null);
        setField(term4782, term4782.getClass(), "extendedInterfaces", null);
        setField(term4782, term4782.getClass(), "baseType", null);
        setField(term4782, term4782.getClass(), "thisType", null);
        setBooleanField(term4782, term4782.getClass(), "isConstructor", false);
        setBooleanField(term4782, term4782.getClass(), "isInterface", false);
        setField(term4782, term4782.getClass(), "parametersNode", null);
        setField(term4782, term4782.getClass(), "templateTypeName", null);
        term12470 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12470, term12470.getClass(), "fnName", null);
        setField(term12470, term12470.getClass(), "compiler", null);
        setField(term12470, term12470.getClass(), "codingConvention", null);
        setField(term12470, term12470.getClass(), "typeRegistry", null);
        setField(term12470, term12470.getClass(), "errorRoot", null);
        setField(term12470, term12470.getClass(), "sourceName", null);
        setField(term12470, term12470.getClass(), "scope", null);
        setField(term12470, term12470.getClass(), "contents", null);
        setField(term12470, term12470.getClass(), "returnType", null);
        setBooleanField(term12470, term12470.getClass(), "returnTypeInferred", false);
        setField(term12470, term12470.getClass(), "implementedInterfaces", null);
        setField(term12470, term12470.getClass(), "extendedInterfaces", null);
        setField(term12470, term12470.getClass(), "baseType", null);
        setField(term12470, term12470.getClass(), "thisType", null);
        setBooleanField(term12470, term12470.getClass(), "isConstructor", false);
        setBooleanField(term12470, term12470.getClass(), "isInterface", false);
        setField(term12470, term12470.getClass(), "parametersNode", null);
        setField(term12470, term12470.getClass(), "templateTypeName", null);
        term12466 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12466, term12466.getClass(), "fnName", null);
        setField(term12466, term12466.getClass(), "compiler", null);
        setField(term12466, term12466.getClass(), "codingConvention", null);
        setField(term12466, term12466.getClass(), "typeRegistry", null);
        setField(term12466, term12466.getClass(), "errorRoot", null);
        setField(term12466, term12466.getClass(), "sourceName", null);
        setField(term12466, term12466.getClass(), "scope", null);
        setField(term12466, term12466.getClass(), "contents", null);
        setField(term12466, term12466.getClass(), "returnType", null);
        setBooleanField(term12466, term12466.getClass(), "returnTypeInferred", false);
        setField(term12466, term12466.getClass(), "implementedInterfaces", null);
        setField(term12466, term12466.getClass(), "extendedInterfaces", null);
        setField(term12466, term12466.getClass(), "baseType", null);
        setField(term12466, term12466.getClass(), "thisType", null);
        setBooleanField(term12466, term12466.getClass(), "isConstructor", false);
        setBooleanField(term12466, term12466.getClass(), "isInterface", false);
        setField(term12466, term12466.getClass(), "parametersNode", null);
        setField(term12466, term12466.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term4782, args);
        assertTrue(recursiveEquals(term4782, term12470));
        assertTrue(recursiveEquals(retValue, term12466));
    }

};


