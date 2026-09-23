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

public class JsonTreeReader_getPath_1170023302296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105817;

    public JsonTreeReader_getPath_1170023302296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105817 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term105556 = (Object[]) newArray("java.lang.Object", 491);
        Object term105873 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term105929 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term106047 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        Object term106085 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term105817, term105817.getClass(), "stackSize", 3);
        setElement(term105556, 0, term105873);
        setElement(term105556, 2, term105929);
        setElement(term105556, 3, term106047);
        setElement(term105556, 8, term106085);
        setField(term105817, term105817.getClass(), "stack", term105556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term105817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


