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

public class FunctionType_isSubtype_21010021581576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2307612;
     Object term2308272;

    public FunctionType_isSubtype_21010021581576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2311445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2311444 = ((Class) term2311445).getDeclaredField((String) "INTERFACE");
        ((Field) term2311444).setAccessible(true);
        Object enum4122 = ((Field) term2311444).get((Object) null);
        term2307612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2308164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2307612, term2307612.getClass(), "kind", enum4122);
        setField(term2308164, term2308164.getClass(), "kind", enum4122);
        setField(term2307612, term2307612.getClass(), "typeOfThis", term2308164);
        Class<? extends Object> term2311739 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2311738 = ((Class) term2311739).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2311738).setAccessible(true);
        Object enum4123 = ((Field) term2311738).get((Object) null);
        Class<? extends Object> term2312039 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2312038 = ((Class) term2312039).getDeclaredField((String) "INTERFACE");
        ((Field) term2312038).setAccessible(true);
        Object enum4124 = ((Field) term2312038).get((Object) null);
        term2308272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2308454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2308272, term2308272.getClass(), "kind", enum4123);
        setField(term2308454, term2308454.getClass(), "kind", enum4124);
        setField(term2308272, term2308272.getClass(), "typeOfThis", term2308454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2308272;
        try {
            callMethod(klass, "isSubtype", argTypes, term2307612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


