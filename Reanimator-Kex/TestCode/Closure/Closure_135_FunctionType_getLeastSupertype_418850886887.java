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

public class FunctionType_getLeastSupertype_418850886887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940863;
     Object term941515;

    public FunctionType_getLeastSupertype_418850886887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term943693 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term943692 = ((Class) term943693).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term943692).setAccessible(true);
        Object enum1757 = ((Field) term943692).get((Object) null);
        term940863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term941407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term940863, term940863.getClass(), "kind", enum1757);
        setField(term940863, term940863.getClass(), "typeOfThis", term941407);
        term941515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term941515, term941515.getClass(), "kind", enum1757);
        setField(term941515, term941515.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term941515;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term940863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


