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

public class FunctionBuilder_copyFromOtherFunction_84223513599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73096;
     Object term73196;
     Object term73467;
     Object term73471;
     Object term73461;

    public FunctionBuilder_copyFromOtherFunction_84223513599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term73096, term73096.getClass(), "name", null);
        setField(term73096, term73096.getClass(), "sourceNode", null);
        setField(term73096, term73096.getClass(), "parametersNode", null);
        setField(term73096, term73096.getClass(), "returnType", null);
        term73196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term73328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term73420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term73196, term73196.getClass(), "className", "");
        setField(term73196, term73196.getClass(), "source", null);
        setField(term73328, term73328.getClass(), "parameters", null);
        setField(term73328, term73328.getClass(), "returnType", null);
        setField(term73196, term73196.getClass(), "call", term73328);
        setField(term73196, term73196.getClass(), "typeOfThis", term73420);
        term73467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term73470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term73467, term73467.getClass(), "registry", null);
        setField(term73467, term73467.getClass(), "name", "");
        setField(term73467, term73467.getClass(), "sourceNode", null);
        setField(term73467, term73467.getClass(), "parametersNode", null);
        setField(term73467, term73467.getClass(), "returnType", null);
        setField(term73470, term73470.getClass(), "elementsType", null);
        setField(term73470, term73470.getClass(), "elements", null);
        setField(term73470, term73470.getClass(), "className", null);
        setField(term73470, term73470.getClass(), "properties", null);
        setField(term73470, term73470.getClass(), "implicitPrototype", null);
        setBooleanField(term73470, term73470.getClass(), "nativeType", false);
        setBooleanField(term73470, term73470.getClass(), "prettyPrint", false);
        setBooleanField(term73470, term73470.getClass(), "visited", false);
        setField(term73470, term73470.getClass(), "docInfo", null);
        setBooleanField(term73470, term73470.getClass(), "unknown", false);
        setBooleanField(term73470, term73470.getClass(), "resolved", false);
        setField(term73470, term73470.getClass(), "resolveResult", null);
        setField(term73470, term73470.getClass(), "registry", null);
        setField(term73467, term73467.getClass(), "typeOfThis", term73470);
        setField(term73467, term73467.getClass(), "templateTypeName", null);
        setBooleanField(term73467, term73467.getClass(), "inferredReturnType", false);
        setBooleanField(term73467, term73467.getClass(), "isConstructor", false);
        setBooleanField(term73467, term73467.getClass(), "isNativeType", false);
        term73471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term73472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term73473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term73472, term73472.getClass(), "parameters", null);
        setField(term73472, term73472.getClass(), "returnType", null);
        setBooleanField(term73472, term73472.getClass(), "returnTypeInferred", false);
        setBooleanField(term73472, term73472.getClass(), "resolved", false);
        setField(term73472, term73472.getClass(), "resolveResult", null);
        setField(term73472, term73472.getClass(), "registry", null);
        setField(term73471, term73471.getClass(), "call", term73472);
        setField(term73471, term73471.getClass(), "prototype", null);
        setField(term73471, term73471.getClass(), "kind", null);
        setField(term73473, term73473.getClass(), "elementsType", null);
        setField(term73473, term73473.getClass(), "elements", null);
        setField(term73473, term73473.getClass(), "className", null);
        setField(term73473, term73473.getClass(), "properties", null);
        setField(term73473, term73473.getClass(), "implicitPrototype", null);
        setBooleanField(term73473, term73473.getClass(), "nativeType", false);
        setBooleanField(term73473, term73473.getClass(), "prettyPrint", false);
        setBooleanField(term73473, term73473.getClass(), "visited", false);
        setField(term73473, term73473.getClass(), "docInfo", null);
        setBooleanField(term73473, term73473.getClass(), "unknown", false);
        setBooleanField(term73473, term73473.getClass(), "resolved", false);
        setField(term73473, term73473.getClass(), "resolveResult", null);
        setField(term73473, term73473.getClass(), "registry", null);
        setField(term73471, term73471.getClass(), "typeOfThis", term73473);
        setField(term73471, term73471.getClass(), "source", null);
        setField(term73471, term73471.getClass(), "implementedInterfaces", null);
        setField(term73471, term73471.getClass(), "subTypes", null);
        setField(term73471, term73471.getClass(), "templateTypeName", null);
        setField(term73471, term73471.getClass(), "className", "");
        setField(term73471, term73471.getClass(), "properties", null);
        setField(term73471, term73471.getClass(), "implicitPrototype", null);
        setBooleanField(term73471, term73471.getClass(), "nativeType", false);
        setBooleanField(term73471, term73471.getClass(), "prettyPrint", false);
        setBooleanField(term73471, term73471.getClass(), "visited", false);
        setField(term73471, term73471.getClass(), "docInfo", null);
        setBooleanField(term73471, term73471.getClass(), "unknown", false);
        setBooleanField(term73471, term73471.getClass(), "resolved", false);
        setField(term73471, term73471.getClass(), "resolveResult", null);
        setField(term73471, term73471.getClass(), "registry", null);
        term73461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term73428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term73461, term73461.getClass(), "registry", null);
        setField(term73461, term73461.getClass(), "name", "");
        setField(term73461, term73461.getClass(), "sourceNode", null);
        setField(term73461, term73461.getClass(), "parametersNode", null);
        setField(term73461, term73461.getClass(), "returnType", null);
        setField(term73428, term73428.getClass(), "elementsType", null);
        setField(term73428, term73428.getClass(), "elements", null);
        setField(term73428, term73428.getClass(), "className", null);
        setField(term73428, term73428.getClass(), "properties", null);
        setField(term73428, term73428.getClass(), "implicitPrototype", null);
        setBooleanField(term73428, term73428.getClass(), "nativeType", false);
        setBooleanField(term73428, term73428.getClass(), "prettyPrint", false);
        setBooleanField(term73428, term73428.getClass(), "visited", false);
        setField(term73428, term73428.getClass(), "docInfo", null);
        setBooleanField(term73428, term73428.getClass(), "unknown", false);
        setBooleanField(term73428, term73428.getClass(), "resolved", false);
        setField(term73428, term73428.getClass(), "resolveResult", null);
        setField(term73428, term73428.getClass(), "registry", null);
        setField(term73461, term73461.getClass(), "typeOfThis", term73428);
        setField(term73461, term73461.getClass(), "templateTypeName", null);
        setBooleanField(term73461, term73461.getClass(), "inferredReturnType", false);
        setBooleanField(term73461, term73461.getClass(), "isConstructor", false);
        setBooleanField(term73461, term73461.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term73196;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term73096, args);
        assertTrue(recursiveEquals(term73096, term73467));
        assertTrue(recursiveEquals(term73196, term73471));
        assertTrue(recursiveEquals(retValue, term73461));
    }

};


