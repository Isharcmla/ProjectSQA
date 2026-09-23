package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96829;
     Object term97045;
     Object term97282;
     Object term97284;
     Object term97278;

    public FunctionBuilder_copyFromOtherFunction_842235135137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term96937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96829, term96829.getClass(), "name", "");
        setField(term96829, term96829.getClass(), "sourceNode", null);
        setField(term96829, term96829.getClass(), "parametersNode", term96937);
        setField(term96829, term96829.getClass(), "returnType", null);
        term97045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term97139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term97249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term97045, term97045.getClass(), "className", null);
        setField(term97045, term97045.getClass(), "source", null);
        setField(term97139, term97139.getClass(), "parameters", null);
        setField(term97139, term97139.getClass(), "returnType", null);
        setField(term97045, term97045.getClass(), "call", term97139);
        setField(term97045, term97045.getClass(), "typeOfThis", term97249);
        term97282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term97283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term97282, term97282.getClass(), "registry", null);
        setField(term97282, term97282.getClass(), "name", null);
        setField(term97282, term97282.getClass(), "sourceNode", null);
        setField(term97282, term97282.getClass(), "parametersNode", null);
        setField(term97282, term97282.getClass(), "returnType", null);
        setField(term97283, term97283.getClass(), "parameterType", null);
        setField(term97283, term97283.getClass(), "referencedType", null);
        setBooleanField(term97283, term97283.getClass(), "visited", false);
        setField(term97283, term97283.getClass(), "docInfo", null);
        setBooleanField(term97283, term97283.getClass(), "unknown", false);
        setBooleanField(term97283, term97283.getClass(), "resolved", false);
        setField(term97283, term97283.getClass(), "resolveResult", null);
        setField(term97283, term97283.getClass(), "registry", null);
        setField(term97282, term97282.getClass(), "typeOfThis", term97283);
        setField(term97282, term97282.getClass(), "templateTypeName", null);
        setBooleanField(term97282, term97282.getClass(), "inferredReturnType", false);
        setBooleanField(term97282, term97282.getClass(), "isConstructor", false);
        setBooleanField(term97282, term97282.getClass(), "isNativeType", false);
        term97284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term97285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term97286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term97284, term97284.getClass(), "this$0", null);
        setField(term97285, term97285.getClass(), "parameters", null);
        setField(term97285, term97285.getClass(), "returnType", null);
        setBooleanField(term97285, term97285.getClass(), "returnTypeInferred", false);
        setBooleanField(term97285, term97285.getClass(), "resolved", false);
        setField(term97285, term97285.getClass(), "resolveResult", null);
        setField(term97285, term97285.getClass(), "registry", null);
        setField(term97284, term97284.getClass(), "call", term97285);
        setField(term97284, term97284.getClass(), "prototype", null);
        setField(term97284, term97284.getClass(), "kind", null);
        setField(term97286, term97286.getClass(), "parameterType", null);
        setField(term97286, term97286.getClass(), "referencedType", null);
        setBooleanField(term97286, term97286.getClass(), "visited", false);
        setField(term97286, term97286.getClass(), "docInfo", null);
        setBooleanField(term97286, term97286.getClass(), "unknown", false);
        setBooleanField(term97286, term97286.getClass(), "resolved", false);
        setField(term97286, term97286.getClass(), "resolveResult", null);
        setField(term97286, term97286.getClass(), "registry", null);
        setField(term97284, term97284.getClass(), "typeOfThis", term97286);
        setField(term97284, term97284.getClass(), "source", null);
        setField(term97284, term97284.getClass(), "implementedInterfaces", null);
        setField(term97284, term97284.getClass(), "subTypes", null);
        setField(term97284, term97284.getClass(), "templateTypeName", null);
        setField(term97284, term97284.getClass(), "className", null);
        setField(term97284, term97284.getClass(), "properties", null);
        setField(term97284, term97284.getClass(), "implicitPrototype", null);
        setBooleanField(term97284, term97284.getClass(), "nativeType", false);
        setBooleanField(term97284, term97284.getClass(), "prettyPrint", false);
        setBooleanField(term97284, term97284.getClass(), "visited", false);
        setField(term97284, term97284.getClass(), "docInfo", null);
        setBooleanField(term97284, term97284.getClass(), "unknown", false);
        setBooleanField(term97284, term97284.getClass(), "resolved", false);
        setField(term97284, term97284.getClass(), "resolveResult", null);
        setField(term97284, term97284.getClass(), "registry", null);
        term97278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term97255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term97278, term97278.getClass(), "registry", null);
        setField(term97278, term97278.getClass(), "name", null);
        setField(term97278, term97278.getClass(), "sourceNode", null);
        setField(term97278, term97278.getClass(), "parametersNode", null);
        setField(term97278, term97278.getClass(), "returnType", null);
        setField(term97255, term97255.getClass(), "parameterType", null);
        setField(term97255, term97255.getClass(), "referencedType", null);
        setBooleanField(term97255, term97255.getClass(), "visited", false);
        setField(term97255, term97255.getClass(), "docInfo", null);
        setBooleanField(term97255, term97255.getClass(), "unknown", false);
        setBooleanField(term97255, term97255.getClass(), "resolved", false);
        setField(term97255, term97255.getClass(), "resolveResult", null);
        setField(term97255, term97255.getClass(), "registry", null);
        setField(term97278, term97278.getClass(), "typeOfThis", term97255);
        setField(term97278, term97278.getClass(), "templateTypeName", null);
        setBooleanField(term97278, term97278.getClass(), "inferredReturnType", false);
        setBooleanField(term97278, term97278.getClass(), "isConstructor", false);
        setBooleanField(term97278, term97278.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term97045;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term96829, args);
        assertTrue(recursiveEquals(term96829, term97282));
        assertTrue(recursiveEquals(term97045, term97284));
        assertTrue(recursiveEquals(retValue, term97278));
    }

};


