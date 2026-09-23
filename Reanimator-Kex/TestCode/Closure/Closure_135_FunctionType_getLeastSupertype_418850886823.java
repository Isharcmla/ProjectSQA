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

public class FunctionType_getLeastSupertype_418850886823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832961;
     Object term833631;

    public FunctionType_getLeastSupertype_418850886823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term834474 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term834473 = ((Class) term834474).getDeclaredField((String) "ORDINARY");
        ((Field) term834473).setAccessible(true);
        Object enum1554 = ((Field) term834473).get((Object) null);
        term832961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term833523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term832961, term832961.getClass(), "kind", enum1554);
        setField(term832961, term832961.getClass(), "typeOfThis", term833523);
        term833631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term833631, term833631.getClass(), "kind", enum1554);
        setField(term833631, term833631.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term833631;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term832961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


