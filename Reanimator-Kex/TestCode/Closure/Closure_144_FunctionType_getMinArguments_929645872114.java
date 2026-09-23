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

public class FunctionType_getMinArguments_929645872114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62299;
     Object term62888;

    public FunctionType_getMinArguments_929645872114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term62393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term62393, term62393.getClass(), "parameters", null);
        setField(term62299, term62299.getClass(), "call", term62393);
        term62888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term62889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term62889, term62889.getClass(), "parameters", null);
        setField(term62889, term62889.getClass(), "returnType", null);
        setBooleanField(term62889, term62889.getClass(), "returnTypeInferred", false);
        setBooleanField(term62889, term62889.getClass(), "resolved", false);
        setField(term62889, term62889.getClass(), "resolveResult", null);
        setField(term62889, term62889.getClass(), "registry", null);
        setField(term62888, term62888.getClass(), "call", term62889);
        setField(term62888, term62888.getClass(), "prototype", null);
        setField(term62888, term62888.getClass(), "kind", null);
        setField(term62888, term62888.getClass(), "typeOfThis", null);
        setField(term62888, term62888.getClass(), "source", null);
        setField(term62888, term62888.getClass(), "implementedInterfaces", null);
        setField(term62888, term62888.getClass(), "subTypes", null);
        setField(term62888, term62888.getClass(), "templateTypeName", null);
        setField(term62888, term62888.getClass(), "className", null);
        setField(term62888, term62888.getClass(), "properties", null);
        setField(term62888, term62888.getClass(), "implicitPrototype", null);
        setBooleanField(term62888, term62888.getClass(), "nativeType", false);
        setBooleanField(term62888, term62888.getClass(), "prettyPrint", false);
        setBooleanField(term62888, term62888.getClass(), "visited", false);
        setField(term62888, term62888.getClass(), "docInfo", null);
        setBooleanField(term62888, term62888.getClass(), "unknown", false);
        setBooleanField(term62888, term62888.getClass(), "resolved", false);
        setField(term62888, term62888.getClass(), "resolveResult", null);
        setField(term62888, term62888.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term62299, args);
        assertTrue(recursiveEquals(term62299, term62888));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


