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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_nullValue_1573754782219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51727;

    public JsonTreeWriter_nullValue_1573754782219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51833 = newInstance(Class.forName("com.google.gson.JsonNull"));
        ArrayList term51779 = new ArrayList();
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add((Object)null);
        ((ArrayList) term51779).add(term51833);
        term51727 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term51727, term51727.getClass(), "pendingName", null);
        setField(term51727, term51727.getClass(), "stack", term51779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nullValue", argTypes, term51727, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


