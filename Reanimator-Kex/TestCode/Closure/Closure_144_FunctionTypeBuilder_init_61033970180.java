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

public class FunctionTypeBuilder_init_61033970180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51356;

    public FunctionTypeBuilder_init_61033970180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51118 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term51216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term51286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51118, term51118.getClass(), "returnType", term51216);
        setField(term51118, term51118.getClass(), "implementedInterfaces", null);
        setField(term51118, term51118.getClass(), "baseType", null);
        setField(term51118, term51118.getClass(), "thisType", null);
        setBooleanField(term51118, term51118.getClass(), "isConstructor", false);
        setBooleanField(term51118, term51118.getClass(), "isInterface", false);
        setField(term51118, term51118.getClass(), "parametersNode", term51286);
        setField(term51118, term51118.getClass(), "sourceNode", null);
        setField(term51118, term51118.getClass(), "templateTypeName", null);
        term51356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
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
        args[2] = term51356;
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


