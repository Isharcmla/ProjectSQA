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

public class ClosureCodingConvention_isSuperClassReference_61724727128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2706;
     Object term19646;

    public ClosureCodingConvention_isSuperClassReference_61724727128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2706 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term2707 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term2708 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term2849 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term2708, 1, "goog.isBoolean");
        setElement(term2708, 2, "goog.isFunction");
        setElement(term2708, 13, "goog.isDefAndNotNull");
        setElement(term2708, 14, "goog.isDef");
        setElement(term2708, 15, "goog.isNull");
        setElement(term2708, 16, "goog.isNumber");
        setElement(term2708, 17, "goog.isObject");
        setElement(term2708, 21, "goog.isArray");
        setElement(term2708, 31, "goog.isString");
        setField(term2707, term2707.getClass(), "table", term2708);
        setIntField(term2707, term2707.getClass(), "mask", 31);
        setElement(term2849, 0, "goog.isDef");
        setElement(term2849, 1, "goog.isNull");
        setElement(term2849, 2, "goog.isDefAndNotNull");
        setElement(term2849, 3, "goog.isString");
        setElement(term2849, 4, "goog.isNumber");
        setElement(term2849, 5, "goog.isBoolean");
        setElement(term2849, 6, "goog.isFunction");
        setElement(term2849, 7, "goog.isArray");
        setElement(term2849, 8, "goog.isObject");
        setField(term2707, term2707.getClass(), "elements", term2849);
        setField(term2707, term2707.getClass(), "asList", null);
        setField(term2706, term2706.getClass(), "propertyTestFunctions", term2707);
        term19646 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term19647 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term19648 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term19667 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term19648, 1, "goog.isBoolean");
        setElement(term19648, 2, "goog.isFunction");
        setElement(term19648, 13, "goog.isDefAndNotNull");
        setElement(term19648, 14, "goog.isDef");
        setElement(term19648, 15, "goog.isNull");
        setElement(term19648, 16, "goog.isNumber");
        setElement(term19648, 17, "goog.isObject");
        setElement(term19648, 21, "goog.isArray");
        setElement(term19648, 31, "goog.isString");
        setField(term19647, term19647.getClass(), "table", term19648);
        setIntField(term19647, term19647.getClass(), "mask", 31);
        setElement(term19667, 0, "goog.isDef");
        setElement(term19667, 1, "goog.isNull");
        setElement(term19667, 2, "goog.isDefAndNotNull");
        setElement(term19667, 3, "goog.isString");
        setElement(term19667, 4, "goog.isNumber");
        setElement(term19667, 5, "goog.isBoolean");
        setElement(term19667, 6, "goog.isFunction");
        setElement(term19667, 7, "goog.isArray");
        setElement(term19667, 8, "goog.isObject");
        setField(term19647, term19647.getClass(), "elements", term19667);
        setField(term19647, term19647.getClass(), "asList", null);
        setField(term19646, term19646.getClass(), "propertyTestFunctions", term19647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "isSuperClassReference", argTypes, term2706, args);
        assertTrue(recursiveEquals(term2706, term19646));
    }

};


