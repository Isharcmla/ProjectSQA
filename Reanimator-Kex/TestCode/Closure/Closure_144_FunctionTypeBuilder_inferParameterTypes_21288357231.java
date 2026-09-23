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

public class FunctionTypeBuilder_inferParameterTypes_21288357231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8373;
     Object term28188;
     Object term27841;

    public FunctionTypeBuilder_inferParameterTypes_21288357231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8373 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term8373, term8373.getClass(), "fnName", null);
        setField(term8373, term8373.getClass(), "compiler", null);
        setField(term8373, term8373.getClass(), "codingConvention", null);
        setField(term8373, term8373.getClass(), "typeRegistry", null);
        setField(term8373, term8373.getClass(), "errorRoot", null);
        setField(term8373, term8373.getClass(), "sourceName", null);
        setField(term8373, term8373.getClass(), "scope", null);
        setField(term8373, term8373.getClass(), "returnType", null);
        setField(term8373, term8373.getClass(), "implementedInterfaces", null);
        setField(term8373, term8373.getClass(), "baseType", null);
        setField(term8373, term8373.getClass(), "thisType", null);
        setBooleanField(term8373, term8373.getClass(), "isConstructor", false);
        setBooleanField(term8373, term8373.getClass(), "isInterface", false);
        setField(term8373, term8373.getClass(), "parametersNode", null);
        setField(term8373, term8373.getClass(), "sourceNode", null);
        setField(term8373, term8373.getClass(), "templateTypeName", null);
        term28188 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term28188, term28188.getClass(), "fnName", null);
        setField(term28188, term28188.getClass(), "compiler", null);
        setField(term28188, term28188.getClass(), "codingConvention", null);
        setField(term28188, term28188.getClass(), "typeRegistry", null);
        setField(term28188, term28188.getClass(), "errorRoot", null);
        setField(term28188, term28188.getClass(), "sourceName", null);
        setField(term28188, term28188.getClass(), "scope", null);
        setField(term28188, term28188.getClass(), "returnType", null);
        setField(term28188, term28188.getClass(), "implementedInterfaces", null);
        setField(term28188, term28188.getClass(), "baseType", null);
        setField(term28188, term28188.getClass(), "thisType", null);
        setBooleanField(term28188, term28188.getClass(), "isConstructor", false);
        setBooleanField(term28188, term28188.getClass(), "isInterface", false);
        setField(term28188, term28188.getClass(), "parametersNode", null);
        setField(term28188, term28188.getClass(), "sourceNode", null);
        setField(term28188, term28188.getClass(), "templateTypeName", null);
        term27841 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term27841, term27841.getClass(), "fnName", null);
        setField(term27841, term27841.getClass(), "compiler", null);
        setField(term27841, term27841.getClass(), "codingConvention", null);
        setField(term27841, term27841.getClass(), "typeRegistry", null);
        setField(term27841, term27841.getClass(), "errorRoot", null);
        setField(term27841, term27841.getClass(), "sourceName", null);
        setField(term27841, term27841.getClass(), "scope", null);
        setField(term27841, term27841.getClass(), "returnType", null);
        setField(term27841, term27841.getClass(), "implementedInterfaces", null);
        setField(term27841, term27841.getClass(), "baseType", null);
        setField(term27841, term27841.getClass(), "thisType", null);
        setBooleanField(term27841, term27841.getClass(), "isConstructor", false);
        setBooleanField(term27841, term27841.getClass(), "isInterface", false);
        setField(term27841, term27841.getClass(), "parametersNode", null);
        setField(term27841, term27841.getClass(), "sourceNode", null);
        setField(term27841, term27841.getClass(), "templateTypeName", null);
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
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term8373, args);
        assertTrue(recursiveEquals(term8373, term28188));
        assertTrue(recursiveEquals(retValue, term27841));
    }

};


