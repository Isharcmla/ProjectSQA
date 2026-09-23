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

public class FunctionType_getGreatestSubtype_679591709417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332686;
     Object term333136;

    public FunctionType_getGreatestSubtype_679591709417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term334222 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term334221 = ((Class) term334222).getDeclaredField((String) "ORDINARY");
        ((Field) term334221).setAccessible(true);
        Object enum569 = ((Field) term334221).get((Object) null);
        term332686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term332922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term333026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term332686, term332686.getClass(), "kind", enum569);
        setField(term332686, term332686.getClass(), "typeOfThis", term332922);
        setField(term332686, term332686.getClass(), "registry", term333026);
        Class<? extends Object> term334513 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term334512 = ((Class) term334513).getDeclaredField((String) "INTERFACE");
        ((Field) term334512).setAccessible(true);
        Object enum570 = ((Field) term334512).get((Object) null);
        term333136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term333136, term333136.getClass(), "kind", enum570);
        setField(term333136, term333136.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term333136;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term332686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


