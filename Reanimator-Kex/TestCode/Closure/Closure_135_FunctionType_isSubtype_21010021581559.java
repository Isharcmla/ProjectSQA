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

public class FunctionType_isSubtype_21010021581559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2072936;
     Object term2073588;

    public FunctionType_isSubtype_21010021581559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2074573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2074572 = ((Class) term2074573).getDeclaredField((String) "INTERFACE");
        ((Field) term2074572).setAccessible(true);
        Object enum3862 = ((Field) term2074572).get((Object) null);
        term2072936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2073480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2072936, term2072936.getClass(), "kind", enum3862);
        setField(term2073480, term2073480.getClass(), "kind", enum3862);
        setField(term2072936, term2072936.getClass(), "typeOfThis", term2073480);
        term2073588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2073918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2073588, term2073588.getClass(), "kind", enum3862);
        setField(term2073918, term2073918.getClass(), "kind", enum3862);
        setField(term2073588, term2073588.getClass(), "typeOfThis", term2073918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2073588;
        try {
            callMethod(klass, "isSubtype", argTypes, term2072936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


