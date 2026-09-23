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
import java.util.ArrayList;
import java.util.ListIterator;

public class JsonTreeReader_locationString_117107013208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53751;

    public JsonTreeReader_locationString_117107013208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53878 = new ArrayList();
        ListIterator<Object> term53877 = ((ArrayList) term53878).listIterator();
        term53751 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term53491 = (Object[]) newArray("java.lang.Object", 50);
        Object term53809 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term53751, term53751.getClass(), "stackSize", 1);
        setElement(term53491, 0, term53809);
        setElement(term53491, 1, term53877);
        setField(term53751, term53751.getClass(), "stack", term53491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term53751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


