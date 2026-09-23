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

public class FunctionTypeBuilder_inferParameterTypes_212883572105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50496;
     Object term50601;
     Object term50879;
     Object term50881;
     Object term50872;

    public FunctionTypeBuilder_inferParameterTypes_212883572105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50496 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term50601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50496, term50496.getClass(), "parametersNode", term50601);
        term50879 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50879, term50879.getClass(), "fnName", null);
        setField(term50879, term50879.getClass(), "compiler", null);
        setField(term50879, term50879.getClass(), "codingConvention", null);
        setField(term50879, term50879.getClass(), "typeRegistry", null);
        setField(term50879, term50879.getClass(), "errorRoot", null);
        setField(term50879, term50879.getClass(), "sourceName", null);
        setField(term50879, term50879.getClass(), "scope", null);
        setField(term50879, term50879.getClass(), "returnType", null);
        setBooleanField(term50879, term50879.getClass(), "returnTypeInferred", false);
        setField(term50879, term50879.getClass(), "implementedInterfaces", null);
        setField(term50879, term50879.getClass(), "baseType", null);
        setField(term50879, term50879.getClass(), "thisType", null);
        setBooleanField(term50879, term50879.getClass(), "isConstructor", false);
        setBooleanField(term50879, term50879.getClass(), "isInterface", false);
        setIntField(term50880, term50880.getClass(), "type", 83);
        setField(term50880, term50880.getClass(), "next", null);
        setField(term50880, term50880.getClass(), "first", null);
        setField(term50880, term50880.getClass(), "last", null);
        setField(term50880, term50880.getClass(), "propListHead", null);
        setIntField(term50880, term50880.getClass(), "sourcePosition", -1);
        setField(term50880, term50880.getClass(), "jsType", null);
        setField(term50880, term50880.getClass(), "parent", null);
        setField(term50879, term50879.getClass(), "parametersNode", term50880);
        setField(term50879, term50879.getClass(), "sourceNode", null);
        setField(term50879, term50879.getClass(), "templateTypeName", null);
        term50881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50881, term50881.getClass(), "type", 0);
        setField(term50881, term50881.getClass(), "next", null);
        setField(term50881, term50881.getClass(), "first", null);
        setField(term50881, term50881.getClass(), "last", null);
        setField(term50881, term50881.getClass(), "propListHead", null);
        setIntField(term50881, term50881.getClass(), "sourcePosition", 0);
        setField(term50881, term50881.getClass(), "jsType", null);
        setField(term50881, term50881.getClass(), "parent", null);
        term50872 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50872, term50872.getClass(), "fnName", null);
        setField(term50872, term50872.getClass(), "compiler", null);
        setField(term50872, term50872.getClass(), "codingConvention", null);
        setField(term50872, term50872.getClass(), "typeRegistry", null);
        setField(term50872, term50872.getClass(), "errorRoot", null);
        setField(term50872, term50872.getClass(), "sourceName", null);
        setField(term50872, term50872.getClass(), "scope", null);
        setField(term50872, term50872.getClass(), "returnType", null);
        setBooleanField(term50872, term50872.getClass(), "returnTypeInferred", false);
        setField(term50872, term50872.getClass(), "implementedInterfaces", null);
        setField(term50872, term50872.getClass(), "baseType", null);
        setField(term50872, term50872.getClass(), "thisType", null);
        setBooleanField(term50872, term50872.getClass(), "isConstructor", false);
        setBooleanField(term50872, term50872.getClass(), "isInterface", false);
        setIntField(term50876, term50876.getClass(), "type", 83);
        setField(term50876, term50876.getClass(), "next", null);
        setField(term50876, term50876.getClass(), "first", null);
        setField(term50876, term50876.getClass(), "last", null);
        setField(term50876, term50876.getClass(), "propListHead", null);
        setIntField(term50876, term50876.getClass(), "sourcePosition", -1);
        setField(term50876, term50876.getClass(), "jsType", null);
        setField(term50876, term50876.getClass(), "parent", null);
        setField(term50872, term50872.getClass(), "parametersNode", term50876);
        setField(term50872, term50872.getClass(), "sourceNode", null);
        setField(term50872, term50872.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term50601;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term50496, args);
        assertTrue(recursiveEquals(term50496, term50879));
        assertTrue(recursiveEquals(term50601, term50881));
        assertTrue(recursiveEquals(retValue, term50872));
    }

};


