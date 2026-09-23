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

public class FunctionType_hashCode_1481422575145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73534;
     Object term73556;

    public FunctionType_hashCode_1481422575145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term73556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term73556, term73556.getClass(), "leastSupertypeVisitor", null);
        setField(term73556, term73556.getClass(), "greatestSubtypeVisitor", null);
        setField(term73556, term73556.getClass(), "call", null);
        setField(term73556, term73556.getClass(), "prototype", null);
        setField(term73556, term73556.getClass(), "kind", null);
        setField(term73556, term73556.getClass(), "typeOfThis", null);
        setField(term73556, term73556.getClass(), "source", null);
        setField(term73556, term73556.getClass(), "implementedInterfaces", null);
        setField(term73556, term73556.getClass(), "subTypes", null);
        setField(term73556, term73556.getClass(), "templateTypeName", null);
        setField(term73556, term73556.getClass(), "className", null);
        setField(term73556, term73556.getClass(), "properties", null);
        setBooleanField(term73556, term73556.getClass(), "nativeType", false);
        setField(term73556, term73556.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term73556, term73556.getClass(), "prettyPrint", false);
        setBooleanField(term73556, term73556.getClass(), "visited", false);
        setField(term73556, term73556.getClass(), "docInfo", null);
        setBooleanField(term73556, term73556.getClass(), "unknown", false);
        setBooleanField(term73556, term73556.getClass(), "resolved", false);
        setField(term73556, term73556.getClass(), "resolveResult", null);
        setField(term73556, term73556.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term73534, args);
        assertTrue(recursiveEquals(term73534, term73556));
    }

};


