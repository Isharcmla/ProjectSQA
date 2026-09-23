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

public class FunctionType_isSubtype_2101002158413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267300;
     Object term267664;

    public FunctionType_isSubtype_2101002158413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term268470 = ((Class) term268471).getDeclaredField((String) "ORDINARY");
        ((Field) term268470).setAccessible(true);
        Object enum485 = ((Field) term268470).get((Object) null);
        term267300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term267556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term267300, term267300.getClass(), "kind", enum485);
        setField(term267300, term267300.getClass(), "typeOfThis", term267556);
        term267664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term267846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term267664, term267664.getClass(), "kind", enum485);
        setField(term267664, term267664.getClass(), "typeOfThis", term267846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term267664;
        try {
            callMethod(klass, "isSubtype", argTypes, term267300, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


