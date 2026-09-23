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
import java.lang.IndexOutOfBoundsException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class SourceMapConsumerV3_getPreviousMapping_8213780628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239;
     Object term2348;

    public SourceMapConsumerV3_getPreviousMapping_8213780628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2339 = new ArrayList();
        HashMap term2343 = new HashMap();
        term2239 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2240 = (Object[]) newArray("java.lang.String", 3);
        Object[] term2277 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2240, 0, "JqXGgAhZPl");
        setElement(term2240, 1, "jiKYgYHqIS");
        setElement(term2240, 2, "DfISiziTgG");
        setField(term2239, term2239.getClass(), "sources", term2240);
        setElement(term2277, 0, "XqgfKFvPSD");
        setElement(term2277, 1, "JiVRgTZvKc");
        setElement(term2277, 2, "XPKmummaqg");
        setElement(term2277, 3, "BKLfkLiZTH");
        setElement(term2277, 4, "SPpkrGcPRr");
        setField(term2239, term2239.getClass(), "names", term2277);
        setIntField(term2239, term2239.getClass(), "lineCount", -655067527);
        setField(term2239, term2239.getClass(), "lines", term2339);
        setField(term2239, term2239.getClass(), "reverseSourceMapping", term2343);
        term2348 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2348;
        try {
            callMethod(klass, "getPreviousMapping", argTypes, term2239, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


