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

public class FunctionType_getGreatestSubtype_679591709432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342964;
     Object term343326;

    public FunctionType_getGreatestSubtype_679591709432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term345813 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term345812 = ((Class) term345813).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term345812).setAccessible(true);
        Object enum626 = ((Field) term345812).get((Object) null);
        term342964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term343216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term342964, term342964.getClass(), "kind", enum626);
        setField(term342964, term342964.getClass(), "registry", term343216);
        Class<? extends Object> term346113 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term346112 = ((Class) term346113).getDeclaredField((String) "ORDINARY");
        ((Field) term346112).setAccessible(true);
        Object enum627 = ((Field) term346112).get((Object) null);
        term343326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term343326, term343326.getClass(), "kind", enum627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term343326;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term342964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


