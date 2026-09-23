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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46296;
     Object term46388;
     Object term46555;
     Object term46556;
     Object term46507;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term46388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term46388, term46388.getClass(), "type", 37);
        setField(term46388, term46388.getClass(), "first", term46474);
        term46555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term46555, term46555.getClass(), "currentTraversal", null);
        term46556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term46556, term46556.getClass(), "number", 0.0);
        setIntField(term46556, term46556.getClass(), "type", 37);
        setField(term46556, term46556.getClass(), "next", null);
        setField(term46557, term46557.getClass(), "functionName", null);
        setBooleanField(term46557, term46557.getClass(), "itsNeedsActivation", false);
        setIntField(term46557, term46557.getClass(), "itsFunctionType", 0);
        setBooleanField(term46557, term46557.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46557, term46557.getClass(), "encodedSourceStart", 0);
        setIntField(term46557, term46557.getClass(), "encodedSourceEnd", 0);
        setField(term46557, term46557.getClass(), "sourceName", null);
        setIntField(term46557, term46557.getClass(), "baseLineno", 0);
        setIntField(term46557, term46557.getClass(), "endLineno", 0);
        setField(term46557, term46557.getClass(), "functions", null);
        setField(term46557, term46557.getClass(), "regexps", null);
        setField(term46557, term46557.getClass(), "itsVariables", null);
        setField(term46557, term46557.getClass(), "itsConst", null);
        setField(term46557, term46557.getClass(), "itsVariableNames", null);
        setIntField(term46557, term46557.getClass(), "varStart", 0);
        setField(term46557, term46557.getClass(), "compilerData", null);
        setIntField(term46557, term46557.getClass(), "type", 0);
        setField(term46557, term46557.getClass(), "next", null);
        setField(term46557, term46557.getClass(), "first", null);
        setField(term46557, term46557.getClass(), "last", null);
        setField(term46557, term46557.getClass(), "propListHead", null);
        setIntField(term46557, term46557.getClass(), "sourcePosition", 0);
        setField(term46557, term46557.getClass(), "jsType", null);
        setField(term46557, term46557.getClass(), "parent", null);
        setField(term46556, term46556.getClass(), "first", term46557);
        setField(term46556, term46556.getClass(), "last", null);
        setField(term46556, term46556.getClass(), "propListHead", null);
        setIntField(term46556, term46556.getClass(), "sourcePosition", 0);
        setField(term46556, term46556.getClass(), "jsType", null);
        setField(term46556, term46556.getClass(), "parent", null);
        term46507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term46507, term46507.getClass(), "number", 0.0);
        setIntField(term46507, term46507.getClass(), "type", 37);
        setField(term46507, term46507.getClass(), "next", null);
        setField(term46510, term46510.getClass(), "functionName", null);
        setBooleanField(term46510, term46510.getClass(), "itsNeedsActivation", false);
        setIntField(term46510, term46510.getClass(), "itsFunctionType", 0);
        setBooleanField(term46510, term46510.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46510, term46510.getClass(), "encodedSourceStart", 0);
        setIntField(term46510, term46510.getClass(), "encodedSourceEnd", 0);
        setField(term46510, term46510.getClass(), "sourceName", null);
        setIntField(term46510, term46510.getClass(), "baseLineno", 0);
        setIntField(term46510, term46510.getClass(), "endLineno", 0);
        setField(term46510, term46510.getClass(), "functions", null);
        setField(term46510, term46510.getClass(), "regexps", null);
        setField(term46510, term46510.getClass(), "itsVariables", null);
        setField(term46510, term46510.getClass(), "itsConst", null);
        setField(term46510, term46510.getClass(), "itsVariableNames", null);
        setIntField(term46510, term46510.getClass(), "varStart", 0);
        setField(term46510, term46510.getClass(), "compilerData", null);
        setIntField(term46510, term46510.getClass(), "type", 0);
        setField(term46510, term46510.getClass(), "next", null);
        setField(term46510, term46510.getClass(), "first", null);
        setField(term46510, term46510.getClass(), "last", null);
        setField(term46510, term46510.getClass(), "propListHead", null);
        setIntField(term46510, term46510.getClass(), "sourcePosition", 0);
        setField(term46510, term46510.getClass(), "jsType", null);
        setField(term46510, term46510.getClass(), "parent", null);
        setField(term46507, term46507.getClass(), "first", term46510);
        setField(term46507, term46507.getClass(), "last", null);
        setField(term46507, term46507.getClass(), "propListHead", null);
        setIntField(term46507, term46507.getClass(), "sourcePosition", 0);
        setField(term46507, term46507.getClass(), "jsType", null);
        setField(term46507, term46507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46388;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term46296, args);
        assertTrue(recursiveEquals(term46296, term46555));
        assertTrue(recursiveEquals(term46388, term46556));
        assertTrue(recursiveEquals(retValue, term46507));
    }

};


