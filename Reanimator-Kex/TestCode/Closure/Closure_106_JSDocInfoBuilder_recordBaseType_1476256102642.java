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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JSDocInfoBuilder_recordBaseType_1476256102642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220081;
     Object term220175;

    public JSDocInfoBuilder_recordBaseType_1476256102642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220081 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term220081, term220081.getClass(), "currentInfo", null);
        term220175 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term220175;
        try {
            callMethod(klass, "recordBaseType", argTypes, term220081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


