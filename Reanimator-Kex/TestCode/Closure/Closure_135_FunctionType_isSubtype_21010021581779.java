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

public class FunctionType_isSubtype_21010021581779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2438389;
     Object term2439049;
     Object term2441678;
     Object term2441683;

    public FunctionType_isSubtype_21010021581779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2441690 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2441689 = ((Class) term2441690).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2441689).setAccessible(true);
        Object enum4561 = ((Field) term2441689).get((Object) null);
        Class<? extends Object> term2441990 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2441989 = ((Class) term2441990).getDeclaredField((String) "INTERFACE");
        ((Field) term2441989).setAccessible(true);
        Object enum4562 = ((Field) term2441989).get((Object) null);
        term2438389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2438941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2438389, term2438389.getClass(), "kind", enum4561);
        setField(term2438941, term2438941.getClass(), "kind", enum4562);
        setField(term2438389, term2438389.getClass(), "typeOfThis", term2438941);
        term2439049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2439379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2439049, term2439049.getClass(), "kind", enum4561);
        setField(term2439379, term2439379.getClass(), "kind", enum4561);
        setField(term2439049, term2439049.getClass(), "typeOfThis", term2439379);
        Class<? extends Object> term2442284 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2442283 = ((Class) term2442284).getDeclaredField((String) "INTERFACE");
        ((Field) term2442283).setAccessible(true);
        Object enum4563 = ((Field) term2442283).get((Object) null);
        term2441678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2441682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2441678, term2441678.getClass(), "call", null);
        setField(term2441678, term2441678.getClass(), "prototype", null);
        setField(term2441678, term2441678.getClass(), "kind", enum4563);
        setField(term2441682, term2441682.getClass(), "this$0", null);
        setField(term2441682, term2441682.getClass(), "call", null);
        setField(term2441682, term2441682.getClass(), "prototype", null);
        setField(term2441682, term2441682.getClass(), "kind", enum4563);
        setField(term2441682, term2441682.getClass(), "typeOfThis", null);
        setField(term2441682, term2441682.getClass(), "source", null);
        setField(term2441682, term2441682.getClass(), "implementedInterfaces", null);
        setField(term2441682, term2441682.getClass(), "subTypes", null);
        setField(term2441682, term2441682.getClass(), "templateTypeName", null);
        setField(term2441682, term2441682.getClass(), "className", null);
        setField(term2441682, term2441682.getClass(), "properties", null);
        setField(term2441682, term2441682.getClass(), "implicitPrototype", null);
        setBooleanField(term2441682, term2441682.getClass(), "nativeType", false);
        setBooleanField(term2441682, term2441682.getClass(), "visited", false);
        setField(term2441682, term2441682.getClass(), "docInfo", null);
        setBooleanField(term2441682, term2441682.getClass(), "unknown", false);
        setBooleanField(term2441682, term2441682.getClass(), "resolved", false);
        setField(term2441682, term2441682.getClass(), "resolveResult", null);
        setField(term2441682, term2441682.getClass(), "registry", null);
        setField(term2441678, term2441678.getClass(), "typeOfThis", term2441682);
        setField(term2441678, term2441678.getClass(), "source", null);
        setField(term2441678, term2441678.getClass(), "implementedInterfaces", null);
        setField(term2441678, term2441678.getClass(), "subTypes", null);
        setField(term2441678, term2441678.getClass(), "templateTypeName", null);
        setField(term2441678, term2441678.getClass(), "className", null);
        setField(term2441678, term2441678.getClass(), "properties", null);
        setField(term2441678, term2441678.getClass(), "implicitPrototype", null);
        setBooleanField(term2441678, term2441678.getClass(), "nativeType", false);
        setBooleanField(term2441678, term2441678.getClass(), "visited", false);
        setField(term2441678, term2441678.getClass(), "docInfo", null);
        setBooleanField(term2441678, term2441678.getClass(), "unknown", false);
        setBooleanField(term2441678, term2441678.getClass(), "resolved", false);
        setField(term2441678, term2441678.getClass(), "resolveResult", null);
        setField(term2441678, term2441678.getClass(), "registry", null);
        Class<? extends Object> term2442578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2442577 = ((Class) term2442578).getDeclaredField((String) "INTERFACE");
        ((Field) term2442577).setAccessible(true);
        Object enum4564 = ((Field) term2442577).get((Object) null);
        term2441683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2441687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2441683, term2441683.getClass(), "this$0", null);
        setField(term2441683, term2441683.getClass(), "call", null);
        setField(term2441683, term2441683.getClass(), "prototype", null);
        setField(term2441683, term2441683.getClass(), "kind", enum4564);
        setField(term2441687, term2441687.getClass(), "this$0", null);
        setField(term2441687, term2441687.getClass(), "call", null);
        setField(term2441687, term2441687.getClass(), "prototype", null);
        setField(term2441687, term2441687.getClass(), "kind", enum4564);
        setField(term2441687, term2441687.getClass(), "typeOfThis", null);
        setField(term2441687, term2441687.getClass(), "source", null);
        setField(term2441687, term2441687.getClass(), "implementedInterfaces", null);
        setField(term2441687, term2441687.getClass(), "subTypes", null);
        setField(term2441687, term2441687.getClass(), "templateTypeName", null);
        setField(term2441687, term2441687.getClass(), "className", null);
        setField(term2441687, term2441687.getClass(), "properties", null);
        setField(term2441687, term2441687.getClass(), "implicitPrototype", null);
        setBooleanField(term2441687, term2441687.getClass(), "nativeType", false);
        setBooleanField(term2441687, term2441687.getClass(), "visited", false);
        setField(term2441687, term2441687.getClass(), "docInfo", null);
        setBooleanField(term2441687, term2441687.getClass(), "unknown", false);
        setBooleanField(term2441687, term2441687.getClass(), "resolved", false);
        setField(term2441687, term2441687.getClass(), "resolveResult", null);
        setField(term2441687, term2441687.getClass(), "registry", null);
        setField(term2441683, term2441683.getClass(), "typeOfThis", term2441687);
        setField(term2441683, term2441683.getClass(), "source", null);
        setField(term2441683, term2441683.getClass(), "implementedInterfaces", null);
        setField(term2441683, term2441683.getClass(), "subTypes", null);
        setField(term2441683, term2441683.getClass(), "templateTypeName", null);
        setField(term2441683, term2441683.getClass(), "className", null);
        setField(term2441683, term2441683.getClass(), "properties", null);
        setField(term2441683, term2441683.getClass(), "implicitPrototype", null);
        setBooleanField(term2441683, term2441683.getClass(), "nativeType", false);
        setBooleanField(term2441683, term2441683.getClass(), "visited", false);
        setField(term2441683, term2441683.getClass(), "docInfo", null);
        setBooleanField(term2441683, term2441683.getClass(), "unknown", false);
        setBooleanField(term2441683, term2441683.getClass(), "resolved", false);
        setField(term2441683, term2441683.getClass(), "resolveResult", null);
        setField(term2441683, term2441683.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2439049;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2438389, args);
        assertTrue(recursiveEquals(term2438389, term2441678));
        assertTrue(recursiveEquals(term2439049, term2441683));
        assertTrue(recursiveEquals(retValue, true));
    }

};


