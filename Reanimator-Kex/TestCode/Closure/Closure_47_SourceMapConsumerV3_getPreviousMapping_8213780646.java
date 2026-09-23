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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.debugging.sourcemap.EqualityUtils.*;

public class SourceMapConsumerV3_getPreviousMapping_8213780646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12959;
     Object term14665;

    public SourceMapConsumerV3_getPreviousMapping_8213780646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12959 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        term14665 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term14665, term14665.getClass(), "sources", null);
        setField(term14665, term14665.getClass(), "names", null);
        setIntField(term14665, term14665.getClass(), "lineCount", 0);
        setField(term14665, term14665.getClass(), "lines", null);
        setField(term14665, term14665.getClass(), "reverseSourceMapping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getPreviousMapping", argTypes, term12959, args);
        assertTrue(recursiveEquals(term12959, term14665));
        assertTrue(recursiveEquals(retValue, null));
    }

};


