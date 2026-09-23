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

public class FunctionType_getAllImplementedInterfaces_572683533937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152052;
     Object term1154193;
     Object term1154187;

    public FunctionType_getAllImplementedInterfaces_572683533937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1154200 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1154199 = ((Class) term1154200).getDeclaredField((String) "ORDINARY");
        ((Field) term1154199).setAccessible(true);
        Object enum2075 = ((Field) term1154199).get((Object) null);
        ArrayList term1152252 = new ArrayList();
        term1152052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1152052, term1152052.getClass(), "kind", enum2075);
        setField(term1152052, term1152052.getClass(), "implementedInterfaces", term1152252);
        Class<? extends Object> term1154491 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1154490 = ((Class) term1154491).getDeclaredField((String) "ORDINARY");
        ((Field) term1154490).setAccessible(true);
        Object enum2076 = ((Field) term1154490).get((Object) null);
        ArrayList term1154197 = new ArrayList();
        term1154193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1154193, term1154193.getClass(), "call", null);
        setField(term1154193, term1154193.getClass(), "prototype", null);
        setField(term1154193, term1154193.getClass(), "kind", enum2076);
        setField(term1154193, term1154193.getClass(), "typeOfThis", null);
        setField(term1154193, term1154193.getClass(), "source", null);
        setField(term1154193, term1154193.getClass(), "implementedInterfaces", term1154197);
        setField(term1154193, term1154193.getClass(), "subTypes", null);
        setField(term1154193, term1154193.getClass(), "templateTypeName", null);
        setField(term1154193, term1154193.getClass(), "className", null);
        setField(term1154193, term1154193.getClass(), "properties", null);
        setField(term1154193, term1154193.getClass(), "implicitPrototype", null);
        setBooleanField(term1154193, term1154193.getClass(), "nativeType", false);
        setBooleanField(term1154193, term1154193.getClass(), "prettyPrint", false);
        setBooleanField(term1154193, term1154193.getClass(), "visited", false);
        setField(term1154193, term1154193.getClass(), "docInfo", null);
        setBooleanField(term1154193, term1154193.getClass(), "unknown", false);
        setBooleanField(term1154193, term1154193.getClass(), "resolved", false);
        setField(term1154193, term1154193.getClass(), "resolveResult", null);
        setField(term1154193, term1154193.getClass(), "registry", null);
        HashMap term1154188 = new HashMap();
        Set<Object> term1154781 =  ((Map) term1154188).keySet();
        term1154187 = new HashSet((Collection<? extends Object>) term1154781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term1152052, args);
        assertTrue(recursiveEquals(term1152052, term1154193));
        assertTrue(recursiveEquals(retValue, term1154187));
    }

};


