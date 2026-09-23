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

public class FunctionType_isSubtype_2101002158984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229734;
     Object term1230084;
     Object term1232390;
     Object term1232395;

    public FunctionType_isSubtype_2101002158984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1232401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1232400 = ((Class) term1232401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1232400).setAccessible(true);
        Object enum2211 = ((Field) term1232400).get((Object) null);
        term1229734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1229976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1229734, term1229734.getClass(), "kind", enum2211);
        setField(term1229734, term1229734.getClass(), "call", term1229976);
        term1230084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1230084, term1230084.getClass(), "kind", enum2211);
        setField(term1230084, term1230084.getClass(), "call", null);
        Class<? extends Object> term1232701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1232700 = ((Class) term1232701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1232700).setAccessible(true);
        Object enum2212 = ((Field) term1232700).get((Object) null);
        term1232390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1232391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1232391, term1232391.getClass(), "parameters", null);
        setField(term1232391, term1232391.getClass(), "returnType", null);
        setBooleanField(term1232391, term1232391.getClass(), "returnTypeInferred", false);
        setBooleanField(term1232391, term1232391.getClass(), "resolved", false);
        setField(term1232391, term1232391.getClass(), "resolveResult", null);
        setField(term1232391, term1232391.getClass(), "registry", null);
        setField(term1232390, term1232390.getClass(), "call", term1232391);
        setField(term1232390, term1232390.getClass(), "prototype", null);
        setField(term1232390, term1232390.getClass(), "kind", enum2212);
        setField(term1232390, term1232390.getClass(), "typeOfThis", null);
        setField(term1232390, term1232390.getClass(), "source", null);
        setField(term1232390, term1232390.getClass(), "implementedInterfaces", null);
        setField(term1232390, term1232390.getClass(), "subTypes", null);
        setField(term1232390, term1232390.getClass(), "templateTypeName", null);
        setField(term1232390, term1232390.getClass(), "className", null);
        setField(term1232390, term1232390.getClass(), "properties", null);
        setField(term1232390, term1232390.getClass(), "implicitPrototype", null);
        setBooleanField(term1232390, term1232390.getClass(), "nativeType", false);
        setBooleanField(term1232390, term1232390.getClass(), "prettyPrint", false);
        setBooleanField(term1232390, term1232390.getClass(), "visited", false);
        setField(term1232390, term1232390.getClass(), "docInfo", null);
        setBooleanField(term1232390, term1232390.getClass(), "unknown", false);
        setBooleanField(term1232390, term1232390.getClass(), "resolved", false);
        setField(term1232390, term1232390.getClass(), "resolveResult", null);
        setField(term1232390, term1232390.getClass(), "registry", null);
        Class<? extends Object> term1233001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1233000 = ((Class) term1233001).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1233000).setAccessible(true);
        Object enum2213 = ((Field) term1233000).get((Object) null);
        term1232395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1232395, term1232395.getClass(), "this$0", null);
        setField(term1232395, term1232395.getClass(), "call", null);
        setField(term1232395, term1232395.getClass(), "prototype", null);
        setField(term1232395, term1232395.getClass(), "kind", enum2213);
        setField(term1232395, term1232395.getClass(), "typeOfThis", null);
        setField(term1232395, term1232395.getClass(), "source", null);
        setField(term1232395, term1232395.getClass(), "implementedInterfaces", null);
        setField(term1232395, term1232395.getClass(), "subTypes", null);
        setField(term1232395, term1232395.getClass(), "templateTypeName", null);
        setField(term1232395, term1232395.getClass(), "className", null);
        setField(term1232395, term1232395.getClass(), "properties", null);
        setField(term1232395, term1232395.getClass(), "implicitPrototype", null);
        setBooleanField(term1232395, term1232395.getClass(), "nativeType", false);
        setBooleanField(term1232395, term1232395.getClass(), "prettyPrint", false);
        setBooleanField(term1232395, term1232395.getClass(), "visited", false);
        setField(term1232395, term1232395.getClass(), "docInfo", null);
        setBooleanField(term1232395, term1232395.getClass(), "unknown", false);
        setBooleanField(term1232395, term1232395.getClass(), "resolved", false);
        setField(term1232395, term1232395.getClass(), "resolveResult", null);
        setField(term1232395, term1232395.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1230084;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1229734, args);
        assertTrue(recursiveEquals(term1229734, term1232390));
        assertTrue(recursiveEquals(term1230084, term1232395));
        assertTrue(recursiveEquals(retValue, false));
    }

};


