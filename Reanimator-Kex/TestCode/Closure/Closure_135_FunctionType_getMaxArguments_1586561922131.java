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

public class FunctionType_getMaxArguments_1586561922131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64005;
     Object term64014;

    public FunctionType_getMaxArguments_1586561922131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term64014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term64014, term64014.getClass(), "this$0", null);
        setField(term64014, term64014.getClass(), "call", null);
        setField(term64014, term64014.getClass(), "prototype", null);
        setField(term64014, term64014.getClass(), "kind", null);
        setField(term64014, term64014.getClass(), "typeOfThis", null);
        setField(term64014, term64014.getClass(), "source", null);
        setField(term64014, term64014.getClass(), "implementedInterfaces", null);
        setField(term64014, term64014.getClass(), "subTypes", null);
        setField(term64014, term64014.getClass(), "templateTypeName", null);
        setField(term64014, term64014.getClass(), "className", null);
        setField(term64014, term64014.getClass(), "properties", null);
        setField(term64014, term64014.getClass(), "implicitPrototype", null);
        setBooleanField(term64014, term64014.getClass(), "nativeType", false);
        setBooleanField(term64014, term64014.getClass(), "visited", false);
        setField(term64014, term64014.getClass(), "docInfo", null);
        setBooleanField(term64014, term64014.getClass(), "unknown", false);
        setBooleanField(term64014, term64014.getClass(), "resolved", false);
        setField(term64014, term64014.getClass(), "resolveResult", null);
        setField(term64014, term64014.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term64005, args);
        assertTrue(recursiveEquals(term64005, term64014));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


