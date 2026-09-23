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

public class FunctionTypeBuilder_inferReturnType_2137249201125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55002;
     Object term55611;
     Object term55605;

    public FunctionTypeBuilder_inferReturnType_2137249201125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55002 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term55002, term55002.getClass(), "templateTypeName", "");
        term55611 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term55611, term55611.getClass(), "fnName", null);
        setField(term55611, term55611.getClass(), "compiler", null);
        setField(term55611, term55611.getClass(), "codingConvention", null);
        setField(term55611, term55611.getClass(), "typeRegistry", null);
        setField(term55611, term55611.getClass(), "errorRoot", null);
        setField(term55611, term55611.getClass(), "sourceName", null);
        setField(term55611, term55611.getClass(), "scope", null);
        setField(term55611, term55611.getClass(), "returnType", null);
        setBooleanField(term55611, term55611.getClass(), "returnTypeInferred", false);
        setField(term55611, term55611.getClass(), "implementedInterfaces", null);
        setField(term55611, term55611.getClass(), "baseType", null);
        setField(term55611, term55611.getClass(), "thisType", null);
        setBooleanField(term55611, term55611.getClass(), "isConstructor", false);
        setBooleanField(term55611, term55611.getClass(), "isInterface", false);
        setField(term55611, term55611.getClass(), "parametersNode", null);
        setField(term55611, term55611.getClass(), "sourceNode", null);
        setField(term55611, term55611.getClass(), "templateTypeName", "");
        term55605 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term55605, term55605.getClass(), "fnName", null);
        setField(term55605, term55605.getClass(), "compiler", null);
        setField(term55605, term55605.getClass(), "codingConvention", null);
        setField(term55605, term55605.getClass(), "typeRegistry", null);
        setField(term55605, term55605.getClass(), "errorRoot", null);
        setField(term55605, term55605.getClass(), "sourceName", null);
        setField(term55605, term55605.getClass(), "scope", null);
        setField(term55605, term55605.getClass(), "returnType", null);
        setBooleanField(term55605, term55605.getClass(), "returnTypeInferred", false);
        setField(term55605, term55605.getClass(), "implementedInterfaces", null);
        setField(term55605, term55605.getClass(), "baseType", null);
        setField(term55605, term55605.getClass(), "thisType", null);
        setBooleanField(term55605, term55605.getClass(), "isConstructor", false);
        setBooleanField(term55605, term55605.getClass(), "isInterface", false);
        setField(term55605, term55605.getClass(), "parametersNode", null);
        setField(term55605, term55605.getClass(), "sourceNode", null);
        setField(term55605, term55605.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term55002, args);
        assertTrue(recursiveEquals(term55002, term55611));
        assertTrue(recursiveEquals(retValue, term55605));
    }

};


