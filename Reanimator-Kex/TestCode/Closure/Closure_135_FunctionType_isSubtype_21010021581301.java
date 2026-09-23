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

public class FunctionType_isSubtype_21010021581301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1632634;
     Object term1633084;
     Object term1635466;
     Object term1635472;

    public FunctionType_isSubtype_21010021581301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1635483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1635482 = ((Class) term1635483).getDeclaredField((String) "ORDINARY");
        ((Field) term1635482).setAccessible(true);
        Object enum3045 = ((Field) term1635482).get((Object) null);
        term1632634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1632882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1632976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1632634, term1632634.getClass(), "kind", enum3045);
        setField(term1632882, term1632882.getClass(), "kind", enum3045);
        setField(term1632634, term1632634.getClass(), "typeOfThis", term1632882);
        setField(term1632634, term1632634.getClass(), "call", term1632976);
        Class<? extends Object> term1635774 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1635773 = ((Class) term1635774).getDeclaredField((String) "INTERFACE");
        ((Field) term1635773).setAccessible(true);
        Object enum3046 = ((Field) term1635773).get((Object) null);
        term1633084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1633266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1633508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1633084, term1633084.getClass(), "kind", enum3045);
        setField(term1633266, term1633266.getClass(), "kind", enum3046);
        setField(term1633084, term1633084.getClass(), "typeOfThis", term1633266);
        setField(term1633084, term1633084.getClass(), "call", term1633508);
        Class<? extends Object> term1636068 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1636067 = ((Class) term1636068).getDeclaredField((String) "ORDINARY");
        ((Field) term1636067).setAccessible(true);
        Object enum3047 = ((Field) term1636067).get((Object) null);
        term1635466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1635467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1635471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1635466, term1635466.getClass(), "this$0", null);
        setField(term1635467, term1635467.getClass(), "parameters", null);
        setField(term1635467, term1635467.getClass(), "returnType", null);
        setBooleanField(term1635467, term1635467.getClass(), "resolved", false);
        setField(term1635467, term1635467.getClass(), "resolveResult", null);
        setField(term1635467, term1635467.getClass(), "registry", null);
        setField(term1635466, term1635466.getClass(), "call", term1635467);
        setField(term1635466, term1635466.getClass(), "prototype", null);
        setField(term1635466, term1635466.getClass(), "kind", enum3047);
        setField(term1635471, term1635471.getClass(), "call", null);
        setField(term1635471, term1635471.getClass(), "prototype", null);
        setField(term1635471, term1635471.getClass(), "kind", enum3047);
        setField(term1635471, term1635471.getClass(), "typeOfThis", null);
        setField(term1635471, term1635471.getClass(), "source", null);
        setField(term1635471, term1635471.getClass(), "implementedInterfaces", null);
        setField(term1635471, term1635471.getClass(), "subTypes", null);
        setField(term1635471, term1635471.getClass(), "templateTypeName", null);
        setField(term1635471, term1635471.getClass(), "className", null);
        setField(term1635471, term1635471.getClass(), "properties", null);
        setField(term1635471, term1635471.getClass(), "implicitPrototype", null);
        setBooleanField(term1635471, term1635471.getClass(), "nativeType", false);
        setBooleanField(term1635471, term1635471.getClass(), "visited", false);
        setField(term1635471, term1635471.getClass(), "docInfo", null);
        setBooleanField(term1635471, term1635471.getClass(), "unknown", false);
        setBooleanField(term1635471, term1635471.getClass(), "resolved", false);
        setField(term1635471, term1635471.getClass(), "resolveResult", null);
        setField(term1635471, term1635471.getClass(), "registry", null);
        setField(term1635466, term1635466.getClass(), "typeOfThis", term1635471);
        setField(term1635466, term1635466.getClass(), "source", null);
        setField(term1635466, term1635466.getClass(), "implementedInterfaces", null);
        setField(term1635466, term1635466.getClass(), "subTypes", null);
        setField(term1635466, term1635466.getClass(), "templateTypeName", null);
        setField(term1635466, term1635466.getClass(), "className", null);
        setField(term1635466, term1635466.getClass(), "properties", null);
        setField(term1635466, term1635466.getClass(), "implicitPrototype", null);
        setBooleanField(term1635466, term1635466.getClass(), "nativeType", false);
        setBooleanField(term1635466, term1635466.getClass(), "visited", false);
        setField(term1635466, term1635466.getClass(), "docInfo", null);
        setBooleanField(term1635466, term1635466.getClass(), "unknown", false);
        setBooleanField(term1635466, term1635466.getClass(), "resolved", false);
        setField(term1635466, term1635466.getClass(), "resolveResult", null);
        setField(term1635466, term1635466.getClass(), "registry", null);
        Class<? extends Object> term1636359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1636358 = ((Class) term1636359).getDeclaredField((String) "ORDINARY");
        ((Field) term1636358).setAccessible(true);
        Object enum3048 = ((Field) term1636358).get((Object) null);
        Class<? extends Object> term1636650 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1636649 = ((Class) term1636650).getDeclaredField((String) "INTERFACE");
        ((Field) term1636649).setAccessible(true);
        Object enum3049 = ((Field) term1636649).get((Object) null);
        term1635472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1635473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1635477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1635472, term1635472.getClass(), "this$0", null);
        setField(term1635473, term1635473.getClass(), "parameters", null);
        setField(term1635473, term1635473.getClass(), "returnType", null);
        setBooleanField(term1635473, term1635473.getClass(), "resolved", false);
        setField(term1635473, term1635473.getClass(), "resolveResult", null);
        setField(term1635473, term1635473.getClass(), "registry", null);
        setField(term1635472, term1635472.getClass(), "call", term1635473);
        setField(term1635472, term1635472.getClass(), "prototype", null);
        setField(term1635472, term1635472.getClass(), "kind", enum3048);
        setField(term1635477, term1635477.getClass(), "this$0", null);
        setField(term1635477, term1635477.getClass(), "call", null);
        setField(term1635477, term1635477.getClass(), "prototype", null);
        setField(term1635477, term1635477.getClass(), "kind", enum3049);
        setField(term1635477, term1635477.getClass(), "typeOfThis", null);
        setField(term1635477, term1635477.getClass(), "source", null);
        setField(term1635477, term1635477.getClass(), "implementedInterfaces", null);
        setField(term1635477, term1635477.getClass(), "subTypes", null);
        setField(term1635477, term1635477.getClass(), "templateTypeName", null);
        setField(term1635477, term1635477.getClass(), "className", null);
        setField(term1635477, term1635477.getClass(), "properties", null);
        setField(term1635477, term1635477.getClass(), "implicitPrototype", null);
        setBooleanField(term1635477, term1635477.getClass(), "nativeType", false);
        setBooleanField(term1635477, term1635477.getClass(), "visited", false);
        setField(term1635477, term1635477.getClass(), "docInfo", null);
        setBooleanField(term1635477, term1635477.getClass(), "unknown", false);
        setBooleanField(term1635477, term1635477.getClass(), "resolved", false);
        setField(term1635477, term1635477.getClass(), "resolveResult", null);
        setField(term1635477, term1635477.getClass(), "registry", null);
        setField(term1635472, term1635472.getClass(), "typeOfThis", term1635477);
        setField(term1635472, term1635472.getClass(), "source", null);
        setField(term1635472, term1635472.getClass(), "implementedInterfaces", null);
        setField(term1635472, term1635472.getClass(), "subTypes", null);
        setField(term1635472, term1635472.getClass(), "templateTypeName", null);
        setField(term1635472, term1635472.getClass(), "className", null);
        setField(term1635472, term1635472.getClass(), "properties", null);
        setField(term1635472, term1635472.getClass(), "implicitPrototype", null);
        setBooleanField(term1635472, term1635472.getClass(), "nativeType", false);
        setBooleanField(term1635472, term1635472.getClass(), "visited", false);
        setField(term1635472, term1635472.getClass(), "docInfo", null);
        setBooleanField(term1635472, term1635472.getClass(), "unknown", false);
        setBooleanField(term1635472, term1635472.getClass(), "resolved", false);
        setField(term1635472, term1635472.getClass(), "resolveResult", null);
        setField(term1635472, term1635472.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1633084;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1632634, args);
        assertTrue(recursiveEquals(term1632634, term1635466));
        assertTrue(recursiveEquals(term1633084, term1635472));
        assertTrue(recursiveEquals(retValue, true));
    }

};


