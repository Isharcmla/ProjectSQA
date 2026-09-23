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

public class FunctionType_getAllImplementedInterfaces_572683533213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111955;
     Object term112796;
     Object term112790;

    public FunctionType_getAllImplementedInterfaces_572683533213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term112802 = ((Class) term112803).getDeclaredField((String) "ORDINARY");
        ((Field) term112802).setAccessible(true);
        Object enum231 = ((Field) term112802).get((Object) null);
        ArrayList term112451 = new ArrayList();
        term111955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term111955, term111955.getClass(), "kind", enum231);
        setField(term111955, term111955.getClass(), "implementedInterfaces", term112451);
        Class<? extends Object> term113094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term113093 = ((Class) term113094).getDeclaredField((String) "INTERFACE");
        ((Field) term113093).setAccessible(true);
        Object enum232 = ((Field) term113093).get((Object) null);
        ArrayList term112800 = new ArrayList();
        term112796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term112796, term112796.getClass(), "call", null);
        setField(term112796, term112796.getClass(), "prototype", null);
        setField(term112796, term112796.getClass(), "kind", enum232);
        setField(term112796, term112796.getClass(), "typeOfThis", null);
        setField(term112796, term112796.getClass(), "source", null);
        setField(term112796, term112796.getClass(), "implementedInterfaces", term112800);
        setField(term112796, term112796.getClass(), "subTypes", null);
        setField(term112796, term112796.getClass(), "templateTypeName", null);
        setField(term112796, term112796.getClass(), "className", null);
        setField(term112796, term112796.getClass(), "properties", null);
        setField(term112796, term112796.getClass(), "implicitPrototype", null);
        setBooleanField(term112796, term112796.getClass(), "nativeType", false);
        setBooleanField(term112796, term112796.getClass(), "prettyPrint", false);
        setBooleanField(term112796, term112796.getClass(), "visited", false);
        setField(term112796, term112796.getClass(), "docInfo", null);
        setBooleanField(term112796, term112796.getClass(), "unknown", false);
        setBooleanField(term112796, term112796.getClass(), "resolved", false);
        setField(term112796, term112796.getClass(), "resolveResult", null);
        setField(term112796, term112796.getClass(), "registry", null);
        HashMap term112791 = new HashMap();
        Set<Object> term113387 =  ((Map) term112791).keySet();
        term112790 = new HashSet((Collection<? extends Object>) term113387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term111955, args);
        assertTrue(recursiveEquals(term111955, term112796));
        assertTrue(recursiveEquals(retValue, term112790));
    }

};


