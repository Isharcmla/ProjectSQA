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

public class FunctionType_getLeastSupertype_4188508861553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2271830;
     Object term2272088;

    public FunctionType_getLeastSupertype_4188508861553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2272808 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2272807 = ((Class) term2272808).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2272807).setAccessible(true);
        Object enum4055 = ((Field) term2272807).get((Object) null);
        term2271830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2271830, term2271830.getClass(), "kind", enum4055);
        term2272088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2272088, term2272088.getClass(), "kind", enum4055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2272088;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term2271830, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


