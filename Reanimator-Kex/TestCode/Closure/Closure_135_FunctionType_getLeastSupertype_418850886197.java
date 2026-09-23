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

public class FunctionType_getLeastSupertype_418850886197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90307;
     Object term90563;

    public FunctionType_getLeastSupertype_418850886197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term91160 = ((Class) term91161).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term91160).setAccessible(true);
        Object enum189 = ((Field) term91160).get((Object) null);
        term90307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term90307, term90307.getClass(), "kind", enum189);
        term90563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term90563;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term90307, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


