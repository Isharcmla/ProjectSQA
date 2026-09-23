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

public class FunctionType_isSubtype_2101002158681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615127;
     Object term615383;
     Object term616721;
     Object term616725;

    public FunctionType_isSubtype_2101002158681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term616728 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616727 = ((Class) term616728).getDeclaredField((String) "INTERFACE");
        ((Field) term616727).setAccessible(true);
        Object enum1144 = ((Field) term616727).get((Object) null);
        term615127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term615127, term615127.getClass(), "kind", enum1144);
        term615383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class<? extends Object> term617022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term617021 = ((Class) term617022).getDeclaredField((String) "INTERFACE");
        ((Field) term617021).setAccessible(true);
        Object enum1145 = ((Field) term617021).get((Object) null);
        term616721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term616721, term616721.getClass(), "this$0", null);
        setField(term616721, term616721.getClass(), "call", null);
        setField(term616721, term616721.getClass(), "prototype", null);
        setField(term616721, term616721.getClass(), "kind", enum1145);
        setField(term616721, term616721.getClass(), "typeOfThis", null);
        setField(term616721, term616721.getClass(), "source", null);
        setField(term616721, term616721.getClass(), "implementedInterfaces", null);
        setField(term616721, term616721.getClass(), "subTypes", null);
        setField(term616721, term616721.getClass(), "templateTypeName", null);
        setField(term616721, term616721.getClass(), "className", null);
        setField(term616721, term616721.getClass(), "properties", null);
        setField(term616721, term616721.getClass(), "implicitPrototype", null);
        setBooleanField(term616721, term616721.getClass(), "nativeType", false);
        setBooleanField(term616721, term616721.getClass(), "visited", false);
        setField(term616721, term616721.getClass(), "docInfo", null);
        setBooleanField(term616721, term616721.getClass(), "unknown", false);
        setBooleanField(term616721, term616721.getClass(), "resolved", false);
        setField(term616721, term616721.getClass(), "resolveResult", null);
        setField(term616721, term616721.getClass(), "registry", null);
        term616725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term616725, term616725.getClass(), "this$0", null);
        setField(term616725, term616725.getClass(), "call", null);
        setField(term616725, term616725.getClass(), "prototype", null);
        setField(term616725, term616725.getClass(), "kind", null);
        setField(term616725, term616725.getClass(), "typeOfThis", null);
        setField(term616725, term616725.getClass(), "source", null);
        setField(term616725, term616725.getClass(), "implementedInterfaces", null);
        setField(term616725, term616725.getClass(), "subTypes", null);
        setField(term616725, term616725.getClass(), "templateTypeName", null);
        setField(term616725, term616725.getClass(), "className", null);
        setField(term616725, term616725.getClass(), "properties", null);
        setField(term616725, term616725.getClass(), "implicitPrototype", null);
        setBooleanField(term616725, term616725.getClass(), "nativeType", false);
        setBooleanField(term616725, term616725.getClass(), "visited", false);
        setField(term616725, term616725.getClass(), "docInfo", null);
        setBooleanField(term616725, term616725.getClass(), "unknown", false);
        setBooleanField(term616725, term616725.getClass(), "resolved", false);
        setField(term616725, term616725.getClass(), "resolveResult", null);
        setField(term616725, term616725.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term615383;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term615127, args);
        assertTrue(recursiveEquals(term615127, term616721));
        assertTrue(recursiveEquals(term615383, term616725));
        assertTrue(recursiveEquals(retValue, false));
    }

};


