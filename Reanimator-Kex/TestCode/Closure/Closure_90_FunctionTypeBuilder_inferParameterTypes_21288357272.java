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

public class FunctionTypeBuilder_inferParameterTypes_21288357272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42610;
     Object term42680;
     Object term43161;
     Object term43163;
     Object term43154;

    public FunctionTypeBuilder_inferParameterTypes_21288357272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42610 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term42680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term43161 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43161, term43161.getClass(), "fnName", null);
        setField(term43161, term43161.getClass(), "compiler", null);
        setField(term43161, term43161.getClass(), "codingConvention", null);
        setField(term43161, term43161.getClass(), "typeRegistry", null);
        setField(term43161, term43161.getClass(), "errorRoot", null);
        setField(term43161, term43161.getClass(), "sourceName", null);
        setField(term43161, term43161.getClass(), "scope", null);
        setField(term43161, term43161.getClass(), "returnType", null);
        setBooleanField(term43161, term43161.getClass(), "returnTypeInferred", false);
        setField(term43161, term43161.getClass(), "implementedInterfaces", null);
        setField(term43161, term43161.getClass(), "baseType", null);
        setField(term43161, term43161.getClass(), "thisType", null);
        setBooleanField(term43161, term43161.getClass(), "isConstructor", false);
        setBooleanField(term43161, term43161.getClass(), "isInterface", false);
        setIntField(term43162, term43162.getClass(), "type", 83);
        setField(term43162, term43162.getClass(), "next", null);
        setField(term43162, term43162.getClass(), "first", null);
        setField(term43162, term43162.getClass(), "last", null);
        setField(term43162, term43162.getClass(), "propListHead", null);
        setIntField(term43162, term43162.getClass(), "sourcePosition", -1);
        setField(term43162, term43162.getClass(), "jsType", null);
        setField(term43162, term43162.getClass(), "parent", null);
        setField(term43161, term43161.getClass(), "parametersNode", term43162);
        setField(term43161, term43161.getClass(), "sourceNode", null);
        setField(term43161, term43161.getClass(), "templateTypeName", null);
        term43163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43163, term43163.getClass(), "type", 0);
        setField(term43163, term43163.getClass(), "next", null);
        setField(term43163, term43163.getClass(), "first", null);
        setField(term43163, term43163.getClass(), "last", null);
        setField(term43163, term43163.getClass(), "propListHead", null);
        setIntField(term43163, term43163.getClass(), "sourcePosition", 0);
        setField(term43163, term43163.getClass(), "jsType", null);
        setField(term43163, term43163.getClass(), "parent", null);
        term43154 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43154, term43154.getClass(), "fnName", null);
        setField(term43154, term43154.getClass(), "compiler", null);
        setField(term43154, term43154.getClass(), "codingConvention", null);
        setField(term43154, term43154.getClass(), "typeRegistry", null);
        setField(term43154, term43154.getClass(), "errorRoot", null);
        setField(term43154, term43154.getClass(), "sourceName", null);
        setField(term43154, term43154.getClass(), "scope", null);
        setField(term43154, term43154.getClass(), "returnType", null);
        setBooleanField(term43154, term43154.getClass(), "returnTypeInferred", false);
        setField(term43154, term43154.getClass(), "implementedInterfaces", null);
        setField(term43154, term43154.getClass(), "baseType", null);
        setField(term43154, term43154.getClass(), "thisType", null);
        setBooleanField(term43154, term43154.getClass(), "isConstructor", false);
        setBooleanField(term43154, term43154.getClass(), "isInterface", false);
        setIntField(term43158, term43158.getClass(), "type", 83);
        setField(term43158, term43158.getClass(), "next", null);
        setField(term43158, term43158.getClass(), "first", null);
        setField(term43158, term43158.getClass(), "last", null);
        setField(term43158, term43158.getClass(), "propListHead", null);
        setIntField(term43158, term43158.getClass(), "sourcePosition", -1);
        setField(term43158, term43158.getClass(), "jsType", null);
        setField(term43158, term43158.getClass(), "parent", null);
        setField(term43154, term43154.getClass(), "parametersNode", term43158);
        setField(term43154, term43154.getClass(), "sourceNode", null);
        setField(term43154, term43154.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term42680;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term42610, args);
        assertTrue(recursiveEquals(term42610, term43161));
        assertTrue(recursiveEquals(term42680, term43163));
        assertTrue(recursiveEquals(retValue, term43154));
    }

};


