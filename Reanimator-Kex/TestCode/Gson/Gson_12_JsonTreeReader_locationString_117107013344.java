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

public class JsonTreeReader_locationString_117107013344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135446;

    public JsonTreeReader_locationString_117107013344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135446 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term135125 = (Object[]) newArray("java.lang.Object", 14);
        Object term135504 = newInstance(Class.forName("com.google.gson.JsonObject"));
        byte[] term135127 = (byte[]) newByteArray(0);
        Object term135560 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term135678 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$EntryIterator"));
        Object term135750 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        Object term135806 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term135446, term135446.getClass(), "stackSize", 38);
        setElement(term135125, 0, term135504);
        setElement(term135125, 1, term135127);
        setElement(term135125, 2, term135560);
        setElement(term135125, 4, term135678);
        setElement(term135125, 5, term135750);
        setElement(term135125, 6, term135678);
        setElement(term135125, 7, term135806);
        setField(term135446, term135446.getClass(), "stack", term135125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term135446, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


