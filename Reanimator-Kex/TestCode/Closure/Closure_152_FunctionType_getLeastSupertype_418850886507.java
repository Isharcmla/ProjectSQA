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

public class FunctionType_getLeastSupertype_418850886507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456967;
     Object term457329;

    public FunctionType_getLeastSupertype_418850886507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term458415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term458414 = ((Class) term458415).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term458414).setAccessible(true);
        Object enum748 = ((Field) term458414).get((Object) null);
        term456967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term457219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term456967, term456967.getClass(), "kind", enum748);
        setField(term456967, term456967.getClass(), "registry", term457219);
        Class<? extends Object> term458715 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term458714 = ((Class) term458715).getDeclaredField((String) "ORDINARY");
        ((Field) term458714).setAccessible(true);
        Object enum749 = ((Field) term458714).get((Object) null);
        term457329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term457329, term457329.getClass(), "kind", enum749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term457329;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term456967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


