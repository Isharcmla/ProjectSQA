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
import java.lang.Object;

public class ClosureCodingConvention_init_895633900150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71382;

    public ClosureCodingConvention_init_895633900150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69303 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term71382 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term71383 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term71384 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term71403 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term71384, 1, "goog.isBoolean");
        setElement(term71384, 2, "goog.isFunction");
        setElement(term71384, 13, "goog.isDefAndNotNull");
        setElement(term71384, 14, "goog.isDef");
        setElement(term71384, 15, "goog.isNull");
        setElement(term71384, 16, "goog.isNumber");
        setElement(term71384, 17, "goog.isObject");
        setElement(term71384, 21, "goog.isArray");
        setElement(term71384, 31, "goog.isString");
        setField(term71383, term71383.getClass(), "table", term71384);
        setIntField(term71383, term71383.getClass(), "mask", 31);
        setElement(term71403, 0, "goog.isDef");
        setElement(term71403, 1, "goog.isNull");
        setElement(term71403, 2, "goog.isDefAndNotNull");
        setElement(term71403, 3, "goog.isString");
        setElement(term71403, 4, "goog.isNumber");
        setElement(term71403, 5, "goog.isBoolean");
        setElement(term71403, 6, "goog.isFunction");
        setElement(term71403, 7, "goog.isArray");
        setElement(term71403, 8, "goog.isObject");
        setField(term71383, term71383.getClass(), "elements", term71403);
        setField(term71383, term71383.getClass(), "asList", null);
        setField(term71382, term71382.getClass(), "propertyTestFunctions", term71383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71382));
    }

};


