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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696010;
     Object term3696096;
     Object term3696620;
     Object term3696621;
     Object term3696505;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3696096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3696188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3696096, term3696096.getClass(), "type", 37);
        setIntField(term3696188, term3696188.getClass(), "type", 35);
        setIntField(term3696372, term3696372.getClass(), "type", 40);
        setField(term3696372, term3696372.getClass(), "str", " ");
        setField(term3696280, term3696280.getClass(), "next", term3696372);
        setIntField(term3696280, term3696280.getClass(), "type", 40);
        setField(term3696188, term3696188.getClass(), "first", term3696280);
        setIntField(term3696502, term3696502.getClass(), "type", 41);
        setField(term3696188, term3696188.getClass(), "next", term3696502);
        setField(term3696096, term3696096.getClass(), "first", term3696188);
        term3696620 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3696620, term3696620.getClass(), "currentTraversal", null);
        term3696621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3696622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3696621, term3696621.getClass(), "functionName", null);
        setBooleanField(term3696621, term3696621.getClass(), "itsNeedsActivation", false);
        setIntField(term3696621, term3696621.getClass(), "itsFunctionType", 0);
        setBooleanField(term3696621, term3696621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3696621, term3696621.getClass(), "encodedSourceStart", 0);
        setIntField(term3696621, term3696621.getClass(), "encodedSourceEnd", 0);
        setField(term3696621, term3696621.getClass(), "sourceName", null);
        setIntField(term3696621, term3696621.getClass(), "baseLineno", 0);
        setIntField(term3696621, term3696621.getClass(), "endLineno", 0);
        setField(term3696621, term3696621.getClass(), "functions", null);
        setField(term3696621, term3696621.getClass(), "regexps", null);
        setField(term3696621, term3696621.getClass(), "itsVariables", null);
        setField(term3696621, term3696621.getClass(), "itsConst", null);
        setField(term3696621, term3696621.getClass(), "itsVariableNames", null);
        setIntField(term3696621, term3696621.getClass(), "varStart", 0);
        setField(term3696621, term3696621.getClass(), "compilerData", null);
        setIntField(term3696621, term3696621.getClass(), "type", 37);
        setField(term3696621, term3696621.getClass(), "next", null);
        setField(term3696622, term3696622.getClass(), "str", null);
        setIntField(term3696622, term3696622.getClass(), "type", 35);
        setField(term3696623, term3696623.getClass(), "str", null);
        setIntField(term3696623, term3696623.getClass(), "type", 41);
        setField(term3696623, term3696623.getClass(), "next", null);
        setField(term3696623, term3696623.getClass(), "first", null);
        setField(term3696623, term3696623.getClass(), "last", null);
        setField(term3696623, term3696623.getClass(), "propListHead", null);
        setIntField(term3696623, term3696623.getClass(), "sourcePosition", 0);
        setField(term3696623, term3696623.getClass(), "jsType", null);
        setField(term3696623, term3696623.getClass(), "parent", null);
        setField(term3696622, term3696622.getClass(), "next", term3696623);
        setField(term3696624, term3696624.getClass(), "str", null);
        setIntField(term3696624, term3696624.getClass(), "type", 40);
        setField(term3696625, term3696625.getClass(), "str", "");
        setIntField(term3696625, term3696625.getClass(), "type", 40);
        setField(term3696625, term3696625.getClass(), "next", null);
        setField(term3696625, term3696625.getClass(), "first", null);
        setField(term3696625, term3696625.getClass(), "last", null);
        setField(term3696625, term3696625.getClass(), "propListHead", null);
        setIntField(term3696625, term3696625.getClass(), "sourcePosition", 0);
        setField(term3696625, term3696625.getClass(), "jsType", null);
        setField(term3696625, term3696625.getClass(), "parent", null);
        setField(term3696624, term3696624.getClass(), "next", term3696625);
        setField(term3696624, term3696624.getClass(), "first", null);
        setField(term3696624, term3696624.getClass(), "last", null);
        setField(term3696624, term3696624.getClass(), "propListHead", null);
        setIntField(term3696624, term3696624.getClass(), "sourcePosition", 0);
        setField(term3696624, term3696624.getClass(), "jsType", null);
        setField(term3696624, term3696624.getClass(), "parent", null);
        setField(term3696622, term3696622.getClass(), "first", term3696624);
        setField(term3696622, term3696622.getClass(), "last", null);
        setField(term3696622, term3696622.getClass(), "propListHead", null);
        setIntField(term3696622, term3696622.getClass(), "sourcePosition", 0);
        setField(term3696622, term3696622.getClass(), "jsType", null);
        setField(term3696622, term3696622.getClass(), "parent", null);
        setField(term3696621, term3696621.getClass(), "first", term3696622);
        setField(term3696621, term3696621.getClass(), "last", null);
        setField(term3696621, term3696621.getClass(), "propListHead", null);
        setIntField(term3696621, term3696621.getClass(), "sourcePosition", 0);
        setField(term3696621, term3696621.getClass(), "jsType", null);
        setField(term3696621, term3696621.getClass(), "parent", null);
        term3696505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3696515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3696522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3696505, term3696505.getClass(), "functionName", null);
        setBooleanField(term3696505, term3696505.getClass(), "itsNeedsActivation", false);
        setIntField(term3696505, term3696505.getClass(), "itsFunctionType", 0);
        setBooleanField(term3696505, term3696505.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3696505, term3696505.getClass(), "encodedSourceStart", 0);
        setIntField(term3696505, term3696505.getClass(), "encodedSourceEnd", 0);
        setField(term3696505, term3696505.getClass(), "sourceName", null);
        setIntField(term3696505, term3696505.getClass(), "baseLineno", 0);
        setIntField(term3696505, term3696505.getClass(), "endLineno", 0);
        setField(term3696505, term3696505.getClass(), "functions", null);
        setField(term3696505, term3696505.getClass(), "regexps", null);
        setField(term3696505, term3696505.getClass(), "itsVariables", null);
        setField(term3696505, term3696505.getClass(), "itsConst", null);
        setField(term3696505, term3696505.getClass(), "itsVariableNames", null);
        setIntField(term3696505, term3696505.getClass(), "varStart", 0);
        setField(term3696505, term3696505.getClass(), "compilerData", null);
        setIntField(term3696505, term3696505.getClass(), "type", 37);
        setField(term3696505, term3696505.getClass(), "next", null);
        setField(term3696515, term3696515.getClass(), "str", null);
        setIntField(term3696515, term3696515.getClass(), "type", 35);
        setField(term3696517, term3696517.getClass(), "str", null);
        setIntField(term3696517, term3696517.getClass(), "type", 41);
        setField(term3696517, term3696517.getClass(), "next", null);
        setField(term3696517, term3696517.getClass(), "first", null);
        setField(term3696517, term3696517.getClass(), "last", null);
        setField(term3696517, term3696517.getClass(), "propListHead", null);
        setIntField(term3696517, term3696517.getClass(), "sourcePosition", 0);
        setField(term3696517, term3696517.getClass(), "jsType", null);
        setField(term3696517, term3696517.getClass(), "parent", null);
        setField(term3696515, term3696515.getClass(), "next", term3696517);
        setField(term3696520, term3696520.getClass(), "str", null);
        setIntField(term3696520, term3696520.getClass(), "type", 40);
        setField(term3696522, term3696522.getClass(), "str", "");
        setIntField(term3696522, term3696522.getClass(), "type", 40);
        setField(term3696522, term3696522.getClass(), "next", null);
        setField(term3696522, term3696522.getClass(), "first", null);
        setField(term3696522, term3696522.getClass(), "last", null);
        setField(term3696522, term3696522.getClass(), "propListHead", null);
        setIntField(term3696522, term3696522.getClass(), "sourcePosition", 0);
        setField(term3696522, term3696522.getClass(), "jsType", null);
        setField(term3696522, term3696522.getClass(), "parent", null);
        setField(term3696520, term3696520.getClass(), "next", term3696522);
        setField(term3696520, term3696520.getClass(), "first", null);
        setField(term3696520, term3696520.getClass(), "last", null);
        setField(term3696520, term3696520.getClass(), "propListHead", null);
        setIntField(term3696520, term3696520.getClass(), "sourcePosition", 0);
        setField(term3696520, term3696520.getClass(), "jsType", null);
        setField(term3696520, term3696520.getClass(), "parent", null);
        setField(term3696515, term3696515.getClass(), "first", term3696520);
        setField(term3696515, term3696515.getClass(), "last", null);
        setField(term3696515, term3696515.getClass(), "propListHead", null);
        setIntField(term3696515, term3696515.getClass(), "sourcePosition", 0);
        setField(term3696515, term3696515.getClass(), "jsType", null);
        setField(term3696515, term3696515.getClass(), "parent", null);
        setField(term3696505, term3696505.getClass(), "first", term3696515);
        setField(term3696505, term3696505.getClass(), "last", null);
        setField(term3696505, term3696505.getClass(), "propListHead", null);
        setIntField(term3696505, term3696505.getClass(), "sourcePosition", 0);
        setField(term3696505, term3696505.getClass(), "jsType", null);
        setField(term3696505, term3696505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3696096;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3696010, args);
        assertTrue(recursiveEquals(term3696010, term3696620));
        assertTrue(recursiveEquals(term3696096, term3696621));
        assertTrue(recursiveEquals(retValue, term3696505));
    }

};


