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

public class FunctionTypeBuilder_inferParameterTypes_212883572255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98122;
     Object term98380;
     Object term98868;
     Object term98870;
     Object term98861;

    public FunctionTypeBuilder_inferParameterTypes_212883572255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98122 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term98208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term98208, term98208.getClass(), "first", term98294);
        setField(term98122, term98122.getClass(), "parametersNode", term98208);
        setField(term98122, term98122.getClass(), "typeRegistry", null);
        setField(term98122, term98122.getClass(), "templateTypeName", null);
        term98380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term98380, term98380.getClass(), "first", null);
        term98868 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term98869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98868, term98868.getClass(), "fnName", null);
        setField(term98868, term98868.getClass(), "compiler", null);
        setField(term98868, term98868.getClass(), "codingConvention", null);
        setField(term98868, term98868.getClass(), "typeRegistry", null);
        setField(term98868, term98868.getClass(), "errorRoot", null);
        setField(term98868, term98868.getClass(), "sourceName", null);
        setField(term98868, term98868.getClass(), "scope", null);
        setField(term98868, term98868.getClass(), "returnType", null);
        setBooleanField(term98868, term98868.getClass(), "returnTypeInferred", false);
        setField(term98868, term98868.getClass(), "implementedInterfaces", null);
        setField(term98868, term98868.getClass(), "baseType", null);
        setField(term98868, term98868.getClass(), "thisType", null);
        setBooleanField(term98868, term98868.getClass(), "isConstructor", false);
        setBooleanField(term98868, term98868.getClass(), "isInterface", false);
        setIntField(term98869, term98869.getClass(), "type", 83);
        setField(term98869, term98869.getClass(), "next", null);
        setField(term98869, term98869.getClass(), "first", null);
        setField(term98869, term98869.getClass(), "last", null);
        setField(term98869, term98869.getClass(), "propListHead", null);
        setIntField(term98869, term98869.getClass(), "sourcePosition", -1);
        setField(term98869, term98869.getClass(), "jsType", null);
        setField(term98869, term98869.getClass(), "parent", null);
        setField(term98868, term98868.getClass(), "parametersNode", term98869);
        setField(term98868, term98868.getClass(), "sourceNode", null);
        setField(term98868, term98868.getClass(), "templateTypeName", null);
        term98870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term98870, term98870.getClass(), "functionName", null);
        setBooleanField(term98870, term98870.getClass(), "itsNeedsActivation", false);
        setIntField(term98870, term98870.getClass(), "itsFunctionType", 0);
        setBooleanField(term98870, term98870.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98870, term98870.getClass(), "encodedSourceStart", 0);
        setIntField(term98870, term98870.getClass(), "encodedSourceEnd", 0);
        setField(term98870, term98870.getClass(), "sourceName", null);
        setIntField(term98870, term98870.getClass(), "baseLineno", 0);
        setIntField(term98870, term98870.getClass(), "endLineno", 0);
        setField(term98870, term98870.getClass(), "functions", null);
        setField(term98870, term98870.getClass(), "regexps", null);
        setField(term98870, term98870.getClass(), "itsVariables", null);
        setField(term98870, term98870.getClass(), "itsConst", null);
        setField(term98870, term98870.getClass(), "itsVariableNames", null);
        setIntField(term98870, term98870.getClass(), "varStart", 0);
        setField(term98870, term98870.getClass(), "compilerData", null);
        setIntField(term98870, term98870.getClass(), "type", 0);
        setField(term98870, term98870.getClass(), "next", null);
        setField(term98870, term98870.getClass(), "first", null);
        setField(term98870, term98870.getClass(), "last", null);
        setField(term98870, term98870.getClass(), "propListHead", null);
        setIntField(term98870, term98870.getClass(), "sourcePosition", 0);
        setField(term98870, term98870.getClass(), "jsType", null);
        setField(term98870, term98870.getClass(), "parent", null);
        term98861 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term98865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98861, term98861.getClass(), "fnName", null);
        setField(term98861, term98861.getClass(), "compiler", null);
        setField(term98861, term98861.getClass(), "codingConvention", null);
        setField(term98861, term98861.getClass(), "typeRegistry", null);
        setField(term98861, term98861.getClass(), "errorRoot", null);
        setField(term98861, term98861.getClass(), "sourceName", null);
        setField(term98861, term98861.getClass(), "scope", null);
        setField(term98861, term98861.getClass(), "returnType", null);
        setBooleanField(term98861, term98861.getClass(), "returnTypeInferred", false);
        setField(term98861, term98861.getClass(), "implementedInterfaces", null);
        setField(term98861, term98861.getClass(), "baseType", null);
        setField(term98861, term98861.getClass(), "thisType", null);
        setBooleanField(term98861, term98861.getClass(), "isConstructor", false);
        setBooleanField(term98861, term98861.getClass(), "isInterface", false);
        setIntField(term98865, term98865.getClass(), "type", 83);
        setField(term98865, term98865.getClass(), "next", null);
        setField(term98865, term98865.getClass(), "first", null);
        setField(term98865, term98865.getClass(), "last", null);
        setField(term98865, term98865.getClass(), "propListHead", null);
        setIntField(term98865, term98865.getClass(), "sourcePosition", -1);
        setField(term98865, term98865.getClass(), "jsType", null);
        setField(term98865, term98865.getClass(), "parent", null);
        setField(term98861, term98861.getClass(), "parametersNode", term98865);
        setField(term98861, term98861.getClass(), "sourceNode", null);
        setField(term98861, term98861.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term98380;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term98122, args);
        assertTrue(recursiveEquals(term98122, term98868));
        assertTrue(recursiveEquals(term98380, term98870));
        assertTrue(recursiveEquals(retValue, term98861));
    }

};


