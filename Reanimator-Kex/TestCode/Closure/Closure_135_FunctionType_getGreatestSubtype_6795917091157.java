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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_6795917091157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1386220;
     Object term1386680;

    public FunctionType_getGreatestSubtype_6795917091157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1387884 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1387883 = ((Class) term1387884).getDeclaredField((String) "ORDINARY");
        ((Field) term1387883).setAccessible(true);
        Object enum2592 = ((Field) term1387883).get((Object) null);
        term1386220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1386468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1386572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1386220, term1386220.getClass(), "kind", enum2592);
        setField(term1386220, term1386220.getClass(), "typeOfThis", term1386468);
        setField(term1386220, term1386220.getClass(), "registry", term1386572);
        Class<? extends Object> term1388175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1388174 = ((Class) term1388175).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1388174).setAccessible(true);
        Object enum2593 = ((Field) term1388174).get((Object) null);
        term1386680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1386928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1386680, term1386680.getClass(), "kind", enum2593);
        setField(term1386680, term1386680.getClass(), "typeOfThis", term1386928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1386680;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1386220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


