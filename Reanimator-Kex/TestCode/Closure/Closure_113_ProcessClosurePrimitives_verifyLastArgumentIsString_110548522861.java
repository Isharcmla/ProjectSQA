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

public class ProcessClosurePrimitives_verifyLastArgumentIsString_110548522861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8020;

    public ProcessClosurePrimitives_verifyLastArgumentIsString_110548522861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8020 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term8020, term8020.getClass(), "compiler", null);
        setField(term8020, term8020.getClass(), "moduleGraph", null);
        setField(term8020, term8020.getClass(), "providedNames", null);
        setField(term8020, term8020.getClass(), "unrecognizedRequires", null);
        setField(term8020, term8020.getClass(), "exportedVariables", null);
        setField(term8020, term8020.getClass(), "requiresLevel", null);
        setField(term8020, term8020.getClass(), "preprocessorSymbolTable", null);
        setField(term8020, term8020.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "verifyLastArgumentIsString", argTypes, term8020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


