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

public class FunctionBuilder_copyFromOtherFunction_842235135117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84032;
     Object term84140;
     Object term84323;
     Object term84330;
     Object term84317;

    public FunctionBuilder_copyFromOtherFunction_842235135117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term84032, term84032.getClass(), "name", null);
        setField(term84032, term84032.getClass(), "sourceNode", null);
        setField(term84032, term84032.getClass(), "parametersNode", null);
        setField(term84032, term84032.getClass(), "returnType", null);
        term84140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term84272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term84140, term84140.getClass(), "className", "");
        setField(term84140, term84140.getClass(), "source", null);
        setField(term84272, term84272.getClass(), "parameters", null);
        setField(term84272, term84272.getClass(), "returnType", null);
        setField(term84140, term84140.getClass(), "call", term84272);
        setField(term84140, term84140.getClass(), "typeOfThis", term84140);
        term84323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term84326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term84327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term84323, term84323.getClass(), "registry", null);
        setField(term84323, term84323.getClass(), "name", "");
        setField(term84323, term84323.getClass(), "sourceNode", null);
        setField(term84323, term84323.getClass(), "parametersNode", null);
        setField(term84323, term84323.getClass(), "returnType", null);
        setField(term84326, term84326.getClass(), "this$0", null);
        setField(term84327, term84327.getClass(), "parameters", null);
        setField(term84327, term84327.getClass(), "returnType", null);
        setBooleanField(term84327, term84327.getClass(), "returnTypeInferred", false);
        setBooleanField(term84327, term84327.getClass(), "resolved", false);
        setField(term84327, term84327.getClass(), "resolveResult", null);
        setField(term84327, term84327.getClass(), "registry", null);
        setField(term84326, term84326.getClass(), "call", term84327);
        setField(term84326, term84326.getClass(), "prototype", null);
        setField(term84326, term84326.getClass(), "kind", null);
        setField(term84326, term84326.getClass(), "typeOfThis", term84326);
        setField(term84326, term84326.getClass(), "source", null);
        setField(term84326, term84326.getClass(), "implementedInterfaces", null);
        setField(term84326, term84326.getClass(), "subTypes", null);
        setField(term84326, term84326.getClass(), "templateTypeName", null);
        setField(term84326, term84326.getClass(), "className", "");
        setField(term84326, term84326.getClass(), "properties", null);
        setField(term84326, term84326.getClass(), "implicitPrototype", null);
        setBooleanField(term84326, term84326.getClass(), "nativeType", false);
        setBooleanField(term84326, term84326.getClass(), "prettyPrint", false);
        setBooleanField(term84326, term84326.getClass(), "visited", false);
        setField(term84326, term84326.getClass(), "docInfo", null);
        setBooleanField(term84326, term84326.getClass(), "unknown", false);
        setBooleanField(term84326, term84326.getClass(), "resolved", false);
        setField(term84326, term84326.getClass(), "resolveResult", null);
        setField(term84326, term84326.getClass(), "registry", null);
        setField(term84323, term84323.getClass(), "typeOfThis", term84326);
        setField(term84323, term84323.getClass(), "templateTypeName", null);
        setBooleanField(term84323, term84323.getClass(), "inferredReturnType", false);
        setBooleanField(term84323, term84323.getClass(), "isConstructor", false);
        setBooleanField(term84323, term84323.getClass(), "isNativeType", false);
        term84330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term84331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term84330, term84330.getClass(), "this$0", null);
        setField(term84331, term84331.getClass(), "parameters", null);
        setField(term84331, term84331.getClass(), "returnType", null);
        setBooleanField(term84331, term84331.getClass(), "returnTypeInferred", false);
        setBooleanField(term84331, term84331.getClass(), "resolved", false);
        setField(term84331, term84331.getClass(), "resolveResult", null);
        setField(term84331, term84331.getClass(), "registry", null);
        setField(term84330, term84330.getClass(), "call", term84331);
        setField(term84330, term84330.getClass(), "prototype", null);
        setField(term84330, term84330.getClass(), "kind", null);
        setField(term84330, term84330.getClass(), "typeOfThis", term84330);
        setField(term84330, term84330.getClass(), "source", null);
        setField(term84330, term84330.getClass(), "implementedInterfaces", null);
        setField(term84330, term84330.getClass(), "subTypes", null);
        setField(term84330, term84330.getClass(), "templateTypeName", null);
        setField(term84330, term84330.getClass(), "className", "");
        setField(term84330, term84330.getClass(), "properties", null);
        setField(term84330, term84330.getClass(), "implicitPrototype", null);
        setBooleanField(term84330, term84330.getClass(), "nativeType", false);
        setBooleanField(term84330, term84330.getClass(), "prettyPrint", false);
        setBooleanField(term84330, term84330.getClass(), "visited", false);
        setField(term84330, term84330.getClass(), "docInfo", null);
        setBooleanField(term84330, term84330.getClass(), "unknown", false);
        setBooleanField(term84330, term84330.getClass(), "resolved", false);
        setField(term84330, term84330.getClass(), "resolveResult", null);
        setField(term84330, term84330.getClass(), "registry", null);
        term84317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term84276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term84277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term84317, term84317.getClass(), "registry", null);
        setField(term84317, term84317.getClass(), "name", "");
        setField(term84317, term84317.getClass(), "sourceNode", null);
        setField(term84317, term84317.getClass(), "parametersNode", null);
        setField(term84317, term84317.getClass(), "returnType", null);
        setField(term84276, term84276.getClass(), "this$0", null);
        setField(term84277, term84277.getClass(), "parameters", null);
        setField(term84277, term84277.getClass(), "returnType", null);
        setBooleanField(term84277, term84277.getClass(), "returnTypeInferred", false);
        setBooleanField(term84277, term84277.getClass(), "resolved", false);
        setField(term84277, term84277.getClass(), "resolveResult", null);
        setField(term84277, term84277.getClass(), "registry", null);
        setField(term84276, term84276.getClass(), "call", term84277);
        setField(term84276, term84276.getClass(), "prototype", null);
        setField(term84276, term84276.getClass(), "kind", null);
        setField(term84276, term84276.getClass(), "typeOfThis", term84276);
        setField(term84276, term84276.getClass(), "source", null);
        setField(term84276, term84276.getClass(), "implementedInterfaces", null);
        setField(term84276, term84276.getClass(), "subTypes", null);
        setField(term84276, term84276.getClass(), "templateTypeName", null);
        setField(term84276, term84276.getClass(), "className", "");
        setField(term84276, term84276.getClass(), "properties", null);
        setField(term84276, term84276.getClass(), "implicitPrototype", null);
        setBooleanField(term84276, term84276.getClass(), "nativeType", false);
        setBooleanField(term84276, term84276.getClass(), "prettyPrint", false);
        setBooleanField(term84276, term84276.getClass(), "visited", false);
        setField(term84276, term84276.getClass(), "docInfo", null);
        setBooleanField(term84276, term84276.getClass(), "unknown", false);
        setBooleanField(term84276, term84276.getClass(), "resolved", false);
        setField(term84276, term84276.getClass(), "resolveResult", null);
        setField(term84276, term84276.getClass(), "registry", null);
        setField(term84317, term84317.getClass(), "typeOfThis", term84276);
        setField(term84317, term84317.getClass(), "templateTypeName", null);
        setBooleanField(term84317, term84317.getClass(), "inferredReturnType", false);
        setBooleanField(term84317, term84317.getClass(), "isConstructor", false);
        setBooleanField(term84317, term84317.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term84140;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term84032, args);
        assertTrue(recursiveEquals(term84032, term84323));
        assertTrue(recursiveEquals(term84140, term84330));
        assertTrue(recursiveEquals(retValue, term84317));
    }

};


