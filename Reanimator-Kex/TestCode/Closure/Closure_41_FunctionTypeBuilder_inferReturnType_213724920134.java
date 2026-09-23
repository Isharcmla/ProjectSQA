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

public class FunctionTypeBuilder_inferReturnType_213724920134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;
     Object term12188;
     Object term12184;

    public FunctionTypeBuilder_inferReturnType_213724920134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1463 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term1463, term1463.getClass(), "fnName", null);
        setField(term1463, term1463.getClass(), "compiler", null);
        setField(term1463, term1463.getClass(), "codingConvention", null);
        setField(term1463, term1463.getClass(), "typeRegistry", null);
        setField(term1463, term1463.getClass(), "errorRoot", null);
        setField(term1463, term1463.getClass(), "sourceName", null);
        setField(term1463, term1463.getClass(), "scope", null);
        setField(term1463, term1463.getClass(), "contents", null);
        setField(term1463, term1463.getClass(), "returnType", null);
        setBooleanField(term1463, term1463.getClass(), "returnTypeInferred", false);
        setField(term1463, term1463.getClass(), "implementedInterfaces", null);
        setField(term1463, term1463.getClass(), "extendedInterfaces", null);
        setField(term1463, term1463.getClass(), "baseType", null);
        setField(term1463, term1463.getClass(), "thisType", null);
        setBooleanField(term1463, term1463.getClass(), "isConstructor", false);
        setBooleanField(term1463, term1463.getClass(), "isInterface", false);
        setField(term1463, term1463.getClass(), "parametersNode", null);
        setField(term1463, term1463.getClass(), "templateTypeName", null);
        term12188 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12188, term12188.getClass(), "fnName", null);
        setField(term12188, term12188.getClass(), "compiler", null);
        setField(term12188, term12188.getClass(), "codingConvention", null);
        setField(term12188, term12188.getClass(), "typeRegistry", null);
        setField(term12188, term12188.getClass(), "errorRoot", null);
        setField(term12188, term12188.getClass(), "sourceName", null);
        setField(term12188, term12188.getClass(), "scope", null);
        setField(term12188, term12188.getClass(), "contents", null);
        setField(term12188, term12188.getClass(), "returnType", null);
        setBooleanField(term12188, term12188.getClass(), "returnTypeInferred", false);
        setField(term12188, term12188.getClass(), "implementedInterfaces", null);
        setField(term12188, term12188.getClass(), "extendedInterfaces", null);
        setField(term12188, term12188.getClass(), "baseType", null);
        setField(term12188, term12188.getClass(), "thisType", null);
        setBooleanField(term12188, term12188.getClass(), "isConstructor", false);
        setBooleanField(term12188, term12188.getClass(), "isInterface", false);
        setField(term12188, term12188.getClass(), "parametersNode", null);
        setField(term12188, term12188.getClass(), "templateTypeName", null);
        term12184 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term12184, term12184.getClass(), "fnName", null);
        setField(term12184, term12184.getClass(), "compiler", null);
        setField(term12184, term12184.getClass(), "codingConvention", null);
        setField(term12184, term12184.getClass(), "typeRegistry", null);
        setField(term12184, term12184.getClass(), "errorRoot", null);
        setField(term12184, term12184.getClass(), "sourceName", null);
        setField(term12184, term12184.getClass(), "scope", null);
        setField(term12184, term12184.getClass(), "contents", null);
        setField(term12184, term12184.getClass(), "returnType", null);
        setBooleanField(term12184, term12184.getClass(), "returnTypeInferred", false);
        setField(term12184, term12184.getClass(), "implementedInterfaces", null);
        setField(term12184, term12184.getClass(), "extendedInterfaces", null);
        setField(term12184, term12184.getClass(), "baseType", null);
        setField(term12184, term12184.getClass(), "thisType", null);
        setBooleanField(term12184, term12184.getClass(), "isConstructor", false);
        setBooleanField(term12184, term12184.getClass(), "isInterface", false);
        setField(term12184, term12184.getClass(), "parametersNode", null);
        setField(term12184, term12184.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term1463, args);
        assertTrue(recursiveEquals(term1463, term12188));
        assertTrue(recursiveEquals(retValue, term12184));
    }

};


