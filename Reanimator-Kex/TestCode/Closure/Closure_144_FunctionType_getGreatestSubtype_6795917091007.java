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

public class FunctionType_getGreatestSubtype_6795917091007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274564;
     Object term1275036;

    public FunctionType_getGreatestSubtype_6795917091007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1276797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1276796 = ((Class) term1276797).getDeclaredField((String) "ORDINARY");
        ((Field) term1276796).setAccessible(true);
        Object enum2290 = ((Field) term1276796).get((Object) null);
        term1274564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1274822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1274926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1274564, term1274564.getClass(), "kind", enum2290);
        setField(term1274822, term1274822.getClass(), "kind", enum2290);
        setField(term1274564, term1274564.getClass(), "typeOfThis", term1274822);
        setField(term1274564, term1274564.getClass(), "registry", term1274926);
        Class<? extends Object> term1277088 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1277087 = ((Class) term1277088).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1277087).setAccessible(true);
        Object enum2291 = ((Field) term1277087).get((Object) null);
        Class<? extends Object> term1277388 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1277387 = ((Class) term1277388).getDeclaredField((String) "INTERFACE");
        ((Field) term1277387).setAccessible(true);
        Object enum2292 = ((Field) term1277387).get((Object) null);
        term1275036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1275292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1275036, term1275036.getClass(), "kind", enum2291);
        setField(term1275292, term1275292.getClass(), "kind", enum2292);
        setField(term1275036, term1275036.getClass(), "typeOfThis", term1275292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1275036;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1274564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


