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

public class ClosureCodingConvention_getExportPropertyFunction_30377965033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4997;
     Object term23191;

    public ClosureCodingConvention_getExportPropertyFunction_30377965033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4997 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term4998 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term4999 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term5140 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term4999, 1, "goog.isBoolean");
        setElement(term4999, 2, "goog.isFunction");
        setElement(term4999, 13, "goog.isDefAndNotNull");
        setElement(term4999, 14, "goog.isDef");
        setElement(term4999, 15, "goog.isNull");
        setElement(term4999, 16, "goog.isNumber");
        setElement(term4999, 17, "goog.isObject");
        setElement(term4999, 21, "goog.isArray");
        setElement(term4999, 31, "goog.isString");
        setField(term4998, term4998.getClass(), "table", term4999);
        setIntField(term4998, term4998.getClass(), "mask", 31);
        setElement(term5140, 0, "goog.isDef");
        setElement(term5140, 1, "goog.isNull");
        setElement(term5140, 2, "goog.isDefAndNotNull");
        setElement(term5140, 3, "goog.isString");
        setElement(term5140, 4, "goog.isNumber");
        setElement(term5140, 5, "goog.isBoolean");
        setElement(term5140, 6, "goog.isFunction");
        setElement(term5140, 7, "goog.isArray");
        setElement(term5140, 8, "goog.isObject");
        setField(term4998, term4998.getClass(), "elements", term5140);
        setField(term4998, term4998.getClass(), "asList", null);
        setField(term4997, term4997.getClass(), "propertyTestFunctions", term4998);
        term23191 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term23192 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term23193 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term23212 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term23193, 1, "goog.isBoolean");
        setElement(term23193, 2, "goog.isFunction");
        setElement(term23193, 13, "goog.isDefAndNotNull");
        setElement(term23193, 14, "goog.isDef");
        setElement(term23193, 15, "goog.isNull");
        setElement(term23193, 16, "goog.isNumber");
        setElement(term23193, 17, "goog.isObject");
        setElement(term23193, 21, "goog.isArray");
        setElement(term23193, 31, "goog.isString");
        setField(term23192, term23192.getClass(), "table", term23193);
        setIntField(term23192, term23192.getClass(), "mask", 31);
        setElement(term23212, 0, "goog.isDef");
        setElement(term23212, 1, "goog.isNull");
        setElement(term23212, 2, "goog.isDefAndNotNull");
        setElement(term23212, 3, "goog.isString");
        setElement(term23212, 4, "goog.isNumber");
        setElement(term23212, 5, "goog.isBoolean");
        setElement(term23212, 6, "goog.isFunction");
        setElement(term23212, 7, "goog.isArray");
        setElement(term23212, 8, "goog.isObject");
        setField(term23192, term23192.getClass(), "elements", term23212);
        setField(term23192, term23192.getClass(), "asList", null);
        setField(term23191, term23191.getClass(), "propertyTestFunctions", term23192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getExportPropertyFunction", argTypes, term4997, args);
        assertTrue(recursiveEquals(term4997, term23191));
        assertTrue(recursiveEquals(retValue, "goog.exportProperty"));
    }

};


