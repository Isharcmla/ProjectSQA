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

public class ClosureCodingConvention_getExportSymbolFunction_174215327534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5522;
     Object term24055;

    public ClosureCodingConvention_getExportSymbolFunction_174215327534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5522 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term5523 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term5524 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term5665 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term5524, 1, "goog.isBoolean");
        setElement(term5524, 2, "goog.isFunction");
        setElement(term5524, 13, "goog.isDefAndNotNull");
        setElement(term5524, 14, "goog.isDef");
        setElement(term5524, 15, "goog.isNull");
        setElement(term5524, 16, "goog.isNumber");
        setElement(term5524, 17, "goog.isObject");
        setElement(term5524, 21, "goog.isArray");
        setElement(term5524, 31, "goog.isString");
        setField(term5523, term5523.getClass(), "table", term5524);
        setIntField(term5523, term5523.getClass(), "mask", 31);
        setElement(term5665, 0, "goog.isDef");
        setElement(term5665, 1, "goog.isNull");
        setElement(term5665, 2, "goog.isDefAndNotNull");
        setElement(term5665, 3, "goog.isString");
        setElement(term5665, 4, "goog.isNumber");
        setElement(term5665, 5, "goog.isBoolean");
        setElement(term5665, 6, "goog.isFunction");
        setElement(term5665, 7, "goog.isArray");
        setElement(term5665, 8, "goog.isObject");
        setField(term5523, term5523.getClass(), "elements", term5665);
        setField(term5523, term5523.getClass(), "asList", null);
        setField(term5522, term5522.getClass(), "propertyTestFunctions", term5523);
        term24055 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term24056 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term24057 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term24076 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term24057, 1, "goog.isBoolean");
        setElement(term24057, 2, "goog.isFunction");
        setElement(term24057, 13, "goog.isDefAndNotNull");
        setElement(term24057, 14, "goog.isDef");
        setElement(term24057, 15, "goog.isNull");
        setElement(term24057, 16, "goog.isNumber");
        setElement(term24057, 17, "goog.isObject");
        setElement(term24057, 21, "goog.isArray");
        setElement(term24057, 31, "goog.isString");
        setField(term24056, term24056.getClass(), "table", term24057);
        setIntField(term24056, term24056.getClass(), "mask", 31);
        setElement(term24076, 0, "goog.isDef");
        setElement(term24076, 1, "goog.isNull");
        setElement(term24076, 2, "goog.isDefAndNotNull");
        setElement(term24076, 3, "goog.isString");
        setElement(term24076, 4, "goog.isNumber");
        setElement(term24076, 5, "goog.isBoolean");
        setElement(term24076, 6, "goog.isFunction");
        setElement(term24076, 7, "goog.isArray");
        setElement(term24076, 8, "goog.isObject");
        setField(term24056, term24056.getClass(), "elements", term24076);
        setField(term24056, term24056.getClass(), "asList", null);
        setField(term24055, term24055.getClass(), "propertyTestFunctions", term24056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getExportSymbolFunction", argTypes, term5522, args);
        assertTrue(recursiveEquals(term5522, term24055));
        assertTrue(recursiveEquals(retValue, "goog.exportSymbol"));
    }

};


