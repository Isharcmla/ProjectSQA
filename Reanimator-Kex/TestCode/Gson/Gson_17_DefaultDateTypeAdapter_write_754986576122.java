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
import java.util.ArrayList;
import java.lang.Object;

public class DefaultDateTypeAdapter_write_754986576122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51443;
     Object term51537;

    public DefaultDateTypeAdapter_write_754986576122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51443 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        Object term51645 = newInstance(Class.forName("com.google.gson.JsonArray"));
        ArrayList term51589 = new ArrayList();
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add((Object)null);
        ((ArrayList) term51589).add(term51645);
        term51537 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term51537, term51537.getClass(), "pendingName", null);
        setField(term51537, term51537.getClass(), "stack", term51589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term51537;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term51443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


