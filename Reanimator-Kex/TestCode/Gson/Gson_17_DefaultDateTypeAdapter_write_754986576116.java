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
import java.lang.IndexOutOfBoundsException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DefaultDateTypeAdapter_write_754986576116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49354;
     Object term49448;

    public DefaultDateTypeAdapter_write_754986576116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49354 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        ArrayList term49538 = new ArrayList();
        term49448 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term49448, term49448.getClass(), "pendingName", "");
        setBooleanField(term49448, term49448.getClass(), "serializeNulls", true);
        setField(term49448, term49448.getClass(), "stack", term49538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term49448;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term49354, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


