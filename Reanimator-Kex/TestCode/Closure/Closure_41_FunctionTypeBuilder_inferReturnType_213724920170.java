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

public class FunctionTypeBuilder_inferReturnType_213724920170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22463;
     Object term22767;
     Object term22761;

    public FunctionTypeBuilder_inferReturnType_213724920170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22463 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term22463, term22463.getClass(), "templateTypeName", "");
        term22767 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term22767, term22767.getClass(), "fnName", null);
        setField(term22767, term22767.getClass(), "compiler", null);
        setField(term22767, term22767.getClass(), "codingConvention", null);
        setField(term22767, term22767.getClass(), "typeRegistry", null);
        setField(term22767, term22767.getClass(), "errorRoot", null);
        setField(term22767, term22767.getClass(), "sourceName", null);
        setField(term22767, term22767.getClass(), "scope", null);
        setField(term22767, term22767.getClass(), "contents", null);
        setField(term22767, term22767.getClass(), "returnType", null);
        setBooleanField(term22767, term22767.getClass(), "returnTypeInferred", false);
        setField(term22767, term22767.getClass(), "implementedInterfaces", null);
        setField(term22767, term22767.getClass(), "extendedInterfaces", null);
        setField(term22767, term22767.getClass(), "baseType", null);
        setField(term22767, term22767.getClass(), "thisType", null);
        setBooleanField(term22767, term22767.getClass(), "isConstructor", false);
        setBooleanField(term22767, term22767.getClass(), "isInterface", false);
        setField(term22767, term22767.getClass(), "parametersNode", null);
        setField(term22767, term22767.getClass(), "templateTypeName", "");
        term22761 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term22761, term22761.getClass(), "fnName", null);
        setField(term22761, term22761.getClass(), "compiler", null);
        setField(term22761, term22761.getClass(), "codingConvention", null);
        setField(term22761, term22761.getClass(), "typeRegistry", null);
        setField(term22761, term22761.getClass(), "errorRoot", null);
        setField(term22761, term22761.getClass(), "sourceName", null);
        setField(term22761, term22761.getClass(), "scope", null);
        setField(term22761, term22761.getClass(), "contents", null);
        setField(term22761, term22761.getClass(), "returnType", null);
        setBooleanField(term22761, term22761.getClass(), "returnTypeInferred", false);
        setField(term22761, term22761.getClass(), "implementedInterfaces", null);
        setField(term22761, term22761.getClass(), "extendedInterfaces", null);
        setField(term22761, term22761.getClass(), "baseType", null);
        setField(term22761, term22761.getClass(), "thisType", null);
        setBooleanField(term22761, term22761.getClass(), "isConstructor", false);
        setBooleanField(term22761, term22761.getClass(), "isInterface", false);
        setField(term22761, term22761.getClass(), "parametersNode", null);
        setField(term22761, term22761.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term22463, args);
        assertTrue(recursiveEquals(term22463, term22767));
        assertTrue(recursiveEquals(retValue, term22761));
    }

};


