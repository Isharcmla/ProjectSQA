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

public class ProcessClosurePrimitives_visit_1582589868126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34978;
     Object term35048;
     Object term35612;
     Object term35613;

    public ProcessClosurePrimitives_visit_1582589868126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34978 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term35048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term35612 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term35612, term35612.getClass(), "compiler", null);
        setField(term35612, term35612.getClass(), "moduleGraph", null);
        setField(term35612, term35612.getClass(), "providedNames", null);
        setField(term35612, term35612.getClass(), "unrecognizedRequires", null);
        setField(term35612, term35612.getClass(), "exportedVariables", null);
        setField(term35612, term35612.getClass(), "requiresLevel", null);
        setField(term35612, term35612.getClass(), "preprocessorSymbolTable", null);
        setField(term35612, term35612.getClass(), "defineCalls", null);
        term35613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35613, term35613.getClass(), "type", 0);
        setField(term35613, term35613.getClass(), "next", null);
        setField(term35613, term35613.getClass(), "first", null);
        setField(term35613, term35613.getClass(), "last", null);
        setField(term35613, term35613.getClass(), "propListHead", null);
        setIntField(term35613, term35613.getClass(), "sourcePosition", 0);
        setField(term35613, term35613.getClass(), "jsType", null);
        setField(term35613, term35613.getClass(), "parent", null);
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
        args[1] = term35048;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term34978, args);
        assertTrue(recursiveEquals(term34978, term35612));
        assertTrue(recursiveEquals(term35048, null));
    }

};


