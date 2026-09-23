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

public class JSType_toMaybeParameterizedType_2105210159247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30704;
     Object term30975;

    public JSType_toMaybeParameterizedType_2105210159247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term30975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term30975, term30975.getClass(), "call", null);
        setField(term30975, term30975.getClass(), "prototypeSlot", null);
        setField(term30975, term30975.getClass(), "kind", null);
        setField(term30975, term30975.getClass(), "propAccess", null);
        setField(term30975, term30975.getClass(), "typeOfThis", null);
        setField(term30975, term30975.getClass(), "source", null);
        setField(term30975, term30975.getClass(), "implementedInterfaces", null);
        setField(term30975, term30975.getClass(), "extendedInterfaces", null);
        setField(term30975, term30975.getClass(), "subTypes", null);
        setField(term30975, term30975.getClass(), "templateTypeNames", null);
        setField(term30975, term30975.getClass(), "className", null);
        setField(term30975, term30975.getClass(), "properties", null);
        setBooleanField(term30975, term30975.getClass(), "nativeType", false);
        setField(term30975, term30975.getClass(), "implicitPrototypeFallback", null);
        setField(term30975, term30975.getClass(), "ownerFunction", null);
        setBooleanField(term30975, term30975.getClass(), "prettyPrint", false);
        setBooleanField(term30975, term30975.getClass(), "visited", false);
        setField(term30975, term30975.getClass(), "docInfo", null);
        setBooleanField(term30975, term30975.getClass(), "unknown", false);
        setBooleanField(term30975, term30975.getClass(), "resolved", false);
        setField(term30975, term30975.getClass(), "resolveResult", null);
        setBooleanField(term30975, term30975.getClass(), "inTemplatedCheckVisit", false);
        setField(term30975, term30975.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term30704;
        Object retValue = callMethod(klass, "toMaybeParameterizedType", argTypes, null, args);
        assertTrue(recursiveEquals(term30704, term30975));
        assertTrue(recursiveEquals(retValue, null));
    }

};


