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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ProcessClosurePrimitives_maybeAddStringNodeToSymbolTable_132536986484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23536;
     Object term26367;

    public ProcessClosurePrimitives_maybeAddStringNodeToSymbolTable_132536986484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23536 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term23536, term23536.getClass(), "preprocessorSymbolTable", null);
        term26367 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term26367, term26367.getClass(), "compiler", null);
        setField(term26367, term26367.getClass(), "moduleGraph", null);
        setField(term26367, term26367.getClass(), "providedNames", null);
        setField(term26367, term26367.getClass(), "unrecognizedRequires", null);
        setField(term26367, term26367.getClass(), "exportedVariables", null);
        setField(term26367, term26367.getClass(), "requiresLevel", null);
        setField(term26367, term26367.getClass(), "preprocessorSymbolTable", null);
        setField(term26367, term26367.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeAddStringNodeToSymbolTable", argTypes, term23536, args);
        assertTrue(recursiveEquals(term23536, term26367));
    }

};


