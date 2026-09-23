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

public class FunctionType_hasCachedValues_625426612191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86922;
     Object term86934;

    public FunctionType_hasCachedValues_625426612191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86922, term86922.getClass(), "prototype", null);
        term86934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86934, term86934.getClass(), "call", null);
        setField(term86934, term86934.getClass(), "prototype", null);
        setField(term86934, term86934.getClass(), "kind", null);
        setField(term86934, term86934.getClass(), "typeOfThis", null);
        setField(term86934, term86934.getClass(), "source", null);
        setField(term86934, term86934.getClass(), "implementedInterfaces", null);
        setField(term86934, term86934.getClass(), "subTypes", null);
        setField(term86934, term86934.getClass(), "templateTypeName", null);
        setField(term86934, term86934.getClass(), "className", null);
        setField(term86934, term86934.getClass(), "properties", null);
        setField(term86934, term86934.getClass(), "implicitPrototype", null);
        setBooleanField(term86934, term86934.getClass(), "nativeType", false);
        setBooleanField(term86934, term86934.getClass(), "visited", false);
        setField(term86934, term86934.getClass(), "docInfo", null);
        setBooleanField(term86934, term86934.getClass(), "unknown", false);
        setBooleanField(term86934, term86934.getClass(), "resolved", false);
        setField(term86934, term86934.getClass(), "resolveResult", null);
        setField(term86934, term86934.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term86922, args);
        assertTrue(recursiveEquals(term86922, term86934));
        assertTrue(recursiveEquals(retValue, true));
    }

};


