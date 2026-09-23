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

public class JsonTreeReader_getPath_1170023302187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45364;

    public JsonTreeReader_getPath_1170023302187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45364 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term45119 = (Object[]) newArray("java.lang.Object", 236);
        Object term45420 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term45564 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapEntryIterator"));
        Object term45602 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term45364, term45364.getClass(), "stackSize", 1);
        setElement(term45119, 0, term45420);
        setElement(term45119, 1, term45564);
        setElement(term45119, 2, term45602);
        setField(term45364, term45364.getClass(), "stack", term45119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term45364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


