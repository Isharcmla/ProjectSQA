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

public class FunctionType_isSubtype_2101002158372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226891;
     Object term227147;

    public FunctionType_isSubtype_2101002158372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228360 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term228359 = ((Class) term228360).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term228359).setAccessible(true);
        Object enum412 = ((Field) term228359).get((Object) null);
        term226891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term226891, term226891.getClass(), "kind", enum412);
        term227147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term227147, term227147.getClass(), "kind", enum412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term227147;
        try {
            callMethod(klass, "isSubtype", argTypes, term226891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


