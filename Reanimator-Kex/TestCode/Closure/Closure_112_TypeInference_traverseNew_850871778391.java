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

public class TypeInference_traverseNew_850871778391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062647;
     Object term1062717;
     Object term1992168;
     Object term1992169;

    public TypeInference_traverseNew_850871778391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1062647 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1062717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1062717, term1062717.getClass(), "first", term1062717);
        setIntField(term1062717, term1062717.getClass(), "type", 135);
        term1992168 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term1992168, term1992168.getClass(), "compiler", null);
        setField(term1992168, term1992168.getClass(), "registry", null);
        setField(term1992168, term1992168.getClass(), "reverseInterpreter", null);
        setField(term1992168, term1992168.getClass(), "syntacticScope", null);
        setField(term1992168, term1992168.getClass(), "functionScope", null);
        setField(term1992168, term1992168.getClass(), "bottomScope", null);
        setField(term1992168, term1992168.getClass(), "assertionFunctionsMap", null);
        setField(term1992168, term1992168.getClass(), "unknownType", null);
        setField(term1992168, term1992168.getClass(), "cfg", null);
        setField(term1992168, term1992168.getClass(), "joinOp", null);
        setField(term1992168, term1992168.getClass(), "orderedWorkSet", null);
        term1992169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1992169, term1992169.getClass(), "type", 135);
        setField(term1992169, term1992169.getClass(), "next", null);
        setField(term1992169, term1992169.getClass(), "first", term1992169);
        setField(term1992169, term1992169.getClass(), "last", null);
        setField(term1992169, term1992169.getClass(), "propListHead", null);
        setIntField(term1992169, term1992169.getClass(), "sourcePosition", 0);
        setField(term1992169, term1992169.getClass(), "jsType", null);
        setField(term1992169, term1992169.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1062717;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term1062647, args);
        assertTrue(recursiveEquals(term1062647, term1992168));
        assertTrue(recursiveEquals(term1062717, term1992169));
        assertTrue(recursiveEquals(retValue, null));
    }

};


