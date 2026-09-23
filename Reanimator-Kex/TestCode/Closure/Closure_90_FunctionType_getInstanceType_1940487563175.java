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

public class FunctionType_getInstanceType_1940487563175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92801;
     Object term93574;

    public FunctionType_getInstanceType_1940487563175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93579 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93578 = ((Class) term93579).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term93578).setAccessible(true);
        Object enum198 = ((Field) term93578).get((Object) null);
        term92801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term92801, term92801.getClass(), "kind", enum198);
        Class<? extends Object> term93879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93878 = ((Class) term93879).getDeclaredField((String) "INTERFACE");
        ((Field) term93878).setAccessible(true);
        Object enum199 = ((Field) term93878).get((Object) null);
        term93574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term93574, term93574.getClass(), "call", null);
        setField(term93574, term93574.getClass(), "prototype", null);
        setField(term93574, term93574.getClass(), "kind", enum199);
        setField(term93574, term93574.getClass(), "typeOfThis", null);
        setField(term93574, term93574.getClass(), "source", null);
        setField(term93574, term93574.getClass(), "implementedInterfaces", null);
        setField(term93574, term93574.getClass(), "subTypes", null);
        setField(term93574, term93574.getClass(), "templateTypeName", null);
        setField(term93574, term93574.getClass(), "className", null);
        setField(term93574, term93574.getClass(), "properties", null);
        setBooleanField(term93574, term93574.getClass(), "nativeType", false);
        setField(term93574, term93574.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term93574, term93574.getClass(), "prettyPrint", false);
        setBooleanField(term93574, term93574.getClass(), "visited", false);
        setField(term93574, term93574.getClass(), "docInfo", null);
        setBooleanField(term93574, term93574.getClass(), "unknown", false);
        setBooleanField(term93574, term93574.getClass(), "resolved", false);
        setField(term93574, term93574.getClass(), "resolveResult", null);
        setField(term93574, term93574.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term92801, args);
        assertTrue(recursiveEquals(term92801, term93574));
        assertTrue(recursiveEquals(retValue, null));
    }

};


