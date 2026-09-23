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

public class JsonTreeWriter_beginArray_712666648363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87534;

    public JsonTreeWriter_beginArray_712666648363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87624 = newInstance(Class.forName("java.lang.Object"));
        Object term87680 = newInstance(Class.forName("com.google.gson.JsonArray"));
        ArrayList term87586 = new ArrayList();
        ((ArrayList) term87586).add(term87624);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add((Object)null);
        ((ArrayList) term87586).add(term87680);
        term87534 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term87534, term87534.getClass(), "pendingName", null);
        setField(term87534, term87534.getClass(), "stack", term87586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginArray", argTypes, term87534, args);
    }

};


