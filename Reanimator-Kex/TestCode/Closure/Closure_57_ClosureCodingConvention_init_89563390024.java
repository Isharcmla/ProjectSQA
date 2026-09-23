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

public class ClosureCodingConvention_init_89563390024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15597;

    public ClosureCodingConvention_init_89563390024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15597 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term15598 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term15599 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term15618 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term15599, 1, "goog.isBoolean");
        setElement(term15599, 2, "goog.isFunction");
        setElement(term15599, 13, "goog.isDefAndNotNull");
        setElement(term15599, 14, "goog.isDef");
        setElement(term15599, 15, "goog.isNull");
        setElement(term15599, 16, "goog.isNumber");
        setElement(term15599, 17, "goog.isObject");
        setElement(term15599, 21, "goog.isArray");
        setElement(term15599, 31, "goog.isString");
        setField(term15598, term15598.getClass(), "table", term15599);
        setIntField(term15598, term15598.getClass(), "mask", 31);
        setElement(term15618, 0, "goog.isDef");
        setElement(term15618, 1, "goog.isNull");
        setElement(term15618, 2, "goog.isDefAndNotNull");
        setElement(term15618, 3, "goog.isString");
        setElement(term15618, 4, "goog.isNumber");
        setElement(term15618, 5, "goog.isBoolean");
        setElement(term15618, 6, "goog.isFunction");
        setElement(term15618, 7, "goog.isArray");
        setElement(term15618, 8, "goog.isObject");
        setField(term15598, term15598.getClass(), "elements", term15618);
        setField(term15598, term15598.getClass(), "asList", null);
        setField(term15597, term15597.getClass(), "propertyTestFunctions", term15598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15597));
    }

};


