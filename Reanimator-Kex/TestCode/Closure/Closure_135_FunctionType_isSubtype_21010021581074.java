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

public class FunctionType_isSubtype_21010021581074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242048;
     Object term1242306;
     Object term1244419;
     Object term1244423;

    public FunctionType_isSubtype_21010021581074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1244429 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1244428 = ((Class) term1244429).getDeclaredField((String) "INTERFACE");
        ((Field) term1244428).setAccessible(true);
        Object enum2318 = ((Field) term1244428).get((Object) null);
        term1242048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1242048, term1242048.getClass(), "kind", enum2318);
        term1242306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1242306, term1242306.getClass(), "kind", enum2318);
        Class<? extends Object> term1244723 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1244722 = ((Class) term1244723).getDeclaredField((String) "INTERFACE");
        ((Field) term1244722).setAccessible(true);
        Object enum2319 = ((Field) term1244722).get((Object) null);
        term1244419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1244419, term1244419.getClass(), "call", null);
        setField(term1244419, term1244419.getClass(), "prototype", null);
        setField(term1244419, term1244419.getClass(), "kind", enum2319);
        setField(term1244419, term1244419.getClass(), "typeOfThis", null);
        setField(term1244419, term1244419.getClass(), "source", null);
        setField(term1244419, term1244419.getClass(), "implementedInterfaces", null);
        setField(term1244419, term1244419.getClass(), "subTypes", null);
        setField(term1244419, term1244419.getClass(), "templateTypeName", null);
        setField(term1244419, term1244419.getClass(), "className", null);
        setField(term1244419, term1244419.getClass(), "properties", null);
        setField(term1244419, term1244419.getClass(), "implicitPrototype", null);
        setBooleanField(term1244419, term1244419.getClass(), "nativeType", false);
        setBooleanField(term1244419, term1244419.getClass(), "visited", false);
        setField(term1244419, term1244419.getClass(), "docInfo", null);
        setBooleanField(term1244419, term1244419.getClass(), "unknown", false);
        setBooleanField(term1244419, term1244419.getClass(), "resolved", false);
        setField(term1244419, term1244419.getClass(), "resolveResult", null);
        setField(term1244419, term1244419.getClass(), "registry", null);
        Class<? extends Object> term1245017 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1245016 = ((Class) term1245017).getDeclaredField((String) "INTERFACE");
        ((Field) term1245016).setAccessible(true);
        Object enum2320 = ((Field) term1245016).get((Object) null);
        term1244423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1244423, term1244423.getClass(), "call", null);
        setField(term1244423, term1244423.getClass(), "prototype", null);
        setField(term1244423, term1244423.getClass(), "kind", enum2320);
        setField(term1244423, term1244423.getClass(), "typeOfThis", null);
        setField(term1244423, term1244423.getClass(), "source", null);
        setField(term1244423, term1244423.getClass(), "implementedInterfaces", null);
        setField(term1244423, term1244423.getClass(), "subTypes", null);
        setField(term1244423, term1244423.getClass(), "templateTypeName", null);
        setField(term1244423, term1244423.getClass(), "className", null);
        setField(term1244423, term1244423.getClass(), "properties", null);
        setField(term1244423, term1244423.getClass(), "implicitPrototype", null);
        setBooleanField(term1244423, term1244423.getClass(), "nativeType", false);
        setBooleanField(term1244423, term1244423.getClass(), "visited", false);
        setField(term1244423, term1244423.getClass(), "docInfo", null);
        setBooleanField(term1244423, term1244423.getClass(), "unknown", false);
        setBooleanField(term1244423, term1244423.getClass(), "resolved", false);
        setField(term1244423, term1244423.getClass(), "resolveResult", null);
        setField(term1244423, term1244423.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1242306;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1242048, args);
        assertTrue(recursiveEquals(term1242048, term1244419));
        assertTrue(recursiveEquals(term1242306, term1244423));
        assertTrue(recursiveEquals(retValue, true));
    }

};


