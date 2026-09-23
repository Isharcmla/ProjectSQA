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

public class ProcessClosurePrimitives_maybeAddToSymbolTable_1728180459105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30328;
     Object term30592;

    public ProcessClosurePrimitives_maybeAddToSymbolTable_1728180459105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30328 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term30328, term30328.getClass(), "preprocessorSymbolTable", null);
        term30592 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term30592, term30592.getClass(), "compiler", null);
        setField(term30592, term30592.getClass(), "moduleGraph", null);
        setField(term30592, term30592.getClass(), "providedNames", null);
        setField(term30592, term30592.getClass(), "unrecognizedRequires", null);
        setField(term30592, term30592.getClass(), "exportedVariables", null);
        setField(term30592, term30592.getClass(), "requiresLevel", null);
        setField(term30592, term30592.getClass(), "preprocessorSymbolTable", null);
        setField(term30592, term30592.getClass(), "defineCalls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeAddToSymbolTable", argTypes, term30328, args);
        assertTrue(recursiveEquals(term30328, term30592));
    }

};


