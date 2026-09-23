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

public class FunctionType_isSubtype_2101002158763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736466;
     Object term737118;
     Object term739024;
     Object term739029;

    public FunctionType_isSubtype_2101002158763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term739035 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term739034 = ((Class) term739035).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term739034).setAccessible(true);
        Object enum1375 = ((Field) term739034).get((Object) null);
        term736466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term737010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term736466, term736466.getClass(), "kind", enum1375);
        setField(term736466, term736466.getClass(), "typeOfThis", term737010);
        term737118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term737118, term737118.getClass(), "kind", enum1375);
        setField(term737118, term737118.getClass(), "typeOfThis", null);
        Class<? extends Object> term739335 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term739334 = ((Class) term739335).getDeclaredField((String) "INTERFACE");
        ((Field) term739334).setAccessible(true);
        Object enum1376 = ((Field) term739334).get((Object) null);
        term739024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term739028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term739024, term739024.getClass(), "this$0", null);
        setField(term739024, term739024.getClass(), "call", null);
        setField(term739024, term739024.getClass(), "prototype", null);
        setField(term739024, term739024.getClass(), "kind", enum1376);
        setField(term739028, term739028.getClass(), "call", null);
        setField(term739028, term739028.getClass(), "prototype", null);
        setField(term739028, term739028.getClass(), "kind", null);
        setField(term739028, term739028.getClass(), "typeOfThis", null);
        setField(term739028, term739028.getClass(), "source", null);
        setField(term739028, term739028.getClass(), "implementedInterfaces", null);
        setField(term739028, term739028.getClass(), "subTypes", null);
        setField(term739028, term739028.getClass(), "templateTypeName", null);
        setField(term739028, term739028.getClass(), "className", null);
        setField(term739028, term739028.getClass(), "properties", null);
        setField(term739028, term739028.getClass(), "implicitPrototype", null);
        setBooleanField(term739028, term739028.getClass(), "nativeType", false);
        setBooleanField(term739028, term739028.getClass(), "visited", false);
        setField(term739028, term739028.getClass(), "docInfo", null);
        setBooleanField(term739028, term739028.getClass(), "unknown", false);
        setBooleanField(term739028, term739028.getClass(), "resolved", false);
        setField(term739028, term739028.getClass(), "resolveResult", null);
        setField(term739028, term739028.getClass(), "registry", null);
        setField(term739024, term739024.getClass(), "typeOfThis", term739028);
        setField(term739024, term739024.getClass(), "source", null);
        setField(term739024, term739024.getClass(), "implementedInterfaces", null);
        setField(term739024, term739024.getClass(), "subTypes", null);
        setField(term739024, term739024.getClass(), "templateTypeName", null);
        setField(term739024, term739024.getClass(), "className", null);
        setField(term739024, term739024.getClass(), "properties", null);
        setField(term739024, term739024.getClass(), "implicitPrototype", null);
        setBooleanField(term739024, term739024.getClass(), "nativeType", false);
        setBooleanField(term739024, term739024.getClass(), "visited", false);
        setField(term739024, term739024.getClass(), "docInfo", null);
        setBooleanField(term739024, term739024.getClass(), "unknown", false);
        setBooleanField(term739024, term739024.getClass(), "resolved", false);
        setField(term739024, term739024.getClass(), "resolveResult", null);
        setField(term739024, term739024.getClass(), "registry", null);
        Class<? extends Object> term739629 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term739628 = ((Class) term739629).getDeclaredField((String) "INTERFACE");
        ((Field) term739628).setAccessible(true);
        Object enum1377 = ((Field) term739628).get((Object) null);
        term739029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term739029, term739029.getClass(), "this$0", null);
        setField(term739029, term739029.getClass(), "call", null);
        setField(term739029, term739029.getClass(), "prototype", null);
        setField(term739029, term739029.getClass(), "kind", enum1377);
        setField(term739029, term739029.getClass(), "typeOfThis", null);
        setField(term739029, term739029.getClass(), "source", null);
        setField(term739029, term739029.getClass(), "implementedInterfaces", null);
        setField(term739029, term739029.getClass(), "subTypes", null);
        setField(term739029, term739029.getClass(), "templateTypeName", null);
        setField(term739029, term739029.getClass(), "className", null);
        setField(term739029, term739029.getClass(), "properties", null);
        setField(term739029, term739029.getClass(), "implicitPrototype", null);
        setBooleanField(term739029, term739029.getClass(), "nativeType", false);
        setBooleanField(term739029, term739029.getClass(), "visited", false);
        setField(term739029, term739029.getClass(), "docInfo", null);
        setBooleanField(term739029, term739029.getClass(), "unknown", false);
        setBooleanField(term739029, term739029.getClass(), "resolved", false);
        setField(term739029, term739029.getClass(), "resolveResult", null);
        setField(term739029, term739029.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term737118;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term736466, args);
        assertTrue(recursiveEquals(term736466, term739024));
        assertTrue(recursiveEquals(term737118, term739029));
        assertTrue(recursiveEquals(retValue, true));
    }

};


