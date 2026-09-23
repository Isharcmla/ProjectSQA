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

public class FunctionBuilder_copyFromOtherFunction_842235135155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106173;
     Object term106283;
     Object term106562;
     Object term106566;
     Object term106556;

    public FunctionBuilder_copyFromOtherFunction_842235135155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term106173, term106173.getClass(), "name", null);
        setField(term106173, term106173.getClass(), "sourceNode", null);
        setField(term106173, term106173.getClass(), "parametersNode", null);
        setField(term106173, term106173.getClass(), "returnType", null);
        term106283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term106415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term106515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106283, term106283.getClass(), "className", "");
        setField(term106283, term106283.getClass(), "source", null);
        setField(term106415, term106415.getClass(), "parameters", null);
        setField(term106415, term106415.getClass(), "returnType", null);
        setField(term106283, term106283.getClass(), "call", term106415);
        setField(term106283, term106283.getClass(), "typeOfThis", term106515);
        term106562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term106565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106562, term106562.getClass(), "registry", null);
        setField(term106562, term106562.getClass(), "name", "");
        setField(term106562, term106562.getClass(), "sourceNode", null);
        setField(term106562, term106562.getClass(), "parametersNode", null);
        setField(term106562, term106562.getClass(), "returnType", null);
        setField(term106565, term106565.getClass(), "call", null);
        setField(term106565, term106565.getClass(), "prototype", null);
        setField(term106565, term106565.getClass(), "kind", null);
        setField(term106565, term106565.getClass(), "typeOfThis", null);
        setField(term106565, term106565.getClass(), "source", null);
        setField(term106565, term106565.getClass(), "implementedInterfaces", null);
        setField(term106565, term106565.getClass(), "subTypes", null);
        setField(term106565, term106565.getClass(), "templateTypeName", null);
        setField(term106565, term106565.getClass(), "className", null);
        setField(term106565, term106565.getClass(), "properties", null);
        setField(term106565, term106565.getClass(), "implicitPrototype", null);
        setBooleanField(term106565, term106565.getClass(), "nativeType", false);
        setBooleanField(term106565, term106565.getClass(), "prettyPrint", false);
        setBooleanField(term106565, term106565.getClass(), "visited", false);
        setField(term106565, term106565.getClass(), "docInfo", null);
        setBooleanField(term106565, term106565.getClass(), "unknown", false);
        setBooleanField(term106565, term106565.getClass(), "resolved", false);
        setField(term106565, term106565.getClass(), "resolveResult", null);
        setField(term106565, term106565.getClass(), "registry", null);
        setField(term106562, term106562.getClass(), "typeOfThis", term106565);
        setField(term106562, term106562.getClass(), "templateTypeName", null);
        setBooleanField(term106562, term106562.getClass(), "inferredReturnType", false);
        setBooleanField(term106562, term106562.getClass(), "isConstructor", false);
        setBooleanField(term106562, term106562.getClass(), "isNativeType", false);
        term106566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term106567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term106568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106567, term106567.getClass(), "parameters", null);
        setField(term106567, term106567.getClass(), "returnType", null);
        setBooleanField(term106567, term106567.getClass(), "returnTypeInferred", false);
        setBooleanField(term106567, term106567.getClass(), "resolved", false);
        setField(term106567, term106567.getClass(), "resolveResult", null);
        setField(term106567, term106567.getClass(), "registry", null);
        setField(term106566, term106566.getClass(), "call", term106567);
        setField(term106566, term106566.getClass(), "prototype", null);
        setField(term106566, term106566.getClass(), "kind", null);
        setField(term106568, term106568.getClass(), "call", null);
        setField(term106568, term106568.getClass(), "prototype", null);
        setField(term106568, term106568.getClass(), "kind", null);
        setField(term106568, term106568.getClass(), "typeOfThis", null);
        setField(term106568, term106568.getClass(), "source", null);
        setField(term106568, term106568.getClass(), "implementedInterfaces", null);
        setField(term106568, term106568.getClass(), "subTypes", null);
        setField(term106568, term106568.getClass(), "templateTypeName", null);
        setField(term106568, term106568.getClass(), "className", null);
        setField(term106568, term106568.getClass(), "properties", null);
        setField(term106568, term106568.getClass(), "implicitPrototype", null);
        setBooleanField(term106568, term106568.getClass(), "nativeType", false);
        setBooleanField(term106568, term106568.getClass(), "prettyPrint", false);
        setBooleanField(term106568, term106568.getClass(), "visited", false);
        setField(term106568, term106568.getClass(), "docInfo", null);
        setBooleanField(term106568, term106568.getClass(), "unknown", false);
        setBooleanField(term106568, term106568.getClass(), "resolved", false);
        setField(term106568, term106568.getClass(), "resolveResult", null);
        setField(term106568, term106568.getClass(), "registry", null);
        setField(term106566, term106566.getClass(), "typeOfThis", term106568);
        setField(term106566, term106566.getClass(), "source", null);
        setField(term106566, term106566.getClass(), "implementedInterfaces", null);
        setField(term106566, term106566.getClass(), "subTypes", null);
        setField(term106566, term106566.getClass(), "templateTypeName", null);
        setField(term106566, term106566.getClass(), "className", "");
        setField(term106566, term106566.getClass(), "properties", null);
        setField(term106566, term106566.getClass(), "implicitPrototype", null);
        setBooleanField(term106566, term106566.getClass(), "nativeType", false);
        setBooleanField(term106566, term106566.getClass(), "prettyPrint", false);
        setBooleanField(term106566, term106566.getClass(), "visited", false);
        setField(term106566, term106566.getClass(), "docInfo", null);
        setBooleanField(term106566, term106566.getClass(), "unknown", false);
        setBooleanField(term106566, term106566.getClass(), "resolved", false);
        setField(term106566, term106566.getClass(), "resolveResult", null);
        setField(term106566, term106566.getClass(), "registry", null);
        term106556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term106523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106556, term106556.getClass(), "registry", null);
        setField(term106556, term106556.getClass(), "name", "");
        setField(term106556, term106556.getClass(), "sourceNode", null);
        setField(term106556, term106556.getClass(), "parametersNode", null);
        setField(term106556, term106556.getClass(), "returnType", null);
        setField(term106523, term106523.getClass(), "call", null);
        setField(term106523, term106523.getClass(), "prototype", null);
        setField(term106523, term106523.getClass(), "kind", null);
        setField(term106523, term106523.getClass(), "typeOfThis", null);
        setField(term106523, term106523.getClass(), "source", null);
        setField(term106523, term106523.getClass(), "implementedInterfaces", null);
        setField(term106523, term106523.getClass(), "subTypes", null);
        setField(term106523, term106523.getClass(), "templateTypeName", null);
        setField(term106523, term106523.getClass(), "className", null);
        setField(term106523, term106523.getClass(), "properties", null);
        setField(term106523, term106523.getClass(), "implicitPrototype", null);
        setBooleanField(term106523, term106523.getClass(), "nativeType", false);
        setBooleanField(term106523, term106523.getClass(), "prettyPrint", false);
        setBooleanField(term106523, term106523.getClass(), "visited", false);
        setField(term106523, term106523.getClass(), "docInfo", null);
        setBooleanField(term106523, term106523.getClass(), "unknown", false);
        setBooleanField(term106523, term106523.getClass(), "resolved", false);
        setField(term106523, term106523.getClass(), "resolveResult", null);
        setField(term106523, term106523.getClass(), "registry", null);
        setField(term106556, term106556.getClass(), "typeOfThis", term106523);
        setField(term106556, term106556.getClass(), "templateTypeName", null);
        setBooleanField(term106556, term106556.getClass(), "inferredReturnType", false);
        setBooleanField(term106556, term106556.getClass(), "isConstructor", false);
        setBooleanField(term106556, term106556.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term106283;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term106173, args);
        assertTrue(recursiveEquals(term106173, term106562));
        assertTrue(recursiveEquals(term106283, term106566));
        assertTrue(recursiveEquals(retValue, term106556));
    }

};


