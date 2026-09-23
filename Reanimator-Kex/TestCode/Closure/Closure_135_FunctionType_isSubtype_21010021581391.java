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

public class FunctionType_isSubtype_21010021581391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790586;
     Object term1791338;
     Object term1792414;
     Object term1792420;

    public FunctionType_isSubtype_21010021581391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1792430 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1792429 = ((Class) term1792430).getDeclaredField((String) "INTERFACE");
        ((Field) term1792429).setAccessible(true);
        Object enum3339 = ((Field) term1792429).get((Object) null);
        term1790586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1791130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1791230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1790586, term1790586.getClass(), "kind", enum3339);
        setField(term1791130, term1791130.getClass(), "kind", enum3339);
        setField(term1791130, term1791130.getClass(), "typeOfThis", term1791230);
        setField(term1790586, term1790586.getClass(), "typeOfThis", term1791130);
        Class<? extends Object> term1792724 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1792723 = ((Class) term1792724).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1792723).setAccessible(true);
        Object enum3340 = ((Field) term1792723).get((Object) null);
        term1791338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1791520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1791338, term1791338.getClass(), "kind", enum3340);
        setField(term1791520, term1791520.getClass(), "kind", enum3339);
        setField(term1791520, term1791520.getClass(), "typeOfThis", term1791338);
        setField(term1791338, term1791338.getClass(), "typeOfThis", term1791520);
        Class<? extends Object> term1793024 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1793023 = ((Class) term1793024).getDeclaredField((String) "INTERFACE");
        ((Field) term1793023).setAccessible(true);
        Object enum3341 = ((Field) term1793023).get((Object) null);
        term1792414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1792418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1792419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1792414, term1792414.getClass(), "this$0", null);
        setField(term1792414, term1792414.getClass(), "call", null);
        setField(term1792414, term1792414.getClass(), "prototype", null);
        setField(term1792414, term1792414.getClass(), "kind", enum3341);
        setField(term1792418, term1792418.getClass(), "call", null);
        setField(term1792418, term1792418.getClass(), "prototype", null);
        setField(term1792418, term1792418.getClass(), "kind", enum3341);
        setField(term1792419, term1792419.getClass(), "call", null);
        setField(term1792419, term1792419.getClass(), "prototype", null);
        setField(term1792419, term1792419.getClass(), "kind", null);
        setField(term1792419, term1792419.getClass(), "typeOfThis", null);
        setField(term1792419, term1792419.getClass(), "source", null);
        setField(term1792419, term1792419.getClass(), "implementedInterfaces", null);
        setField(term1792419, term1792419.getClass(), "subTypes", null);
        setField(term1792419, term1792419.getClass(), "templateTypeName", null);
        setField(term1792419, term1792419.getClass(), "className", null);
        setField(term1792419, term1792419.getClass(), "properties", null);
        setField(term1792419, term1792419.getClass(), "implicitPrototype", null);
        setBooleanField(term1792419, term1792419.getClass(), "nativeType", false);
        setBooleanField(term1792419, term1792419.getClass(), "visited", false);
        setField(term1792419, term1792419.getClass(), "docInfo", null);
        setBooleanField(term1792419, term1792419.getClass(), "unknown", false);
        setBooleanField(term1792419, term1792419.getClass(), "resolved", false);
        setField(term1792419, term1792419.getClass(), "resolveResult", null);
        setField(term1792419, term1792419.getClass(), "registry", null);
        setField(term1792418, term1792418.getClass(), "typeOfThis", term1792419);
        setField(term1792418, term1792418.getClass(), "source", null);
        setField(term1792418, term1792418.getClass(), "implementedInterfaces", null);
        setField(term1792418, term1792418.getClass(), "subTypes", null);
        setField(term1792418, term1792418.getClass(), "templateTypeName", null);
        setField(term1792418, term1792418.getClass(), "className", null);
        setField(term1792418, term1792418.getClass(), "properties", null);
        setField(term1792418, term1792418.getClass(), "implicitPrototype", null);
        setBooleanField(term1792418, term1792418.getClass(), "nativeType", false);
        setBooleanField(term1792418, term1792418.getClass(), "visited", false);
        setField(term1792418, term1792418.getClass(), "docInfo", null);
        setBooleanField(term1792418, term1792418.getClass(), "unknown", false);
        setBooleanField(term1792418, term1792418.getClass(), "resolved", false);
        setField(term1792418, term1792418.getClass(), "resolveResult", null);
        setField(term1792418, term1792418.getClass(), "registry", null);
        setField(term1792414, term1792414.getClass(), "typeOfThis", term1792418);
        setField(term1792414, term1792414.getClass(), "source", null);
        setField(term1792414, term1792414.getClass(), "implementedInterfaces", null);
        setField(term1792414, term1792414.getClass(), "subTypes", null);
        setField(term1792414, term1792414.getClass(), "templateTypeName", null);
        setField(term1792414, term1792414.getClass(), "className", null);
        setField(term1792414, term1792414.getClass(), "properties", null);
        setField(term1792414, term1792414.getClass(), "implicitPrototype", null);
        setBooleanField(term1792414, term1792414.getClass(), "nativeType", false);
        setBooleanField(term1792414, term1792414.getClass(), "visited", false);
        setField(term1792414, term1792414.getClass(), "docInfo", null);
        setBooleanField(term1792414, term1792414.getClass(), "unknown", false);
        setBooleanField(term1792414, term1792414.getClass(), "resolved", false);
        setField(term1792414, term1792414.getClass(), "resolveResult", null);
        setField(term1792414, term1792414.getClass(), "registry", null);
        Class<? extends Object> term1793318 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1793317 = ((Class) term1793318).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1793317).setAccessible(true);
        Object enum3342 = ((Field) term1793317).get((Object) null);
        Class<? extends Object> term1793618 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1793617 = ((Class) term1793618).getDeclaredField((String) "INTERFACE");
        ((Field) term1793617).setAccessible(true);
        Object enum3343 = ((Field) term1793617).get((Object) null);
        term1792420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1792424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1792420, term1792420.getClass(), "this$0", null);
        setField(term1792420, term1792420.getClass(), "call", null);
        setField(term1792420, term1792420.getClass(), "prototype", null);
        setField(term1792420, term1792420.getClass(), "kind", enum3342);
        setField(term1792424, term1792424.getClass(), "this$0", null);
        setField(term1792424, term1792424.getClass(), "call", null);
        setField(term1792424, term1792424.getClass(), "prototype", null);
        setField(term1792424, term1792424.getClass(), "kind", enum3343);
        setField(term1792424, term1792424.getClass(), "typeOfThis", term1792420);
        setField(term1792424, term1792424.getClass(), "source", null);
        setField(term1792424, term1792424.getClass(), "implementedInterfaces", null);
        setField(term1792424, term1792424.getClass(), "subTypes", null);
        setField(term1792424, term1792424.getClass(), "templateTypeName", null);
        setField(term1792424, term1792424.getClass(), "className", null);
        setField(term1792424, term1792424.getClass(), "properties", null);
        setField(term1792424, term1792424.getClass(), "implicitPrototype", null);
        setBooleanField(term1792424, term1792424.getClass(), "nativeType", false);
        setBooleanField(term1792424, term1792424.getClass(), "visited", false);
        setField(term1792424, term1792424.getClass(), "docInfo", null);
        setBooleanField(term1792424, term1792424.getClass(), "unknown", false);
        setBooleanField(term1792424, term1792424.getClass(), "resolved", false);
        setField(term1792424, term1792424.getClass(), "resolveResult", null);
        setField(term1792424, term1792424.getClass(), "registry", null);
        setField(term1792420, term1792420.getClass(), "typeOfThis", term1792424);
        setField(term1792420, term1792420.getClass(), "source", null);
        setField(term1792420, term1792420.getClass(), "implementedInterfaces", null);
        setField(term1792420, term1792420.getClass(), "subTypes", null);
        setField(term1792420, term1792420.getClass(), "templateTypeName", null);
        setField(term1792420, term1792420.getClass(), "className", null);
        setField(term1792420, term1792420.getClass(), "properties", null);
        setField(term1792420, term1792420.getClass(), "implicitPrototype", null);
        setBooleanField(term1792420, term1792420.getClass(), "nativeType", false);
        setBooleanField(term1792420, term1792420.getClass(), "visited", false);
        setField(term1792420, term1792420.getClass(), "docInfo", null);
        setBooleanField(term1792420, term1792420.getClass(), "unknown", false);
        setBooleanField(term1792420, term1792420.getClass(), "resolved", false);
        setField(term1792420, term1792420.getClass(), "resolveResult", null);
        setField(term1792420, term1792420.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1791338;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1790586, args);
        assertTrue(recursiveEquals(term1790586, term1792414));
        assertTrue(recursiveEquals(term1791338, term1792420));
        assertTrue(recursiveEquals(retValue, false));
    }

};


