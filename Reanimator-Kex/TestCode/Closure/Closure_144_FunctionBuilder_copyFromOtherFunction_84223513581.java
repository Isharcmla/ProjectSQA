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

public class FunctionBuilder_copyFromOtherFunction_84223513581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61441;
     Object term61541;
     Object term62241;
     Object term62243;
     Object term62237;

    public FunctionBuilder_copyFromOtherFunction_84223513581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term61441, term61441.getClass(), "name", null);
        setField(term61441, term61441.getClass(), "sourceNode", null);
        setField(term61441, term61441.getClass(), "parametersNode", null);
        setField(term61441, term61441.getClass(), "returnType", null);
        setField(term61441, term61441.getClass(), "typeOfThis", null);
        setField(term61441, term61441.getClass(), "templateTypeName", null);
        Class<? extends Object> term62250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62249 = ((Class) term62250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term62249).setAccessible(true);
        Object enum111 = ((Field) term62249).get((Object) null);
        term61541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term61635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term61745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term61541, term61541.getClass(), "className", null);
        setField(term61541, term61541.getClass(), "source", null);
        setField(term61635, term61635.getClass(), "parameters", null);
        setField(term61635, term61635.getClass(), "returnType", null);
        setField(term61541, term61541.getClass(), "call", term61635);
        setField(term61541, term61541.getClass(), "typeOfThis", term61745);
        setField(term61541, term61541.getClass(), "templateTypeName", null);
        setField(term61541, term61541.getClass(), "kind", enum111);
        term62241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term62242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term62241, term62241.getClass(), "registry", null);
        setField(term62241, term62241.getClass(), "name", null);
        setField(term62241, term62241.getClass(), "sourceNode", null);
        setField(term62241, term62241.getClass(), "parametersNode", null);
        setField(term62241, term62241.getClass(), "returnType", null);
        setField(term62242, term62242.getClass(), "parameterType", null);
        setField(term62242, term62242.getClass(), "referencedType", null);
        setBooleanField(term62242, term62242.getClass(), "visited", false);
        setField(term62242, term62242.getClass(), "docInfo", null);
        setBooleanField(term62242, term62242.getClass(), "unknown", false);
        setBooleanField(term62242, term62242.getClass(), "resolved", false);
        setField(term62242, term62242.getClass(), "resolveResult", null);
        setField(term62242, term62242.getClass(), "registry", null);
        setField(term62241, term62241.getClass(), "typeOfThis", term62242);
        setField(term62241, term62241.getClass(), "templateTypeName", null);
        setBooleanField(term62241, term62241.getClass(), "inferredReturnType", false);
        setBooleanField(term62241, term62241.getClass(), "isConstructor", true);
        setBooleanField(term62241, term62241.getClass(), "isNativeType", false);
        Class<? extends Object> term62550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62549 = ((Class) term62550).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term62549).setAccessible(true);
        Object enum112 = ((Field) term62549).get((Object) null);
        term62243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term62244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term62248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term62244, term62244.getClass(), "parameters", null);
        setField(term62244, term62244.getClass(), "returnType", null);
        setBooleanField(term62244, term62244.getClass(), "returnTypeInferred", false);
        setBooleanField(term62244, term62244.getClass(), "resolved", false);
        setField(term62244, term62244.getClass(), "resolveResult", null);
        setField(term62244, term62244.getClass(), "registry", null);
        setField(term62243, term62243.getClass(), "call", term62244);
        setField(term62243, term62243.getClass(), "prototype", null);
        setField(term62243, term62243.getClass(), "kind", enum112);
        setField(term62248, term62248.getClass(), "parameterType", null);
        setField(term62248, term62248.getClass(), "referencedType", null);
        setBooleanField(term62248, term62248.getClass(), "visited", false);
        setField(term62248, term62248.getClass(), "docInfo", null);
        setBooleanField(term62248, term62248.getClass(), "unknown", false);
        setBooleanField(term62248, term62248.getClass(), "resolved", false);
        setField(term62248, term62248.getClass(), "resolveResult", null);
        setField(term62248, term62248.getClass(), "registry", null);
        setField(term62243, term62243.getClass(), "typeOfThis", term62248);
        setField(term62243, term62243.getClass(), "source", null);
        setField(term62243, term62243.getClass(), "implementedInterfaces", null);
        setField(term62243, term62243.getClass(), "subTypes", null);
        setField(term62243, term62243.getClass(), "templateTypeName", null);
        setField(term62243, term62243.getClass(), "className", null);
        setField(term62243, term62243.getClass(), "properties", null);
        setField(term62243, term62243.getClass(), "implicitPrototype", null);
        setBooleanField(term62243, term62243.getClass(), "nativeType", false);
        setBooleanField(term62243, term62243.getClass(), "prettyPrint", false);
        setBooleanField(term62243, term62243.getClass(), "visited", false);
        setField(term62243, term62243.getClass(), "docInfo", null);
        setBooleanField(term62243, term62243.getClass(), "unknown", false);
        setBooleanField(term62243, term62243.getClass(), "resolved", false);
        setField(term62243, term62243.getClass(), "resolveResult", null);
        setField(term62243, term62243.getClass(), "registry", null);
        term62237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term62214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term62237, term62237.getClass(), "registry", null);
        setField(term62237, term62237.getClass(), "name", null);
        setField(term62237, term62237.getClass(), "sourceNode", null);
        setField(term62237, term62237.getClass(), "parametersNode", null);
        setField(term62237, term62237.getClass(), "returnType", null);
        setField(term62214, term62214.getClass(), "parameterType", null);
        setField(term62214, term62214.getClass(), "referencedType", null);
        setBooleanField(term62214, term62214.getClass(), "visited", false);
        setField(term62214, term62214.getClass(), "docInfo", null);
        setBooleanField(term62214, term62214.getClass(), "unknown", false);
        setBooleanField(term62214, term62214.getClass(), "resolved", false);
        setField(term62214, term62214.getClass(), "resolveResult", null);
        setField(term62214, term62214.getClass(), "registry", null);
        setField(term62237, term62237.getClass(), "typeOfThis", term62214);
        setField(term62237, term62237.getClass(), "templateTypeName", null);
        setBooleanField(term62237, term62237.getClass(), "inferredReturnType", false);
        setBooleanField(term62237, term62237.getClass(), "isConstructor", true);
        setBooleanField(term62237, term62237.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term61541;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term61441, args);
        assertTrue(recursiveEquals(term61441, term62241));
        assertTrue(recursiveEquals(term61541, term62243));
        assertTrue(recursiveEquals(retValue, term62237));
    }

};


