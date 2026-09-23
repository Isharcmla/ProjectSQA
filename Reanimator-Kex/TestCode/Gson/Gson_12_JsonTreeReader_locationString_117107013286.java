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

public class JsonTreeReader_locationString_117107013286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100122;

    public JsonTreeReader_locationString_117107013286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100122 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term99291 = (Object[]) newArray("java.lang.Object", 6);
        char[] term98500 = (char[]) newCharArray(265);
        Object term100178 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term100296 = newInstance(Class.forName("java.util.concurrent.ConcurrentLinkedDeque$DescendingItr"));
        Object term100352 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term100122, term100122.getClass(), "stackSize", 32772);
        setElement(term99291, 0, term98500);
        setElement(term99291, 1, term100178);
        setElement(term99291, 3, term100296);
        setElement(term99291, 5, term100352);
        setField(term100122, term100122.getClass(), "stack", term99291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term100122, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


