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
import java.lang.Object;

public class FunctionType_getParameters_1663846364146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70536;
     Object term71255;
     Object term71254;

    public FunctionType_getParameters_1663846364146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term70630, term70630.getClass(), "parameters", null);
        setField(term70536, term70536.getClass(), "call", term70630);
        term71255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term71256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term71256, term71256.getClass(), "parameters", null);
        setField(term71256, term71256.getClass(), "returnType", null);
        setBooleanField(term71256, term71256.getClass(), "resolved", false);
        setField(term71256, term71256.getClass(), "resolveResult", null);
        setField(term71256, term71256.getClass(), "registry", null);
        setField(term71255, term71255.getClass(), "call", term71256);
        setField(term71255, term71255.getClass(), "prototype", null);
        setField(term71255, term71255.getClass(), "kind", null);
        setField(term71255, term71255.getClass(), "typeOfThis", null);
        setField(term71255, term71255.getClass(), "source", null);
        setField(term71255, term71255.getClass(), "implementedInterfaces", null);
        setField(term71255, term71255.getClass(), "subTypes", null);
        setField(term71255, term71255.getClass(), "templateTypeName", null);
        setField(term71255, term71255.getClass(), "className", null);
        setField(term71255, term71255.getClass(), "properties", null);
        setField(term71255, term71255.getClass(), "implicitPrototype", null);
        setBooleanField(term71255, term71255.getClass(), "nativeType", false);
        setBooleanField(term71255, term71255.getClass(), "visited", false);
        setField(term71255, term71255.getClass(), "docInfo", null);
        setBooleanField(term71255, term71255.getClass(), "unknown", false);
        setBooleanField(term71255, term71255.getClass(), "resolved", false);
        setField(term71255, term71255.getClass(), "resolveResult", null);
        setField(term71255, term71255.getClass(), "registry", null);
        term71254 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term70536, args);
        assertTrue(recursiveEquals(term70536, term71255));
        assertTrue(recursiveEquals(retValue, term71254));
    }

};


