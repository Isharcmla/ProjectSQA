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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_getOriginalMappingForEntry_50149137429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2430;

    public SourceMapConsumerV3_getOriginalMappingForEntry_50149137429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2446 = new ArrayList();
        HashMap term2450 = new HashMap();
        term2430 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2431 = (Object[]) newArray("java.lang.String", 1);
        Object[] term2444 = (Object[]) newArray("java.lang.String", 0);
        setElement(term2431, 0, "sEccwbJKYE");
        setField(term2430, term2430.getClass(), "sources", term2431);
        setField(term2430, term2430.getClass(), "names", term2444);
        setIntField(term2430, term2430.getClass(), "lineCount", -2068769794);
        setField(term2430, term2430.getClass(), "lines", term2446);
        setField(term2430, term2430.getClass(), "reverseSourceMapping", term2450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getOriginalMappingForEntry", argTypes, term2430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


