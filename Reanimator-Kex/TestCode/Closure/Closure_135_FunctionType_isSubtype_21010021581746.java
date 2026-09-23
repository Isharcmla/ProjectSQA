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

public class FunctionType_isSubtype_21010021581746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2386192;
     Object term2386448;
     Object term2386798;
     Object term2386802;

    public FunctionType_isSubtype_21010021581746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2386805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2386804 = ((Class) term2386805).getDeclaredField((String) "INTERFACE");
        ((Field) term2386804).setAccessible(true);
        Object enum4460 = ((Field) term2386804).get((Object) null);
        term2386192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2386192, term2386192.getClass(), "kind", enum4460);
        term2386448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term2387099 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2387098 = ((Class) term2387099).getDeclaredField((String) "INTERFACE");
        ((Field) term2387098).setAccessible(true);
        Object enum4461 = ((Field) term2387098).get((Object) null);
        term2386798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2386798, term2386798.getClass(), "call", null);
        setField(term2386798, term2386798.getClass(), "prototype", null);
        setField(term2386798, term2386798.getClass(), "kind", enum4461);
        setField(term2386798, term2386798.getClass(), "typeOfThis", null);
        setField(term2386798, term2386798.getClass(), "source", null);
        setField(term2386798, term2386798.getClass(), "implementedInterfaces", null);
        setField(term2386798, term2386798.getClass(), "subTypes", null);
        setField(term2386798, term2386798.getClass(), "templateTypeName", null);
        setField(term2386798, term2386798.getClass(), "className", null);
        setField(term2386798, term2386798.getClass(), "properties", null);
        setField(term2386798, term2386798.getClass(), "implicitPrototype", null);
        setBooleanField(term2386798, term2386798.getClass(), "nativeType", false);
        setBooleanField(term2386798, term2386798.getClass(), "visited", false);
        setField(term2386798, term2386798.getClass(), "docInfo", null);
        setBooleanField(term2386798, term2386798.getClass(), "unknown", false);
        setBooleanField(term2386798, term2386798.getClass(), "resolved", false);
        setField(term2386798, term2386798.getClass(), "resolveResult", null);
        setField(term2386798, term2386798.getClass(), "registry", null);
        term2386802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2386802, term2386802.getClass(), "this$0", null);
        setField(term2386802, term2386802.getClass(), "call", null);
        setField(term2386802, term2386802.getClass(), "prototype", null);
        setField(term2386802, term2386802.getClass(), "kind", null);
        setField(term2386802, term2386802.getClass(), "typeOfThis", null);
        setField(term2386802, term2386802.getClass(), "source", null);
        setField(term2386802, term2386802.getClass(), "implementedInterfaces", null);
        setField(term2386802, term2386802.getClass(), "subTypes", null);
        setField(term2386802, term2386802.getClass(), "templateTypeName", null);
        setField(term2386802, term2386802.getClass(), "className", null);
        setField(term2386802, term2386802.getClass(), "properties", null);
        setField(term2386802, term2386802.getClass(), "implicitPrototype", null);
        setBooleanField(term2386802, term2386802.getClass(), "nativeType", false);
        setBooleanField(term2386802, term2386802.getClass(), "visited", false);
        setField(term2386802, term2386802.getClass(), "docInfo", null);
        setBooleanField(term2386802, term2386802.getClass(), "unknown", false);
        setBooleanField(term2386802, term2386802.getClass(), "resolved", false);
        setField(term2386802, term2386802.getClass(), "resolveResult", null);
        setField(term2386802, term2386802.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2386448;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2386192, args);
        assertTrue(recursiveEquals(term2386192, term2386798));
        assertTrue(recursiveEquals(term2386448, term2386802));
        assertTrue(recursiveEquals(retValue, false));
    }

};


