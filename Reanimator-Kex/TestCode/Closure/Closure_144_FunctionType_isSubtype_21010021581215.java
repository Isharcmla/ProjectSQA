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

public class FunctionType_isSubtype_21010021581215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1648736;
     Object term1649484;

    public FunctionType_isSubtype_21010021581215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1651123 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651122 = ((Class) term1651123).getDeclaredField((String) "INTERFACE");
        ((Field) term1651122).setAccessible(true);
        Object enum2948 = ((Field) term1651122).get((Object) null);
        Class<? extends Object> term1651417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651416 = ((Class) term1651417).getDeclaredField((String) "INTERFACE");
        ((Field) term1651416).setAccessible(true);
        Object enum2949 = ((Field) term1651416).get((Object) null);
        term1648736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1649288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1649376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1648736, term1648736.getClass(), "kind", enum2948);
        setField(term1649288, term1649288.getClass(), "kind", enum2949);
        setField(term1649288, term1649288.getClass(), "typeOfThis", term1649376);
        setField(term1648736, term1648736.getClass(), "typeOfThis", term1649288);
        Class<? extends Object> term1651711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1651710 = ((Class) term1651711).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1651710).setAccessible(true);
        Object enum2950 = ((Field) term1651710).get((Object) null);
        term1649484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1649814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1649484, term1649484.getClass(), "kind", enum2948);
        setField(term1649814, term1649814.getClass(), "kind", enum2950);
        setField(term1649814, term1649814.getClass(), "typeOfThis", null);
        setField(term1649484, term1649484.getClass(), "typeOfThis", term1649814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1649484;
        try {
            callMethod(klass, "isSubtype", argTypes, term1648736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


