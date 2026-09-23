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

public class FunctionTypeBuilder_init_61033970149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37873;

    public FunctionTypeBuilder_init_61033970149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37691 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term37691, term37691.getClass(), "returnType", term37803);
        setBooleanField(term37691, term37691.getClass(), "returnTypeInferred", false);
        setField(term37691, term37691.getClass(), "implementedInterfaces", null);
        setField(term37691, term37691.getClass(), "baseType", null);
        setField(term37691, term37691.getClass(), "thisType", null);
        setBooleanField(term37691, term37691.getClass(), "isConstructor", false);
        setBooleanField(term37691, term37691.getClass(), "isInterface", false);
        setField(term37691, term37691.getClass(), "parametersNode", null);
        setField(term37691, term37691.getClass(), "sourceNode", null);
        setField(term37691, term37691.getClass(), "templateTypeName", null);
        term37873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term37873;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


