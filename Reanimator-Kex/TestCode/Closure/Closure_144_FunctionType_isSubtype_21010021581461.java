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

public class FunctionType_isSubtype_21010021581461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2100357;
     Object term2101009;

    public FunctionType_isSubtype_21010021581461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2105792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2105791 = ((Class) term2105792).getDeclaredField((String) "INTERFACE");
        ((Field) term2105791).setAccessible(true);
        Object enum3748 = ((Field) term2105791).get((Object) null);
        Class<? extends Object> term2106086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2106085 = ((Class) term2106086).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2106085).setAccessible(true);
        Object enum3749 = ((Field) term2106085).get((Object) null);
        term2100357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2100901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2100357, term2100357.getClass(), "kind", enum3748);
        setField(term2100901, term2100901.getClass(), "kind", enum3749);
        setField(term2100357, term2100357.getClass(), "typeOfThis", term2100901);
        Class<? extends Object> term2106386 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2106385 = ((Class) term2106386).getDeclaredField((String) "INTERFACE");
        ((Field) term2106385).setAccessible(true);
        Object enum3750 = ((Field) term2106385).get((Object) null);
        term2101009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2101341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2101009, term2101009.getClass(), "kind", enum3748);
        setField(term2101341, term2101341.getClass(), "kind", enum3750);
        setField(term2101009, term2101009.getClass(), "typeOfThis", term2101341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2101009;
        try {
            callMethod(klass, "isSubtype", argTypes, term2100357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


