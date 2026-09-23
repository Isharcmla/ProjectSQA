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

public class FunctionType_getLeastSupertype_418850886858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886609;
     Object term887271;

    public FunctionType_getLeastSupertype_418850886858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term890311 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term890310 = ((Class) term890311).getDeclaredField((String) "ORDINARY");
        ((Field) term890310).setAccessible(true);
        Object enum1656 = ((Field) term890310).get((Object) null);
        term886609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term887163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term886609, term886609.getClass(), "kind", enum1656);
        setField(term886609, term886609.getClass(), "typeOfThis", term887163);
        Class<? extends Object> term890602 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term890601 = ((Class) term890602).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term890601).setAccessible(true);
        Object enum1657 = ((Field) term890601).get((Object) null);
        term887271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term887453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term887271, term887271.getClass(), "kind", enum1657);
        setField(term887271, term887271.getClass(), "typeOfThis", term887453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term887271;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term886609, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


