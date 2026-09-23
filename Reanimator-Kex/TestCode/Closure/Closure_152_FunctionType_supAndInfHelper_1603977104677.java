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

public class FunctionType_supAndInfHelper_1603977104677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696755;
     Object term697515;

    public FunctionType_supAndInfHelper_1603977104677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term698742 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term698741 = ((Class) term698742).getDeclaredField((String) "INTERFACE");
        ((Field) term698741).setAccessible(true);
        Object enum1061 = ((Field) term698741).get((Object) null);
        term696755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term697309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term697405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term696755, term696755.getClass(), "kind", enum1061);
        setField(term697309, term697309.getClass(), "kind", enum1061);
        setField(term697309, term697309.getClass(), "typeOfThis", term697405);
        setField(term696755, term696755.getClass(), "typeOfThis", term697309);
        Class<? extends Object> term699036 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term699035 = ((Class) term699036).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term699035).setAccessible(true);
        Object enum1062 = ((Field) term699035).get((Object) null);
        term697515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term697689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term697515, term697515.getClass(), "kind", enum1062);
        setField(term697689, term697689.getClass(), "kind", enum1062);
        setField(term697689, term697689.getClass(), "typeOfThis", null);
        setField(term697515, term697515.getClass(), "typeOfThis", term697689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term697515;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term696755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


