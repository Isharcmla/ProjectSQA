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

public class DefaultDateTypeAdapter_read_805904443142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68235;
     Object term68307;

    public DefaultDateTypeAdapter_read_805904443142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68235 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term68307 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term67825 = (char[]) newCharArray(233);
        setIntField(term68307, term68307.getClass(), "peeked", 8);
        setCharElement(term67825, 0, 'N');
        setCharElement(term67825, 1, 'U');
        setCharElement(term67825, 2, 'M');
        setCharElement(term67825, 3, 'B');
        setCharElement(term67825, 4, 'E');
        setCharElement(term67825, 5, 'R');
        setField(term68307, term68307.getClass(), "buffer", term67825);
        setIntField(term68307, term68307.getClass(), "pos", 536870912);
        setIntField(term68307, term68307.getClass(), "limit", 536870913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term68307;
        try {
            callMethod(klass, "read", argTypes, term68235, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


