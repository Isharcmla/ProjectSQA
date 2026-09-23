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

public class FunctionType_hasCachedValues_625426612307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283798;
     Object term283812;

    public FunctionType_hasCachedValues_625426612307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term283798, term283798.getClass(), "prototypeSlot", null);
        term283812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term283812, term283812.getClass(), "call", null);
        setField(term283812, term283812.getClass(), "prototypeSlot", null);
        setField(term283812, term283812.getClass(), "kind", null);
        setField(term283812, term283812.getClass(), "propAccess", null);
        setField(term283812, term283812.getClass(), "typeOfThis", null);
        setField(term283812, term283812.getClass(), "source", null);
        setField(term283812, term283812.getClass(), "implementedInterfaces", null);
        setField(term283812, term283812.getClass(), "extendedInterfaces", null);
        setField(term283812, term283812.getClass(), "subTypes", null);
        setField(term283812, term283812.getClass(), "templateTypeNames", null);
        setField(term283812, term283812.getClass(), "className", null);
        setField(term283812, term283812.getClass(), "properties", null);
        setBooleanField(term283812, term283812.getClass(), "nativeType", false);
        setField(term283812, term283812.getClass(), "implicitPrototypeFallback", null);
        setField(term283812, term283812.getClass(), "ownerFunction", null);
        setBooleanField(term283812, term283812.getClass(), "prettyPrint", false);
        setBooleanField(term283812, term283812.getClass(), "visited", false);
        setField(term283812, term283812.getClass(), "docInfo", null);
        setBooleanField(term283812, term283812.getClass(), "unknown", false);
        setBooleanField(term283812, term283812.getClass(), "resolved", false);
        setField(term283812, term283812.getClass(), "resolveResult", null);
        setBooleanField(term283812, term283812.getClass(), "inTemplatedCheckVisit", false);
        setField(term283812, term283812.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term283798, args);
        assertTrue(recursiveEquals(term283798, term283812));
        assertTrue(recursiveEquals(retValue, true));
    }

};


