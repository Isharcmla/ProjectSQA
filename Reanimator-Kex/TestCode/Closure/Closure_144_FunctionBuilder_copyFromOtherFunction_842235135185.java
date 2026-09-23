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

public class FunctionBuilder_copyFromOtherFunction_842235135185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127424;
     Object term127588;
     Object term128383;
     Object term128386;
     Object term128379;

    public FunctionBuilder_copyFromOtherFunction_842235135185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term127424, term127424.getClass(), "name", "");
        setField(term127424, term127424.getClass(), "sourceNode", null);
        setField(term127424, term127424.getClass(), "parametersNode", null);
        setField(term127424, term127424.getClass(), "returnType", null);
        setField(term127424, term127424.getClass(), "typeOfThis", null);
        setField(term127424, term127424.getClass(), "templateTypeName", "");
        Class<? extends Object> term128394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term128393 = ((Class) term128394).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term128393).setAccessible(true);
        Object enum183 = ((Field) term128393).get((Object) null);
        term127588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term127658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term127876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term127588, term127588.getClass(), "source", term127658);
        setField(term127752, term127752.getClass(), "parameters", null);
        setField(term127752, term127752.getClass(), "returnType", null);
        setField(term127588, term127588.getClass(), "call", term127752);
        setField(term127588, term127588.getClass(), "typeOfThis", term127876);
        setField(term127588, term127588.getClass(), "templateTypeName", null);
        setField(term127588, term127588.getClass(), "kind", enum183);
        term128383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term128384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term128383, term128383.getClass(), "registry", null);
        setField(term128383, term128383.getClass(), "name", null);
        setIntField(term128384, term128384.getClass(), "type", 0);
        setField(term128384, term128384.getClass(), "next", null);
        setField(term128384, term128384.getClass(), "first", null);
        setField(term128384, term128384.getClass(), "last", null);
        setField(term128384, term128384.getClass(), "propListHead", null);
        setIntField(term128384, term128384.getClass(), "sourcePosition", 0);
        setField(term128384, term128384.getClass(), "jsType", null);
        setField(term128384, term128384.getClass(), "parent", null);
        setField(term128383, term128383.getClass(), "sourceNode", term128384);
        setField(term128383, term128383.getClass(), "parametersNode", null);
        setField(term128383, term128383.getClass(), "returnType", null);
        setField(term128385, term128385.getClass(), "typeExpr", null);
        setField(term128385, term128385.getClass(), "sourceName", null);
        setBooleanField(term128385, term128385.getClass(), "forgiving", false);
        setBooleanField(term128385, term128385.getClass(), "isChecked", false);
        setBooleanField(term128385, term128385.getClass(), "visited", false);
        setField(term128385, term128385.getClass(), "docInfo", null);
        setBooleanField(term128385, term128385.getClass(), "unknown", false);
        setBooleanField(term128385, term128385.getClass(), "resolved", false);
        setField(term128385, term128385.getClass(), "resolveResult", null);
        setField(term128385, term128385.getClass(), "registry", null);
        setField(term128383, term128383.getClass(), "typeOfThis", term128385);
        setField(term128383, term128383.getClass(), "templateTypeName", null);
        setBooleanField(term128383, term128383.getClass(), "inferredReturnType", false);
        setBooleanField(term128383, term128383.getClass(), "isConstructor", true);
        setBooleanField(term128383, term128383.getClass(), "isNativeType", false);
        Class<? extends Object> term128694 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term128693 = ((Class) term128694).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term128693).setAccessible(true);
        Object enum184 = ((Field) term128693).get((Object) null);
        term128386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term128387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term128391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term128392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128386, term128386.getClass(), "leastSupertypeVisitor", null);
        setField(term128386, term128386.getClass(), "greatestSubtypeVisitor", null);
        setField(term128387, term128387.getClass(), "parameters", null);
        setField(term128387, term128387.getClass(), "returnType", null);
        setBooleanField(term128387, term128387.getClass(), "returnTypeInferred", false);
        setBooleanField(term128387, term128387.getClass(), "resolved", false);
        setField(term128387, term128387.getClass(), "resolveResult", null);
        setField(term128387, term128387.getClass(), "registry", null);
        setField(term128386, term128386.getClass(), "call", term128387);
        setField(term128386, term128386.getClass(), "prototype", null);
        setField(term128386, term128386.getClass(), "kind", enum184);
        setField(term128391, term128391.getClass(), "typeExpr", null);
        setField(term128391, term128391.getClass(), "sourceName", null);
        setBooleanField(term128391, term128391.getClass(), "forgiving", false);
        setBooleanField(term128391, term128391.getClass(), "isChecked", false);
        setBooleanField(term128391, term128391.getClass(), "visited", false);
        setField(term128391, term128391.getClass(), "docInfo", null);
        setBooleanField(term128391, term128391.getClass(), "unknown", false);
        setBooleanField(term128391, term128391.getClass(), "resolved", false);
        setField(term128391, term128391.getClass(), "resolveResult", null);
        setField(term128391, term128391.getClass(), "registry", null);
        setField(term128386, term128386.getClass(), "typeOfThis", term128391);
        setIntField(term128392, term128392.getClass(), "type", 0);
        setField(term128392, term128392.getClass(), "next", null);
        setField(term128392, term128392.getClass(), "first", null);
        setField(term128392, term128392.getClass(), "last", null);
        setField(term128392, term128392.getClass(), "propListHead", null);
        setIntField(term128392, term128392.getClass(), "sourcePosition", 0);
        setField(term128392, term128392.getClass(), "jsType", null);
        setField(term128392, term128392.getClass(), "parent", null);
        setField(term128386, term128386.getClass(), "source", term128392);
        setField(term128386, term128386.getClass(), "implementedInterfaces", null);
        setField(term128386, term128386.getClass(), "subTypes", null);
        setField(term128386, term128386.getClass(), "templateTypeName", null);
        setField(term128386, term128386.getClass(), "className", null);
        setField(term128386, term128386.getClass(), "properties", null);
        setField(term128386, term128386.getClass(), "implicitPrototype", null);
        setBooleanField(term128386, term128386.getClass(), "nativeType", false);
        setBooleanField(term128386, term128386.getClass(), "prettyPrint", false);
        setBooleanField(term128386, term128386.getClass(), "visited", false);
        setField(term128386, term128386.getClass(), "docInfo", null);
        setBooleanField(term128386, term128386.getClass(), "unknown", false);
        setBooleanField(term128386, term128386.getClass(), "resolved", false);
        setField(term128386, term128386.getClass(), "resolveResult", null);
        setField(term128386, term128386.getClass(), "registry", null);
        term128379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term128350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term128379, term128379.getClass(), "registry", null);
        setField(term128379, term128379.getClass(), "name", null);
        setIntField(term128350, term128350.getClass(), "type", 0);
        setField(term128350, term128350.getClass(), "next", null);
        setField(term128350, term128350.getClass(), "first", null);
        setField(term128350, term128350.getClass(), "last", null);
        setField(term128350, term128350.getClass(), "propListHead", null);
        setIntField(term128350, term128350.getClass(), "sourcePosition", 0);
        setField(term128350, term128350.getClass(), "jsType", null);
        setField(term128350, term128350.getClass(), "parent", null);
        setField(term128379, term128379.getClass(), "sourceNode", term128350);
        setField(term128379, term128379.getClass(), "parametersNode", null);
        setField(term128379, term128379.getClass(), "returnType", null);
        setField(term128344, term128344.getClass(), "typeExpr", null);
        setField(term128344, term128344.getClass(), "sourceName", null);
        setBooleanField(term128344, term128344.getClass(), "forgiving", false);
        setBooleanField(term128344, term128344.getClass(), "isChecked", false);
        setBooleanField(term128344, term128344.getClass(), "visited", false);
        setField(term128344, term128344.getClass(), "docInfo", null);
        setBooleanField(term128344, term128344.getClass(), "unknown", false);
        setBooleanField(term128344, term128344.getClass(), "resolved", false);
        setField(term128344, term128344.getClass(), "resolveResult", null);
        setField(term128344, term128344.getClass(), "registry", null);
        setField(term128379, term128379.getClass(), "typeOfThis", term128344);
        setField(term128379, term128379.getClass(), "templateTypeName", null);
        setBooleanField(term128379, term128379.getClass(), "inferredReturnType", false);
        setBooleanField(term128379, term128379.getClass(), "isConstructor", true);
        setBooleanField(term128379, term128379.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term127588;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term127424, args);
        assertTrue(recursiveEquals(term127424, term128383));
        assertTrue(recursiveEquals(term127588, term128386));
        assertTrue(recursiveEquals(retValue, term128379));
    }

};


