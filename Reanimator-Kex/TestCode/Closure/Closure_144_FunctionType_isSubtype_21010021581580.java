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

public class FunctionType_isSubtype_21010021581580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314822;
     Object term2315476;

    public FunctionType_isSubtype_21010021581580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2318616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2318615 = ((Class) term2318616).getDeclaredField((String) "ORDINARY");
        ((Field) term2318615).setAccessible(true);
        Object enum4135 = ((Field) term2318615).get((Object) null);
        Class<? extends Object> term2318907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2318906 = ((Class) term2318907).getDeclaredField((String) "INTERFACE");
        ((Field) term2318906).setAccessible(true);
        Object enum4136 = ((Field) term2318906).get((Object) null);
        term2314822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2315366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2314822, term2314822.getClass(), "kind", enum4135);
        setField(term2315366, term2315366.getClass(), "kind", enum4136);
        setField(term2314822, term2314822.getClass(), "typeOfThis", term2315366);
        term2315476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2315808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2315476, term2315476.getClass(), "kind", enum4135);
        setField(term2315808, term2315808.getClass(), "kind", enum4136);
        setField(term2315476, term2315476.getClass(), "typeOfThis", term2315808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2315476;
        try {
            callMethod(klass, "isSubtype", argTypes, term2314822, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


