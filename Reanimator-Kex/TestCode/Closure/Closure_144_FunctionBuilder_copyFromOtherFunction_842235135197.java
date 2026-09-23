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

public class FunctionBuilder_copyFromOtherFunction_842235135197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135209;
     Object term135317;
     Object term135500;
     Object term135507;
     Object term135494;

    public FunctionBuilder_copyFromOtherFunction_842235135197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term135209, term135209.getClass(), "name", null);
        setField(term135209, term135209.getClass(), "sourceNode", null);
        setField(term135209, term135209.getClass(), "parametersNode", null);
        setField(term135209, term135209.getClass(), "returnType", null);
        term135317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term135449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term135317, term135317.getClass(), "className", "");
        setField(term135317, term135317.getClass(), "source", null);
        setField(term135449, term135449.getClass(), "parameters", null);
        setField(term135449, term135449.getClass(), "returnType", null);
        setField(term135317, term135317.getClass(), "call", term135449);
        setField(term135317, term135317.getClass(), "typeOfThis", term135317);
        term135500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term135503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term135504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term135500, term135500.getClass(), "registry", null);
        setField(term135500, term135500.getClass(), "name", "");
        setField(term135500, term135500.getClass(), "sourceNode", null);
        setField(term135500, term135500.getClass(), "parametersNode", null);
        setField(term135500, term135500.getClass(), "returnType", null);
        setField(term135503, term135503.getClass(), "this$0", null);
        setField(term135504, term135504.getClass(), "parameters", null);
        setField(term135504, term135504.getClass(), "returnType", null);
        setBooleanField(term135504, term135504.getClass(), "returnTypeInferred", false);
        setBooleanField(term135504, term135504.getClass(), "resolved", false);
        setField(term135504, term135504.getClass(), "resolveResult", null);
        setField(term135504, term135504.getClass(), "registry", null);
        setField(term135503, term135503.getClass(), "call", term135504);
        setField(term135503, term135503.getClass(), "prototype", null);
        setField(term135503, term135503.getClass(), "kind", null);
        setField(term135503, term135503.getClass(), "typeOfThis", term135503);
        setField(term135503, term135503.getClass(), "source", null);
        setField(term135503, term135503.getClass(), "implementedInterfaces", null);
        setField(term135503, term135503.getClass(), "subTypes", null);
        setField(term135503, term135503.getClass(), "templateTypeName", null);
        setField(term135503, term135503.getClass(), "className", "");
        setField(term135503, term135503.getClass(), "properties", null);
        setField(term135503, term135503.getClass(), "implicitPrototype", null);
        setBooleanField(term135503, term135503.getClass(), "nativeType", false);
        setBooleanField(term135503, term135503.getClass(), "prettyPrint", false);
        setBooleanField(term135503, term135503.getClass(), "visited", false);
        setField(term135503, term135503.getClass(), "docInfo", null);
        setBooleanField(term135503, term135503.getClass(), "unknown", false);
        setBooleanField(term135503, term135503.getClass(), "resolved", false);
        setField(term135503, term135503.getClass(), "resolveResult", null);
        setField(term135503, term135503.getClass(), "registry", null);
        setField(term135500, term135500.getClass(), "typeOfThis", term135503);
        setField(term135500, term135500.getClass(), "templateTypeName", null);
        setBooleanField(term135500, term135500.getClass(), "inferredReturnType", false);
        setBooleanField(term135500, term135500.getClass(), "isConstructor", false);
        setBooleanField(term135500, term135500.getClass(), "isNativeType", false);
        term135507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term135508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term135507, term135507.getClass(), "this$0", null);
        setField(term135508, term135508.getClass(), "parameters", null);
        setField(term135508, term135508.getClass(), "returnType", null);
        setBooleanField(term135508, term135508.getClass(), "returnTypeInferred", false);
        setBooleanField(term135508, term135508.getClass(), "resolved", false);
        setField(term135508, term135508.getClass(), "resolveResult", null);
        setField(term135508, term135508.getClass(), "registry", null);
        setField(term135507, term135507.getClass(), "call", term135508);
        setField(term135507, term135507.getClass(), "prototype", null);
        setField(term135507, term135507.getClass(), "kind", null);
        setField(term135507, term135507.getClass(), "typeOfThis", term135507);
        setField(term135507, term135507.getClass(), "source", null);
        setField(term135507, term135507.getClass(), "implementedInterfaces", null);
        setField(term135507, term135507.getClass(), "subTypes", null);
        setField(term135507, term135507.getClass(), "templateTypeName", null);
        setField(term135507, term135507.getClass(), "className", "");
        setField(term135507, term135507.getClass(), "properties", null);
        setField(term135507, term135507.getClass(), "implicitPrototype", null);
        setBooleanField(term135507, term135507.getClass(), "nativeType", false);
        setBooleanField(term135507, term135507.getClass(), "prettyPrint", false);
        setBooleanField(term135507, term135507.getClass(), "visited", false);
        setField(term135507, term135507.getClass(), "docInfo", null);
        setBooleanField(term135507, term135507.getClass(), "unknown", false);
        setBooleanField(term135507, term135507.getClass(), "resolved", false);
        setField(term135507, term135507.getClass(), "resolveResult", null);
        setField(term135507, term135507.getClass(), "registry", null);
        term135494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term135453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term135454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term135494, term135494.getClass(), "registry", null);
        setField(term135494, term135494.getClass(), "name", "");
        setField(term135494, term135494.getClass(), "sourceNode", null);
        setField(term135494, term135494.getClass(), "parametersNode", null);
        setField(term135494, term135494.getClass(), "returnType", null);
        setField(term135453, term135453.getClass(), "this$0", null);
        setField(term135454, term135454.getClass(), "parameters", null);
        setField(term135454, term135454.getClass(), "returnType", null);
        setBooleanField(term135454, term135454.getClass(), "returnTypeInferred", false);
        setBooleanField(term135454, term135454.getClass(), "resolved", false);
        setField(term135454, term135454.getClass(), "resolveResult", null);
        setField(term135454, term135454.getClass(), "registry", null);
        setField(term135453, term135453.getClass(), "call", term135454);
        setField(term135453, term135453.getClass(), "prototype", null);
        setField(term135453, term135453.getClass(), "kind", null);
        setField(term135453, term135453.getClass(), "typeOfThis", term135453);
        setField(term135453, term135453.getClass(), "source", null);
        setField(term135453, term135453.getClass(), "implementedInterfaces", null);
        setField(term135453, term135453.getClass(), "subTypes", null);
        setField(term135453, term135453.getClass(), "templateTypeName", null);
        setField(term135453, term135453.getClass(), "className", "");
        setField(term135453, term135453.getClass(), "properties", null);
        setField(term135453, term135453.getClass(), "implicitPrototype", null);
        setBooleanField(term135453, term135453.getClass(), "nativeType", false);
        setBooleanField(term135453, term135453.getClass(), "prettyPrint", false);
        setBooleanField(term135453, term135453.getClass(), "visited", false);
        setField(term135453, term135453.getClass(), "docInfo", null);
        setBooleanField(term135453, term135453.getClass(), "unknown", false);
        setBooleanField(term135453, term135453.getClass(), "resolved", false);
        setField(term135453, term135453.getClass(), "resolveResult", null);
        setField(term135453, term135453.getClass(), "registry", null);
        setField(term135494, term135494.getClass(), "typeOfThis", term135453);
        setField(term135494, term135494.getClass(), "templateTypeName", null);
        setBooleanField(term135494, term135494.getClass(), "inferredReturnType", false);
        setBooleanField(term135494, term135494.getClass(), "isConstructor", false);
        setBooleanField(term135494, term135494.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term135317;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term135209, args);
        assertTrue(recursiveEquals(term135209, term135500));
        assertTrue(recursiveEquals(term135317, term135507));
        assertTrue(recursiveEquals(retValue, term135494));
    }

};


