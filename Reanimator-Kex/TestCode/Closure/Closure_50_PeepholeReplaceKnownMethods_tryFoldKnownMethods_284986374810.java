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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3688405;
     Object term3688497;
     Object term3689521;
     Object term3689522;
     Object term3689193;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3688405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3688497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688589 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688897 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3688589, term3688589.getClass(), "type", 35);
        setIntField(term3688773, term3688773.getClass(), "type", 40);
        setField(term3688773, term3688773.getClass(), "str", "substr");
        setField(term3688681, term3688681.getClass(), "next", term3688773);
        setIntField(term3688681, term3688681.getClass(), "type", 40);
        setField(term3688589, term3688589.getClass(), "first", term3688681);
        setIntField(term3688897, term3688897.getClass(), "type", 44);
        setField(term3688589, term3688589.getClass(), "next", term3688897);
        setField(term3688497, term3688497.getClass(), "first", term3688589);
        setIntField(term3688497, term3688497.getClass(), "type", 37);
        term3689521 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3689521, term3689521.getClass(), "currentTraversal", null);
        term3689522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689524 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3689525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3689522, term3689522.getClass(), "str", null);
        setIntField(term3689522, term3689522.getClass(), "type", 37);
        setField(term3689522, term3689522.getClass(), "next", null);
        setField(term3689523, term3689523.getClass(), "str", null);
        setIntField(term3689523, term3689523.getClass(), "type", 35);
        setField(term3689524, term3689524.getClass(), "functionName", null);
        setBooleanField(term3689524, term3689524.getClass(), "itsNeedsActivation", false);
        setIntField(term3689524, term3689524.getClass(), "itsFunctionType", 0);
        setBooleanField(term3689524, term3689524.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3689524, term3689524.getClass(), "encodedSourceStart", 0);
        setIntField(term3689524, term3689524.getClass(), "encodedSourceEnd", 0);
        setField(term3689524, term3689524.getClass(), "sourceName", null);
        setIntField(term3689524, term3689524.getClass(), "baseLineno", 0);
        setIntField(term3689524, term3689524.getClass(), "endLineno", 0);
        setField(term3689524, term3689524.getClass(), "functions", null);
        setField(term3689524, term3689524.getClass(), "regexps", null);
        setField(term3689524, term3689524.getClass(), "itsVariables", null);
        setField(term3689524, term3689524.getClass(), "itsConst", null);
        setField(term3689524, term3689524.getClass(), "itsVariableNames", null);
        setIntField(term3689524, term3689524.getClass(), "varStart", 0);
        setField(term3689524, term3689524.getClass(), "compilerData", null);
        setIntField(term3689524, term3689524.getClass(), "type", 44);
        setField(term3689524, term3689524.getClass(), "next", null);
        setField(term3689524, term3689524.getClass(), "first", null);
        setField(term3689524, term3689524.getClass(), "last", null);
        setField(term3689524, term3689524.getClass(), "propListHead", null);
        setIntField(term3689524, term3689524.getClass(), "sourcePosition", 0);
        setField(term3689524, term3689524.getClass(), "jsType", null);
        setField(term3689524, term3689524.getClass(), "parent", null);
        setField(term3689523, term3689523.getClass(), "next", term3689524);
        setField(term3689525, term3689525.getClass(), "str", null);
        setIntField(term3689525, term3689525.getClass(), "type", 40);
        setField(term3689526, term3689526.getClass(), "str", "");
        setIntField(term3689526, term3689526.getClass(), "type", 40);
        setField(term3689526, term3689526.getClass(), "next", null);
        setField(term3689526, term3689526.getClass(), "first", null);
        setField(term3689526, term3689526.getClass(), "last", null);
        setField(term3689526, term3689526.getClass(), "propListHead", null);
        setIntField(term3689526, term3689526.getClass(), "sourcePosition", 0);
        setField(term3689526, term3689526.getClass(), "jsType", null);
        setField(term3689526, term3689526.getClass(), "parent", null);
        setField(term3689525, term3689525.getClass(), "next", term3689526);
        setField(term3689525, term3689525.getClass(), "first", null);
        setField(term3689525, term3689525.getClass(), "last", null);
        setField(term3689525, term3689525.getClass(), "propListHead", null);
        setIntField(term3689525, term3689525.getClass(), "sourcePosition", 0);
        setField(term3689525, term3689525.getClass(), "jsType", null);
        setField(term3689525, term3689525.getClass(), "parent", null);
        setField(term3689523, term3689523.getClass(), "first", term3689525);
        setField(term3689523, term3689523.getClass(), "last", null);
        setField(term3689523, term3689523.getClass(), "propListHead", null);
        setIntField(term3689523, term3689523.getClass(), "sourcePosition", 0);
        setField(term3689523, term3689523.getClass(), "jsType", null);
        setField(term3689523, term3689523.getClass(), "parent", null);
        setField(term3689522, term3689522.getClass(), "first", term3689523);
        setField(term3689522, term3689522.getClass(), "last", null);
        setField(term3689522, term3689522.getClass(), "propListHead", null);
        setIntField(term3689522, term3689522.getClass(), "sourcePosition", 0);
        setField(term3689522, term3689522.getClass(), "jsType", null);
        setField(term3689522, term3689522.getClass(), "parent", null);
        term3689193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3689208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3689193, term3689193.getClass(), "str", null);
        setIntField(term3689193, term3689193.getClass(), "type", 37);
        setField(term3689193, term3689193.getClass(), "next", null);
        setField(term3689195, term3689195.getClass(), "str", null);
        setIntField(term3689195, term3689195.getClass(), "type", 35);
        setField(term3689197, term3689197.getClass(), "functionName", null);
        setBooleanField(term3689197, term3689197.getClass(), "itsNeedsActivation", false);
        setIntField(term3689197, term3689197.getClass(), "itsFunctionType", 0);
        setBooleanField(term3689197, term3689197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3689197, term3689197.getClass(), "encodedSourceStart", 0);
        setIntField(term3689197, term3689197.getClass(), "encodedSourceEnd", 0);
        setField(term3689197, term3689197.getClass(), "sourceName", null);
        setIntField(term3689197, term3689197.getClass(), "baseLineno", 0);
        setIntField(term3689197, term3689197.getClass(), "endLineno", 0);
        setField(term3689197, term3689197.getClass(), "functions", null);
        setField(term3689197, term3689197.getClass(), "regexps", null);
        setField(term3689197, term3689197.getClass(), "itsVariables", null);
        setField(term3689197, term3689197.getClass(), "itsConst", null);
        setField(term3689197, term3689197.getClass(), "itsVariableNames", null);
        setIntField(term3689197, term3689197.getClass(), "varStart", 0);
        setField(term3689197, term3689197.getClass(), "compilerData", null);
        setIntField(term3689197, term3689197.getClass(), "type", 44);
        setField(term3689197, term3689197.getClass(), "next", null);
        setField(term3689197, term3689197.getClass(), "first", null);
        setField(term3689197, term3689197.getClass(), "last", null);
        setField(term3689197, term3689197.getClass(), "propListHead", null);
        setIntField(term3689197, term3689197.getClass(), "sourcePosition", 0);
        setField(term3689197, term3689197.getClass(), "jsType", null);
        setField(term3689197, term3689197.getClass(), "parent", null);
        setField(term3689195, term3689195.getClass(), "next", term3689197);
        setField(term3689208, term3689208.getClass(), "str", null);
        setIntField(term3689208, term3689208.getClass(), "type", 40);
        setField(term3689210, term3689210.getClass(), "str", "");
        setIntField(term3689210, term3689210.getClass(), "type", 40);
        setField(term3689210, term3689210.getClass(), "next", null);
        setField(term3689210, term3689210.getClass(), "first", null);
        setField(term3689210, term3689210.getClass(), "last", null);
        setField(term3689210, term3689210.getClass(), "propListHead", null);
        setIntField(term3689210, term3689210.getClass(), "sourcePosition", 0);
        setField(term3689210, term3689210.getClass(), "jsType", null);
        setField(term3689210, term3689210.getClass(), "parent", null);
        setField(term3689208, term3689208.getClass(), "next", term3689210);
        setField(term3689208, term3689208.getClass(), "first", null);
        setField(term3689208, term3689208.getClass(), "last", null);
        setField(term3689208, term3689208.getClass(), "propListHead", null);
        setIntField(term3689208, term3689208.getClass(), "sourcePosition", 0);
        setField(term3689208, term3689208.getClass(), "jsType", null);
        setField(term3689208, term3689208.getClass(), "parent", null);
        setField(term3689195, term3689195.getClass(), "first", term3689208);
        setField(term3689195, term3689195.getClass(), "last", null);
        setField(term3689195, term3689195.getClass(), "propListHead", null);
        setIntField(term3689195, term3689195.getClass(), "sourcePosition", 0);
        setField(term3689195, term3689195.getClass(), "jsType", null);
        setField(term3689195, term3689195.getClass(), "parent", null);
        setField(term3689193, term3689193.getClass(), "first", term3689195);
        setField(term3689193, term3689193.getClass(), "last", null);
        setField(term3689193, term3689193.getClass(), "propListHead", null);
        setIntField(term3689193, term3689193.getClass(), "sourcePosition", 0);
        setField(term3689193, term3689193.getClass(), "jsType", null);
        setField(term3689193, term3689193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3688497;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3688405, args);
        assertTrue(recursiveEquals(term3688405, term3689521));
        assertTrue(recursiveEquals(term3688497, term3689522));
        assertTrue(recursiveEquals(retValue, term3689193));
    }

};


