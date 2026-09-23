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

public class FunctionBuilder_copyFromOtherFunction_842235135133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93900;
     Object term94210;
     Object term94561;
     Object term94564;
     Object term94557;

    public FunctionBuilder_copyFromOtherFunction_842235135133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term94008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term93900, term93900.getClass(), "name", "");
        setField(term93900, term93900.getClass(), "sourceNode", term94008);
        setField(term93900, term93900.getClass(), "parametersNode", term94008);
        setField(term93900, term93900.getClass(), "returnType", term94102);
        term94210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term94304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term94414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term94520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term94210, term94210.getClass(), "className", null);
        setField(term94210, term94210.getClass(), "source", null);
        setField(term94304, term94304.getClass(), "parameters", null);
        setField(term94304, term94304.getClass(), "returnType", term94414);
        setField(term94210, term94210.getClass(), "call", term94304);
        setField(term94210, term94210.getClass(), "typeOfThis", term94520);
        term94561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term94562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term94563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term94561, term94561.getClass(), "registry", null);
        setField(term94561, term94561.getClass(), "name", null);
        setField(term94561, term94561.getClass(), "sourceNode", null);
        setField(term94561, term94561.getClass(), "parametersNode", null);
        setField(term94562, term94562.getClass(), "parameterType", null);
        setField(term94562, term94562.getClass(), "referencedType", null);
        setBooleanField(term94562, term94562.getClass(), "visited", false);
        setField(term94562, term94562.getClass(), "docInfo", null);
        setBooleanField(term94562, term94562.getClass(), "unknown", false);
        setBooleanField(term94562, term94562.getClass(), "resolved", false);
        setField(term94562, term94562.getClass(), "resolveResult", null);
        setField(term94562, term94562.getClass(), "registry", null);
        setField(term94561, term94561.getClass(), "returnType", term94562);
        setField(term94563, term94563.getClass(), "referencedType", null);
        setBooleanField(term94563, term94563.getClass(), "visited", false);
        setField(term94563, term94563.getClass(), "docInfo", null);
        setBooleanField(term94563, term94563.getClass(), "unknown", false);
        setBooleanField(term94563, term94563.getClass(), "resolved", false);
        setField(term94563, term94563.getClass(), "resolveResult", null);
        setField(term94563, term94563.getClass(), "registry", null);
        setField(term94561, term94561.getClass(), "typeOfThis", term94563);
        setField(term94561, term94561.getClass(), "templateTypeName", null);
        setBooleanField(term94561, term94561.getClass(), "inferredReturnType", false);
        setBooleanField(term94561, term94561.getClass(), "isConstructor", false);
        setBooleanField(term94561, term94561.getClass(), "isNativeType", false);
        term94564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term94565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term94566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term94567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term94564, term94564.getClass(), "this$0", null);
        setField(term94565, term94565.getClass(), "parameters", null);
        setField(term94566, term94566.getClass(), "parameterType", null);
        setField(term94566, term94566.getClass(), "referencedType", null);
        setBooleanField(term94566, term94566.getClass(), "visited", false);
        setField(term94566, term94566.getClass(), "docInfo", null);
        setBooleanField(term94566, term94566.getClass(), "unknown", false);
        setBooleanField(term94566, term94566.getClass(), "resolved", false);
        setField(term94566, term94566.getClass(), "resolveResult", null);
        setField(term94566, term94566.getClass(), "registry", null);
        setField(term94565, term94565.getClass(), "returnType", term94566);
        setBooleanField(term94565, term94565.getClass(), "returnTypeInferred", false);
        setBooleanField(term94565, term94565.getClass(), "resolved", false);
        setField(term94565, term94565.getClass(), "resolveResult", null);
        setField(term94565, term94565.getClass(), "registry", null);
        setField(term94564, term94564.getClass(), "call", term94565);
        setField(term94564, term94564.getClass(), "prototype", null);
        setField(term94564, term94564.getClass(), "kind", null);
        setField(term94567, term94567.getClass(), "referencedType", null);
        setBooleanField(term94567, term94567.getClass(), "visited", false);
        setField(term94567, term94567.getClass(), "docInfo", null);
        setBooleanField(term94567, term94567.getClass(), "unknown", false);
        setBooleanField(term94567, term94567.getClass(), "resolved", false);
        setField(term94567, term94567.getClass(), "resolveResult", null);
        setField(term94567, term94567.getClass(), "registry", null);
        setField(term94564, term94564.getClass(), "typeOfThis", term94567);
        setField(term94564, term94564.getClass(), "source", null);
        setField(term94564, term94564.getClass(), "implementedInterfaces", null);
        setField(term94564, term94564.getClass(), "subTypes", null);
        setField(term94564, term94564.getClass(), "templateTypeName", null);
        setField(term94564, term94564.getClass(), "className", null);
        setField(term94564, term94564.getClass(), "properties", null);
        setField(term94564, term94564.getClass(), "implicitPrototype", null);
        setBooleanField(term94564, term94564.getClass(), "nativeType", false);
        setBooleanField(term94564, term94564.getClass(), "prettyPrint", false);
        setBooleanField(term94564, term94564.getClass(), "visited", false);
        setField(term94564, term94564.getClass(), "docInfo", null);
        setBooleanField(term94564, term94564.getClass(), "unknown", false);
        setBooleanField(term94564, term94564.getClass(), "resolved", false);
        setField(term94564, term94564.getClass(), "resolveResult", null);
        setField(term94564, term94564.getClass(), "registry", null);
        term94557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term94524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term94530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term94557, term94557.getClass(), "registry", null);
        setField(term94557, term94557.getClass(), "name", null);
        setField(term94557, term94557.getClass(), "sourceNode", null);
        setField(term94557, term94557.getClass(), "parametersNode", null);
        setField(term94524, term94524.getClass(), "parameterType", null);
        setField(term94524, term94524.getClass(), "referencedType", null);
        setBooleanField(term94524, term94524.getClass(), "visited", false);
        setField(term94524, term94524.getClass(), "docInfo", null);
        setBooleanField(term94524, term94524.getClass(), "unknown", false);
        setBooleanField(term94524, term94524.getClass(), "resolved", false);
        setField(term94524, term94524.getClass(), "resolveResult", null);
        setField(term94524, term94524.getClass(), "registry", null);
        setField(term94557, term94557.getClass(), "returnType", term94524);
        setField(term94530, term94530.getClass(), "referencedType", null);
        setBooleanField(term94530, term94530.getClass(), "visited", false);
        setField(term94530, term94530.getClass(), "docInfo", null);
        setBooleanField(term94530, term94530.getClass(), "unknown", false);
        setBooleanField(term94530, term94530.getClass(), "resolved", false);
        setField(term94530, term94530.getClass(), "resolveResult", null);
        setField(term94530, term94530.getClass(), "registry", null);
        setField(term94557, term94557.getClass(), "typeOfThis", term94530);
        setField(term94557, term94557.getClass(), "templateTypeName", null);
        setBooleanField(term94557, term94557.getClass(), "inferredReturnType", false);
        setBooleanField(term94557, term94557.getClass(), "isConstructor", false);
        setBooleanField(term94557, term94557.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term94210;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term93900, args);
        assertTrue(recursiveEquals(term93900, term94561));
        assertTrue(recursiveEquals(term94210, term94564));
        assertTrue(recursiveEquals(retValue, term94557));
    }

};


