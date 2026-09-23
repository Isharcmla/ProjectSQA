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

public class JsonTreeWriter_value_1061590859353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85397;

    public JsonTreeWriter_value_1061590859353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85557 = new ArrayList();
        Object term85505 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term85505, term85505.getClass(), "elements", term85557);
        ArrayList term85449 = new ArrayList();
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add((Object)null);
        ((ArrayList) term85449).add(term85505);
        term85397 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term85397, term85397.getClass(), "pendingName", null);
        setField(term85397, term85397.getClass(), "stack", term85449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        Object retValue = callMethod(klass, "value", argTypes, term85397, args);
        assertTrue(recursiveEquals(retValue, true));
    }

};


