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

public class ClosureCodingConvention_getGlobalObject_70925858939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8883;
     Object term28925;

    public ClosureCodingConvention_getGlobalObject_70925858939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8883 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term8884 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term8885 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term9026 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term8885, 1, "goog.isBoolean");
        setElement(term8885, 2, "goog.isFunction");
        setElement(term8885, 13, "goog.isDefAndNotNull");
        setElement(term8885, 14, "goog.isDef");
        setElement(term8885, 15, "goog.isNull");
        setElement(term8885, 16, "goog.isNumber");
        setElement(term8885, 17, "goog.isObject");
        setElement(term8885, 21, "goog.isArray");
        setElement(term8885, 31, "goog.isString");
        setField(term8884, term8884.getClass(), "table", term8885);
        setIntField(term8884, term8884.getClass(), "mask", 31);
        setElement(term9026, 0, "goog.isDef");
        setElement(term9026, 1, "goog.isNull");
        setElement(term9026, 2, "goog.isDefAndNotNull");
        setElement(term9026, 3, "goog.isString");
        setElement(term9026, 4, "goog.isNumber");
        setElement(term9026, 5, "goog.isBoolean");
        setElement(term9026, 6, "goog.isFunction");
        setElement(term9026, 7, "goog.isArray");
        setElement(term9026, 8, "goog.isObject");
        setField(term8884, term8884.getClass(), "elements", term9026);
        setField(term8884, term8884.getClass(), "asList", null);
        setField(term8883, term8883.getClass(), "propertyTestFunctions", term8884);
        term28925 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term28926 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term28927 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term28946 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term28927, 1, "goog.isBoolean");
        setElement(term28927, 2, "goog.isFunction");
        setElement(term28927, 13, "goog.isDefAndNotNull");
        setElement(term28927, 14, "goog.isDef");
        setElement(term28927, 15, "goog.isNull");
        setElement(term28927, 16, "goog.isNumber");
        setElement(term28927, 17, "goog.isObject");
        setElement(term28927, 21, "goog.isArray");
        setElement(term28927, 31, "goog.isString");
        setField(term28926, term28926.getClass(), "table", term28927);
        setIntField(term28926, term28926.getClass(), "mask", 31);
        setElement(term28946, 0, "goog.isDef");
        setElement(term28946, 1, "goog.isNull");
        setElement(term28946, 2, "goog.isDefAndNotNull");
        setElement(term28946, 3, "goog.isString");
        setElement(term28946, 4, "goog.isNumber");
        setElement(term28946, 5, "goog.isBoolean");
        setElement(term28946, 6, "goog.isFunction");
        setElement(term28946, 7, "goog.isArray");
        setElement(term28946, 8, "goog.isObject");
        setField(term28926, term28926.getClass(), "elements", term28946);
        setField(term28926, term28926.getClass(), "asList", null);
        setField(term28925, term28925.getClass(), "propertyTestFunctions", term28926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGlobalObject", argTypes, term8883, args);
        assertTrue(recursiveEquals(term8883, term28925));
        assertTrue(recursiveEquals(retValue, "goog.global"));
    }

};


