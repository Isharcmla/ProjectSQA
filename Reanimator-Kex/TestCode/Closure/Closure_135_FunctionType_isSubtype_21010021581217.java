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

public class FunctionType_isSubtype_21010021581217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493494;
     Object term1494154;

    public FunctionType_isSubtype_21010021581217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1495730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1495729 = ((Class) term1495730).getDeclaredField((String) "ORDINARY");
        ((Field) term1495729).setAccessible(true);
        Object enum2790 = ((Field) term1495729).get((Object) null);
        term1493494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1494046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1493494, term1493494.getClass(), "kind", enum2790);
        setField(term1494046, term1494046.getClass(), "kind", enum2790);
        setField(term1493494, term1493494.getClass(), "typeOfThis", term1494046);
        Class<? extends Object> term1496021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1496020 = ((Class) term1496021).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1496020).setAccessible(true);
        Object enum2791 = ((Field) term1496020).get((Object) null);
        Class<? extends Object> term1496321 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1496320 = ((Class) term1496321).getDeclaredField((String) "INTERFACE");
        ((Field) term1496320).setAccessible(true);
        Object enum2792 = ((Field) term1496320).get((Object) null);
        term1494154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1494336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1494154, term1494154.getClass(), "kind", enum2791);
        setField(term1494336, term1494336.getClass(), "kind", enum2792);
        setField(term1494154, term1494154.getClass(), "typeOfThis", term1494336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1494154;
        try {
            callMethod(klass, "isSubtype", argTypes, term1493494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


