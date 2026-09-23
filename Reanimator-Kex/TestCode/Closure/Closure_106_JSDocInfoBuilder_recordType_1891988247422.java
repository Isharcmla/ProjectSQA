package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JSDocInfoBuilder_recordType_1891988247422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161549;
     Object term161847;

    public JSDocInfoBuilder_recordType_1891988247422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161549 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term161629 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term161753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term161629, term161629.getClass(), "bitset", -536870912);
        setField(term161753, term161753.getClass(), "parameters", null);
        setField(term161753, term161753.getClass(), "baseType", null);
        setField(term161629, term161629.getClass(), "info", term161753);
        setField(term161629, term161629.getClass(), "thisType", null);
        setField(term161549, term161549.getClass(), "currentInfo", term161629);
        term161847 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term161847;
        try {
            callMethod(klass, "recordType", argTypes, term161549, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


