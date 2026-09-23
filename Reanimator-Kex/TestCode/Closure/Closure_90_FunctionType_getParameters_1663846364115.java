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

public class FunctionType_getParameters_1663846364115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64312;
     Object term64418;
     Object term64417;

    public FunctionType_getParameters_1663846364115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64406, term64406.getClass(), "parameters", null);
        setField(term64312, term64312.getClass(), "call", term64406);
        term64418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64419, term64419.getClass(), "parameters", null);
        setField(term64419, term64419.getClass(), "returnType", null);
        setBooleanField(term64419, term64419.getClass(), "returnTypeInferred", false);
        setBooleanField(term64419, term64419.getClass(), "resolved", false);
        setField(term64419, term64419.getClass(), "resolveResult", null);
        setField(term64419, term64419.getClass(), "registry", null);
        setField(term64418, term64418.getClass(), "call", term64419);
        setField(term64418, term64418.getClass(), "prototype", null);
        setField(term64418, term64418.getClass(), "kind", null);
        setField(term64418, term64418.getClass(), "typeOfThis", null);
        setField(term64418, term64418.getClass(), "source", null);
        setField(term64418, term64418.getClass(), "implementedInterfaces", null);
        setField(term64418, term64418.getClass(), "subTypes", null);
        setField(term64418, term64418.getClass(), "templateTypeName", null);
        setField(term64418, term64418.getClass(), "className", null);
        setField(term64418, term64418.getClass(), "properties", null);
        setBooleanField(term64418, term64418.getClass(), "nativeType", false);
        setField(term64418, term64418.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term64418, term64418.getClass(), "prettyPrint", false);
        setBooleanField(term64418, term64418.getClass(), "visited", false);
        setField(term64418, term64418.getClass(), "docInfo", null);
        setBooleanField(term64418, term64418.getClass(), "unknown", false);
        setBooleanField(term64418, term64418.getClass(), "resolved", false);
        setField(term64418, term64418.getClass(), "resolveResult", null);
        setField(term64418, term64418.getClass(), "registry", null);
        term64417 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term64312, args);
        assertTrue(recursiveEquals(term64312, term64418));
        assertTrue(recursiveEquals(retValue, term64417));
    }

};


