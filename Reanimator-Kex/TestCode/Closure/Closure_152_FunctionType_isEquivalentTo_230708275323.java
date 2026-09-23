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

public class FunctionType_isEquivalentTo_230708275323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212913;
     Object term213171;
     Object term213605;
     Object term213609;

    public FunctionType_isEquivalentTo_230708275323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213614 = ((Class) term213615).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213614).setAccessible(true);
        Object enum378 = ((Field) term213614).get((Object) null);
        term212913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term212913, term212913.getClass(), "kind", enum378);
        term213171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term213171, term213171.getClass(), "kind", enum378);
        Class<? extends Object> term213915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213914 = ((Class) term213915).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213914).setAccessible(true);
        Object enum379 = ((Field) term213914).get((Object) null);
        term213605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term213605, term213605.getClass(), "call", null);
        setField(term213605, term213605.getClass(), "prototype", null);
        setField(term213605, term213605.getClass(), "kind", enum379);
        setField(term213605, term213605.getClass(), "typeOfThis", null);
        setField(term213605, term213605.getClass(), "source", null);
        setField(term213605, term213605.getClass(), "implementedInterfaces", null);
        setField(term213605, term213605.getClass(), "subTypes", null);
        setField(term213605, term213605.getClass(), "templateTypeName", null);
        setField(term213605, term213605.getClass(), "className", null);
        setField(term213605, term213605.getClass(), "properties", null);
        setBooleanField(term213605, term213605.getClass(), "nativeType", false);
        setField(term213605, term213605.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term213605, term213605.getClass(), "prettyPrint", false);
        setBooleanField(term213605, term213605.getClass(), "visited", false);
        setField(term213605, term213605.getClass(), "docInfo", null);
        setBooleanField(term213605, term213605.getClass(), "unknown", false);
        setBooleanField(term213605, term213605.getClass(), "resolved", false);
        setField(term213605, term213605.getClass(), "resolveResult", null);
        setField(term213605, term213605.getClass(), "registry", null);
        Class<? extends Object> term214215 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term214214 = ((Class) term214215).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term214214).setAccessible(true);
        Object enum380 = ((Field) term214214).get((Object) null);
        term213609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term213609, term213609.getClass(), "call", null);
        setField(term213609, term213609.getClass(), "prototype", null);
        setField(term213609, term213609.getClass(), "kind", enum380);
        setField(term213609, term213609.getClass(), "typeOfThis", null);
        setField(term213609, term213609.getClass(), "source", null);
        setField(term213609, term213609.getClass(), "implementedInterfaces", null);
        setField(term213609, term213609.getClass(), "subTypes", null);
        setField(term213609, term213609.getClass(), "templateTypeName", null);
        setField(term213609, term213609.getClass(), "className", null);
        setField(term213609, term213609.getClass(), "properties", null);
        setBooleanField(term213609, term213609.getClass(), "nativeType", false);
        setField(term213609, term213609.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term213609, term213609.getClass(), "prettyPrint", false);
        setBooleanField(term213609, term213609.getClass(), "visited", false);
        setField(term213609, term213609.getClass(), "docInfo", null);
        setBooleanField(term213609, term213609.getClass(), "unknown", false);
        setBooleanField(term213609, term213609.getClass(), "resolved", false);
        setField(term213609, term213609.getClass(), "resolveResult", null);
        setField(term213609, term213609.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term213171;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term212913, args);
        assertTrue(recursiveEquals(term212913, term213605));
        assertTrue(recursiveEquals(term213171, term213609));
        assertTrue(recursiveEquals(retValue, false));
    }

};


