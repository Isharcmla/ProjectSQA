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

public class FunctionBuilder_copyFromOtherFunction_842235135147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102082;
     Object term102170;
     Object term102346;
     Object term102351;
     Object term102342;

    public FunctionBuilder_copyFromOtherFunction_842235135147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term102082, term102082.getClass(), "name", null);
        setField(term102082, term102082.getClass(), "sourceNode", null);
        setField(term102082, term102082.getClass(), "parametersNode", null);
        setField(term102082, term102082.getClass(), "returnType", null);
        term102170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term102302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term102170, term102170.getClass(), "className", "");
        setField(term102170, term102170.getClass(), "source", null);
        setField(term102302, term102302.getClass(), "parameters", null);
        setField(term102302, term102302.getClass(), "returnType", null);
        setField(term102170, term102170.getClass(), "call", term102302);
        setField(term102170, term102170.getClass(), "typeOfThis", term102170);
        term102346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term102347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term102348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term102346, term102346.getClass(), "registry", null);
        setField(term102346, term102346.getClass(), "name", null);
        setField(term102346, term102346.getClass(), "sourceNode", null);
        setField(term102346, term102346.getClass(), "parametersNode", null);
        setField(term102346, term102346.getClass(), "returnType", null);
        setField(term102347, term102347.getClass(), "leastSupertypeVisitor", null);
        setField(term102347, term102347.getClass(), "greatestSubtypeVisitor", null);
        setField(term102348, term102348.getClass(), "parameters", null);
        setField(term102348, term102348.getClass(), "returnType", null);
        setBooleanField(term102348, term102348.getClass(), "returnTypeInferred", false);
        setBooleanField(term102348, term102348.getClass(), "resolved", false);
        setField(term102348, term102348.getClass(), "resolveResult", null);
        setField(term102348, term102348.getClass(), "registry", null);
        setField(term102347, term102347.getClass(), "call", term102348);
        setField(term102347, term102347.getClass(), "prototype", null);
        setField(term102347, term102347.getClass(), "kind", null);
        setField(term102347, term102347.getClass(), "typeOfThis", term102347);
        setField(term102347, term102347.getClass(), "source", null);
        setField(term102347, term102347.getClass(), "implementedInterfaces", null);
        setField(term102347, term102347.getClass(), "subTypes", null);
        setField(term102347, term102347.getClass(), "templateTypeName", null);
        setField(term102347, term102347.getClass(), "className", "");
        setField(term102347, term102347.getClass(), "properties", null);
        setField(term102347, term102347.getClass(), "implicitPrototype", null);
        setBooleanField(term102347, term102347.getClass(), "nativeType", false);
        setBooleanField(term102347, term102347.getClass(), "prettyPrint", false);
        setBooleanField(term102347, term102347.getClass(), "visited", false);
        setField(term102347, term102347.getClass(), "docInfo", null);
        setBooleanField(term102347, term102347.getClass(), "unknown", false);
        setBooleanField(term102347, term102347.getClass(), "resolved", false);
        setField(term102347, term102347.getClass(), "resolveResult", null);
        setField(term102347, term102347.getClass(), "registry", null);
        setField(term102346, term102346.getClass(), "typeOfThis", term102347);
        setField(term102346, term102346.getClass(), "templateTypeName", null);
        setBooleanField(term102346, term102346.getClass(), "inferredReturnType", false);
        setBooleanField(term102346, term102346.getClass(), "isConstructor", false);
        setBooleanField(term102346, term102346.getClass(), "isNativeType", false);
        term102351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term102352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term102351, term102351.getClass(), "leastSupertypeVisitor", null);
        setField(term102351, term102351.getClass(), "greatestSubtypeVisitor", null);
        setField(term102352, term102352.getClass(), "parameters", null);
        setField(term102352, term102352.getClass(), "returnType", null);
        setBooleanField(term102352, term102352.getClass(), "returnTypeInferred", false);
        setBooleanField(term102352, term102352.getClass(), "resolved", false);
        setField(term102352, term102352.getClass(), "resolveResult", null);
        setField(term102352, term102352.getClass(), "registry", null);
        setField(term102351, term102351.getClass(), "call", term102352);
        setField(term102351, term102351.getClass(), "prototype", null);
        setField(term102351, term102351.getClass(), "kind", null);
        setField(term102351, term102351.getClass(), "typeOfThis", term102351);
        setField(term102351, term102351.getClass(), "source", null);
        setField(term102351, term102351.getClass(), "implementedInterfaces", null);
        setField(term102351, term102351.getClass(), "subTypes", null);
        setField(term102351, term102351.getClass(), "templateTypeName", null);
        setField(term102351, term102351.getClass(), "className", "");
        setField(term102351, term102351.getClass(), "properties", null);
        setField(term102351, term102351.getClass(), "implicitPrototype", null);
        setBooleanField(term102351, term102351.getClass(), "nativeType", false);
        setBooleanField(term102351, term102351.getClass(), "prettyPrint", false);
        setBooleanField(term102351, term102351.getClass(), "visited", false);
        setField(term102351, term102351.getClass(), "docInfo", null);
        setBooleanField(term102351, term102351.getClass(), "unknown", false);
        setBooleanField(term102351, term102351.getClass(), "resolved", false);
        setField(term102351, term102351.getClass(), "resolveResult", null);
        setField(term102351, term102351.getClass(), "registry", null);
        term102342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term102303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term102304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term102342, term102342.getClass(), "registry", null);
        setField(term102342, term102342.getClass(), "name", null);
        setField(term102342, term102342.getClass(), "sourceNode", null);
        setField(term102342, term102342.getClass(), "parametersNode", null);
        setField(term102342, term102342.getClass(), "returnType", null);
        setField(term102303, term102303.getClass(), "leastSupertypeVisitor", null);
        setField(term102303, term102303.getClass(), "greatestSubtypeVisitor", null);
        setField(term102304, term102304.getClass(), "parameters", null);
        setField(term102304, term102304.getClass(), "returnType", null);
        setBooleanField(term102304, term102304.getClass(), "returnTypeInferred", false);
        setBooleanField(term102304, term102304.getClass(), "resolved", false);
        setField(term102304, term102304.getClass(), "resolveResult", null);
        setField(term102304, term102304.getClass(), "registry", null);
        setField(term102303, term102303.getClass(), "call", term102304);
        setField(term102303, term102303.getClass(), "prototype", null);
        setField(term102303, term102303.getClass(), "kind", null);
        setField(term102303, term102303.getClass(), "typeOfThis", term102303);
        setField(term102303, term102303.getClass(), "source", null);
        setField(term102303, term102303.getClass(), "implementedInterfaces", null);
        setField(term102303, term102303.getClass(), "subTypes", null);
        setField(term102303, term102303.getClass(), "templateTypeName", null);
        setField(term102303, term102303.getClass(), "className", "");
        setField(term102303, term102303.getClass(), "properties", null);
        setField(term102303, term102303.getClass(), "implicitPrototype", null);
        setBooleanField(term102303, term102303.getClass(), "nativeType", false);
        setBooleanField(term102303, term102303.getClass(), "prettyPrint", false);
        setBooleanField(term102303, term102303.getClass(), "visited", false);
        setField(term102303, term102303.getClass(), "docInfo", null);
        setBooleanField(term102303, term102303.getClass(), "unknown", false);
        setBooleanField(term102303, term102303.getClass(), "resolved", false);
        setField(term102303, term102303.getClass(), "resolveResult", null);
        setField(term102303, term102303.getClass(), "registry", null);
        setField(term102342, term102342.getClass(), "typeOfThis", term102303);
        setField(term102342, term102342.getClass(), "templateTypeName", null);
        setBooleanField(term102342, term102342.getClass(), "inferredReturnType", false);
        setBooleanField(term102342, term102342.getClass(), "isConstructor", false);
        setBooleanField(term102342, term102342.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term102170;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term102082, args);
        assertTrue(recursiveEquals(term102082, term102346));
        assertTrue(recursiveEquals(term102170, term102351));
        assertTrue(recursiveEquals(retValue, term102342));
    }

};


