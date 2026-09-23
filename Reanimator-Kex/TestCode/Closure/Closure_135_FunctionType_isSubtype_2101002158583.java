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

public class FunctionType_isSubtype_2101002158583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476752;
     Object term477010;
     Object term477360;
     Object term477364;

    public FunctionType_isSubtype_2101002158583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term477366 = ((Class) term477367).getDeclaredField((String) "INTERFACE");
        ((Field) term477366).setAccessible(true);
        Object enum882 = ((Field) term477366).get((Object) null);
        term476752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term476752, term476752.getClass(), "kind", enum882);
        term477010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term477661 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term477660 = ((Class) term477661).getDeclaredField((String) "INTERFACE");
        ((Field) term477660).setAccessible(true);
        Object enum883 = ((Field) term477660).get((Object) null);
        term477360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term477360, term477360.getClass(), "call", null);
        setField(term477360, term477360.getClass(), "prototype", null);
        setField(term477360, term477360.getClass(), "kind", enum883);
        setField(term477360, term477360.getClass(), "typeOfThis", null);
        setField(term477360, term477360.getClass(), "source", null);
        setField(term477360, term477360.getClass(), "implementedInterfaces", null);
        setField(term477360, term477360.getClass(), "subTypes", null);
        setField(term477360, term477360.getClass(), "templateTypeName", null);
        setField(term477360, term477360.getClass(), "className", null);
        setField(term477360, term477360.getClass(), "properties", null);
        setField(term477360, term477360.getClass(), "implicitPrototype", null);
        setBooleanField(term477360, term477360.getClass(), "nativeType", false);
        setBooleanField(term477360, term477360.getClass(), "visited", false);
        setField(term477360, term477360.getClass(), "docInfo", null);
        setBooleanField(term477360, term477360.getClass(), "unknown", false);
        setBooleanField(term477360, term477360.getClass(), "resolved", false);
        setField(term477360, term477360.getClass(), "resolveResult", null);
        setField(term477360, term477360.getClass(), "registry", null);
        term477364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term477364, term477364.getClass(), "call", null);
        setField(term477364, term477364.getClass(), "prototype", null);
        setField(term477364, term477364.getClass(), "kind", null);
        setField(term477364, term477364.getClass(), "typeOfThis", null);
        setField(term477364, term477364.getClass(), "source", null);
        setField(term477364, term477364.getClass(), "implementedInterfaces", null);
        setField(term477364, term477364.getClass(), "subTypes", null);
        setField(term477364, term477364.getClass(), "templateTypeName", null);
        setField(term477364, term477364.getClass(), "className", null);
        setField(term477364, term477364.getClass(), "properties", null);
        setField(term477364, term477364.getClass(), "implicitPrototype", null);
        setBooleanField(term477364, term477364.getClass(), "nativeType", false);
        setBooleanField(term477364, term477364.getClass(), "visited", false);
        setField(term477364, term477364.getClass(), "docInfo", null);
        setBooleanField(term477364, term477364.getClass(), "unknown", false);
        setBooleanField(term477364, term477364.getClass(), "resolved", false);
        setField(term477364, term477364.getClass(), "resolveResult", null);
        setField(term477364, term477364.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term477010;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term476752, args);
        assertTrue(recursiveEquals(term476752, term477360));
        assertTrue(recursiveEquals(term477010, term477364));
        assertTrue(recursiveEquals(retValue, false));
    }

};


