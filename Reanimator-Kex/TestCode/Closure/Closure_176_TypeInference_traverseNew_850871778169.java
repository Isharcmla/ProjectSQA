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

public class TypeInference_traverseNew_850871778169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83119;
     Object term83189;
     Object term86714;
     Object term86715;

    public TypeInference_traverseNew_850871778169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83119 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term83189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83259, term83259.getClass(), "type", 864645689);
        setIntField(term83329, term83329.getClass(), "type", 49);
        setField(term83259, term83259.getClass(), "next", term83329);
        setField(term83189, term83189.getClass(), "first", term83259);
        term86714 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term86714, term86714.getClass(), "compiler", null);
        setField(term86714, term86714.getClass(), "registry", null);
        setField(term86714, term86714.getClass(), "reverseInterpreter", null);
        setField(term86714, term86714.getClass(), "syntacticScope", null);
        setField(term86714, term86714.getClass(), "functionScope", null);
        setField(term86714, term86714.getClass(), "bottomScope", null);
        setField(term86714, term86714.getClass(), "assertionFunctionsMap", null);
        setField(term86714, term86714.getClass(), "unknownType", null);
        setField(term86714, term86714.getClass(), "cfg", null);
        setField(term86714, term86714.getClass(), "joinOp", null);
        setField(term86714, term86714.getClass(), "orderedWorkSet", null);
        term86715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86715, term86715.getClass(), "type", 0);
        setField(term86715, term86715.getClass(), "next", null);
        setIntField(term86716, term86716.getClass(), "type", 864645689);
        setIntField(term86717, term86717.getClass(), "type", 49);
        setField(term86717, term86717.getClass(), "next", null);
        setField(term86717, term86717.getClass(), "first", null);
        setField(term86717, term86717.getClass(), "last", null);
        setField(term86717, term86717.getClass(), "propListHead", null);
        setIntField(term86717, term86717.getClass(), "sourcePosition", 0);
        setField(term86717, term86717.getClass(), "jsType", null);
        setField(term86717, term86717.getClass(), "parent", null);
        setField(term86716, term86716.getClass(), "next", term86717);
        setField(term86716, term86716.getClass(), "first", null);
        setField(term86716, term86716.getClass(), "last", null);
        setField(term86716, term86716.getClass(), "propListHead", null);
        setIntField(term86716, term86716.getClass(), "sourcePosition", 0);
        setField(term86716, term86716.getClass(), "jsType", null);
        setField(term86716, term86716.getClass(), "parent", null);
        setField(term86715, term86715.getClass(), "first", term86716);
        setField(term86715, term86715.getClass(), "last", null);
        setField(term86715, term86715.getClass(), "propListHead", null);
        setIntField(term86715, term86715.getClass(), "sourcePosition", 0);
        setField(term86715, term86715.getClass(), "jsType", null);
        setField(term86715, term86715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term83189;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseNew", argTypes, term83119, args);
        assertTrue(recursiveEquals(term83119, term86714));
        assertTrue(recursiveEquals(term83189, term86715));
        assertTrue(recursiveEquals(retValue, null));
    }

};


