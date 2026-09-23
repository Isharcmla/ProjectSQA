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

public class ProcessClosurePrimitives_verifyOfType_1844902541110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30930;
     Object term31000;
     Object term31539;
     Object term31540;

    public ProcessClosurePrimitives_verifyOfType_1844902541110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30930 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term31000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31000, term31000.getClass(), "type", 0);
        term31539 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term31539, term31539.getClass(), "compiler", null);
        setField(term31539, term31539.getClass(), "moduleGraph", null);
        setField(term31539, term31539.getClass(), "providedNames", null);
        setField(term31539, term31539.getClass(), "unrecognizedRequires", null);
        setField(term31539, term31539.getClass(), "exportedVariables", null);
        setField(term31539, term31539.getClass(), "requiresLevel", null);
        setField(term31539, term31539.getClass(), "preprocessorSymbolTable", null);
        setField(term31539, term31539.getClass(), "defineCalls", null);
        term31540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31540, term31540.getClass(), "type", 0);
        setField(term31540, term31540.getClass(), "next", null);
        setField(term31540, term31540.getClass(), "first", null);
        setField(term31540, term31540.getClass(), "last", null);
        setField(term31540, term31540.getClass(), "propListHead", null);
        setIntField(term31540, term31540.getClass(), "sourcePosition", 0);
        setField(term31540, term31540.getClass(), "jsType", null);
        setField(term31540, term31540.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term31000;
        args[3] = 0;
        Object retValue = callMethod(klass, "verifyOfType", argTypes, term30930, args);
        assertTrue(recursiveEquals(term30930, term31539));
        assertTrue(recursiveEquals(term31000, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


