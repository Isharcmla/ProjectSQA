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

public class JsonTreeReader_locationString_117107013440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186707;

    public JsonTreeReader_locationString_117107013440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186707 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term186301 = (Object[]) newArray("java.lang.Object", 15);
        Object term186817 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term186873 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term186969 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term186306 = (char[]) newCharArray(0);
        Object term187079 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        Object term187147 = newInstance(Class.forName("java.util.EnumMap$EntryIterator"));
        setIntField(term186707, term186707.getClass(), "stackSize", 47);
        setElement(term186301, 0, term186817);
        setElement(term186301, 1, term186873);
        setElement(term186301, 3, "");
        setElement(term186301, 4, term186969);
        setElement(term186301, 6, term186306);
        setElement(term186301, 7, term187079);
        setElement(term186301, 11, term187147);
        setField(term186707, term186707.getClass(), "stack", term186301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term186707, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


