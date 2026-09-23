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

public class JsonTreeReader_locationString_117107013372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153435;

    public JsonTreeReader_locationString_117107013372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153435 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term153165 = (Object[]) newArray("java.lang.Object", 44);
        Object term153487 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        Object term153543 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term153621 = newInstance(Class.forName("java.lang.CharSequence$1CharIterator"));
        setIntField(term153435, term153435.getClass(), "stackSize", 2);
        setElement(term153165, 0, term153487);
        setElement(term153165, 1, term153543);
        setElement(term153165, 2, term153621);
        setField(term153435, term153435.getClass(), "stack", term153165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term153435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


