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

public class FunctionType_getLeastSupertype_418850886257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128272;
     Object term128528;

    public FunctionType_getLeastSupertype_418850886257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term129218 = ((Class) term129219).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term129218).setAccessible(true);
        Object enum246 = ((Field) term129218).get((Object) null);
        term128272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term128272, term128272.getClass(), "kind", enum246);
        term128528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term128528, term128528.getClass(), "kind", enum246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term128528;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term128272, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


