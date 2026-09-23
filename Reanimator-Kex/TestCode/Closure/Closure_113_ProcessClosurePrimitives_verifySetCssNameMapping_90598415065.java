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

public class ProcessClosurePrimitives_verifySetCssNameMapping_90598415065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9868;

    public ProcessClosurePrimitives_verifySetCssNameMapping_90598415065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9868 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term9868, term9868.getClass(), "compiler", null);
        setField(term9868, term9868.getClass(), "moduleGraph", null);
        setField(term9868, term9868.getClass(), "providedNames", null);
        setField(term9868, term9868.getClass(), "unrecognizedRequires", null);
        setField(term9868, term9868.getClass(), "exportedVariables", null);
        setField(term9868, term9868.getClass(), "requiresLevel", null);
        setField(term9868, term9868.getClass(), "preprocessorSymbolTable", null);
        setField(term9868, term9868.getClass(), "defineCalls", null);
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
            callMethod(klass, "verifySetCssNameMapping", argTypes, term9868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


