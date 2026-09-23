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

public class TypeValidator_expectUndeclaredVariable_59719754294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101727;
     Object term101936;
     Object term102018;

    public TypeValidator_expectUndeclaredVariable_59719754294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101727 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term101831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term101727, term101727.getClass(), "typeRegistry", term101831);
        term101936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101936, term101936.getClass(), "type", 33);
        setField(term101936, term101936.getClass(), "propListHead", null);
        term102018 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term102112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term102018, term102018.getClass(), "type", term102112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term101936;
        args[2] = term101936;
        args[3] = term102018;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term101727, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


