package com.google.debugging.sourcemap;

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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SourceMapConsumerV3_parseMetaMap_98623946336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11125;
     Object term11281;

    public SourceMapConsumerV3_parseMetaMap_98623946336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11125 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        term11281 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$DefaultSourceMapSupplier"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.json.JSONObject");
        argTypes[1] = Class.forName("com.google.debugging.sourcemap.SourceMapSupplier");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11281;
        try {
            callMethod(klass, "parseMetaMap", argTypes, term11125, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


