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

public class FunctionType_isSubtype_21010021581734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2368101;
     Object term2368861;

    public FunctionType_isSubtype_21010021581734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2370086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2370085 = ((Class) term2370086).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2370085).setAccessible(true);
        Object enum4429 = ((Field) term2370085).get((Object) null);
        term2368101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2368653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2368753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2368101, term2368101.getClass(), "kind", enum4429);
        setField(term2368653, term2368653.getClass(), "kind", enum4429);
        setField(term2368653, term2368653.getClass(), "typeOfThis", term2368753);
        setField(term2368653, term2368653.getClass(), "call", null);
        setField(term2368101, term2368101.getClass(), "typeOfThis", term2368653);
        term2368861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2369191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2369279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term2369373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2368861, term2368861.getClass(), "kind", enum4429);
        setField(term2369191, term2369191.getClass(), "kind", enum4429);
        setField(term2369191, term2369191.getClass(), "typeOfThis", term2369279);
        setField(term2369191, term2369191.getClass(), "call", term2369373);
        setField(term2368861, term2368861.getClass(), "typeOfThis", term2369191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2368861;
        try {
            callMethod(klass, "isSubtype", argTypes, term2368101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


