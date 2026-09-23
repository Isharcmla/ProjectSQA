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

public class TypeValidator_expectUndeclaredVariable_5971975474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17180;
     Object term17250;
     Object term17332;

    public TypeValidator_expectUndeclaredVariable_5971975474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17180 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term17250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17250, term17250.getClass(), "type", -34);
        term17332 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term17424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term17332, term17332.getClass(), "type", term17424);
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
        args[1] = term17250;
        args[2] = null;
        args[3] = term17332;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "expectUndeclaredVariable", argTypes, term17180, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


