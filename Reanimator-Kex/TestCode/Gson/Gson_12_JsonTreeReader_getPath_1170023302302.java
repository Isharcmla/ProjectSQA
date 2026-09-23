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
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109338;

    public JsonTreeReader_getPath_1170023302302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109338 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term109068 = (Object[]) newArray("java.lang.Object", 491);
        Object term109396 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term109472 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        Object term109510 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109338, term109338.getClass(), "stackSize", 6);
        setElement(term109068, 0, term109396);
        setElement(term109068, 2, term109396);
        setElement(term109068, 3, term109472);
        setElement(term109068, 256, term109510);
        setField(term109338, term109338.getClass(), "stack", term109068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term109338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


