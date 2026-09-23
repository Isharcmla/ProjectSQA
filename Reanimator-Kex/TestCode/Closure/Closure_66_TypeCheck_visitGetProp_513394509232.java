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

public class TypeCheck_visitGetProp_513394509232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60172;
     Object term60258;

    public TypeCheck_visitGetProp_513394509232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60172 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60258 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60344 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60430 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term60258, term60258.getClass(), "jsType", null);
        setField(term60258, term60258.getClass(), "last", term60344);
        setField(term60258, term60258.getClass(), "first", term60430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term60258;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term60172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


