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

public class FunctionType_getInstanceType_1940487563181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81411;
     Object term82792;

    public FunctionType_getInstanceType_1940487563181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term82796 = ((Class) term82797).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term82796).setAccessible(true);
        Object enum174 = ((Field) term82796).get((Object) null);
        term81411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term81411, term81411.getClass(), "kind", enum174);
        Class<? extends Object> term83097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term83096 = ((Class) term83097).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term83096).setAccessible(true);
        Object enum175 = ((Field) term83096).get((Object) null);
        term82792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term82792, term82792.getClass(), "call", null);
        setField(term82792, term82792.getClass(), "prototype", null);
        setField(term82792, term82792.getClass(), "kind", enum175);
        setField(term82792, term82792.getClass(), "typeOfThis", null);
        setField(term82792, term82792.getClass(), "source", null);
        setField(term82792, term82792.getClass(), "implementedInterfaces", null);
        setField(term82792, term82792.getClass(), "subTypes", null);
        setField(term82792, term82792.getClass(), "templateTypeName", null);
        setField(term82792, term82792.getClass(), "className", null);
        setField(term82792, term82792.getClass(), "properties", null);
        setField(term82792, term82792.getClass(), "implicitPrototype", null);
        setBooleanField(term82792, term82792.getClass(), "nativeType", false);
        setBooleanField(term82792, term82792.getClass(), "visited", false);
        setField(term82792, term82792.getClass(), "docInfo", null);
        setBooleanField(term82792, term82792.getClass(), "unknown", false);
        setBooleanField(term82792, term82792.getClass(), "resolved", false);
        setField(term82792, term82792.getClass(), "resolveResult", null);
        setField(term82792, term82792.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term81411, args);
        assertTrue(recursiveEquals(term81411, term82792));
        assertTrue(recursiveEquals(retValue, null));
    }

};


