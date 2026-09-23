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

public class FunctionType_isSubtype_2101002158279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167412;
     Object term167768;

    public FunctionType_isSubtype_2101002158279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169024 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169023 = ((Class) term169024).getDeclaredField((String) "ORDINARY");
        ((Field) term169023).setAccessible(true);
        Object enum327 = ((Field) term169023).get((Object) null);
        term167412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term167660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term167412, term167412.getClass(), "kind", enum327);
        setField(term167412, term167412.getClass(), "typeOfThis", term167660);
        Class<? extends Object> term169315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169314 = ((Class) term169315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term169314).setAccessible(true);
        Object enum328 = ((Field) term169314).get((Object) null);
        term167768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term167768, term167768.getClass(), "kind", enum328);
        setField(term167768, term167768.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term167768;
        try {
            callMethod(klass, "isSubtype", argTypes, term167412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


