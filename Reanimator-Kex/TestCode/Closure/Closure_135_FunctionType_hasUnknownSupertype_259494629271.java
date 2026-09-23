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

public class FunctionType_hasUnknownSupertype_259494629271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137852;
     Object term138627;

    public FunctionType_hasUnknownSupertype_259494629271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138635 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term138634 = ((Class) term138635).getDeclaredField((String) "INTERFACE");
        ((Field) term138634).setAccessible(true);
        Object enum259 = ((Field) term138634).get((Object) null);
        term137852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term138118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term138236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term137852, term137852.getClass(), "kind", enum259);
        setBooleanField(term137852, term137852.getClass(), "unknown", false);
        setField(term138118, term138118.getClass(), "implicitPrototype", term138236);
        setField(term137852, term137852.getClass(), "prototype", term138118);
        Class<? extends Object> term138929 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term138928 = ((Class) term138929).getDeclaredField((String) "INTERFACE");
        ((Field) term138928).setAccessible(true);
        Object enum260 = ((Field) term138928).get((Object) null);
        term138627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term138628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term138629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term138627, term138627.getClass(), "call", null);
        setField(term138628, term138628.getClass(), "ownerFunction", null);
        setField(term138628, term138628.getClass(), "className", null);
        setField(term138628, term138628.getClass(), "properties", null);
        setField(term138629, term138629.getClass(), "ownerFunction", null);
        setField(term138629, term138629.getClass(), "className", null);
        setField(term138629, term138629.getClass(), "properties", null);
        setField(term138629, term138629.getClass(), "implicitPrototype", null);
        setBooleanField(term138629, term138629.getClass(), "nativeType", false);
        setBooleanField(term138629, term138629.getClass(), "visited", false);
        setField(term138629, term138629.getClass(), "docInfo", null);
        setBooleanField(term138629, term138629.getClass(), "unknown", false);
        setBooleanField(term138629, term138629.getClass(), "resolved", false);
        setField(term138629, term138629.getClass(), "resolveResult", null);
        setField(term138629, term138629.getClass(), "registry", null);
        setField(term138628, term138628.getClass(), "implicitPrototype", term138629);
        setBooleanField(term138628, term138628.getClass(), "nativeType", false);
        setBooleanField(term138628, term138628.getClass(), "visited", false);
        setField(term138628, term138628.getClass(), "docInfo", null);
        setBooleanField(term138628, term138628.getClass(), "unknown", false);
        setBooleanField(term138628, term138628.getClass(), "resolved", false);
        setField(term138628, term138628.getClass(), "resolveResult", null);
        setField(term138628, term138628.getClass(), "registry", null);
        setField(term138627, term138627.getClass(), "prototype", term138628);
        setField(term138627, term138627.getClass(), "kind", enum260);
        setField(term138627, term138627.getClass(), "typeOfThis", null);
        setField(term138627, term138627.getClass(), "source", null);
        setField(term138627, term138627.getClass(), "implementedInterfaces", null);
        setField(term138627, term138627.getClass(), "subTypes", null);
        setField(term138627, term138627.getClass(), "templateTypeName", null);
        setField(term138627, term138627.getClass(), "className", null);
        setField(term138627, term138627.getClass(), "properties", null);
        setField(term138627, term138627.getClass(), "implicitPrototype", null);
        setBooleanField(term138627, term138627.getClass(), "nativeType", false);
        setBooleanField(term138627, term138627.getClass(), "visited", false);
        setField(term138627, term138627.getClass(), "docInfo", null);
        setBooleanField(term138627, term138627.getClass(), "unknown", false);
        setBooleanField(term138627, term138627.getClass(), "resolved", false);
        setField(term138627, term138627.getClass(), "resolveResult", null);
        setField(term138627, term138627.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term137852, args);
        assertTrue(recursiveEquals(term137852, term138627));
        assertTrue(recursiveEquals(retValue, false));
    }

};


