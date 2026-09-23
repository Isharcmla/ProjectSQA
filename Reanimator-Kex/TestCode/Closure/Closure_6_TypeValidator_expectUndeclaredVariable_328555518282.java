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

public class TypeValidator_expectUndeclaredVariable_328555518282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81474;
     Object term81579;
     Object term81661;

    public TypeValidator_expectUndeclaredVariable_328555518282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term81579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81579, term81579.getClass(), "type", 154);
        setField(term81579, term81579.getClass(), "propListHead", null);
        term81661 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term81785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term81661, term81661.getClass(), "type", term81785);
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
        args[2] = term81579;
        args[3] = term81579;
        args[4] = term81661;
        args[5] = null;
        args[6] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term81474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


