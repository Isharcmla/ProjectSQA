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

public class FunctionTypeBuilder_init_61033970182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44426;
     Object term44496;

    public FunctionTypeBuilder_init_61033970182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44240 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term44346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term44240, term44240.getClass(), "returnType", term44346);
        setBooleanField(term44240, term44240.getClass(), "returnTypeInferred", false);
        setField(term44240, term44240.getClass(), "implementedInterfaces", null);
        setField(term44240, term44240.getClass(), "baseType", null);
        setField(term44240, term44240.getClass(), "thisType", null);
        setBooleanField(term44240, term44240.getClass(), "isConstructor", false);
        setBooleanField(term44240, term44240.getClass(), "isInterface", false);
        setField(term44240, term44240.getClass(), "parametersNode", null);
        setField(term44240, term44240.getClass(), "sourceNode", null);
        setField(term44240, term44240.getClass(), "templateTypeName", null);
        setField(term44240, term44240.getClass(), "fnName", null);
        term44426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term44496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
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
        args[1] = term44426;
        args[2] = term44496;
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


