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

public class FunctionType_getGreatestSubtype_6795917091407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000150;
     Object term2000924;

    public FunctionType_getGreatestSubtype_6795917091407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2002287 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2002286 = ((Class) term2002287).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2002286).setAccessible(true);
        Object enum3553 = ((Field) term2002286).get((Object) null);
        Class<? extends Object> term2002587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2002586 = ((Class) term2002587).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2002586).setAccessible(true);
        Object enum3554 = ((Field) term2002586).get((Object) null);
        term2000150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2000704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2001301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2000150, term2000150.getClass(), "kind", enum3553);
        setField(term2000704, term2000704.getClass(), "kind", enum3553);
        setField(term2001301, term2001301.getClass(), "kind", enum3554);
        setField(term2001301, term2001301.getClass(), "typeOfThis", null);
        setField(term2000704, term2000704.getClass(), "typeOfThis", term2001301);
        setField(term2000150, term2000150.getClass(), "typeOfThis", term2000704);
        term2000924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2001246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2000924, term2000924.getClass(), "kind", enum3553);
        setField(term2001246, term2001246.getClass(), "kind", enum3553);
        setField(term2001246, term2001246.getClass(), "typeOfThis", term2001301);
        setField(term2000924, term2000924.getClass(), "typeOfThis", term2001246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2000924;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2000150, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


