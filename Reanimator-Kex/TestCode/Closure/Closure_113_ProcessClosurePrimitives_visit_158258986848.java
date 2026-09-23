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

public class ProcessClosurePrimitives_visit_158258986848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169;

    public ProcessClosurePrimitives_visit_158258986848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2169 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term2169, term2169.getClass(), "compiler", null);
        setField(term2169, term2169.getClass(), "moduleGraph", null);
        setField(term2169, term2169.getClass(), "providedNames", null);
        setField(term2169, term2169.getClass(), "unrecognizedRequires", null);
        setField(term2169, term2169.getClass(), "exportedVariables", null);
        setField(term2169, term2169.getClass(), "requiresLevel", null);
        setField(term2169, term2169.getClass(), "preprocessorSymbolTable", null);
        setField(term2169, term2169.getClass(), "defineCalls", null);
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
            callMethod(klass, "visit", argTypes, term2169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


