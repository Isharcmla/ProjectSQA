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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3543048;
     Object term3543134;
     Object term3544552;
     Object term3544553;
     Object term3544460;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3543048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3543134 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3543226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3543318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3543426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3543134, term3543134.getClass(), "type", 37);
        setIntField(term3543226, term3543226.getClass(), "type", 33);
        setField(term3543318, term3543318.getClass(), "next", term3543318);
        setIntField(term3543318, term3543318.getClass(), "type", 40);
        setField(term3543318, term3543318.getClass(), "str", "");
        setField(term3543226, term3543226.getClass(), "first", term3543318);
        setIntField(term3543426, term3543426.getClass(), "type", 39);
        setField(term3543226, term3543226.getClass(), "next", term3543426);
        setField(term3543134, term3543134.getClass(), "first", term3543226);
        term3544552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3544552, term3544552.getClass(), "currentTraversal", null);
        term3544553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3544554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3544556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3544553, term3544553.getClass(), "functionName", null);
        setBooleanField(term3544553, term3544553.getClass(), "itsNeedsActivation", false);
        setIntField(term3544553, term3544553.getClass(), "itsFunctionType", 0);
        setBooleanField(term3544553, term3544553.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3544553, term3544553.getClass(), "encodedSourceStart", 0);
        setIntField(term3544553, term3544553.getClass(), "encodedSourceEnd", 0);
        setField(term3544553, term3544553.getClass(), "sourceName", null);
        setIntField(term3544553, term3544553.getClass(), "baseLineno", 0);
        setIntField(term3544553, term3544553.getClass(), "endLineno", 0);
        setField(term3544553, term3544553.getClass(), "functions", null);
        setField(term3544553, term3544553.getClass(), "regexps", null);
        setField(term3544553, term3544553.getClass(), "itsVariables", null);
        setField(term3544553, term3544553.getClass(), "itsConst", null);
        setField(term3544553, term3544553.getClass(), "itsVariableNames", null);
        setIntField(term3544553, term3544553.getClass(), "varStart", 0);
        setField(term3544553, term3544553.getClass(), "compilerData", null);
        setIntField(term3544553, term3544553.getClass(), "type", 37);
        setField(term3544553, term3544553.getClass(), "next", null);
        setField(term3544554, term3544554.getClass(), "str", null);
        setIntField(term3544554, term3544554.getClass(), "type", 33);
        setIntField(term3544555, term3544555.getClass(), "type", 39);
        setField(term3544555, term3544555.getClass(), "next", null);
        setField(term3544555, term3544555.getClass(), "first", null);
        setField(term3544555, term3544555.getClass(), "last", null);
        setField(term3544555, term3544555.getClass(), "propListHead", null);
        setIntField(term3544555, term3544555.getClass(), "sourcePosition", 0);
        setField(term3544555, term3544555.getClass(), "jsType", null);
        setField(term3544555, term3544555.getClass(), "parent", null);
        setField(term3544554, term3544554.getClass(), "next", term3544555);
        setField(term3544556, term3544556.getClass(), "str", "");
        setIntField(term3544556, term3544556.getClass(), "type", 40);
        setField(term3544556, term3544556.getClass(), "next", term3544556);
        setField(term3544556, term3544556.getClass(), "first", null);
        setField(term3544556, term3544556.getClass(), "last", null);
        setField(term3544556, term3544556.getClass(), "propListHead", null);
        setIntField(term3544556, term3544556.getClass(), "sourcePosition", 0);
        setField(term3544556, term3544556.getClass(), "jsType", null);
        setField(term3544556, term3544556.getClass(), "parent", null);
        setField(term3544554, term3544554.getClass(), "first", term3544556);
        setField(term3544554, term3544554.getClass(), "last", null);
        setField(term3544554, term3544554.getClass(), "propListHead", null);
        setIntField(term3544554, term3544554.getClass(), "sourcePosition", 0);
        setField(term3544554, term3544554.getClass(), "jsType", null);
        setField(term3544554, term3544554.getClass(), "parent", null);
        setField(term3544553, term3544553.getClass(), "first", term3544554);
        setField(term3544553, term3544553.getClass(), "last", null);
        setField(term3544553, term3544553.getClass(), "propListHead", null);
        setIntField(term3544553, term3544553.getClass(), "sourcePosition", 0);
        setField(term3544553, term3544553.getClass(), "jsType", null);
        setField(term3544553, term3544553.getClass(), "parent", null);
        term3544460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3544470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3544475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3544460, term3544460.getClass(), "functionName", null);
        setBooleanField(term3544460, term3544460.getClass(), "itsNeedsActivation", false);
        setIntField(term3544460, term3544460.getClass(), "itsFunctionType", 0);
        setBooleanField(term3544460, term3544460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3544460, term3544460.getClass(), "encodedSourceStart", 0);
        setIntField(term3544460, term3544460.getClass(), "encodedSourceEnd", 0);
        setField(term3544460, term3544460.getClass(), "sourceName", null);
        setIntField(term3544460, term3544460.getClass(), "baseLineno", 0);
        setIntField(term3544460, term3544460.getClass(), "endLineno", 0);
        setField(term3544460, term3544460.getClass(), "functions", null);
        setField(term3544460, term3544460.getClass(), "regexps", null);
        setField(term3544460, term3544460.getClass(), "itsVariables", null);
        setField(term3544460, term3544460.getClass(), "itsConst", null);
        setField(term3544460, term3544460.getClass(), "itsVariableNames", null);
        setIntField(term3544460, term3544460.getClass(), "varStart", 0);
        setField(term3544460, term3544460.getClass(), "compilerData", null);
        setIntField(term3544460, term3544460.getClass(), "type", 37);
        setField(term3544460, term3544460.getClass(), "next", null);
        setField(term3544470, term3544470.getClass(), "str", null);
        setIntField(term3544470, term3544470.getClass(), "type", 33);
        setIntField(term3544472, term3544472.getClass(), "type", 39);
        setField(term3544472, term3544472.getClass(), "next", null);
        setField(term3544472, term3544472.getClass(), "first", null);
        setField(term3544472, term3544472.getClass(), "last", null);
        setField(term3544472, term3544472.getClass(), "propListHead", null);
        setIntField(term3544472, term3544472.getClass(), "sourcePosition", 0);
        setField(term3544472, term3544472.getClass(), "jsType", null);
        setField(term3544472, term3544472.getClass(), "parent", null);
        setField(term3544470, term3544470.getClass(), "next", term3544472);
        setField(term3544475, term3544475.getClass(), "str", "");
        setIntField(term3544475, term3544475.getClass(), "type", 40);
        setField(term3544475, term3544475.getClass(), "next", term3544475);
        setField(term3544475, term3544475.getClass(), "first", null);
        setField(term3544475, term3544475.getClass(), "last", null);
        setField(term3544475, term3544475.getClass(), "propListHead", null);
        setIntField(term3544475, term3544475.getClass(), "sourcePosition", 0);
        setField(term3544475, term3544475.getClass(), "jsType", null);
        setField(term3544475, term3544475.getClass(), "parent", null);
        setField(term3544470, term3544470.getClass(), "first", term3544475);
        setField(term3544470, term3544470.getClass(), "last", null);
        setField(term3544470, term3544470.getClass(), "propListHead", null);
        setIntField(term3544470, term3544470.getClass(), "sourcePosition", 0);
        setField(term3544470, term3544470.getClass(), "jsType", null);
        setField(term3544470, term3544470.getClass(), "parent", null);
        setField(term3544460, term3544460.getClass(), "first", term3544470);
        setField(term3544460, term3544460.getClass(), "last", null);
        setField(term3544460, term3544460.getClass(), "propListHead", null);
        setIntField(term3544460, term3544460.getClass(), "sourcePosition", 0);
        setField(term3544460, term3544460.getClass(), "jsType", null);
        setField(term3544460, term3544460.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3543134;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3543048, args);
        assertTrue(recursiveEquals(term3543048, term3544552));
        assertTrue(recursiveEquals(term3543134, term3544553));
        assertTrue(recursiveEquals(retValue, term3544460));
    }

};


