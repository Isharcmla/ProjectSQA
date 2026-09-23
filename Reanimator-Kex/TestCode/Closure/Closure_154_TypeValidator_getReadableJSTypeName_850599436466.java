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

public class TypeValidator_getReadableJSTypeName_850599436466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234835;
     Object term234921;

    public TypeValidator_getReadableJSTypeName_850599436466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234835 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term234921 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term235007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term235121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term235213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term234921, term234921.getClass(), "type", 33);
        setField(term235007, term235007.getClass(), "jsType", term235121);
        setField(term234921, term234921.getClass(), "first", term235007);
        setField(term234921, term234921.getClass(), "last", term235213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term234921;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term234835, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


