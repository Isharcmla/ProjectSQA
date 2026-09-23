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

public class FunctionType_hasCachedValues_625426612217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119631;
     Object term119644;

    public FunctionType_hasCachedValues_625426612217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119631, term119631.getClass(), "prototype", null);
        term119644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119644, term119644.getClass(), "call", null);
        setField(term119644, term119644.getClass(), "prototype", null);
        setField(term119644, term119644.getClass(), "kind", null);
        setField(term119644, term119644.getClass(), "typeOfThis", null);
        setField(term119644, term119644.getClass(), "source", null);
        setField(term119644, term119644.getClass(), "implementedInterfaces", null);
        setField(term119644, term119644.getClass(), "subTypes", null);
        setField(term119644, term119644.getClass(), "templateTypeName", null);
        setField(term119644, term119644.getClass(), "className", null);
        setField(term119644, term119644.getClass(), "properties", null);
        setBooleanField(term119644, term119644.getClass(), "nativeType", false);
        setField(term119644, term119644.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term119644, term119644.getClass(), "prettyPrint", false);
        setBooleanField(term119644, term119644.getClass(), "visited", false);
        setField(term119644, term119644.getClass(), "docInfo", null);
        setBooleanField(term119644, term119644.getClass(), "unknown", false);
        setBooleanField(term119644, term119644.getClass(), "resolved", false);
        setField(term119644, term119644.getClass(), "resolveResult", null);
        setField(term119644, term119644.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term119631, args);
        assertTrue(recursiveEquals(term119631, term119644));
        assertTrue(recursiveEquals(retValue, true));
    }

};


