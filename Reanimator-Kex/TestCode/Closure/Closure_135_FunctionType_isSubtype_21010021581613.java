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

public class FunctionType_isSubtype_21010021581613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2160781;
     Object term2161441;

    public FunctionType_isSubtype_21010021581613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2165999 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2165998 = ((Class) term2165999).getDeclaredField((String) "INTERFACE");
        ((Field) term2165998).setAccessible(true);
        Object enum4036 = ((Field) term2165998).get((Object) null);
        term2160781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2161333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2160781, term2160781.getClass(), "kind", enum4036);
        setField(term2160781, term2160781.getClass(), "typeOfThis", term2161333);
        Class<? extends Object> term2166293 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2166292 = ((Class) term2166293).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2166292).setAccessible(true);
        Object enum4037 = ((Field) term2166292).get((Object) null);
        term2161441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2161615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2161441, term2161441.getClass(), "kind", enum4037);
        setField(term2161441, term2161441.getClass(), "typeOfThis", term2161615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2161441;
        try {
            callMethod(klass, "isSubtype", argTypes, term2160781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


