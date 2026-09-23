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

public class FunctionType_isSubtype_2101002158976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085622;
     Object term1086282;

    public FunctionType_isSubtype_2101002158976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1089372 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1089371 = ((Class) term1089372).getDeclaredField((String) "INTERFACE");
        ((Field) term1089371).setAccessible(true);
        Object enum2025 = ((Field) term1089371).get((Object) null);
        Class<? extends Object> term1089666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1089665 = ((Class) term1089666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1089665).setAccessible(true);
        Object enum2026 = ((Field) term1089665).get((Object) null);
        term1085622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1086174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1085622, term1085622.getClass(), "kind", enum2025);
        setField(term1086174, term1086174.getClass(), "kind", enum2026);
        setField(term1085622, term1085622.getClass(), "typeOfThis", term1086174);
        term1086282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1086464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1086282, term1086282.getClass(), "kind", enum2026);
        setField(term1086464, term1086464.getClass(), "kind", enum2026);
        setField(term1086282, term1086282.getClass(), "typeOfThis", term1086464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1086282;
        try {
            callMethod(klass, "isSubtype", argTypes, term1085622, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


