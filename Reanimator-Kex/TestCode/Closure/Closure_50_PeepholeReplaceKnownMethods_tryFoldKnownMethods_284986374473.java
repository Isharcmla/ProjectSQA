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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462778;
     Object term3462870;
     Object term3467204;
     Object term3467205;
     Object term3466970;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3462778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3462870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3462962 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463274 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3462962, term3462962.getClass(), "type", 35);
        setIntField(term3463146, term3463146.getClass(), "type", 40);
        setField(term3463146, term3463146.getClass(), "str", "");
        setField(term3463054, term3463054.getClass(), "next", term3463146);
        setIntField(term3463054, term3463054.getClass(), "type", 40);
        setField(term3462962, term3462962.getClass(), "first", term3463054);
        setIntField(term3463274, term3463274.getClass(), "type", 39);
        setField(term3462962, term3462962.getClass(), "next", term3463274);
        setField(term3462870, term3462870.getClass(), "first", term3462962);
        setIntField(term3462870, term3462870.getClass(), "type", 37);
        term3467204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3467204, term3467204.getClass(), "currentTraversal", null);
        term3467205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467207 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3467208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3467205, term3467205.getClass(), "str", null);
        setIntField(term3467205, term3467205.getClass(), "type", 37);
        setField(term3467205, term3467205.getClass(), "next", null);
        setField(term3467206, term3467206.getClass(), "str", null);
        setIntField(term3467206, term3467206.getClass(), "type", 35);
        setIntField(term3467207, term3467207.getClass(), "encodedSourceStart", 0);
        setIntField(term3467207, term3467207.getClass(), "encodedSourceEnd", 0);
        setField(term3467207, term3467207.getClass(), "sourceName", null);
        setIntField(term3467207, term3467207.getClass(), "baseLineno", 0);
        setIntField(term3467207, term3467207.getClass(), "endLineno", 0);
        setField(term3467207, term3467207.getClass(), "functions", null);
        setField(term3467207, term3467207.getClass(), "regexps", null);
        setField(term3467207, term3467207.getClass(), "itsVariables", null);
        setField(term3467207, term3467207.getClass(), "itsConst", null);
        setField(term3467207, term3467207.getClass(), "itsVariableNames", null);
        setIntField(term3467207, term3467207.getClass(), "varStart", 0);
        setField(term3467207, term3467207.getClass(), "compilerData", null);
        setIntField(term3467207, term3467207.getClass(), "type", 39);
        setField(term3467207, term3467207.getClass(), "next", null);
        setField(term3467207, term3467207.getClass(), "first", null);
        setField(term3467207, term3467207.getClass(), "last", null);
        setField(term3467207, term3467207.getClass(), "propListHead", null);
        setIntField(term3467207, term3467207.getClass(), "sourcePosition", 0);
        setField(term3467207, term3467207.getClass(), "jsType", null);
        setField(term3467207, term3467207.getClass(), "parent", null);
        setField(term3467206, term3467206.getClass(), "next", term3467207);
        setField(term3467208, term3467208.getClass(), "str", null);
        setIntField(term3467208, term3467208.getClass(), "type", 40);
        setField(term3467209, term3467209.getClass(), "str", "");
        setIntField(term3467209, term3467209.getClass(), "type", 40);
        setField(term3467209, term3467209.getClass(), "next", null);
        setField(term3467209, term3467209.getClass(), "first", null);
        setField(term3467209, term3467209.getClass(), "last", null);
        setField(term3467209, term3467209.getClass(), "propListHead", null);
        setIntField(term3467209, term3467209.getClass(), "sourcePosition", 0);
        setField(term3467209, term3467209.getClass(), "jsType", null);
        setField(term3467209, term3467209.getClass(), "parent", null);
        setField(term3467208, term3467208.getClass(), "next", term3467209);
        setField(term3467208, term3467208.getClass(), "first", null);
        setField(term3467208, term3467208.getClass(), "last", null);
        setField(term3467208, term3467208.getClass(), "propListHead", null);
        setIntField(term3467208, term3467208.getClass(), "sourcePosition", 0);
        setField(term3467208, term3467208.getClass(), "jsType", null);
        setField(term3467208, term3467208.getClass(), "parent", null);
        setField(term3467206, term3467206.getClass(), "first", term3467208);
        setField(term3467206, term3467206.getClass(), "last", null);
        setField(term3467206, term3467206.getClass(), "propListHead", null);
        setIntField(term3467206, term3467206.getClass(), "sourcePosition", 0);
        setField(term3467206, term3467206.getClass(), "jsType", null);
        setField(term3467206, term3467206.getClass(), "parent", null);
        setField(term3467205, term3467205.getClass(), "first", term3467206);
        setField(term3467205, term3467205.getClass(), "last", null);
        setField(term3467205, term3467205.getClass(), "propListHead", null);
        setIntField(term3467205, term3467205.getClass(), "sourcePosition", 0);
        setField(term3467205, term3467205.getClass(), "jsType", null);
        setField(term3467205, term3467205.getClass(), "parent", null);
        term3466970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3466972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3466974 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3466982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3466984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3466970, term3466970.getClass(), "str", null);
        setIntField(term3466970, term3466970.getClass(), "type", 37);
        setField(term3466970, term3466970.getClass(), "next", null);
        setField(term3466972, term3466972.getClass(), "str", null);
        setIntField(term3466972, term3466972.getClass(), "type", 35);
        setIntField(term3466974, term3466974.getClass(), "encodedSourceStart", 0);
        setIntField(term3466974, term3466974.getClass(), "encodedSourceEnd", 0);
        setField(term3466974, term3466974.getClass(), "sourceName", null);
        setIntField(term3466974, term3466974.getClass(), "baseLineno", 0);
        setIntField(term3466974, term3466974.getClass(), "endLineno", 0);
        setField(term3466974, term3466974.getClass(), "functions", null);
        setField(term3466974, term3466974.getClass(), "regexps", null);
        setField(term3466974, term3466974.getClass(), "itsVariables", null);
        setField(term3466974, term3466974.getClass(), "itsConst", null);
        setField(term3466974, term3466974.getClass(), "itsVariableNames", null);
        setIntField(term3466974, term3466974.getClass(), "varStart", 0);
        setField(term3466974, term3466974.getClass(), "compilerData", null);
        setIntField(term3466974, term3466974.getClass(), "type", 39);
        setField(term3466974, term3466974.getClass(), "next", null);
        setField(term3466974, term3466974.getClass(), "first", null);
        setField(term3466974, term3466974.getClass(), "last", null);
        setField(term3466974, term3466974.getClass(), "propListHead", null);
        setIntField(term3466974, term3466974.getClass(), "sourcePosition", 0);
        setField(term3466974, term3466974.getClass(), "jsType", null);
        setField(term3466974, term3466974.getClass(), "parent", null);
        setField(term3466972, term3466972.getClass(), "next", term3466974);
        setField(term3466982, term3466982.getClass(), "str", null);
        setIntField(term3466982, term3466982.getClass(), "type", 40);
        setField(term3466984, term3466984.getClass(), "str", "");
        setIntField(term3466984, term3466984.getClass(), "type", 40);
        setField(term3466984, term3466984.getClass(), "next", null);
        setField(term3466984, term3466984.getClass(), "first", null);
        setField(term3466984, term3466984.getClass(), "last", null);
        setField(term3466984, term3466984.getClass(), "propListHead", null);
        setIntField(term3466984, term3466984.getClass(), "sourcePosition", 0);
        setField(term3466984, term3466984.getClass(), "jsType", null);
        setField(term3466984, term3466984.getClass(), "parent", null);
        setField(term3466982, term3466982.getClass(), "next", term3466984);
        setField(term3466982, term3466982.getClass(), "first", null);
        setField(term3466982, term3466982.getClass(), "last", null);
        setField(term3466982, term3466982.getClass(), "propListHead", null);
        setIntField(term3466982, term3466982.getClass(), "sourcePosition", 0);
        setField(term3466982, term3466982.getClass(), "jsType", null);
        setField(term3466982, term3466982.getClass(), "parent", null);
        setField(term3466972, term3466972.getClass(), "first", term3466982);
        setField(term3466972, term3466972.getClass(), "last", null);
        setField(term3466972, term3466972.getClass(), "propListHead", null);
        setIntField(term3466972, term3466972.getClass(), "sourcePosition", 0);
        setField(term3466972, term3466972.getClass(), "jsType", null);
        setField(term3466972, term3466972.getClass(), "parent", null);
        setField(term3466970, term3466970.getClass(), "first", term3466972);
        setField(term3466970, term3466970.getClass(), "last", null);
        setField(term3466970, term3466970.getClass(), "propListHead", null);
        setIntField(term3466970, term3466970.getClass(), "sourcePosition", 0);
        setField(term3466970, term3466970.getClass(), "jsType", null);
        setField(term3466970, term3466970.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3462870;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3462778, args);
        assertTrue(recursiveEquals(term3462778, term3467204));
        assertTrue(recursiveEquals(term3462870, term3467205));
        assertTrue(recursiveEquals(retValue, term3466970));
    }

};


