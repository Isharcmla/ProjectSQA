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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class DefaultDateTypeAdapter_write_75498657698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34894;
     Object term34988;

    public DefaultDateTypeAdapter_write_75498657698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34894 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        ArrayList term35040 = new ArrayList();
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        ((ArrayList) term35040).add((Object)null);
        term34988 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term34988, term34988.getClass(), "pendingName", null);
        setField(term34988, term34988.getClass(), "stack", term35040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term34988;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term34894, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


