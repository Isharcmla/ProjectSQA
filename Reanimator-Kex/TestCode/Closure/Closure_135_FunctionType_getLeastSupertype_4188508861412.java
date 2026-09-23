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

public class FunctionType_getLeastSupertype_4188508861412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1821643;
     Object term1822003;

    public FunctionType_getLeastSupertype_4188508861412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1824638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1824637 = ((Class) term1824638).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1824637).setAccessible(true);
        Object enum3397 = ((Field) term1824637).get((Object) null);
        term1821643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1821895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1821643, term1821643.getClass(), "kind", enum3397);
        setField(term1821643, term1821643.getClass(), "registry", term1821895);
        term1822003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1822003, term1822003.getClass(), "kind", enum3397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1822003;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1821643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


