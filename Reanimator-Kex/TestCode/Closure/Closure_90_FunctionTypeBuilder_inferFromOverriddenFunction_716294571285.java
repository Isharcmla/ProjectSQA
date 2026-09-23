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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107056;
     Object term107256;
     Object term107617;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107056 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term107156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term107056, term107056.getClass(), "returnType", term107156);
        setBooleanField(term107056, term107056.getClass(), "returnTypeInferred", false);
        setField(term107056, term107056.getClass(), "typeRegistry", null);
        term107256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term107350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term107420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term107617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term107350, term107350.getClass(), "returnType", null);
        setBooleanField(term107350, term107350.getClass(), "returnTypeInferred", false);
        setField(term107663, term107663.getClass(), "next", term107617);
        setField(term107617, term107617.getClass(), "first", term107663);
        setField(term107617, term107617.getClass(), "next", null);
        setField(term107617, term107617.getClass(), "jsType", null);
        setField(term107617, term107617.getClass(), "propListHead", null);
        setField(term107420, term107420.getClass(), "first", term107617);
        setField(term107350, term107350.getClass(), "parameters", term107420);
        setField(term107256, term107256.getClass(), "call", term107350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term107256;
        args[1] = term107617;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term107056, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


