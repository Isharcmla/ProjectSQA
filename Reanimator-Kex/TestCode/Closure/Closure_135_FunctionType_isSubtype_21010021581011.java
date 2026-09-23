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

public class FunctionType_isSubtype_21010021581011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144835;
     Object term1145269;
     Object term1145273;

    public FunctionType_isSubtype_21010021581011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1145279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145278 = ((Class) term1145279).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1145278).setAccessible(true);
        Object enum2131 = ((Field) term1145278).get((Object) null);
        term1144835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1144835, term1144835.getClass(), "kind", enum2131);
        Class<? extends Object> term1145579 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145578 = ((Class) term1145579).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1145578).setAccessible(true);
        Object enum2132 = ((Field) term1145578).get((Object) null);
        term1145269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1145269, term1145269.getClass(), "this$0", null);
        setField(term1145269, term1145269.getClass(), "call", null);
        setField(term1145269, term1145269.getClass(), "prototype", null);
        setField(term1145269, term1145269.getClass(), "kind", enum2132);
        setField(term1145269, term1145269.getClass(), "typeOfThis", null);
        setField(term1145269, term1145269.getClass(), "source", null);
        setField(term1145269, term1145269.getClass(), "implementedInterfaces", null);
        setField(term1145269, term1145269.getClass(), "subTypes", null);
        setField(term1145269, term1145269.getClass(), "templateTypeName", null);
        setField(term1145269, term1145269.getClass(), "className", null);
        setField(term1145269, term1145269.getClass(), "properties", null);
        setField(term1145269, term1145269.getClass(), "implicitPrototype", null);
        setBooleanField(term1145269, term1145269.getClass(), "nativeType", false);
        setBooleanField(term1145269, term1145269.getClass(), "visited", false);
        setField(term1145269, term1145269.getClass(), "docInfo", null);
        setBooleanField(term1145269, term1145269.getClass(), "unknown", false);
        setBooleanField(term1145269, term1145269.getClass(), "resolved", false);
        setField(term1145269, term1145269.getClass(), "resolveResult", null);
        setField(term1145269, term1145269.getClass(), "registry", null);
        Class<? extends Object> term1145879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1145878 = ((Class) term1145879).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1145878).setAccessible(true);
        Object enum2133 = ((Field) term1145878).get((Object) null);
        term1145273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1145273, term1145273.getClass(), "this$0", null);
        setField(term1145273, term1145273.getClass(), "call", null);
        setField(term1145273, term1145273.getClass(), "prototype", null);
        setField(term1145273, term1145273.getClass(), "kind", enum2133);
        setField(term1145273, term1145273.getClass(), "typeOfThis", null);
        setField(term1145273, term1145273.getClass(), "source", null);
        setField(term1145273, term1145273.getClass(), "implementedInterfaces", null);
        setField(term1145273, term1145273.getClass(), "subTypes", null);
        setField(term1145273, term1145273.getClass(), "templateTypeName", null);
        setField(term1145273, term1145273.getClass(), "className", null);
        setField(term1145273, term1145273.getClass(), "properties", null);
        setField(term1145273, term1145273.getClass(), "implicitPrototype", null);
        setBooleanField(term1145273, term1145273.getClass(), "nativeType", false);
        setBooleanField(term1145273, term1145273.getClass(), "visited", false);
        setField(term1145273, term1145273.getClass(), "docInfo", null);
        setBooleanField(term1145273, term1145273.getClass(), "unknown", false);
        setBooleanField(term1145273, term1145273.getClass(), "resolved", false);
        setField(term1145273, term1145273.getClass(), "resolveResult", null);
        setField(term1145273, term1145273.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1144835;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1144835, args);
        assertTrue(recursiveEquals(term1144835, term1145269));
        assertTrue(recursiveEquals(term1144835, term1145273));
        assertTrue(recursiveEquals(retValue, true));
    }

};


