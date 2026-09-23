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

public class FunctionType_isSubtype_21010021581621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177600;
     Object term2178262;

    public FunctionType_isSubtype_21010021581621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2179378 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2179377 = ((Class) term2179378).getDeclaredField((String) "ORDINARY");
        ((Field) term2179377).setAccessible(true);
        Object enum4061 = ((Field) term2179377).get((Object) null);
        term2177600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2178152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2177600, term2177600.getClass(), "kind", enum4061);
        setField(term2177600, term2177600.getClass(), "typeOfThis", term2178152);
        Class<? extends Object> term2179669 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2179668 = ((Class) term2179669).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2179668).setAccessible(true);
        Object enum4062 = ((Field) term2179668).get((Object) null);
        term2178262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2178444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2178262, term2178262.getClass(), "kind", enum4062);
        setField(term2178262, term2178262.getClass(), "typeOfThis", term2178444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2178262;
        try {
            callMethod(klass, "isSubtype", argTypes, term2177600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


