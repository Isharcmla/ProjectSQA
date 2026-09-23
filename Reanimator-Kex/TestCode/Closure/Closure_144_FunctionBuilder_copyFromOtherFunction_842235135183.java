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

public class FunctionBuilder_copyFromOtherFunction_842235135183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124912;
     Object term125228;
     Object term125902;
     Object term125912;
     Object term125896;

    public FunctionBuilder_copyFromOtherFunction_842235135183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term125020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term124912, term124912.getClass(), "name", "");
        setField(term124912, term124912.getClass(), "sourceNode", term125020);
        setField(term124912, term124912.getClass(), "parametersNode", null);
        setField(term124912, term124912.getClass(), "returnType", null);
        setField(term124912, term124912.getClass(), "typeOfThis", term125118);
        setField(term124912, term124912.getClass(), "templateTypeName", null);
        Class<? extends Object> term125920 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term125919 = ((Class) term125920).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term125919).setAccessible(true);
        Object enum178 = ((Field) term125919).get((Object) null);
        term125228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term125322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term125228, term125228.getClass(), "className", null);
        setField(term125228, term125228.getClass(), "source", null);
        setField(term125322, term125322.getClass(), "parameters", null);
        setField(term125322, term125322.getClass(), "returnType", null);
        setField(term125228, term125228.getClass(), "call", term125322);
        setField(term125228, term125228.getClass(), "typeOfThis", term125228);
        setField(term125228, term125228.getClass(), "templateTypeName", "");
        setField(term125228, term125228.getClass(), "kind", enum178);
        Class<? extends Object> term126220 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126219 = ((Class) term126220).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term126219).setAccessible(true);
        Object enum179 = ((Field) term126219).get((Object) null);
        term125902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term125903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term125904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term125902, term125902.getClass(), "registry", null);
        setField(term125902, term125902.getClass(), "name", null);
        setField(term125902, term125902.getClass(), "sourceNode", null);
        setField(term125902, term125902.getClass(), "parametersNode", null);
        setField(term125902, term125902.getClass(), "returnType", null);
        setField(term125904, term125904.getClass(), "parameters", null);
        setField(term125904, term125904.getClass(), "returnType", null);
        setBooleanField(term125904, term125904.getClass(), "returnTypeInferred", false);
        setBooleanField(term125904, term125904.getClass(), "resolved", false);
        setField(term125904, term125904.getClass(), "resolveResult", null);
        setField(term125904, term125904.getClass(), "registry", null);
        setField(term125903, term125903.getClass(), "call", term125904);
        setField(term125903, term125903.getClass(), "prototype", null);
        setField(term125903, term125903.getClass(), "kind", enum179);
        setField(term125903, term125903.getClass(), "typeOfThis", term125903);
        setField(term125903, term125903.getClass(), "source", null);
        setField(term125903, term125903.getClass(), "implementedInterfaces", null);
        setField(term125903, term125903.getClass(), "subTypes", null);
        setField(term125903, term125903.getClass(), "templateTypeName", "");
        setField(term125903, term125903.getClass(), "className", null);
        setField(term125903, term125903.getClass(), "properties", null);
        setField(term125903, term125903.getClass(), "implicitPrototype", null);
        setBooleanField(term125903, term125903.getClass(), "nativeType", false);
        setBooleanField(term125903, term125903.getClass(), "prettyPrint", false);
        setBooleanField(term125903, term125903.getClass(), "visited", false);
        setField(term125903, term125903.getClass(), "docInfo", null);
        setBooleanField(term125903, term125903.getClass(), "unknown", false);
        setBooleanField(term125903, term125903.getClass(), "resolved", false);
        setField(term125903, term125903.getClass(), "resolveResult", null);
        setField(term125903, term125903.getClass(), "registry", null);
        setField(term125902, term125902.getClass(), "typeOfThis", term125903);
        setField(term125902, term125902.getClass(), "templateTypeName", "");
        setBooleanField(term125902, term125902.getClass(), "inferredReturnType", false);
        setBooleanField(term125902, term125902.getClass(), "isConstructor", true);
        setBooleanField(term125902, term125902.getClass(), "isNativeType", false);
        Class<? extends Object> term126520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126519 = ((Class) term126520).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term126519).setAccessible(true);
        Object enum180 = ((Field) term126519).get((Object) null);
        term125912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term125913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term125913, term125913.getClass(), "parameters", null);
        setField(term125913, term125913.getClass(), "returnType", null);
        setBooleanField(term125913, term125913.getClass(), "returnTypeInferred", false);
        setBooleanField(term125913, term125913.getClass(), "resolved", false);
        setField(term125913, term125913.getClass(), "resolveResult", null);
        setField(term125913, term125913.getClass(), "registry", null);
        setField(term125912, term125912.getClass(), "call", term125913);
        setField(term125912, term125912.getClass(), "prototype", null);
        setField(term125912, term125912.getClass(), "kind", enum180);
        setField(term125912, term125912.getClass(), "typeOfThis", term125912);
        setField(term125912, term125912.getClass(), "source", null);
        setField(term125912, term125912.getClass(), "implementedInterfaces", null);
        setField(term125912, term125912.getClass(), "subTypes", null);
        setField(term125912, term125912.getClass(), "templateTypeName", "");
        setField(term125912, term125912.getClass(), "className", null);
        setField(term125912, term125912.getClass(), "properties", null);
        setField(term125912, term125912.getClass(), "implicitPrototype", null);
        setBooleanField(term125912, term125912.getClass(), "nativeType", false);
        setBooleanField(term125912, term125912.getClass(), "prettyPrint", false);
        setBooleanField(term125912, term125912.getClass(), "visited", false);
        setField(term125912, term125912.getClass(), "docInfo", null);
        setBooleanField(term125912, term125912.getClass(), "unknown", false);
        setBooleanField(term125912, term125912.getClass(), "resolved", false);
        setField(term125912, term125912.getClass(), "resolveResult", null);
        setField(term125912, term125912.getClass(), "registry", null);
        Class<? extends Object> term126820 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126819 = ((Class) term126820).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term126819).setAccessible(true);
        Object enum181 = ((Field) term126819).get((Object) null);
        term125896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term125810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term125811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term125896, term125896.getClass(), "registry", null);
        setField(term125896, term125896.getClass(), "name", null);
        setField(term125896, term125896.getClass(), "sourceNode", null);
        setField(term125896, term125896.getClass(), "parametersNode", null);
        setField(term125896, term125896.getClass(), "returnType", null);
        setField(term125811, term125811.getClass(), "parameters", null);
        setField(term125811, term125811.getClass(), "returnType", null);
        setBooleanField(term125811, term125811.getClass(), "returnTypeInferred", false);
        setBooleanField(term125811, term125811.getClass(), "resolved", false);
        setField(term125811, term125811.getClass(), "resolveResult", null);
        setField(term125811, term125811.getClass(), "registry", null);
        setField(term125810, term125810.getClass(), "call", term125811);
        setField(term125810, term125810.getClass(), "prototype", null);
        setField(term125810, term125810.getClass(), "kind", enum181);
        setField(term125810, term125810.getClass(), "typeOfThis", term125810);
        setField(term125810, term125810.getClass(), "source", null);
        setField(term125810, term125810.getClass(), "implementedInterfaces", null);
        setField(term125810, term125810.getClass(), "subTypes", null);
        setField(term125810, term125810.getClass(), "templateTypeName", "");
        setField(term125810, term125810.getClass(), "className", null);
        setField(term125810, term125810.getClass(), "properties", null);
        setField(term125810, term125810.getClass(), "implicitPrototype", null);
        setBooleanField(term125810, term125810.getClass(), "nativeType", false);
        setBooleanField(term125810, term125810.getClass(), "prettyPrint", false);
        setBooleanField(term125810, term125810.getClass(), "visited", false);
        setField(term125810, term125810.getClass(), "docInfo", null);
        setBooleanField(term125810, term125810.getClass(), "unknown", false);
        setBooleanField(term125810, term125810.getClass(), "resolved", false);
        setField(term125810, term125810.getClass(), "resolveResult", null);
        setField(term125810, term125810.getClass(), "registry", null);
        setField(term125896, term125896.getClass(), "typeOfThis", term125810);
        setField(term125896, term125896.getClass(), "templateTypeName", "");
        setBooleanField(term125896, term125896.getClass(), "inferredReturnType", false);
        setBooleanField(term125896, term125896.getClass(), "isConstructor", true);
        setBooleanField(term125896, term125896.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term125228;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term124912, args);
        assertTrue(recursiveEquals(term124912, term125902));
        assertTrue(recursiveEquals(term125228, term125912));
        assertTrue(recursiveEquals(retValue, term125896));
    }

};


