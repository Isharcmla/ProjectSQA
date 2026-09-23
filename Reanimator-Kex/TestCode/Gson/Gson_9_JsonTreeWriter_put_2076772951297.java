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

public class JsonTreeWriter_put_2076772951297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77406;
     Object term77554;

    public JsonTreeWriter_put_2076772951297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77496 = new ArrayList();
        term77406 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term77406, term77406.getClass(), "pendingName", "");
        setField(term77406, term77406.getClass(), "stack", term77496);
        term77554 = newInstance(Class.forName("com.google.gson.JsonObject"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.JsonElement");
        Object[] args = new Object[1];
        args[0] = term77554;
        callMethod(klass, "put", argTypes, term77406, args);
    }

};


