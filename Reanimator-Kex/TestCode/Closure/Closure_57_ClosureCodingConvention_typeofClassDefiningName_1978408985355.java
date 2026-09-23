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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134073;
     Object term134165;
     Object term134274;
     Object term134275;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134073 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term134165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term134165, term134165.getClass(), "type", 33);
        setField(term134165, term134165.getClass(), "last", term134257);
        term134274 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term134274, term134274.getClass(), "propertyTestFunctions", null);
        term134275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term134275, term134275.getClass(), "str", null);
        setIntField(term134275, term134275.getClass(), "type", 33);
        setField(term134275, term134275.getClass(), "next", null);
        setField(term134275, term134275.getClass(), "first", null);
        setField(term134276, term134276.getClass(), "str", null);
        setIntField(term134276, term134276.getClass(), "type", 0);
        setField(term134276, term134276.getClass(), "next", null);
        setField(term134276, term134276.getClass(), "first", null);
        setField(term134276, term134276.getClass(), "last", null);
        setField(term134276, term134276.getClass(), "propListHead", null);
        setIntField(term134276, term134276.getClass(), "sourcePosition", 0);
        setField(term134276, term134276.getClass(), "jsType", null);
        setField(term134276, term134276.getClass(), "parent", null);
        setField(term134275, term134275.getClass(), "last", term134276);
        setField(term134275, term134275.getClass(), "propListHead", null);
        setIntField(term134275, term134275.getClass(), "sourcePosition", 0);
        setField(term134275, term134275.getClass(), "jsType", null);
        setField(term134275, term134275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134165;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term134073, args);
        assertTrue(recursiveEquals(term134073, term134274));
        assertTrue(recursiveEquals(term134165, term134275));
        assertTrue(recursiveEquals(retValue, null));
    }

};


