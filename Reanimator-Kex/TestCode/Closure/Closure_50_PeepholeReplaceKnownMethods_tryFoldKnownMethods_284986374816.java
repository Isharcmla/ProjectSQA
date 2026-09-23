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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3692075;
     Object term3692167;
     Object term3693422;
     Object term3693423;
     Object term3693092;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3692075 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3692167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3692259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3692351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3692443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3692567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3692259, term3692259.getClass(), "type", 35);
        setIntField(term3692443, term3692443.getClass(), "type", 40);
        setField(term3692443, term3692443.getClass(), "str", "charAt");
        setField(term3692351, term3692351.getClass(), "next", term3692443);
        setIntField(term3692351, term3692351.getClass(), "type", 40);
        setField(term3692259, term3692259.getClass(), "first", term3692351);
        setIntField(term3692567, term3692567.getClass(), "type", 43);
        setField(term3692259, term3692259.getClass(), "next", term3692567);
        setField(term3692167, term3692167.getClass(), "first", term3692259);
        setIntField(term3692167, term3692167.getClass(), "type", 37);
        term3693422 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3693422, term3693422.getClass(), "currentTraversal", null);
        term3693423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3693426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3693423, term3693423.getClass(), "str", null);
        setIntField(term3693423, term3693423.getClass(), "type", 37);
        setField(term3693423, term3693423.getClass(), "next", null);
        setField(term3693424, term3693424.getClass(), "str", null);
        setIntField(term3693424, term3693424.getClass(), "type", 35);
        setField(term3693425, term3693425.getClass(), "functionName", null);
        setBooleanField(term3693425, term3693425.getClass(), "itsNeedsActivation", false);
        setIntField(term3693425, term3693425.getClass(), "itsFunctionType", 0);
        setBooleanField(term3693425, term3693425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3693425, term3693425.getClass(), "encodedSourceStart", 0);
        setIntField(term3693425, term3693425.getClass(), "encodedSourceEnd", 0);
        setField(term3693425, term3693425.getClass(), "sourceName", null);
        setIntField(term3693425, term3693425.getClass(), "baseLineno", 0);
        setIntField(term3693425, term3693425.getClass(), "endLineno", 0);
        setField(term3693425, term3693425.getClass(), "functions", null);
        setField(term3693425, term3693425.getClass(), "regexps", null);
        setField(term3693425, term3693425.getClass(), "itsVariables", null);
        setField(term3693425, term3693425.getClass(), "itsConst", null);
        setField(term3693425, term3693425.getClass(), "itsVariableNames", null);
        setIntField(term3693425, term3693425.getClass(), "varStart", 0);
        setField(term3693425, term3693425.getClass(), "compilerData", null);
        setIntField(term3693425, term3693425.getClass(), "type", 43);
        setField(term3693425, term3693425.getClass(), "next", null);
        setField(term3693425, term3693425.getClass(), "first", null);
        setField(term3693425, term3693425.getClass(), "last", null);
        setField(term3693425, term3693425.getClass(), "propListHead", null);
        setIntField(term3693425, term3693425.getClass(), "sourcePosition", 0);
        setField(term3693425, term3693425.getClass(), "jsType", null);
        setField(term3693425, term3693425.getClass(), "parent", null);
        setField(term3693424, term3693424.getClass(), "next", term3693425);
        setField(term3693426, term3693426.getClass(), "str", null);
        setIntField(term3693426, term3693426.getClass(), "type", 40);
        setField(term3693427, term3693427.getClass(), "str", "");
        setIntField(term3693427, term3693427.getClass(), "type", 40);
        setField(term3693427, term3693427.getClass(), "next", null);
        setField(term3693427, term3693427.getClass(), "first", null);
        setField(term3693427, term3693427.getClass(), "last", null);
        setField(term3693427, term3693427.getClass(), "propListHead", null);
        setIntField(term3693427, term3693427.getClass(), "sourcePosition", 0);
        setField(term3693427, term3693427.getClass(), "jsType", null);
        setField(term3693427, term3693427.getClass(), "parent", null);
        setField(term3693426, term3693426.getClass(), "next", term3693427);
        setField(term3693426, term3693426.getClass(), "first", null);
        setField(term3693426, term3693426.getClass(), "last", null);
        setField(term3693426, term3693426.getClass(), "propListHead", null);
        setIntField(term3693426, term3693426.getClass(), "sourcePosition", 0);
        setField(term3693426, term3693426.getClass(), "jsType", null);
        setField(term3693426, term3693426.getClass(), "parent", null);
        setField(term3693424, term3693424.getClass(), "first", term3693426);
        setField(term3693424, term3693424.getClass(), "last", null);
        setField(term3693424, term3693424.getClass(), "propListHead", null);
        setIntField(term3693424, term3693424.getClass(), "sourcePosition", 0);
        setField(term3693424, term3693424.getClass(), "jsType", null);
        setField(term3693424, term3693424.getClass(), "parent", null);
        setField(term3693423, term3693423.getClass(), "first", term3693424);
        setField(term3693423, term3693423.getClass(), "last", null);
        setField(term3693423, term3693423.getClass(), "propListHead", null);
        setIntField(term3693423, term3693423.getClass(), "sourcePosition", 0);
        setField(term3693423, term3693423.getClass(), "jsType", null);
        setField(term3693423, term3693423.getClass(), "parent", null);
        term3693092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3693107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3693092, term3693092.getClass(), "str", null);
        setIntField(term3693092, term3693092.getClass(), "type", 37);
        setField(term3693092, term3693092.getClass(), "next", null);
        setField(term3693094, term3693094.getClass(), "str", null);
        setIntField(term3693094, term3693094.getClass(), "type", 35);
        setField(term3693096, term3693096.getClass(), "functionName", null);
        setBooleanField(term3693096, term3693096.getClass(), "itsNeedsActivation", false);
        setIntField(term3693096, term3693096.getClass(), "itsFunctionType", 0);
        setBooleanField(term3693096, term3693096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3693096, term3693096.getClass(), "encodedSourceStart", 0);
        setIntField(term3693096, term3693096.getClass(), "encodedSourceEnd", 0);
        setField(term3693096, term3693096.getClass(), "sourceName", null);
        setIntField(term3693096, term3693096.getClass(), "baseLineno", 0);
        setIntField(term3693096, term3693096.getClass(), "endLineno", 0);
        setField(term3693096, term3693096.getClass(), "functions", null);
        setField(term3693096, term3693096.getClass(), "regexps", null);
        setField(term3693096, term3693096.getClass(), "itsVariables", null);
        setField(term3693096, term3693096.getClass(), "itsConst", null);
        setField(term3693096, term3693096.getClass(), "itsVariableNames", null);
        setIntField(term3693096, term3693096.getClass(), "varStart", 0);
        setField(term3693096, term3693096.getClass(), "compilerData", null);
        setIntField(term3693096, term3693096.getClass(), "type", 43);
        setField(term3693096, term3693096.getClass(), "next", null);
        setField(term3693096, term3693096.getClass(), "first", null);
        setField(term3693096, term3693096.getClass(), "last", null);
        setField(term3693096, term3693096.getClass(), "propListHead", null);
        setIntField(term3693096, term3693096.getClass(), "sourcePosition", 0);
        setField(term3693096, term3693096.getClass(), "jsType", null);
        setField(term3693096, term3693096.getClass(), "parent", null);
        setField(term3693094, term3693094.getClass(), "next", term3693096);
        setField(term3693107, term3693107.getClass(), "str", null);
        setIntField(term3693107, term3693107.getClass(), "type", 40);
        setField(term3693109, term3693109.getClass(), "str", "");
        setIntField(term3693109, term3693109.getClass(), "type", 40);
        setField(term3693109, term3693109.getClass(), "next", null);
        setField(term3693109, term3693109.getClass(), "first", null);
        setField(term3693109, term3693109.getClass(), "last", null);
        setField(term3693109, term3693109.getClass(), "propListHead", null);
        setIntField(term3693109, term3693109.getClass(), "sourcePosition", 0);
        setField(term3693109, term3693109.getClass(), "jsType", null);
        setField(term3693109, term3693109.getClass(), "parent", null);
        setField(term3693107, term3693107.getClass(), "next", term3693109);
        setField(term3693107, term3693107.getClass(), "first", null);
        setField(term3693107, term3693107.getClass(), "last", null);
        setField(term3693107, term3693107.getClass(), "propListHead", null);
        setIntField(term3693107, term3693107.getClass(), "sourcePosition", 0);
        setField(term3693107, term3693107.getClass(), "jsType", null);
        setField(term3693107, term3693107.getClass(), "parent", null);
        setField(term3693094, term3693094.getClass(), "first", term3693107);
        setField(term3693094, term3693094.getClass(), "last", null);
        setField(term3693094, term3693094.getClass(), "propListHead", null);
        setIntField(term3693094, term3693094.getClass(), "sourcePosition", 0);
        setField(term3693094, term3693094.getClass(), "jsType", null);
        setField(term3693094, term3693094.getClass(), "parent", null);
        setField(term3693092, term3693092.getClass(), "first", term3693094);
        setField(term3693092, term3693092.getClass(), "last", null);
        setField(term3693092, term3693092.getClass(), "propListHead", null);
        setIntField(term3693092, term3693092.getClass(), "sourcePosition", 0);
        setField(term3693092, term3693092.getClass(), "jsType", null);
        setField(term3693092, term3693092.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3692167;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3692075, args);
        assertTrue(recursiveEquals(term3692075, term3693422));
        assertTrue(recursiveEquals(term3692167, term3693423));
        assertTrue(recursiveEquals(retValue, term3693092));
    }

};


