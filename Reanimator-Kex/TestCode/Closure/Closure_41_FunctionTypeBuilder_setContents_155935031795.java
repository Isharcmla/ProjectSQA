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

public class FunctionTypeBuilder_setContents_155935031795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28956;
     Object term29098;
     Object term29585;
     Object term29587;
     Object term29579;

    public FunctionTypeBuilder_setContents_155935031795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28956 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term29098 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        term29585 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term29586 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(term29585, term29585.getClass(), "fnName", null);
        setField(term29585, term29585.getClass(), "compiler", null);
        setField(term29585, term29585.getClass(), "codingConvention", null);
        setField(term29585, term29585.getClass(), "typeRegistry", null);
        setField(term29585, term29585.getClass(), "errorRoot", null);
        setField(term29585, term29585.getClass(), "sourceName", null);
        setField(term29585, term29585.getClass(), "scope", null);
        setField(term29586, term29586.getClass(), "n", null);
        setBooleanField(term29586, term29586.getClass(), "hasNonEmptyReturns", false);
        setField(term29586, term29586.getClass(), "escapedVarNames", null);
        setField(term29585, term29585.getClass(), "contents", term29586);
        setField(term29585, term29585.getClass(), "returnType", null);
        setBooleanField(term29585, term29585.getClass(), "returnTypeInferred", false);
        setField(term29585, term29585.getClass(), "implementedInterfaces", null);
        setField(term29585, term29585.getClass(), "extendedInterfaces", null);
        setField(term29585, term29585.getClass(), "baseType", null);
        setField(term29585, term29585.getClass(), "thisType", null);
        setBooleanField(term29585, term29585.getClass(), "isConstructor", false);
        setBooleanField(term29585, term29585.getClass(), "isInterface", false);
        setField(term29585, term29585.getClass(), "parametersNode", null);
        setField(term29585, term29585.getClass(), "templateTypeName", null);
        term29587 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(term29587, term29587.getClass(), "n", null);
        setBooleanField(term29587, term29587.getClass(), "hasNonEmptyReturns", false);
        setField(term29587, term29587.getClass(), "escapedVarNames", null);
        term29579 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term29580 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(term29579, term29579.getClass(), "fnName", null);
        setField(term29579, term29579.getClass(), "compiler", null);
        setField(term29579, term29579.getClass(), "codingConvention", null);
        setField(term29579, term29579.getClass(), "typeRegistry", null);
        setField(term29579, term29579.getClass(), "errorRoot", null);
        setField(term29579, term29579.getClass(), "sourceName", null);
        setField(term29579, term29579.getClass(), "scope", null);
        setField(term29580, term29580.getClass(), "n", null);
        setBooleanField(term29580, term29580.getClass(), "hasNonEmptyReturns", false);
        setField(term29580, term29580.getClass(), "escapedVarNames", null);
        setField(term29579, term29579.getClass(), "contents", term29580);
        setField(term29579, term29579.getClass(), "returnType", null);
        setBooleanField(term29579, term29579.getClass(), "returnTypeInferred", false);
        setField(term29579, term29579.getClass(), "implementedInterfaces", null);
        setField(term29579, term29579.getClass(), "extendedInterfaces", null);
        setField(term29579, term29579.getClass(), "baseType", null);
        setField(term29579, term29579.getClass(), "thisType", null);
        setBooleanField(term29579, term29579.getClass(), "isConstructor", false);
        setBooleanField(term29579, term29579.getClass(), "isInterface", false);
        setField(term29579, term29579.getClass(), "parametersNode", null);
        setField(term29579, term29579.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$FunctionContents");
        Object[] args = new Object[1];
        args[0] = term29098;
        Object retValue = callMethod(klass, "setContents", argTypes, term28956, args);
        assertTrue(recursiveEquals(term28956, term29585));
        assertTrue(recursiveEquals(term29098, term29587));
        assertTrue(recursiveEquals(retValue, term29579));
    }

};


