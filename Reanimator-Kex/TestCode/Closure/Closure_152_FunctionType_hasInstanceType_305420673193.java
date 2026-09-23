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

public class FunctionType_hasInstanceType_305420673193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96482;
     Object term97252;

    public FunctionType_hasInstanceType_305420673193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term97257 = ((Class) term97258).getDeclaredField((String) "INTERFACE");
        ((Field) term97257).setAccessible(true);
        Object enum201 = ((Field) term97257).get((Object) null);
        term96482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96482, term96482.getClass(), "kind", enum201);
        Class<? extends Object> term97552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term97551 = ((Class) term97552).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term97551).setAccessible(true);
        Object enum202 = ((Field) term97551).get((Object) null);
        term97252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term97252, term97252.getClass(), "call", null);
        setField(term97252, term97252.getClass(), "prototype", null);
        setField(term97252, term97252.getClass(), "kind", enum202);
        setField(term97252, term97252.getClass(), "typeOfThis", null);
        setField(term97252, term97252.getClass(), "source", null);
        setField(term97252, term97252.getClass(), "implementedInterfaces", null);
        setField(term97252, term97252.getClass(), "subTypes", null);
        setField(term97252, term97252.getClass(), "templateTypeName", null);
        setField(term97252, term97252.getClass(), "className", null);
        setField(term97252, term97252.getClass(), "properties", null);
        setBooleanField(term97252, term97252.getClass(), "nativeType", false);
        setField(term97252, term97252.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term97252, term97252.getClass(), "prettyPrint", false);
        setBooleanField(term97252, term97252.getClass(), "visited", false);
        setField(term97252, term97252.getClass(), "docInfo", null);
        setBooleanField(term97252, term97252.getClass(), "unknown", false);
        setBooleanField(term97252, term97252.getClass(), "resolved", false);
        setField(term97252, term97252.getClass(), "resolveResult", null);
        setField(term97252, term97252.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasInstanceType", argTypes, term96482, args);
        assertTrue(recursiveEquals(term96482, term97252));
        assertTrue(recursiveEquals(retValue, true));
    }

};


