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

public class FunctionType_getGreatestSubtype_6795917091465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112323;
     Object term2113095;

    public FunctionType_getGreatestSubtype_6795917091465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2114585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2114584 = ((Class) term2114585).getDeclaredField((String) "INTERFACE");
        ((Field) term2114584).setAccessible(true);
        Object enum3765 = ((Field) term2114584).get((Object) null);
        Class<? extends Object> term2114879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2114878 = ((Class) term2114879).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2114878).setAccessible(true);
        Object enum3766 = ((Field) term2114878).get((Object) null);
        term2112323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2112877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2113471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2112323, term2112323.getClass(), "kind", enum3765);
        setField(term2112877, term2112877.getClass(), "kind", enum3765);
        setField(term2113471, term2113471.getClass(), "kind", enum3766);
        setField(term2113471, term2113471.getClass(), "typeOfThis", null);
        setField(term2112877, term2112877.getClass(), "typeOfThis", term2113471);
        setField(term2112323, term2112323.getClass(), "typeOfThis", term2112877);
        term2113095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2113417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2113095, term2113095.getClass(), "kind", enum3765);
        setField(term2113417, term2113417.getClass(), "kind", enum3765);
        setField(term2113417, term2113417.getClass(), "typeOfThis", term2113471);
        setField(term2113095, term2113095.getClass(), "typeOfThis", term2113417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2113095;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2112323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


