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

public class FunctionType_isSubtype_2101002158305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165044;
     Object term165596;
     Object term166345;
     Object term166349;

    public FunctionType_isSubtype_2101002158305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term166355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term166354 = ((Class) term166355).getDeclaredField((String) "ORDINARY");
        ((Field) term166354).setAccessible(true);
        Object enum302 = ((Field) term166354).get((Object) null);
        term165044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term165044, term165044.getClass(), "kind", enum302);
        Class<? extends Object> term166646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term166645 = ((Class) term166646).getDeclaredField((String) "INTERFACE");
        ((Field) term166645).setAccessible(true);
        Object enum303 = ((Field) term166645).get((Object) null);
        term165596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term165596, term165596.getClass(), "kind", enum303);
        Class<? extends Object> term166940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term166939 = ((Class) term166940).getDeclaredField((String) "INTERFACE");
        ((Field) term166939).setAccessible(true);
        Object enum304 = ((Field) term166939).get((Object) null);
        term166345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term166345, term166345.getClass(), "call", null);
        setField(term166345, term166345.getClass(), "prototype", null);
        setField(term166345, term166345.getClass(), "kind", enum304);
        setField(term166345, term166345.getClass(), "typeOfThis", null);
        setField(term166345, term166345.getClass(), "source", null);
        setField(term166345, term166345.getClass(), "implementedInterfaces", null);
        setField(term166345, term166345.getClass(), "subTypes", null);
        setField(term166345, term166345.getClass(), "templateTypeName", null);
        setField(term166345, term166345.getClass(), "className", null);
        setField(term166345, term166345.getClass(), "properties", null);
        setField(term166345, term166345.getClass(), "implicitPrototype", null);
        setBooleanField(term166345, term166345.getClass(), "nativeType", false);
        setBooleanField(term166345, term166345.getClass(), "visited", false);
        setField(term166345, term166345.getClass(), "docInfo", null);
        setBooleanField(term166345, term166345.getClass(), "unknown", false);
        setBooleanField(term166345, term166345.getClass(), "resolved", false);
        setField(term166345, term166345.getClass(), "resolveResult", null);
        setField(term166345, term166345.getClass(), "registry", null);
        Class<? extends Object> term167234 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term167233 = ((Class) term167234).getDeclaredField((String) "INTERFACE");
        ((Field) term167233).setAccessible(true);
        Object enum305 = ((Field) term167233).get((Object) null);
        term166349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term166349, term166349.getClass(), "this$0", null);
        setField(term166349, term166349.getClass(), "call", null);
        setField(term166349, term166349.getClass(), "prototype", null);
        setField(term166349, term166349.getClass(), "kind", enum305);
        setField(term166349, term166349.getClass(), "typeOfThis", null);
        setField(term166349, term166349.getClass(), "source", null);
        setField(term166349, term166349.getClass(), "implementedInterfaces", null);
        setField(term166349, term166349.getClass(), "subTypes", null);
        setField(term166349, term166349.getClass(), "templateTypeName", null);
        setField(term166349, term166349.getClass(), "className", null);
        setField(term166349, term166349.getClass(), "properties", null);
        setField(term166349, term166349.getClass(), "implicitPrototype", null);
        setBooleanField(term166349, term166349.getClass(), "nativeType", false);
        setBooleanField(term166349, term166349.getClass(), "visited", false);
        setField(term166349, term166349.getClass(), "docInfo", null);
        setBooleanField(term166349, term166349.getClass(), "unknown", false);
        setBooleanField(term166349, term166349.getClass(), "resolved", false);
        setField(term166349, term166349.getClass(), "resolveResult", null);
        setField(term166349, term166349.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term165596;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term165044, args);
        assertTrue(recursiveEquals(term165044, term166345));
        assertTrue(recursiveEquals(term165596, term166349));
        assertTrue(recursiveEquals(retValue, true));
    }

};


