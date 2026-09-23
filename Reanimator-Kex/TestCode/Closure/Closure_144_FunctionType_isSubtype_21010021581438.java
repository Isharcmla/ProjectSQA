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

public class FunctionType_isSubtype_21010021581438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2055052;
     Object term2055704;

    public FunctionType_isSubtype_21010021581438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2059382 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2059381 = ((Class) term2059382).getDeclaredField((String) "INTERFACE");
        ((Field) term2059381).setAccessible(true);
        Object enum3660 = ((Field) term2059381).get((Object) null);
        Class<? extends Object> term2059676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2059675 = ((Class) term2059676).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2059675).setAccessible(true);
        Object enum3661 = ((Field) term2059675).get((Object) null);
        term2055052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2055596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2055052, term2055052.getClass(), "kind", enum3660);
        setField(term2055596, term2055596.getClass(), "kind", enum3661);
        setField(term2055052, term2055052.getClass(), "typeOfThis", term2055596);
        term2055704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2056034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2055704, term2055704.getClass(), "kind", enum3660);
        setField(term2056034, term2056034.getClass(), "kind", enum3660);
        setField(term2055704, term2055704.getClass(), "typeOfThis", term2056034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2055704;
        try {
            callMethod(klass, "isSubtype", argTypes, term2055052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


