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

public class TypeInference_traverseChildren_1478920219417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110249;
     Object term1110319;
     Object term1110333;
     Object term1110334;

    public TypeInference_traverseChildren_1478920219417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1110249 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1110319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1110319, term1110319.getClass(), "first", term1110319);
        setIntField(term1110319, term1110319.getClass(), "type", 6);
        term1110333 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term1110333, term1110333.getClass(), "compiler", null);
        setField(term1110333, term1110333.getClass(), "registry", null);
        setField(term1110333, term1110333.getClass(), "reverseInterpreter", null);
        setField(term1110333, term1110333.getClass(), "syntacticScope", null);
        setField(term1110333, term1110333.getClass(), "functionScope", null);
        setField(term1110333, term1110333.getClass(), "bottomScope", null);
        setField(term1110333, term1110333.getClass(), "assertionFunctionsMap", null);
        setField(term1110333, term1110333.getClass(), "unknownType", null);
        setField(term1110333, term1110333.getClass(), "cfg", null);
        setField(term1110333, term1110333.getClass(), "joinOp", null);
        setField(term1110333, term1110333.getClass(), "orderedWorkSet", null);
        term1110334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1110334, term1110334.getClass(), "type", 6);
        setField(term1110334, term1110334.getClass(), "next", null);
        setField(term1110334, term1110334.getClass(), "first", term1110334);
        setField(term1110334, term1110334.getClass(), "last", null);
        setField(term1110334, term1110334.getClass(), "propListHead", null);
        setIntField(term1110334, term1110334.getClass(), "sourcePosition", 0);
        setField(term1110334, term1110334.getClass(), "jsType", null);
        setField(term1110334, term1110334.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1110319;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term1110249, args);
        assertTrue(recursiveEquals(term1110249, term1110333));
        assertTrue(recursiveEquals(term1110319, term1110334));
        assertTrue(recursiveEquals(retValue, null));
    }

};


