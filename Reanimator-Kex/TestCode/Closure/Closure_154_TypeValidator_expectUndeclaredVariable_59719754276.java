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

public class TypeValidator_expectUndeclaredVariable_59719754276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92978;
     Object term93116;
     Object term93198;

    public TypeValidator_expectUndeclaredVariable_59719754276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92978 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term93116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93116, term93116.getClass(), "type", 33);
        setField(term93116, term93116.getClass(), "propListHead", null);
        term93198 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term93298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term93198, term93198.getClass(), "type", term93298);
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
        args[1] = term93116;
        args[2] = term93116;
        args[3] = term93198;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term92978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


