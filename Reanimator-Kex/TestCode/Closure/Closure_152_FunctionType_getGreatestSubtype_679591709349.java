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

public class FunctionType_getGreatestSubtype_679591709349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238624;
     Object term238986;

    public FunctionType_getGreatestSubtype_679591709349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term240059 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term240058 = ((Class) term240059).getDeclaredField((String) "INTERFACE");
        ((Field) term240058).setAccessible(true);
        Object enum417 = ((Field) term240058).get((Object) null);
        term238624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term238876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term238624, term238624.getClass(), "kind", enum417);
        setField(term238624, term238624.getClass(), "registry", term238876);
        Class<? extends Object> term240353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term240352 = ((Class) term240353).getDeclaredField((String) "ORDINARY");
        ((Field) term240352).setAccessible(true);
        Object enum418 = ((Field) term240352).get((Object) null);
        term238986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term238986, term238986.getClass(), "kind", enum418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term238986;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term238624, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


