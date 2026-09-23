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

public class FunctionType_getGreatestSubtype_6795917091785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2449386;
     Object term2449746;

    public FunctionType_getGreatestSubtype_6795917091785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2452646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2452645 = ((Class) term2452646).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2452645).setAccessible(true);
        Object enum4579 = ((Field) term2452645).get((Object) null);
        term2449386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2449638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term2449386, term2449386.getClass(), "kind", enum4579);
        setField(term2449386, term2449386.getClass(), "registry", term2449638);
        Class<? extends Object> term2452946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2452945 = ((Class) term2452946).getDeclaredField((String) "INTERFACE");
        ((Field) term2452945).setAccessible(true);
        Object enum4580 = ((Field) term2452945).get((Object) null);
        term2449746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2449746, term2449746.getClass(), "kind", enum4580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2449746;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2449386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


