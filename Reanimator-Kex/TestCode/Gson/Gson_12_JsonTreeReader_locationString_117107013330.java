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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class JsonTreeReader_locationString_117107013330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124873;

    public JsonTreeReader_locationString_117107013330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125160 = new HashMap();
        Set<Map.Entry<Object, Object>> term125101_OuterSet = ((HashMap) term125160).entrySet();
        Iterator<Object> term125101 = ((Set) term125101_OuterSet).iterator();
        term124873 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term124561 = (Object[]) newArray("java.lang.Object", 12);
        Object term124931 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term125025 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term125159 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term124873, term124873.getClass(), "stackSize", 14);
        setElement(term124561, 0, term124931);
        setElement(term124561, 1, "");
        setElement(term124561, 2, term125025);
        setElement(term124561, 4, term125101);
        setElement(term124561, 6, term125159);
        setField(term124873, term124873.getClass(), "stack", term124561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term124873, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


