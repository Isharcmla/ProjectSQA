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

public class FunctionTypeBuilder_init_610339701177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53206;

    public FunctionTypeBuilder_init_610339701177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52986 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53136 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(term52986, term52986.getClass(), "contents", term53136);
        setField(term52986, term52986.getClass(), "returnType", null);
        setBooleanField(term52986, term52986.getClass(), "returnTypeInferred", false);
        setField(term52986, term52986.getClass(), "implementedInterfaces", null);
        setField(term52986, term52986.getClass(), "extendedInterfaces", null);
        setField(term52986, term52986.getClass(), "baseType", null);
        setField(term52986, term52986.getClass(), "thisType", null);
        setBooleanField(term52986, term52986.getClass(), "isConstructor", false);
        setBooleanField(term52986, term52986.getClass(), "isInterface", false);
        setField(term52986, term52986.getClass(), "parametersNode", null);
        setField(term52986, term52986.getClass(), "templateTypeName", null);
        term53206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53356 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(null, Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"), "singleton", term53356);
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
        args[2] = term53206;
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


