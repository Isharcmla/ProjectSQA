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

public class TypeValidator_expectUndeclaredVariable_328555518308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101561;
     Object term101770;
     Object term101852;

    public TypeValidator_expectUndeclaredVariable_328555518308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101561 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term101665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term101561, term101561.getClass(), "typeRegistry", term101665);
        term101770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101770, term101770.getClass(), "type", 147);
        setField(term101770, term101770.getClass(), "propListHead", null);
        term101852 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term101942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term101852, term101852.getClass(), "type", term101942);
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
        args[2] = term101770;
        args[3] = term101770;
        args[4] = term101852;
        args[5] = null;
        args[6] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term101561, args);
    }

};


