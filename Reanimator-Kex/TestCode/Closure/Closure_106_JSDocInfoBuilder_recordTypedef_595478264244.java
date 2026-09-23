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

public class JSDocInfoBuilder_recordTypedef_595478264244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123465;
     Object term123639;

    public JSDocInfoBuilder_recordTypedef_595478264244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123465 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term123545 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term123545, term123545.getClass(), "bitset", -1610612736);
        setField(term123545, term123545.getClass(), "info", null);
        setField(term123545, term123545.getClass(), "thisType", null);
        setField(term123465, term123465.getClass(), "currentInfo", term123545);
        term123639 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term123639;
        try {
            callMethod(klass, "recordTypedef", argTypes, term123465, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


