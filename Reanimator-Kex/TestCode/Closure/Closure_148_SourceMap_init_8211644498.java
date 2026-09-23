package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class SourceMap_init_8211644498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;

    public SourceMap_init_8211644498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term457 = new ArrayList();
        term456 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term459 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term460 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term456, term456.getClass(), "mappings", term457);
        setIntField(term459, term459.getClass(), "lineNumber", 0);
        setIntField(term459, term459.getClass(), "characterIndex", 0);
        setField(term456, term456.getClass(), "offsetPosition", term459);
        setIntField(term460, term460.getClass(), "lineNumber", 0);
        setIntField(term460, term460.getClass(), "characterIndex", 0);
        setField(term456, term456.getClass(), "prefixPosition", term460);
        setField(term456, term456.getClass(), "lastSourceFile", null);
        setField(term456, term456.getClass(), "lastSourceFileEscaped", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term456));
    }

};


