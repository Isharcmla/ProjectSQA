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

public class FunctionBuilder_copyFromOtherFunction_84223513565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53964;
     Object term54172;
     Object term54393;
     Object term54395;
     Object term54389;

    public FunctionBuilder_copyFromOtherFunction_84223513565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term54072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53964, term53964.getClass(), "name", "");
        setField(term53964, term53964.getClass(), "sourceNode", null);
        setField(term53964, term53964.getClass(), "parametersNode", term54072);
        setField(term53964, term53964.getClass(), "returnType", null);
        term54172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term54266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term54354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54172, term54172.getClass(), "className", null);
        setField(term54172, term54172.getClass(), "source", null);
        setField(term54266, term54266.getClass(), "parameters", null);
        setField(term54266, term54266.getClass(), "returnType", null);
        setField(term54172, term54172.getClass(), "call", term54266);
        setField(term54172, term54172.getClass(), "typeOfThis", term54354);
        term54393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term54394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54393, term54393.getClass(), "registry", null);
        setField(term54393, term54393.getClass(), "name", null);
        setField(term54393, term54393.getClass(), "sourceNode", null);
        setField(term54393, term54393.getClass(), "parametersNode", null);
        setField(term54393, term54393.getClass(), "returnType", null);
        setField(term54394, term54394.getClass(), "leastSupertypeVisitor", null);
        setField(term54394, term54394.getClass(), "greatestSubtypeVisitor", null);
        setField(term54394, term54394.getClass(), "call", null);
        setField(term54394, term54394.getClass(), "prototype", null);
        setField(term54394, term54394.getClass(), "kind", null);
        setField(term54394, term54394.getClass(), "typeOfThis", null);
        setField(term54394, term54394.getClass(), "source", null);
        setField(term54394, term54394.getClass(), "implementedInterfaces", null);
        setField(term54394, term54394.getClass(), "subTypes", null);
        setField(term54394, term54394.getClass(), "templateTypeName", null);
        setField(term54394, term54394.getClass(), "className", null);
        setField(term54394, term54394.getClass(), "properties", null);
        setField(term54394, term54394.getClass(), "implicitPrototype", null);
        setBooleanField(term54394, term54394.getClass(), "nativeType", false);
        setBooleanField(term54394, term54394.getClass(), "prettyPrint", false);
        setBooleanField(term54394, term54394.getClass(), "visited", false);
        setField(term54394, term54394.getClass(), "docInfo", null);
        setBooleanField(term54394, term54394.getClass(), "unknown", false);
        setBooleanField(term54394, term54394.getClass(), "resolved", false);
        setField(term54394, term54394.getClass(), "resolveResult", null);
        setField(term54394, term54394.getClass(), "registry", null);
        setField(term54393, term54393.getClass(), "typeOfThis", term54394);
        setField(term54393, term54393.getClass(), "templateTypeName", null);
        setBooleanField(term54393, term54393.getClass(), "inferredReturnType", false);
        setBooleanField(term54393, term54393.getClass(), "isConstructor", false);
        setBooleanField(term54393, term54393.getClass(), "isNativeType", false);
        term54395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term54396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term54397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54396, term54396.getClass(), "parameters", null);
        setField(term54396, term54396.getClass(), "returnType", null);
        setBooleanField(term54396, term54396.getClass(), "returnTypeInferred", false);
        setBooleanField(term54396, term54396.getClass(), "resolved", false);
        setField(term54396, term54396.getClass(), "resolveResult", null);
        setField(term54396, term54396.getClass(), "registry", null);
        setField(term54395, term54395.getClass(), "call", term54396);
        setField(term54395, term54395.getClass(), "prototype", null);
        setField(term54395, term54395.getClass(), "kind", null);
        setField(term54397, term54397.getClass(), "leastSupertypeVisitor", null);
        setField(term54397, term54397.getClass(), "greatestSubtypeVisitor", null);
        setField(term54397, term54397.getClass(), "call", null);
        setField(term54397, term54397.getClass(), "prototype", null);
        setField(term54397, term54397.getClass(), "kind", null);
        setField(term54397, term54397.getClass(), "typeOfThis", null);
        setField(term54397, term54397.getClass(), "source", null);
        setField(term54397, term54397.getClass(), "implementedInterfaces", null);
        setField(term54397, term54397.getClass(), "subTypes", null);
        setField(term54397, term54397.getClass(), "templateTypeName", null);
        setField(term54397, term54397.getClass(), "className", null);
        setField(term54397, term54397.getClass(), "properties", null);
        setField(term54397, term54397.getClass(), "implicitPrototype", null);
        setBooleanField(term54397, term54397.getClass(), "nativeType", false);
        setBooleanField(term54397, term54397.getClass(), "prettyPrint", false);
        setBooleanField(term54397, term54397.getClass(), "visited", false);
        setField(term54397, term54397.getClass(), "docInfo", null);
        setBooleanField(term54397, term54397.getClass(), "unknown", false);
        setBooleanField(term54397, term54397.getClass(), "resolved", false);
        setField(term54397, term54397.getClass(), "resolveResult", null);
        setField(term54397, term54397.getClass(), "registry", null);
        setField(term54395, term54395.getClass(), "typeOfThis", term54397);
        setField(term54395, term54395.getClass(), "source", null);
        setField(term54395, term54395.getClass(), "implementedInterfaces", null);
        setField(term54395, term54395.getClass(), "subTypes", null);
        setField(term54395, term54395.getClass(), "templateTypeName", null);
        setField(term54395, term54395.getClass(), "className", null);
        setField(term54395, term54395.getClass(), "properties", null);
        setField(term54395, term54395.getClass(), "implicitPrototype", null);
        setBooleanField(term54395, term54395.getClass(), "nativeType", false);
        setBooleanField(term54395, term54395.getClass(), "prettyPrint", false);
        setBooleanField(term54395, term54395.getClass(), "visited", false);
        setField(term54395, term54395.getClass(), "docInfo", null);
        setBooleanField(term54395, term54395.getClass(), "unknown", false);
        setBooleanField(term54395, term54395.getClass(), "resolved", false);
        setField(term54395, term54395.getClass(), "resolveResult", null);
        setField(term54395, term54395.getClass(), "registry", null);
        term54389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term54360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term54389, term54389.getClass(), "registry", null);
        setField(term54389, term54389.getClass(), "name", null);
        setField(term54389, term54389.getClass(), "sourceNode", null);
        setField(term54389, term54389.getClass(), "parametersNode", null);
        setField(term54389, term54389.getClass(), "returnType", null);
        setField(term54360, term54360.getClass(), "leastSupertypeVisitor", null);
        setField(term54360, term54360.getClass(), "greatestSubtypeVisitor", null);
        setField(term54360, term54360.getClass(), "call", null);
        setField(term54360, term54360.getClass(), "prototype", null);
        setField(term54360, term54360.getClass(), "kind", null);
        setField(term54360, term54360.getClass(), "typeOfThis", null);
        setField(term54360, term54360.getClass(), "source", null);
        setField(term54360, term54360.getClass(), "implementedInterfaces", null);
        setField(term54360, term54360.getClass(), "subTypes", null);
        setField(term54360, term54360.getClass(), "templateTypeName", null);
        setField(term54360, term54360.getClass(), "className", null);
        setField(term54360, term54360.getClass(), "properties", null);
        setField(term54360, term54360.getClass(), "implicitPrototype", null);
        setBooleanField(term54360, term54360.getClass(), "nativeType", false);
        setBooleanField(term54360, term54360.getClass(), "prettyPrint", false);
        setBooleanField(term54360, term54360.getClass(), "visited", false);
        setField(term54360, term54360.getClass(), "docInfo", null);
        setBooleanField(term54360, term54360.getClass(), "unknown", false);
        setBooleanField(term54360, term54360.getClass(), "resolved", false);
        setField(term54360, term54360.getClass(), "resolveResult", null);
        setField(term54360, term54360.getClass(), "registry", null);
        setField(term54389, term54389.getClass(), "typeOfThis", term54360);
        setField(term54389, term54389.getClass(), "templateTypeName", null);
        setBooleanField(term54389, term54389.getClass(), "inferredReturnType", false);
        setBooleanField(term54389, term54389.getClass(), "isConstructor", false);
        setBooleanField(term54389, term54389.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term54172;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term53964, args);
        assertTrue(recursiveEquals(term53964, term54393));
        assertTrue(recursiveEquals(term54172, term54395));
        assertTrue(recursiveEquals(retValue, term54389));
    }

};


