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

public class FunctionTypeBuilder_inferParameterTypes_212883572263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100597;
     Object term100769;
     Object term100849;
     Object term100915;
     Object term100916;
     Object term100917;
     Object term100908;

    public FunctionTypeBuilder_inferParameterTypes_212883572263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100597 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term100683, term100683.getClass(), "first", null);
        setField(term100597, term100597.getClass(), "parametersNode", term100683);
        setField(term100597, term100597.getClass(), "typeRegistry", null);
        term100769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term100849 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term100915 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term100915, term100915.getClass(), "asList", null);
        term100916 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term100916, term100916.getClass(), "info", null);
        setField(term100916, term100916.getClass(), "documentation", null);
        setField(term100916, term100916.getClass(), "sourceName", null);
        setField(term100916, term100916.getClass(), "visibility", null);
        setIntField(term100916, term100916.getClass(), "bitset", 0);
        setField(term100916, term100916.getClass(), "type", null);
        setField(term100916, term100916.getClass(), "thisType", null);
        setBooleanField(term100916, term100916.getClass(), "includeDocumentation", false);
        term100917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term100917, term100917.getClass(), "functionName", null);
        setBooleanField(term100917, term100917.getClass(), "itsNeedsActivation", false);
        setIntField(term100917, term100917.getClass(), "itsFunctionType", 0);
        setBooleanField(term100917, term100917.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100917, term100917.getClass(), "encodedSourceStart", 0);
        setIntField(term100917, term100917.getClass(), "encodedSourceEnd", 0);
        setField(term100917, term100917.getClass(), "sourceName", null);
        setIntField(term100917, term100917.getClass(), "baseLineno", 0);
        setIntField(term100917, term100917.getClass(), "endLineno", 0);
        setField(term100917, term100917.getClass(), "functions", null);
        setField(term100917, term100917.getClass(), "regexps", null);
        setField(term100917, term100917.getClass(), "itsVariables", null);
        setField(term100917, term100917.getClass(), "itsConst", null);
        setField(term100917, term100917.getClass(), "itsVariableNames", null);
        setIntField(term100917, term100917.getClass(), "varStart", 0);
        setField(term100917, term100917.getClass(), "compilerData", null);
        setIntField(term100917, term100917.getClass(), "type", 0);
        setField(term100917, term100917.getClass(), "next", null);
        setField(term100917, term100917.getClass(), "first", null);
        setField(term100917, term100917.getClass(), "last", null);
        setField(term100917, term100917.getClass(), "propListHead", null);
        setIntField(term100917, term100917.getClass(), "sourcePosition", 0);
        setField(term100917, term100917.getClass(), "jsType", null);
        setField(term100917, term100917.getClass(), "parent", null);
        term100908 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100908, term100908.getClass(), "fnName", null);
        setField(term100908, term100908.getClass(), "compiler", null);
        setField(term100908, term100908.getClass(), "codingConvention", null);
        setField(term100908, term100908.getClass(), "typeRegistry", null);
        setField(term100908, term100908.getClass(), "errorRoot", null);
        setField(term100908, term100908.getClass(), "sourceName", null);
        setField(term100908, term100908.getClass(), "scope", null);
        setField(term100908, term100908.getClass(), "returnType", null);
        setBooleanField(term100908, term100908.getClass(), "returnTypeInferred", false);
        setField(term100908, term100908.getClass(), "implementedInterfaces", null);
        setField(term100908, term100908.getClass(), "baseType", null);
        setField(term100908, term100908.getClass(), "thisType", null);
        setBooleanField(term100908, term100908.getClass(), "isConstructor", false);
        setBooleanField(term100908, term100908.getClass(), "isInterface", false);
        setIntField(term100912, term100912.getClass(), "type", 83);
        setField(term100912, term100912.getClass(), "next", null);
        setField(term100912, term100912.getClass(), "first", null);
        setField(term100912, term100912.getClass(), "last", null);
        setField(term100912, term100912.getClass(), "propListHead", null);
        setIntField(term100912, term100912.getClass(), "sourcePosition", -1);
        setField(term100912, term100912.getClass(), "jsType", null);
        setField(term100912, term100912.getClass(), "parent", null);
        setField(term100908, term100908.getClass(), "parametersNode", term100912);
        setField(term100908, term100908.getClass(), "sourceNode", null);
        setField(term100908, term100908.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term100769;
        args[1] = term100849;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term100597, args);
        assertTrue(recursiveEquals(term100597, term100915));
        assertTrue(recursiveEquals(term100769, term100916));
        assertTrue(recursiveEquals(term100849, term100917));
        assertTrue(recursiveEquals(retValue, term100908));
    }

};


