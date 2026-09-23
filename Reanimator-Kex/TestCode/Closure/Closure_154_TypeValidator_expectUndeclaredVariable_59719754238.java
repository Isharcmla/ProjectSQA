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

public class TypeValidator_expectUndeclaredVariable_59719754238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75173;
     Object term75278;
     Object term75360;

    public TypeValidator_expectUndeclaredVariable_59719754238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75173 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term75278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75278, term75278.getClass(), "type", 33);
        setField(term75278, term75278.getClass(), "propListHead", null);
        term75360 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term75452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term75360, term75360.getClass(), "type", term75452);
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
        args[1] = term75278;
        args[2] = term75278;
        args[3] = term75360;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term75173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


