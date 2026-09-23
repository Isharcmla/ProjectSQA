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

public class FunctionTypeBuilder_buildAndRegister_1388474616109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59834;

    public FunctionTypeBuilder_buildAndRegister_1388474616109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59834 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term59940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term60010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59834, term59834.getClass(), "returnType", term59940);
        setField(term59834, term59834.getClass(), "parametersNode", term60010);
        setBooleanField(term59834, term59834.getClass(), "isConstructor", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term59834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


