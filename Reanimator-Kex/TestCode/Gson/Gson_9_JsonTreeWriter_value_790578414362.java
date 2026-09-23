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
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_value_790578414362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87156;

    public JsonTreeWriter_value_790578414362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term87316 = new ArrayList();
        Object term87264 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term87264, term87264.getClass(), "elements", term87316);
        ArrayList term87208 = new ArrayList();
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add((Object)null);
        ((ArrayList) term87208).add(term87264);
        term87156 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term87156, term87156.getClass(), "pendingName", null);
        setField(term87156, term87156.getClass(), "stack", term87208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term87156, args);
        assertTrue(recursiveEquals(retValue, 34363820048L));
    }

};


