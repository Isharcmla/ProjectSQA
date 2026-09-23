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

public class JSDocInfoBuilder_recordTypedef_595478264338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142502;
     Object term142800;

    public JSDocInfoBuilder_recordTypedef_595478264338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142502 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term142582 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term142706 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term142582, term142582.getClass(), "bitset", -536870912);
        setField(term142706, term142706.getClass(), "parameters", null);
        setField(term142706, term142706.getClass(), "baseType", null);
        setField(term142582, term142582.getClass(), "info", term142706);
        setField(term142582, term142582.getClass(), "thisType", null);
        setField(term142502, term142502.getClass(), "currentInfo", term142582);
        term142800 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term142800;
        try {
            callMethod(klass, "recordTypedef", argTypes, term142502, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


