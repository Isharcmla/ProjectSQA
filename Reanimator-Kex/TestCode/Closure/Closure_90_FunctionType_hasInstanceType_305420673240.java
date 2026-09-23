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

public class FunctionType_hasInstanceType_305420673240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133579;
     Object term135088;

    public FunctionType_hasInstanceType_305420673240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term135094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term135093 = ((Class) term135094).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term135093).setAccessible(true);
        Object enum256 = ((Field) term135093).get((Object) null);
        term133579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term133579, term133579.getClass(), "kind", enum256);
        Class<? extends Object> term135394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term135393 = ((Class) term135394).getDeclaredField((String) "INTERFACE");
        ((Field) term135393).setAccessible(true);
        Object enum257 = ((Field) term135393).get((Object) null);
        term135088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term135088, term135088.getClass(), "call", null);
        setField(term135088, term135088.getClass(), "prototype", null);
        setField(term135088, term135088.getClass(), "kind", enum257);
        setField(term135088, term135088.getClass(), "typeOfThis", null);
        setField(term135088, term135088.getClass(), "source", null);
        setField(term135088, term135088.getClass(), "implementedInterfaces", null);
        setField(term135088, term135088.getClass(), "subTypes", null);
        setField(term135088, term135088.getClass(), "templateTypeName", null);
        setField(term135088, term135088.getClass(), "className", null);
        setField(term135088, term135088.getClass(), "properties", null);
        setBooleanField(term135088, term135088.getClass(), "nativeType", false);
        setField(term135088, term135088.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term135088, term135088.getClass(), "prettyPrint", false);
        setBooleanField(term135088, term135088.getClass(), "visited", false);
        setField(term135088, term135088.getClass(), "docInfo", null);
        setBooleanField(term135088, term135088.getClass(), "unknown", false);
        setBooleanField(term135088, term135088.getClass(), "resolved", false);
        setField(term135088, term135088.getClass(), "resolveResult", null);
        setField(term135088, term135088.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasInstanceType", argTypes, term133579, args);
        assertTrue(recursiveEquals(term133579, term135088));
        assertTrue(recursiveEquals(retValue, true));
    }

};


