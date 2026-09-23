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

public class FunctionType_isSubtype_2101002158993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1112035;
     Object term1112687;

    public FunctionType_isSubtype_2101002158993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1115233 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1115232 = ((Class) term1115233).getDeclaredField((String) "INTERFACE");
        ((Field) term1115232).setAccessible(true);
        Object enum2072 = ((Field) term1115232).get((Object) null);
        Class<? extends Object> term1115527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1115526 = ((Class) term1115527).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1115526).setAccessible(true);
        Object enum2073 = ((Field) term1115526).get((Object) null);
        term1112035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1112579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1112035, term1112035.getClass(), "kind", enum2072);
        setField(term1112579, term1112579.getClass(), "kind", enum2073);
        setField(term1112035, term1112035.getClass(), "typeOfThis", term1112579);
        term1112687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1113017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1112687, term1112687.getClass(), "kind", enum2072);
        setField(term1113017, term1113017.getClass(), "kind", enum2072);
        setField(term1112687, term1112687.getClass(), "typeOfThis", term1113017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1112687;
        try {
            callMethod(klass, "isSubtype", argTypes, term1112035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


