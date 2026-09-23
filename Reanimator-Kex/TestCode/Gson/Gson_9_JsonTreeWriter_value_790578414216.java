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

public class JsonTreeWriter_value_790578414216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50444;

    public JsonTreeWriter_value_790578414216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50560 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        ArrayList term50496 = new ArrayList();
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add((Object)null);
        ((ArrayList) term50496).add(term50560);
        term50444 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term50444, term50444.getClass(), "pendingName", null);
        setField(term50444, term50444.getClass(), "stack", term50496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "value", argTypes, term50444, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


