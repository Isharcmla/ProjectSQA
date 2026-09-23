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

public class FunctionType_hasInstanceType_305420673125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62011;
     Object term62479;

    public FunctionType_hasInstanceType_305420673125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62485 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62484 = ((Class) term62485).getDeclaredField((String) "INTERFACE");
        ((Field) term62484).setAccessible(true);
        Object enum150 = ((Field) term62484).get((Object) null);
        term62011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62011, term62011.getClass(), "kind", enum150);
        Class<? extends Object> term62779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62778 = ((Class) term62779).getDeclaredField((String) "INTERFACE");
        ((Field) term62778).setAccessible(true);
        Object enum151 = ((Field) term62778).get((Object) null);
        term62479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62479, term62479.getClass(), "call", null);
        setField(term62479, term62479.getClass(), "prototype", null);
        setField(term62479, term62479.getClass(), "kind", enum151);
        setField(term62479, term62479.getClass(), "typeOfThis", null);
        setField(term62479, term62479.getClass(), "source", null);
        setField(term62479, term62479.getClass(), "implementedInterfaces", null);
        setField(term62479, term62479.getClass(), "subTypes", null);
        setField(term62479, term62479.getClass(), "templateTypeName", null);
        setField(term62479, term62479.getClass(), "className", null);
        setField(term62479, term62479.getClass(), "properties", null);
        setField(term62479, term62479.getClass(), "implicitPrototype", null);
        setBooleanField(term62479, term62479.getClass(), "nativeType", false);
        setBooleanField(term62479, term62479.getClass(), "visited", false);
        setField(term62479, term62479.getClass(), "docInfo", null);
        setBooleanField(term62479, term62479.getClass(), "unknown", false);
        setBooleanField(term62479, term62479.getClass(), "resolved", false);
        setField(term62479, term62479.getClass(), "resolveResult", null);
        setField(term62479, term62479.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasInstanceType", argTypes, term62011, args);
        assertTrue(recursiveEquals(term62011, term62479));
        assertTrue(recursiveEquals(retValue, true));
    }

};


