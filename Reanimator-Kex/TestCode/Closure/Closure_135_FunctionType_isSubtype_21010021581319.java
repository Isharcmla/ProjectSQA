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

public class FunctionType_isSubtype_21010021581319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1666249;
     Object term1666963;

    public FunctionType_isSubtype_21010021581319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1668276 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1668275 = ((Class) term1668276).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1668275).setAccessible(true);
        Object enum3110 = ((Field) term1668275).get((Object) null);
        Class<? extends Object> term1668576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1668575 = ((Class) term1668576).getDeclaredField((String) "INTERFACE");
        ((Field) term1668575).setAccessible(true);
        Object enum3111 = ((Field) term1668575).get((Object) null);
        term1666249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term1666963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1667239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1666249, term1666249.getClass(), "kind", enum3110);
        setField(term1666963, term1666963.getClass(), "kind", enum3110);
        setField(term1667239, term1667239.getClass(), "kind", enum3111);
        setField(term1666963, term1666963.getClass(), "typeOfThis", term1667239);
        setField(term1666249, term1666249.getClass(), "typeOfThis", term1666963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1666963;
        try {
            callMethod(klass, "isSubtype", argTypes, term1666249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


