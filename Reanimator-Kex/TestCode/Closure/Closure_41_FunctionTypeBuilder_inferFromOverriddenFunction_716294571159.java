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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47176;
     Object term47276;
     Object term47510;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47176 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term47176, term47176.getClass(), "returnType", null);
        setBooleanField(term47176, term47176.getClass(), "returnTypeInferred", false);
        setField(term47176, term47176.getClass(), "typeRegistry", null);
        term47276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term47370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term47440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47370, term47370.getClass(), "returnType", null);
        setBooleanField(term47370, term47370.getClass(), "returnTypeInferred", false);
        setField(term47440, term47440.getClass(), "first", null);
        setField(term47370, term47370.getClass(), "parameters", term47440);
        setField(term47276, term47276.getClass(), "call", term47370);
        term47510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47510, term47510.getClass(), "first", term47510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term47276;
        args[1] = term47510;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term47176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


