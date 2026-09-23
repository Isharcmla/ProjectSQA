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

public class FunctionType_isSubtype_2101002158457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312974;
     Object term313230;
     Object term314063;
     Object term314067;

    public FunctionType_isSubtype_2101002158457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term314073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term314072 = ((Class) term314073).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term314072).setAccessible(true);
        Object enum570 = ((Field) term314072).get((Object) null);
        term312974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term312974, term312974.getClass(), "kind", enum570);
        Class<? extends Object> term314373 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term314372 = ((Class) term314373).getDeclaredField((String) "INTERFACE");
        ((Field) term314372).setAccessible(true);
        Object enum571 = ((Field) term314372).get((Object) null);
        term313230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term313230, term313230.getClass(), "kind", enum571);
        Class<? extends Object> term314667 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term314666 = ((Class) term314667).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term314666).setAccessible(true);
        Object enum572 = ((Field) term314666).get((Object) null);
        term314063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term314063, term314063.getClass(), "call", null);
        setField(term314063, term314063.getClass(), "prototype", null);
        setField(term314063, term314063.getClass(), "kind", enum572);
        setField(term314063, term314063.getClass(), "typeOfThis", null);
        setField(term314063, term314063.getClass(), "source", null);
        setField(term314063, term314063.getClass(), "implementedInterfaces", null);
        setField(term314063, term314063.getClass(), "subTypes", null);
        setField(term314063, term314063.getClass(), "templateTypeName", null);
        setField(term314063, term314063.getClass(), "className", null);
        setField(term314063, term314063.getClass(), "properties", null);
        setField(term314063, term314063.getClass(), "implicitPrototype", null);
        setBooleanField(term314063, term314063.getClass(), "nativeType", false);
        setBooleanField(term314063, term314063.getClass(), "visited", false);
        setField(term314063, term314063.getClass(), "docInfo", null);
        setBooleanField(term314063, term314063.getClass(), "unknown", false);
        setBooleanField(term314063, term314063.getClass(), "resolved", false);
        setField(term314063, term314063.getClass(), "resolveResult", null);
        setField(term314063, term314063.getClass(), "registry", null);
        Class<? extends Object> term314967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term314966 = ((Class) term314967).getDeclaredField((String) "INTERFACE");
        ((Field) term314966).setAccessible(true);
        Object enum573 = ((Field) term314966).get((Object) null);
        term314067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term314067, term314067.getClass(), "this$0", null);
        setField(term314067, term314067.getClass(), "call", null);
        setField(term314067, term314067.getClass(), "prototype", null);
        setField(term314067, term314067.getClass(), "kind", enum573);
        setField(term314067, term314067.getClass(), "typeOfThis", null);
        setField(term314067, term314067.getClass(), "source", null);
        setField(term314067, term314067.getClass(), "implementedInterfaces", null);
        setField(term314067, term314067.getClass(), "subTypes", null);
        setField(term314067, term314067.getClass(), "templateTypeName", null);
        setField(term314067, term314067.getClass(), "className", null);
        setField(term314067, term314067.getClass(), "properties", null);
        setField(term314067, term314067.getClass(), "implicitPrototype", null);
        setBooleanField(term314067, term314067.getClass(), "nativeType", false);
        setBooleanField(term314067, term314067.getClass(), "visited", false);
        setField(term314067, term314067.getClass(), "docInfo", null);
        setBooleanField(term314067, term314067.getClass(), "unknown", false);
        setBooleanField(term314067, term314067.getClass(), "resolved", false);
        setField(term314067, term314067.getClass(), "resolveResult", null);
        setField(term314067, term314067.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term313230;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term312974, args);
        assertTrue(recursiveEquals(term312974, term314063));
        assertTrue(recursiveEquals(term313230, term314067));
        assertTrue(recursiveEquals(retValue, true));
    }

};


