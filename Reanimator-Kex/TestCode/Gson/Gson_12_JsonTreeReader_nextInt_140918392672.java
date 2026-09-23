package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonTreeReader_nextInt_140918392672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14437;

    public JsonTreeReader_nextInt_140918392672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14437 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setIntField(term14437, term14437.getClass(), "stackSize", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term14437, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


