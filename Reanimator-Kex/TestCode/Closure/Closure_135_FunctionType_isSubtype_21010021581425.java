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

public class FunctionType_isSubtype_21010021581425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843774;
     Object term1844434;
     Object term1845152;
     Object term1845157;

    public FunctionType_isSubtype_21010021581425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1845164 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1845163 = ((Class) term1845164).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1845163).setAccessible(true);
        Object enum3436 = ((Field) term1845163).get((Object) null);
        term1843774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1844326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1843774, term1843774.getClass(), "kind", enum3436);
        setField(term1843774, term1843774.getClass(), "typeOfThis", term1844326);
        term1844434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1844756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1844434, term1844434.getClass(), "kind", enum3436);
        setField(term1844434, term1844434.getClass(), "typeOfThis", term1844756);
        Class<? extends Object> term1845464 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1845463 = ((Class) term1845464).getDeclaredField((String) "INTERFACE");
        ((Field) term1845463).setAccessible(true);
        Object enum3437 = ((Field) term1845463).get((Object) null);
        term1845152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1845156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1845152, term1845152.getClass(), "this$0", null);
        setField(term1845152, term1845152.getClass(), "call", null);
        setField(term1845152, term1845152.getClass(), "prototype", null);
        setField(term1845152, term1845152.getClass(), "kind", enum3437);
        setField(term1845156, term1845156.getClass(), "this$0", null);
        setField(term1845156, term1845156.getClass(), "call", null);
        setField(term1845156, term1845156.getClass(), "prototype", null);
        setField(term1845156, term1845156.getClass(), "kind", null);
        setField(term1845156, term1845156.getClass(), "typeOfThis", null);
        setField(term1845156, term1845156.getClass(), "source", null);
        setField(term1845156, term1845156.getClass(), "implementedInterfaces", null);
        setField(term1845156, term1845156.getClass(), "subTypes", null);
        setField(term1845156, term1845156.getClass(), "templateTypeName", null);
        setField(term1845156, term1845156.getClass(), "className", null);
        setField(term1845156, term1845156.getClass(), "properties", null);
        setField(term1845156, term1845156.getClass(), "implicitPrototype", null);
        setBooleanField(term1845156, term1845156.getClass(), "nativeType", false);
        setBooleanField(term1845156, term1845156.getClass(), "visited", false);
        setField(term1845156, term1845156.getClass(), "docInfo", null);
        setBooleanField(term1845156, term1845156.getClass(), "unknown", false);
        setBooleanField(term1845156, term1845156.getClass(), "resolved", false);
        setField(term1845156, term1845156.getClass(), "resolveResult", null);
        setField(term1845156, term1845156.getClass(), "registry", null);
        setField(term1845152, term1845152.getClass(), "typeOfThis", term1845156);
        setField(term1845152, term1845152.getClass(), "source", null);
        setField(term1845152, term1845152.getClass(), "implementedInterfaces", null);
        setField(term1845152, term1845152.getClass(), "subTypes", null);
        setField(term1845152, term1845152.getClass(), "templateTypeName", null);
        setField(term1845152, term1845152.getClass(), "className", null);
        setField(term1845152, term1845152.getClass(), "properties", null);
        setField(term1845152, term1845152.getClass(), "implicitPrototype", null);
        setBooleanField(term1845152, term1845152.getClass(), "nativeType", false);
        setBooleanField(term1845152, term1845152.getClass(), "visited", false);
        setField(term1845152, term1845152.getClass(), "docInfo", null);
        setBooleanField(term1845152, term1845152.getClass(), "unknown", false);
        setBooleanField(term1845152, term1845152.getClass(), "resolved", false);
        setField(term1845152, term1845152.getClass(), "resolveResult", null);
        setField(term1845152, term1845152.getClass(), "registry", null);
        Class<? extends Object> term1845758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1845757 = ((Class) term1845758).getDeclaredField((String) "INTERFACE");
        ((Field) term1845757).setAccessible(true);
        Object enum3438 = ((Field) term1845757).get((Object) null);
        term1845157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1845161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1845157, term1845157.getClass(), "this$0", null);
        setField(term1845157, term1845157.getClass(), "call", null);
        setField(term1845157, term1845157.getClass(), "prototype", null);
        setField(term1845157, term1845157.getClass(), "kind", enum3438);
        setField(term1845161, term1845161.getClass(), "leastSupertypeVisitor", null);
        setField(term1845161, term1845161.getClass(), "greatestSubtypeVisitor", null);
        setField(term1845161, term1845161.getClass(), "call", null);
        setField(term1845161, term1845161.getClass(), "prototype", null);
        setField(term1845161, term1845161.getClass(), "kind", null);
        setField(term1845161, term1845161.getClass(), "typeOfThis", null);
        setField(term1845161, term1845161.getClass(), "source", null);
        setField(term1845161, term1845161.getClass(), "implementedInterfaces", null);
        setField(term1845161, term1845161.getClass(), "subTypes", null);
        setField(term1845161, term1845161.getClass(), "templateTypeName", null);
        setField(term1845161, term1845161.getClass(), "className", null);
        setField(term1845161, term1845161.getClass(), "properties", null);
        setField(term1845161, term1845161.getClass(), "implicitPrototype", null);
        setBooleanField(term1845161, term1845161.getClass(), "nativeType", false);
        setBooleanField(term1845161, term1845161.getClass(), "visited", false);
        setField(term1845161, term1845161.getClass(), "docInfo", null);
        setBooleanField(term1845161, term1845161.getClass(), "unknown", false);
        setBooleanField(term1845161, term1845161.getClass(), "resolved", false);
        setField(term1845161, term1845161.getClass(), "resolveResult", null);
        setField(term1845161, term1845161.getClass(), "registry", null);
        setField(term1845157, term1845157.getClass(), "typeOfThis", term1845161);
        setField(term1845157, term1845157.getClass(), "source", null);
        setField(term1845157, term1845157.getClass(), "implementedInterfaces", null);
        setField(term1845157, term1845157.getClass(), "subTypes", null);
        setField(term1845157, term1845157.getClass(), "templateTypeName", null);
        setField(term1845157, term1845157.getClass(), "className", null);
        setField(term1845157, term1845157.getClass(), "properties", null);
        setField(term1845157, term1845157.getClass(), "implicitPrototype", null);
        setBooleanField(term1845157, term1845157.getClass(), "nativeType", false);
        setBooleanField(term1845157, term1845157.getClass(), "visited", false);
        setField(term1845157, term1845157.getClass(), "docInfo", null);
        setBooleanField(term1845157, term1845157.getClass(), "unknown", false);
        setBooleanField(term1845157, term1845157.getClass(), "resolved", false);
        setField(term1845157, term1845157.getClass(), "resolveResult", null);
        setField(term1845157, term1845157.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1844434;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1843774, args);
        assertTrue(recursiveEquals(term1843774, term1845152));
        assertTrue(recursiveEquals(term1844434, term1845157));
        assertTrue(recursiveEquals(retValue, true));
    }

};


