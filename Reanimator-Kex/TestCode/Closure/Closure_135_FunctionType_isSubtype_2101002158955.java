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

public class FunctionType_isSubtype_2101002158955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052806;
     Object term1053520;

    public FunctionType_isSubtype_2101002158955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1055129 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1055128 = ((Class) term1055129).getDeclaredField((String) "ORDINARY");
        ((Field) term1055128).setAccessible(true);
        Object enum1967 = ((Field) term1055128).get((Object) null);
        Class<? extends Object> term1055420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1055419 = ((Class) term1055420).getDeclaredField((String) "INTERFACE");
        ((Field) term1055419).setAccessible(true);
        Object enum1968 = ((Field) term1055419).get((Object) null);
        term1052806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        term1053520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1053796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1052806, term1052806.getClass(), "kind", enum1967);
        setField(term1053520, term1053520.getClass(), "kind", enum1967);
        setField(term1053796, term1053796.getClass(), "kind", enum1968);
        setField(term1053520, term1053520.getClass(), "typeOfThis", term1053796);
        setField(term1052806, term1052806.getClass(), "typeOfThis", term1053520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1053520;
        try {
            callMethod(klass, "isSubtype", argTypes, term1052806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


