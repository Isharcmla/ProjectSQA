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

public class FunctionType_isConstructor_1260630010118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63057;
     Object term64152;

    public FunctionType_isConstructor_1260630010118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64158 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term64157 = ((Class) term64158).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term64157).setAccessible(true);
        Object enum160 = ((Field) term64157).get((Object) null);
        term63057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63057, term63057.getClass(), "kind", enum160);
        Class<? extends Object> term64458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term64457 = ((Class) term64458).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term64457).setAccessible(true);
        Object enum161 = ((Field) term64457).get((Object) null);
        term64152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term64152, term64152.getClass(), "call", null);
        setField(term64152, term64152.getClass(), "prototype", null);
        setField(term64152, term64152.getClass(), "kind", enum161);
        setField(term64152, term64152.getClass(), "typeOfThis", null);
        setField(term64152, term64152.getClass(), "source", null);
        setField(term64152, term64152.getClass(), "implementedInterfaces", null);
        setField(term64152, term64152.getClass(), "subTypes", null);
        setField(term64152, term64152.getClass(), "templateTypeName", null);
        setField(term64152, term64152.getClass(), "className", null);
        setField(term64152, term64152.getClass(), "properties", null);
        setField(term64152, term64152.getClass(), "implicitPrototype", null);
        setBooleanField(term64152, term64152.getClass(), "nativeType", false);
        setBooleanField(term64152, term64152.getClass(), "prettyPrint", false);
        setBooleanField(term64152, term64152.getClass(), "visited", false);
        setField(term64152, term64152.getClass(), "docInfo", null);
        setBooleanField(term64152, term64152.getClass(), "unknown", false);
        setBooleanField(term64152, term64152.getClass(), "resolved", false);
        setField(term64152, term64152.getClass(), "resolveResult", null);
        setField(term64152, term64152.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConstructor", argTypes, term63057, args);
        assertTrue(recursiveEquals(term63057, term64152));
        assertTrue(recursiveEquals(retValue, true));
    }

};


