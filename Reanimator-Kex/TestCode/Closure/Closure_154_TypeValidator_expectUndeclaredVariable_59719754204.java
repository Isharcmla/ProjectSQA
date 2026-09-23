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

public class TypeValidator_expectUndeclaredVariable_59719754204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65774;
     Object term65866;
     Object term65948;

    public TypeValidator_expectUndeclaredVariable_59719754204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65774 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term65866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term65866, term65866.getClass(), "type", -34);
        term65948 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term66060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term65948, term65948.getClass(), "type", term66060);
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
        args[1] = term65866;
        args[2] = null;
        args[3] = term65948;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term65774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


