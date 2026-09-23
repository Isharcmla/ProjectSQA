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

public class FunctionType_isSubtype_21010021581737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371193;
     Object term2371847;

    public FunctionType_isSubtype_21010021581737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2374716 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2374715 = ((Class) term2374716).getDeclaredField((String) "INTERFACE");
        ((Field) term2374715).setAccessible(true);
        Object enum4436 = ((Field) term2374715).get((Object) null);
        term2371193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2371737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2371193, term2371193.getClass(), "kind", enum4436);
        setField(term2371193, term2371193.getClass(), "typeOfThis", term2371737);
        Class<? extends Object> term2375010 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2375009 = ((Class) term2375010).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2375009).setAccessible(true);
        Object enum4437 = ((Field) term2375009).get((Object) null);
        term2371847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2371847, term2371847.getClass(), "kind", enum4437);
        setField(term2371847, term2371847.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2371847;
        try {
            callMethod(klass, "isSubtype", argTypes, term2371193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


