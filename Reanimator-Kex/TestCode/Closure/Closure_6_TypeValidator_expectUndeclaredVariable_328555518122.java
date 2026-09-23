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

public class TypeValidator_expectUndeclaredVariable_328555518122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28990;
     Object term29060;
     Object term29142;

    public TypeValidator_expectUndeclaredVariable_328555518122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28990 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term29060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29060, term29060.getClass(), "type", 0);
        term29142 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term29234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term29142, term29142.getClass(), "type", term29234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term29060;
        args[3] = null;
        args[4] = term29142;
        args[5] = null;
        args[6] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term28990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


