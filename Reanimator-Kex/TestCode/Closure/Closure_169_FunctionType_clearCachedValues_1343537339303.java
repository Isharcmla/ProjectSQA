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

public class FunctionType_clearCachedValues_1343537339303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283470;
     Object term283482;

    public FunctionType_clearCachedValues_1343537339303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term283470, term283470.getClass(), "unknown", false);
        setField(term283470, term283470.getClass(), "subTypes", null);
        setBooleanField(term283470, term283470.getClass(), "nativeType", true);
        term283482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term283482, term283482.getClass(), "call", null);
        setField(term283482, term283482.getClass(), "prototypeSlot", null);
        setField(term283482, term283482.getClass(), "kind", null);
        setField(term283482, term283482.getClass(), "propAccess", null);
        setField(term283482, term283482.getClass(), "typeOfThis", null);
        setField(term283482, term283482.getClass(), "source", null);
        setField(term283482, term283482.getClass(), "implementedInterfaces", null);
        setField(term283482, term283482.getClass(), "extendedInterfaces", null);
        setField(term283482, term283482.getClass(), "subTypes", null);
        setField(term283482, term283482.getClass(), "templateTypeNames", null);
        setField(term283482, term283482.getClass(), "className", null);
        setField(term283482, term283482.getClass(), "properties", null);
        setBooleanField(term283482, term283482.getClass(), "nativeType", true);
        setField(term283482, term283482.getClass(), "implicitPrototypeFallback", null);
        setField(term283482, term283482.getClass(), "ownerFunction", null);
        setBooleanField(term283482, term283482.getClass(), "prettyPrint", false);
        setBooleanField(term283482, term283482.getClass(), "visited", false);
        setField(term283482, term283482.getClass(), "docInfo", null);
        setBooleanField(term283482, term283482.getClass(), "unknown", true);
        setBooleanField(term283482, term283482.getClass(), "resolved", false);
        setField(term283482, term283482.getClass(), "resolveResult", null);
        setBooleanField(term283482, term283482.getClass(), "inTemplatedCheckVisit", false);
        setField(term283482, term283482.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term283470, args);
        assertTrue(recursiveEquals(term283470, term283482));
    }

};


