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

public class TypeInference_traverse_54214581885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52158;
     Object term52228;
     Object term52587;
     Object term52588;

    public TypeInference_traverse_54214581885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52158 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term52228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52228, term52228.getClass(), "type", 50);
        term52587 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term52587, term52587.getClass(), "compiler", null);
        setField(term52587, term52587.getClass(), "registry", null);
        setField(term52587, term52587.getClass(), "reverseInterpreter", null);
        setField(term52587, term52587.getClass(), "syntacticScope", null);
        setField(term52587, term52587.getClass(), "functionScope", null);
        setField(term52587, term52587.getClass(), "bottomScope", null);
        setField(term52587, term52587.getClass(), "assignedOuterLocalVars", null);
        setField(term52587, term52587.getClass(), "unflowableVarNames", null);
        setField(term52587, term52587.getClass(), "cfg", null);
        setField(term52587, term52587.getClass(), "joinOp", null);
        setField(term52587, term52587.getClass(), "orderedWorkSet", null);
        term52588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52588, term52588.getClass(), "type", 50);
        setField(term52588, term52588.getClass(), "next", null);
        setField(term52588, term52588.getClass(), "first", null);
        setField(term52588, term52588.getClass(), "last", null);
        setField(term52588, term52588.getClass(), "propListHead", null);
        setIntField(term52588, term52588.getClass(), "sourcePosition", 0);
        setField(term52588, term52588.getClass(), "jsType", null);
        setField(term52588, term52588.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term52228;
        args[1] = null;
        Object retValue = callMethod(klass, "traverse", argTypes, term52158, args);
        assertTrue(recursiveEquals(term52158, term52587));
        assertTrue(recursiveEquals(term52228, term52588));
        assertTrue(recursiveEquals(retValue, null));
    }

};


