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

public class FunctionBuilder_copyFromOtherFunction_842235135177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120211;
     Object term120357;
     Object term121126;
     Object term121130;
     Object term121111;

    public FunctionBuilder_copyFromOtherFunction_842235135177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term120211, term120211.getClass(), "name", "INTERFACE");
        setField(term120211, term120211.getClass(), "sourceNode", null);
        setField(term120211, term120211.getClass(), "parametersNode", null);
        setField(term120211, term120211.getClass(), "returnType", null);
        setField(term120211, term120211.getClass(), "typeOfThis", null);
        setField(term120211, term120211.getClass(), "templateTypeName", null);
        Class<? extends Object> term121157 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121156 = ((Class) term121157).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term121156).setAccessible(true);
        Object enum170 = ((Field) term121156).get((Object) null);
        term120357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term120470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term120568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term120357, term120357.getClass(), "className", "INTERFACE");
        setField(term120357, term120357.getClass(), "source", null);
        setField(term120470, term120470.getClass(), "parameters", null);
        setField(term120470, term120470.getClass(), "returnType", null);
        setField(term120357, term120357.getClass(), "call", term120470);
        setField(term120357, term120357.getClass(), "typeOfThis", term120568);
        setField(term120357, term120357.getClass(), "templateTypeName", null);
        setField(term120357, term120357.getClass(), "kind", enum170);
        term121126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term121129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term121126, term121126.getClass(), "registry", null);
        setField(term121126, term121126.getClass(), "name", "INTERFACE");
        setField(term121126, term121126.getClass(), "sourceNode", null);
        setField(term121126, term121126.getClass(), "parametersNode", null);
        setField(term121126, term121126.getClass(), "returnType", null);
        setField(term121129, term121129.getClass(), "indexType", null);
        setField(term121129, term121129.getClass(), "referencedType", null);
        setBooleanField(term121129, term121129.getClass(), "visited", false);
        setField(term121129, term121129.getClass(), "docInfo", null);
        setBooleanField(term121129, term121129.getClass(), "unknown", false);
        setBooleanField(term121129, term121129.getClass(), "resolved", false);
        setField(term121129, term121129.getClass(), "resolveResult", null);
        setField(term121129, term121129.getClass(), "registry", null);
        setField(term121126, term121126.getClass(), "typeOfThis", term121129);
        setField(term121126, term121126.getClass(), "templateTypeName", null);
        setBooleanField(term121126, term121126.getClass(), "inferredReturnType", false);
        setBooleanField(term121126, term121126.getClass(), "isConstructor", true);
        setBooleanField(term121126, term121126.getClass(), "isNativeType", false);
        Class<? extends Object> term121466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121465 = ((Class) term121466).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term121465).setAccessible(true);
        Object enum171 = ((Field) term121465).get((Object) null);
        term121130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term121131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term121135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term121130, term121130.getClass(), "this$0", null);
        setField(term121131, term121131.getClass(), "parameters", null);
        setField(term121131, term121131.getClass(), "returnType", null);
        setBooleanField(term121131, term121131.getClass(), "returnTypeInferred", false);
        setBooleanField(term121131, term121131.getClass(), "resolved", false);
        setField(term121131, term121131.getClass(), "resolveResult", null);
        setField(term121131, term121131.getClass(), "registry", null);
        setField(term121130, term121130.getClass(), "call", term121131);
        setField(term121130, term121130.getClass(), "prototype", null);
        setField(term121130, term121130.getClass(), "kind", enum171);
        setField(term121135, term121135.getClass(), "indexType", null);
        setField(term121135, term121135.getClass(), "referencedType", null);
        setBooleanField(term121135, term121135.getClass(), "visited", false);
        setField(term121135, term121135.getClass(), "docInfo", null);
        setBooleanField(term121135, term121135.getClass(), "unknown", false);
        setBooleanField(term121135, term121135.getClass(), "resolved", false);
        setField(term121135, term121135.getClass(), "resolveResult", null);
        setField(term121135, term121135.getClass(), "registry", null);
        setField(term121130, term121130.getClass(), "typeOfThis", term121135);
        setField(term121130, term121130.getClass(), "source", null);
        setField(term121130, term121130.getClass(), "implementedInterfaces", null);
        setField(term121130, term121130.getClass(), "subTypes", null);
        setField(term121130, term121130.getClass(), "templateTypeName", null);
        setField(term121130, term121130.getClass(), "className", "INTERFACE");
        setField(term121130, term121130.getClass(), "properties", null);
        setField(term121130, term121130.getClass(), "implicitPrototype", null);
        setBooleanField(term121130, term121130.getClass(), "nativeType", false);
        setBooleanField(term121130, term121130.getClass(), "prettyPrint", false);
        setBooleanField(term121130, term121130.getClass(), "visited", false);
        setField(term121130, term121130.getClass(), "docInfo", null);
        setBooleanField(term121130, term121130.getClass(), "unknown", false);
        setBooleanField(term121130, term121130.getClass(), "resolved", false);
        setField(term121130, term121130.getClass(), "resolveResult", null);
        setField(term121130, term121130.getClass(), "registry", null);
        term121111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term121066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term121111, term121111.getClass(), "registry", null);
        setField(term121111, term121111.getClass(), "name", "INTERFACE");
        setField(term121111, term121111.getClass(), "sourceNode", null);
        setField(term121111, term121111.getClass(), "parametersNode", null);
        setField(term121111, term121111.getClass(), "returnType", null);
        setField(term121066, term121066.getClass(), "indexType", null);
        setField(term121066, term121066.getClass(), "referencedType", null);
        setBooleanField(term121066, term121066.getClass(), "visited", false);
        setField(term121066, term121066.getClass(), "docInfo", null);
        setBooleanField(term121066, term121066.getClass(), "unknown", false);
        setBooleanField(term121066, term121066.getClass(), "resolved", false);
        setField(term121066, term121066.getClass(), "resolveResult", null);
        setField(term121066, term121066.getClass(), "registry", null);
        setField(term121111, term121111.getClass(), "typeOfThis", term121066);
        setField(term121111, term121111.getClass(), "templateTypeName", null);
        setBooleanField(term121111, term121111.getClass(), "inferredReturnType", false);
        setBooleanField(term121111, term121111.getClass(), "isConstructor", true);
        setBooleanField(term121111, term121111.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term120357;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term120211, args);
        assertTrue(recursiveEquals(term120211, term121126));
        assertTrue(recursiveEquals(term120357, term121130));
        assertTrue(recursiveEquals(retValue, term121111));
    }

};


