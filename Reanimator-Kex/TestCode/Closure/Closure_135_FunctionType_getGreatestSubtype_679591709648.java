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

public class FunctionType_getGreatestSubtype_679591709648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566678;
     Object term567338;

    public FunctionType_getGreatestSubtype_679591709648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term569948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term569947 = ((Class) term569948).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term569947).setAccessible(true);
        Object enum1052 = ((Field) term569947).get((Object) null);
        term566678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term567230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term566678, term566678.getClass(), "kind", enum1052);
        setField(term566678, term566678.getClass(), "typeOfThis", term567230);
        Class<? extends Object> term570248 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term570247 = ((Class) term570248).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term570247).setAccessible(true);
        Object enum1053 = ((Field) term570247).get((Object) null);
        term567338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term567338, term567338.getClass(), "kind", enum1053);
        setField(term567338, term567338.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term567338;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term566678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


