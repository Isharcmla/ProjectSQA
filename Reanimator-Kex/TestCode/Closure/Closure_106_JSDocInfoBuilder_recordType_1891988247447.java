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

public class JSDocInfoBuilder_recordType_1891988247447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166840;
     Object term167014;

    public JSDocInfoBuilder_recordType_1891988247447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166840 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term166920 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term166920, term166920.getClass(), "bitset", -1610612736);
        setField(term166920, term166920.getClass(), "info", null);
        setField(term166920, term166920.getClass(), "thisType", null);
        setField(term166840, term166840.getClass(), "currentInfo", term166920);
        term167014 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term167014;
        try {
            callMethod(klass, "recordType", argTypes, term166840, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


