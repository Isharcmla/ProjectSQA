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
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototype_1918602805130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66937;
     Object term67203;
     Object term68342;
     Object term68348;

    public FunctionType_setPrototype_1918602805130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term68351 = ((Class) term68352).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term68351).setAccessible(true);
        Object enum166 = ((Field) term68351).get((Object) null);
        term66937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66937, term66937.getClass(), "kind", enum166);
        setField(term66937, term66937.getClass(), "typeOfThis", null);
        setField(term66937, term66937.getClass(), "prototype", null);
        term67203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term67321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term67203, term67203.getClass(), "implicitPrototypeFallback", term67321);
        Class<? extends Object> term68652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term68651 = ((Class) term68652).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term68651).setAccessible(true);
        Object enum167 = ((Field) term68651).get((Object) null);
        term68342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term68344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term68342, term68342.getClass(), "call", null);
        setField(term68343, term68343.getClass(), "ownerFunction", null);
        setField(term68343, term68343.getClass(), "className", null);
        setField(term68343, term68343.getClass(), "properties", null);
        setBooleanField(term68343, term68343.getClass(), "nativeType", false);
        setField(term68344, term68344.getClass(), "ownerFunction", null);
        setField(term68344, term68344.getClass(), "className", null);
        setField(term68344, term68344.getClass(), "properties", null);
        setBooleanField(term68344, term68344.getClass(), "nativeType", false);
        setField(term68344, term68344.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term68344, term68344.getClass(), "prettyPrint", false);
        setBooleanField(term68344, term68344.getClass(), "visited", false);
        setField(term68344, term68344.getClass(), "docInfo", null);
        setBooleanField(term68344, term68344.getClass(), "unknown", false);
        setBooleanField(term68344, term68344.getClass(), "resolved", false);
        setField(term68344, term68344.getClass(), "resolveResult", null);
        setField(term68344, term68344.getClass(), "registry", null);
        setField(term68343, term68343.getClass(), "implicitPrototypeFallback", term68344);
        setBooleanField(term68343, term68343.getClass(), "prettyPrint", false);
        setBooleanField(term68343, term68343.getClass(), "visited", false);
        setField(term68343, term68343.getClass(), "docInfo", null);
        setBooleanField(term68343, term68343.getClass(), "unknown", false);
        setBooleanField(term68343, term68343.getClass(), "resolved", false);
        setField(term68343, term68343.getClass(), "resolveResult", null);
        setField(term68343, term68343.getClass(), "registry", null);
        setField(term68342, term68342.getClass(), "prototype", term68343);
        setField(term68342, term68342.getClass(), "kind", enum167);
        setField(term68342, term68342.getClass(), "typeOfThis", null);
        setField(term68342, term68342.getClass(), "source", null);
        setField(term68342, term68342.getClass(), "implementedInterfaces", null);
        setField(term68342, term68342.getClass(), "subTypes", null);
        setField(term68342, term68342.getClass(), "templateTypeName", null);
        setField(term68342, term68342.getClass(), "className", null);
        setField(term68342, term68342.getClass(), "properties", null);
        setBooleanField(term68342, term68342.getClass(), "nativeType", false);
        setField(term68342, term68342.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term68342, term68342.getClass(), "prettyPrint", false);
        setBooleanField(term68342, term68342.getClass(), "visited", false);
        setField(term68342, term68342.getClass(), "docInfo", null);
        setBooleanField(term68342, term68342.getClass(), "unknown", false);
        setBooleanField(term68342, term68342.getClass(), "resolved", false);
        setField(term68342, term68342.getClass(), "resolveResult", null);
        setField(term68342, term68342.getClass(), "registry", null);
        term68348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term68349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term68348, term68348.getClass(), "ownerFunction", null);
        setField(term68348, term68348.getClass(), "className", null);
        setField(term68348, term68348.getClass(), "properties", null);
        setBooleanField(term68348, term68348.getClass(), "nativeType", false);
        setField(term68349, term68349.getClass(), "ownerFunction", null);
        setField(term68349, term68349.getClass(), "className", null);
        setField(term68349, term68349.getClass(), "properties", null);
        setBooleanField(term68349, term68349.getClass(), "nativeType", false);
        setField(term68349, term68349.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term68349, term68349.getClass(), "prettyPrint", false);
        setBooleanField(term68349, term68349.getClass(), "visited", false);
        setField(term68349, term68349.getClass(), "docInfo", null);
        setBooleanField(term68349, term68349.getClass(), "unknown", false);
        setBooleanField(term68349, term68349.getClass(), "resolved", false);
        setField(term68349, term68349.getClass(), "resolveResult", null);
        setField(term68349, term68349.getClass(), "registry", null);
        setField(term68348, term68348.getClass(), "implicitPrototypeFallback", term68349);
        setBooleanField(term68348, term68348.getClass(), "prettyPrint", false);
        setBooleanField(term68348, term68348.getClass(), "visited", false);
        setField(term68348, term68348.getClass(), "docInfo", null);
        setBooleanField(term68348, term68348.getClass(), "unknown", false);
        setBooleanField(term68348, term68348.getClass(), "resolved", false);
        setField(term68348, term68348.getClass(), "resolveResult", null);
        setField(term68348, term68348.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term67203;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term66937, args);
        assertTrue(recursiveEquals(term66937, term68342));
        assertTrue(recursiveEquals(term67203, term68348));
        assertTrue(recursiveEquals(retValue, true));
    }

};


