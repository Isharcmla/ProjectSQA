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

public class ProcessClosurePrimitives_visit_1582589868201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57304;
     Object term57374;
     Object term57396;
     Object term57397;

    public ProcessClosurePrimitives_visit_1582589868201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57304 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term57374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57374, term57374.getClass(), "type", 33);
        setField(term57374, term57374.getClass(), "first", term57374);
        term57396 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term57396, term57396.getClass(), "compiler", null);
        setField(term57396, term57396.getClass(), "moduleGraph", null);
        setField(term57396, term57396.getClass(), "providedNames", null);
        setField(term57396, term57396.getClass(), "unrecognizedRequires", null);
        setField(term57396, term57396.getClass(), "exportedVariables", null);
        setField(term57396, term57396.getClass(), "requiresLevel", null);
        setField(term57396, term57396.getClass(), "preprocessorSymbolTable", null);
        setField(term57396, term57396.getClass(), "defineCalls", null);
        term57397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57397, term57397.getClass(), "type", 33);
        setField(term57397, term57397.getClass(), "next", null);
        setField(term57397, term57397.getClass(), "first", term57397);
        setField(term57397, term57397.getClass(), "last", null);
        setField(term57397, term57397.getClass(), "propListHead", null);
        setIntField(term57397, term57397.getClass(), "sourcePosition", 0);
        setField(term57397, term57397.getClass(), "jsType", null);
        setField(term57397, term57397.getClass(), "parent", null);
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
        args[1] = term57374;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term57304, args);
        assertTrue(recursiveEquals(term57304, term57396));
        assertTrue(recursiveEquals(term57374, null));
    }

};


