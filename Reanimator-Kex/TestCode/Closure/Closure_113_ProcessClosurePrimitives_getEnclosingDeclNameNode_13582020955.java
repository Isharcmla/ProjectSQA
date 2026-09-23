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

public class ProcessClosurePrimitives_getEnclosingDeclNameNode_13582020955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5265;

    public ProcessClosurePrimitives_getEnclosingDeclNameNode_13582020955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5265 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term5265, term5265.getClass(), "compiler", null);
        setField(term5265, term5265.getClass(), "moduleGraph", null);
        setField(term5265, term5265.getClass(), "providedNames", null);
        setField(term5265, term5265.getClass(), "unrecognizedRequires", null);
        setField(term5265, term5265.getClass(), "exportedVariables", null);
        setField(term5265, term5265.getClass(), "requiresLevel", null);
        setField(term5265, term5265.getClass(), "preprocessorSymbolTable", null);
        setField(term5265, term5265.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getEnclosingDeclNameNode", argTypes, term5265, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


