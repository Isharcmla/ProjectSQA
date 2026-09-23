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

public class FunctionType_isSubtype_2101002158743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811653;
     Object term812305;

    public FunctionType_isSubtype_2101002158743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term813136 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term813135 = ((Class) term813136).getDeclaredField((String) "INTERFACE");
        ((Field) term813135).setAccessible(true);
        Object enum1463 = ((Field) term813135).get((Object) null);
        term811653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term812197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term811653, term811653.getClass(), "kind", enum1463);
        setField(term811653, term811653.getClass(), "typeOfThis", term812197);
        term812305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term812305, term812305.getClass(), "kind", enum1463);
        setField(term812305, term812305.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term812305;
        try {
            callMethod(klass, "isSubtype", argTypes, term811653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


