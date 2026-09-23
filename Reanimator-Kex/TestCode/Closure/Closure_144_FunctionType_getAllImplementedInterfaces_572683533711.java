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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757505;
     Object term758044;
     Object term758038;

    public FunctionType_getAllImplementedInterfaces_572683533711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term758051 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term758050 = ((Class) term758051).getDeclaredField((String) "INTERFACE");
        ((Field) term758050).setAccessible(true);
        Object enum1364 = ((Field) term758050).get((Object) null);
        ArrayList term757705 = new ArrayList();
        term757505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term757505, term757505.getClass(), "kind", enum1364);
        setField(term757505, term757505.getClass(), "implementedInterfaces", term757705);
        Class<? extends Object> term758345 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term758344 = ((Class) term758345).getDeclaredField((String) "INTERFACE");
        ((Field) term758344).setAccessible(true);
        Object enum1365 = ((Field) term758344).get((Object) null);
        ArrayList term758048 = new ArrayList();
        term758044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term758044, term758044.getClass(), "call", null);
        setField(term758044, term758044.getClass(), "prototype", null);
        setField(term758044, term758044.getClass(), "kind", enum1365);
        setField(term758044, term758044.getClass(), "typeOfThis", null);
        setField(term758044, term758044.getClass(), "source", null);
        setField(term758044, term758044.getClass(), "implementedInterfaces", term758048);
        setField(term758044, term758044.getClass(), "subTypes", null);
        setField(term758044, term758044.getClass(), "templateTypeName", null);
        setField(term758044, term758044.getClass(), "className", null);
        setField(term758044, term758044.getClass(), "properties", null);
        setField(term758044, term758044.getClass(), "implicitPrototype", null);
        setBooleanField(term758044, term758044.getClass(), "nativeType", false);
        setBooleanField(term758044, term758044.getClass(), "prettyPrint", false);
        setBooleanField(term758044, term758044.getClass(), "visited", false);
        setField(term758044, term758044.getClass(), "docInfo", null);
        setBooleanField(term758044, term758044.getClass(), "unknown", false);
        setBooleanField(term758044, term758044.getClass(), "resolved", false);
        setField(term758044, term758044.getClass(), "resolveResult", null);
        setField(term758044, term758044.getClass(), "registry", null);
        HashMap term758039 = new HashMap();
        Set<Object> term758638 =  ((Map) term758039).keySet();
        term758038 = new HashSet((Collection<? extends Object>) term758638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term757505, args);
        assertTrue(recursiveEquals(term757505, term758044));
        assertTrue(recursiveEquals(retValue, term758038));
    }

};


