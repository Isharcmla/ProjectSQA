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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4206873;
     Object term4206965;
     Object term4208604;
     Object term4208605;
     Object term4208301;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4206873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4206965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4207057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4207149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4207241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4207369 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term4207057, term4207057.getClass(), "type", 35);
        setIntField(term4207241, term4207241.getClass(), "type", 40);
        setField(term4207241, term4207241.getClass(), "str", "charAt");
        setField(term4207149, term4207149.getClass(), "next", term4207241);
        setIntField(term4207149, term4207149.getClass(), "type", 40);
        setField(term4207057, term4207057.getClass(), "first", term4207149);
        setIntField(term4207369, term4207369.getClass(), "type", 43);
        setField(term4207057, term4207057.getClass(), "next", term4207369);
        setField(term4206965, term4206965.getClass(), "first", term4207057);
        setIntField(term4206965, term4206965.getClass(), "type", 37);
        term4208604 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4208604, term4208604.getClass(), "currentTraversal", null);
        term4208605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208607 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term4208608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4208605, term4208605.getClass(), "str", null);
        setIntField(term4208605, term4208605.getClass(), "type", 37);
        setField(term4208605, term4208605.getClass(), "next", null);
        setField(term4208606, term4208606.getClass(), "str", null);
        setIntField(term4208606, term4208606.getClass(), "type", 35);
        setIntField(term4208607, term4208607.getClass(), "encodedSourceStart", 0);
        setIntField(term4208607, term4208607.getClass(), "encodedSourceEnd", 0);
        setField(term4208607, term4208607.getClass(), "sourceName", null);
        setIntField(term4208607, term4208607.getClass(), "baseLineno", 0);
        setIntField(term4208607, term4208607.getClass(), "endLineno", 0);
        setField(term4208607, term4208607.getClass(), "functions", null);
        setField(term4208607, term4208607.getClass(), "regexps", null);
        setField(term4208607, term4208607.getClass(), "itsVariables", null);
        setField(term4208607, term4208607.getClass(), "itsConst", null);
        setField(term4208607, term4208607.getClass(), "itsVariableNames", null);
        setIntField(term4208607, term4208607.getClass(), "varStart", 0);
        setField(term4208607, term4208607.getClass(), "compilerData", null);
        setIntField(term4208607, term4208607.getClass(), "type", 43);
        setField(term4208607, term4208607.getClass(), "next", null);
        setField(term4208607, term4208607.getClass(), "first", null);
        setField(term4208607, term4208607.getClass(), "last", null);
        setField(term4208607, term4208607.getClass(), "propListHead", null);
        setIntField(term4208607, term4208607.getClass(), "sourcePosition", 0);
        setField(term4208607, term4208607.getClass(), "jsType", null);
        setField(term4208607, term4208607.getClass(), "parent", null);
        setField(term4208606, term4208606.getClass(), "next", term4208607);
        setField(term4208608, term4208608.getClass(), "str", null);
        setIntField(term4208608, term4208608.getClass(), "type", 40);
        setField(term4208609, term4208609.getClass(), "str", "");
        setIntField(term4208609, term4208609.getClass(), "type", 40);
        setField(term4208609, term4208609.getClass(), "next", null);
        setField(term4208609, term4208609.getClass(), "first", null);
        setField(term4208609, term4208609.getClass(), "last", null);
        setField(term4208609, term4208609.getClass(), "propListHead", null);
        setIntField(term4208609, term4208609.getClass(), "sourcePosition", 0);
        setField(term4208609, term4208609.getClass(), "jsType", null);
        setField(term4208609, term4208609.getClass(), "parent", null);
        setField(term4208608, term4208608.getClass(), "next", term4208609);
        setField(term4208608, term4208608.getClass(), "first", null);
        setField(term4208608, term4208608.getClass(), "last", null);
        setField(term4208608, term4208608.getClass(), "propListHead", null);
        setIntField(term4208608, term4208608.getClass(), "sourcePosition", 0);
        setField(term4208608, term4208608.getClass(), "jsType", null);
        setField(term4208608, term4208608.getClass(), "parent", null);
        setField(term4208606, term4208606.getClass(), "first", term4208608);
        setField(term4208606, term4208606.getClass(), "last", null);
        setField(term4208606, term4208606.getClass(), "propListHead", null);
        setIntField(term4208606, term4208606.getClass(), "sourcePosition", 0);
        setField(term4208606, term4208606.getClass(), "jsType", null);
        setField(term4208606, term4208606.getClass(), "parent", null);
        setField(term4208605, term4208605.getClass(), "first", term4208606);
        setField(term4208605, term4208605.getClass(), "last", null);
        setField(term4208605, term4208605.getClass(), "propListHead", null);
        setIntField(term4208605, term4208605.getClass(), "sourcePosition", 0);
        setField(term4208605, term4208605.getClass(), "jsType", null);
        setField(term4208605, term4208605.getClass(), "parent", null);
        term4208301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208305 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term4208313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4208315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4208301, term4208301.getClass(), "str", null);
        setIntField(term4208301, term4208301.getClass(), "type", 37);
        setField(term4208301, term4208301.getClass(), "next", null);
        setField(term4208303, term4208303.getClass(), "str", null);
        setIntField(term4208303, term4208303.getClass(), "type", 35);
        setIntField(term4208305, term4208305.getClass(), "encodedSourceStart", 0);
        setIntField(term4208305, term4208305.getClass(), "encodedSourceEnd", 0);
        setField(term4208305, term4208305.getClass(), "sourceName", null);
        setIntField(term4208305, term4208305.getClass(), "baseLineno", 0);
        setIntField(term4208305, term4208305.getClass(), "endLineno", 0);
        setField(term4208305, term4208305.getClass(), "functions", null);
        setField(term4208305, term4208305.getClass(), "regexps", null);
        setField(term4208305, term4208305.getClass(), "itsVariables", null);
        setField(term4208305, term4208305.getClass(), "itsConst", null);
        setField(term4208305, term4208305.getClass(), "itsVariableNames", null);
        setIntField(term4208305, term4208305.getClass(), "varStart", 0);
        setField(term4208305, term4208305.getClass(), "compilerData", null);
        setIntField(term4208305, term4208305.getClass(), "type", 43);
        setField(term4208305, term4208305.getClass(), "next", null);
        setField(term4208305, term4208305.getClass(), "first", null);
        setField(term4208305, term4208305.getClass(), "last", null);
        setField(term4208305, term4208305.getClass(), "propListHead", null);
        setIntField(term4208305, term4208305.getClass(), "sourcePosition", 0);
        setField(term4208305, term4208305.getClass(), "jsType", null);
        setField(term4208305, term4208305.getClass(), "parent", null);
        setField(term4208303, term4208303.getClass(), "next", term4208305);
        setField(term4208313, term4208313.getClass(), "str", null);
        setIntField(term4208313, term4208313.getClass(), "type", 40);
        setField(term4208315, term4208315.getClass(), "str", "");
        setIntField(term4208315, term4208315.getClass(), "type", 40);
        setField(term4208315, term4208315.getClass(), "next", null);
        setField(term4208315, term4208315.getClass(), "first", null);
        setField(term4208315, term4208315.getClass(), "last", null);
        setField(term4208315, term4208315.getClass(), "propListHead", null);
        setIntField(term4208315, term4208315.getClass(), "sourcePosition", 0);
        setField(term4208315, term4208315.getClass(), "jsType", null);
        setField(term4208315, term4208315.getClass(), "parent", null);
        setField(term4208313, term4208313.getClass(), "next", term4208315);
        setField(term4208313, term4208313.getClass(), "first", null);
        setField(term4208313, term4208313.getClass(), "last", null);
        setField(term4208313, term4208313.getClass(), "propListHead", null);
        setIntField(term4208313, term4208313.getClass(), "sourcePosition", 0);
        setField(term4208313, term4208313.getClass(), "jsType", null);
        setField(term4208313, term4208313.getClass(), "parent", null);
        setField(term4208303, term4208303.getClass(), "first", term4208313);
        setField(term4208303, term4208303.getClass(), "last", null);
        setField(term4208303, term4208303.getClass(), "propListHead", null);
        setIntField(term4208303, term4208303.getClass(), "sourcePosition", 0);
        setField(term4208303, term4208303.getClass(), "jsType", null);
        setField(term4208303, term4208303.getClass(), "parent", null);
        setField(term4208301, term4208301.getClass(), "first", term4208303);
        setField(term4208301, term4208301.getClass(), "last", null);
        setField(term4208301, term4208301.getClass(), "propListHead", null);
        setIntField(term4208301, term4208301.getClass(), "sourcePosition", 0);
        setField(term4208301, term4208301.getClass(), "jsType", null);
        setField(term4208301, term4208301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4206965;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4206873, args);
        assertTrue(recursiveEquals(term4206873, term4208604));
        assertTrue(recursiveEquals(term4206965, term4208605));
        assertTrue(recursiveEquals(retValue, term4208301));
    }

};


