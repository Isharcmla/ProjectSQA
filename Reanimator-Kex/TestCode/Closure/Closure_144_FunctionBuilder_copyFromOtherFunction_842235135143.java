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

public class FunctionBuilder_copyFromOtherFunction_842235135143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99959;
     Object term100067;
     Object term100300;
     Object term100302;
     Object term100296;

    public FunctionBuilder_copyFromOtherFunction_842235135143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term99959, term99959.getClass(), "name", null);
        setField(term99959, term99959.getClass(), "sourceNode", null);
        setField(term99959, term99959.getClass(), "parametersNode", null);
        setField(term99959, term99959.getClass(), "returnType", null);
        term100067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term100161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100067, term100067.getClass(), "className", null);
        setField(term100067, term100067.getClass(), "source", null);
        setField(term100161, term100161.getClass(), "parameters", null);
        setField(term100161, term100161.getClass(), "returnType", null);
        setField(term100067, term100067.getClass(), "call", term100161);
        setField(term100067, term100067.getClass(), "typeOfThis", term100261);
        term100300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term100301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100300, term100300.getClass(), "registry", null);
        setField(term100300, term100300.getClass(), "name", null);
        setField(term100300, term100300.getClass(), "sourceNode", null);
        setField(term100300, term100300.getClass(), "parametersNode", null);
        setField(term100300, term100300.getClass(), "returnType", null);
        setField(term100301, term100301.getClass(), "call", null);
        setField(term100301, term100301.getClass(), "prototype", null);
        setField(term100301, term100301.getClass(), "kind", null);
        setField(term100301, term100301.getClass(), "typeOfThis", null);
        setField(term100301, term100301.getClass(), "source", null);
        setField(term100301, term100301.getClass(), "implementedInterfaces", null);
        setField(term100301, term100301.getClass(), "subTypes", null);
        setField(term100301, term100301.getClass(), "templateTypeName", null);
        setField(term100301, term100301.getClass(), "className", null);
        setField(term100301, term100301.getClass(), "properties", null);
        setField(term100301, term100301.getClass(), "implicitPrototype", null);
        setBooleanField(term100301, term100301.getClass(), "nativeType", false);
        setBooleanField(term100301, term100301.getClass(), "prettyPrint", false);
        setBooleanField(term100301, term100301.getClass(), "visited", false);
        setField(term100301, term100301.getClass(), "docInfo", null);
        setBooleanField(term100301, term100301.getClass(), "unknown", false);
        setBooleanField(term100301, term100301.getClass(), "resolved", false);
        setField(term100301, term100301.getClass(), "resolveResult", null);
        setField(term100301, term100301.getClass(), "registry", null);
        setField(term100300, term100300.getClass(), "typeOfThis", term100301);
        setField(term100300, term100300.getClass(), "templateTypeName", null);
        setBooleanField(term100300, term100300.getClass(), "inferredReturnType", false);
        setBooleanField(term100300, term100300.getClass(), "isConstructor", false);
        setBooleanField(term100300, term100300.getClass(), "isNativeType", false);
        term100302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term100303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100302, term100302.getClass(), "this$0", null);
        setField(term100303, term100303.getClass(), "parameters", null);
        setField(term100303, term100303.getClass(), "returnType", null);
        setBooleanField(term100303, term100303.getClass(), "returnTypeInferred", false);
        setBooleanField(term100303, term100303.getClass(), "resolved", false);
        setField(term100303, term100303.getClass(), "resolveResult", null);
        setField(term100303, term100303.getClass(), "registry", null);
        setField(term100302, term100302.getClass(), "call", term100303);
        setField(term100302, term100302.getClass(), "prototype", null);
        setField(term100302, term100302.getClass(), "kind", null);
        setField(term100304, term100304.getClass(), "call", null);
        setField(term100304, term100304.getClass(), "prototype", null);
        setField(term100304, term100304.getClass(), "kind", null);
        setField(term100304, term100304.getClass(), "typeOfThis", null);
        setField(term100304, term100304.getClass(), "source", null);
        setField(term100304, term100304.getClass(), "implementedInterfaces", null);
        setField(term100304, term100304.getClass(), "subTypes", null);
        setField(term100304, term100304.getClass(), "templateTypeName", null);
        setField(term100304, term100304.getClass(), "className", null);
        setField(term100304, term100304.getClass(), "properties", null);
        setField(term100304, term100304.getClass(), "implicitPrototype", null);
        setBooleanField(term100304, term100304.getClass(), "nativeType", false);
        setBooleanField(term100304, term100304.getClass(), "prettyPrint", false);
        setBooleanField(term100304, term100304.getClass(), "visited", false);
        setField(term100304, term100304.getClass(), "docInfo", null);
        setBooleanField(term100304, term100304.getClass(), "unknown", false);
        setBooleanField(term100304, term100304.getClass(), "resolved", false);
        setField(term100304, term100304.getClass(), "resolveResult", null);
        setField(term100304, term100304.getClass(), "registry", null);
        setField(term100302, term100302.getClass(), "typeOfThis", term100304);
        setField(term100302, term100302.getClass(), "source", null);
        setField(term100302, term100302.getClass(), "implementedInterfaces", null);
        setField(term100302, term100302.getClass(), "subTypes", null);
        setField(term100302, term100302.getClass(), "templateTypeName", null);
        setField(term100302, term100302.getClass(), "className", null);
        setField(term100302, term100302.getClass(), "properties", null);
        setField(term100302, term100302.getClass(), "implicitPrototype", null);
        setBooleanField(term100302, term100302.getClass(), "nativeType", false);
        setBooleanField(term100302, term100302.getClass(), "prettyPrint", false);
        setBooleanField(term100302, term100302.getClass(), "visited", false);
        setField(term100302, term100302.getClass(), "docInfo", null);
        setBooleanField(term100302, term100302.getClass(), "unknown", false);
        setBooleanField(term100302, term100302.getClass(), "resolved", false);
        setField(term100302, term100302.getClass(), "resolveResult", null);
        setField(term100302, term100302.getClass(), "registry", null);
        term100296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term100267 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100296, term100296.getClass(), "registry", null);
        setField(term100296, term100296.getClass(), "name", null);
        setField(term100296, term100296.getClass(), "sourceNode", null);
        setField(term100296, term100296.getClass(), "parametersNode", null);
        setField(term100296, term100296.getClass(), "returnType", null);
        setField(term100267, term100267.getClass(), "call", null);
        setField(term100267, term100267.getClass(), "prototype", null);
        setField(term100267, term100267.getClass(), "kind", null);
        setField(term100267, term100267.getClass(), "typeOfThis", null);
        setField(term100267, term100267.getClass(), "source", null);
        setField(term100267, term100267.getClass(), "implementedInterfaces", null);
        setField(term100267, term100267.getClass(), "subTypes", null);
        setField(term100267, term100267.getClass(), "templateTypeName", null);
        setField(term100267, term100267.getClass(), "className", null);
        setField(term100267, term100267.getClass(), "properties", null);
        setField(term100267, term100267.getClass(), "implicitPrototype", null);
        setBooleanField(term100267, term100267.getClass(), "nativeType", false);
        setBooleanField(term100267, term100267.getClass(), "prettyPrint", false);
        setBooleanField(term100267, term100267.getClass(), "visited", false);
        setField(term100267, term100267.getClass(), "docInfo", null);
        setBooleanField(term100267, term100267.getClass(), "unknown", false);
        setBooleanField(term100267, term100267.getClass(), "resolved", false);
        setField(term100267, term100267.getClass(), "resolveResult", null);
        setField(term100267, term100267.getClass(), "registry", null);
        setField(term100296, term100296.getClass(), "typeOfThis", term100267);
        setField(term100296, term100296.getClass(), "templateTypeName", null);
        setBooleanField(term100296, term100296.getClass(), "inferredReturnType", false);
        setBooleanField(term100296, term100296.getClass(), "isConstructor", false);
        setBooleanField(term100296, term100296.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term100067;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term99959, args);
        assertTrue(recursiveEquals(term99959, term100300));
        assertTrue(recursiveEquals(term100067, term100302));
        assertTrue(recursiveEquals(retValue, term100296));
    }

};


