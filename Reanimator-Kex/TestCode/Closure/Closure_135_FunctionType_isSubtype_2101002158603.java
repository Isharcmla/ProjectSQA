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
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508730;
     Object term509382;
     Object term510100;
     Object term510105;

    public FunctionType_isSubtype_2101002158603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term510112 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term510111 = ((Class) term510112).getDeclaredField((String) "INTERFACE");
        ((Field) term510111).setAccessible(true);
        Object enum941 = ((Field) term510111).get((Object) null);
        term508730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term509274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term508730, term508730.getClass(), "kind", enum941);
        setField(term508730, term508730.getClass(), "typeOfThis", term509274);
        term509382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term509704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term509382, term509382.getClass(), "kind", enum941);
        setField(term509382, term509382.getClass(), "typeOfThis", term509704);
        Class<? extends Object> term510406 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term510405 = ((Class) term510406).getDeclaredField((String) "INTERFACE");
        ((Field) term510405).setAccessible(true);
        Object enum942 = ((Field) term510405).get((Object) null);
        term510100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term510104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term510100, term510100.getClass(), "this$0", null);
        setField(term510100, term510100.getClass(), "call", null);
        setField(term510100, term510100.getClass(), "prototype", null);
        setField(term510100, term510100.getClass(), "kind", enum942);
        setField(term510104, term510104.getClass(), "call", null);
        setField(term510104, term510104.getClass(), "prototype", null);
        setField(term510104, term510104.getClass(), "kind", null);
        setField(term510104, term510104.getClass(), "typeOfThis", null);
        setField(term510104, term510104.getClass(), "source", null);
        setField(term510104, term510104.getClass(), "implementedInterfaces", null);
        setField(term510104, term510104.getClass(), "subTypes", null);
        setField(term510104, term510104.getClass(), "templateTypeName", null);
        setField(term510104, term510104.getClass(), "className", null);
        setField(term510104, term510104.getClass(), "properties", null);
        setField(term510104, term510104.getClass(), "implicitPrototype", null);
        setBooleanField(term510104, term510104.getClass(), "nativeType", false);
        setBooleanField(term510104, term510104.getClass(), "visited", false);
        setField(term510104, term510104.getClass(), "docInfo", null);
        setBooleanField(term510104, term510104.getClass(), "unknown", false);
        setBooleanField(term510104, term510104.getClass(), "resolved", false);
        setField(term510104, term510104.getClass(), "resolveResult", null);
        setField(term510104, term510104.getClass(), "registry", null);
        setField(term510100, term510100.getClass(), "typeOfThis", term510104);
        setField(term510100, term510100.getClass(), "source", null);
        setField(term510100, term510100.getClass(), "implementedInterfaces", null);
        setField(term510100, term510100.getClass(), "subTypes", null);
        setField(term510100, term510100.getClass(), "templateTypeName", null);
        setField(term510100, term510100.getClass(), "className", null);
        setField(term510100, term510100.getClass(), "properties", null);
        setField(term510100, term510100.getClass(), "implicitPrototype", null);
        setBooleanField(term510100, term510100.getClass(), "nativeType", false);
        setBooleanField(term510100, term510100.getClass(), "visited", false);
        setField(term510100, term510100.getClass(), "docInfo", null);
        setBooleanField(term510100, term510100.getClass(), "unknown", false);
        setBooleanField(term510100, term510100.getClass(), "resolved", false);
        setField(term510100, term510100.getClass(), "resolveResult", null);
        setField(term510100, term510100.getClass(), "registry", null);
        Class<? extends Object> term510700 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term510699 = ((Class) term510700).getDeclaredField((String) "INTERFACE");
        ((Field) term510699).setAccessible(true);
        Object enum943 = ((Field) term510699).get((Object) null);
        term510105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term510109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term510105, term510105.getClass(), "this$0", null);
        setField(term510105, term510105.getClass(), "call", null);
        setField(term510105, term510105.getClass(), "prototype", null);
        setField(term510105, term510105.getClass(), "kind", enum943);
        setField(term510109, term510109.getClass(), "leastSupertypeVisitor", null);
        setField(term510109, term510109.getClass(), "greatestSubtypeVisitor", null);
        setField(term510109, term510109.getClass(), "call", null);
        setField(term510109, term510109.getClass(), "prototype", null);
        setField(term510109, term510109.getClass(), "kind", null);
        setField(term510109, term510109.getClass(), "typeOfThis", null);
        setField(term510109, term510109.getClass(), "source", null);
        setField(term510109, term510109.getClass(), "implementedInterfaces", null);
        setField(term510109, term510109.getClass(), "subTypes", null);
        setField(term510109, term510109.getClass(), "templateTypeName", null);
        setField(term510109, term510109.getClass(), "className", null);
        setField(term510109, term510109.getClass(), "properties", null);
        setField(term510109, term510109.getClass(), "implicitPrototype", null);
        setBooleanField(term510109, term510109.getClass(), "nativeType", false);
        setBooleanField(term510109, term510109.getClass(), "visited", false);
        setField(term510109, term510109.getClass(), "docInfo", null);
        setBooleanField(term510109, term510109.getClass(), "unknown", false);
        setBooleanField(term510109, term510109.getClass(), "resolved", false);
        setField(term510109, term510109.getClass(), "resolveResult", null);
        setField(term510109, term510109.getClass(), "registry", null);
        setField(term510105, term510105.getClass(), "typeOfThis", term510109);
        setField(term510105, term510105.getClass(), "source", null);
        setField(term510105, term510105.getClass(), "implementedInterfaces", null);
        setField(term510105, term510105.getClass(), "subTypes", null);
        setField(term510105, term510105.getClass(), "templateTypeName", null);
        setField(term510105, term510105.getClass(), "className", null);
        setField(term510105, term510105.getClass(), "properties", null);
        setField(term510105, term510105.getClass(), "implicitPrototype", null);
        setBooleanField(term510105, term510105.getClass(), "nativeType", false);
        setBooleanField(term510105, term510105.getClass(), "visited", false);
        setField(term510105, term510105.getClass(), "docInfo", null);
        setBooleanField(term510105, term510105.getClass(), "unknown", false);
        setBooleanField(term510105, term510105.getClass(), "resolved", false);
        setField(term510105, term510105.getClass(), "resolveResult", null);
        setField(term510105, term510105.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term509382;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term508730, args);
        assertTrue(recursiveEquals(term508730, term510100));
        assertTrue(recursiveEquals(term509382, term510105));
        assertTrue(recursiveEquals(retValue, true));
    }

};


