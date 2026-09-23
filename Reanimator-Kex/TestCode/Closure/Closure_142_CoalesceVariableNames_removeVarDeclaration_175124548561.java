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

public class CoalesceVariableNames_removeVarDeclaration_175124548561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22711;
     Object term22797;

    public CoalesceVariableNames_removeVarDeclaration_175124548561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22711 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        term22797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term22883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term22797, term22797.getClass(), "parent", term22883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22797;
        try {
            callMethod(klass, "removeVarDeclaration", argTypes, term22711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


