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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114490;

    public JsonTreeReader_getPath_1170023302312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114490 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term114228 = (Object[]) newArray("java.lang.Object", 44);
        Object term114546 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term114602 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term114490, term114490.getClass(), "stackSize", 515);
        setElement(term114228, 0, term114546);
        setElement(term114228, 2, term114602);
        setField(term114490, term114490.getClass(), "stack", term114228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term114490, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


