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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_isPropertyTestFunction_159189447040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9408;
     Object term9691;

    public ClosureCodingConvention_isPropertyTestFunction_159189447040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9408 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object term9409 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term9410 = (Object[]) newArray("java.lang.Object", 32);
        Object[] term9551 = (Object[]) newArray("java.lang.Object", 9);
        setElement(term9410, 1, "goog.isBoolean");
        setElement(term9410, 2, "goog.isFunction");
        setElement(term9410, 13, "goog.isDefAndNotNull");
        setElement(term9410, 14, "goog.isDef");
        setElement(term9410, 15, "goog.isNull");
        setElement(term9410, 16, "goog.isNumber");
        setElement(term9410, 17, "goog.isObject");
        setElement(term9410, 21, "goog.isArray");
        setElement(term9410, 31, "goog.isString");
        setField(term9409, term9409.getClass(), "table", term9410);
        setIntField(term9409, term9409.getClass(), "mask", 31);
        setElement(term9551, 0, "goog.isDef");
        setElement(term9551, 1, "goog.isNull");
        setElement(term9551, 2, "goog.isDefAndNotNull");
        setElement(term9551, 3, "goog.isString");
        setElement(term9551, 4, "goog.isNumber");
        setElement(term9551, 5, "goog.isBoolean");
        setElement(term9551, 6, "goog.isFunction");
        setElement(term9551, 7, "goog.isArray");
        setElement(term9551, 8, "goog.isObject");
        setField(term9409, term9409.getClass(), "elements", term9551);
        setField(term9409, term9409.getClass(), "asList", null);
        setField(term9408, term9408.getClass(), "propertyTestFunctions", term9409);
        term9691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9691, term9691.getClass(), "type", -25637976);
        setIntField(term9693, term9693.getClass(), "type", -430151637);
        setIntField(term9695, term9695.getClass(), "type", 0);
        setField(term9695, term9695.getClass(), "next", null);
        setField(term9695, term9695.getClass(), "first", null);
        setField(term9695, term9695.getClass(), "last", null);
        setField(term9695, term9695.getClass(), "propListHead", null);
        setIntField(term9695, term9695.getClass(), "sourcePosition", 0);
        setField(term9695, term9695.getClass(), "jsType", null);
        setField(term9695, term9695.getClass(), "parent", null);
        setField(term9693, term9693.getClass(), "next", term9695);
        setIntField(term9698, term9698.getClass(), "type", 0);
        setField(term9698, term9698.getClass(), "next", null);
        setField(term9698, term9698.getClass(), "first", null);
        setField(term9698, term9698.getClass(), "last", null);
        setField(term9698, term9698.getClass(), "propListHead", null);
        setIntField(term9698, term9698.getClass(), "sourcePosition", 0);
        setField(term9698, term9698.getClass(), "jsType", null);
        setField(term9698, term9698.getClass(), "parent", null);
        setField(term9693, term9693.getClass(), "first", term9698);
        setIntField(term9701, term9701.getClass(), "type", 0);
        setField(term9701, term9701.getClass(), "next", null);
        setField(term9701, term9701.getClass(), "first", null);
        setField(term9701, term9701.getClass(), "last", null);
        setField(term9701, term9701.getClass(), "propListHead", null);
        setIntField(term9701, term9701.getClass(), "sourcePosition", 0);
        setField(term9701, term9701.getClass(), "jsType", null);
        setField(term9701, term9701.getClass(), "parent", null);
        setField(term9693, term9693.getClass(), "last", term9701);
        setField(term9693, term9693.getClass(), "propListHead", null);
        setIntField(term9693, term9693.getClass(), "sourcePosition", 0);
        setField(term9693, term9693.getClass(), "jsType", null);
        setField(term9693, term9693.getClass(), "parent", null);
        setField(term9691, term9691.getClass(), "next", term9693);
        setIntField(term9705, term9705.getClass(), "type", 0);
        setField(term9705, term9705.getClass(), "next", null);
        setField(term9705, term9705.getClass(), "first", null);
        setField(term9705, term9705.getClass(), "last", null);
        setField(term9705, term9705.getClass(), "propListHead", null);
        setIntField(term9705, term9705.getClass(), "sourcePosition", 0);
        setField(term9705, term9705.getClass(), "jsType", null);
        setField(term9705, term9705.getClass(), "parent", null);
        setField(term9691, term9691.getClass(), "first", term9705);
        setIntField(term9708, term9708.getClass(), "type", 0);
        setField(term9708, term9708.getClass(), "next", null);
        setField(term9708, term9708.getClass(), "first", null);
        setField(term9708, term9708.getClass(), "last", null);
        setField(term9708, term9708.getClass(), "propListHead", null);
        setIntField(term9708, term9708.getClass(), "sourcePosition", 0);
        setField(term9708, term9708.getClass(), "jsType", null);
        setField(term9708, term9708.getClass(), "parent", null);
        setField(term9691, term9691.getClass(), "last", term9708);
        setField(term9691, term9691.getClass(), "propListHead", null);
        setIntField(term9691, term9691.getClass(), "sourcePosition", 0);
        setField(term9691, term9691.getClass(), "jsType", null);
        setField(term9691, term9691.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9691;
        try {
            callMethod(klass, "isPropertyTestFunction", argTypes, term9408, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


