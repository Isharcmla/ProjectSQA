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

public class FunctionBuilder_copyFromOtherFunction_842235135171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117994;
     Object term118212;
     Object term118469;
     Object term118471;
     Object term118465;

    public FunctionBuilder_copyFromOtherFunction_842235135171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term118102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117994, term117994.getClass(), "name", "");
        setField(term117994, term117994.getClass(), "sourceNode", null);
        setField(term117994, term117994.getClass(), "parametersNode", term118102);
        setField(term117994, term117994.getClass(), "returnType", null);
        term118212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term118306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term118430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term118212, term118212.getClass(), "className", null);
        setField(term118212, term118212.getClass(), "source", null);
        setField(term118306, term118306.getClass(), "parameters", null);
        setField(term118306, term118306.getClass(), "returnType", null);
        setField(term118212, term118212.getClass(), "call", term118306);
        setField(term118212, term118212.getClass(), "typeOfThis", term118430);
        term118469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term118470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term118469, term118469.getClass(), "registry", null);
        setField(term118469, term118469.getClass(), "name", null);
        setField(term118469, term118469.getClass(), "sourceNode", null);
        setField(term118469, term118469.getClass(), "parametersNode", null);
        setField(term118469, term118469.getClass(), "returnType", null);
        setField(term118470, term118470.getClass(), "typeExpr", null);
        setField(term118470, term118470.getClass(), "sourceName", null);
        setBooleanField(term118470, term118470.getClass(), "forgiving", false);
        setBooleanField(term118470, term118470.getClass(), "isChecked", false);
        setBooleanField(term118470, term118470.getClass(), "visited", false);
        setField(term118470, term118470.getClass(), "docInfo", null);
        setBooleanField(term118470, term118470.getClass(), "unknown", false);
        setBooleanField(term118470, term118470.getClass(), "resolved", false);
        setField(term118470, term118470.getClass(), "resolveResult", null);
        setField(term118470, term118470.getClass(), "registry", null);
        setField(term118469, term118469.getClass(), "typeOfThis", term118470);
        setField(term118469, term118469.getClass(), "templateTypeName", null);
        setBooleanField(term118469, term118469.getClass(), "inferredReturnType", false);
        setBooleanField(term118469, term118469.getClass(), "isConstructor", false);
        setBooleanField(term118469, term118469.getClass(), "isNativeType", false);
        term118471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term118472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term118473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term118472, term118472.getClass(), "parameters", null);
        setField(term118472, term118472.getClass(), "returnType", null);
        setBooleanField(term118472, term118472.getClass(), "returnTypeInferred", false);
        setBooleanField(term118472, term118472.getClass(), "resolved", false);
        setField(term118472, term118472.getClass(), "resolveResult", null);
        setField(term118472, term118472.getClass(), "registry", null);
        setField(term118471, term118471.getClass(), "call", term118472);
        setField(term118471, term118471.getClass(), "prototype", null);
        setField(term118471, term118471.getClass(), "kind", null);
        setField(term118473, term118473.getClass(), "typeExpr", null);
        setField(term118473, term118473.getClass(), "sourceName", null);
        setBooleanField(term118473, term118473.getClass(), "forgiving", false);
        setBooleanField(term118473, term118473.getClass(), "isChecked", false);
        setBooleanField(term118473, term118473.getClass(), "visited", false);
        setField(term118473, term118473.getClass(), "docInfo", null);
        setBooleanField(term118473, term118473.getClass(), "unknown", false);
        setBooleanField(term118473, term118473.getClass(), "resolved", false);
        setField(term118473, term118473.getClass(), "resolveResult", null);
        setField(term118473, term118473.getClass(), "registry", null);
        setField(term118471, term118471.getClass(), "typeOfThis", term118473);
        setField(term118471, term118471.getClass(), "source", null);
        setField(term118471, term118471.getClass(), "implementedInterfaces", null);
        setField(term118471, term118471.getClass(), "subTypes", null);
        setField(term118471, term118471.getClass(), "templateTypeName", null);
        setField(term118471, term118471.getClass(), "className", null);
        setField(term118471, term118471.getClass(), "properties", null);
        setField(term118471, term118471.getClass(), "implicitPrototype", null);
        setBooleanField(term118471, term118471.getClass(), "nativeType", false);
        setBooleanField(term118471, term118471.getClass(), "prettyPrint", false);
        setBooleanField(term118471, term118471.getClass(), "visited", false);
        setField(term118471, term118471.getClass(), "docInfo", null);
        setBooleanField(term118471, term118471.getClass(), "unknown", false);
        setBooleanField(term118471, term118471.getClass(), "resolved", false);
        setField(term118471, term118471.getClass(), "resolveResult", null);
        setField(term118471, term118471.getClass(), "registry", null);
        term118465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term118436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term118465, term118465.getClass(), "registry", null);
        setField(term118465, term118465.getClass(), "name", null);
        setField(term118465, term118465.getClass(), "sourceNode", null);
        setField(term118465, term118465.getClass(), "parametersNode", null);
        setField(term118465, term118465.getClass(), "returnType", null);
        setField(term118436, term118436.getClass(), "typeExpr", null);
        setField(term118436, term118436.getClass(), "sourceName", null);
        setBooleanField(term118436, term118436.getClass(), "forgiving", false);
        setBooleanField(term118436, term118436.getClass(), "isChecked", false);
        setBooleanField(term118436, term118436.getClass(), "visited", false);
        setField(term118436, term118436.getClass(), "docInfo", null);
        setBooleanField(term118436, term118436.getClass(), "unknown", false);
        setBooleanField(term118436, term118436.getClass(), "resolved", false);
        setField(term118436, term118436.getClass(), "resolveResult", null);
        setField(term118436, term118436.getClass(), "registry", null);
        setField(term118465, term118465.getClass(), "typeOfThis", term118436);
        setField(term118465, term118465.getClass(), "templateTypeName", null);
        setBooleanField(term118465, term118465.getClass(), "inferredReturnType", false);
        setBooleanField(term118465, term118465.getClass(), "isConstructor", false);
        setBooleanField(term118465, term118465.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term118212;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term117994, args);
        assertTrue(recursiveEquals(term117994, term118469));
        assertTrue(recursiveEquals(term118212, term118471));
        assertTrue(recursiveEquals(retValue, term118465));
    }

};


