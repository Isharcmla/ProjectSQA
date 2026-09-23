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

public class FunctionType_isSubtype_2101002158925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004834;
     Object term1005494;

    public FunctionType_isSubtype_2101002158925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1006557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1006556 = ((Class) term1006557).getDeclaredField((String) "INTERFACE");
        ((Field) term1006556).setAccessible(true);
        Object enum1879 = ((Field) term1006556).get((Object) null);
        term1004834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1005386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1004834, term1004834.getClass(), "kind", enum1879);
        setField(term1004834, term1004834.getClass(), "typeOfThis", term1005386);
        Class<? extends Object> term1006851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1006850 = ((Class) term1006851).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1006850).setAccessible(true);
        Object enum1880 = ((Field) term1006850).get((Object) null);
        term1005494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1005494, term1005494.getClass(), "kind", enum1880);
        setField(term1005494, term1005494.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1005494;
        try {
            callMethod(klass, "isSubtype", argTypes, term1004834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


