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

public class TypeValidator_expectUndeclaredVariable_59719754370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145631;
     Object term145827;
     Object term145919;
     Object term146001;

    public TypeValidator_expectUndeclaredVariable_59719754370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145631 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term145735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term145631, term145631.getClass(), "typeRegistry", term145735);
        term145827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145827, term145827.getClass(), "type", 33);
        setField(term145827, term145827.getClass(), "propListHead", null);
        term145919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term145919, term145919.getClass(), "propListHead", null);
        term146001 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term146091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term146001, term146001.getClass(), "type", term146091);
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
        args[1] = term145827;
        args[2] = term145919;
        args[3] = term146001;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term145631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


