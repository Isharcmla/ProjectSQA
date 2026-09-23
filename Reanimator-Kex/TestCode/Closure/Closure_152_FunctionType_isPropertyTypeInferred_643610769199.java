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

public class FunctionType_isPropertyTypeInferred_643610769199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99492;
     Object term100202;

    public FunctionType_isPropertyTypeInferred_643610769199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100202, term100202.getClass(), "call", null);
        setField(term100202, term100202.getClass(), "prototype", null);
        setField(term100202, term100202.getClass(), "kind", null);
        setField(term100202, term100202.getClass(), "typeOfThis", null);
        setField(term100202, term100202.getClass(), "source", null);
        setField(term100202, term100202.getClass(), "implementedInterfaces", null);
        setField(term100202, term100202.getClass(), "subTypes", null);
        setField(term100202, term100202.getClass(), "templateTypeName", null);
        setField(term100202, term100202.getClass(), "className", null);
        setField(term100202, term100202.getClass(), "properties", null);
        setBooleanField(term100202, term100202.getClass(), "nativeType", false);
        setField(term100202, term100202.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100202, term100202.getClass(), "prettyPrint", false);
        setBooleanField(term100202, term100202.getClass(), "visited", false);
        setField(term100202, term100202.getClass(), "docInfo", null);
        setBooleanField(term100202, term100202.getClass(), "unknown", false);
        setBooleanField(term100202, term100202.getClass(), "resolved", false);
        setField(term100202, term100202.getClass(), "resolveResult", null);
        setField(term100202, term100202.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term99492, args);
        assertTrue(recursiveEquals(term99492, term100202));
        assertTrue(recursiveEquals(retValue, true));
    }

};


