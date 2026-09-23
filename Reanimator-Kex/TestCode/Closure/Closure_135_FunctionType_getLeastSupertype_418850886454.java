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

public class FunctionType_getLeastSupertype_418850886454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308439;
     Object term309095;

    public FunctionType_getLeastSupertype_418850886454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310904 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310903 = ((Class) term310904).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term310903).setAccessible(true);
        Object enum562 = ((Field) term310903).get((Object) null);
        term308439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term308987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term308439, term308439.getClass(), "kind", enum562);
        setField(term308439, term308439.getClass(), "registry", term308987);
        Class<? extends Object> term311204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term311203 = ((Class) term311204).getDeclaredField((String) "INTERFACE");
        ((Field) term311203).setAccessible(true);
        Object enum563 = ((Field) term311203).get((Object) null);
        term309095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term309095, term309095.getClass(), "kind", enum563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term309095;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term308439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


