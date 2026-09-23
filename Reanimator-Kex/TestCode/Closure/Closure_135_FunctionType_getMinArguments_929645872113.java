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

public class FunctionType_getMinArguments_929645872113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60822;
     Object term60833;

    public FunctionType_getMinArguments_929645872113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term60833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term60833, term60833.getClass(), "this$0", null);
        setField(term60833, term60833.getClass(), "call", null);
        setField(term60833, term60833.getClass(), "prototype", null);
        setField(term60833, term60833.getClass(), "kind", null);
        setField(term60833, term60833.getClass(), "typeOfThis", null);
        setField(term60833, term60833.getClass(), "source", null);
        setField(term60833, term60833.getClass(), "implementedInterfaces", null);
        setField(term60833, term60833.getClass(), "subTypes", null);
        setField(term60833, term60833.getClass(), "templateTypeName", null);
        setField(term60833, term60833.getClass(), "className", null);
        setField(term60833, term60833.getClass(), "properties", null);
        setField(term60833, term60833.getClass(), "implicitPrototype", null);
        setBooleanField(term60833, term60833.getClass(), "nativeType", false);
        setBooleanField(term60833, term60833.getClass(), "visited", false);
        setField(term60833, term60833.getClass(), "docInfo", null);
        setBooleanField(term60833, term60833.getClass(), "unknown", false);
        setBooleanField(term60833, term60833.getClass(), "resolved", false);
        setField(term60833, term60833.getClass(), "resolveResult", null);
        setField(term60833, term60833.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term60822, args);
        assertTrue(recursiveEquals(term60822, term60833));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


