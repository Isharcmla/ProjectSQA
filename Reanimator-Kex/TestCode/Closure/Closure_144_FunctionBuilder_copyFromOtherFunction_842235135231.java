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

public class FunctionBuilder_copyFromOtherFunction_842235135231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164655;
     Object term164765;
     Object term165552;
     Object term165556;
     Object term165537;

    public FunctionBuilder_copyFromOtherFunction_842235135231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term164655, term164655.getClass(), "name", null);
        setField(term164655, term164655.getClass(), "sourceNode", null);
        setField(term164655, term164655.getClass(), "parametersNode", null);
        setField(term164655, term164655.getClass(), "returnType", null);
        setField(term164655, term164655.getClass(), "typeOfThis", null);
        setField(term164655, term164655.getClass(), "templateTypeName", null);
        Class<? extends Object> term165574 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term165573 = ((Class) term165574).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term165573).setAccessible(true);
        Object enum218 = ((Field) term165573).get((Object) null);
        term164765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term164897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term165003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term164765, term164765.getClass(), "className", "INTERFACE");
        setField(term164765, term164765.getClass(), "source", null);
        setField(term164897, term164897.getClass(), "parameters", null);
        setField(term164897, term164897.getClass(), "returnType", null);
        setField(term164765, term164765.getClass(), "call", term164897);
        setField(term164765, term164765.getClass(), "typeOfThis", term165003);
        setField(term164765, term164765.getClass(), "templateTypeName", null);
        setField(term164765, term164765.getClass(), "kind", enum218);
        term165552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term165555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term165552, term165552.getClass(), "registry", null);
        setField(term165552, term165552.getClass(), "name", "INTERFACE");
        setField(term165552, term165552.getClass(), "sourceNode", null);
        setField(term165552, term165552.getClass(), "parametersNode", null);
        setField(term165552, term165552.getClass(), "returnType", null);
        setField(term165555, term165555.getClass(), "referencedType", null);
        setBooleanField(term165555, term165555.getClass(), "visited", false);
        setField(term165555, term165555.getClass(), "docInfo", null);
        setBooleanField(term165555, term165555.getClass(), "unknown", false);
        setBooleanField(term165555, term165555.getClass(), "resolved", false);
        setField(term165555, term165555.getClass(), "resolveResult", null);
        setField(term165555, term165555.getClass(), "registry", null);
        setField(term165552, term165552.getClass(), "typeOfThis", term165555);
        setField(term165552, term165552.getClass(), "templateTypeName", null);
        setBooleanField(term165552, term165552.getClass(), "inferredReturnType", false);
        setBooleanField(term165552, term165552.getClass(), "isConstructor", true);
        setBooleanField(term165552, term165552.getClass(), "isNativeType", false);
        Class<? extends Object> term165883 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term165882 = ((Class) term165883).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term165882).setAccessible(true);
        Object enum219 = ((Field) term165882).get((Object) null);
        term165556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term165557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term165561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term165557, term165557.getClass(), "parameters", null);
        setField(term165557, term165557.getClass(), "returnType", null);
        setBooleanField(term165557, term165557.getClass(), "returnTypeInferred", false);
        setBooleanField(term165557, term165557.getClass(), "resolved", false);
        setField(term165557, term165557.getClass(), "resolveResult", null);
        setField(term165557, term165557.getClass(), "registry", null);
        setField(term165556, term165556.getClass(), "call", term165557);
        setField(term165556, term165556.getClass(), "prototype", null);
        setField(term165556, term165556.getClass(), "kind", enum219);
        setField(term165561, term165561.getClass(), "referencedType", null);
        setBooleanField(term165561, term165561.getClass(), "visited", false);
        setField(term165561, term165561.getClass(), "docInfo", null);
        setBooleanField(term165561, term165561.getClass(), "unknown", false);
        setBooleanField(term165561, term165561.getClass(), "resolved", false);
        setField(term165561, term165561.getClass(), "resolveResult", null);
        setField(term165561, term165561.getClass(), "registry", null);
        setField(term165556, term165556.getClass(), "typeOfThis", term165561);
        setField(term165556, term165556.getClass(), "source", null);
        setField(term165556, term165556.getClass(), "implementedInterfaces", null);
        setField(term165556, term165556.getClass(), "subTypes", null);
        setField(term165556, term165556.getClass(), "templateTypeName", null);
        setField(term165556, term165556.getClass(), "className", "INTERFACE");
        setField(term165556, term165556.getClass(), "properties", null);
        setField(term165556, term165556.getClass(), "implicitPrototype", null);
        setBooleanField(term165556, term165556.getClass(), "nativeType", false);
        setBooleanField(term165556, term165556.getClass(), "prettyPrint", false);
        setBooleanField(term165556, term165556.getClass(), "visited", false);
        setField(term165556, term165556.getClass(), "docInfo", null);
        setBooleanField(term165556, term165556.getClass(), "unknown", false);
        setBooleanField(term165556, term165556.getClass(), "resolved", false);
        setField(term165556, term165556.getClass(), "resolveResult", null);
        setField(term165556, term165556.getClass(), "registry", null);
        term165537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term165492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term165537, term165537.getClass(), "registry", null);
        setField(term165537, term165537.getClass(), "name", "INTERFACE");
        setField(term165537, term165537.getClass(), "sourceNode", null);
        setField(term165537, term165537.getClass(), "parametersNode", null);
        setField(term165537, term165537.getClass(), "returnType", null);
        setField(term165492, term165492.getClass(), "referencedType", null);
        setBooleanField(term165492, term165492.getClass(), "visited", false);
        setField(term165492, term165492.getClass(), "docInfo", null);
        setBooleanField(term165492, term165492.getClass(), "unknown", false);
        setBooleanField(term165492, term165492.getClass(), "resolved", false);
        setField(term165492, term165492.getClass(), "resolveResult", null);
        setField(term165492, term165492.getClass(), "registry", null);
        setField(term165537, term165537.getClass(), "typeOfThis", term165492);
        setField(term165537, term165537.getClass(), "templateTypeName", null);
        setBooleanField(term165537, term165537.getClass(), "inferredReturnType", false);
        setBooleanField(term165537, term165537.getClass(), "isConstructor", true);
        setBooleanField(term165537, term165537.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term164765;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term164655, args);
        assertTrue(recursiveEquals(term164655, term165552));
        assertTrue(recursiveEquals(term164765, term165556));
        assertTrue(recursiveEquals(retValue, term165537));
    }

};


