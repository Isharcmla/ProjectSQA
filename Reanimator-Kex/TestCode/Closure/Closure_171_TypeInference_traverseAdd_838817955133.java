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

public class TypeInference_traverseAdd_838817955133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75354;
     Object term75424;
     Object term76259;
     Object term76260;

    public TypeInference_traverseAdd_838817955133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75354 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term75424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75424, term75424.getClass(), "first", term75424);
        setIntField(term75494, term75494.getClass(), "type", 140);
        setField(term75424, term75424.getClass(), "next", term75494);
        setIntField(term75424, term75424.getClass(), "type", 1045547089);
        term76259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term76259, term76259.getClass(), "compiler", null);
        setField(term76259, term76259.getClass(), "registry", null);
        setField(term76259, term76259.getClass(), "reverseInterpreter", null);
        setField(term76259, term76259.getClass(), "syntacticScope", null);
        setField(term76259, term76259.getClass(), "functionScope", null);
        setField(term76259, term76259.getClass(), "bottomScope", null);
        setField(term76259, term76259.getClass(), "assertionFunctionsMap", null);
        setField(term76259, term76259.getClass(), "unknownType", null);
        setField(term76259, term76259.getClass(), "cfg", null);
        setField(term76259, term76259.getClass(), "joinOp", null);
        setField(term76259, term76259.getClass(), "orderedWorkSet", null);
        term76260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76260, term76260.getClass(), "type", 1045547089);
        setIntField(term76261, term76261.getClass(), "type", 140);
        setField(term76261, term76261.getClass(), "next", null);
        setField(term76261, term76261.getClass(), "first", null);
        setField(term76261, term76261.getClass(), "last", null);
        setField(term76261, term76261.getClass(), "propListHead", null);
        setIntField(term76261, term76261.getClass(), "sourcePosition", 0);
        setField(term76261, term76261.getClass(), "jsType", null);
        setField(term76261, term76261.getClass(), "parent", null);
        setField(term76260, term76260.getClass(), "next", term76261);
        setField(term76260, term76260.getClass(), "first", term76260);
        setField(term76260, term76260.getClass(), "last", null);
        setField(term76260, term76260.getClass(), "propListHead", null);
        setIntField(term76260, term76260.getClass(), "sourcePosition", 0);
        setField(term76260, term76260.getClass(), "jsType", null);
        setField(term76260, term76260.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term75424;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term75354, args);
        assertTrue(recursiveEquals(term75354, term76259));
        assertTrue(recursiveEquals(term75424, term76260));
        assertTrue(recursiveEquals(retValue, null));
    }

};


