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

public class FunctionType_isSubtype_2101002158591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488070;
     Object term488784;

    public FunctionType_isSubtype_2101002158591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term490091 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term490090 = ((Class) term490091).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term490090).setAccessible(true);
        Object enum905 = ((Field) term490090).get((Object) null);
        Class<? extends Object> term490391 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term490390 = ((Class) term490391).getDeclaredField((String) "INTERFACE");
        ((Field) term490390).setAccessible(true);
        Object enum906 = ((Field) term490390).get((Object) null);
        term488070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term488784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term489060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term488070, term488070.getClass(), "kind", enum905);
        setField(term488784, term488784.getClass(), "kind", enum905);
        setField(term489060, term489060.getClass(), "kind", enum906);
        setField(term488784, term488784.getClass(), "typeOfThis", term489060);
        setField(term488070, term488070.getClass(), "typeOfThis", term488784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term488784;
        try {
            callMethod(klass, "isSubtype", argTypes, term488070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


