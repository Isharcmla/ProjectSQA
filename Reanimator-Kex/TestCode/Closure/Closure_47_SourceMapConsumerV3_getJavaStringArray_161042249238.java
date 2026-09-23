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
import org.json.JSONException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SourceMapConsumerV3_getJavaStringArray_161042249238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11415;
     Object term11457;

    public SourceMapConsumerV3_getJavaStringArray_161042249238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11415 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        ArrayList term11509 = new ArrayList();
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        ((ArrayList) term11509).add((Object)null);
        term11457 = newInstance(Class.forName("org.json.JSONArray"));
        setField(term11457, term11457.getClass(), "myArrayList", term11509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.json.JSONArray");
        Object[] args = new Object[1];
        args[0] = term11457;
        try {
            callMethod(klass, "getJavaStringArray", argTypes, term11415, args);
            assertTrue(false);
        }
        catch (JSONException e) {
        }

    }

};


