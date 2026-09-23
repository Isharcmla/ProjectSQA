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
import java.lang.NullPointerException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultDateTypeAdapter_read_80590444392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31636;
     Object term31708;

    public DefaultDateTypeAdapter_read_80590444392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31636 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term31708 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term31031 = (char[]) newCharArray(432);
        setIntField(term31708, term31708.getClass(), "peeked", 10);
        setIntField(term31708, term31708.getClass(), "pos", -2147483648);
        setIntField(term31708, term31708.getClass(), "limit", -2147483648);
        setCharElement(term31031, 0, 'B');
        setCharElement(term31031, 1, 'O');
        setCharElement(term31031, 2, 'O');
        setCharElement(term31031, 3, 'L');
        setCharElement(term31031, 4, 'E');
        setCharElement(term31031, 5, 'A');
        setCharElement(term31031, 6, 'N');
        setField(term31708, term31708.getClass(), "buffer", term31031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term31708;
        try {
            callMethod(klass, "read", argTypes, term31636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


