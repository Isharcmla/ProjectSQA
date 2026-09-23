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

public class JsonTreeWriter_value_790578414331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82539;

    public JsonTreeWriter_value_790578414331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82647 = newInstance(Class.forName("com.google.gson.JsonArray"));
        ArrayList term82591 = new ArrayList();
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add((Object)null);
        ((ArrayList) term82591).add(term82647);
        term82539 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term82539, term82539.getClass(), "pendingName", null);
        setField(term82539, term82539.getClass(), "stack", term82591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "value", argTypes, term82539, args);
    }

};


