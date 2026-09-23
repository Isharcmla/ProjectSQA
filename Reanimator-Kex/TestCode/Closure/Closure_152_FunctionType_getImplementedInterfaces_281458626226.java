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

public class FunctionType_getImplementedInterfaces_281458626226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115144;
     Object term115899;

    public FunctionType_getImplementedInterfaces_281458626226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term115899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term115899, term115899.getClass(), "call", null);
        setField(term115899, term115899.getClass(), "prototype", null);
        setField(term115899, term115899.getClass(), "kind", null);
        setField(term115899, term115899.getClass(), "typeOfThis", null);
        setField(term115899, term115899.getClass(), "source", null);
        setField(term115899, term115899.getClass(), "implementedInterfaces", null);
        setField(term115899, term115899.getClass(), "subTypes", null);
        setField(term115899, term115899.getClass(), "templateTypeName", null);
        setField(term115899, term115899.getClass(), "className", null);
        setField(term115899, term115899.getClass(), "properties", null);
        setBooleanField(term115899, term115899.getClass(), "nativeType", false);
        setField(term115899, term115899.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term115899, term115899.getClass(), "prettyPrint", false);
        setBooleanField(term115899, term115899.getClass(), "visited", false);
        setField(term115899, term115899.getClass(), "docInfo", null);
        setBooleanField(term115899, term115899.getClass(), "unknown", false);
        setBooleanField(term115899, term115899.getClass(), "resolved", false);
        setField(term115899, term115899.getClass(), "resolveResult", null);
        setField(term115899, term115899.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term115144, args);
        assertTrue(recursiveEquals(term115144, term115899));
        assertTrue(recursiveEquals(retValue, null));
    }

};


