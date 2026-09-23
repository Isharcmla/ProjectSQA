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

public class FunctionType_getGreatestSubtype_6795917091520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2005618;
     Object term2006278;

    public FunctionType_getGreatestSubtype_6795917091520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2009055 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2009054 = ((Class) term2009055).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2009054).setAccessible(true);
        Object enum3739 = ((Field) term2009054).get((Object) null);
        term2005618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2006170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2005618, term2005618.getClass(), "kind", enum3739);
        setField(term2005618, term2005618.getClass(), "typeOfThis", term2006170);
        Class<? extends Object> term2009355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2009354 = ((Class) term2009355).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2009354).setAccessible(true);
        Object enum3740 = ((Field) term2009354).get((Object) null);
        term2006278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2006452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2006278, term2006278.getClass(), "kind", enum3740);
        setField(term2006278, term2006278.getClass(), "typeOfThis", term2006452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2006278;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2005618, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


