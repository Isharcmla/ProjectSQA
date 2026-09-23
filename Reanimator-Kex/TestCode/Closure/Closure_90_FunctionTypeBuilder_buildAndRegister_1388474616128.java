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
import java.lang.Object;

public class FunctionTypeBuilder_buildAndRegister_1388474616128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55728;

    public FunctionTypeBuilder_buildAndRegister_1388474616128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55728 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term55826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term55896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55728, term55728.getClass(), "returnType", term55826);
        setField(term55728, term55728.getClass(), "parametersNode", term55896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term55728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


