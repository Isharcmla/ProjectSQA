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

public class FunctionType_getGreatestSubtype_679591709367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262470;
     Object term262923;
     Object term262927;
     Object term262846;

    public FunctionType_getGreatestSubtype_679591709367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262932 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term262931 = ((Class) term262932).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term262931).setAccessible(true);
        Object enum460 = ((Field) term262931).get((Object) null);
        term262470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term262470, term262470.getClass(), "kind", enum460);
        Class<? extends Object> term263232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term263231 = ((Class) term263232).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term263231).setAccessible(true);
        Object enum461 = ((Field) term263231).get((Object) null);
        term262923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term262923, term262923.getClass(), "call", null);
        setField(term262923, term262923.getClass(), "prototype", null);
        setField(term262923, term262923.getClass(), "kind", enum461);
        setField(term262923, term262923.getClass(), "typeOfThis", null);
        setField(term262923, term262923.getClass(), "source", null);
        setField(term262923, term262923.getClass(), "implementedInterfaces", null);
        setField(term262923, term262923.getClass(), "subTypes", null);
        setField(term262923, term262923.getClass(), "templateTypeName", null);
        setField(term262923, term262923.getClass(), "className", null);
        setField(term262923, term262923.getClass(), "properties", null);
        setBooleanField(term262923, term262923.getClass(), "nativeType", false);
        setField(term262923, term262923.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term262923, term262923.getClass(), "prettyPrint", false);
        setBooleanField(term262923, term262923.getClass(), "visited", false);
        setField(term262923, term262923.getClass(), "docInfo", null);
        setBooleanField(term262923, term262923.getClass(), "unknown", false);
        setBooleanField(term262923, term262923.getClass(), "resolved", false);
        setField(term262923, term262923.getClass(), "resolveResult", null);
        setField(term262923, term262923.getClass(), "registry", null);
        Class<? extends Object> term263532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term263531 = ((Class) term263532).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term263531).setAccessible(true);
        Object enum462 = ((Field) term263531).get((Object) null);
        term262927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term262927, term262927.getClass(), "call", null);
        setField(term262927, term262927.getClass(), "prototype", null);
        setField(term262927, term262927.getClass(), "kind", enum462);
        setField(term262927, term262927.getClass(), "typeOfThis", null);
        setField(term262927, term262927.getClass(), "source", null);
        setField(term262927, term262927.getClass(), "implementedInterfaces", null);
        setField(term262927, term262927.getClass(), "subTypes", null);
        setField(term262927, term262927.getClass(), "templateTypeName", null);
        setField(term262927, term262927.getClass(), "className", null);
        setField(term262927, term262927.getClass(), "properties", null);
        setBooleanField(term262927, term262927.getClass(), "nativeType", false);
        setField(term262927, term262927.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term262927, term262927.getClass(), "prettyPrint", false);
        setBooleanField(term262927, term262927.getClass(), "visited", false);
        setField(term262927, term262927.getClass(), "docInfo", null);
        setBooleanField(term262927, term262927.getClass(), "unknown", false);
        setBooleanField(term262927, term262927.getClass(), "resolved", false);
        setField(term262927, term262927.getClass(), "resolveResult", null);
        setField(term262927, term262927.getClass(), "registry", null);
        Class<? extends Object> term263832 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term263831 = ((Class) term263832).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term263831).setAccessible(true);
        Object enum463 = ((Field) term263831).get((Object) null);
        term262846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term262846, term262846.getClass(), "call", null);
        setField(term262846, term262846.getClass(), "prototype", null);
        setField(term262846, term262846.getClass(), "kind", enum463);
        setField(term262846, term262846.getClass(), "typeOfThis", null);
        setField(term262846, term262846.getClass(), "source", null);
        setField(term262846, term262846.getClass(), "implementedInterfaces", null);
        setField(term262846, term262846.getClass(), "subTypes", null);
        setField(term262846, term262846.getClass(), "templateTypeName", null);
        setField(term262846, term262846.getClass(), "className", null);
        setField(term262846, term262846.getClass(), "properties", null);
        setBooleanField(term262846, term262846.getClass(), "nativeType", false);
        setField(term262846, term262846.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term262846, term262846.getClass(), "prettyPrint", false);
        setBooleanField(term262846, term262846.getClass(), "visited", false);
        setField(term262846, term262846.getClass(), "docInfo", null);
        setBooleanField(term262846, term262846.getClass(), "unknown", false);
        setBooleanField(term262846, term262846.getClass(), "resolved", false);
        setField(term262846, term262846.getClass(), "resolveResult", null);
        setField(term262846, term262846.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term262470;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term262470, args);
        assertTrue(recursiveEquals(term262470, term262923));
        assertTrue(recursiveEquals(term262470, term262927));
        assertTrue(recursiveEquals(retValue, term262846));
    }

};


