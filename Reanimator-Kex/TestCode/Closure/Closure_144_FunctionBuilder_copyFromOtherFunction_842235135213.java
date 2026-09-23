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
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145972;
     Object term146278;
     Object term147055;
     Object term147059;
     Object term147040;

    public FunctionBuilder_copyFromOtherFunction_842235135213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term146080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term145972, term145972.getClass(), "name", "INTERFACE");
        setField(term145972, term145972.getClass(), "sourceNode", term146080);
        setField(term145972, term145972.getClass(), "parametersNode", null);
        setField(term145972, term145972.getClass(), "returnType", term146178);
        setField(term145972, term145972.getClass(), "typeOfThis", null);
        setField(term145972, term145972.getClass(), "templateTypeName", null);
        Class<? extends Object> term147086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term147085 = ((Class) term147086).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term147085).setAccessible(true);
        Object enum200 = ((Field) term147085).get((Object) null);
        term146278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term146391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term146491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term146278, term146278.getClass(), "className", "INTERFACE");
        setField(term146278, term146278.getClass(), "source", null);
        setField(term146391, term146391.getClass(), "parameters", null);
        setField(term146391, term146391.getClass(), "returnType", null);
        setField(term146278, term146278.getClass(), "call", term146391);
        setField(term146278, term146278.getClass(), "typeOfThis", term146491);
        setField(term146278, term146278.getClass(), "templateTypeName", null);
        setField(term146278, term146278.getClass(), "kind", enum200);
        term147055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term147058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term147055, term147055.getClass(), "registry", null);
        setField(term147055, term147055.getClass(), "name", "INTERFACE");
        setField(term147055, term147055.getClass(), "sourceNode", null);
        setField(term147055, term147055.getClass(), "parametersNode", null);
        setField(term147055, term147055.getClass(), "returnType", null);
        setField(term147058, term147058.getClass(), "call", null);
        setField(term147058, term147058.getClass(), "prototype", null);
        setField(term147058, term147058.getClass(), "kind", null);
        setField(term147058, term147058.getClass(), "typeOfThis", null);
        setField(term147058, term147058.getClass(), "source", null);
        setField(term147058, term147058.getClass(), "implementedInterfaces", null);
        setField(term147058, term147058.getClass(), "subTypes", null);
        setField(term147058, term147058.getClass(), "templateTypeName", null);
        setField(term147058, term147058.getClass(), "className", null);
        setField(term147058, term147058.getClass(), "properties", null);
        setField(term147058, term147058.getClass(), "implicitPrototype", null);
        setBooleanField(term147058, term147058.getClass(), "nativeType", false);
        setBooleanField(term147058, term147058.getClass(), "prettyPrint", false);
        setBooleanField(term147058, term147058.getClass(), "visited", false);
        setField(term147058, term147058.getClass(), "docInfo", null);
        setBooleanField(term147058, term147058.getClass(), "unknown", false);
        setBooleanField(term147058, term147058.getClass(), "resolved", false);
        setField(term147058, term147058.getClass(), "resolveResult", null);
        setField(term147058, term147058.getClass(), "registry", null);
        setField(term147055, term147055.getClass(), "typeOfThis", term147058);
        setField(term147055, term147055.getClass(), "templateTypeName", null);
        setBooleanField(term147055, term147055.getClass(), "inferredReturnType", false);
        setBooleanField(term147055, term147055.getClass(), "isConstructor", true);
        setBooleanField(term147055, term147055.getClass(), "isNativeType", false);
        Class<? extends Object> term147395 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term147394 = ((Class) term147395).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term147394).setAccessible(true);
        Object enum201 = ((Field) term147394).get((Object) null);
        term147059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term147060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term147064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term147060, term147060.getClass(), "parameters", null);
        setField(term147060, term147060.getClass(), "returnType", null);
        setBooleanField(term147060, term147060.getClass(), "returnTypeInferred", false);
        setBooleanField(term147060, term147060.getClass(), "resolved", false);
        setField(term147060, term147060.getClass(), "resolveResult", null);
        setField(term147060, term147060.getClass(), "registry", null);
        setField(term147059, term147059.getClass(), "call", term147060);
        setField(term147059, term147059.getClass(), "prototype", null);
        setField(term147059, term147059.getClass(), "kind", enum201);
        setField(term147064, term147064.getClass(), "call", null);
        setField(term147064, term147064.getClass(), "prototype", null);
        setField(term147064, term147064.getClass(), "kind", null);
        setField(term147064, term147064.getClass(), "typeOfThis", null);
        setField(term147064, term147064.getClass(), "source", null);
        setField(term147064, term147064.getClass(), "implementedInterfaces", null);
        setField(term147064, term147064.getClass(), "subTypes", null);
        setField(term147064, term147064.getClass(), "templateTypeName", null);
        setField(term147064, term147064.getClass(), "className", null);
        setField(term147064, term147064.getClass(), "properties", null);
        setField(term147064, term147064.getClass(), "implicitPrototype", null);
        setBooleanField(term147064, term147064.getClass(), "nativeType", false);
        setBooleanField(term147064, term147064.getClass(), "prettyPrint", false);
        setBooleanField(term147064, term147064.getClass(), "visited", false);
        setField(term147064, term147064.getClass(), "docInfo", null);
        setBooleanField(term147064, term147064.getClass(), "unknown", false);
        setBooleanField(term147064, term147064.getClass(), "resolved", false);
        setField(term147064, term147064.getClass(), "resolveResult", null);
        setField(term147064, term147064.getClass(), "registry", null);
        setField(term147059, term147059.getClass(), "typeOfThis", term147064);
        setField(term147059, term147059.getClass(), "source", null);
        setField(term147059, term147059.getClass(), "implementedInterfaces", null);
        setField(term147059, term147059.getClass(), "subTypes", null);
        setField(term147059, term147059.getClass(), "templateTypeName", null);
        setField(term147059, term147059.getClass(), "className", "INTERFACE");
        setField(term147059, term147059.getClass(), "properties", null);
        setField(term147059, term147059.getClass(), "implicitPrototype", null);
        setBooleanField(term147059, term147059.getClass(), "nativeType", false);
        setBooleanField(term147059, term147059.getClass(), "prettyPrint", false);
        setBooleanField(term147059, term147059.getClass(), "visited", false);
        setField(term147059, term147059.getClass(), "docInfo", null);
        setBooleanField(term147059, term147059.getClass(), "unknown", false);
        setBooleanField(term147059, term147059.getClass(), "resolved", false);
        setField(term147059, term147059.getClass(), "resolveResult", null);
        setField(term147059, term147059.getClass(), "registry", null);
        term147040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term146989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term147040, term147040.getClass(), "registry", null);
        setField(term147040, term147040.getClass(), "name", "INTERFACE");
        setField(term147040, term147040.getClass(), "sourceNode", null);
        setField(term147040, term147040.getClass(), "parametersNode", null);
        setField(term147040, term147040.getClass(), "returnType", null);
        setField(term146989, term146989.getClass(), "call", null);
        setField(term146989, term146989.getClass(), "prototype", null);
        setField(term146989, term146989.getClass(), "kind", null);
        setField(term146989, term146989.getClass(), "typeOfThis", null);
        setField(term146989, term146989.getClass(), "source", null);
        setField(term146989, term146989.getClass(), "implementedInterfaces", null);
        setField(term146989, term146989.getClass(), "subTypes", null);
        setField(term146989, term146989.getClass(), "templateTypeName", null);
        setField(term146989, term146989.getClass(), "className", null);
        setField(term146989, term146989.getClass(), "properties", null);
        setField(term146989, term146989.getClass(), "implicitPrototype", null);
        setBooleanField(term146989, term146989.getClass(), "nativeType", false);
        setBooleanField(term146989, term146989.getClass(), "prettyPrint", false);
        setBooleanField(term146989, term146989.getClass(), "visited", false);
        setField(term146989, term146989.getClass(), "docInfo", null);
        setBooleanField(term146989, term146989.getClass(), "unknown", false);
        setBooleanField(term146989, term146989.getClass(), "resolved", false);
        setField(term146989, term146989.getClass(), "resolveResult", null);
        setField(term146989, term146989.getClass(), "registry", null);
        setField(term147040, term147040.getClass(), "typeOfThis", term146989);
        setField(term147040, term147040.getClass(), "templateTypeName", null);
        setBooleanField(term147040, term147040.getClass(), "inferredReturnType", false);
        setBooleanField(term147040, term147040.getClass(), "isConstructor", true);
        setBooleanField(term147040, term147040.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term146278;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term145972, args);
        assertTrue(recursiveEquals(term145972, term147055));
        assertTrue(recursiveEquals(term146278, term147059));
        assertTrue(recursiveEquals(retValue, term147040));
    }

};


