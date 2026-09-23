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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_expectUndeclaredVariable_328555518294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88641;
     Object term88733;
     Object term88825;

    public TypeValidator_expectUndeclaredVariable_328555518294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88641 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term88733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term88733, term88733.getClass(), "type", 154);
        setField(term88733, term88733.getClass(), "propListHead", null);
        term88825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
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
        args[2] = term88733;
        args[3] = term88825;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term88641, args);
    }

};


