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

public class FunctionType_isSubtype_21010021581413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1822592;
     Object term1823244;
     Object term1825663;
     Object term1825668;

    public FunctionType_isSubtype_21010021581413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1825675 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1825674 = ((Class) term1825675).getDeclaredField((String) "INTERFACE");
        ((Field) term1825674).setAccessible(true);
        Object enum3400 = ((Field) term1825674).get((Object) null);
        Class<? extends Object> term1825969 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1825968 = ((Class) term1825969).getDeclaredField((String) "INTERFACE");
        ((Field) term1825968).setAccessible(true);
        Object enum3401 = ((Field) term1825968).get((Object) null);
        term1822592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1823136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1822592, term1822592.getClass(), "kind", enum3400);
        setField(term1823136, term1823136.getClass(), "kind", enum3401);
        setField(term1822592, term1822592.getClass(), "typeOfThis", term1823136);
        Class<? extends Object> term1826263 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1826262 = ((Class) term1826263).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1826262).setAccessible(true);
        Object enum3402 = ((Field) term1826262).get((Object) null);
        term1823244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1823426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1823244, term1823244.getClass(), "kind", enum3402);
        setField(term1823244, term1823244.getClass(), "typeOfThis", term1823426);
        Class<? extends Object> term1826563 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1826562 = ((Class) term1826563).getDeclaredField((String) "INTERFACE");
        ((Field) term1826562).setAccessible(true);
        Object enum3403 = ((Field) term1826562).get((Object) null);
        term1825663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1825667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1825663, term1825663.getClass(), "this$0", null);
        setField(term1825663, term1825663.getClass(), "call", null);
        setField(term1825663, term1825663.getClass(), "prototype", null);
        setField(term1825663, term1825663.getClass(), "kind", enum3403);
        setField(term1825667, term1825667.getClass(), "call", null);
        setField(term1825667, term1825667.getClass(), "prototype", null);
        setField(term1825667, term1825667.getClass(), "kind", enum3403);
        setField(term1825667, term1825667.getClass(), "typeOfThis", null);
        setField(term1825667, term1825667.getClass(), "source", null);
        setField(term1825667, term1825667.getClass(), "implementedInterfaces", null);
        setField(term1825667, term1825667.getClass(), "subTypes", null);
        setField(term1825667, term1825667.getClass(), "templateTypeName", null);
        setField(term1825667, term1825667.getClass(), "className", null);
        setField(term1825667, term1825667.getClass(), "properties", null);
        setField(term1825667, term1825667.getClass(), "implicitPrototype", null);
        setBooleanField(term1825667, term1825667.getClass(), "nativeType", false);
        setBooleanField(term1825667, term1825667.getClass(), "visited", false);
        setField(term1825667, term1825667.getClass(), "docInfo", null);
        setBooleanField(term1825667, term1825667.getClass(), "unknown", false);
        setBooleanField(term1825667, term1825667.getClass(), "resolved", false);
        setField(term1825667, term1825667.getClass(), "resolveResult", null);
        setField(term1825667, term1825667.getClass(), "registry", null);
        setField(term1825663, term1825663.getClass(), "typeOfThis", term1825667);
        setField(term1825663, term1825663.getClass(), "source", null);
        setField(term1825663, term1825663.getClass(), "implementedInterfaces", null);
        setField(term1825663, term1825663.getClass(), "subTypes", null);
        setField(term1825663, term1825663.getClass(), "templateTypeName", null);
        setField(term1825663, term1825663.getClass(), "className", null);
        setField(term1825663, term1825663.getClass(), "properties", null);
        setField(term1825663, term1825663.getClass(), "implicitPrototype", null);
        setBooleanField(term1825663, term1825663.getClass(), "nativeType", false);
        setBooleanField(term1825663, term1825663.getClass(), "visited", false);
        setField(term1825663, term1825663.getClass(), "docInfo", null);
        setBooleanField(term1825663, term1825663.getClass(), "unknown", false);
        setBooleanField(term1825663, term1825663.getClass(), "resolved", false);
        setField(term1825663, term1825663.getClass(), "resolveResult", null);
        setField(term1825663, term1825663.getClass(), "registry", null);
        Class<? extends Object> term1826857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1826856 = ((Class) term1826857).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1826856).setAccessible(true);
        Object enum3404 = ((Field) term1826856).get((Object) null);
        term1825668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1825672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1825668, term1825668.getClass(), "this$0", null);
        setField(term1825668, term1825668.getClass(), "call", null);
        setField(term1825668, term1825668.getClass(), "prototype", null);
        setField(term1825668, term1825668.getClass(), "kind", enum3404);
        setField(term1825672, term1825672.getClass(), "this$0", null);
        setField(term1825672, term1825672.getClass(), "call", null);
        setField(term1825672, term1825672.getClass(), "prototype", null);
        setField(term1825672, term1825672.getClass(), "kind", null);
        setField(term1825672, term1825672.getClass(), "typeOfThis", null);
        setField(term1825672, term1825672.getClass(), "source", null);
        setField(term1825672, term1825672.getClass(), "implementedInterfaces", null);
        setField(term1825672, term1825672.getClass(), "subTypes", null);
        setField(term1825672, term1825672.getClass(), "templateTypeName", null);
        setField(term1825672, term1825672.getClass(), "className", null);
        setField(term1825672, term1825672.getClass(), "properties", null);
        setField(term1825672, term1825672.getClass(), "implicitPrototype", null);
        setBooleanField(term1825672, term1825672.getClass(), "nativeType", false);
        setBooleanField(term1825672, term1825672.getClass(), "visited", false);
        setField(term1825672, term1825672.getClass(), "docInfo", null);
        setBooleanField(term1825672, term1825672.getClass(), "unknown", false);
        setBooleanField(term1825672, term1825672.getClass(), "resolved", false);
        setField(term1825672, term1825672.getClass(), "resolveResult", null);
        setField(term1825672, term1825672.getClass(), "registry", null);
        setField(term1825668, term1825668.getClass(), "typeOfThis", term1825672);
        setField(term1825668, term1825668.getClass(), "source", null);
        setField(term1825668, term1825668.getClass(), "implementedInterfaces", null);
        setField(term1825668, term1825668.getClass(), "subTypes", null);
        setField(term1825668, term1825668.getClass(), "templateTypeName", null);
        setField(term1825668, term1825668.getClass(), "className", null);
        setField(term1825668, term1825668.getClass(), "properties", null);
        setField(term1825668, term1825668.getClass(), "implicitPrototype", null);
        setBooleanField(term1825668, term1825668.getClass(), "nativeType", false);
        setBooleanField(term1825668, term1825668.getClass(), "visited", false);
        setField(term1825668, term1825668.getClass(), "docInfo", null);
        setBooleanField(term1825668, term1825668.getClass(), "unknown", false);
        setBooleanField(term1825668, term1825668.getClass(), "resolved", false);
        setField(term1825668, term1825668.getClass(), "resolveResult", null);
        setField(term1825668, term1825668.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1823244;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1822592, args);
        assertTrue(recursiveEquals(term1822592, term1825663));
        assertTrue(recursiveEquals(term1823244, term1825668));
        assertTrue(recursiveEquals(retValue, false));
    }

};


