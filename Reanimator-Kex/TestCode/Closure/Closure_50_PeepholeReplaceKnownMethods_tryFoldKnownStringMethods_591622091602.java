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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3549070;
     Object term3549156;
     Object term3549566;
     Object term3549567;
     Object term3549474;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3549070 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3549156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3549248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3549340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3549448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3549156, term3549156.getClass(), "type", 37);
        setIntField(term3549248, term3549248.getClass(), "type", 33);
        setField(term3549340, term3549340.getClass(), "next", term3549340);
        setIntField(term3549340, term3549340.getClass(), "type", 40);
        setField(term3549340, term3549340.getClass(), "str", "");
        setField(term3549248, term3549248.getClass(), "first", term3549340);
        setIntField(term3549448, term3549448.getClass(), "type", 44);
        setField(term3549248, term3549248.getClass(), "next", term3549448);
        setField(term3549156, term3549156.getClass(), "first", term3549248);
        term3549566 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3549566, term3549566.getClass(), "currentTraversal", null);
        term3549567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3549568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3549569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3549570 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3549567, term3549567.getClass(), "functionName", null);
        setBooleanField(term3549567, term3549567.getClass(), "itsNeedsActivation", false);
        setIntField(term3549567, term3549567.getClass(), "itsFunctionType", 0);
        setBooleanField(term3549567, term3549567.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3549567, term3549567.getClass(), "encodedSourceStart", 0);
        setIntField(term3549567, term3549567.getClass(), "encodedSourceEnd", 0);
        setField(term3549567, term3549567.getClass(), "sourceName", null);
        setIntField(term3549567, term3549567.getClass(), "baseLineno", 0);
        setIntField(term3549567, term3549567.getClass(), "endLineno", 0);
        setField(term3549567, term3549567.getClass(), "functions", null);
        setField(term3549567, term3549567.getClass(), "regexps", null);
        setField(term3549567, term3549567.getClass(), "itsVariables", null);
        setField(term3549567, term3549567.getClass(), "itsConst", null);
        setField(term3549567, term3549567.getClass(), "itsVariableNames", null);
        setIntField(term3549567, term3549567.getClass(), "varStart", 0);
        setField(term3549567, term3549567.getClass(), "compilerData", null);
        setIntField(term3549567, term3549567.getClass(), "type", 37);
        setField(term3549567, term3549567.getClass(), "next", null);
        setField(term3549568, term3549568.getClass(), "str", null);
        setIntField(term3549568, term3549568.getClass(), "type", 33);
        setIntField(term3549569, term3549569.getClass(), "type", 44);
        setField(term3549569, term3549569.getClass(), "next", null);
        setField(term3549569, term3549569.getClass(), "first", null);
        setField(term3549569, term3549569.getClass(), "last", null);
        setField(term3549569, term3549569.getClass(), "propListHead", null);
        setIntField(term3549569, term3549569.getClass(), "sourcePosition", 0);
        setField(term3549569, term3549569.getClass(), "jsType", null);
        setField(term3549569, term3549569.getClass(), "parent", null);
        setField(term3549568, term3549568.getClass(), "next", term3549569);
        setField(term3549570, term3549570.getClass(), "str", "");
        setIntField(term3549570, term3549570.getClass(), "type", 40);
        setField(term3549570, term3549570.getClass(), "next", term3549570);
        setField(term3549570, term3549570.getClass(), "first", null);
        setField(term3549570, term3549570.getClass(), "last", null);
        setField(term3549570, term3549570.getClass(), "propListHead", null);
        setIntField(term3549570, term3549570.getClass(), "sourcePosition", 0);
        setField(term3549570, term3549570.getClass(), "jsType", null);
        setField(term3549570, term3549570.getClass(), "parent", null);
        setField(term3549568, term3549568.getClass(), "first", term3549570);
        setField(term3549568, term3549568.getClass(), "last", null);
        setField(term3549568, term3549568.getClass(), "propListHead", null);
        setIntField(term3549568, term3549568.getClass(), "sourcePosition", 0);
        setField(term3549568, term3549568.getClass(), "jsType", null);
        setField(term3549568, term3549568.getClass(), "parent", null);
        setField(term3549567, term3549567.getClass(), "first", term3549568);
        setField(term3549567, term3549567.getClass(), "last", null);
        setField(term3549567, term3549567.getClass(), "propListHead", null);
        setIntField(term3549567, term3549567.getClass(), "sourcePosition", 0);
        setField(term3549567, term3549567.getClass(), "jsType", null);
        setField(term3549567, term3549567.getClass(), "parent", null);
        term3549474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3549484 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3549486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3549489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3549474, term3549474.getClass(), "functionName", null);
        setBooleanField(term3549474, term3549474.getClass(), "itsNeedsActivation", false);
        setIntField(term3549474, term3549474.getClass(), "itsFunctionType", 0);
        setBooleanField(term3549474, term3549474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3549474, term3549474.getClass(), "encodedSourceStart", 0);
        setIntField(term3549474, term3549474.getClass(), "encodedSourceEnd", 0);
        setField(term3549474, term3549474.getClass(), "sourceName", null);
        setIntField(term3549474, term3549474.getClass(), "baseLineno", 0);
        setIntField(term3549474, term3549474.getClass(), "endLineno", 0);
        setField(term3549474, term3549474.getClass(), "functions", null);
        setField(term3549474, term3549474.getClass(), "regexps", null);
        setField(term3549474, term3549474.getClass(), "itsVariables", null);
        setField(term3549474, term3549474.getClass(), "itsConst", null);
        setField(term3549474, term3549474.getClass(), "itsVariableNames", null);
        setIntField(term3549474, term3549474.getClass(), "varStart", 0);
        setField(term3549474, term3549474.getClass(), "compilerData", null);
        setIntField(term3549474, term3549474.getClass(), "type", 37);
        setField(term3549474, term3549474.getClass(), "next", null);
        setField(term3549484, term3549484.getClass(), "str", null);
        setIntField(term3549484, term3549484.getClass(), "type", 33);
        setIntField(term3549486, term3549486.getClass(), "type", 44);
        setField(term3549486, term3549486.getClass(), "next", null);
        setField(term3549486, term3549486.getClass(), "first", null);
        setField(term3549486, term3549486.getClass(), "last", null);
        setField(term3549486, term3549486.getClass(), "propListHead", null);
        setIntField(term3549486, term3549486.getClass(), "sourcePosition", 0);
        setField(term3549486, term3549486.getClass(), "jsType", null);
        setField(term3549486, term3549486.getClass(), "parent", null);
        setField(term3549484, term3549484.getClass(), "next", term3549486);
        setField(term3549489, term3549489.getClass(), "str", "");
        setIntField(term3549489, term3549489.getClass(), "type", 40);
        setField(term3549489, term3549489.getClass(), "next", term3549489);
        setField(term3549489, term3549489.getClass(), "first", null);
        setField(term3549489, term3549489.getClass(), "last", null);
        setField(term3549489, term3549489.getClass(), "propListHead", null);
        setIntField(term3549489, term3549489.getClass(), "sourcePosition", 0);
        setField(term3549489, term3549489.getClass(), "jsType", null);
        setField(term3549489, term3549489.getClass(), "parent", null);
        setField(term3549484, term3549484.getClass(), "first", term3549489);
        setField(term3549484, term3549484.getClass(), "last", null);
        setField(term3549484, term3549484.getClass(), "propListHead", null);
        setIntField(term3549484, term3549484.getClass(), "sourcePosition", 0);
        setField(term3549484, term3549484.getClass(), "jsType", null);
        setField(term3549484, term3549484.getClass(), "parent", null);
        setField(term3549474, term3549474.getClass(), "first", term3549484);
        setField(term3549474, term3549474.getClass(), "last", null);
        setField(term3549474, term3549474.getClass(), "propListHead", null);
        setIntField(term3549474, term3549474.getClass(), "sourcePosition", 0);
        setField(term3549474, term3549474.getClass(), "jsType", null);
        setField(term3549474, term3549474.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3549156;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3549070, args);
        assertTrue(recursiveEquals(term3549070, term3549566));
        assertTrue(recursiveEquals(term3549156, term3549567));
        assertTrue(recursiveEquals(retValue, term3549474));
    }

};


