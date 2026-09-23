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

public class FunctionType_getInstanceType_1940487563147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70802;
     Object term71290;

    public FunctionType_getInstanceType_1940487563147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71295 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71294 = ((Class) term71295).getDeclaredField((String) "INTERFACE");
        ((Field) term71294).setAccessible(true);
        Object enum159 = ((Field) term71294).get((Object) null);
        term70802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term70802, term70802.getClass(), "kind", enum159);
        Class<? extends Object> term71589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71588 = ((Class) term71589).getDeclaredField((String) "INTERFACE");
        ((Field) term71588).setAccessible(true);
        Object enum160 = ((Field) term71588).get((Object) null);
        term71290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term71290, term71290.getClass(), "call", null);
        setField(term71290, term71290.getClass(), "prototype", null);
        setField(term71290, term71290.getClass(), "kind", enum160);
        setField(term71290, term71290.getClass(), "typeOfThis", null);
        setField(term71290, term71290.getClass(), "source", null);
        setField(term71290, term71290.getClass(), "implementedInterfaces", null);
        setField(term71290, term71290.getClass(), "subTypes", null);
        setField(term71290, term71290.getClass(), "templateTypeName", null);
        setField(term71290, term71290.getClass(), "className", null);
        setField(term71290, term71290.getClass(), "properties", null);
        setField(term71290, term71290.getClass(), "implicitPrototype", null);
        setBooleanField(term71290, term71290.getClass(), "nativeType", false);
        setBooleanField(term71290, term71290.getClass(), "visited", false);
        setField(term71290, term71290.getClass(), "docInfo", null);
        setBooleanField(term71290, term71290.getClass(), "unknown", false);
        setBooleanField(term71290, term71290.getClass(), "resolved", false);
        setField(term71290, term71290.getClass(), "resolveResult", null);
        setField(term71290, term71290.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term70802, args);
        assertTrue(recursiveEquals(term70802, term71290));
        assertTrue(recursiveEquals(retValue, null));
    }

};


