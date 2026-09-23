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
import java.lang.Object;

public class TypeInference_traverseNew_850871778118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69622;
     Object term69692;
     Object term70200;
     Object term70201;

    public TypeInference_traverseNew_850871778118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69622 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term69692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69762, term69762.getClass(), "type", 864645689);
        setIntField(term69832, term69832.getClass(), "type", 70);
        setField(term69762, term69762.getClass(), "next", term69832);
        setField(term69692, term69692.getClass(), "first", term69762);
        term70200 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term70200, term70200.getClass(), "compiler", null);
        setField(term70200, term70200.getClass(), "registry", null);
        setField(term70200, term70200.getClass(), "reverseInterpreter", null);
        setField(term70200, term70200.getClass(), "syntacticScope", null);
        setField(term70200, term70200.getClass(), "functionScope", null);
        setField(term70200, term70200.getClass(), "bottomScope", null);
        setField(term70200, term70200.getClass(), "assertionFunctionsMap", null);
        setField(term70200, term70200.getClass(), "unknownType", null);
        setField(term70200, term70200.getClass(), "cfg", null);
        setField(term70200, term70200.getClass(), "joinOp", null);
        setField(term70200, term70200.getClass(), "orderedWorkSet", null);
        term70201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70201, term70201.getClass(), "type", 0);
        setField(term70201, term70201.getClass(), "next", null);
        setIntField(term70202, term70202.getClass(), "type", 864645689);
        setIntField(term70203, term70203.getClass(), "type", 70);
        setField(term70203, term70203.getClass(), "next", null);
        setField(term70203, term70203.getClass(), "first", null);
        setField(term70203, term70203.getClass(), "last", null);
        setField(term70203, term70203.getClass(), "propListHead", null);
        setIntField(term70203, term70203.getClass(), "sourcePosition", 0);
        setField(term70203, term70203.getClass(), "jsType", null);
        setField(term70203, term70203.getClass(), "parent", null);
        setField(term70202, term70202.getClass(), "next", term70203);
        setField(term70202, term70202.getClass(), "first", null);
        setField(term70202, term70202.getClass(), "last", null);
        setField(term70202, term70202.getClass(), "propListHead", null);
        setIntField(term70202, term70202.getClass(), "sourcePosition", 0);
        setField(term70202, term70202.getClass(), "jsType", null);
        setField(term70202, term70202.getClass(), "parent", null);
        setField(term70201, term70201.getClass(), "first", term70202);
        setField(term70201, term70201.getClass(), "last", null);
        setField(term70201, term70201.getClass(), "propListHead", null);
        setIntField(term70201, term70201.getClass(), "sourcePosition", 0);
        setField(term70201, term70201.getClass(), "jsType", null);
        setField(term70201, term70201.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term69692;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term69622, args);
        assertTrue(recursiveEquals(term69622, term70200));
        assertTrue(recursiveEquals(term69692, term70201));
        assertTrue(recursiveEquals(retValue, null));
    }

};


