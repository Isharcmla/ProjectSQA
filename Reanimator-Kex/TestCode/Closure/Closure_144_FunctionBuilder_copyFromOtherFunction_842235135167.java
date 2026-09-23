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

public class FunctionBuilder_copyFromOtherFunction_842235135167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116933;
     Object term117043;
     Object term117322;
     Object term117326;
     Object term117316;

    public FunctionBuilder_copyFromOtherFunction_842235135167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term116933, term116933.getClass(), "name", null);
        setField(term116933, term116933.getClass(), "sourceNode", null);
        setField(term116933, term116933.getClass(), "parametersNode", null);
        setField(term116933, term116933.getClass(), "returnType", null);
        term117043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term117175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term117275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term117043, term117043.getClass(), "className", "");
        setField(term117043, term117043.getClass(), "source", null);
        setField(term117175, term117175.getClass(), "parameters", null);
        setField(term117175, term117175.getClass(), "returnType", null);
        setField(term117043, term117043.getClass(), "call", term117175);
        setField(term117043, term117043.getClass(), "typeOfThis", term117275);
        term117322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term117325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term117322, term117322.getClass(), "registry", null);
        setField(term117322, term117322.getClass(), "name", "");
        setField(term117322, term117322.getClass(), "sourceNode", null);
        setField(term117322, term117322.getClass(), "parametersNode", null);
        setField(term117322, term117322.getClass(), "returnType", null);
        setField(term117325, term117325.getClass(), "call", null);
        setField(term117325, term117325.getClass(), "prototype", null);
        setField(term117325, term117325.getClass(), "kind", null);
        setField(term117325, term117325.getClass(), "typeOfThis", null);
        setField(term117325, term117325.getClass(), "source", null);
        setField(term117325, term117325.getClass(), "implementedInterfaces", null);
        setField(term117325, term117325.getClass(), "subTypes", null);
        setField(term117325, term117325.getClass(), "templateTypeName", null);
        setField(term117325, term117325.getClass(), "className", null);
        setField(term117325, term117325.getClass(), "properties", null);
        setField(term117325, term117325.getClass(), "implicitPrototype", null);
        setBooleanField(term117325, term117325.getClass(), "nativeType", false);
        setBooleanField(term117325, term117325.getClass(), "prettyPrint", false);
        setBooleanField(term117325, term117325.getClass(), "visited", false);
        setField(term117325, term117325.getClass(), "docInfo", null);
        setBooleanField(term117325, term117325.getClass(), "unknown", false);
        setBooleanField(term117325, term117325.getClass(), "resolved", false);
        setField(term117325, term117325.getClass(), "resolveResult", null);
        setField(term117325, term117325.getClass(), "registry", null);
        setField(term117322, term117322.getClass(), "typeOfThis", term117325);
        setField(term117322, term117322.getClass(), "templateTypeName", null);
        setBooleanField(term117322, term117322.getClass(), "inferredReturnType", false);
        setBooleanField(term117322, term117322.getClass(), "isConstructor", false);
        setBooleanField(term117322, term117322.getClass(), "isNativeType", false);
        term117326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term117327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term117328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term117327, term117327.getClass(), "parameters", null);
        setField(term117327, term117327.getClass(), "returnType", null);
        setBooleanField(term117327, term117327.getClass(), "returnTypeInferred", false);
        setBooleanField(term117327, term117327.getClass(), "resolved", false);
        setField(term117327, term117327.getClass(), "resolveResult", null);
        setField(term117327, term117327.getClass(), "registry", null);
        setField(term117326, term117326.getClass(), "call", term117327);
        setField(term117326, term117326.getClass(), "prototype", null);
        setField(term117326, term117326.getClass(), "kind", null);
        setField(term117328, term117328.getClass(), "call", null);
        setField(term117328, term117328.getClass(), "prototype", null);
        setField(term117328, term117328.getClass(), "kind", null);
        setField(term117328, term117328.getClass(), "typeOfThis", null);
        setField(term117328, term117328.getClass(), "source", null);
        setField(term117328, term117328.getClass(), "implementedInterfaces", null);
        setField(term117328, term117328.getClass(), "subTypes", null);
        setField(term117328, term117328.getClass(), "templateTypeName", null);
        setField(term117328, term117328.getClass(), "className", null);
        setField(term117328, term117328.getClass(), "properties", null);
        setField(term117328, term117328.getClass(), "implicitPrototype", null);
        setBooleanField(term117328, term117328.getClass(), "nativeType", false);
        setBooleanField(term117328, term117328.getClass(), "prettyPrint", false);
        setBooleanField(term117328, term117328.getClass(), "visited", false);
        setField(term117328, term117328.getClass(), "docInfo", null);
        setBooleanField(term117328, term117328.getClass(), "unknown", false);
        setBooleanField(term117328, term117328.getClass(), "resolved", false);
        setField(term117328, term117328.getClass(), "resolveResult", null);
        setField(term117328, term117328.getClass(), "registry", null);
        setField(term117326, term117326.getClass(), "typeOfThis", term117328);
        setField(term117326, term117326.getClass(), "source", null);
        setField(term117326, term117326.getClass(), "implementedInterfaces", null);
        setField(term117326, term117326.getClass(), "subTypes", null);
        setField(term117326, term117326.getClass(), "templateTypeName", null);
        setField(term117326, term117326.getClass(), "className", "");
        setField(term117326, term117326.getClass(), "properties", null);
        setField(term117326, term117326.getClass(), "implicitPrototype", null);
        setBooleanField(term117326, term117326.getClass(), "nativeType", false);
        setBooleanField(term117326, term117326.getClass(), "prettyPrint", false);
        setBooleanField(term117326, term117326.getClass(), "visited", false);
        setField(term117326, term117326.getClass(), "docInfo", null);
        setBooleanField(term117326, term117326.getClass(), "unknown", false);
        setBooleanField(term117326, term117326.getClass(), "resolved", false);
        setField(term117326, term117326.getClass(), "resolveResult", null);
        setField(term117326, term117326.getClass(), "registry", null);
        term117316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term117283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term117316, term117316.getClass(), "registry", null);
        setField(term117316, term117316.getClass(), "name", "");
        setField(term117316, term117316.getClass(), "sourceNode", null);
        setField(term117316, term117316.getClass(), "parametersNode", null);
        setField(term117316, term117316.getClass(), "returnType", null);
        setField(term117283, term117283.getClass(), "call", null);
        setField(term117283, term117283.getClass(), "prototype", null);
        setField(term117283, term117283.getClass(), "kind", null);
        setField(term117283, term117283.getClass(), "typeOfThis", null);
        setField(term117283, term117283.getClass(), "source", null);
        setField(term117283, term117283.getClass(), "implementedInterfaces", null);
        setField(term117283, term117283.getClass(), "subTypes", null);
        setField(term117283, term117283.getClass(), "templateTypeName", null);
        setField(term117283, term117283.getClass(), "className", null);
        setField(term117283, term117283.getClass(), "properties", null);
        setField(term117283, term117283.getClass(), "implicitPrototype", null);
        setBooleanField(term117283, term117283.getClass(), "nativeType", false);
        setBooleanField(term117283, term117283.getClass(), "prettyPrint", false);
        setBooleanField(term117283, term117283.getClass(), "visited", false);
        setField(term117283, term117283.getClass(), "docInfo", null);
        setBooleanField(term117283, term117283.getClass(), "unknown", false);
        setBooleanField(term117283, term117283.getClass(), "resolved", false);
        setField(term117283, term117283.getClass(), "resolveResult", null);
        setField(term117283, term117283.getClass(), "registry", null);
        setField(term117316, term117316.getClass(), "typeOfThis", term117283);
        setField(term117316, term117316.getClass(), "templateTypeName", null);
        setBooleanField(term117316, term117316.getClass(), "inferredReturnType", false);
        setBooleanField(term117316, term117316.getClass(), "isConstructor", false);
        setBooleanField(term117316, term117316.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term117043;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term116933, args);
        assertTrue(recursiveEquals(term116933, term117322));
        assertTrue(recursiveEquals(term117043, term117326));
        assertTrue(recursiveEquals(retValue, term117316));
    }

};


