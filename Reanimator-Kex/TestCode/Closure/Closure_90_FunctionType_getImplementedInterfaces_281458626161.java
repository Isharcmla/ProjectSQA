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

public class FunctionType_getImplementedInterfaces_281458626161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82980;

    public FunctionType_getImplementedInterfaces_281458626161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84023 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term84022 = ((Class) term84023).getDeclaredField((String) "ORDINARY");
        ((Field) term84022).setAccessible(true);
        Object enum186 = ((Field) term84022).get((Object) null);
        term82980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term82980, term82980.getClass(), "kind", enum186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term82980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


