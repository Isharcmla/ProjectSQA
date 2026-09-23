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

public class FunctionType_getLeastSupertype_418850886607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513840;
     Object term514096;

    public FunctionType_getLeastSupertype_418850886607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term515385 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term515384 = ((Class) term515385).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term515384).setAccessible(true);
        Object enum951 = ((Field) term515384).get((Object) null);
        term513840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term513840, term513840.getClass(), "kind", enum951);
        Class<? extends Object> term515685 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term515684 = ((Class) term515685).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term515684).setAccessible(true);
        Object enum952 = ((Field) term515684).get((Object) null);
        term514096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term514096, term514096.getClass(), "kind", enum952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term514096;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term513840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


