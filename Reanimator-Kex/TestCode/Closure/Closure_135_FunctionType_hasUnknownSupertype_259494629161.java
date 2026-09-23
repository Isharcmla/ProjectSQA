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

public class FunctionType_hasUnknownSupertype_259494629161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75193;

    public FunctionType_hasUnknownSupertype_259494629161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76612 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term76611 = ((Class) term76612).getDeclaredField((String) "INTERFACE");
        ((Field) term76611).setAccessible(true);
        Object enum165 = ((Field) term76611).get((Object) null);
        term75193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term75193, term75193.getClass(), "kind", enum165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasUnknownSupertype", argTypes, term75193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


