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
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_getReverseMapping_78886131353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17534;
     Object term18749;
     Object term18745;

    public SourceMapConsumerV3_getReverseMapping_78886131353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17586 = new ArrayList();
        term17534 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term17534, term17534.getClass(), "reverseSourceMapping", null);
        setField(term17534, term17534.getClass(), "lines", term17586);
        ArrayList term18750 = new ArrayList();
        HashMap term18752 = new HashMap();
        term18749 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term18749, term18749.getClass(), "sources", null);
        setField(term18749, term18749.getClass(), "names", null);
        setIntField(term18749, term18749.getClass(), "lineCount", 0);
        setField(term18749, term18749.getClass(), "lines", term18750);
        setField(term18749, term18749.getClass(), "reverseSourceMapping", term18752);
        term18745 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term18745, term18745.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "getReverseMapping", argTypes, term17534, args);
        assertTrue(recursiveEquals(term17534, term18749));
        assertTrue(recursiveEquals(retValue, term18745));
    }

};


