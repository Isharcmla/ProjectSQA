package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultDateTypeAdapter_read_805904443101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35632;
     Object term35704;

    public DefaultDateTypeAdapter_read_805904443101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35632 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term35704 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term35439 = (char[]) newCharArray(17);
        setIntField(term35704, term35704.getClass(), "peeked", 10);
        setIntField(term35704, term35704.getClass(), "pos", -2147483648);
        setIntField(term35704, term35704.getClass(), "limit", -2147483647);
        setCharElement(term35439, 0, 'B');
        setCharElement(term35439, 1, 'E');
        setCharElement(term35439, 2, 'G');
        setCharElement(term35439, 3, 'I');
        setCharElement(term35439, 4, 'N');
        setCharElement(term35439, 5, (char) 95);
        setCharElement(term35439, 6, 'A');
        setCharElement(term35439, 7, 'R');
        setCharElement(term35439, 8, 'R');
        setCharElement(term35439, 9, 'A');
        setCharElement(term35439, 10, 'Y');
        setField(term35704, term35704.getClass(), "buffer", term35439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term35704;
        try {
            callMethod(klass, "read", argTypes, term35632, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


