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

public class FunctionType_getGreatestSubtype_679591709409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311002;
     Object term311260;

    public FunctionType_getGreatestSubtype_679591709409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term311859 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term311858 = ((Class) term311859).getDeclaredField((String) "INTERFACE");
        ((Field) term311858).setAccessible(true);
        Object enum568 = ((Field) term311858).get((Object) null);
        term311002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term311002, term311002.getClass(), "kind", enum568);
        term311260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term311260;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term311002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


