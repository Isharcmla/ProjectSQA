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

public class JsonTreeReader_getPath_1170023302280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95850;

    public JsonTreeReader_getPath_1170023302280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95850 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term95348 = (Object[]) newArray("java.lang.Object", 495);
        Object term95906 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term95112 = (char[]) newCharArray(233);
        Object term96018 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapEntryIterator"));
        setIntField(term95850, term95850.getClass(), "stackSize", 11);
        setElement(term95348, 0, term95906);
        setElement(term95348, 1, term95112);
        setElement(term95348, 3, term95906);
        setElement(term95348, 4, term96018);
        setField(term95850, term95850.getClass(), "stack", term95348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term95850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


