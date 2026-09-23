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

public class JSType_toMaybeParameterizedType_2105210159251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31193;
     Object term31207;

    public JSType_toMaybeParameterizedType_2105210159251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term31207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term31207, term31207.getClass(), "call", null);
        setField(term31207, term31207.getClass(), "prototypeSlot", null);
        setField(term31207, term31207.getClass(), "kind", null);
        setField(term31207, term31207.getClass(), "propAccess", null);
        setField(term31207, term31207.getClass(), "typeOfThis", null);
        setField(term31207, term31207.getClass(), "source", null);
        setField(term31207, term31207.getClass(), "implementedInterfaces", null);
        setField(term31207, term31207.getClass(), "extendedInterfaces", null);
        setField(term31207, term31207.getClass(), "subTypes", null);
        setField(term31207, term31207.getClass(), "templateTypeNames", null);
        setField(term31207, term31207.getClass(), "className", null);
        setField(term31207, term31207.getClass(), "properties", null);
        setBooleanField(term31207, term31207.getClass(), "nativeType", false);
        setField(term31207, term31207.getClass(), "implicitPrototypeFallback", null);
        setField(term31207, term31207.getClass(), "ownerFunction", null);
        setBooleanField(term31207, term31207.getClass(), "prettyPrint", false);
        setBooleanField(term31207, term31207.getClass(), "visited", false);
        setField(term31207, term31207.getClass(), "docInfo", null);
        setBooleanField(term31207, term31207.getClass(), "unknown", false);
        setBooleanField(term31207, term31207.getClass(), "resolved", false);
        setField(term31207, term31207.getClass(), "resolveResult", null);
        setBooleanField(term31207, term31207.getClass(), "inTemplatedCheckVisit", false);
        setField(term31207, term31207.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term31193;
        Object retValue = callMethod(klass, "toMaybeParameterizedType", argTypes, null, args);
        assertTrue(recursiveEquals(term31193, term31207));
        assertTrue(recursiveEquals(retValue, null));
    }

};


