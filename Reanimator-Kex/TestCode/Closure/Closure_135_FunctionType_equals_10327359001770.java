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

public class FunctionType_equals_10327359001770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2424667;
     Object term2425317;
     Object term2426067;
     Object term2426072;

    public FunctionType_equals_10327359001770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2426078 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2426077 = ((Class) term2426078).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2426077).setAccessible(true);
        Object enum4531 = ((Field) term2426077).get((Object) null);
        term2424667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2425217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term2424667, term2424667.getClass(), "kind", enum4531);
        setField(term2424667, term2424667.getClass(), "typeOfThis", term2425217);
        Class<? extends Object> term2426378 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2426377 = ((Class) term2426378).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2426377).setAccessible(true);
        Object enum4532 = ((Field) term2426377).get((Object) null);
        term2425317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2425317, term2425317.getClass(), "kind", enum4532);
        setField(term2425317, term2425317.getClass(), "typeOfThis", null);
        Class<? extends Object> term2426678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2426677 = ((Class) term2426678).getDeclaredField((String) "INTERFACE");
        ((Field) term2426677).setAccessible(true);
        Object enum4533 = ((Field) term2426677).get((Object) null);
        term2426067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2426071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term2426067, term2426067.getClass(), "call", null);
        setField(term2426067, term2426067.getClass(), "prototype", null);
        setField(term2426067, term2426067.getClass(), "kind", enum4533);
        setField(term2426071, term2426071.getClass(), "referencedType", null);
        setBooleanField(term2426071, term2426071.getClass(), "visited", false);
        setField(term2426071, term2426071.getClass(), "docInfo", null);
        setBooleanField(term2426071, term2426071.getClass(), "unknown", false);
        setBooleanField(term2426071, term2426071.getClass(), "resolved", false);
        setField(term2426071, term2426071.getClass(), "resolveResult", null);
        setField(term2426071, term2426071.getClass(), "registry", null);
        setField(term2426067, term2426067.getClass(), "typeOfThis", term2426071);
        setField(term2426067, term2426067.getClass(), "source", null);
        setField(term2426067, term2426067.getClass(), "implementedInterfaces", null);
        setField(term2426067, term2426067.getClass(), "subTypes", null);
        setField(term2426067, term2426067.getClass(), "templateTypeName", null);
        setField(term2426067, term2426067.getClass(), "className", null);
        setField(term2426067, term2426067.getClass(), "properties", null);
        setField(term2426067, term2426067.getClass(), "implicitPrototype", null);
        setBooleanField(term2426067, term2426067.getClass(), "nativeType", false);
        setBooleanField(term2426067, term2426067.getClass(), "visited", false);
        setField(term2426067, term2426067.getClass(), "docInfo", null);
        setBooleanField(term2426067, term2426067.getClass(), "unknown", false);
        setBooleanField(term2426067, term2426067.getClass(), "resolved", false);
        setField(term2426067, term2426067.getClass(), "resolveResult", null);
        setField(term2426067, term2426067.getClass(), "registry", null);
        Class<? extends Object> term2426972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2426971 = ((Class) term2426972).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2426971).setAccessible(true);
        Object enum4534 = ((Field) term2426971).get((Object) null);
        term2426072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2426072, term2426072.getClass(), "call", null);
        setField(term2426072, term2426072.getClass(), "prototype", null);
        setField(term2426072, term2426072.getClass(), "kind", enum4534);
        setField(term2426072, term2426072.getClass(), "typeOfThis", null);
        setField(term2426072, term2426072.getClass(), "source", null);
        setField(term2426072, term2426072.getClass(), "implementedInterfaces", null);
        setField(term2426072, term2426072.getClass(), "subTypes", null);
        setField(term2426072, term2426072.getClass(), "templateTypeName", null);
        setField(term2426072, term2426072.getClass(), "className", null);
        setField(term2426072, term2426072.getClass(), "properties", null);
        setField(term2426072, term2426072.getClass(), "implicitPrototype", null);
        setBooleanField(term2426072, term2426072.getClass(), "nativeType", false);
        setBooleanField(term2426072, term2426072.getClass(), "visited", false);
        setField(term2426072, term2426072.getClass(), "docInfo", null);
        setBooleanField(term2426072, term2426072.getClass(), "unknown", false);
        setBooleanField(term2426072, term2426072.getClass(), "resolved", false);
        setField(term2426072, term2426072.getClass(), "resolveResult", null);
        setField(term2426072, term2426072.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2425317;
        Object retValue = callMethod(klass, "equals", argTypes, term2424667, args);
        assertTrue(recursiveEquals(term2424667, term2426067));
        assertTrue(recursiveEquals(term2425317, term2426072));
        assertTrue(recursiveEquals(retValue, false));
    }

};


