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

public class FunctionType_hasCachedValues_625426612261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153237;
     Object term153256;

    public FunctionType_hasCachedValues_625426612261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term153237, term153237.getClass(), "prototype", null);
        setBooleanField(term153237, term153237.getClass(), "unknown", true);
        term153256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term153256, term153256.getClass(), "call", null);
        setField(term153256, term153256.getClass(), "prototype", null);
        setField(term153256, term153256.getClass(), "kind", null);
        setField(term153256, term153256.getClass(), "typeOfThis", null);
        setField(term153256, term153256.getClass(), "source", null);
        setField(term153256, term153256.getClass(), "implementedInterfaces", null);
        setField(term153256, term153256.getClass(), "subTypes", null);
        setField(term153256, term153256.getClass(), "templateTypeName", null);
        setField(term153256, term153256.getClass(), "className", null);
        setField(term153256, term153256.getClass(), "properties", null);
        setBooleanField(term153256, term153256.getClass(), "nativeType", false);
        setField(term153256, term153256.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term153256, term153256.getClass(), "prettyPrint", false);
        setBooleanField(term153256, term153256.getClass(), "visited", false);
        setField(term153256, term153256.getClass(), "docInfo", null);
        setBooleanField(term153256, term153256.getClass(), "unknown", true);
        setBooleanField(term153256, term153256.getClass(), "resolved", false);
        setField(term153256, term153256.getClass(), "resolveResult", null);
        setField(term153256, term153256.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term153237, args);
        assertTrue(recursiveEquals(term153237, term153256));
        assertTrue(recursiveEquals(retValue, false));
    }

};


