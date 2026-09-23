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
import java.util.HashMap;

public class JSDocInfoBuilder_recordType_1891988247517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183586;
     Object term183984;

    public JSDocInfoBuilder_recordType_1891988247517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term183838 = new HashMap();
        term183586 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term183666 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term183790 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term183666, term183666.getClass(), "bitset", -1073741824);
        setField(term183790, term183790.getClass(), "parameters", term183838);
        setField(term183790, term183790.getClass(), "baseType", null);
        setField(term183666, term183666.getClass(), "info", term183790);
        setField(term183666, term183666.getClass(), "thisType", null);
        setField(term183586, term183586.getClass(), "currentInfo", term183666);
        term183984 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term183984;
        try {
            callMethod(klass, "recordType", argTypes, term183586, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


