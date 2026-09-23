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

public class FunctionType_isSubtype_21010021581529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2023095;
     Object term2023755;

    public FunctionType_isSubtype_21010021581529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2025075 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2025074 = ((Class) term2025075).getDeclaredField((String) "ORDINARY");
        ((Field) term2025074).setAccessible(true);
        Object enum3771 = ((Field) term2025074).get((Object) null);
        Class<? extends Object> term2025366 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2025365 = ((Class) term2025366).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2025365).setAccessible(true);
        Object enum3772 = ((Field) term2025365).get((Object) null);
        term2023095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2023647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2023095, term2023095.getClass(), "kind", enum3771);
        setField(term2023647, term2023647.getClass(), "kind", enum3772);
        setField(term2023095, term2023095.getClass(), "typeOfThis", term2023647);
        term2023755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2024085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2023755, term2023755.getClass(), "kind", enum3771);
        setField(term2024085, term2024085.getClass(), "kind", enum3772);
        setField(term2023755, term2023755.getClass(), "typeOfThis", term2024085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2023755;
        try {
            callMethod(klass, "isSubtype", argTypes, term2023095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


