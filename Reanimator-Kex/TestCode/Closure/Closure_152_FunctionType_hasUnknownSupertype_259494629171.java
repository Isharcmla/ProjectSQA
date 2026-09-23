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

public class FunctionType_hasUnknownSupertype_259494629171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86930;

    public FunctionType_hasUnknownSupertype_259494629171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term87966 = ((Class) term87967).getDeclaredField((String) "INTERFACE");
        ((Field) term87966).setAccessible(true);
        Object enum189 = ((Field) term87966).get((Object) null);
        term86930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86930, term86930.getClass(), "kind", enum189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasUnknownSupertype", argTypes, term86930, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


