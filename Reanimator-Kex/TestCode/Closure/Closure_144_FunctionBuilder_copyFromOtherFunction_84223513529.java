package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FunctionBuilder_copyFromOtherFunction_84223513529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39622;
     Object term39710;

    public FunctionBuilder_copyFromOtherFunction_84223513529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        term39710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term39710;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term39622, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


