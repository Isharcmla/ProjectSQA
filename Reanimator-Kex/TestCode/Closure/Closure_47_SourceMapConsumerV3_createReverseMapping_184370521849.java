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
import java.lang.ClassCastException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SourceMapConsumerV3_createReverseMapping_184370521849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14842;

    public SourceMapConsumerV3_createReverseMapping_184370521849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14932 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term14894 = new ArrayList();
        ((ArrayList) term14894).add(term14932);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        ((ArrayList) term14894).add((Object)null);
        term14842 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term14842, term14842.getClass(), "reverseSourceMapping", null);
        setField(term14842, term14842.getClass(), "lines", term14894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createReverseMapping", argTypes, term14842, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


