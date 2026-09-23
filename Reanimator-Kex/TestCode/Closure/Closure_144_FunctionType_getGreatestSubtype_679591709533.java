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

public class FunctionType_getGreatestSubtype_679591709533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477811;
     Object term478376;

    public FunctionType_getGreatestSubtype_679591709533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term479551 = ((Class) term479552).getDeclaredField((String) "ORDINARY");
        ((Field) term479551).setAccessible(true);
        Object enum872 = ((Field) term479551).get((Object) null);
        Class<? extends Object> term479843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term479842 = ((Class) term479843).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term479842).setAccessible(true);
        Object enum873 = ((Field) term479842).get((Object) null);
        term477811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term478376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term478321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term477811, term477811.getClass(), "kind", enum872);
        setField(term478376, term478376.getClass(), "kind", enum873);
        setField(term478376, term478376.getClass(), "typeOfThis", null);
        setField(term477811, term477811.getClass(), "typeOfThis", term478376);
        setField(term477811, term477811.getClass(), "registry", term478321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term478376;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term477811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


