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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_locationString_117107013272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92902;

    public JsonTreeReader_locationString_117107013272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92902 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term92648 = (Object[]) newArray("java.lang.Object", 2);
        Object term92958 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term93070 = newInstance(Class.forName("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1"));
        setIntField(term92902, term92902.getClass(), "stackSize", 1);
        setElement(term92648, 0, term92958);
        setElement(term92648, 1, term93070);
        setField(term92902, term92902.getClass(), "stack", term92648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term92902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


