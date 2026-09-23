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

public class FunctionType_isSubtype_21010021581189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1441958;
     Object term1442564;
     Object term1444084;
     Object term1444093;

    public FunctionType_isSubtype_21010021581189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1444103 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1444102 = ((Class) term1444103).getDeclaredField((String) "ORDINARY");
        ((Field) term1444102).setAccessible(true);
        Object enum2694 = ((Field) term1444102).get((Object) null);
        Class<? extends Object> term1444394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1444393 = ((Class) term1444394).getDeclaredField((String) "INTERFACE");
        ((Field) term1444393).setAccessible(true);
        Object enum2695 = ((Field) term1444393).get((Object) null);
        term1441958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1442214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1442456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1441958, term1441958.getClass(), "kind", enum2694);
        setField(term1442214, term1442214.getClass(), "kind", enum2695);
        setField(term1442214, term1442214.getClass(), "className", null);
        setField(term1441958, term1441958.getClass(), "typeOfThis", term1442214);
        setField(term1441958, term1441958.getClass(), "call", term1442456);
        Class<? extends Object> term1444688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1444687 = ((Class) term1444688).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1444687).setAccessible(true);
        Object enum2696 = ((Field) term1444687).get((Object) null);
        term1442564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1442820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1442564, term1442564.getClass(), "kind", enum2696);
        setField(term1442820, term1442820.getClass(), "kind", enum2695);
        setField(term1442820, term1442820.getClass(), "className", null);
        setField(term1442564, term1442564.getClass(), "typeOfThis", term1442820);
        setField(term1442564, term1442564.getClass(), "call", null);
        Class<? extends Object> term1444988 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1444987 = ((Class) term1444988).getDeclaredField((String) "ORDINARY");
        ((Field) term1444987).setAccessible(true);
        Object enum2697 = ((Field) term1444987).get((Object) null);
        Class<? extends Object> term1445279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1445278 = ((Class) term1445279).getDeclaredField((String) "INTERFACE");
        ((Field) term1445278).setAccessible(true);
        Object enum2698 = ((Field) term1445278).get((Object) null);
        term1444084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1444085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1444089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1444084, term1444084.getClass(), "this$0", null);
        setField(term1444085, term1444085.getClass(), "parameters", null);
        setField(term1444085, term1444085.getClass(), "returnType", null);
        setBooleanField(term1444085, term1444085.getClass(), "resolved", false);
        setField(term1444085, term1444085.getClass(), "resolveResult", null);
        setField(term1444085, term1444085.getClass(), "registry", null);
        setField(term1444084, term1444084.getClass(), "call", term1444085);
        setField(term1444084, term1444084.getClass(), "prototype", null);
        setField(term1444084, term1444084.getClass(), "kind", enum2697);
        setField(term1444089, term1444089.getClass(), "this$0", null);
        setField(term1444089, term1444089.getClass(), "call", null);
        setField(term1444089, term1444089.getClass(), "prototype", null);
        setField(term1444089, term1444089.getClass(), "kind", enum2698);
        setField(term1444089, term1444089.getClass(), "typeOfThis", null);
        setField(term1444089, term1444089.getClass(), "source", null);
        setField(term1444089, term1444089.getClass(), "implementedInterfaces", null);
        setField(term1444089, term1444089.getClass(), "subTypes", null);
        setField(term1444089, term1444089.getClass(), "templateTypeName", null);
        setField(term1444089, term1444089.getClass(), "className", null);
        setField(term1444089, term1444089.getClass(), "properties", null);
        setField(term1444089, term1444089.getClass(), "implicitPrototype", null);
        setBooleanField(term1444089, term1444089.getClass(), "nativeType", false);
        setBooleanField(term1444089, term1444089.getClass(), "visited", false);
        setField(term1444089, term1444089.getClass(), "docInfo", null);
        setBooleanField(term1444089, term1444089.getClass(), "unknown", false);
        setBooleanField(term1444089, term1444089.getClass(), "resolved", false);
        setField(term1444089, term1444089.getClass(), "resolveResult", null);
        setField(term1444089, term1444089.getClass(), "registry", null);
        setField(term1444084, term1444084.getClass(), "typeOfThis", term1444089);
        setField(term1444084, term1444084.getClass(), "source", null);
        setField(term1444084, term1444084.getClass(), "implementedInterfaces", null);
        setField(term1444084, term1444084.getClass(), "subTypes", null);
        setField(term1444084, term1444084.getClass(), "templateTypeName", null);
        setField(term1444084, term1444084.getClass(), "className", null);
        setField(term1444084, term1444084.getClass(), "properties", null);
        setField(term1444084, term1444084.getClass(), "implicitPrototype", null);
        setBooleanField(term1444084, term1444084.getClass(), "nativeType", false);
        setBooleanField(term1444084, term1444084.getClass(), "visited", false);
        setField(term1444084, term1444084.getClass(), "docInfo", null);
        setBooleanField(term1444084, term1444084.getClass(), "unknown", false);
        setBooleanField(term1444084, term1444084.getClass(), "resolved", false);
        setField(term1444084, term1444084.getClass(), "resolveResult", null);
        setField(term1444084, term1444084.getClass(), "registry", null);
        Class<? extends Object> term1445573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1445572 = ((Class) term1445573).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1445572).setAccessible(true);
        Object enum2699 = ((Field) term1445572).get((Object) null);
        Class<? extends Object> term1445873 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1445872 = ((Class) term1445873).getDeclaredField((String) "INTERFACE");
        ((Field) term1445872).setAccessible(true);
        Object enum2700 = ((Field) term1445872).get((Object) null);
        term1444093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1444097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1444093, term1444093.getClass(), "this$0", null);
        setField(term1444093, term1444093.getClass(), "call", null);
        setField(term1444093, term1444093.getClass(), "prototype", null);
        setField(term1444093, term1444093.getClass(), "kind", enum2699);
        setField(term1444097, term1444097.getClass(), "this$0", null);
        setField(term1444097, term1444097.getClass(), "call", null);
        setField(term1444097, term1444097.getClass(), "prototype", null);
        setField(term1444097, term1444097.getClass(), "kind", enum2700);
        setField(term1444097, term1444097.getClass(), "typeOfThis", null);
        setField(term1444097, term1444097.getClass(), "source", null);
        setField(term1444097, term1444097.getClass(), "implementedInterfaces", null);
        setField(term1444097, term1444097.getClass(), "subTypes", null);
        setField(term1444097, term1444097.getClass(), "templateTypeName", null);
        setField(term1444097, term1444097.getClass(), "className", null);
        setField(term1444097, term1444097.getClass(), "properties", null);
        setField(term1444097, term1444097.getClass(), "implicitPrototype", null);
        setBooleanField(term1444097, term1444097.getClass(), "nativeType", false);
        setBooleanField(term1444097, term1444097.getClass(), "visited", false);
        setField(term1444097, term1444097.getClass(), "docInfo", null);
        setBooleanField(term1444097, term1444097.getClass(), "unknown", false);
        setBooleanField(term1444097, term1444097.getClass(), "resolved", false);
        setField(term1444097, term1444097.getClass(), "resolveResult", null);
        setField(term1444097, term1444097.getClass(), "registry", null);
        setField(term1444093, term1444093.getClass(), "typeOfThis", term1444097);
        setField(term1444093, term1444093.getClass(), "source", null);
        setField(term1444093, term1444093.getClass(), "implementedInterfaces", null);
        setField(term1444093, term1444093.getClass(), "subTypes", null);
        setField(term1444093, term1444093.getClass(), "templateTypeName", null);
        setField(term1444093, term1444093.getClass(), "className", null);
        setField(term1444093, term1444093.getClass(), "properties", null);
        setField(term1444093, term1444093.getClass(), "implicitPrototype", null);
        setBooleanField(term1444093, term1444093.getClass(), "nativeType", false);
        setBooleanField(term1444093, term1444093.getClass(), "visited", false);
        setField(term1444093, term1444093.getClass(), "docInfo", null);
        setBooleanField(term1444093, term1444093.getClass(), "unknown", false);
        setBooleanField(term1444093, term1444093.getClass(), "resolved", false);
        setField(term1444093, term1444093.getClass(), "resolveResult", null);
        setField(term1444093, term1444093.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1442564;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1441958, args);
        assertTrue(recursiveEquals(term1441958, term1444084));
        assertTrue(recursiveEquals(term1442564, term1444093));
        assertTrue(recursiveEquals(retValue, false));
    }

};


