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

public class FunctionType_getGreatestSubtype_679591709277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140257;
     Object term140513;

    public FunctionType_getGreatestSubtype_679591709277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141111 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term141110 = ((Class) term141111).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term141110).setAccessible(true);
        Object enum262 = ((Field) term141110).get((Object) null);
        term140257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term140257, term140257.getClass(), "kind", enum262);
        term140513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term140513;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term140257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


