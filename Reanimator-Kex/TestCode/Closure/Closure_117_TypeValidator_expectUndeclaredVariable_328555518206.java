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
import java.lang.Object;

public class TypeValidator_expectUndeclaredVariable_328555518206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73729;
     Object term73821;
     Object term73903;

    public TypeValidator_expectUndeclaredVariable_328555518206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73729 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term73821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73821, term73821.getClass(), "type", 0);
        term73903 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term74001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term73903, term73903.getClass(), "type", term74001);
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
        args[2] = term73821;
        args[3] = null;
        args[4] = term73903;
        args[5] = null;
        args[6] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term73729, args);
    }

};


