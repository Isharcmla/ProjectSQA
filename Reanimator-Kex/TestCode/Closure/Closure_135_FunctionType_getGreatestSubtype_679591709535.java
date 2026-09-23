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

public class FunctionType_getGreatestSubtype_679591709535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404761;
     Object term405421;

    public FunctionType_getGreatestSubtype_679591709535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term406849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term406848 = ((Class) term406849).getDeclaredField((String) "ORDINARY");
        ((Field) term406848).setAccessible(true);
        Object enum749 = ((Field) term406848).get((Object) null);
        Class<? extends Object> term407140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term407139 = ((Class) term407140).getDeclaredField((String) "INTERFACE");
        ((Field) term407139).setAccessible(true);
        Object enum750 = ((Field) term407139).get((Object) null);
        term404761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term405313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term404761, term404761.getClass(), "kind", enum749);
        setField(term405313, term405313.getClass(), "kind", enum750);
        setField(term404761, term404761.getClass(), "typeOfThis", term405313);
        Class<? extends Object> term407434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term407433 = ((Class) term407434).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term407433).setAccessible(true);
        Object enum751 = ((Field) term407433).get((Object) null);
        term405421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term405603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term405421, term405421.getClass(), "kind", enum751);
        setField(term405421, term405421.getClass(), "typeOfThis", term405603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term405421;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term404761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


