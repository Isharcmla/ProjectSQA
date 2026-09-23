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

public class ProcessClosurePrimitives_handleTypedefDefinition_38855286852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3946;

    public ProcessClosurePrimitives_handleTypedefDefinition_38855286852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3946 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term3946, term3946.getClass(), "compiler", null);
        setField(term3946, term3946.getClass(), "moduleGraph", null);
        setField(term3946, term3946.getClass(), "providedNames", null);
        setField(term3946, term3946.getClass(), "unrecognizedRequires", null);
        setField(term3946, term3946.getClass(), "exportedVariables", null);
        setField(term3946, term3946.getClass(), "requiresLevel", null);
        setField(term3946, term3946.getClass(), "preprocessorSymbolTable", null);
        setField(term3946, term3946.getClass(), "defineCalls", null);
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
            callMethod(klass, "handleTypedefDefinition", argTypes, term3946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


