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

public class FunctionType_isEquivalentTo_230708275347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235674;
     Object term235932;
     Object term236276;
     Object term236280;

    public FunctionType_isEquivalentTo_230708275347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term236282 = ((Class) term236283).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term236282).setAccessible(true);
        Object enum413 = ((Field) term236282).get((Object) null);
        term235674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term235674, term235674.getClass(), "kind", enum413);
        term235932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term236583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term236582 = ((Class) term236583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term236582).setAccessible(true);
        Object enum414 = ((Field) term236582).get((Object) null);
        term236276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term236276, term236276.getClass(), "call", null);
        setField(term236276, term236276.getClass(), "prototype", null);
        setField(term236276, term236276.getClass(), "kind", enum414);
        setField(term236276, term236276.getClass(), "typeOfThis", null);
        setField(term236276, term236276.getClass(), "source", null);
        setField(term236276, term236276.getClass(), "implementedInterfaces", null);
        setField(term236276, term236276.getClass(), "subTypes", null);
        setField(term236276, term236276.getClass(), "templateTypeName", null);
        setField(term236276, term236276.getClass(), "className", null);
        setField(term236276, term236276.getClass(), "properties", null);
        setBooleanField(term236276, term236276.getClass(), "nativeType", false);
        setField(term236276, term236276.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term236276, term236276.getClass(), "prettyPrint", false);
        setBooleanField(term236276, term236276.getClass(), "visited", false);
        setField(term236276, term236276.getClass(), "docInfo", null);
        setBooleanField(term236276, term236276.getClass(), "unknown", false);
        setBooleanField(term236276, term236276.getClass(), "resolved", false);
        setField(term236276, term236276.getClass(), "resolveResult", null);
        setField(term236276, term236276.getClass(), "registry", null);
        term236280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term236280, term236280.getClass(), "call", null);
        setField(term236280, term236280.getClass(), "prototype", null);
        setField(term236280, term236280.getClass(), "kind", null);
        setField(term236280, term236280.getClass(), "typeOfThis", null);
        setField(term236280, term236280.getClass(), "source", null);
        setField(term236280, term236280.getClass(), "implementedInterfaces", null);
        setField(term236280, term236280.getClass(), "subTypes", null);
        setField(term236280, term236280.getClass(), "templateTypeName", null);
        setField(term236280, term236280.getClass(), "className", null);
        setField(term236280, term236280.getClass(), "properties", null);
        setBooleanField(term236280, term236280.getClass(), "nativeType", false);
        setField(term236280, term236280.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term236280, term236280.getClass(), "prettyPrint", false);
        setBooleanField(term236280, term236280.getClass(), "visited", false);
        setField(term236280, term236280.getClass(), "docInfo", null);
        setBooleanField(term236280, term236280.getClass(), "unknown", false);
        setBooleanField(term236280, term236280.getClass(), "resolved", false);
        setField(term236280, term236280.getClass(), "resolveResult", null);
        setField(term236280, term236280.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term235932;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term235674, args);
        assertTrue(recursiveEquals(term235674, term236276));
        assertTrue(recursiveEquals(term235932, term236280));
        assertTrue(recursiveEquals(retValue, false));
    }

};


