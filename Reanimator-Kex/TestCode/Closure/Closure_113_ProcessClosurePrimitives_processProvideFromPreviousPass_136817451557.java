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

public class ProcessClosurePrimitives_processProvideFromPreviousPass_136817451557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6192;

    public ProcessClosurePrimitives_processProvideFromPreviousPass_136817451557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6192 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term6192, term6192.getClass(), "compiler", null);
        setField(term6192, term6192.getClass(), "moduleGraph", null);
        setField(term6192, term6192.getClass(), "providedNames", null);
        setField(term6192, term6192.getClass(), "unrecognizedRequires", null);
        setField(term6192, term6192.getClass(), "exportedVariables", null);
        setField(term6192, term6192.getClass(), "requiresLevel", null);
        setField(term6192, term6192.getClass(), "preprocessorSymbolTable", null);
        setField(term6192, term6192.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "processProvideFromPreviousPass", argTypes, term6192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


