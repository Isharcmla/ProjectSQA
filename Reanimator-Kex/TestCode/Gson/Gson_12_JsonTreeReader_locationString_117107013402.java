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

public class JsonTreeReader_locationString_117107013402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168615;

    public JsonTreeReader_locationString_117107013402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168615 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term168341 = (Object[]) newArray("java.lang.Object", 491);
        Object term168673 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term168729 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term168847 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        setIntField(term168615, term168615.getClass(), "stackSize", 3);
        setElement(term168341, 0, term168673);
        setElement(term168341, 2, term168729);
        setElement(term168341, 3, term168847);
        setField(term168615, term168615.getClass(), "stack", term168341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term168615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


