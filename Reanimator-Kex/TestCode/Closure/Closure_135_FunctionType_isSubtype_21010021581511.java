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

public class FunctionType_isSubtype_21010021581511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989462;
     Object term1990178;
     Object term1991140;
     Object term1991146;

    public FunctionType_isSubtype_21010021581511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1991153 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1991152 = ((Class) term1991153).getDeclaredField((String) "INTERFACE");
        ((Field) term1991152).setAccessible(true);
        Object enum3710 = ((Field) term1991152).get((Object) null);
        Class<? extends Object> term1991447 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1991446 = ((Class) term1991447).getDeclaredField((String) "INTERFACE");
        ((Field) term1991446).setAccessible(true);
        Object enum3711 = ((Field) term1991446).get((Object) null);
        term1989462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        term1990178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1990455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1989462, term1989462.getClass(), "kind", enum3710);
        setField(term1990178, term1990178.getClass(), "kind", enum3710);
        setField(term1990455, term1990455.getClass(), "kind", enum3711);
        setField(term1990178, term1990178.getClass(), "typeOfThis", term1990455);
        setField(term1989462, term1989462.getClass(), "typeOfThis", term1990178);
        Class<? extends Object> term1991741 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1991740 = ((Class) term1991741).getDeclaredField((String) "INTERFACE");
        ((Field) term1991740).setAccessible(true);
        Object enum3712 = ((Field) term1991740).get((Object) null);
        term1991140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1991144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1991145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1991140, term1991140.getClass(), "this$0", null);
        setField(term1991140, term1991140.getClass(), "call", null);
        setField(term1991140, term1991140.getClass(), "prototype", null);
        setField(term1991140, term1991140.getClass(), "kind", enum3712);
        setField(term1991144, term1991144.getClass(), "this$0", null);
        setField(term1991144, term1991144.getClass(), "call", null);
        setField(term1991144, term1991144.getClass(), "prototype", null);
        setField(term1991144, term1991144.getClass(), "kind", enum3712);
        setField(term1991145, term1991145.getClass(), "call", null);
        setField(term1991145, term1991145.getClass(), "prototype", null);
        setField(term1991145, term1991145.getClass(), "kind", enum3712);
        setField(term1991145, term1991145.getClass(), "typeOfThis", null);
        setField(term1991145, term1991145.getClass(), "source", null);
        setField(term1991145, term1991145.getClass(), "implementedInterfaces", null);
        setField(term1991145, term1991145.getClass(), "subTypes", null);
        setField(term1991145, term1991145.getClass(), "templateTypeName", null);
        setField(term1991145, term1991145.getClass(), "className", null);
        setField(term1991145, term1991145.getClass(), "properties", null);
        setField(term1991145, term1991145.getClass(), "implicitPrototype", null);
        setBooleanField(term1991145, term1991145.getClass(), "nativeType", false);
        setBooleanField(term1991145, term1991145.getClass(), "visited", false);
        setField(term1991145, term1991145.getClass(), "docInfo", null);
        setBooleanField(term1991145, term1991145.getClass(), "unknown", false);
        setBooleanField(term1991145, term1991145.getClass(), "resolved", false);
        setField(term1991145, term1991145.getClass(), "resolveResult", null);
        setField(term1991145, term1991145.getClass(), "registry", null);
        setField(term1991144, term1991144.getClass(), "typeOfThis", term1991145);
        setField(term1991144, term1991144.getClass(), "source", null);
        setField(term1991144, term1991144.getClass(), "implementedInterfaces", null);
        setField(term1991144, term1991144.getClass(), "subTypes", null);
        setField(term1991144, term1991144.getClass(), "templateTypeName", null);
        setField(term1991144, term1991144.getClass(), "className", null);
        setField(term1991144, term1991144.getClass(), "properties", null);
        setField(term1991144, term1991144.getClass(), "implicitPrototype", null);
        setBooleanField(term1991144, term1991144.getClass(), "nativeType", false);
        setBooleanField(term1991144, term1991144.getClass(), "visited", false);
        setField(term1991144, term1991144.getClass(), "docInfo", null);
        setBooleanField(term1991144, term1991144.getClass(), "unknown", false);
        setBooleanField(term1991144, term1991144.getClass(), "resolved", false);
        setField(term1991144, term1991144.getClass(), "resolveResult", null);
        setField(term1991144, term1991144.getClass(), "registry", null);
        setField(term1991140, term1991140.getClass(), "typeOfThis", term1991144);
        setField(term1991140, term1991140.getClass(), "source", null);
        setField(term1991140, term1991140.getClass(), "implementedInterfaces", null);
        setField(term1991140, term1991140.getClass(), "subTypes", null);
        setField(term1991140, term1991140.getClass(), "templateTypeName", null);
        setField(term1991140, term1991140.getClass(), "className", null);
        setField(term1991140, term1991140.getClass(), "properties", null);
        setField(term1991140, term1991140.getClass(), "implicitPrototype", null);
        setBooleanField(term1991140, term1991140.getClass(), "nativeType", false);
        setBooleanField(term1991140, term1991140.getClass(), "visited", false);
        setField(term1991140, term1991140.getClass(), "docInfo", null);
        setBooleanField(term1991140, term1991140.getClass(), "unknown", false);
        setBooleanField(term1991140, term1991140.getClass(), "resolved", false);
        setField(term1991140, term1991140.getClass(), "resolveResult", null);
        setField(term1991140, term1991140.getClass(), "registry", null);
        Class<? extends Object> term1992035 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1992034 = ((Class) term1992035).getDeclaredField((String) "INTERFACE");
        ((Field) term1992034).setAccessible(true);
        Object enum3713 = ((Field) term1992034).get((Object) null);
        term1991146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1991150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1991146, term1991146.getClass(), "this$0", null);
        setField(term1991146, term1991146.getClass(), "call", null);
        setField(term1991146, term1991146.getClass(), "prototype", null);
        setField(term1991146, term1991146.getClass(), "kind", enum3713);
        setField(term1991150, term1991150.getClass(), "call", null);
        setField(term1991150, term1991150.getClass(), "prototype", null);
        setField(term1991150, term1991150.getClass(), "kind", enum3713);
        setField(term1991150, term1991150.getClass(), "typeOfThis", null);
        setField(term1991150, term1991150.getClass(), "source", null);
        setField(term1991150, term1991150.getClass(), "implementedInterfaces", null);
        setField(term1991150, term1991150.getClass(), "subTypes", null);
        setField(term1991150, term1991150.getClass(), "templateTypeName", null);
        setField(term1991150, term1991150.getClass(), "className", null);
        setField(term1991150, term1991150.getClass(), "properties", null);
        setField(term1991150, term1991150.getClass(), "implicitPrototype", null);
        setBooleanField(term1991150, term1991150.getClass(), "nativeType", false);
        setBooleanField(term1991150, term1991150.getClass(), "visited", false);
        setField(term1991150, term1991150.getClass(), "docInfo", null);
        setBooleanField(term1991150, term1991150.getClass(), "unknown", false);
        setBooleanField(term1991150, term1991150.getClass(), "resolved", false);
        setField(term1991150, term1991150.getClass(), "resolveResult", null);
        setField(term1991150, term1991150.getClass(), "registry", null);
        setField(term1991146, term1991146.getClass(), "typeOfThis", term1991150);
        setField(term1991146, term1991146.getClass(), "source", null);
        setField(term1991146, term1991146.getClass(), "implementedInterfaces", null);
        setField(term1991146, term1991146.getClass(), "subTypes", null);
        setField(term1991146, term1991146.getClass(), "templateTypeName", null);
        setField(term1991146, term1991146.getClass(), "className", null);
        setField(term1991146, term1991146.getClass(), "properties", null);
        setField(term1991146, term1991146.getClass(), "implicitPrototype", null);
        setBooleanField(term1991146, term1991146.getClass(), "nativeType", false);
        setBooleanField(term1991146, term1991146.getClass(), "visited", false);
        setField(term1991146, term1991146.getClass(), "docInfo", null);
        setBooleanField(term1991146, term1991146.getClass(), "unknown", false);
        setBooleanField(term1991146, term1991146.getClass(), "resolved", false);
        setField(term1991146, term1991146.getClass(), "resolveResult", null);
        setField(term1991146, term1991146.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1990178;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1989462, args);
        assertTrue(recursiveEquals(term1989462, term1991140));
        assertTrue(recursiveEquals(term1990178, term1991146));
        assertTrue(recursiveEquals(retValue, true));
    }

};


