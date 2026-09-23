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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33200;
     Object term33290;
     Object term33437;
     Object term33438;
     Object term33394;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term33290 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term33380 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term33290, term33290.getClass(), "type", 37);
        setField(term33290, term33290.getClass(), "first", term33380);
        term33437 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term33437, term33437.getClass(), "currentTraversal", null);
        term33438 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term33439 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term33438, term33438.getClass(), "encodedSourceStart", 0);
        setIntField(term33438, term33438.getClass(), "encodedSourceEnd", 0);
        setField(term33438, term33438.getClass(), "sourceName", null);
        setIntField(term33438, term33438.getClass(), "baseLineno", 0);
        setIntField(term33438, term33438.getClass(), "endLineno", 0);
        setField(term33438, term33438.getClass(), "functions", null);
        setField(term33438, term33438.getClass(), "regexps", null);
        setField(term33438, term33438.getClass(), "itsVariables", null);
        setField(term33438, term33438.getClass(), "itsConst", null);
        setField(term33438, term33438.getClass(), "itsVariableNames", null);
        setIntField(term33438, term33438.getClass(), "varStart", 0);
        setField(term33438, term33438.getClass(), "compilerData", null);
        setIntField(term33438, term33438.getClass(), "type", 37);
        setField(term33438, term33438.getClass(), "next", null);
        setIntField(term33439, term33439.getClass(), "encodedSourceStart", 0);
        setIntField(term33439, term33439.getClass(), "encodedSourceEnd", 0);
        setField(term33439, term33439.getClass(), "sourceName", null);
        setIntField(term33439, term33439.getClass(), "baseLineno", 0);
        setIntField(term33439, term33439.getClass(), "endLineno", 0);
        setField(term33439, term33439.getClass(), "functions", null);
        setField(term33439, term33439.getClass(), "regexps", null);
        setField(term33439, term33439.getClass(), "itsVariables", null);
        setField(term33439, term33439.getClass(), "itsConst", null);
        setField(term33439, term33439.getClass(), "itsVariableNames", null);
        setIntField(term33439, term33439.getClass(), "varStart", 0);
        setField(term33439, term33439.getClass(), "compilerData", null);
        setIntField(term33439, term33439.getClass(), "type", 0);
        setField(term33439, term33439.getClass(), "next", null);
        setField(term33439, term33439.getClass(), "first", null);
        setField(term33439, term33439.getClass(), "last", null);
        setField(term33439, term33439.getClass(), "propListHead", null);
        setIntField(term33439, term33439.getClass(), "sourcePosition", 0);
        setField(term33439, term33439.getClass(), "jsType", null);
        setField(term33439, term33439.getClass(), "parent", null);
        setField(term33438, term33438.getClass(), "first", term33439);
        setField(term33438, term33438.getClass(), "last", null);
        setField(term33438, term33438.getClass(), "propListHead", null);
        setIntField(term33438, term33438.getClass(), "sourcePosition", 0);
        setField(term33438, term33438.getClass(), "jsType", null);
        setField(term33438, term33438.getClass(), "parent", null);
        term33394 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term33401 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term33394, term33394.getClass(), "encodedSourceStart", 0);
        setIntField(term33394, term33394.getClass(), "encodedSourceEnd", 0);
        setField(term33394, term33394.getClass(), "sourceName", null);
        setIntField(term33394, term33394.getClass(), "baseLineno", 0);
        setIntField(term33394, term33394.getClass(), "endLineno", 0);
        setField(term33394, term33394.getClass(), "functions", null);
        setField(term33394, term33394.getClass(), "regexps", null);
        setField(term33394, term33394.getClass(), "itsVariables", null);
        setField(term33394, term33394.getClass(), "itsConst", null);
        setField(term33394, term33394.getClass(), "itsVariableNames", null);
        setIntField(term33394, term33394.getClass(), "varStart", 0);
        setField(term33394, term33394.getClass(), "compilerData", null);
        setIntField(term33394, term33394.getClass(), "type", 37);
        setField(term33394, term33394.getClass(), "next", null);
        setIntField(term33401, term33401.getClass(), "encodedSourceStart", 0);
        setIntField(term33401, term33401.getClass(), "encodedSourceEnd", 0);
        setField(term33401, term33401.getClass(), "sourceName", null);
        setIntField(term33401, term33401.getClass(), "baseLineno", 0);
        setIntField(term33401, term33401.getClass(), "endLineno", 0);
        setField(term33401, term33401.getClass(), "functions", null);
        setField(term33401, term33401.getClass(), "regexps", null);
        setField(term33401, term33401.getClass(), "itsVariables", null);
        setField(term33401, term33401.getClass(), "itsConst", null);
        setField(term33401, term33401.getClass(), "itsVariableNames", null);
        setIntField(term33401, term33401.getClass(), "varStart", 0);
        setField(term33401, term33401.getClass(), "compilerData", null);
        setIntField(term33401, term33401.getClass(), "type", 0);
        setField(term33401, term33401.getClass(), "next", null);
        setField(term33401, term33401.getClass(), "first", null);
        setField(term33401, term33401.getClass(), "last", null);
        setField(term33401, term33401.getClass(), "propListHead", null);
        setIntField(term33401, term33401.getClass(), "sourcePosition", 0);
        setField(term33401, term33401.getClass(), "jsType", null);
        setField(term33401, term33401.getClass(), "parent", null);
        setField(term33394, term33394.getClass(), "first", term33401);
        setField(term33394, term33394.getClass(), "last", null);
        setField(term33394, term33394.getClass(), "propListHead", null);
        setIntField(term33394, term33394.getClass(), "sourcePosition", 0);
        setField(term33394, term33394.getClass(), "jsType", null);
        setField(term33394, term33394.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33290;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term33200, args);
        assertTrue(recursiveEquals(term33200, term33437));
        assertTrue(recursiveEquals(term33290, term33438));
        assertTrue(recursiveEquals(retValue, term33394));
    }

};


