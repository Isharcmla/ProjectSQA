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

public class FunctionType_getLeastSupertype_418850886301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161549;
     Object term161805;
     Object term162261;
     Object term162265;
     Object term162175;

    public FunctionType_getLeastSupertype_418850886301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term162269 = ((Class) term162270).getDeclaredField((String) "INTERFACE");
        ((Field) term162269).setAccessible(true);
        Object enum293 = ((Field) term162269).get((Object) null);
        term161549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term161549, term161549.getClass(), "kind", enum293);
        term161805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term161805, term161805.getClass(), "kind", enum293);
        Class<? extends Object> term162564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term162563 = ((Class) term162564).getDeclaredField((String) "INTERFACE");
        ((Field) term162563).setAccessible(true);
        Object enum294 = ((Field) term162563).get((Object) null);
        term162261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term162261, term162261.getClass(), "call", null);
        setField(term162261, term162261.getClass(), "prototype", null);
        setField(term162261, term162261.getClass(), "kind", enum294);
        setField(term162261, term162261.getClass(), "typeOfThis", null);
        setField(term162261, term162261.getClass(), "source", null);
        setField(term162261, term162261.getClass(), "implementedInterfaces", null);
        setField(term162261, term162261.getClass(), "subTypes", null);
        setField(term162261, term162261.getClass(), "templateTypeName", null);
        setField(term162261, term162261.getClass(), "className", null);
        setField(term162261, term162261.getClass(), "properties", null);
        setField(term162261, term162261.getClass(), "implicitPrototype", null);
        setBooleanField(term162261, term162261.getClass(), "nativeType", false);
        setBooleanField(term162261, term162261.getClass(), "visited", false);
        setField(term162261, term162261.getClass(), "docInfo", null);
        setBooleanField(term162261, term162261.getClass(), "unknown", false);
        setBooleanField(term162261, term162261.getClass(), "resolved", false);
        setField(term162261, term162261.getClass(), "resolveResult", null);
        setField(term162261, term162261.getClass(), "registry", null);
        Class<? extends Object> term162858 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term162857 = ((Class) term162858).getDeclaredField((String) "INTERFACE");
        ((Field) term162857).setAccessible(true);
        Object enum295 = ((Field) term162857).get((Object) null);
        term162265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term162265, term162265.getClass(), "this$0", null);
        setField(term162265, term162265.getClass(), "call", null);
        setField(term162265, term162265.getClass(), "prototype", null);
        setField(term162265, term162265.getClass(), "kind", enum295);
        setField(term162265, term162265.getClass(), "typeOfThis", null);
        setField(term162265, term162265.getClass(), "source", null);
        setField(term162265, term162265.getClass(), "implementedInterfaces", null);
        setField(term162265, term162265.getClass(), "subTypes", null);
        setField(term162265, term162265.getClass(), "templateTypeName", null);
        setField(term162265, term162265.getClass(), "className", null);
        setField(term162265, term162265.getClass(), "properties", null);
        setField(term162265, term162265.getClass(), "implicitPrototype", null);
        setBooleanField(term162265, term162265.getClass(), "nativeType", false);
        setBooleanField(term162265, term162265.getClass(), "visited", false);
        setField(term162265, term162265.getClass(), "docInfo", null);
        setBooleanField(term162265, term162265.getClass(), "unknown", false);
        setBooleanField(term162265, term162265.getClass(), "resolved", false);
        setField(term162265, term162265.getClass(), "resolveResult", null);
        setField(term162265, term162265.getClass(), "registry", null);
        Class<? extends Object> term163152 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term163151 = ((Class) term163152).getDeclaredField((String) "INTERFACE");
        ((Field) term163151).setAccessible(true);
        Object enum296 = ((Field) term163151).get((Object) null);
        term162175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term162175, term162175.getClass(), "call", null);
        setField(term162175, term162175.getClass(), "prototype", null);
        setField(term162175, term162175.getClass(), "kind", enum296);
        setField(term162175, term162175.getClass(), "typeOfThis", null);
        setField(term162175, term162175.getClass(), "source", null);
        setField(term162175, term162175.getClass(), "implementedInterfaces", null);
        setField(term162175, term162175.getClass(), "subTypes", null);
        setField(term162175, term162175.getClass(), "templateTypeName", null);
        setField(term162175, term162175.getClass(), "className", null);
        setField(term162175, term162175.getClass(), "properties", null);
        setField(term162175, term162175.getClass(), "implicitPrototype", null);
        setBooleanField(term162175, term162175.getClass(), "nativeType", false);
        setBooleanField(term162175, term162175.getClass(), "visited", false);
        setField(term162175, term162175.getClass(), "docInfo", null);
        setBooleanField(term162175, term162175.getClass(), "unknown", false);
        setBooleanField(term162175, term162175.getClass(), "resolved", false);
        setField(term162175, term162175.getClass(), "resolveResult", null);
        setField(term162175, term162175.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term161805;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term161549, args);
        assertTrue(recursiveEquals(term161549, term162261));
        assertTrue(recursiveEquals(term161805, term162265));
        assertTrue(recursiveEquals(retValue, term162175));
    }

};


