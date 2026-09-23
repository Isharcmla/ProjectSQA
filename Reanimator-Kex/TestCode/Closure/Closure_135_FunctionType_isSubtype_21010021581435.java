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

public class FunctionType_isSubtype_21010021581435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860389;
     Object term1861041;
     Object term1862112;
     Object term1862120;

    public FunctionType_isSubtype_21010021581435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1862130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1862129 = ((Class) term1862130).getDeclaredField((String) "ORDINARY");
        ((Field) term1862129).setAccessible(true);
        Object enum3466 = ((Field) term1862129).get((Object) null);
        Class<? extends Object> term1862421 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1862420 = ((Class) term1862421).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1862420).setAccessible(true);
        Object enum3467 = ((Field) term1862420).get((Object) null);
        term1860389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1860933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1860389, term1860389.getClass(), "kind", enum3466);
        setField(term1860933, term1860933.getClass(), "kind", enum3467);
        setField(term1860389, term1860389.getClass(), "typeOfThis", term1860933);
        term1861041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1861223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1861041, term1861041.getClass(), "kind", enum3467);
        setField(term1861223, term1861223.getClass(), "kind", enum3466);
        setField(term1861041, term1861041.getClass(), "typeOfThis", term1861223);
        Class<? extends Object> term1862721 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1862720 = ((Class) term1862721).getDeclaredField((String) "INTERFACE");
        ((Field) term1862720).setAccessible(true);
        Object enum3468 = ((Field) term1862720).get((Object) null);
        Class<? extends Object> term1863015 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1863014 = ((Class) term1863015).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1863014).setAccessible(true);
        Object enum3469 = ((Field) term1863014).get((Object) null);
        term1862112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1862116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1862112, term1862112.getClass(), "this$0", null);
        setField(term1862112, term1862112.getClass(), "call", null);
        setField(term1862112, term1862112.getClass(), "prototype", null);
        setField(term1862112, term1862112.getClass(), "kind", enum3468);
        setField(term1862116, term1862116.getClass(), "call", null);
        setField(term1862116, term1862116.getClass(), "prototype", null);
        setField(term1862116, term1862116.getClass(), "kind", enum3469);
        setField(term1862116, term1862116.getClass(), "typeOfThis", null);
        setField(term1862116, term1862116.getClass(), "source", null);
        setField(term1862116, term1862116.getClass(), "implementedInterfaces", null);
        setField(term1862116, term1862116.getClass(), "subTypes", null);
        setField(term1862116, term1862116.getClass(), "templateTypeName", null);
        setField(term1862116, term1862116.getClass(), "className", null);
        setField(term1862116, term1862116.getClass(), "properties", null);
        setField(term1862116, term1862116.getClass(), "implicitPrototype", null);
        setBooleanField(term1862116, term1862116.getClass(), "nativeType", false);
        setBooleanField(term1862116, term1862116.getClass(), "visited", false);
        setField(term1862116, term1862116.getClass(), "docInfo", null);
        setBooleanField(term1862116, term1862116.getClass(), "unknown", false);
        setBooleanField(term1862116, term1862116.getClass(), "resolved", false);
        setField(term1862116, term1862116.getClass(), "resolveResult", null);
        setField(term1862116, term1862116.getClass(), "registry", null);
        setField(term1862112, term1862112.getClass(), "typeOfThis", term1862116);
        setField(term1862112, term1862112.getClass(), "source", null);
        setField(term1862112, term1862112.getClass(), "implementedInterfaces", null);
        setField(term1862112, term1862112.getClass(), "subTypes", null);
        setField(term1862112, term1862112.getClass(), "templateTypeName", null);
        setField(term1862112, term1862112.getClass(), "className", null);
        setField(term1862112, term1862112.getClass(), "properties", null);
        setField(term1862112, term1862112.getClass(), "implicitPrototype", null);
        setBooleanField(term1862112, term1862112.getClass(), "nativeType", false);
        setBooleanField(term1862112, term1862112.getClass(), "visited", false);
        setField(term1862112, term1862112.getClass(), "docInfo", null);
        setBooleanField(term1862112, term1862112.getClass(), "unknown", false);
        setBooleanField(term1862112, term1862112.getClass(), "resolved", false);
        setField(term1862112, term1862112.getClass(), "resolveResult", null);
        setField(term1862112, term1862112.getClass(), "registry", null);
        Class<? extends Object> term1863315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1863314 = ((Class) term1863315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1863314).setAccessible(true);
        Object enum3470 = ((Field) term1863314).get((Object) null);
        Class<? extends Object> term1863615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1863614 = ((Class) term1863615).getDeclaredField((String) "INTERFACE");
        ((Field) term1863614).setAccessible(true);
        Object enum3471 = ((Field) term1863614).get((Object) null);
        term1862120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1862124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1862120, term1862120.getClass(), "this$0", null);
        setField(term1862120, term1862120.getClass(), "call", null);
        setField(term1862120, term1862120.getClass(), "prototype", null);
        setField(term1862120, term1862120.getClass(), "kind", enum3470);
        setField(term1862124, term1862124.getClass(), "this$0", null);
        setField(term1862124, term1862124.getClass(), "call", null);
        setField(term1862124, term1862124.getClass(), "prototype", null);
        setField(term1862124, term1862124.getClass(), "kind", enum3471);
        setField(term1862124, term1862124.getClass(), "typeOfThis", null);
        setField(term1862124, term1862124.getClass(), "source", null);
        setField(term1862124, term1862124.getClass(), "implementedInterfaces", null);
        setField(term1862124, term1862124.getClass(), "subTypes", null);
        setField(term1862124, term1862124.getClass(), "templateTypeName", null);
        setField(term1862124, term1862124.getClass(), "className", null);
        setField(term1862124, term1862124.getClass(), "properties", null);
        setField(term1862124, term1862124.getClass(), "implicitPrototype", null);
        setBooleanField(term1862124, term1862124.getClass(), "nativeType", false);
        setBooleanField(term1862124, term1862124.getClass(), "visited", false);
        setField(term1862124, term1862124.getClass(), "docInfo", null);
        setBooleanField(term1862124, term1862124.getClass(), "unknown", false);
        setBooleanField(term1862124, term1862124.getClass(), "resolved", false);
        setField(term1862124, term1862124.getClass(), "resolveResult", null);
        setField(term1862124, term1862124.getClass(), "registry", null);
        setField(term1862120, term1862120.getClass(), "typeOfThis", term1862124);
        setField(term1862120, term1862120.getClass(), "source", null);
        setField(term1862120, term1862120.getClass(), "implementedInterfaces", null);
        setField(term1862120, term1862120.getClass(), "subTypes", null);
        setField(term1862120, term1862120.getClass(), "templateTypeName", null);
        setField(term1862120, term1862120.getClass(), "className", null);
        setField(term1862120, term1862120.getClass(), "properties", null);
        setField(term1862120, term1862120.getClass(), "implicitPrototype", null);
        setBooleanField(term1862120, term1862120.getClass(), "nativeType", false);
        setBooleanField(term1862120, term1862120.getClass(), "visited", false);
        setField(term1862120, term1862120.getClass(), "docInfo", null);
        setBooleanField(term1862120, term1862120.getClass(), "unknown", false);
        setBooleanField(term1862120, term1862120.getClass(), "resolved", false);
        setField(term1862120, term1862120.getClass(), "resolveResult", null);
        setField(term1862120, term1862120.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1861041;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1860389, args);
        assertTrue(recursiveEquals(term1860389, term1862112));
        assertTrue(recursiveEquals(term1861041, term1862120));
        assertTrue(recursiveEquals(retValue, false));
    }

};


