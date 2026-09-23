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

public class TypeValidator_expectUndeclaredVariable_328555518214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78317;
     Object term78491;
     Object term78573;

    public TypeValidator_expectUndeclaredVariable_328555518214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78317 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term78421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term78317, term78317.getClass(), "typeRegistry", term78421);
        term78491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78491, term78491.getClass(), "type", 0);
        term78573 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term78679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term78573, term78573.getClass(), "type", term78679);
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
        args[2] = term78491;
        args[3] = null;
        args[4] = term78573;
        args[5] = null;
        args[6] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term78317, args);
    }

};


