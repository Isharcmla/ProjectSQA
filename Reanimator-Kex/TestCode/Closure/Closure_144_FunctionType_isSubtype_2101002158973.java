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

public class FunctionType_isSubtype_2101002158973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211289;
     Object term1211941;

    public FunctionType_isSubtype_2101002158973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1213204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1213203 = ((Class) term1213204).getDeclaredField((String) "ORDINARY");
        ((Field) term1213203).setAccessible(true);
        Object enum2176 = ((Field) term1213203).get((Object) null);
        Class<? extends Object> term1213495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1213494 = ((Class) term1213495).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1213494).setAccessible(true);
        Object enum2177 = ((Field) term1213494).get((Object) null);
        term1211289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1211833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1211289, term1211289.getClass(), "kind", enum2176);
        setField(term1211833, term1211833.getClass(), "kind", enum2177);
        setField(term1211289, term1211289.getClass(), "typeOfThis", term1211833);
        term1211941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1212271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1211941, term1211941.getClass(), "kind", enum2176);
        setField(term1212271, term1212271.getClass(), "kind", enum2176);
        setField(term1211941, term1211941.getClass(), "typeOfThis", term1212271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1211941;
        try {
            callMethod(klass, "isSubtype", argTypes, term1211289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


