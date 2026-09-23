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

public class FunctionType_getLeastSupertype_418850886391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241130;
     Object term241682;

    public FunctionType_getLeastSupertype_418850886391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243554 = ((Class) term243555).getDeclaredField((String) "ORDINARY");
        ((Field) term243554).setAccessible(true);
        Object enum438 = ((Field) term243554).get((Object) null);
        term241130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term241130, term241130.getClass(), "kind", enum438);
        Class<? extends Object> term243846 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term243845 = ((Class) term243846).getDeclaredField((String) "INTERFACE");
        ((Field) term243845).setAccessible(true);
        Object enum439 = ((Field) term243845).get((Object) null);
        term241682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term241682, term241682.getClass(), "kind", enum439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term241682;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term241130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


