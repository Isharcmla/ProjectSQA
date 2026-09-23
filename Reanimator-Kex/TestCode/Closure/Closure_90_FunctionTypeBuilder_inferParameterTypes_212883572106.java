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

public class FunctionTypeBuilder_inferParameterTypes_212883572106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50773;
     Object term50843;
     Object term50916;
     Object term50918;
     Object term50909;

    public FunctionTypeBuilder_inferParameterTypes_212883572106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50773 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term50773, term50773.getClass(), "parametersNode", null);
        setField(term50773, term50773.getClass(), "typeRegistry", null);
        term50843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50843, term50843.getClass(), "first", null);
        term50916 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50916, term50916.getClass(), "fnName", null);
        setField(term50916, term50916.getClass(), "compiler", null);
        setField(term50916, term50916.getClass(), "codingConvention", null);
        setField(term50916, term50916.getClass(), "typeRegistry", null);
        setField(term50916, term50916.getClass(), "errorRoot", null);
        setField(term50916, term50916.getClass(), "sourceName", null);
        setField(term50916, term50916.getClass(), "scope", null);
        setField(term50916, term50916.getClass(), "returnType", null);
        setBooleanField(term50916, term50916.getClass(), "returnTypeInferred", false);
        setField(term50916, term50916.getClass(), "implementedInterfaces", null);
        setField(term50916, term50916.getClass(), "baseType", null);
        setField(term50916, term50916.getClass(), "thisType", null);
        setBooleanField(term50916, term50916.getClass(), "isConstructor", false);
        setBooleanField(term50916, term50916.getClass(), "isInterface", false);
        setIntField(term50917, term50917.getClass(), "type", 83);
        setField(term50917, term50917.getClass(), "next", null);
        setField(term50917, term50917.getClass(), "first", null);
        setField(term50917, term50917.getClass(), "last", null);
        setField(term50917, term50917.getClass(), "propListHead", null);
        setIntField(term50917, term50917.getClass(), "sourcePosition", -1);
        setField(term50917, term50917.getClass(), "jsType", null);
        setField(term50917, term50917.getClass(), "parent", null);
        setField(term50916, term50916.getClass(), "parametersNode", term50917);
        setField(term50916, term50916.getClass(), "sourceNode", null);
        setField(term50916, term50916.getClass(), "templateTypeName", null);
        term50918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50918, term50918.getClass(), "type", 0);
        setField(term50918, term50918.getClass(), "next", null);
        setField(term50918, term50918.getClass(), "first", null);
        setField(term50918, term50918.getClass(), "last", null);
        setField(term50918, term50918.getClass(), "propListHead", null);
        setIntField(term50918, term50918.getClass(), "sourcePosition", 0);
        setField(term50918, term50918.getClass(), "jsType", null);
        setField(term50918, term50918.getClass(), "parent", null);
        term50909 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50909, term50909.getClass(), "fnName", null);
        setField(term50909, term50909.getClass(), "compiler", null);
        setField(term50909, term50909.getClass(), "codingConvention", null);
        setField(term50909, term50909.getClass(), "typeRegistry", null);
        setField(term50909, term50909.getClass(), "errorRoot", null);
        setField(term50909, term50909.getClass(), "sourceName", null);
        setField(term50909, term50909.getClass(), "scope", null);
        setField(term50909, term50909.getClass(), "returnType", null);
        setBooleanField(term50909, term50909.getClass(), "returnTypeInferred", false);
        setField(term50909, term50909.getClass(), "implementedInterfaces", null);
        setField(term50909, term50909.getClass(), "baseType", null);
        setField(term50909, term50909.getClass(), "thisType", null);
        setBooleanField(term50909, term50909.getClass(), "isConstructor", false);
        setBooleanField(term50909, term50909.getClass(), "isInterface", false);
        setIntField(term50913, term50913.getClass(), "type", 83);
        setField(term50913, term50913.getClass(), "next", null);
        setField(term50913, term50913.getClass(), "first", null);
        setField(term50913, term50913.getClass(), "last", null);
        setField(term50913, term50913.getClass(), "propListHead", null);
        setIntField(term50913, term50913.getClass(), "sourcePosition", -1);
        setField(term50913, term50913.getClass(), "jsType", null);
        setField(term50913, term50913.getClass(), "parent", null);
        setField(term50909, term50909.getClass(), "parametersNode", term50913);
        setField(term50909, term50909.getClass(), "sourceNode", null);
        setField(term50909, term50909.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term50843;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term50773, args);
        assertTrue(recursiveEquals(term50773, term50916));
        assertTrue(recursiveEquals(term50843, term50918));
        assertTrue(recursiveEquals(retValue, term50909));
    }

};


