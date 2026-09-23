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

public class FunctionType_getAllImplementedInterfaces_572683533383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233765;
     Object term234874;
     Object term234868;

    public FunctionType_getAllImplementedInterfaces_572683533383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234886 = ((Class) term234887).getDeclaredField((String) "INTERFACE");
        ((Field) term234886).setAccessible(true);
        Object enum422 = ((Field) term234886).get((Object) null);
        ArrayList term234261 = new ArrayList();
        term233765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term233765, term233765.getClass(), "kind", enum422);
        setField(term233765, term233765.getClass(), "implementedInterfaces", term234261);
        Class<? extends Object> term235181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term235180 = ((Class) term235181).getDeclaredField((String) "ORDINARY");
        ((Field) term235180).setAccessible(true);
        Object enum423 = ((Field) term235180).get((Object) null);
        ArrayList term234878 = new ArrayList();
        term234874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term234874, term234874.getClass(), "call", null);
        setField(term234874, term234874.getClass(), "prototype", null);
        setField(term234874, term234874.getClass(), "kind", enum423);
        setField(term234874, term234874.getClass(), "typeOfThis", null);
        setField(term234874, term234874.getClass(), "source", null);
        setField(term234874, term234874.getClass(), "implementedInterfaces", term234878);
        setField(term234874, term234874.getClass(), "subTypes", null);
        setField(term234874, term234874.getClass(), "templateTypeName", null);
        setField(term234874, term234874.getClass(), "className", null);
        setField(term234874, term234874.getClass(), "properties", null);
        setField(term234874, term234874.getClass(), "implicitPrototype", null);
        setBooleanField(term234874, term234874.getClass(), "nativeType", false);
        setBooleanField(term234874, term234874.getClass(), "visited", false);
        setField(term234874, term234874.getClass(), "docInfo", null);
        setBooleanField(term234874, term234874.getClass(), "unknown", false);
        setBooleanField(term234874, term234874.getClass(), "resolved", false);
        setField(term234874, term234874.getClass(), "resolveResult", null);
        setField(term234874, term234874.getClass(), "registry", null);
        HashMap term234869 = new HashMap();
        Set<Object> term235471 =  ((Map) term234869).keySet();
        term234868 = new HashSet((Collection<? extends Object>) term235471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term233765, args);
        assertTrue(recursiveEquals(term233765, term234874));
        assertTrue(recursiveEquals(retValue, term234868));
    }

};


