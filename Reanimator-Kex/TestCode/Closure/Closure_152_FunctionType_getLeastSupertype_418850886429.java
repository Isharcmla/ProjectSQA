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

public class FunctionType_getLeastSupertype_418850886429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346859;
     Object term347117;

    public FunctionType_getLeastSupertype_418850886429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term347831 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term347830 = ((Class) term347831).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term347830).setAccessible(true);
        Object enum592 = ((Field) term347830).get((Object) null);
        term346859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term346859, term346859.getClass(), "kind", enum592);
        term347117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term347117, term347117.getClass(), "kind", enum592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term347117;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term346859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


