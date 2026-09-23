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

public class FunctionType_getGreatestSubtype_679591709449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300924;
     Object term301284;

    public FunctionType_getGreatestSubtype_679591709449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term302585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302584 = ((Class) term302585).getDeclaredField((String) "INTERFACE");
        ((Field) term302584).setAccessible(true);
        Object enum549 = ((Field) term302584).get((Object) null);
        term300924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term300924, term300924.getClass(), "kind", enum549);
        setField(term300924, term300924.getClass(), "registry", term301176);
        Class<? extends Object> term302879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302878 = ((Class) term302879).getDeclaredField((String) "ORDINARY");
        ((Field) term302878).setAccessible(true);
        Object enum550 = ((Field) term302878).get((Object) null);
        term301284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term301284, term301284.getClass(), "kind", enum550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term301284;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term300924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


