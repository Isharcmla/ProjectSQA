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

public class FunctionTypeBuilder_inferParameterTypes_212883572156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46422;
     Object term46492;
     Object term46945;
     Object term46947;
     Object term46938;

    public FunctionTypeBuilder_inferParameterTypes_212883572156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46422 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term46422, term46422.getClass(), "parametersNode", null);
        setField(term46422, term46422.getClass(), "typeRegistry", null);
        term46492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46492, term46492.getClass(), "first", null);
        term46945 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term46946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46945, term46945.getClass(), "fnName", null);
        setField(term46945, term46945.getClass(), "compiler", null);
        setField(term46945, term46945.getClass(), "codingConvention", null);
        setField(term46945, term46945.getClass(), "typeRegistry", null);
        setField(term46945, term46945.getClass(), "errorRoot", null);
        setField(term46945, term46945.getClass(), "sourceName", null);
        setField(term46945, term46945.getClass(), "scope", null);
        setField(term46945, term46945.getClass(), "contents", null);
        setField(term46945, term46945.getClass(), "returnType", null);
        setBooleanField(term46945, term46945.getClass(), "returnTypeInferred", false);
        setField(term46945, term46945.getClass(), "implementedInterfaces", null);
        setField(term46945, term46945.getClass(), "extendedInterfaces", null);
        setField(term46945, term46945.getClass(), "baseType", null);
        setField(term46945, term46945.getClass(), "thisType", null);
        setBooleanField(term46945, term46945.getClass(), "isConstructor", false);
        setBooleanField(term46945, term46945.getClass(), "isInterface", false);
        setIntField(term46946, term46946.getClass(), "type", 83);
        setField(term46946, term46946.getClass(), "next", null);
        setField(term46946, term46946.getClass(), "first", null);
        setField(term46946, term46946.getClass(), "last", null);
        setField(term46946, term46946.getClass(), "propListHead", null);
        setIntField(term46946, term46946.getClass(), "sourcePosition", -1);
        setField(term46946, term46946.getClass(), "jsType", null);
        setField(term46946, term46946.getClass(), "parent", null);
        setField(term46945, term46945.getClass(), "parametersNode", term46946);
        setField(term46945, term46945.getClass(), "templateTypeName", null);
        term46947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46947, term46947.getClass(), "type", 0);
        setField(term46947, term46947.getClass(), "next", null);
        setField(term46947, term46947.getClass(), "first", null);
        setField(term46947, term46947.getClass(), "last", null);
        setField(term46947, term46947.getClass(), "propListHead", null);
        setIntField(term46947, term46947.getClass(), "sourcePosition", 0);
        setField(term46947, term46947.getClass(), "jsType", null);
        setField(term46947, term46947.getClass(), "parent", null);
        term46938 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term46942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46938, term46938.getClass(), "fnName", null);
        setField(term46938, term46938.getClass(), "compiler", null);
        setField(term46938, term46938.getClass(), "codingConvention", null);
        setField(term46938, term46938.getClass(), "typeRegistry", null);
        setField(term46938, term46938.getClass(), "errorRoot", null);
        setField(term46938, term46938.getClass(), "sourceName", null);
        setField(term46938, term46938.getClass(), "scope", null);
        setField(term46938, term46938.getClass(), "contents", null);
        setField(term46938, term46938.getClass(), "returnType", null);
        setBooleanField(term46938, term46938.getClass(), "returnTypeInferred", false);
        setField(term46938, term46938.getClass(), "implementedInterfaces", null);
        setField(term46938, term46938.getClass(), "extendedInterfaces", null);
        setField(term46938, term46938.getClass(), "baseType", null);
        setField(term46938, term46938.getClass(), "thisType", null);
        setBooleanField(term46938, term46938.getClass(), "isConstructor", false);
        setBooleanField(term46938, term46938.getClass(), "isInterface", false);
        setIntField(term46942, term46942.getClass(), "type", 83);
        setField(term46942, term46942.getClass(), "next", null);
        setField(term46942, term46942.getClass(), "first", null);
        setField(term46942, term46942.getClass(), "last", null);
        setField(term46942, term46942.getClass(), "propListHead", null);
        setIntField(term46942, term46942.getClass(), "sourcePosition", -1);
        setField(term46942, term46942.getClass(), "jsType", null);
        setField(term46942, term46942.getClass(), "parent", null);
        setField(term46938, term46938.getClass(), "parametersNode", term46942);
        setField(term46938, term46938.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term46492;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term46422, args);
        assertTrue(recursiveEquals(term46422, term46945));
        assertTrue(recursiveEquals(term46492, term46947));
        assertTrue(recursiveEquals(retValue, term46938));
    }

};


