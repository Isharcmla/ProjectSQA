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

public class FunctionType_isSubtype_21010021581766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2418534;
     Object term2418790;

    public FunctionType_isSubtype_21010021581766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2419526 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2419525 = ((Class) term2419526).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2419525).setAccessible(true);
        Object enum4517 = ((Field) term2419525).get((Object) null);
        term2418534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2418534, term2418534.getClass(), "kind", enum4517);
        term2418790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2418790, term2418790.getClass(), "kind", enum4517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2418790;
        try {
            callMethod(klass, "isSubtype", argTypes, term2418534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


