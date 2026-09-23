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

public class FunctionType_getGreatestSubtype_679591709641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643323;
     Object term643888;

    public FunctionType_getGreatestSubtype_679591709641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term644952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term644951 = ((Class) term644952).getDeclaredField((String) "ORDINARY");
        ((Field) term644951).setAccessible(true);
        Object enum988 = ((Field) term644951).get((Object) null);
        Class<? extends Object> term645243 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term645242 = ((Class) term645243).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term645242).setAccessible(true);
        Object enum989 = ((Field) term645242).get((Object) null);
        term643323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term643888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term643833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term643323, term643323.getClass(), "kind", enum988);
        setField(term643888, term643888.getClass(), "kind", enum989);
        setField(term643888, term643888.getClass(), "typeOfThis", null);
        setField(term643323, term643323.getClass(), "typeOfThis", term643888);
        setField(term643323, term643323.getClass(), "registry", term643833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term643888;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term643323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


