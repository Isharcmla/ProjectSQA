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

public class FunctionBuilder_copyFromOtherFunction_842235135201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136434;
     Object term136580;
     Object term137361;
     Object term137364;
     Object term137357;

    public FunctionBuilder_copyFromOtherFunction_842235135201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term136434, term136434.getClass(), "name", "INTERFACE");
        setField(term136434, term136434.getClass(), "sourceNode", null);
        setField(term136434, term136434.getClass(), "parametersNode", null);
        setField(term136434, term136434.getClass(), "returnType", null);
        setField(term136434, term136434.getClass(), "typeOfThis", null);
        setField(term136434, term136434.getClass(), "templateTypeName", null);
        Class<? extends Object> term137381 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137380 = ((Class) term137381).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term137380).setAccessible(true);
        Object enum189 = ((Field) term137380).get((Object) null);
        term136580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term136650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term136850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term136580, term136580.getClass(), "className", null);
        setField(term136580, term136580.getClass(), "source", term136650);
        setField(term136744, term136744.getClass(), "parameters", null);
        setField(term136744, term136744.getClass(), "returnType", null);
        setField(term136580, term136580.getClass(), "call", term136744);
        setField(term136580, term136580.getClass(), "typeOfThis", term136850);
        setField(term136580, term136580.getClass(), "templateTypeName", null);
        setField(term136580, term136580.getClass(), "kind", enum189);
        term137361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term137362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term137361, term137361.getClass(), "registry", null);
        setField(term137361, term137361.getClass(), "name", null);
        setIntField(term137362, term137362.getClass(), "type", 0);
        setField(term137362, term137362.getClass(), "next", null);
        setField(term137362, term137362.getClass(), "first", null);
        setField(term137362, term137362.getClass(), "last", null);
        setField(term137362, term137362.getClass(), "propListHead", null);
        setIntField(term137362, term137362.getClass(), "sourcePosition", 0);
        setField(term137362, term137362.getClass(), "jsType", null);
        setField(term137362, term137362.getClass(), "parent", null);
        setField(term137361, term137361.getClass(), "sourceNode", term137362);
        setField(term137361, term137361.getClass(), "parametersNode", null);
        setField(term137361, term137361.getClass(), "returnType", null);
        setField(term137363, term137363.getClass(), "referencedType", null);
        setBooleanField(term137363, term137363.getClass(), "visited", false);
        setField(term137363, term137363.getClass(), "docInfo", null);
        setBooleanField(term137363, term137363.getClass(), "unknown", false);
        setBooleanField(term137363, term137363.getClass(), "resolved", false);
        setField(term137363, term137363.getClass(), "resolveResult", null);
        setField(term137363, term137363.getClass(), "registry", null);
        setField(term137361, term137361.getClass(), "typeOfThis", term137363);
        setField(term137361, term137361.getClass(), "templateTypeName", null);
        setBooleanField(term137361, term137361.getClass(), "inferredReturnType", false);
        setBooleanField(term137361, term137361.getClass(), "isConstructor", true);
        setBooleanField(term137361, term137361.getClass(), "isNativeType", false);
        Class<? extends Object> term137681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term137680 = ((Class) term137681).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term137680).setAccessible(true);
        Object enum190 = ((Field) term137680).get((Object) null);
        term137364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term137365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term137369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term137370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term137364, term137364.getClass(), "this$0", null);
        setField(term137365, term137365.getClass(), "parameters", null);
        setField(term137365, term137365.getClass(), "returnType", null);
        setBooleanField(term137365, term137365.getClass(), "returnTypeInferred", false);
        setBooleanField(term137365, term137365.getClass(), "resolved", false);
        setField(term137365, term137365.getClass(), "resolveResult", null);
        setField(term137365, term137365.getClass(), "registry", null);
        setField(term137364, term137364.getClass(), "call", term137365);
        setField(term137364, term137364.getClass(), "prototype", null);
        setField(term137364, term137364.getClass(), "kind", enum190);
        setField(term137369, term137369.getClass(), "referencedType", null);
        setBooleanField(term137369, term137369.getClass(), "visited", false);
        setField(term137369, term137369.getClass(), "docInfo", null);
        setBooleanField(term137369, term137369.getClass(), "unknown", false);
        setBooleanField(term137369, term137369.getClass(), "resolved", false);
        setField(term137369, term137369.getClass(), "resolveResult", null);
        setField(term137369, term137369.getClass(), "registry", null);
        setField(term137364, term137364.getClass(), "typeOfThis", term137369);
        setIntField(term137370, term137370.getClass(), "type", 0);
        setField(term137370, term137370.getClass(), "next", null);
        setField(term137370, term137370.getClass(), "first", null);
        setField(term137370, term137370.getClass(), "last", null);
        setField(term137370, term137370.getClass(), "propListHead", null);
        setIntField(term137370, term137370.getClass(), "sourcePosition", 0);
        setField(term137370, term137370.getClass(), "jsType", null);
        setField(term137370, term137370.getClass(), "parent", null);
        setField(term137364, term137364.getClass(), "source", term137370);
        setField(term137364, term137364.getClass(), "implementedInterfaces", null);
        setField(term137364, term137364.getClass(), "subTypes", null);
        setField(term137364, term137364.getClass(), "templateTypeName", null);
        setField(term137364, term137364.getClass(), "className", null);
        setField(term137364, term137364.getClass(), "properties", null);
        setField(term137364, term137364.getClass(), "implicitPrototype", null);
        setBooleanField(term137364, term137364.getClass(), "nativeType", false);
        setBooleanField(term137364, term137364.getClass(), "prettyPrint", false);
        setBooleanField(term137364, term137364.getClass(), "visited", false);
        setField(term137364, term137364.getClass(), "docInfo", null);
        setBooleanField(term137364, term137364.getClass(), "unknown", false);
        setBooleanField(term137364, term137364.getClass(), "resolved", false);
        setField(term137364, term137364.getClass(), "resolveResult", null);
        setField(term137364, term137364.getClass(), "registry", null);
        term137357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term137332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term137357, term137357.getClass(), "registry", null);
        setField(term137357, term137357.getClass(), "name", null);
        setIntField(term137332, term137332.getClass(), "type", 0);
        setField(term137332, term137332.getClass(), "next", null);
        setField(term137332, term137332.getClass(), "first", null);
        setField(term137332, term137332.getClass(), "last", null);
        setField(term137332, term137332.getClass(), "propListHead", null);
        setIntField(term137332, term137332.getClass(), "sourcePosition", 0);
        setField(term137332, term137332.getClass(), "jsType", null);
        setField(term137332, term137332.getClass(), "parent", null);
        setField(term137357, term137357.getClass(), "sourceNode", term137332);
        setField(term137357, term137357.getClass(), "parametersNode", null);
        setField(term137357, term137357.getClass(), "returnType", null);
        setField(term137328, term137328.getClass(), "referencedType", null);
        setBooleanField(term137328, term137328.getClass(), "visited", false);
        setField(term137328, term137328.getClass(), "docInfo", null);
        setBooleanField(term137328, term137328.getClass(), "unknown", false);
        setBooleanField(term137328, term137328.getClass(), "resolved", false);
        setField(term137328, term137328.getClass(), "resolveResult", null);
        setField(term137328, term137328.getClass(), "registry", null);
        setField(term137357, term137357.getClass(), "typeOfThis", term137328);
        setField(term137357, term137357.getClass(), "templateTypeName", null);
        setBooleanField(term137357, term137357.getClass(), "inferredReturnType", false);
        setBooleanField(term137357, term137357.getClass(), "isConstructor", true);
        setBooleanField(term137357, term137357.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term136580;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term136434, args);
        assertTrue(recursiveEquals(term136434, term137361));
        assertTrue(recursiveEquals(term136580, term137364));
        assertTrue(recursiveEquals(retValue, term137357));
    }

};


