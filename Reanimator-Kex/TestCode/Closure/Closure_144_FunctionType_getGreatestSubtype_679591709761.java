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

public class FunctionType_getGreatestSubtype_679591709761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844398;
     Object term844656;

    public FunctionType_getGreatestSubtype_679591709761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term845738 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term845737 = ((Class) term845738).getDeclaredField((String) "INTERFACE");
        ((Field) term845737).setAccessible(true);
        Object enum1525 = ((Field) term845737).get((Object) null);
        term844398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term844398, term844398.getClass(), "kind", enum1525);
        Class<? extends Object> term846032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term846031 = ((Class) term846032).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term846031).setAccessible(true);
        Object enum1526 = ((Field) term846031).get((Object) null);
        term844656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term844656, term844656.getClass(), "kind", enum1526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term844656;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term844398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


