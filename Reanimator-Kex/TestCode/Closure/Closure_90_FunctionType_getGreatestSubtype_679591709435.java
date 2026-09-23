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

public class FunctionType_getGreatestSubtype_679591709435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344480;
     Object term345152;

    public FunctionType_getGreatestSubtype_679591709435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term346021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term346020 = ((Class) term346021).getDeclaredField((String) "INTERFACE");
        ((Field) term346020).setAccessible(true);
        Object enum591 = ((Field) term346020).get((Object) null);
        term344480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term345042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term344480, term344480.getClass(), "kind", enum591);
        setField(term344480, term344480.getClass(), "typeOfThis", term345042);
        term345152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term345152, term345152.getClass(), "kind", enum591);
        setField(term345152, term345152.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term345152;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term344480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


