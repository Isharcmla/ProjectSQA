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

public class FunctionType_isSubtype_21010021581160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389433;
     Object term1389897;

    public FunctionType_isSubtype_21010021581160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1392456 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1392455 = ((Class) term1392456).getDeclaredField((String) "ORDINARY");
        ((Field) term1392455).setAccessible(true);
        Object enum2599 = ((Field) term1392455).get((Object) null);
        term1389433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1389681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1389789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1389433, term1389433.getClass(), "kind", enum2599);
        setField(term1389681, term1389681.getClass(), "kind", enum2599);
        setField(term1389681, term1389681.getClass(), "typeOfThis", term1389789);
        setField(term1389433, term1389433.getClass(), "typeOfThis", term1389681);
        Class<? extends Object> term1392747 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1392746 = ((Class) term1392747).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1392746).setAccessible(true);
        Object enum2600 = ((Field) term1392746).get((Object) null);
        term1389897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1390153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1390335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1389897, term1389897.getClass(), "kind", enum2600);
        setField(term1390153, term1390153.getClass(), "kind", enum2599);
        setField(term1390153, term1390153.getClass(), "typeOfThis", term1390335);
        setField(term1389897, term1389897.getClass(), "typeOfThis", term1390153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1389897;
        try {
            callMethod(klass, "isSubtype", argTypes, term1389433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


