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

public class FunctionBuilder_copyFromOtherFunction_842235135215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147915;
     Object term148225;
     Object term148929;
     Object term148931;
     Object term148925;

    public FunctionBuilder_copyFromOtherFunction_842235135215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term148023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term147915, term147915.getClass(), "name", "");
        setField(term147915, term147915.getClass(), "sourceNode", null);
        setField(term147915, term147915.getClass(), "parametersNode", term148023);
        setField(term147915, term147915.getClass(), "returnType", term148117);
        setField(term147915, term147915.getClass(), "typeOfThis", null);
        setField(term147915, term147915.getClass(), "templateTypeName", null);
        Class<? extends Object> term148938 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term148937 = ((Class) term148938).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term148937).setAccessible(true);
        Object enum203 = ((Field) term148937).get((Object) null);
        term148225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term148319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term148429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term148225, term148225.getClass(), "className", null);
        setField(term148225, term148225.getClass(), "source", null);
        setField(term148319, term148319.getClass(), "parameters", null);
        setField(term148319, term148319.getClass(), "returnType", term148429);
        setField(term148225, term148225.getClass(), "call", term148319);
        setField(term148225, term148225.getClass(), "typeOfThis", term148429);
        setField(term148225, term148225.getClass(), "templateTypeName", null);
        setField(term148225, term148225.getClass(), "kind", enum203);
        term148929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term148930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term148929, term148929.getClass(), "registry", null);
        setField(term148929, term148929.getClass(), "name", null);
        setField(term148929, term148929.getClass(), "sourceNode", null);
        setField(term148929, term148929.getClass(), "parametersNode", null);
        setField(term148930, term148930.getClass(), "parameterType", null);
        setField(term148930, term148930.getClass(), "referencedType", null);
        setBooleanField(term148930, term148930.getClass(), "visited", false);
        setField(term148930, term148930.getClass(), "docInfo", null);
        setBooleanField(term148930, term148930.getClass(), "unknown", false);
        setBooleanField(term148930, term148930.getClass(), "resolved", false);
        setField(term148930, term148930.getClass(), "resolveResult", null);
        setField(term148930, term148930.getClass(), "registry", null);
        setField(term148929, term148929.getClass(), "returnType", term148930);
        setField(term148929, term148929.getClass(), "typeOfThis", term148930);
        setField(term148929, term148929.getClass(), "templateTypeName", null);
        setBooleanField(term148929, term148929.getClass(), "inferredReturnType", false);
        setBooleanField(term148929, term148929.getClass(), "isConstructor", true);
        setBooleanField(term148929, term148929.getClass(), "isNativeType", false);
        Class<? extends Object> term149238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term149237 = ((Class) term149238).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term149237).setAccessible(true);
        Object enum204 = ((Field) term149237).get((Object) null);
        term148931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term148932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term148933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term148931, term148931.getClass(), "this$0", null);
        setField(term148932, term148932.getClass(), "parameters", null);
        setField(term148933, term148933.getClass(), "parameterType", null);
        setField(term148933, term148933.getClass(), "referencedType", null);
        setBooleanField(term148933, term148933.getClass(), "visited", false);
        setField(term148933, term148933.getClass(), "docInfo", null);
        setBooleanField(term148933, term148933.getClass(), "unknown", false);
        setBooleanField(term148933, term148933.getClass(), "resolved", false);
        setField(term148933, term148933.getClass(), "resolveResult", null);
        setField(term148933, term148933.getClass(), "registry", null);
        setField(term148932, term148932.getClass(), "returnType", term148933);
        setBooleanField(term148932, term148932.getClass(), "returnTypeInferred", false);
        setBooleanField(term148932, term148932.getClass(), "resolved", false);
        setField(term148932, term148932.getClass(), "resolveResult", null);
        setField(term148932, term148932.getClass(), "registry", null);
        setField(term148931, term148931.getClass(), "call", term148932);
        setField(term148931, term148931.getClass(), "prototype", null);
        setField(term148931, term148931.getClass(), "kind", enum204);
        setField(term148931, term148931.getClass(), "typeOfThis", term148933);
        setField(term148931, term148931.getClass(), "source", null);
        setField(term148931, term148931.getClass(), "implementedInterfaces", null);
        setField(term148931, term148931.getClass(), "subTypes", null);
        setField(term148931, term148931.getClass(), "templateTypeName", null);
        setField(term148931, term148931.getClass(), "className", null);
        setField(term148931, term148931.getClass(), "properties", null);
        setField(term148931, term148931.getClass(), "implicitPrototype", null);
        setBooleanField(term148931, term148931.getClass(), "nativeType", false);
        setBooleanField(term148931, term148931.getClass(), "prettyPrint", false);
        setBooleanField(term148931, term148931.getClass(), "visited", false);
        setField(term148931, term148931.getClass(), "docInfo", null);
        setBooleanField(term148931, term148931.getClass(), "unknown", false);
        setBooleanField(term148931, term148931.getClass(), "resolved", false);
        setField(term148931, term148931.getClass(), "resolveResult", null);
        setField(term148931, term148931.getClass(), "registry", null);
        term148925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term148881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term148925, term148925.getClass(), "registry", null);
        setField(term148925, term148925.getClass(), "name", null);
        setField(term148925, term148925.getClass(), "sourceNode", null);
        setField(term148925, term148925.getClass(), "parametersNode", null);
        setField(term148881, term148881.getClass(), "parameterType", null);
        setField(term148881, term148881.getClass(), "referencedType", null);
        setBooleanField(term148881, term148881.getClass(), "visited", false);
        setField(term148881, term148881.getClass(), "docInfo", null);
        setBooleanField(term148881, term148881.getClass(), "unknown", false);
        setBooleanField(term148881, term148881.getClass(), "resolved", false);
        setField(term148881, term148881.getClass(), "resolveResult", null);
        setField(term148881, term148881.getClass(), "registry", null);
        setField(term148925, term148925.getClass(), "returnType", term148881);
        setField(term148925, term148925.getClass(), "typeOfThis", term148881);
        setField(term148925, term148925.getClass(), "templateTypeName", null);
        setBooleanField(term148925, term148925.getClass(), "inferredReturnType", false);
        setBooleanField(term148925, term148925.getClass(), "isConstructor", true);
        setBooleanField(term148925, term148925.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term148225;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term147915, args);
        assertTrue(recursiveEquals(term147915, term148929));
        assertTrue(recursiveEquals(term148225, term148931));
        assertTrue(recursiveEquals(retValue, term148925));
    }

};


