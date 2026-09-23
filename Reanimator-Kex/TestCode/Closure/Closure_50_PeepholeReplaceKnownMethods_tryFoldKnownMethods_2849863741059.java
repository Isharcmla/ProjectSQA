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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4492969;
     Object term4493061;
     Object term4494548;
     Object term4494549;
     Object term4494245;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4492969 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4493061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4493153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4493245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4493337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4493465 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term4493153, term4493153.getClass(), "type", 35);
        setIntField(term4493337, term4493337.getClass(), "type", 40);
        setField(term4493337, term4493337.getClass(), "str", "charAt");
        setField(term4493245, term4493245.getClass(), "next", term4493337);
        setIntField(term4493245, term4493245.getClass(), "type", 40);
        setField(term4493153, term4493153.getClass(), "first", term4493245);
        setIntField(term4493465, term4493465.getClass(), "type", 41);
        setField(term4493153, term4493153.getClass(), "next", term4493465);
        setField(term4493061, term4493061.getClass(), "first", term4493153);
        setIntField(term4493061, term4493061.getClass(), "type", 37);
        term4494548 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4494548, term4494548.getClass(), "currentTraversal", null);
        term4494549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494551 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term4494552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494553 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4494549, term4494549.getClass(), "str", null);
        setIntField(term4494549, term4494549.getClass(), "type", 37);
        setField(term4494549, term4494549.getClass(), "next", null);
        setField(term4494550, term4494550.getClass(), "str", null);
        setIntField(term4494550, term4494550.getClass(), "type", 35);
        setIntField(term4494551, term4494551.getClass(), "encodedSourceStart", 0);
        setIntField(term4494551, term4494551.getClass(), "encodedSourceEnd", 0);
        setField(term4494551, term4494551.getClass(), "sourceName", null);
        setIntField(term4494551, term4494551.getClass(), "baseLineno", 0);
        setIntField(term4494551, term4494551.getClass(), "endLineno", 0);
        setField(term4494551, term4494551.getClass(), "functions", null);
        setField(term4494551, term4494551.getClass(), "regexps", null);
        setField(term4494551, term4494551.getClass(), "itsVariables", null);
        setField(term4494551, term4494551.getClass(), "itsConst", null);
        setField(term4494551, term4494551.getClass(), "itsVariableNames", null);
        setIntField(term4494551, term4494551.getClass(), "varStart", 0);
        setField(term4494551, term4494551.getClass(), "compilerData", null);
        setIntField(term4494551, term4494551.getClass(), "type", 41);
        setField(term4494551, term4494551.getClass(), "next", null);
        setField(term4494551, term4494551.getClass(), "first", null);
        setField(term4494551, term4494551.getClass(), "last", null);
        setField(term4494551, term4494551.getClass(), "propListHead", null);
        setIntField(term4494551, term4494551.getClass(), "sourcePosition", 0);
        setField(term4494551, term4494551.getClass(), "jsType", null);
        setField(term4494551, term4494551.getClass(), "parent", null);
        setField(term4494550, term4494550.getClass(), "next", term4494551);
        setField(term4494552, term4494552.getClass(), "str", null);
        setIntField(term4494552, term4494552.getClass(), "type", 40);
        setField(term4494553, term4494553.getClass(), "str", "");
        setIntField(term4494553, term4494553.getClass(), "type", 40);
        setField(term4494553, term4494553.getClass(), "next", null);
        setField(term4494553, term4494553.getClass(), "first", null);
        setField(term4494553, term4494553.getClass(), "last", null);
        setField(term4494553, term4494553.getClass(), "propListHead", null);
        setIntField(term4494553, term4494553.getClass(), "sourcePosition", 0);
        setField(term4494553, term4494553.getClass(), "jsType", null);
        setField(term4494553, term4494553.getClass(), "parent", null);
        setField(term4494552, term4494552.getClass(), "next", term4494553);
        setField(term4494552, term4494552.getClass(), "first", null);
        setField(term4494552, term4494552.getClass(), "last", null);
        setField(term4494552, term4494552.getClass(), "propListHead", null);
        setIntField(term4494552, term4494552.getClass(), "sourcePosition", 0);
        setField(term4494552, term4494552.getClass(), "jsType", null);
        setField(term4494552, term4494552.getClass(), "parent", null);
        setField(term4494550, term4494550.getClass(), "first", term4494552);
        setField(term4494550, term4494550.getClass(), "last", null);
        setField(term4494550, term4494550.getClass(), "propListHead", null);
        setIntField(term4494550, term4494550.getClass(), "sourcePosition", 0);
        setField(term4494550, term4494550.getClass(), "jsType", null);
        setField(term4494550, term4494550.getClass(), "parent", null);
        setField(term4494549, term4494549.getClass(), "first", term4494550);
        setField(term4494549, term4494549.getClass(), "last", null);
        setField(term4494549, term4494549.getClass(), "propListHead", null);
        setIntField(term4494549, term4494549.getClass(), "sourcePosition", 0);
        setField(term4494549, term4494549.getClass(), "jsType", null);
        setField(term4494549, term4494549.getClass(), "parent", null);
        term4494245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494247 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494249 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term4494257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4494259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4494245, term4494245.getClass(), "str", null);
        setIntField(term4494245, term4494245.getClass(), "type", 37);
        setField(term4494245, term4494245.getClass(), "next", null);
        setField(term4494247, term4494247.getClass(), "str", null);
        setIntField(term4494247, term4494247.getClass(), "type", 35);
        setIntField(term4494249, term4494249.getClass(), "encodedSourceStart", 0);
        setIntField(term4494249, term4494249.getClass(), "encodedSourceEnd", 0);
        setField(term4494249, term4494249.getClass(), "sourceName", null);
        setIntField(term4494249, term4494249.getClass(), "baseLineno", 0);
        setIntField(term4494249, term4494249.getClass(), "endLineno", 0);
        setField(term4494249, term4494249.getClass(), "functions", null);
        setField(term4494249, term4494249.getClass(), "regexps", null);
        setField(term4494249, term4494249.getClass(), "itsVariables", null);
        setField(term4494249, term4494249.getClass(), "itsConst", null);
        setField(term4494249, term4494249.getClass(), "itsVariableNames", null);
        setIntField(term4494249, term4494249.getClass(), "varStart", 0);
        setField(term4494249, term4494249.getClass(), "compilerData", null);
        setIntField(term4494249, term4494249.getClass(), "type", 41);
        setField(term4494249, term4494249.getClass(), "next", null);
        setField(term4494249, term4494249.getClass(), "first", null);
        setField(term4494249, term4494249.getClass(), "last", null);
        setField(term4494249, term4494249.getClass(), "propListHead", null);
        setIntField(term4494249, term4494249.getClass(), "sourcePosition", 0);
        setField(term4494249, term4494249.getClass(), "jsType", null);
        setField(term4494249, term4494249.getClass(), "parent", null);
        setField(term4494247, term4494247.getClass(), "next", term4494249);
        setField(term4494257, term4494257.getClass(), "str", null);
        setIntField(term4494257, term4494257.getClass(), "type", 40);
        setField(term4494259, term4494259.getClass(), "str", "");
        setIntField(term4494259, term4494259.getClass(), "type", 40);
        setField(term4494259, term4494259.getClass(), "next", null);
        setField(term4494259, term4494259.getClass(), "first", null);
        setField(term4494259, term4494259.getClass(), "last", null);
        setField(term4494259, term4494259.getClass(), "propListHead", null);
        setIntField(term4494259, term4494259.getClass(), "sourcePosition", 0);
        setField(term4494259, term4494259.getClass(), "jsType", null);
        setField(term4494259, term4494259.getClass(), "parent", null);
        setField(term4494257, term4494257.getClass(), "next", term4494259);
        setField(term4494257, term4494257.getClass(), "first", null);
        setField(term4494257, term4494257.getClass(), "last", null);
        setField(term4494257, term4494257.getClass(), "propListHead", null);
        setIntField(term4494257, term4494257.getClass(), "sourcePosition", 0);
        setField(term4494257, term4494257.getClass(), "jsType", null);
        setField(term4494257, term4494257.getClass(), "parent", null);
        setField(term4494247, term4494247.getClass(), "first", term4494257);
        setField(term4494247, term4494247.getClass(), "last", null);
        setField(term4494247, term4494247.getClass(), "propListHead", null);
        setIntField(term4494247, term4494247.getClass(), "sourcePosition", 0);
        setField(term4494247, term4494247.getClass(), "jsType", null);
        setField(term4494247, term4494247.getClass(), "parent", null);
        setField(term4494245, term4494245.getClass(), "first", term4494247);
        setField(term4494245, term4494245.getClass(), "last", null);
        setField(term4494245, term4494245.getClass(), "propListHead", null);
        setIntField(term4494245, term4494245.getClass(), "sourcePosition", 0);
        setField(term4494245, term4494245.getClass(), "jsType", null);
        setField(term4494245, term4494245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4493061;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4492969, args);
        assertTrue(recursiveEquals(term4492969, term4494548));
        assertTrue(recursiveEquals(term4493061, term4494549));
        assertTrue(recursiveEquals(retValue, term4494245));
    }

};


