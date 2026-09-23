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

public class FunctionType_isSubtype_21010021581257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1559392;
     Object term1560052;
     Object term1561387;
     Object term1561395;

    public FunctionType_isSubtype_21010021581257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1561402 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1561401 = ((Class) term1561402).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1561401).setAccessible(true);
        Object enum2913 = ((Field) term1561401).get((Object) null);
        Class<? extends Object> term1561702 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1561701 = ((Class) term1561702).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1561701).setAccessible(true);
        Object enum2914 = ((Field) term1561701).get((Object) null);
        term1559392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1559944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1559392, term1559392.getClass(), "kind", enum2913);
        setField(term1559944, term1559944.getClass(), "kind", enum2914);
        setField(term1559392, term1559392.getClass(), "typeOfThis", term1559944);
        Class<? extends Object> term1562002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1562001 = ((Class) term1562002).getDeclaredField((String) "INTERFACE");
        ((Field) term1562001).setAccessible(true);
        Object enum2915 = ((Field) term1562001).get((Object) null);
        term1560052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1560382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1560052, term1560052.getClass(), "kind", enum2913);
        setField(term1560382, term1560382.getClass(), "kind", enum2915);
        setField(term1560052, term1560052.getClass(), "typeOfThis", term1560382);
        Class<? extends Object> term1562296 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1562295 = ((Class) term1562296).getDeclaredField((String) "INTERFACE");
        ((Field) term1562295).setAccessible(true);
        Object enum2916 = ((Field) term1562295).get((Object) null);
        Class<? extends Object> term1562590 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1562589 = ((Class) term1562590).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1562589).setAccessible(true);
        Object enum2917 = ((Field) term1562589).get((Object) null);
        term1561387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1561391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1561387, term1561387.getClass(), "call", null);
        setField(term1561387, term1561387.getClass(), "prototype", null);
        setField(term1561387, term1561387.getClass(), "kind", enum2916);
        setField(term1561391, term1561391.getClass(), "this$0", null);
        setField(term1561391, term1561391.getClass(), "call", null);
        setField(term1561391, term1561391.getClass(), "prototype", null);
        setField(term1561391, term1561391.getClass(), "kind", enum2917);
        setField(term1561391, term1561391.getClass(), "typeOfThis", null);
        setField(term1561391, term1561391.getClass(), "source", null);
        setField(term1561391, term1561391.getClass(), "implementedInterfaces", null);
        setField(term1561391, term1561391.getClass(), "subTypes", null);
        setField(term1561391, term1561391.getClass(), "templateTypeName", null);
        setField(term1561391, term1561391.getClass(), "className", null);
        setField(term1561391, term1561391.getClass(), "properties", null);
        setField(term1561391, term1561391.getClass(), "implicitPrototype", null);
        setBooleanField(term1561391, term1561391.getClass(), "nativeType", false);
        setBooleanField(term1561391, term1561391.getClass(), "visited", false);
        setField(term1561391, term1561391.getClass(), "docInfo", null);
        setBooleanField(term1561391, term1561391.getClass(), "unknown", false);
        setBooleanField(term1561391, term1561391.getClass(), "resolved", false);
        setField(term1561391, term1561391.getClass(), "resolveResult", null);
        setField(term1561391, term1561391.getClass(), "registry", null);
        setField(term1561387, term1561387.getClass(), "typeOfThis", term1561391);
        setField(term1561387, term1561387.getClass(), "source", null);
        setField(term1561387, term1561387.getClass(), "implementedInterfaces", null);
        setField(term1561387, term1561387.getClass(), "subTypes", null);
        setField(term1561387, term1561387.getClass(), "templateTypeName", null);
        setField(term1561387, term1561387.getClass(), "className", null);
        setField(term1561387, term1561387.getClass(), "properties", null);
        setField(term1561387, term1561387.getClass(), "implicitPrototype", null);
        setBooleanField(term1561387, term1561387.getClass(), "nativeType", false);
        setBooleanField(term1561387, term1561387.getClass(), "visited", false);
        setField(term1561387, term1561387.getClass(), "docInfo", null);
        setBooleanField(term1561387, term1561387.getClass(), "unknown", false);
        setBooleanField(term1561387, term1561387.getClass(), "resolved", false);
        setField(term1561387, term1561387.getClass(), "resolveResult", null);
        setField(term1561387, term1561387.getClass(), "registry", null);
        Class<? extends Object> term1562890 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1562889 = ((Class) term1562890).getDeclaredField((String) "INTERFACE");
        ((Field) term1562889).setAccessible(true);
        Object enum2918 = ((Field) term1562889).get((Object) null);
        term1561395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1561399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1561395, term1561395.getClass(), "this$0", null);
        setField(term1561395, term1561395.getClass(), "call", null);
        setField(term1561395, term1561395.getClass(), "prototype", null);
        setField(term1561395, term1561395.getClass(), "kind", enum2918);
        setField(term1561399, term1561399.getClass(), "this$0", null);
        setField(term1561399, term1561399.getClass(), "call", null);
        setField(term1561399, term1561399.getClass(), "prototype", null);
        setField(term1561399, term1561399.getClass(), "kind", enum2918);
        setField(term1561399, term1561399.getClass(), "typeOfThis", null);
        setField(term1561399, term1561399.getClass(), "source", null);
        setField(term1561399, term1561399.getClass(), "implementedInterfaces", null);
        setField(term1561399, term1561399.getClass(), "subTypes", null);
        setField(term1561399, term1561399.getClass(), "templateTypeName", null);
        setField(term1561399, term1561399.getClass(), "className", null);
        setField(term1561399, term1561399.getClass(), "properties", null);
        setField(term1561399, term1561399.getClass(), "implicitPrototype", null);
        setBooleanField(term1561399, term1561399.getClass(), "nativeType", false);
        setBooleanField(term1561399, term1561399.getClass(), "visited", false);
        setField(term1561399, term1561399.getClass(), "docInfo", null);
        setBooleanField(term1561399, term1561399.getClass(), "unknown", false);
        setBooleanField(term1561399, term1561399.getClass(), "resolved", false);
        setField(term1561399, term1561399.getClass(), "resolveResult", null);
        setField(term1561399, term1561399.getClass(), "registry", null);
        setField(term1561395, term1561395.getClass(), "typeOfThis", term1561399);
        setField(term1561395, term1561395.getClass(), "source", null);
        setField(term1561395, term1561395.getClass(), "implementedInterfaces", null);
        setField(term1561395, term1561395.getClass(), "subTypes", null);
        setField(term1561395, term1561395.getClass(), "templateTypeName", null);
        setField(term1561395, term1561395.getClass(), "className", null);
        setField(term1561395, term1561395.getClass(), "properties", null);
        setField(term1561395, term1561395.getClass(), "implicitPrototype", null);
        setBooleanField(term1561395, term1561395.getClass(), "nativeType", false);
        setBooleanField(term1561395, term1561395.getClass(), "visited", false);
        setField(term1561395, term1561395.getClass(), "docInfo", null);
        setBooleanField(term1561395, term1561395.getClass(), "unknown", false);
        setBooleanField(term1561395, term1561395.getClass(), "resolved", false);
        setField(term1561395, term1561395.getClass(), "resolveResult", null);
        setField(term1561395, term1561395.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1560052;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1559392, args);
        assertTrue(recursiveEquals(term1559392, term1561387));
        assertTrue(recursiveEquals(term1560052, term1561395));
        assertTrue(recursiveEquals(retValue, true));
    }

};


