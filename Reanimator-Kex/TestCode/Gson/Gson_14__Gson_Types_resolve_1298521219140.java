package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;
import java.lang.Object;

public class _Gson_Types_resolve_1298521219140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24525;

    public _Gson_Types_resolve_1298521219140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24525 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term24381 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term24525, term24525.getClass(), "ownerType", term24381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term24525;
        try {
            callMethod(klass, "resolve", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


