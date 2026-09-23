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

public class FunctionType_getReturnType_1700324304169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78312;
     Object term78319;

    public FunctionType_getReturnType_1700324304169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term78312, term78312.getClass(), "call", null);
        term78319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term78319, term78319.getClass(), "call", null);
        setField(term78319, term78319.getClass(), "prototype", null);
        setField(term78319, term78319.getClass(), "kind", null);
        setField(term78319, term78319.getClass(), "typeOfThis", null);
        setField(term78319, term78319.getClass(), "source", null);
        setField(term78319, term78319.getClass(), "implementedInterfaces", null);
        setField(term78319, term78319.getClass(), "subTypes", null);
        setField(term78319, term78319.getClass(), "templateTypeName", null);
        setField(term78319, term78319.getClass(), "className", null);
        setField(term78319, term78319.getClass(), "properties", null);
        setField(term78319, term78319.getClass(), "implicitPrototype", null);
        setBooleanField(term78319, term78319.getClass(), "nativeType", false);
        setBooleanField(term78319, term78319.getClass(), "visited", false);
        setField(term78319, term78319.getClass(), "docInfo", null);
        setBooleanField(term78319, term78319.getClass(), "unknown", false);
        setBooleanField(term78319, term78319.getClass(), "resolved", false);
        setField(term78319, term78319.getClass(), "resolveResult", null);
        setField(term78319, term78319.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReturnType", argTypes, term78312, args);
        assertTrue(recursiveEquals(term78312, term78319));
        assertTrue(recursiveEquals(retValue, null));
    }

};


