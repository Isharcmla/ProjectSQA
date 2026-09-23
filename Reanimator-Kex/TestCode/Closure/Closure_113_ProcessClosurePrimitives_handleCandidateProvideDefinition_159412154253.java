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

public class ProcessClosurePrimitives_handleCandidateProvideDefinition_159412154253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4392;

    public ProcessClosurePrimitives_handleCandidateProvideDefinition_159412154253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4392 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term4392, term4392.getClass(), "compiler", null);
        setField(term4392, term4392.getClass(), "moduleGraph", null);
        setField(term4392, term4392.getClass(), "providedNames", null);
        setField(term4392, term4392.getClass(), "unrecognizedRequires", null);
        setField(term4392, term4392.getClass(), "exportedVariables", null);
        setField(term4392, term4392.getClass(), "requiresLevel", null);
        setField(term4392, term4392.getClass(), "preprocessorSymbolTable", null);
        setField(term4392, term4392.getClass(), "defineCalls", null);
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
            callMethod(klass, "handleCandidateProvideDefinition", argTypes, term4392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


