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

public class TypeInference_traverseNew_850871778143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77020;
     Object term77090;
     Object term77820;
     Object term77821;

    public TypeInference_traverseNew_850871778143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77020 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term77090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77090, term77090.getClass(), "first", term77090);
        setIntField(term77090, term77090.getClass(), "type", 75);
        term77820 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term77820, term77820.getClass(), "compiler", null);
        setField(term77820, term77820.getClass(), "registry", null);
        setField(term77820, term77820.getClass(), "reverseInterpreter", null);
        setField(term77820, term77820.getClass(), "syntacticScope", null);
        setField(term77820, term77820.getClass(), "functionScope", null);
        setField(term77820, term77820.getClass(), "bottomScope", null);
        setField(term77820, term77820.getClass(), "assertionFunctionsMap", null);
        setField(term77820, term77820.getClass(), "unknownType", null);
        setField(term77820, term77820.getClass(), "cfg", null);
        setField(term77820, term77820.getClass(), "joinOp", null);
        setField(term77820, term77820.getClass(), "orderedWorkSet", null);
        term77821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77821, term77821.getClass(), "type", 75);
        setField(term77821, term77821.getClass(), "next", null);
        setField(term77821, term77821.getClass(), "first", term77821);
        setField(term77821, term77821.getClass(), "last", null);
        setField(term77821, term77821.getClass(), "propListHead", null);
        setIntField(term77821, term77821.getClass(), "sourcePosition", 0);
        setField(term77821, term77821.getClass(), "jsType", null);
        setField(term77821, term77821.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term77090;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term77020, args);
        assertTrue(recursiveEquals(term77020, term77820));
        assertTrue(recursiveEquals(term77090, term77821));
        assertTrue(recursiveEquals(retValue, null));
    }

};


