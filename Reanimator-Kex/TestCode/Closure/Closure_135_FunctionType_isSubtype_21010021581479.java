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

public class FunctionType_isSubtype_21010021581479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1933191;
     Object term1933843;
     Object term1935134;
     Object term1935139;

    public FunctionType_isSubtype_21010021581479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1935149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1935148 = ((Class) term1935149).getDeclaredField((String) "ORDINARY");
        ((Field) term1935148).setAccessible(true);
        Object enum3601 = ((Field) term1935148).get((Object) null);
        term1933191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1933735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1933191, term1933191.getClass(), "kind", enum3601);
        setField(term1933735, term1933735.getClass(), "kind", enum3601);
        setField(term1933191, term1933191.getClass(), "typeOfThis", term1933735);
        Class<? extends Object> term1935440 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1935439 = ((Class) term1935440).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1935439).setAccessible(true);
        Object enum3602 = ((Field) term1935439).get((Object) null);
        Class<? extends Object> term1935740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1935739 = ((Class) term1935740).getDeclaredField((String) "INTERFACE");
        ((Field) term1935739).setAccessible(true);
        Object enum3603 = ((Field) term1935739).get((Object) null);
        term1933843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1934025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1933843, term1933843.getClass(), "kind", enum3602);
        setField(term1934025, term1934025.getClass(), "kind", enum3603);
        setField(term1933843, term1933843.getClass(), "typeOfThis", term1934025);
        Class<? extends Object> term1936034 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936033 = ((Class) term1936034).getDeclaredField((String) "INTERFACE");
        ((Field) term1936033).setAccessible(true);
        Object enum3604 = ((Field) term1936033).get((Object) null);
        term1935134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1935138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1935134, term1935134.getClass(), "this$0", null);
        setField(term1935134, term1935134.getClass(), "call", null);
        setField(term1935134, term1935134.getClass(), "prototype", null);
        setField(term1935134, term1935134.getClass(), "kind", enum3604);
        setField(term1935138, term1935138.getClass(), "call", null);
        setField(term1935138, term1935138.getClass(), "prototype", null);
        setField(term1935138, term1935138.getClass(), "kind", enum3604);
        setField(term1935138, term1935138.getClass(), "typeOfThis", null);
        setField(term1935138, term1935138.getClass(), "source", null);
        setField(term1935138, term1935138.getClass(), "implementedInterfaces", null);
        setField(term1935138, term1935138.getClass(), "subTypes", null);
        setField(term1935138, term1935138.getClass(), "templateTypeName", null);
        setField(term1935138, term1935138.getClass(), "className", null);
        setField(term1935138, term1935138.getClass(), "properties", null);
        setField(term1935138, term1935138.getClass(), "implicitPrototype", null);
        setBooleanField(term1935138, term1935138.getClass(), "nativeType", false);
        setBooleanField(term1935138, term1935138.getClass(), "visited", false);
        setField(term1935138, term1935138.getClass(), "docInfo", null);
        setBooleanField(term1935138, term1935138.getClass(), "unknown", false);
        setBooleanField(term1935138, term1935138.getClass(), "resolved", false);
        setField(term1935138, term1935138.getClass(), "resolveResult", null);
        setField(term1935138, term1935138.getClass(), "registry", null);
        setField(term1935134, term1935134.getClass(), "typeOfThis", term1935138);
        setField(term1935134, term1935134.getClass(), "source", null);
        setField(term1935134, term1935134.getClass(), "implementedInterfaces", null);
        setField(term1935134, term1935134.getClass(), "subTypes", null);
        setField(term1935134, term1935134.getClass(), "templateTypeName", null);
        setField(term1935134, term1935134.getClass(), "className", null);
        setField(term1935134, term1935134.getClass(), "properties", null);
        setField(term1935134, term1935134.getClass(), "implicitPrototype", null);
        setBooleanField(term1935134, term1935134.getClass(), "nativeType", false);
        setBooleanField(term1935134, term1935134.getClass(), "visited", false);
        setField(term1935134, term1935134.getClass(), "docInfo", null);
        setBooleanField(term1935134, term1935134.getClass(), "unknown", false);
        setBooleanField(term1935134, term1935134.getClass(), "resolved", false);
        setField(term1935134, term1935134.getClass(), "resolveResult", null);
        setField(term1935134, term1935134.getClass(), "registry", null);
        Class<? extends Object> term1936328 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936327 = ((Class) term1936328).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1936327).setAccessible(true);
        Object enum3605 = ((Field) term1936327).get((Object) null);
        Class<? extends Object> term1936628 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1936627 = ((Class) term1936628).getDeclaredField((String) "INTERFACE");
        ((Field) term1936627).setAccessible(true);
        Object enum3606 = ((Field) term1936627).get((Object) null);
        term1935139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1935143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1935139, term1935139.getClass(), "this$0", null);
        setField(term1935139, term1935139.getClass(), "call", null);
        setField(term1935139, term1935139.getClass(), "prototype", null);
        setField(term1935139, term1935139.getClass(), "kind", enum3605);
        setField(term1935143, term1935143.getClass(), "this$0", null);
        setField(term1935143, term1935143.getClass(), "call", null);
        setField(term1935143, term1935143.getClass(), "prototype", null);
        setField(term1935143, term1935143.getClass(), "kind", enum3606);
        setField(term1935143, term1935143.getClass(), "typeOfThis", null);
        setField(term1935143, term1935143.getClass(), "source", null);
        setField(term1935143, term1935143.getClass(), "implementedInterfaces", null);
        setField(term1935143, term1935143.getClass(), "subTypes", null);
        setField(term1935143, term1935143.getClass(), "templateTypeName", null);
        setField(term1935143, term1935143.getClass(), "className", null);
        setField(term1935143, term1935143.getClass(), "properties", null);
        setField(term1935143, term1935143.getClass(), "implicitPrototype", null);
        setBooleanField(term1935143, term1935143.getClass(), "nativeType", false);
        setBooleanField(term1935143, term1935143.getClass(), "visited", false);
        setField(term1935143, term1935143.getClass(), "docInfo", null);
        setBooleanField(term1935143, term1935143.getClass(), "unknown", false);
        setBooleanField(term1935143, term1935143.getClass(), "resolved", false);
        setField(term1935143, term1935143.getClass(), "resolveResult", null);
        setField(term1935143, term1935143.getClass(), "registry", null);
        setField(term1935139, term1935139.getClass(), "typeOfThis", term1935143);
        setField(term1935139, term1935139.getClass(), "source", null);
        setField(term1935139, term1935139.getClass(), "implementedInterfaces", null);
        setField(term1935139, term1935139.getClass(), "subTypes", null);
        setField(term1935139, term1935139.getClass(), "templateTypeName", null);
        setField(term1935139, term1935139.getClass(), "className", null);
        setField(term1935139, term1935139.getClass(), "properties", null);
        setField(term1935139, term1935139.getClass(), "implicitPrototype", null);
        setBooleanField(term1935139, term1935139.getClass(), "nativeType", false);
        setBooleanField(term1935139, term1935139.getClass(), "visited", false);
        setField(term1935139, term1935139.getClass(), "docInfo", null);
        setBooleanField(term1935139, term1935139.getClass(), "unknown", false);
        setBooleanField(term1935139, term1935139.getClass(), "resolved", false);
        setField(term1935139, term1935139.getClass(), "resolveResult", null);
        setField(term1935139, term1935139.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1933843;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1933191, args);
        assertTrue(recursiveEquals(term1933191, term1935134));
        assertTrue(recursiveEquals(term1933843, term1935139));
        assertTrue(recursiveEquals(retValue, false));
    }

};


