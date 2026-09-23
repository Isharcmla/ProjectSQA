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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FunctionTypeBuilder_addParameter_1631834534105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31788;
     Object term31904;
     Object term32016;

    public FunctionTypeBuilder_addParameter_1631834534105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31788 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term31904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        term32016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term31904;
        args[1] = term32016;
        args[2] = false;
        args[3] = false;
        args[4] = false;
        try {
            callMethod(klass, "addParameter", argTypes, term31788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


