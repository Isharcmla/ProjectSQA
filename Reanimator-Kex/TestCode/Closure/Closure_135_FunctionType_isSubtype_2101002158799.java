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

public class FunctionType_isSubtype_2101002158799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795775;
     Object term796131;

    public FunctionType_isSubtype_2101002158799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term798823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term798822 = ((Class) term798823).getDeclaredField((String) "ORDINARY");
        ((Field) term798822).setAccessible(true);
        Object enum1490 = ((Field) term798822).get((Object) null);
        term795775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term796023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term795775, term795775.getClass(), "kind", enum1490);
        setField(term795775, term795775.getClass(), "typeOfThis", term796023);
        Class<? extends Object> term799114 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term799113 = ((Class) term799114).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term799113).setAccessible(true);
        Object enum1491 = ((Field) term799113).get((Object) null);
        term796131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term796131, term796131.getClass(), "kind", enum1491);
        setField(term796131, term796131.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term796131;
        try {
            callMethod(klass, "isSubtype", argTypes, term795775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


