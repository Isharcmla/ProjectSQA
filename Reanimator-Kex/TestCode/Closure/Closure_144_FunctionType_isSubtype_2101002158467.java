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

public class FunctionType_isSubtype_2101002158467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390835;
     Object term391387;
     Object term392410;
     Object term392414;

    public FunctionType_isSubtype_2101002158467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term392420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392419 = ((Class) term392420).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term392419).setAccessible(true);
        Object enum708 = ((Field) term392419).get((Object) null);
        term390835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term390835, term390835.getClass(), "kind", enum708);
        Class<? extends Object> term392720 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term392719 = ((Class) term392720).getDeclaredField((String) "INTERFACE");
        ((Field) term392719).setAccessible(true);
        Object enum709 = ((Field) term392719).get((Object) null);
        term391387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term391387, term391387.getClass(), "kind", enum709);
        Class<? extends Object> term393014 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term393013 = ((Class) term393014).getDeclaredField((String) "ORDINARY");
        ((Field) term393013).setAccessible(true);
        Object enum710 = ((Field) term393013).get((Object) null);
        term392410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term392410, term392410.getClass(), "call", null);
        setField(term392410, term392410.getClass(), "prototype", null);
        setField(term392410, term392410.getClass(), "kind", enum710);
        setField(term392410, term392410.getClass(), "typeOfThis", null);
        setField(term392410, term392410.getClass(), "source", null);
        setField(term392410, term392410.getClass(), "implementedInterfaces", null);
        setField(term392410, term392410.getClass(), "subTypes", null);
        setField(term392410, term392410.getClass(), "templateTypeName", null);
        setField(term392410, term392410.getClass(), "className", null);
        setField(term392410, term392410.getClass(), "properties", null);
        setField(term392410, term392410.getClass(), "implicitPrototype", null);
        setBooleanField(term392410, term392410.getClass(), "nativeType", false);
        setBooleanField(term392410, term392410.getClass(), "prettyPrint", false);
        setBooleanField(term392410, term392410.getClass(), "visited", false);
        setField(term392410, term392410.getClass(), "docInfo", null);
        setBooleanField(term392410, term392410.getClass(), "unknown", false);
        setBooleanField(term392410, term392410.getClass(), "resolved", false);
        setField(term392410, term392410.getClass(), "resolveResult", null);
        setField(term392410, term392410.getClass(), "registry", null);
        Class<? extends Object> term393305 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term393304 = ((Class) term393305).getDeclaredField((String) "INTERFACE");
        ((Field) term393304).setAccessible(true);
        Object enum711 = ((Field) term393304).get((Object) null);
        term392414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term392414, term392414.getClass(), "this$0", null);
        setField(term392414, term392414.getClass(), "call", null);
        setField(term392414, term392414.getClass(), "prototype", null);
        setField(term392414, term392414.getClass(), "kind", enum711);
        setField(term392414, term392414.getClass(), "typeOfThis", null);
        setField(term392414, term392414.getClass(), "source", null);
        setField(term392414, term392414.getClass(), "implementedInterfaces", null);
        setField(term392414, term392414.getClass(), "subTypes", null);
        setField(term392414, term392414.getClass(), "templateTypeName", null);
        setField(term392414, term392414.getClass(), "className", null);
        setField(term392414, term392414.getClass(), "properties", null);
        setField(term392414, term392414.getClass(), "implicitPrototype", null);
        setBooleanField(term392414, term392414.getClass(), "nativeType", false);
        setBooleanField(term392414, term392414.getClass(), "prettyPrint", false);
        setBooleanField(term392414, term392414.getClass(), "visited", false);
        setField(term392414, term392414.getClass(), "docInfo", null);
        setBooleanField(term392414, term392414.getClass(), "unknown", false);
        setBooleanField(term392414, term392414.getClass(), "resolved", false);
        setField(term392414, term392414.getClass(), "resolveResult", null);
        setField(term392414, term392414.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term391387;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term390835, args);
        assertTrue(recursiveEquals(term390835, term392410));
        assertTrue(recursiveEquals(term391387, term392414));
        assertTrue(recursiveEquals(retValue, true));
    }

};


