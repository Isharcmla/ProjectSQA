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

public class ClosureCodingConvention_isPrivate_119089826844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11667;
     Object term34658;

    public ClosureCodingConvention_isPrivate_119089826844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11667 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term11668 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term11669 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term11810 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term11669, 1, "goog.isBoolean");
        setElement(term11669, 2, "goog.isFunction");
        setElement(term11669, 13, "goog.isDefAndNotNull");
        setElement(term11669, 14, "goog.isDef");
        setElement(term11669, 15, "goog.isNull");
        setElement(term11669, 16, "goog.isNumber");
        setElement(term11669, 17, "goog.isObject");
        setElement(term11669, 21, "goog.isArray");
        setElement(term11669, 31, "goog.isString");
        setField(term11668, term11668.getClass(), "table", term11669);
        setIntField(term11668, term11668.getClass(), "mask", 31);
        setElement(term11810, 0, "goog.isDef");
        setElement(term11810, 1, "goog.isNull");
        setElement(term11810, 2, "goog.isDefAndNotNull");
        setElement(term11810, 3, "goog.isString");
        setElement(term11810, 4, "goog.isNumber");
        setElement(term11810, 5, "goog.isBoolean");
        setElement(term11810, 6, "goog.isFunction");
        setElement(term11810, 7, "goog.isArray");
        setElement(term11810, 8, "goog.isObject");
        setField(term11668, term11668.getClass(), "elements", term11810);
        setField(term11668, term11668.getClass(), "asList", null);
        setField(term11667, term11667.getClass(), "propertyTestFunctions", term11668);
        term34658 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term34659 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term34660 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term34679 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term34660, 1, "goog.isBoolean");
        setElement(term34660, 2, "goog.isFunction");
        setElement(term34660, 13, "goog.isDefAndNotNull");
        setElement(term34660, 14, "goog.isDef");
        setElement(term34660, 15, "goog.isNull");
        setElement(term34660, 16, "goog.isNumber");
        setElement(term34660, 17, "goog.isObject");
        setElement(term34660, 21, "goog.isArray");
        setElement(term34660, 31, "goog.isString");
        setField(term34659, term34659.getClass(), "table", term34660);
        setIntField(term34659, term34659.getClass(), "mask", 31);
        setElement(term34679, 0, "goog.isDef");
        setElement(term34679, 1, "goog.isNull");
        setElement(term34679, 2, "goog.isDefAndNotNull");
        setElement(term34679, 3, "goog.isString");
        setElement(term34679, 4, "goog.isNumber");
        setElement(term34679, 5, "goog.isBoolean");
        setElement(term34679, 6, "goog.isFunction");
        setElement(term34679, 7, "goog.isArray");
        setElement(term34679, 8, "goog.isObject");
        setField(term34659, term34659.getClass(), "elements", term34679);
        setField(term34659, term34659.getClass(), "asList", null);
        setField(term34658, term34658.getClass(), "propertyTestFunctions", term34659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "isPrivate", argTypes, term11667, args);
        assertTrue(recursiveEquals(term11667, term34658));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


