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

public class FunctionBuilder_copyFromOtherFunction_842235135101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73621;
     Object term73837;
     Object term74069;
     Object term74071;
     Object term74065;

    public FunctionBuilder_copyFromOtherFunction_842235135101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term73729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73621, term73621.getClass(), "name", "");
        setField(term73621, term73621.getClass(), "sourceNode", null);
        setField(term73621, term73621.getClass(), "parametersNode", term73729);
        setField(term73621, term73621.getClass(), "returnType", null);
        term73837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term73931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term74027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term73837, term73837.getClass(), "className", null);
        setField(term73837, term73837.getClass(), "source", null);
        setField(term73931, term73931.getClass(), "parameters", null);
        setField(term73931, term73931.getClass(), "returnType", null);
        setField(term73837, term73837.getClass(), "call", term73931);
        setField(term73837, term73837.getClass(), "typeOfThis", term74027);
        term74069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term74070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term74069, term74069.getClass(), "registry", null);
        setField(term74069, term74069.getClass(), "name", null);
        setField(term74069, term74069.getClass(), "sourceNode", null);
        setField(term74069, term74069.getClass(), "parametersNode", null);
        setField(term74069, term74069.getClass(), "returnType", null);
        setField(term74070, term74070.getClass(), "properties", null);
        setBooleanField(term74070, term74070.getClass(), "isFrozen", false);
        setField(term74070, term74070.getClass(), "className", null);
        setField(term74070, term74070.getClass(), "implicitPrototype", null);
        setBooleanField(term74070, term74070.getClass(), "nativeType", false);
        setBooleanField(term74070, term74070.getClass(), "prettyPrint", false);
        setBooleanField(term74070, term74070.getClass(), "visited", false);
        setField(term74070, term74070.getClass(), "docInfo", null);
        setBooleanField(term74070, term74070.getClass(), "unknown", false);
        setBooleanField(term74070, term74070.getClass(), "resolved", false);
        setField(term74070, term74070.getClass(), "resolveResult", null);
        setField(term74070, term74070.getClass(), "registry", null);
        setField(term74069, term74069.getClass(), "typeOfThis", term74070);
        setField(term74069, term74069.getClass(), "templateTypeName", null);
        setBooleanField(term74069, term74069.getClass(), "inferredReturnType", false);
        setBooleanField(term74069, term74069.getClass(), "isConstructor", false);
        setBooleanField(term74069, term74069.getClass(), "isNativeType", false);
        term74071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term74072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term74073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term74071, term74071.getClass(), "this$0", null);
        setField(term74072, term74072.getClass(), "parameters", null);
        setField(term74072, term74072.getClass(), "returnType", null);
        setBooleanField(term74072, term74072.getClass(), "returnTypeInferred", false);
        setBooleanField(term74072, term74072.getClass(), "resolved", false);
        setField(term74072, term74072.getClass(), "resolveResult", null);
        setField(term74072, term74072.getClass(), "registry", null);
        setField(term74071, term74071.getClass(), "call", term74072);
        setField(term74071, term74071.getClass(), "prototype", null);
        setField(term74071, term74071.getClass(), "kind", null);
        setField(term74073, term74073.getClass(), "properties", null);
        setBooleanField(term74073, term74073.getClass(), "isFrozen", false);
        setField(term74073, term74073.getClass(), "className", null);
        setField(term74073, term74073.getClass(), "implicitPrototype", null);
        setBooleanField(term74073, term74073.getClass(), "nativeType", false);
        setBooleanField(term74073, term74073.getClass(), "prettyPrint", false);
        setBooleanField(term74073, term74073.getClass(), "visited", false);
        setField(term74073, term74073.getClass(), "docInfo", null);
        setBooleanField(term74073, term74073.getClass(), "unknown", false);
        setBooleanField(term74073, term74073.getClass(), "resolved", false);
        setField(term74073, term74073.getClass(), "resolveResult", null);
        setField(term74073, term74073.getClass(), "registry", null);
        setField(term74071, term74071.getClass(), "typeOfThis", term74073);
        setField(term74071, term74071.getClass(), "source", null);
        setField(term74071, term74071.getClass(), "implementedInterfaces", null);
        setField(term74071, term74071.getClass(), "subTypes", null);
        setField(term74071, term74071.getClass(), "templateTypeName", null);
        setField(term74071, term74071.getClass(), "className", null);
        setField(term74071, term74071.getClass(), "properties", null);
        setField(term74071, term74071.getClass(), "implicitPrototype", null);
        setBooleanField(term74071, term74071.getClass(), "nativeType", false);
        setBooleanField(term74071, term74071.getClass(), "prettyPrint", false);
        setBooleanField(term74071, term74071.getClass(), "visited", false);
        setField(term74071, term74071.getClass(), "docInfo", null);
        setBooleanField(term74071, term74071.getClass(), "unknown", false);
        setBooleanField(term74071, term74071.getClass(), "resolved", false);
        setField(term74071, term74071.getClass(), "resolveResult", null);
        setField(term74071, term74071.getClass(), "registry", null);
        term74065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term74033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term74065, term74065.getClass(), "registry", null);
        setField(term74065, term74065.getClass(), "name", null);
        setField(term74065, term74065.getClass(), "sourceNode", null);
        setField(term74065, term74065.getClass(), "parametersNode", null);
        setField(term74065, term74065.getClass(), "returnType", null);
        setField(term74033, term74033.getClass(), "properties", null);
        setBooleanField(term74033, term74033.getClass(), "isFrozen", false);
        setField(term74033, term74033.getClass(), "className", null);
        setField(term74033, term74033.getClass(), "implicitPrototype", null);
        setBooleanField(term74033, term74033.getClass(), "nativeType", false);
        setBooleanField(term74033, term74033.getClass(), "prettyPrint", false);
        setBooleanField(term74033, term74033.getClass(), "visited", false);
        setField(term74033, term74033.getClass(), "docInfo", null);
        setBooleanField(term74033, term74033.getClass(), "unknown", false);
        setBooleanField(term74033, term74033.getClass(), "resolved", false);
        setField(term74033, term74033.getClass(), "resolveResult", null);
        setField(term74033, term74033.getClass(), "registry", null);
        setField(term74065, term74065.getClass(), "typeOfThis", term74033);
        setField(term74065, term74065.getClass(), "templateTypeName", null);
        setBooleanField(term74065, term74065.getClass(), "inferredReturnType", false);
        setBooleanField(term74065, term74065.getClass(), "isConstructor", false);
        setBooleanField(term74065, term74065.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term73837;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term73621, args);
        assertTrue(recursiveEquals(term73621, term74069));
        assertTrue(recursiveEquals(term73837, term74071));
        assertTrue(recursiveEquals(retValue, term74065));
    }

};


