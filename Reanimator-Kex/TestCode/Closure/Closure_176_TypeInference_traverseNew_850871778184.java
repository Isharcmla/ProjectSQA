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

public class TypeInference_traverseNew_850871778184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90350;
     Object term90420;
     Object term90760;
     Object term90761;

    public TypeInference_traverseNew_850871778184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90350 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term90420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90420, term90420.getClass(), "first", term90420);
        setIntField(term90420, term90420.getClass(), "type", 132);
        term90760 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term90760, term90760.getClass(), "compiler", null);
        setField(term90760, term90760.getClass(), "registry", null);
        setField(term90760, term90760.getClass(), "reverseInterpreter", null);
        setField(term90760, term90760.getClass(), "syntacticScope", null);
        setField(term90760, term90760.getClass(), "functionScope", null);
        setField(term90760, term90760.getClass(), "bottomScope", null);
        setField(term90760, term90760.getClass(), "assertionFunctionsMap", null);
        setField(term90760, term90760.getClass(), "unknownType", null);
        setField(term90760, term90760.getClass(), "cfg", null);
        setField(term90760, term90760.getClass(), "joinOp", null);
        setField(term90760, term90760.getClass(), "orderedWorkSet", null);
        term90761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90761, term90761.getClass(), "type", 132);
        setField(term90761, term90761.getClass(), "next", null);
        setField(term90761, term90761.getClass(), "first", term90761);
        setField(term90761, term90761.getClass(), "last", null);
        setField(term90761, term90761.getClass(), "propListHead", null);
        setIntField(term90761, term90761.getClass(), "sourcePosition", 0);
        setField(term90761, term90761.getClass(), "jsType", null);
        setField(term90761, term90761.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term90420;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term90350, args);
        assertTrue(recursiveEquals(term90350, term90760));
        assertTrue(recursiveEquals(term90420, term90761));
        assertTrue(recursiveEquals(retValue, null));
    }

};


