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

public class FunctionBuilder_copyFromOtherFunction_842235135105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75032;
     Object term75140;
     Object term75419;
     Object term75423;
     Object term75413;

    public FunctionBuilder_copyFromOtherFunction_842235135105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term75032, term75032.getClass(), "name", null);
        setField(term75032, term75032.getClass(), "sourceNode", null);
        setField(term75032, term75032.getClass(), "parametersNode", null);
        setField(term75032, term75032.getClass(), "returnType", null);
        term75140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term75272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term75372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75140, term75140.getClass(), "className", "");
        setField(term75140, term75140.getClass(), "source", null);
        setField(term75272, term75272.getClass(), "parameters", null);
        setField(term75272, term75272.getClass(), "returnType", null);
        setField(term75140, term75140.getClass(), "call", term75272);
        setField(term75140, term75140.getClass(), "typeOfThis", term75372);
        term75419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term75422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75419, term75419.getClass(), "registry", null);
        setField(term75419, term75419.getClass(), "name", "");
        setField(term75419, term75419.getClass(), "sourceNode", null);
        setField(term75419, term75419.getClass(), "parametersNode", null);
        setField(term75419, term75419.getClass(), "returnType", null);
        setField(term75422, term75422.getClass(), "call", null);
        setField(term75422, term75422.getClass(), "prototype", null);
        setField(term75422, term75422.getClass(), "kind", null);
        setField(term75422, term75422.getClass(), "typeOfThis", null);
        setField(term75422, term75422.getClass(), "source", null);
        setField(term75422, term75422.getClass(), "implementedInterfaces", null);
        setField(term75422, term75422.getClass(), "subTypes", null);
        setField(term75422, term75422.getClass(), "templateTypeName", null);
        setField(term75422, term75422.getClass(), "className", null);
        setField(term75422, term75422.getClass(), "properties", null);
        setField(term75422, term75422.getClass(), "implicitPrototype", null);
        setBooleanField(term75422, term75422.getClass(), "nativeType", false);
        setBooleanField(term75422, term75422.getClass(), "prettyPrint", false);
        setBooleanField(term75422, term75422.getClass(), "visited", false);
        setField(term75422, term75422.getClass(), "docInfo", null);
        setBooleanField(term75422, term75422.getClass(), "unknown", false);
        setBooleanField(term75422, term75422.getClass(), "resolved", false);
        setField(term75422, term75422.getClass(), "resolveResult", null);
        setField(term75422, term75422.getClass(), "registry", null);
        setField(term75419, term75419.getClass(), "typeOfThis", term75422);
        setField(term75419, term75419.getClass(), "templateTypeName", null);
        setBooleanField(term75419, term75419.getClass(), "inferredReturnType", false);
        setBooleanField(term75419, term75419.getClass(), "isConstructor", false);
        setBooleanField(term75419, term75419.getClass(), "isNativeType", false);
        term75423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term75424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term75425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75423, term75423.getClass(), "this$0", null);
        setField(term75424, term75424.getClass(), "parameters", null);
        setField(term75424, term75424.getClass(), "returnType", null);
        setBooleanField(term75424, term75424.getClass(), "returnTypeInferred", false);
        setBooleanField(term75424, term75424.getClass(), "resolved", false);
        setField(term75424, term75424.getClass(), "resolveResult", null);
        setField(term75424, term75424.getClass(), "registry", null);
        setField(term75423, term75423.getClass(), "call", term75424);
        setField(term75423, term75423.getClass(), "prototype", null);
        setField(term75423, term75423.getClass(), "kind", null);
        setField(term75425, term75425.getClass(), "call", null);
        setField(term75425, term75425.getClass(), "prototype", null);
        setField(term75425, term75425.getClass(), "kind", null);
        setField(term75425, term75425.getClass(), "typeOfThis", null);
        setField(term75425, term75425.getClass(), "source", null);
        setField(term75425, term75425.getClass(), "implementedInterfaces", null);
        setField(term75425, term75425.getClass(), "subTypes", null);
        setField(term75425, term75425.getClass(), "templateTypeName", null);
        setField(term75425, term75425.getClass(), "className", null);
        setField(term75425, term75425.getClass(), "properties", null);
        setField(term75425, term75425.getClass(), "implicitPrototype", null);
        setBooleanField(term75425, term75425.getClass(), "nativeType", false);
        setBooleanField(term75425, term75425.getClass(), "prettyPrint", false);
        setBooleanField(term75425, term75425.getClass(), "visited", false);
        setField(term75425, term75425.getClass(), "docInfo", null);
        setBooleanField(term75425, term75425.getClass(), "unknown", false);
        setBooleanField(term75425, term75425.getClass(), "resolved", false);
        setField(term75425, term75425.getClass(), "resolveResult", null);
        setField(term75425, term75425.getClass(), "registry", null);
        setField(term75423, term75423.getClass(), "typeOfThis", term75425);
        setField(term75423, term75423.getClass(), "source", null);
        setField(term75423, term75423.getClass(), "implementedInterfaces", null);
        setField(term75423, term75423.getClass(), "subTypes", null);
        setField(term75423, term75423.getClass(), "templateTypeName", null);
        setField(term75423, term75423.getClass(), "className", "");
        setField(term75423, term75423.getClass(), "properties", null);
        setField(term75423, term75423.getClass(), "implicitPrototype", null);
        setBooleanField(term75423, term75423.getClass(), "nativeType", false);
        setBooleanField(term75423, term75423.getClass(), "prettyPrint", false);
        setBooleanField(term75423, term75423.getClass(), "visited", false);
        setField(term75423, term75423.getClass(), "docInfo", null);
        setBooleanField(term75423, term75423.getClass(), "unknown", false);
        setBooleanField(term75423, term75423.getClass(), "resolved", false);
        setField(term75423, term75423.getClass(), "resolveResult", null);
        setField(term75423, term75423.getClass(), "registry", null);
        term75413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term75380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75413, term75413.getClass(), "registry", null);
        setField(term75413, term75413.getClass(), "name", "");
        setField(term75413, term75413.getClass(), "sourceNode", null);
        setField(term75413, term75413.getClass(), "parametersNode", null);
        setField(term75413, term75413.getClass(), "returnType", null);
        setField(term75380, term75380.getClass(), "call", null);
        setField(term75380, term75380.getClass(), "prototype", null);
        setField(term75380, term75380.getClass(), "kind", null);
        setField(term75380, term75380.getClass(), "typeOfThis", null);
        setField(term75380, term75380.getClass(), "source", null);
        setField(term75380, term75380.getClass(), "implementedInterfaces", null);
        setField(term75380, term75380.getClass(), "subTypes", null);
        setField(term75380, term75380.getClass(), "templateTypeName", null);
        setField(term75380, term75380.getClass(), "className", null);
        setField(term75380, term75380.getClass(), "properties", null);
        setField(term75380, term75380.getClass(), "implicitPrototype", null);
        setBooleanField(term75380, term75380.getClass(), "nativeType", false);
        setBooleanField(term75380, term75380.getClass(), "prettyPrint", false);
        setBooleanField(term75380, term75380.getClass(), "visited", false);
        setField(term75380, term75380.getClass(), "docInfo", null);
        setBooleanField(term75380, term75380.getClass(), "unknown", false);
        setBooleanField(term75380, term75380.getClass(), "resolved", false);
        setField(term75380, term75380.getClass(), "resolveResult", null);
        setField(term75380, term75380.getClass(), "registry", null);
        setField(term75413, term75413.getClass(), "typeOfThis", term75380);
        setField(term75413, term75413.getClass(), "templateTypeName", null);
        setBooleanField(term75413, term75413.getClass(), "inferredReturnType", false);
        setBooleanField(term75413, term75413.getClass(), "isConstructor", false);
        setBooleanField(term75413, term75413.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term75140;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term75032, args);
        assertTrue(recursiveEquals(term75032, term75419));
        assertTrue(recursiveEquals(term75140, term75423));
        assertTrue(recursiveEquals(retValue, term75413));
    }

};


