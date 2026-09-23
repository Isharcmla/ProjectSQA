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

public class JSDocInfoBuilder_recordEnumParameterType_881918703471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172228;
     Object term172526;

    public JSDocInfoBuilder_recordEnumParameterType_881918703471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172228 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term172308 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term172432 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term172308, term172308.getClass(), "bitset", -536870912);
        setField(term172432, term172432.getClass(), "parameters", null);
        setField(term172432, term172432.getClass(), "baseType", null);
        setField(term172308, term172308.getClass(), "info", term172432);
        setField(term172308, term172308.getClass(), "thisType", null);
        setField(term172228, term172228.getClass(), "currentInfo", term172308);
        term172526 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term172526;
        try {
            callMethod(klass, "recordEnumParameterType", argTypes, term172228, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


