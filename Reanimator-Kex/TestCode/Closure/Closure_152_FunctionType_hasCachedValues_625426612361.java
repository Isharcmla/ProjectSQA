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

public class FunctionType_hasCachedValues_625426612361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254923;
     Object term254936;

    public FunctionType_hasCachedValues_625426612361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term254923, term254923.getClass(), "prototype", null);
        setBooleanField(term254923, term254923.getClass(), "unknown", true);
        term254936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term254936, term254936.getClass(), "call", null);
        setField(term254936, term254936.getClass(), "prototype", null);
        setField(term254936, term254936.getClass(), "kind", null);
        setField(term254936, term254936.getClass(), "typeOfThis", null);
        setField(term254936, term254936.getClass(), "source", null);
        setField(term254936, term254936.getClass(), "implementedInterfaces", null);
        setField(term254936, term254936.getClass(), "subTypes", null);
        setField(term254936, term254936.getClass(), "templateTypeName", null);
        setField(term254936, term254936.getClass(), "className", null);
        setField(term254936, term254936.getClass(), "properties", null);
        setBooleanField(term254936, term254936.getClass(), "nativeType", false);
        setField(term254936, term254936.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term254936, term254936.getClass(), "prettyPrint", false);
        setBooleanField(term254936, term254936.getClass(), "visited", false);
        setField(term254936, term254936.getClass(), "docInfo", null);
        setBooleanField(term254936, term254936.getClass(), "unknown", true);
        setBooleanField(term254936, term254936.getClass(), "resolved", false);
        setField(term254936, term254936.getClass(), "resolveResult", null);
        setField(term254936, term254936.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term254923, args);
        assertTrue(recursiveEquals(term254923, term254936));
        assertTrue(recursiveEquals(retValue, false));
    }

};


