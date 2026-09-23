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

public class FunctionType_equals_10327359001126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329754;
     Object term1330002;
     Object term1332105;
     Object term1332109;

    public FunctionType_equals_10327359001126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1332115 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1332114 = ((Class) term1332115).getDeclaredField((String) "INTERFACE");
        ((Field) term1332114).setAccessible(true);
        Object enum2488 = ((Field) term1332114).get((Object) null);
        term1329754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1329754, term1329754.getClass(), "kind", enum2488);
        term1330002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1330002, term1330002.getClass(), "kind", enum2488);
        Class<? extends Object> term1332409 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1332408 = ((Class) term1332409).getDeclaredField((String) "INTERFACE");
        ((Field) term1332408).setAccessible(true);
        Object enum2489 = ((Field) term1332408).get((Object) null);
        term1332105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1332105, term1332105.getClass(), "call", null);
        setField(term1332105, term1332105.getClass(), "prototype", null);
        setField(term1332105, term1332105.getClass(), "kind", enum2489);
        setField(term1332105, term1332105.getClass(), "typeOfThis", null);
        setField(term1332105, term1332105.getClass(), "source", null);
        setField(term1332105, term1332105.getClass(), "implementedInterfaces", null);
        setField(term1332105, term1332105.getClass(), "subTypes", null);
        setField(term1332105, term1332105.getClass(), "templateTypeName", null);
        setField(term1332105, term1332105.getClass(), "className", null);
        setField(term1332105, term1332105.getClass(), "properties", null);
        setField(term1332105, term1332105.getClass(), "implicitPrototype", null);
        setBooleanField(term1332105, term1332105.getClass(), "nativeType", false);
        setBooleanField(term1332105, term1332105.getClass(), "visited", false);
        setField(term1332105, term1332105.getClass(), "docInfo", null);
        setBooleanField(term1332105, term1332105.getClass(), "unknown", false);
        setBooleanField(term1332105, term1332105.getClass(), "resolved", false);
        setField(term1332105, term1332105.getClass(), "resolveResult", null);
        setField(term1332105, term1332105.getClass(), "registry", null);
        Class<? extends Object> term1332703 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1332702 = ((Class) term1332703).getDeclaredField((String) "INTERFACE");
        ((Field) term1332702).setAccessible(true);
        Object enum2490 = ((Field) term1332702).get((Object) null);
        term1332109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1332109, term1332109.getClass(), "call", null);
        setField(term1332109, term1332109.getClass(), "prototype", null);
        setField(term1332109, term1332109.getClass(), "kind", enum2490);
        setField(term1332109, term1332109.getClass(), "typeOfThis", null);
        setField(term1332109, term1332109.getClass(), "source", null);
        setField(term1332109, term1332109.getClass(), "implementedInterfaces", null);
        setField(term1332109, term1332109.getClass(), "subTypes", null);
        setField(term1332109, term1332109.getClass(), "templateTypeName", null);
        setField(term1332109, term1332109.getClass(), "className", null);
        setField(term1332109, term1332109.getClass(), "properties", null);
        setField(term1332109, term1332109.getClass(), "implicitPrototype", null);
        setBooleanField(term1332109, term1332109.getClass(), "nativeType", false);
        setBooleanField(term1332109, term1332109.getClass(), "visited", false);
        setField(term1332109, term1332109.getClass(), "docInfo", null);
        setBooleanField(term1332109, term1332109.getClass(), "unknown", false);
        setBooleanField(term1332109, term1332109.getClass(), "resolved", false);
        setField(term1332109, term1332109.getClass(), "resolveResult", null);
        setField(term1332109, term1332109.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1330002;
        Object retValue = callMethod(klass, "equals", argTypes, term1329754, args);
        assertTrue(recursiveEquals(term1329754, term1332105));
        assertTrue(recursiveEquals(term1330002, term1332109));
        assertTrue(recursiveEquals(retValue, true));
    }

};


