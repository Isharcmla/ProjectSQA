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

public class ClosureCodingConvention_getAbstractMethodName_43840798336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6593;
     Object term26109;

    public ClosureCodingConvention_getAbstractMethodName_43840798336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6593 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term6594 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term6595 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term6736 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term6595, 1, "goog.isBoolean");
        setElement(term6595, 2, "goog.isFunction");
        setElement(term6595, 13, "goog.isDefAndNotNull");
        setElement(term6595, 14, "goog.isDef");
        setElement(term6595, 15, "goog.isNull");
        setElement(term6595, 16, "goog.isNumber");
        setElement(term6595, 17, "goog.isObject");
        setElement(term6595, 21, "goog.isArray");
        setElement(term6595, 31, "goog.isString");
        setField(term6594, term6594.getClass(), "table", term6595);
        setIntField(term6594, term6594.getClass(), "mask", 31);
        setElement(term6736, 0, "goog.isDef");
        setElement(term6736, 1, "goog.isNull");
        setElement(term6736, 2, "goog.isDefAndNotNull");
        setElement(term6736, 3, "goog.isString");
        setElement(term6736, 4, "goog.isNumber");
        setElement(term6736, 5, "goog.isBoolean");
        setElement(term6736, 6, "goog.isFunction");
        setElement(term6736, 7, "goog.isArray");
        setElement(term6736, 8, "goog.isObject");
        setField(term6594, term6594.getClass(), "elements", term6736);
        setField(term6594, term6594.getClass(), "asList", null);
        setField(term6593, term6593.getClass(), "propertyTestFunctions", term6594);
        term26109 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term26110 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term26111 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term26130 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term26111, 1, "goog.isBoolean");
        setElement(term26111, 2, "goog.isFunction");
        setElement(term26111, 13, "goog.isDefAndNotNull");
        setElement(term26111, 14, "goog.isDef");
        setElement(term26111, 15, "goog.isNull");
        setElement(term26111, 16, "goog.isNumber");
        setElement(term26111, 17, "goog.isObject");
        setElement(term26111, 21, "goog.isArray");
        setElement(term26111, 31, "goog.isString");
        setField(term26110, term26110.getClass(), "table", term26111);
        setIntField(term26110, term26110.getClass(), "mask", 31);
        setElement(term26130, 0, "goog.isDef");
        setElement(term26130, 1, "goog.isNull");
        setElement(term26130, 2, "goog.isDefAndNotNull");
        setElement(term26130, 3, "goog.isString");
        setElement(term26130, 4, "goog.isNumber");
        setElement(term26130, 5, "goog.isBoolean");
        setElement(term26130, 6, "goog.isFunction");
        setElement(term26130, 7, "goog.isArray");
        setElement(term26130, 8, "goog.isObject");
        setField(term26110, term26110.getClass(), "elements", term26130);
        setField(term26110, term26110.getClass(), "asList", null);
        setField(term26109, term26109.getClass(), "propertyTestFunctions", term26110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAbstractMethodName", argTypes, term6593, args);
        assertTrue(recursiveEquals(term6593, term26109));
        assertTrue(recursiveEquals(retValue, "goog.abstractMethod"));
    }

};


