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

public class FunctionType_isEquivalentTo_230708275347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237773;
     Object term238327;
     Object term239056;
     Object term239060;

    public FunctionType_isEquivalentTo_230708275347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239066 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239065 = ((Class) term239066).getDeclaredField((String) "INTERFACE");
        ((Field) term239065).setAccessible(true);
        Object enum419 = ((Field) term239065).get((Object) null);
        term237773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term237773, term237773.getClass(), "kind", enum419);
        Class<? extends Object> term239360 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239359 = ((Class) term239360).getDeclaredField((String) "INTERFACE");
        ((Field) term239359).setAccessible(true);
        Object enum420 = ((Field) term239359).get((Object) null);
        term238327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term238327, term238327.getClass(), "kind", enum420);
        Class<? extends Object> term239654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239653 = ((Class) term239654).getDeclaredField((String) "ORDINARY");
        ((Field) term239653).setAccessible(true);
        Object enum421 = ((Field) term239653).get((Object) null);
        term239056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term239056, term239056.getClass(), "call", null);
        setField(term239056, term239056.getClass(), "prototype", null);
        setField(term239056, term239056.getClass(), "kind", enum421);
        setField(term239056, term239056.getClass(), "typeOfThis", null);
        setField(term239056, term239056.getClass(), "source", null);
        setField(term239056, term239056.getClass(), "implementedInterfaces", null);
        setField(term239056, term239056.getClass(), "subTypes", null);
        setField(term239056, term239056.getClass(), "templateTypeName", null);
        setField(term239056, term239056.getClass(), "className", null);
        setField(term239056, term239056.getClass(), "properties", null);
        setBooleanField(term239056, term239056.getClass(), "nativeType", false);
        setField(term239056, term239056.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term239056, term239056.getClass(), "prettyPrint", false);
        setBooleanField(term239056, term239056.getClass(), "visited", false);
        setField(term239056, term239056.getClass(), "docInfo", null);
        setBooleanField(term239056, term239056.getClass(), "unknown", false);
        setBooleanField(term239056, term239056.getClass(), "resolved", false);
        setField(term239056, term239056.getClass(), "resolveResult", null);
        setField(term239056, term239056.getClass(), "registry", null);
        Class<? extends Object> term239945 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239944 = ((Class) term239945).getDeclaredField((String) "INTERFACE");
        ((Field) term239944).setAccessible(true);
        Object enum422 = ((Field) term239944).get((Object) null);
        term239060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term239060, term239060.getClass(), "call", null);
        setField(term239060, term239060.getClass(), "prototype", null);
        setField(term239060, term239060.getClass(), "kind", enum422);
        setField(term239060, term239060.getClass(), "typeOfThis", null);
        setField(term239060, term239060.getClass(), "source", null);
        setField(term239060, term239060.getClass(), "implementedInterfaces", null);
        setField(term239060, term239060.getClass(), "subTypes", null);
        setField(term239060, term239060.getClass(), "templateTypeName", null);
        setField(term239060, term239060.getClass(), "className", null);
        setField(term239060, term239060.getClass(), "properties", null);
        setBooleanField(term239060, term239060.getClass(), "nativeType", false);
        setField(term239060, term239060.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term239060, term239060.getClass(), "prettyPrint", false);
        setBooleanField(term239060, term239060.getClass(), "visited", false);
        setField(term239060, term239060.getClass(), "docInfo", null);
        setBooleanField(term239060, term239060.getClass(), "unknown", false);
        setBooleanField(term239060, term239060.getClass(), "resolved", false);
        setField(term239060, term239060.getClass(), "resolveResult", null);
        setField(term239060, term239060.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term238327;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term237773, args);
        assertTrue(recursiveEquals(term237773, term239056));
        assertTrue(recursiveEquals(term238327, term239060));
        assertTrue(recursiveEquals(retValue, false));
    }

};


