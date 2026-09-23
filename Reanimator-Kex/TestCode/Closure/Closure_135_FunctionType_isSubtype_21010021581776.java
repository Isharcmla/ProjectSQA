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

public class FunctionType_isSubtype_21010021581776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2434227;
     Object term2434889;

    public FunctionType_isSubtype_21010021581776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2436365 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2436364 = ((Class) term2436365).getDeclaredField((String) "ORDINARY");
        ((Field) term2436364).setAccessible(true);
        Object enum4551 = ((Field) term2436364).get((Object) null);
        Class<? extends Object> term2436656 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2436655 = ((Class) term2436656).getDeclaredField((String) "INTERFACE");
        ((Field) term2436655).setAccessible(true);
        Object enum4552 = ((Field) term2436655).get((Object) null);
        term2434227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2434781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2434227, term2434227.getClass(), "kind", enum4551);
        setField(term2434781, term2434781.getClass(), "kind", enum4552);
        setField(term2434227, term2434227.getClass(), "typeOfThis", term2434781);
        Class<? extends Object> term2436950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2436949 = ((Class) term2436950).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2436949).setAccessible(true);
        Object enum4553 = ((Field) term2436949).get((Object) null);
        term2434889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2435071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2434889, term2434889.getClass(), "kind", enum4553);
        setField(term2434889, term2434889.getClass(), "typeOfThis", term2435071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2434889;
        try {
            callMethod(klass, "isSubtype", argTypes, term2434227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


