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

public class ProcessClosurePrimitives_verifyIsLast_1251707398141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39198;
     Object term39268;
     Object term39275;
     Object term39276;

    public ProcessClosurePrimitives_verifyIsLast_1251707398141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39198 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term39268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term39275 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term39275, term39275.getClass(), "compiler", null);
        setField(term39275, term39275.getClass(), "moduleGraph", null);
        setField(term39275, term39275.getClass(), "providedNames", null);
        setField(term39275, term39275.getClass(), "unrecognizedRequires", null);
        setField(term39275, term39275.getClass(), "exportedVariables", null);
        setField(term39275, term39275.getClass(), "requiresLevel", null);
        setField(term39275, term39275.getClass(), "preprocessorSymbolTable", null);
        setField(term39275, term39275.getClass(), "defineCalls", null);
        term39276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39276, term39276.getClass(), "type", 0);
        setField(term39276, term39276.getClass(), "next", null);
        setField(term39276, term39276.getClass(), "first", null);
        setField(term39276, term39276.getClass(), "last", null);
        setField(term39276, term39276.getClass(), "propListHead", null);
        setIntField(term39276, term39276.getClass(), "sourcePosition", 0);
        setField(term39276, term39276.getClass(), "jsType", null);
        setField(term39276, term39276.getClass(), "parent", null);
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
        args[2] = term39268;
        Object retValue = callMethod(klass, "verifyIsLast", argTypes, term39198, args);
        assertTrue(recursiveEquals(term39198, term39275));
        assertTrue(recursiveEquals(term39268, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


