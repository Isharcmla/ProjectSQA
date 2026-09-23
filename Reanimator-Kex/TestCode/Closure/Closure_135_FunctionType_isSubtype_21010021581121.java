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

public class FunctionType_isSubtype_21010021581121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319970;
     Object term1320730;
     Object term1323208;
     Object term1323214;

    public FunctionType_isSubtype_21010021581121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1323225 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1323224 = ((Class) term1323225).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1323224).setAccessible(true);
        Object enum2470 = ((Field) term1323224).get((Object) null);
        term1319970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1320514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1320622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1319970, term1319970.getClass(), "kind", enum2470);
        setField(term1320514, term1320514.getClass(), "kind", enum2470);
        setField(term1320514, term1320514.getClass(), "typeOfThis", term1320622);
        setField(term1320514, term1320514.getClass(), "call", null);
        setField(term1319970, term1319970.getClass(), "typeOfThis", term1320514);
        Class<? extends Object> term1323525 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1323524 = ((Class) term1323525).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1323524).setAccessible(true);
        Object enum2471 = ((Field) term1323524).get((Object) null);
        term1320730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1321060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1321154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1320730, term1320730.getClass(), "kind", enum2470);
        setField(term1321060, term1321060.getClass(), "kind", enum2471);
        setField(term1321060, term1321060.getClass(), "typeOfThis", null);
        setField(term1321060, term1321060.getClass(), "call", term1321154);
        setField(term1320730, term1320730.getClass(), "typeOfThis", term1321060);
        Class<? extends Object> term1323825 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1323824 = ((Class) term1323825).getDeclaredField((String) "INTERFACE");
        ((Field) term1323824).setAccessible(true);
        Object enum2472 = ((Field) term1323824).get((Object) null);
        term1323208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1323212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1323213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1323208, term1323208.getClass(), "this$0", null);
        setField(term1323208, term1323208.getClass(), "call", null);
        setField(term1323208, term1323208.getClass(), "prototype", null);
        setField(term1323208, term1323208.getClass(), "kind", enum2472);
        setField(term1323212, term1323212.getClass(), "call", null);
        setField(term1323212, term1323212.getClass(), "prototype", null);
        setField(term1323212, term1323212.getClass(), "kind", enum2472);
        setField(term1323213, term1323213.getClass(), "this$0", null);
        setField(term1323213, term1323213.getClass(), "call", null);
        setField(term1323213, term1323213.getClass(), "prototype", null);
        setField(term1323213, term1323213.getClass(), "kind", null);
        setField(term1323213, term1323213.getClass(), "typeOfThis", null);
        setField(term1323213, term1323213.getClass(), "source", null);
        setField(term1323213, term1323213.getClass(), "implementedInterfaces", null);
        setField(term1323213, term1323213.getClass(), "subTypes", null);
        setField(term1323213, term1323213.getClass(), "templateTypeName", null);
        setField(term1323213, term1323213.getClass(), "className", null);
        setField(term1323213, term1323213.getClass(), "properties", null);
        setField(term1323213, term1323213.getClass(), "implicitPrototype", null);
        setBooleanField(term1323213, term1323213.getClass(), "nativeType", false);
        setBooleanField(term1323213, term1323213.getClass(), "visited", false);
        setField(term1323213, term1323213.getClass(), "docInfo", null);
        setBooleanField(term1323213, term1323213.getClass(), "unknown", false);
        setBooleanField(term1323213, term1323213.getClass(), "resolved", false);
        setField(term1323213, term1323213.getClass(), "resolveResult", null);
        setField(term1323213, term1323213.getClass(), "registry", null);
        setField(term1323212, term1323212.getClass(), "typeOfThis", term1323213);
        setField(term1323212, term1323212.getClass(), "source", null);
        setField(term1323212, term1323212.getClass(), "implementedInterfaces", null);
        setField(term1323212, term1323212.getClass(), "subTypes", null);
        setField(term1323212, term1323212.getClass(), "templateTypeName", null);
        setField(term1323212, term1323212.getClass(), "className", null);
        setField(term1323212, term1323212.getClass(), "properties", null);
        setField(term1323212, term1323212.getClass(), "implicitPrototype", null);
        setBooleanField(term1323212, term1323212.getClass(), "nativeType", false);
        setBooleanField(term1323212, term1323212.getClass(), "visited", false);
        setField(term1323212, term1323212.getClass(), "docInfo", null);
        setBooleanField(term1323212, term1323212.getClass(), "unknown", false);
        setBooleanField(term1323212, term1323212.getClass(), "resolved", false);
        setField(term1323212, term1323212.getClass(), "resolveResult", null);
        setField(term1323212, term1323212.getClass(), "registry", null);
        setField(term1323208, term1323208.getClass(), "typeOfThis", term1323212);
        setField(term1323208, term1323208.getClass(), "source", null);
        setField(term1323208, term1323208.getClass(), "implementedInterfaces", null);
        setField(term1323208, term1323208.getClass(), "subTypes", null);
        setField(term1323208, term1323208.getClass(), "templateTypeName", null);
        setField(term1323208, term1323208.getClass(), "className", null);
        setField(term1323208, term1323208.getClass(), "properties", null);
        setField(term1323208, term1323208.getClass(), "implicitPrototype", null);
        setBooleanField(term1323208, term1323208.getClass(), "nativeType", false);
        setBooleanField(term1323208, term1323208.getClass(), "visited", false);
        setField(term1323208, term1323208.getClass(), "docInfo", null);
        setBooleanField(term1323208, term1323208.getClass(), "unknown", false);
        setBooleanField(term1323208, term1323208.getClass(), "resolved", false);
        setField(term1323208, term1323208.getClass(), "resolveResult", null);
        setField(term1323208, term1323208.getClass(), "registry", null);
        Class<? extends Object> term1324119 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1324118 = ((Class) term1324119).getDeclaredField((String) "INTERFACE");
        ((Field) term1324118).setAccessible(true);
        Object enum2473 = ((Field) term1324118).get((Object) null);
        Class<? extends Object> term1324413 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1324412 = ((Class) term1324413).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1324412).setAccessible(true);
        Object enum2474 = ((Field) term1324412).get((Object) null);
        term1323214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1323218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1323219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1323214, term1323214.getClass(), "this$0", null);
        setField(term1323214, term1323214.getClass(), "call", null);
        setField(term1323214, term1323214.getClass(), "prototype", null);
        setField(term1323214, term1323214.getClass(), "kind", enum2473);
        setField(term1323218, term1323218.getClass(), "this$0", null);
        setField(term1323219, term1323219.getClass(), "parameters", null);
        setField(term1323219, term1323219.getClass(), "returnType", null);
        setBooleanField(term1323219, term1323219.getClass(), "resolved", false);
        setField(term1323219, term1323219.getClass(), "resolveResult", null);
        setField(term1323219, term1323219.getClass(), "registry", null);
        setField(term1323218, term1323218.getClass(), "call", term1323219);
        setField(term1323218, term1323218.getClass(), "prototype", null);
        setField(term1323218, term1323218.getClass(), "kind", enum2474);
        setField(term1323218, term1323218.getClass(), "typeOfThis", null);
        setField(term1323218, term1323218.getClass(), "source", null);
        setField(term1323218, term1323218.getClass(), "implementedInterfaces", null);
        setField(term1323218, term1323218.getClass(), "subTypes", null);
        setField(term1323218, term1323218.getClass(), "templateTypeName", null);
        setField(term1323218, term1323218.getClass(), "className", null);
        setField(term1323218, term1323218.getClass(), "properties", null);
        setField(term1323218, term1323218.getClass(), "implicitPrototype", null);
        setBooleanField(term1323218, term1323218.getClass(), "nativeType", false);
        setBooleanField(term1323218, term1323218.getClass(), "visited", false);
        setField(term1323218, term1323218.getClass(), "docInfo", null);
        setBooleanField(term1323218, term1323218.getClass(), "unknown", false);
        setBooleanField(term1323218, term1323218.getClass(), "resolved", false);
        setField(term1323218, term1323218.getClass(), "resolveResult", null);
        setField(term1323218, term1323218.getClass(), "registry", null);
        setField(term1323214, term1323214.getClass(), "typeOfThis", term1323218);
        setField(term1323214, term1323214.getClass(), "source", null);
        setField(term1323214, term1323214.getClass(), "implementedInterfaces", null);
        setField(term1323214, term1323214.getClass(), "subTypes", null);
        setField(term1323214, term1323214.getClass(), "templateTypeName", null);
        setField(term1323214, term1323214.getClass(), "className", null);
        setField(term1323214, term1323214.getClass(), "properties", null);
        setField(term1323214, term1323214.getClass(), "implicitPrototype", null);
        setBooleanField(term1323214, term1323214.getClass(), "nativeType", false);
        setBooleanField(term1323214, term1323214.getClass(), "visited", false);
        setField(term1323214, term1323214.getClass(), "docInfo", null);
        setBooleanField(term1323214, term1323214.getClass(), "unknown", false);
        setBooleanField(term1323214, term1323214.getClass(), "resolved", false);
        setField(term1323214, term1323214.getClass(), "resolveResult", null);
        setField(term1323214, term1323214.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1320730;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1319970, args);
        assertTrue(recursiveEquals(term1319970, term1323208));
        assertTrue(recursiveEquals(term1320730, term1323214));
        assertTrue(recursiveEquals(retValue, true));
    }

};


