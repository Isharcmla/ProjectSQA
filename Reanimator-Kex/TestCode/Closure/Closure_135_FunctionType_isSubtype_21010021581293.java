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

public class FunctionType_isSubtype_21010021581293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1620794;
     Object term1621446;
     Object term1622341;
     Object term1622346;

    public FunctionType_isSubtype_21010021581293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1622353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1622352 = ((Class) term1622353).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1622352).setAccessible(true);
        Object enum3020 = ((Field) term1622352).get((Object) null);
        term1620794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1621338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1620794, term1620794.getClass(), "kind", enum3020);
        setField(term1620794, term1620794.getClass(), "typeOfThis", term1621338);
        Class<? extends Object> term1622653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1622652 = ((Class) term1622653).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1622652).setAccessible(true);
        Object enum3021 = ((Field) term1622652).get((Object) null);
        term1621446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1621620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1621446, term1621446.getClass(), "kind", enum3021);
        setField(term1621446, term1621446.getClass(), "typeOfThis", term1621620);
        Class<? extends Object> term1622953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1622952 = ((Class) term1622953).getDeclaredField((String) "INTERFACE");
        ((Field) term1622952).setAccessible(true);
        Object enum3022 = ((Field) term1622952).get((Object) null);
        term1622341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1622345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1622341, term1622341.getClass(), "this$0", null);
        setField(term1622341, term1622341.getClass(), "call", null);
        setField(term1622341, term1622341.getClass(), "prototype", null);
        setField(term1622341, term1622341.getClass(), "kind", enum3022);
        setField(term1622345, term1622345.getClass(), "call", null);
        setField(term1622345, term1622345.getClass(), "prototype", null);
        setField(term1622345, term1622345.getClass(), "kind", null);
        setField(term1622345, term1622345.getClass(), "typeOfThis", null);
        setField(term1622345, term1622345.getClass(), "source", null);
        setField(term1622345, term1622345.getClass(), "implementedInterfaces", null);
        setField(term1622345, term1622345.getClass(), "subTypes", null);
        setField(term1622345, term1622345.getClass(), "templateTypeName", null);
        setField(term1622345, term1622345.getClass(), "className", null);
        setField(term1622345, term1622345.getClass(), "properties", null);
        setField(term1622345, term1622345.getClass(), "implicitPrototype", null);
        setBooleanField(term1622345, term1622345.getClass(), "nativeType", false);
        setBooleanField(term1622345, term1622345.getClass(), "visited", false);
        setField(term1622345, term1622345.getClass(), "docInfo", null);
        setBooleanField(term1622345, term1622345.getClass(), "unknown", false);
        setBooleanField(term1622345, term1622345.getClass(), "resolved", false);
        setField(term1622345, term1622345.getClass(), "resolveResult", null);
        setField(term1622345, term1622345.getClass(), "registry", null);
        setField(term1622341, term1622341.getClass(), "typeOfThis", term1622345);
        setField(term1622341, term1622341.getClass(), "source", null);
        setField(term1622341, term1622341.getClass(), "implementedInterfaces", null);
        setField(term1622341, term1622341.getClass(), "subTypes", null);
        setField(term1622341, term1622341.getClass(), "templateTypeName", null);
        setField(term1622341, term1622341.getClass(), "className", null);
        setField(term1622341, term1622341.getClass(), "properties", null);
        setField(term1622341, term1622341.getClass(), "implicitPrototype", null);
        setBooleanField(term1622341, term1622341.getClass(), "nativeType", false);
        setBooleanField(term1622341, term1622341.getClass(), "visited", false);
        setField(term1622341, term1622341.getClass(), "docInfo", null);
        setBooleanField(term1622341, term1622341.getClass(), "unknown", false);
        setBooleanField(term1622341, term1622341.getClass(), "resolved", false);
        setField(term1622341, term1622341.getClass(), "resolveResult", null);
        setField(term1622341, term1622341.getClass(), "registry", null);
        Class<? extends Object> term1623247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1623246 = ((Class) term1623247).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1623246).setAccessible(true);
        Object enum3023 = ((Field) term1623246).get((Object) null);
        term1622346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1622350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1622346, term1622346.getClass(), "this$0", null);
        setField(term1622346, term1622346.getClass(), "call", null);
        setField(term1622346, term1622346.getClass(), "prototype", null);
        setField(term1622346, term1622346.getClass(), "kind", enum3023);
        setField(term1622350, term1622350.getClass(), "leastSupertypeVisitor", null);
        setField(term1622350, term1622350.getClass(), "greatestSubtypeVisitor", null);
        setField(term1622350, term1622350.getClass(), "call", null);
        setField(term1622350, term1622350.getClass(), "prototype", null);
        setField(term1622350, term1622350.getClass(), "kind", null);
        setField(term1622350, term1622350.getClass(), "typeOfThis", null);
        setField(term1622350, term1622350.getClass(), "source", null);
        setField(term1622350, term1622350.getClass(), "implementedInterfaces", null);
        setField(term1622350, term1622350.getClass(), "subTypes", null);
        setField(term1622350, term1622350.getClass(), "templateTypeName", null);
        setField(term1622350, term1622350.getClass(), "className", null);
        setField(term1622350, term1622350.getClass(), "properties", null);
        setField(term1622350, term1622350.getClass(), "implicitPrototype", null);
        setBooleanField(term1622350, term1622350.getClass(), "nativeType", false);
        setBooleanField(term1622350, term1622350.getClass(), "visited", false);
        setField(term1622350, term1622350.getClass(), "docInfo", null);
        setBooleanField(term1622350, term1622350.getClass(), "unknown", false);
        setBooleanField(term1622350, term1622350.getClass(), "resolved", false);
        setField(term1622350, term1622350.getClass(), "resolveResult", null);
        setField(term1622350, term1622350.getClass(), "registry", null);
        setField(term1622346, term1622346.getClass(), "typeOfThis", term1622350);
        setField(term1622346, term1622346.getClass(), "source", null);
        setField(term1622346, term1622346.getClass(), "implementedInterfaces", null);
        setField(term1622346, term1622346.getClass(), "subTypes", null);
        setField(term1622346, term1622346.getClass(), "templateTypeName", null);
        setField(term1622346, term1622346.getClass(), "className", null);
        setField(term1622346, term1622346.getClass(), "properties", null);
        setField(term1622346, term1622346.getClass(), "implicitPrototype", null);
        setBooleanField(term1622346, term1622346.getClass(), "nativeType", false);
        setBooleanField(term1622346, term1622346.getClass(), "visited", false);
        setField(term1622346, term1622346.getClass(), "docInfo", null);
        setBooleanField(term1622346, term1622346.getClass(), "unknown", false);
        setBooleanField(term1622346, term1622346.getClass(), "resolved", false);
        setField(term1622346, term1622346.getClass(), "resolveResult", null);
        setField(term1622346, term1622346.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1621446;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1620794, args);
        assertTrue(recursiveEquals(term1620794, term1622341));
        assertTrue(recursiveEquals(term1621446, term1622346));
        assertTrue(recursiveEquals(retValue, false));
    }

};


