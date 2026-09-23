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

public class FunctionBuilder_copyFromOtherFunction_842235135145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100503;
     Object term100649;
     Object term101345;
     Object term101347;
     Object term101341;

    public FunctionBuilder_copyFromOtherFunction_842235135145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term100503, term100503.getClass(), "name", "");
        setField(term100503, term100503.getClass(), "sourceNode", null);
        setField(term100503, term100503.getClass(), "parametersNode", null);
        setField(term100503, term100503.getClass(), "returnType", null);
        setField(term100503, term100503.getClass(), "typeOfThis", null);
        setField(term100503, term100503.getClass(), "templateTypeName", null);
        Class<? extends Object> term101354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term101353 = ((Class) term101354).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term101353).setAccessible(true);
        Object enum147 = ((Field) term101353).get((Object) null);
        term100649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term100743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100649, term100649.getClass(), "className", null);
        setField(term100649, term100649.getClass(), "source", null);
        setField(term100743, term100743.getClass(), "parameters", null);
        setField(term100743, term100743.getClass(), "returnType", null);
        setField(term100649, term100649.getClass(), "call", term100743);
        setField(term100649, term100649.getClass(), "typeOfThis", term100843);
        setField(term100649, term100649.getClass(), "templateTypeName", null);
        setField(term100649, term100649.getClass(), "kind", enum147);
        term101345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term101346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101345, term101345.getClass(), "registry", null);
        setField(term101345, term101345.getClass(), "name", null);
        setField(term101345, term101345.getClass(), "sourceNode", null);
        setField(term101345, term101345.getClass(), "parametersNode", null);
        setField(term101345, term101345.getClass(), "returnType", null);
        setField(term101346, term101346.getClass(), "call", null);
        setField(term101346, term101346.getClass(), "prototype", null);
        setField(term101346, term101346.getClass(), "kind", null);
        setField(term101346, term101346.getClass(), "typeOfThis", null);
        setField(term101346, term101346.getClass(), "source", null);
        setField(term101346, term101346.getClass(), "implementedInterfaces", null);
        setField(term101346, term101346.getClass(), "subTypes", null);
        setField(term101346, term101346.getClass(), "templateTypeName", null);
        setField(term101346, term101346.getClass(), "className", null);
        setField(term101346, term101346.getClass(), "properties", null);
        setField(term101346, term101346.getClass(), "implicitPrototype", null);
        setBooleanField(term101346, term101346.getClass(), "nativeType", false);
        setBooleanField(term101346, term101346.getClass(), "prettyPrint", false);
        setBooleanField(term101346, term101346.getClass(), "visited", false);
        setField(term101346, term101346.getClass(), "docInfo", null);
        setBooleanField(term101346, term101346.getClass(), "unknown", false);
        setBooleanField(term101346, term101346.getClass(), "resolved", false);
        setField(term101346, term101346.getClass(), "resolveResult", null);
        setField(term101346, term101346.getClass(), "registry", null);
        setField(term101345, term101345.getClass(), "typeOfThis", term101346);
        setField(term101345, term101345.getClass(), "templateTypeName", null);
        setBooleanField(term101345, term101345.getClass(), "inferredReturnType", false);
        setBooleanField(term101345, term101345.getClass(), "isConstructor", true);
        setBooleanField(term101345, term101345.getClass(), "isNativeType", false);
        Class<? extends Object> term101654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term101653 = ((Class) term101654).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term101653).setAccessible(true);
        Object enum148 = ((Field) term101653).get((Object) null);
        term101347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term101348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term101352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101347, term101347.getClass(), "this$0", null);
        setField(term101348, term101348.getClass(), "parameters", null);
        setField(term101348, term101348.getClass(), "returnType", null);
        setBooleanField(term101348, term101348.getClass(), "returnTypeInferred", false);
        setBooleanField(term101348, term101348.getClass(), "resolved", false);
        setField(term101348, term101348.getClass(), "resolveResult", null);
        setField(term101348, term101348.getClass(), "registry", null);
        setField(term101347, term101347.getClass(), "call", term101348);
        setField(term101347, term101347.getClass(), "prototype", null);
        setField(term101347, term101347.getClass(), "kind", enum148);
        setField(term101352, term101352.getClass(), "call", null);
        setField(term101352, term101352.getClass(), "prototype", null);
        setField(term101352, term101352.getClass(), "kind", null);
        setField(term101352, term101352.getClass(), "typeOfThis", null);
        setField(term101352, term101352.getClass(), "source", null);
        setField(term101352, term101352.getClass(), "implementedInterfaces", null);
        setField(term101352, term101352.getClass(), "subTypes", null);
        setField(term101352, term101352.getClass(), "templateTypeName", null);
        setField(term101352, term101352.getClass(), "className", null);
        setField(term101352, term101352.getClass(), "properties", null);
        setField(term101352, term101352.getClass(), "implicitPrototype", null);
        setBooleanField(term101352, term101352.getClass(), "nativeType", false);
        setBooleanField(term101352, term101352.getClass(), "prettyPrint", false);
        setBooleanField(term101352, term101352.getClass(), "visited", false);
        setField(term101352, term101352.getClass(), "docInfo", null);
        setBooleanField(term101352, term101352.getClass(), "unknown", false);
        setBooleanField(term101352, term101352.getClass(), "resolved", false);
        setField(term101352, term101352.getClass(), "resolveResult", null);
        setField(term101352, term101352.getClass(), "registry", null);
        setField(term101347, term101347.getClass(), "typeOfThis", term101352);
        setField(term101347, term101347.getClass(), "source", null);
        setField(term101347, term101347.getClass(), "implementedInterfaces", null);
        setField(term101347, term101347.getClass(), "subTypes", null);
        setField(term101347, term101347.getClass(), "templateTypeName", null);
        setField(term101347, term101347.getClass(), "className", null);
        setField(term101347, term101347.getClass(), "properties", null);
        setField(term101347, term101347.getClass(), "implicitPrototype", null);
        setBooleanField(term101347, term101347.getClass(), "nativeType", false);
        setBooleanField(term101347, term101347.getClass(), "prettyPrint", false);
        setBooleanField(term101347, term101347.getClass(), "visited", false);
        setField(term101347, term101347.getClass(), "docInfo", null);
        setBooleanField(term101347, term101347.getClass(), "unknown", false);
        setBooleanField(term101347, term101347.getClass(), "resolved", false);
        setField(term101347, term101347.getClass(), "resolveResult", null);
        setField(term101347, term101347.getClass(), "registry", null);
        term101341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term101312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101341, term101341.getClass(), "registry", null);
        setField(term101341, term101341.getClass(), "name", null);
        setField(term101341, term101341.getClass(), "sourceNode", null);
        setField(term101341, term101341.getClass(), "parametersNode", null);
        setField(term101341, term101341.getClass(), "returnType", null);
        setField(term101312, term101312.getClass(), "call", null);
        setField(term101312, term101312.getClass(), "prototype", null);
        setField(term101312, term101312.getClass(), "kind", null);
        setField(term101312, term101312.getClass(), "typeOfThis", null);
        setField(term101312, term101312.getClass(), "source", null);
        setField(term101312, term101312.getClass(), "implementedInterfaces", null);
        setField(term101312, term101312.getClass(), "subTypes", null);
        setField(term101312, term101312.getClass(), "templateTypeName", null);
        setField(term101312, term101312.getClass(), "className", null);
        setField(term101312, term101312.getClass(), "properties", null);
        setField(term101312, term101312.getClass(), "implicitPrototype", null);
        setBooleanField(term101312, term101312.getClass(), "nativeType", false);
        setBooleanField(term101312, term101312.getClass(), "prettyPrint", false);
        setBooleanField(term101312, term101312.getClass(), "visited", false);
        setField(term101312, term101312.getClass(), "docInfo", null);
        setBooleanField(term101312, term101312.getClass(), "unknown", false);
        setBooleanField(term101312, term101312.getClass(), "resolved", false);
        setField(term101312, term101312.getClass(), "resolveResult", null);
        setField(term101312, term101312.getClass(), "registry", null);
        setField(term101341, term101341.getClass(), "typeOfThis", term101312);
        setField(term101341, term101341.getClass(), "templateTypeName", null);
        setBooleanField(term101341, term101341.getClass(), "inferredReturnType", false);
        setBooleanField(term101341, term101341.getClass(), "isConstructor", true);
        setBooleanField(term101341, term101341.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term100649;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term100503, args);
        assertTrue(recursiveEquals(term100503, term101345));
        assertTrue(recursiveEquals(term100649, term101347));
        assertTrue(recursiveEquals(retValue, term101341));
    }

};


