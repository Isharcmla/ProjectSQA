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

public class FunctionType_hasCachedValues_625426612154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75680;
     Object term76303;

    public FunctionType_hasCachedValues_625426612154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75680, term75680.getClass(), "prototype", null);
        term76303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term76303, term76303.getClass(), "call", null);
        setField(term76303, term76303.getClass(), "prototype", null);
        setField(term76303, term76303.getClass(), "kind", null);
        setField(term76303, term76303.getClass(), "typeOfThis", null);
        setField(term76303, term76303.getClass(), "source", null);
        setField(term76303, term76303.getClass(), "implementedInterfaces", null);
        setField(term76303, term76303.getClass(), "subTypes", null);
        setField(term76303, term76303.getClass(), "templateTypeName", null);
        setField(term76303, term76303.getClass(), "className", null);
        setField(term76303, term76303.getClass(), "properties", null);
        setField(term76303, term76303.getClass(), "implicitPrototype", null);
        setBooleanField(term76303, term76303.getClass(), "nativeType", false);
        setBooleanField(term76303, term76303.getClass(), "prettyPrint", false);
        setBooleanField(term76303, term76303.getClass(), "visited", false);
        setField(term76303, term76303.getClass(), "docInfo", null);
        setBooleanField(term76303, term76303.getClass(), "unknown", false);
        setBooleanField(term76303, term76303.getClass(), "resolved", false);
        setField(term76303, term76303.getClass(), "resolveResult", null);
        setField(term76303, term76303.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term75680, args);
        assertTrue(recursiveEquals(term75680, term76303));
        assertTrue(recursiveEquals(retValue, true));
    }

};


