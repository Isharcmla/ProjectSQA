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

public class FunctionType_isSubtype_21010021581606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150027;
     Object term2150687;

    public FunctionType_isSubtype_21010021581606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2154069 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2154068 = ((Class) term2154069).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2154068).setAccessible(true);
        Object enum4013 = ((Field) term2154068).get((Object) null);
        Class<? extends Object> term2154369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2154368 = ((Class) term2154369).getDeclaredField((String) "INTERFACE");
        ((Field) term2154368).setAccessible(true);
        Object enum4014 = ((Field) term2154368).get((Object) null);
        term2150027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2150579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2150027, term2150027.getClass(), "kind", enum4013);
        setField(term2150579, term2150579.getClass(), "kind", enum4014);
        setField(term2150027, term2150027.getClass(), "typeOfThis", term2150579);
        term2150687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2151019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2150687, term2150687.getClass(), "kind", enum4013);
        setField(term2150687, term2150687.getClass(), "typeOfThis", term2151019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2150687;
        try {
            callMethod(klass, "isSubtype", argTypes, term2150027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


