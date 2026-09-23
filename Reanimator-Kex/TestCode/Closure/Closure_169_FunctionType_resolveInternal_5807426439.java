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
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401870;
     Object term403099;

    public FunctionType_resolveInternal_5807426439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term401922 = new ArrayList();
        term401870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term401870, term401870.getClass(), "resolveResult", null);
        setBooleanField(term401870, term401870.getClass(), "resolved", false);
        setField(term401870, term401870.getClass(), "call", null);
        setField(term401870, term401870.getClass(), "prototypeSlot", null);
        setField(term401870, term401870.getClass(), "typeOfThis", null);
        setField(term401870, term401870.getClass(), "implementedInterfaces", term401922);
        ArrayList term403100 = new ArrayList();
        term403099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term403099, term403099.getClass(), "call", null);
        setField(term403099, term403099.getClass(), "prototypeSlot", null);
        setField(term403099, term403099.getClass(), "kind", null);
        setField(term403099, term403099.getClass(), "propAccess", null);
        setField(term403099, term403099.getClass(), "typeOfThis", null);
        setField(term403099, term403099.getClass(), "source", null);
        setField(term403099, term403099.getClass(), "implementedInterfaces", term403100);
        setField(term403099, term403099.getClass(), "extendedInterfaces", null);
        setField(term403099, term403099.getClass(), "subTypes", null);
        setField(term403099, term403099.getClass(), "templateTypeNames", null);
        setField(term403099, term403099.getClass(), "className", null);
        setField(term403099, term403099.getClass(), "properties", null);
        setBooleanField(term403099, term403099.getClass(), "nativeType", false);
        setField(term403099, term403099.getClass(), "implicitPrototypeFallback", null);
        setField(term403099, term403099.getClass(), "ownerFunction", null);
        setBooleanField(term403099, term403099.getClass(), "prettyPrint", false);
        setBooleanField(term403099, term403099.getClass(), "visited", false);
        setField(term403099, term403099.getClass(), "docInfo", null);
        setBooleanField(term403099, term403099.getClass(), "unknown", false);
        setBooleanField(term403099, term403099.getClass(), "resolved", false);
        setField(term403099, term403099.getClass(), "resolveResult", null);
        setBooleanField(term403099, term403099.getClass(), "inTemplatedCheckVisit", false);
        setField(term403099, term403099.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term401870, args);
        assertTrue(recursiveEquals(term401870, term403099));
    }

};


