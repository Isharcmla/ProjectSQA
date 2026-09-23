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

public class TypeInference_traverse_542145818139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44297;
     Object term44367;
     Object term46434;
     Object term46435;

    public TypeInference_traverse_542145818139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44297 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term44367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44367, term44367.getClass(), "type", 4);
        term46434 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term46434, term46434.getClass(), "compiler", null);
        setField(term46434, term46434.getClass(), "registry", null);
        setField(term46434, term46434.getClass(), "reverseInterpreter", null);
        setField(term46434, term46434.getClass(), "syntacticScope", null);
        setField(term46434, term46434.getClass(), "functionScope", null);
        setField(term46434, term46434.getClass(), "bottomScope", null);
        setField(term46434, term46434.getClass(), "assertionFunctionsMap", null);
        setField(term46434, term46434.getClass(), "cfg", null);
        setField(term46434, term46434.getClass(), "joinOp", null);
        setField(term46434, term46434.getClass(), "orderedWorkSet", null);
        term46435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46435, term46435.getClass(), "type", 4);
        setField(term46435, term46435.getClass(), "next", null);
        setField(term46435, term46435.getClass(), "first", null);
        setField(term46435, term46435.getClass(), "last", null);
        setField(term46435, term46435.getClass(), "propListHead", null);
        setIntField(term46435, term46435.getClass(), "sourcePosition", 0);
        setField(term46435, term46435.getClass(), "jsType", null);
        setField(term46435, term46435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term44367;
        args[1] = null;
        Object retValue = callMethod(klass, "traverse", argTypes, term44297, args);
        assertTrue(recursiveEquals(term44297, term46434));
        assertTrue(recursiveEquals(term44367, term46435));
        assertTrue(recursiveEquals(retValue, null));
    }

};


