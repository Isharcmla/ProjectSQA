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

public class ProcessClosurePrimitives_processBaseClassCall_81421833254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4853;

    public ProcessClosurePrimitives_processBaseClassCall_81421833254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4853 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term4853, term4853.getClass(), "compiler", null);
        setField(term4853, term4853.getClass(), "moduleGraph", null);
        setField(term4853, term4853.getClass(), "providedNames", null);
        setField(term4853, term4853.getClass(), "unrecognizedRequires", null);
        setField(term4853, term4853.getClass(), "exportedVariables", null);
        setField(term4853, term4853.getClass(), "requiresLevel", null);
        setField(term4853, term4853.getClass(), "preprocessorSymbolTable", null);
        setField(term4853, term4853.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "processBaseClassCall", argTypes, term4853, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


