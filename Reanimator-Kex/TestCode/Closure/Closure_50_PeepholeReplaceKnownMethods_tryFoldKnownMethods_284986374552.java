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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517462;
     Object term3517554;
     Object term3520143;
     Object term3520144;
     Object term3519787;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3517462 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3517554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3517646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3517738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3517830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3517954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3517646, term3517646.getClass(), "type", 35);
        setIntField(term3517830, term3517830.getClass(), "type", 40);
        setField(term3517830, term3517830.getClass(), "str", "substring");
        setField(term3517738, term3517738.getClass(), "next", term3517830);
        setIntField(term3517738, term3517738.getClass(), "type", 40);
        setField(term3517646, term3517646.getClass(), "first", term3517738);
        setIntField(term3517954, term3517954.getClass(), "type", 41);
        setField(term3517646, term3517646.getClass(), "next", term3517954);
        setField(term3517554, term3517554.getClass(), "first", term3517646);
        setIntField(term3517554, term3517554.getClass(), "type", 37);
        term3520143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3520143, term3520143.getClass(), "currentTraversal", null);
        term3520144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3520147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3520144, term3520144.getClass(), "str", null);
        setIntField(term3520144, term3520144.getClass(), "type", 37);
        setField(term3520144, term3520144.getClass(), "next", null);
        setField(term3520145, term3520145.getClass(), "str", null);
        setIntField(term3520145, term3520145.getClass(), "type", 35);
        setField(term3520146, term3520146.getClass(), "functionName", null);
        setBooleanField(term3520146, term3520146.getClass(), "itsNeedsActivation", false);
        setIntField(term3520146, term3520146.getClass(), "itsFunctionType", 0);
        setBooleanField(term3520146, term3520146.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3520146, term3520146.getClass(), "encodedSourceStart", 0);
        setIntField(term3520146, term3520146.getClass(), "encodedSourceEnd", 0);
        setField(term3520146, term3520146.getClass(), "sourceName", null);
        setIntField(term3520146, term3520146.getClass(), "baseLineno", 0);
        setIntField(term3520146, term3520146.getClass(), "endLineno", 0);
        setField(term3520146, term3520146.getClass(), "functions", null);
        setField(term3520146, term3520146.getClass(), "regexps", null);
        setField(term3520146, term3520146.getClass(), "itsVariables", null);
        setField(term3520146, term3520146.getClass(), "itsConst", null);
        setField(term3520146, term3520146.getClass(), "itsVariableNames", null);
        setIntField(term3520146, term3520146.getClass(), "varStart", 0);
        setField(term3520146, term3520146.getClass(), "compilerData", null);
        setIntField(term3520146, term3520146.getClass(), "type", 41);
        setField(term3520146, term3520146.getClass(), "next", null);
        setField(term3520146, term3520146.getClass(), "first", null);
        setField(term3520146, term3520146.getClass(), "last", null);
        setField(term3520146, term3520146.getClass(), "propListHead", null);
        setIntField(term3520146, term3520146.getClass(), "sourcePosition", 0);
        setField(term3520146, term3520146.getClass(), "jsType", null);
        setField(term3520146, term3520146.getClass(), "parent", null);
        setField(term3520145, term3520145.getClass(), "next", term3520146);
        setField(term3520147, term3520147.getClass(), "str", null);
        setIntField(term3520147, term3520147.getClass(), "type", 40);
        setField(term3520148, term3520148.getClass(), "str", "");
        setIntField(term3520148, term3520148.getClass(), "type", 40);
        setField(term3520148, term3520148.getClass(), "next", null);
        setField(term3520148, term3520148.getClass(), "first", null);
        setField(term3520148, term3520148.getClass(), "last", null);
        setField(term3520148, term3520148.getClass(), "propListHead", null);
        setIntField(term3520148, term3520148.getClass(), "sourcePosition", 0);
        setField(term3520148, term3520148.getClass(), "jsType", null);
        setField(term3520148, term3520148.getClass(), "parent", null);
        setField(term3520147, term3520147.getClass(), "next", term3520148);
        setField(term3520147, term3520147.getClass(), "first", null);
        setField(term3520147, term3520147.getClass(), "last", null);
        setField(term3520147, term3520147.getClass(), "propListHead", null);
        setIntField(term3520147, term3520147.getClass(), "sourcePosition", 0);
        setField(term3520147, term3520147.getClass(), "jsType", null);
        setField(term3520147, term3520147.getClass(), "parent", null);
        setField(term3520145, term3520145.getClass(), "first", term3520147);
        setField(term3520145, term3520145.getClass(), "last", null);
        setField(term3520145, term3520145.getClass(), "propListHead", null);
        setIntField(term3520145, term3520145.getClass(), "sourcePosition", 0);
        setField(term3520145, term3520145.getClass(), "jsType", null);
        setField(term3520145, term3520145.getClass(), "parent", null);
        setField(term3520144, term3520144.getClass(), "first", term3520145);
        setField(term3520144, term3520144.getClass(), "last", null);
        setField(term3520144, term3520144.getClass(), "propListHead", null);
        setIntField(term3520144, term3520144.getClass(), "sourcePosition", 0);
        setField(term3520144, term3520144.getClass(), "jsType", null);
        setField(term3520144, term3520144.getClass(), "parent", null);
        term3519787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3519802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3519787, term3519787.getClass(), "str", null);
        setIntField(term3519787, term3519787.getClass(), "type", 37);
        setField(term3519787, term3519787.getClass(), "next", null);
        setField(term3519789, term3519789.getClass(), "str", null);
        setIntField(term3519789, term3519789.getClass(), "type", 35);
        setField(term3519791, term3519791.getClass(), "functionName", null);
        setBooleanField(term3519791, term3519791.getClass(), "itsNeedsActivation", false);
        setIntField(term3519791, term3519791.getClass(), "itsFunctionType", 0);
        setBooleanField(term3519791, term3519791.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3519791, term3519791.getClass(), "encodedSourceStart", 0);
        setIntField(term3519791, term3519791.getClass(), "encodedSourceEnd", 0);
        setField(term3519791, term3519791.getClass(), "sourceName", null);
        setIntField(term3519791, term3519791.getClass(), "baseLineno", 0);
        setIntField(term3519791, term3519791.getClass(), "endLineno", 0);
        setField(term3519791, term3519791.getClass(), "functions", null);
        setField(term3519791, term3519791.getClass(), "regexps", null);
        setField(term3519791, term3519791.getClass(), "itsVariables", null);
        setField(term3519791, term3519791.getClass(), "itsConst", null);
        setField(term3519791, term3519791.getClass(), "itsVariableNames", null);
        setIntField(term3519791, term3519791.getClass(), "varStart", 0);
        setField(term3519791, term3519791.getClass(), "compilerData", null);
        setIntField(term3519791, term3519791.getClass(), "type", 41);
        setField(term3519791, term3519791.getClass(), "next", null);
        setField(term3519791, term3519791.getClass(), "first", null);
        setField(term3519791, term3519791.getClass(), "last", null);
        setField(term3519791, term3519791.getClass(), "propListHead", null);
        setIntField(term3519791, term3519791.getClass(), "sourcePosition", 0);
        setField(term3519791, term3519791.getClass(), "jsType", null);
        setField(term3519791, term3519791.getClass(), "parent", null);
        setField(term3519789, term3519789.getClass(), "next", term3519791);
        setField(term3519802, term3519802.getClass(), "str", null);
        setIntField(term3519802, term3519802.getClass(), "type", 40);
        setField(term3519804, term3519804.getClass(), "str", "");
        setIntField(term3519804, term3519804.getClass(), "type", 40);
        setField(term3519804, term3519804.getClass(), "next", null);
        setField(term3519804, term3519804.getClass(), "first", null);
        setField(term3519804, term3519804.getClass(), "last", null);
        setField(term3519804, term3519804.getClass(), "propListHead", null);
        setIntField(term3519804, term3519804.getClass(), "sourcePosition", 0);
        setField(term3519804, term3519804.getClass(), "jsType", null);
        setField(term3519804, term3519804.getClass(), "parent", null);
        setField(term3519802, term3519802.getClass(), "next", term3519804);
        setField(term3519802, term3519802.getClass(), "first", null);
        setField(term3519802, term3519802.getClass(), "last", null);
        setField(term3519802, term3519802.getClass(), "propListHead", null);
        setIntField(term3519802, term3519802.getClass(), "sourcePosition", 0);
        setField(term3519802, term3519802.getClass(), "jsType", null);
        setField(term3519802, term3519802.getClass(), "parent", null);
        setField(term3519789, term3519789.getClass(), "first", term3519802);
        setField(term3519789, term3519789.getClass(), "last", null);
        setField(term3519789, term3519789.getClass(), "propListHead", null);
        setIntField(term3519789, term3519789.getClass(), "sourcePosition", 0);
        setField(term3519789, term3519789.getClass(), "jsType", null);
        setField(term3519789, term3519789.getClass(), "parent", null);
        setField(term3519787, term3519787.getClass(), "first", term3519789);
        setField(term3519787, term3519787.getClass(), "last", null);
        setField(term3519787, term3519787.getClass(), "propListHead", null);
        setIntField(term3519787, term3519787.getClass(), "sourcePosition", 0);
        setField(term3519787, term3519787.getClass(), "jsType", null);
        setField(term3519787, term3519787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3517554;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3517462, args);
        assertTrue(recursiveEquals(term3517462, term3520143));
        assertTrue(recursiveEquals(term3517554, term3520144));
        assertTrue(recursiveEquals(retValue, term3519787));
    }

};


