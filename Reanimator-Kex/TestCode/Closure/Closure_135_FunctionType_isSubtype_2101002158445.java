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

public class FunctionType_isSubtype_2101002158445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297587;
     Object term297843;
     Object term298193;
     Object term298197;

    public FunctionType_isSubtype_2101002158445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term298200 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term298199 = ((Class) term298200).getDeclaredField((String) "INTERFACE");
        ((Field) term298199).setAccessible(true);
        Object enum545 = ((Field) term298199).get((Object) null);
        term297587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term297587, term297587.getClass(), "kind", enum545);
        term297843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class<? extends Object> term298494 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term298493 = ((Class) term298494).getDeclaredField((String) "INTERFACE");
        ((Field) term298493).setAccessible(true);
        Object enum546 = ((Field) term298493).get((Object) null);
        term298193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term298193, term298193.getClass(), "this$0", null);
        setField(term298193, term298193.getClass(), "call", null);
        setField(term298193, term298193.getClass(), "prototype", null);
        setField(term298193, term298193.getClass(), "kind", enum546);
        setField(term298193, term298193.getClass(), "typeOfThis", null);
        setField(term298193, term298193.getClass(), "source", null);
        setField(term298193, term298193.getClass(), "implementedInterfaces", null);
        setField(term298193, term298193.getClass(), "subTypes", null);
        setField(term298193, term298193.getClass(), "templateTypeName", null);
        setField(term298193, term298193.getClass(), "className", null);
        setField(term298193, term298193.getClass(), "properties", null);
        setField(term298193, term298193.getClass(), "implicitPrototype", null);
        setBooleanField(term298193, term298193.getClass(), "nativeType", false);
        setBooleanField(term298193, term298193.getClass(), "visited", false);
        setField(term298193, term298193.getClass(), "docInfo", null);
        setBooleanField(term298193, term298193.getClass(), "unknown", false);
        setBooleanField(term298193, term298193.getClass(), "resolved", false);
        setField(term298193, term298193.getClass(), "resolveResult", null);
        setField(term298193, term298193.getClass(), "registry", null);
        term298197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term298197, term298197.getClass(), "this$0", null);
        setField(term298197, term298197.getClass(), "call", null);
        setField(term298197, term298197.getClass(), "prototype", null);
        setField(term298197, term298197.getClass(), "kind", null);
        setField(term298197, term298197.getClass(), "typeOfThis", null);
        setField(term298197, term298197.getClass(), "source", null);
        setField(term298197, term298197.getClass(), "implementedInterfaces", null);
        setField(term298197, term298197.getClass(), "subTypes", null);
        setField(term298197, term298197.getClass(), "templateTypeName", null);
        setField(term298197, term298197.getClass(), "className", null);
        setField(term298197, term298197.getClass(), "properties", null);
        setField(term298197, term298197.getClass(), "implicitPrototype", null);
        setBooleanField(term298197, term298197.getClass(), "nativeType", false);
        setBooleanField(term298197, term298197.getClass(), "visited", false);
        setField(term298197, term298197.getClass(), "docInfo", null);
        setBooleanField(term298197, term298197.getClass(), "unknown", false);
        setBooleanField(term298197, term298197.getClass(), "resolved", false);
        setField(term298197, term298197.getClass(), "resolveResult", null);
        setField(term298197, term298197.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term297843;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term297587, args);
        assertTrue(recursiveEquals(term297587, term298193));
        assertTrue(recursiveEquals(term297843, term298197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


