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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42381;
     Object term42467;
     Object term43035;
     Object term43036;
     Object term43001;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term42467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term42467, term42467.getClass(), "type", 37);
        setField(term42467, term42467.getClass(), "first", term42559);
        term43035 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term43035, term43035.getClass(), "currentTraversal", null);
        term43036 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term43036, term43036.getClass(), "functionName", null);
        setBooleanField(term43036, term43036.getClass(), "itsNeedsActivation", false);
        setIntField(term43036, term43036.getClass(), "itsFunctionType", 0);
        setBooleanField(term43036, term43036.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43036, term43036.getClass(), "encodedSourceStart", 0);
        setIntField(term43036, term43036.getClass(), "encodedSourceEnd", 0);
        setField(term43036, term43036.getClass(), "sourceName", null);
        setIntField(term43036, term43036.getClass(), "baseLineno", 0);
        setIntField(term43036, term43036.getClass(), "endLineno", 0);
        setField(term43036, term43036.getClass(), "functions", null);
        setField(term43036, term43036.getClass(), "regexps", null);
        setField(term43036, term43036.getClass(), "itsVariables", null);
        setField(term43036, term43036.getClass(), "itsConst", null);
        setField(term43036, term43036.getClass(), "itsVariableNames", null);
        setIntField(term43036, term43036.getClass(), "varStart", 0);
        setField(term43036, term43036.getClass(), "compilerData", null);
        setIntField(term43036, term43036.getClass(), "type", 37);
        setField(term43036, term43036.getClass(), "next", null);
        setDoubleField(term43037, term43037.getClass(), "number", 0.0);
        setIntField(term43037, term43037.getClass(), "type", 0);
        setField(term43037, term43037.getClass(), "next", null);
        setField(term43037, term43037.getClass(), "first", null);
        setField(term43037, term43037.getClass(), "last", null);
        setField(term43037, term43037.getClass(), "propListHead", null);
        setIntField(term43037, term43037.getClass(), "sourcePosition", 0);
        setField(term43037, term43037.getClass(), "jsType", null);
        setField(term43037, term43037.getClass(), "parent", null);
        setField(term43036, term43036.getClass(), "first", term43037);
        setField(term43036, term43036.getClass(), "last", null);
        setField(term43036, term43036.getClass(), "propListHead", null);
        setIntField(term43036, term43036.getClass(), "sourcePosition", 0);
        setField(term43036, term43036.getClass(), "jsType", null);
        setField(term43036, term43036.getClass(), "parent", null);
        term43001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term43001, term43001.getClass(), "functionName", null);
        setBooleanField(term43001, term43001.getClass(), "itsNeedsActivation", false);
        setIntField(term43001, term43001.getClass(), "itsFunctionType", 0);
        setBooleanField(term43001, term43001.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43001, term43001.getClass(), "encodedSourceStart", 0);
        setIntField(term43001, term43001.getClass(), "encodedSourceEnd", 0);
        setField(term43001, term43001.getClass(), "sourceName", null);
        setIntField(term43001, term43001.getClass(), "baseLineno", 0);
        setIntField(term43001, term43001.getClass(), "endLineno", 0);
        setField(term43001, term43001.getClass(), "functions", null);
        setField(term43001, term43001.getClass(), "regexps", null);
        setField(term43001, term43001.getClass(), "itsVariables", null);
        setField(term43001, term43001.getClass(), "itsConst", null);
        setField(term43001, term43001.getClass(), "itsVariableNames", null);
        setIntField(term43001, term43001.getClass(), "varStart", 0);
        setField(term43001, term43001.getClass(), "compilerData", null);
        setIntField(term43001, term43001.getClass(), "type", 37);
        setField(term43001, term43001.getClass(), "next", null);
        setDoubleField(term43011, term43011.getClass(), "number", 0.0);
        setIntField(term43011, term43011.getClass(), "type", 0);
        setField(term43011, term43011.getClass(), "next", null);
        setField(term43011, term43011.getClass(), "first", null);
        setField(term43011, term43011.getClass(), "last", null);
        setField(term43011, term43011.getClass(), "propListHead", null);
        setIntField(term43011, term43011.getClass(), "sourcePosition", 0);
        setField(term43011, term43011.getClass(), "jsType", null);
        setField(term43011, term43011.getClass(), "parent", null);
        setField(term43001, term43001.getClass(), "first", term43011);
        setField(term43001, term43001.getClass(), "last", null);
        setField(term43001, term43001.getClass(), "propListHead", null);
        setIntField(term43001, term43001.getClass(), "sourcePosition", 0);
        setField(term43001, term43001.getClass(), "jsType", null);
        setField(term43001, term43001.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42467;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term42381, args);
        assertTrue(recursiveEquals(term42381, term43035));
        assertTrue(recursiveEquals(term42467, term43036));
        assertTrue(recursiveEquals(retValue, term43001));
    }

};


