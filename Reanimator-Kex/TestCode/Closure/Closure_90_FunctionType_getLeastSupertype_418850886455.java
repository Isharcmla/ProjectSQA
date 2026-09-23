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

public class FunctionType_getLeastSupertype_418850886455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375149;
     Object term375703;

    public FunctionType_getLeastSupertype_418850886455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term376567 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term376566 = ((Class) term376567).getDeclaredField((String) "ORDINARY");
        ((Field) term376566).setAccessible(true);
        Object enum640 = ((Field) term376566).get((Object) null);
        term375149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term375149, term375149.getClass(), "kind", enum640);
        term375703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term375703, term375703.getClass(), "kind", enum640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term375703;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term375149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


