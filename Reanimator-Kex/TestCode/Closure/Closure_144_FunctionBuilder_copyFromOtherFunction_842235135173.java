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

public class FunctionBuilder_copyFromOtherFunction_842235135173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118613;
     Object term118831;
     Object term119072;
     Object term119074;
     Object term119068;

    public FunctionBuilder_copyFromOtherFunction_842235135173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term118721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term118613, term118613.getClass(), "name", "");
        setField(term118613, term118613.getClass(), "sourceNode", null);
        setField(term118613, term118613.getClass(), "parametersNode", term118721);
        setField(term118613, term118613.getClass(), "returnType", null);
        term118831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term118925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term119033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term118831, term118831.getClass(), "className", null);
        setField(term118831, term118831.getClass(), "source", null);
        setField(term118925, term118925.getClass(), "parameters", null);
        setField(term118925, term118925.getClass(), "returnType", null);
        setField(term118831, term118831.getClass(), "call", term118925);
        setField(term118831, term118831.getClass(), "typeOfThis", term119033);
        term119072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term119073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term119072, term119072.getClass(), "registry", null);
        setField(term119072, term119072.getClass(), "name", null);
        setField(term119072, term119072.getClass(), "sourceNode", null);
        setField(term119072, term119072.getClass(), "parametersNode", null);
        setField(term119072, term119072.getClass(), "returnType", null);
        setField(term119073, term119073.getClass(), "this$0", null);
        setField(term119073, term119073.getClass(), "call", null);
        setField(term119073, term119073.getClass(), "prototype", null);
        setField(term119073, term119073.getClass(), "kind", null);
        setField(term119073, term119073.getClass(), "typeOfThis", null);
        setField(term119073, term119073.getClass(), "source", null);
        setField(term119073, term119073.getClass(), "implementedInterfaces", null);
        setField(term119073, term119073.getClass(), "subTypes", null);
        setField(term119073, term119073.getClass(), "templateTypeName", null);
        setField(term119073, term119073.getClass(), "className", null);
        setField(term119073, term119073.getClass(), "properties", null);
        setField(term119073, term119073.getClass(), "implicitPrototype", null);
        setBooleanField(term119073, term119073.getClass(), "nativeType", false);
        setBooleanField(term119073, term119073.getClass(), "prettyPrint", false);
        setBooleanField(term119073, term119073.getClass(), "visited", false);
        setField(term119073, term119073.getClass(), "docInfo", null);
        setBooleanField(term119073, term119073.getClass(), "unknown", false);
        setBooleanField(term119073, term119073.getClass(), "resolved", false);
        setField(term119073, term119073.getClass(), "resolveResult", null);
        setField(term119073, term119073.getClass(), "registry", null);
        setField(term119072, term119072.getClass(), "typeOfThis", term119073);
        setField(term119072, term119072.getClass(), "templateTypeName", null);
        setBooleanField(term119072, term119072.getClass(), "inferredReturnType", false);
        setBooleanField(term119072, term119072.getClass(), "isConstructor", false);
        setBooleanField(term119072, term119072.getClass(), "isNativeType", false);
        term119074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term119075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term119076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term119075, term119075.getClass(), "parameters", null);
        setField(term119075, term119075.getClass(), "returnType", null);
        setBooleanField(term119075, term119075.getClass(), "returnTypeInferred", false);
        setBooleanField(term119075, term119075.getClass(), "resolved", false);
        setField(term119075, term119075.getClass(), "resolveResult", null);
        setField(term119075, term119075.getClass(), "registry", null);
        setField(term119074, term119074.getClass(), "call", term119075);
        setField(term119074, term119074.getClass(), "prototype", null);
        setField(term119074, term119074.getClass(), "kind", null);
        setField(term119076, term119076.getClass(), "this$0", null);
        setField(term119076, term119076.getClass(), "call", null);
        setField(term119076, term119076.getClass(), "prototype", null);
        setField(term119076, term119076.getClass(), "kind", null);
        setField(term119076, term119076.getClass(), "typeOfThis", null);
        setField(term119076, term119076.getClass(), "source", null);
        setField(term119076, term119076.getClass(), "implementedInterfaces", null);
        setField(term119076, term119076.getClass(), "subTypes", null);
        setField(term119076, term119076.getClass(), "templateTypeName", null);
        setField(term119076, term119076.getClass(), "className", null);
        setField(term119076, term119076.getClass(), "properties", null);
        setField(term119076, term119076.getClass(), "implicitPrototype", null);
        setBooleanField(term119076, term119076.getClass(), "nativeType", false);
        setBooleanField(term119076, term119076.getClass(), "prettyPrint", false);
        setBooleanField(term119076, term119076.getClass(), "visited", false);
        setField(term119076, term119076.getClass(), "docInfo", null);
        setBooleanField(term119076, term119076.getClass(), "unknown", false);
        setBooleanField(term119076, term119076.getClass(), "resolved", false);
        setField(term119076, term119076.getClass(), "resolveResult", null);
        setField(term119076, term119076.getClass(), "registry", null);
        setField(term119074, term119074.getClass(), "typeOfThis", term119076);
        setField(term119074, term119074.getClass(), "source", null);
        setField(term119074, term119074.getClass(), "implementedInterfaces", null);
        setField(term119074, term119074.getClass(), "subTypes", null);
        setField(term119074, term119074.getClass(), "templateTypeName", null);
        setField(term119074, term119074.getClass(), "className", null);
        setField(term119074, term119074.getClass(), "properties", null);
        setField(term119074, term119074.getClass(), "implicitPrototype", null);
        setBooleanField(term119074, term119074.getClass(), "nativeType", false);
        setBooleanField(term119074, term119074.getClass(), "prettyPrint", false);
        setBooleanField(term119074, term119074.getClass(), "visited", false);
        setField(term119074, term119074.getClass(), "docInfo", null);
        setBooleanField(term119074, term119074.getClass(), "unknown", false);
        setBooleanField(term119074, term119074.getClass(), "resolved", false);
        setField(term119074, term119074.getClass(), "resolveResult", null);
        setField(term119074, term119074.getClass(), "registry", null);
        term119068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term119039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term119068, term119068.getClass(), "registry", null);
        setField(term119068, term119068.getClass(), "name", null);
        setField(term119068, term119068.getClass(), "sourceNode", null);
        setField(term119068, term119068.getClass(), "parametersNode", null);
        setField(term119068, term119068.getClass(), "returnType", null);
        setField(term119039, term119039.getClass(), "this$0", null);
        setField(term119039, term119039.getClass(), "call", null);
        setField(term119039, term119039.getClass(), "prototype", null);
        setField(term119039, term119039.getClass(), "kind", null);
        setField(term119039, term119039.getClass(), "typeOfThis", null);
        setField(term119039, term119039.getClass(), "source", null);
        setField(term119039, term119039.getClass(), "implementedInterfaces", null);
        setField(term119039, term119039.getClass(), "subTypes", null);
        setField(term119039, term119039.getClass(), "templateTypeName", null);
        setField(term119039, term119039.getClass(), "className", null);
        setField(term119039, term119039.getClass(), "properties", null);
        setField(term119039, term119039.getClass(), "implicitPrototype", null);
        setBooleanField(term119039, term119039.getClass(), "nativeType", false);
        setBooleanField(term119039, term119039.getClass(), "prettyPrint", false);
        setBooleanField(term119039, term119039.getClass(), "visited", false);
        setField(term119039, term119039.getClass(), "docInfo", null);
        setBooleanField(term119039, term119039.getClass(), "unknown", false);
        setBooleanField(term119039, term119039.getClass(), "resolved", false);
        setField(term119039, term119039.getClass(), "resolveResult", null);
        setField(term119039, term119039.getClass(), "registry", null);
        setField(term119068, term119068.getClass(), "typeOfThis", term119039);
        setField(term119068, term119068.getClass(), "templateTypeName", null);
        setBooleanField(term119068, term119068.getClass(), "inferredReturnType", false);
        setBooleanField(term119068, term119068.getClass(), "isConstructor", false);
        setBooleanField(term119068, term119068.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term118831;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term118613, args);
        assertTrue(recursiveEquals(term118613, term119072));
        assertTrue(recursiveEquals(term118831, term119074));
        assertTrue(recursiveEquals(retValue, term119068));
    }

};


