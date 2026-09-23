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

public class TypeInference_traverseNew_850871778203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96243;
     Object term96313;
     Object term96761;
     Object term96762;

    public TypeInference_traverseNew_850871778203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96243 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term96313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96383, term96383.getClass(), "type", 864645689);
        setIntField(term96453, term96453.getClass(), "type", 136);
        setField(term96383, term96383.getClass(), "next", term96453);
        setField(term96313, term96313.getClass(), "first", term96383);
        term96761 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term96761, term96761.getClass(), "compiler", null);
        setField(term96761, term96761.getClass(), "registry", null);
        setField(term96761, term96761.getClass(), "reverseInterpreter", null);
        setField(term96761, term96761.getClass(), "syntacticScope", null);
        setField(term96761, term96761.getClass(), "functionScope", null);
        setField(term96761, term96761.getClass(), "bottomScope", null);
        setField(term96761, term96761.getClass(), "assertionFunctionsMap", null);
        setField(term96761, term96761.getClass(), "unknownType", null);
        setField(term96761, term96761.getClass(), "cfg", null);
        setField(term96761, term96761.getClass(), "joinOp", null);
        setField(term96761, term96761.getClass(), "orderedWorkSet", null);
        term96762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96762, term96762.getClass(), "type", 0);
        setField(term96762, term96762.getClass(), "next", null);
        setIntField(term96763, term96763.getClass(), "type", 864645689);
        setIntField(term96764, term96764.getClass(), "type", 136);
        setField(term96764, term96764.getClass(), "next", null);
        setField(term96764, term96764.getClass(), "first", null);
        setField(term96764, term96764.getClass(), "last", null);
        setField(term96764, term96764.getClass(), "propListHead", null);
        setIntField(term96764, term96764.getClass(), "sourcePosition", 0);
        setField(term96764, term96764.getClass(), "jsType", null);
        setField(term96764, term96764.getClass(), "parent", null);
        setField(term96763, term96763.getClass(), "next", term96764);
        setField(term96763, term96763.getClass(), "first", null);
        setField(term96763, term96763.getClass(), "last", null);
        setField(term96763, term96763.getClass(), "propListHead", null);
        setIntField(term96763, term96763.getClass(), "sourcePosition", 0);
        setField(term96763, term96763.getClass(), "jsType", null);
        setField(term96763, term96763.getClass(), "parent", null);
        setField(term96762, term96762.getClass(), "first", term96763);
        setField(term96762, term96762.getClass(), "last", null);
        setField(term96762, term96762.getClass(), "propListHead", null);
        setIntField(term96762, term96762.getClass(), "sourcePosition", 0);
        setField(term96762, term96762.getClass(), "jsType", null);
        setField(term96762, term96762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term96313;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term96243, args);
        assertTrue(recursiveEquals(term96243, term96761));
        assertTrue(recursiveEquals(term96313, term96762));
        assertTrue(recursiveEquals(retValue, null));
    }

};


