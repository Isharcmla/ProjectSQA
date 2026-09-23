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

public class FunctionTypeBuilder_inferReturnType_213724920150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37998;
     Object term38116;
     Object term38496;
     Object term38499;
     Object term38490;

    public FunctionTypeBuilder_inferReturnType_213724920150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37998 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term37998, term37998.getClass(), "templateTypeName", "");
        term38116 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term38116, term38116.getClass(), "bitset", -1610612736);
        term38496 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term38496, term38496.getClass(), "fnName", null);
        setField(term38496, term38496.getClass(), "compiler", null);
        setField(term38496, term38496.getClass(), "codingConvention", null);
        setField(term38496, term38496.getClass(), "typeRegistry", null);
        setField(term38496, term38496.getClass(), "errorRoot", null);
        setField(term38496, term38496.getClass(), "sourceName", null);
        setField(term38496, term38496.getClass(), "scope", null);
        setField(term38496, term38496.getClass(), "returnType", null);
        setBooleanField(term38496, term38496.getClass(), "returnTypeInferred", false);
        setField(term38496, term38496.getClass(), "implementedInterfaces", null);
        setField(term38496, term38496.getClass(), "baseType", null);
        setField(term38496, term38496.getClass(), "thisType", null);
        setBooleanField(term38496, term38496.getClass(), "isConstructor", false);
        setBooleanField(term38496, term38496.getClass(), "isInterface", false);
        setField(term38496, term38496.getClass(), "parametersNode", null);
        setField(term38496, term38496.getClass(), "sourceNode", null);
        setField(term38496, term38496.getClass(), "templateTypeName", "");
        term38499 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term38499, term38499.getClass(), "info", null);
        setField(term38499, term38499.getClass(), "documentation", null);
        setField(term38499, term38499.getClass(), "sourceName", null);
        setField(term38499, term38499.getClass(), "visibility", null);
        setIntField(term38499, term38499.getClass(), "bitset", -1610612736);
        setField(term38499, term38499.getClass(), "type", null);
        setField(term38499, term38499.getClass(), "thisType", null);
        setBooleanField(term38499, term38499.getClass(), "includeDocumentation", false);
        term38490 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term38490, term38490.getClass(), "fnName", null);
        setField(term38490, term38490.getClass(), "compiler", null);
        setField(term38490, term38490.getClass(), "codingConvention", null);
        setField(term38490, term38490.getClass(), "typeRegistry", null);
        setField(term38490, term38490.getClass(), "errorRoot", null);
        setField(term38490, term38490.getClass(), "sourceName", null);
        setField(term38490, term38490.getClass(), "scope", null);
        setField(term38490, term38490.getClass(), "returnType", null);
        setBooleanField(term38490, term38490.getClass(), "returnTypeInferred", false);
        setField(term38490, term38490.getClass(), "implementedInterfaces", null);
        setField(term38490, term38490.getClass(), "baseType", null);
        setField(term38490, term38490.getClass(), "thisType", null);
        setBooleanField(term38490, term38490.getClass(), "isConstructor", false);
        setBooleanField(term38490, term38490.getClass(), "isInterface", false);
        setField(term38490, term38490.getClass(), "parametersNode", null);
        setField(term38490, term38490.getClass(), "sourceNode", null);
        setField(term38490, term38490.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term38116;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term37998, args);
        assertTrue(recursiveEquals(term37998, term38496));
        assertTrue(recursiveEquals(term38116, term38499));
        assertTrue(recursiveEquals(retValue, term38490));
    }

};


