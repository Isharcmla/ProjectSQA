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

public class FunctionTypeBuilder_inferParameterTypes_21288357269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20882;
     Object term20952;
     Object term22751;
     Object term22753;
     Object term22744;

    public FunctionTypeBuilder_inferParameterTypes_21288357269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20882 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term20952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term22751 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term22752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22751, term22751.getClass(), "fnName", null);
        setField(term22751, term22751.getClass(), "compiler", null);
        setField(term22751, term22751.getClass(), "codingConvention", null);
        setField(term22751, term22751.getClass(), "typeRegistry", null);
        setField(term22751, term22751.getClass(), "errorRoot", null);
        setField(term22751, term22751.getClass(), "sourceName", null);
        setField(term22751, term22751.getClass(), "scope", null);
        setField(term22751, term22751.getClass(), "contents", null);
        setField(term22751, term22751.getClass(), "returnType", null);
        setBooleanField(term22751, term22751.getClass(), "returnTypeInferred", false);
        setField(term22751, term22751.getClass(), "implementedInterfaces", null);
        setField(term22751, term22751.getClass(), "extendedInterfaces", null);
        setField(term22751, term22751.getClass(), "baseType", null);
        setField(term22751, term22751.getClass(), "thisType", null);
        setBooleanField(term22751, term22751.getClass(), "isConstructor", false);
        setBooleanField(term22751, term22751.getClass(), "isInterface", false);
        setIntField(term22752, term22752.getClass(), "type", 83);
        setField(term22752, term22752.getClass(), "next", null);
        setField(term22752, term22752.getClass(), "first", null);
        setField(term22752, term22752.getClass(), "last", null);
        setField(term22752, term22752.getClass(), "propListHead", null);
        setIntField(term22752, term22752.getClass(), "sourcePosition", -1);
        setField(term22752, term22752.getClass(), "jsType", null);
        setField(term22752, term22752.getClass(), "parent", null);
        setField(term22751, term22751.getClass(), "parametersNode", term22752);
        setField(term22751, term22751.getClass(), "templateTypeName", null);
        term22753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22753, term22753.getClass(), "type", 0);
        setField(term22753, term22753.getClass(), "next", null);
        setField(term22753, term22753.getClass(), "first", null);
        setField(term22753, term22753.getClass(), "last", null);
        setField(term22753, term22753.getClass(), "propListHead", null);
        setIntField(term22753, term22753.getClass(), "sourcePosition", 0);
        setField(term22753, term22753.getClass(), "jsType", null);
        setField(term22753, term22753.getClass(), "parent", null);
        term22744 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term22748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22744, term22744.getClass(), "fnName", null);
        setField(term22744, term22744.getClass(), "compiler", null);
        setField(term22744, term22744.getClass(), "codingConvention", null);
        setField(term22744, term22744.getClass(), "typeRegistry", null);
        setField(term22744, term22744.getClass(), "errorRoot", null);
        setField(term22744, term22744.getClass(), "sourceName", null);
        setField(term22744, term22744.getClass(), "scope", null);
        setField(term22744, term22744.getClass(), "contents", null);
        setField(term22744, term22744.getClass(), "returnType", null);
        setBooleanField(term22744, term22744.getClass(), "returnTypeInferred", false);
        setField(term22744, term22744.getClass(), "implementedInterfaces", null);
        setField(term22744, term22744.getClass(), "extendedInterfaces", null);
        setField(term22744, term22744.getClass(), "baseType", null);
        setField(term22744, term22744.getClass(), "thisType", null);
        setBooleanField(term22744, term22744.getClass(), "isConstructor", false);
        setBooleanField(term22744, term22744.getClass(), "isInterface", false);
        setIntField(term22748, term22748.getClass(), "type", 83);
        setField(term22748, term22748.getClass(), "next", null);
        setField(term22748, term22748.getClass(), "first", null);
        setField(term22748, term22748.getClass(), "last", null);
        setField(term22748, term22748.getClass(), "propListHead", null);
        setIntField(term22748, term22748.getClass(), "sourcePosition", -1);
        setField(term22748, term22748.getClass(), "jsType", null);
        setField(term22748, term22748.getClass(), "parent", null);
        setField(term22744, term22744.getClass(), "parametersNode", term22748);
        setField(term22744, term22744.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term20952;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term20882, args);
        assertTrue(recursiveEquals(term20882, term22751));
        assertTrue(recursiveEquals(term20952, term22753));
        assertTrue(recursiveEquals(retValue, term22744));
    }

};


