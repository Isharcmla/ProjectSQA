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

public class FunctionBuilder_copyFromOtherFunction_842235135121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85503;
     Object term85667;
     Object term86430;
     Object term86433;
     Object term86426;

    public FunctionBuilder_copyFromOtherFunction_842235135121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term85503, term85503.getClass(), "name", "");
        setField(term85503, term85503.getClass(), "sourceNode", null);
        setField(term85503, term85503.getClass(), "parametersNode", null);
        setField(term85503, term85503.getClass(), "returnType", null);
        setField(term85503, term85503.getClass(), "typeOfThis", null);
        setField(term85503, term85503.getClass(), "templateTypeName", "");
        Class<? extends Object> term86441 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term86440 = ((Class) term86441).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term86440).setAccessible(true);
        Object enum132 = ((Field) term86440).get((Object) null);
        term85667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term85737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term85923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term85667, term85667.getClass(), "source", term85737);
        setField(term85831, term85831.getClass(), "parameters", null);
        setField(term85831, term85831.getClass(), "returnType", null);
        setField(term85667, term85667.getClass(), "call", term85831);
        setField(term85667, term85667.getClass(), "typeOfThis", term85923);
        setField(term85667, term85667.getClass(), "templateTypeName", null);
        setField(term85667, term85667.getClass(), "kind", enum132);
        term86430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term86431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term86430, term86430.getClass(), "registry", null);
        setField(term86430, term86430.getClass(), "name", null);
        setIntField(term86431, term86431.getClass(), "type", 0);
        setField(term86431, term86431.getClass(), "next", null);
        setField(term86431, term86431.getClass(), "first", null);
        setField(term86431, term86431.getClass(), "last", null);
        setField(term86431, term86431.getClass(), "propListHead", null);
        setIntField(term86431, term86431.getClass(), "sourcePosition", 0);
        setField(term86431, term86431.getClass(), "jsType", null);
        setField(term86431, term86431.getClass(), "parent", null);
        setField(term86430, term86430.getClass(), "sourceNode", term86431);
        setField(term86430, term86430.getClass(), "parametersNode", null);
        setField(term86430, term86430.getClass(), "returnType", null);
        setField(term86432, term86432.getClass(), "elementsType", null);
        setField(term86432, term86432.getClass(), "elements", null);
        setField(term86432, term86432.getClass(), "className", null);
        setField(term86432, term86432.getClass(), "properties", null);
        setField(term86432, term86432.getClass(), "implicitPrototype", null);
        setBooleanField(term86432, term86432.getClass(), "nativeType", false);
        setBooleanField(term86432, term86432.getClass(), "prettyPrint", false);
        setBooleanField(term86432, term86432.getClass(), "visited", false);
        setField(term86432, term86432.getClass(), "docInfo", null);
        setBooleanField(term86432, term86432.getClass(), "unknown", false);
        setBooleanField(term86432, term86432.getClass(), "resolved", false);
        setField(term86432, term86432.getClass(), "resolveResult", null);
        setField(term86432, term86432.getClass(), "registry", null);
        setField(term86430, term86430.getClass(), "typeOfThis", term86432);
        setField(term86430, term86430.getClass(), "templateTypeName", null);
        setBooleanField(term86430, term86430.getClass(), "inferredReturnType", false);
        setBooleanField(term86430, term86430.getClass(), "isConstructor", true);
        setBooleanField(term86430, term86430.getClass(), "isNativeType", false);
        Class<? extends Object> term86741 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term86740 = ((Class) term86741).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term86740).setAccessible(true);
        Object enum133 = ((Field) term86740).get((Object) null);
        term86433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term86434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term86438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term86439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86433, term86433.getClass(), "leastSupertypeVisitor", null);
        setField(term86433, term86433.getClass(), "greatestSubtypeVisitor", null);
        setField(term86434, term86434.getClass(), "parameters", null);
        setField(term86434, term86434.getClass(), "returnType", null);
        setBooleanField(term86434, term86434.getClass(), "returnTypeInferred", false);
        setBooleanField(term86434, term86434.getClass(), "resolved", false);
        setField(term86434, term86434.getClass(), "resolveResult", null);
        setField(term86434, term86434.getClass(), "registry", null);
        setField(term86433, term86433.getClass(), "call", term86434);
        setField(term86433, term86433.getClass(), "prototype", null);
        setField(term86433, term86433.getClass(), "kind", enum133);
        setField(term86438, term86438.getClass(), "elementsType", null);
        setField(term86438, term86438.getClass(), "elements", null);
        setField(term86438, term86438.getClass(), "className", null);
        setField(term86438, term86438.getClass(), "properties", null);
        setField(term86438, term86438.getClass(), "implicitPrototype", null);
        setBooleanField(term86438, term86438.getClass(), "nativeType", false);
        setBooleanField(term86438, term86438.getClass(), "prettyPrint", false);
        setBooleanField(term86438, term86438.getClass(), "visited", false);
        setField(term86438, term86438.getClass(), "docInfo", null);
        setBooleanField(term86438, term86438.getClass(), "unknown", false);
        setBooleanField(term86438, term86438.getClass(), "resolved", false);
        setField(term86438, term86438.getClass(), "resolveResult", null);
        setField(term86438, term86438.getClass(), "registry", null);
        setField(term86433, term86433.getClass(), "typeOfThis", term86438);
        setIntField(term86439, term86439.getClass(), "type", 0);
        setField(term86439, term86439.getClass(), "next", null);
        setField(term86439, term86439.getClass(), "first", null);
        setField(term86439, term86439.getClass(), "last", null);
        setField(term86439, term86439.getClass(), "propListHead", null);
        setIntField(term86439, term86439.getClass(), "sourcePosition", 0);
        setField(term86439, term86439.getClass(), "jsType", null);
        setField(term86439, term86439.getClass(), "parent", null);
        setField(term86433, term86433.getClass(), "source", term86439);
        setField(term86433, term86433.getClass(), "implementedInterfaces", null);
        setField(term86433, term86433.getClass(), "subTypes", null);
        setField(term86433, term86433.getClass(), "templateTypeName", null);
        setField(term86433, term86433.getClass(), "className", null);
        setField(term86433, term86433.getClass(), "properties", null);
        setField(term86433, term86433.getClass(), "implicitPrototype", null);
        setBooleanField(term86433, term86433.getClass(), "nativeType", false);
        setBooleanField(term86433, term86433.getClass(), "prettyPrint", false);
        setBooleanField(term86433, term86433.getClass(), "visited", false);
        setField(term86433, term86433.getClass(), "docInfo", null);
        setBooleanField(term86433, term86433.getClass(), "unknown", false);
        setBooleanField(term86433, term86433.getClass(), "resolved", false);
        setField(term86433, term86433.getClass(), "resolveResult", null);
        setField(term86433, term86433.getClass(), "registry", null);
        term86426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term86397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term86426, term86426.getClass(), "registry", null);
        setField(term86426, term86426.getClass(), "name", null);
        setIntField(term86397, term86397.getClass(), "type", 0);
        setField(term86397, term86397.getClass(), "next", null);
        setField(term86397, term86397.getClass(), "first", null);
        setField(term86397, term86397.getClass(), "last", null);
        setField(term86397, term86397.getClass(), "propListHead", null);
        setIntField(term86397, term86397.getClass(), "sourcePosition", 0);
        setField(term86397, term86397.getClass(), "jsType", null);
        setField(term86397, term86397.getClass(), "parent", null);
        setField(term86426, term86426.getClass(), "sourceNode", term86397);
        setField(term86426, term86426.getClass(), "parametersNode", null);
        setField(term86426, term86426.getClass(), "returnType", null);
        setField(term86391, term86391.getClass(), "elementsType", null);
        setField(term86391, term86391.getClass(), "elements", null);
        setField(term86391, term86391.getClass(), "className", null);
        setField(term86391, term86391.getClass(), "properties", null);
        setField(term86391, term86391.getClass(), "implicitPrototype", null);
        setBooleanField(term86391, term86391.getClass(), "nativeType", false);
        setBooleanField(term86391, term86391.getClass(), "prettyPrint", false);
        setBooleanField(term86391, term86391.getClass(), "visited", false);
        setField(term86391, term86391.getClass(), "docInfo", null);
        setBooleanField(term86391, term86391.getClass(), "unknown", false);
        setBooleanField(term86391, term86391.getClass(), "resolved", false);
        setField(term86391, term86391.getClass(), "resolveResult", null);
        setField(term86391, term86391.getClass(), "registry", null);
        setField(term86426, term86426.getClass(), "typeOfThis", term86391);
        setField(term86426, term86426.getClass(), "templateTypeName", null);
        setBooleanField(term86426, term86426.getClass(), "inferredReturnType", false);
        setBooleanField(term86426, term86426.getClass(), "isConstructor", true);
        setBooleanField(term86426, term86426.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term85667;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term85503, args);
        assertTrue(recursiveEquals(term85503, term86430));
        assertTrue(recursiveEquals(term85667, term86433));
        assertTrue(recursiveEquals(retValue, term86426));
    }

};


