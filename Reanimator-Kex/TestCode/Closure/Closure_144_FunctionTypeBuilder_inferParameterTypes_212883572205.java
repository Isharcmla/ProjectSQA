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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92834;
     Object term93008;
     Object term93158;

    public FunctionTypeBuilder_inferParameterTypes_212883572205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92834 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term92938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term92834, term92834.getClass(), "typeRegistry", term92938);
        term93008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93008, term93008.getClass(), "first", term93078);
        term93158 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term93158, term93158.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term93008;
        args[1] = term93158;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term92834, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


