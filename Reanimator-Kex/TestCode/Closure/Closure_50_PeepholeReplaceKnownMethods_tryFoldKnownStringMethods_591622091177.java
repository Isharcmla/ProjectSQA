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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51033;
     Object term51119;
     Object term51591;
     Object term51592;
     Object term51536;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51033 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term51119 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51205 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term51119, term51119.getClass(), "type", 37);
        setField(term51119, term51119.getClass(), "first", term51205);
        term51591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term51591, term51591.getClass(), "currentTraversal", null);
        term51592 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51593 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term51592, term51592.getClass(), "functionName", null);
        setBooleanField(term51592, term51592.getClass(), "itsNeedsActivation", false);
        setIntField(term51592, term51592.getClass(), "itsFunctionType", 0);
        setBooleanField(term51592, term51592.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51592, term51592.getClass(), "encodedSourceStart", 0);
        setIntField(term51592, term51592.getClass(), "encodedSourceEnd", 0);
        setField(term51592, term51592.getClass(), "sourceName", null);
        setIntField(term51592, term51592.getClass(), "baseLineno", 0);
        setIntField(term51592, term51592.getClass(), "endLineno", 0);
        setField(term51592, term51592.getClass(), "functions", null);
        setField(term51592, term51592.getClass(), "regexps", null);
        setField(term51592, term51592.getClass(), "itsVariables", null);
        setField(term51592, term51592.getClass(), "itsConst", null);
        setField(term51592, term51592.getClass(), "itsVariableNames", null);
        setIntField(term51592, term51592.getClass(), "varStart", 0);
        setField(term51592, term51592.getClass(), "compilerData", null);
        setIntField(term51592, term51592.getClass(), "type", 37);
        setField(term51592, term51592.getClass(), "next", null);
        setField(term51593, term51593.getClass(), "functionName", null);
        setBooleanField(term51593, term51593.getClass(), "itsNeedsActivation", false);
        setIntField(term51593, term51593.getClass(), "itsFunctionType", 0);
        setBooleanField(term51593, term51593.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51593, term51593.getClass(), "encodedSourceStart", 0);
        setIntField(term51593, term51593.getClass(), "encodedSourceEnd", 0);
        setField(term51593, term51593.getClass(), "sourceName", null);
        setIntField(term51593, term51593.getClass(), "baseLineno", 0);
        setIntField(term51593, term51593.getClass(), "endLineno", 0);
        setField(term51593, term51593.getClass(), "functions", null);
        setField(term51593, term51593.getClass(), "regexps", null);
        setField(term51593, term51593.getClass(), "itsVariables", null);
        setField(term51593, term51593.getClass(), "itsConst", null);
        setField(term51593, term51593.getClass(), "itsVariableNames", null);
        setIntField(term51593, term51593.getClass(), "varStart", 0);
        setField(term51593, term51593.getClass(), "compilerData", null);
        setIntField(term51593, term51593.getClass(), "type", 0);
        setField(term51593, term51593.getClass(), "next", null);
        setField(term51593, term51593.getClass(), "first", null);
        setField(term51593, term51593.getClass(), "last", null);
        setField(term51593, term51593.getClass(), "propListHead", null);
        setIntField(term51593, term51593.getClass(), "sourcePosition", 0);
        setField(term51593, term51593.getClass(), "jsType", null);
        setField(term51593, term51593.getClass(), "parent", null);
        setField(term51592, term51592.getClass(), "first", term51593);
        setField(term51592, term51592.getClass(), "last", null);
        setField(term51592, term51592.getClass(), "propListHead", null);
        setIntField(term51592, term51592.getClass(), "sourcePosition", 0);
        setField(term51592, term51592.getClass(), "jsType", null);
        setField(term51592, term51592.getClass(), "parent", null);
        term51536 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term51536, term51536.getClass(), "functionName", null);
        setBooleanField(term51536, term51536.getClass(), "itsNeedsActivation", false);
        setIntField(term51536, term51536.getClass(), "itsFunctionType", 0);
        setBooleanField(term51536, term51536.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51536, term51536.getClass(), "encodedSourceStart", 0);
        setIntField(term51536, term51536.getClass(), "encodedSourceEnd", 0);
        setField(term51536, term51536.getClass(), "sourceName", null);
        setIntField(term51536, term51536.getClass(), "baseLineno", 0);
        setIntField(term51536, term51536.getClass(), "endLineno", 0);
        setField(term51536, term51536.getClass(), "functions", null);
        setField(term51536, term51536.getClass(), "regexps", null);
        setField(term51536, term51536.getClass(), "itsVariables", null);
        setField(term51536, term51536.getClass(), "itsConst", null);
        setField(term51536, term51536.getClass(), "itsVariableNames", null);
        setIntField(term51536, term51536.getClass(), "varStart", 0);
        setField(term51536, term51536.getClass(), "compilerData", null);
        setIntField(term51536, term51536.getClass(), "type", 37);
        setField(term51536, term51536.getClass(), "next", null);
        setField(term51546, term51546.getClass(), "functionName", null);
        setBooleanField(term51546, term51546.getClass(), "itsNeedsActivation", false);
        setIntField(term51546, term51546.getClass(), "itsFunctionType", 0);
        setBooleanField(term51546, term51546.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51546, term51546.getClass(), "encodedSourceStart", 0);
        setIntField(term51546, term51546.getClass(), "encodedSourceEnd", 0);
        setField(term51546, term51546.getClass(), "sourceName", null);
        setIntField(term51546, term51546.getClass(), "baseLineno", 0);
        setIntField(term51546, term51546.getClass(), "endLineno", 0);
        setField(term51546, term51546.getClass(), "functions", null);
        setField(term51546, term51546.getClass(), "regexps", null);
        setField(term51546, term51546.getClass(), "itsVariables", null);
        setField(term51546, term51546.getClass(), "itsConst", null);
        setField(term51546, term51546.getClass(), "itsVariableNames", null);
        setIntField(term51546, term51546.getClass(), "varStart", 0);
        setField(term51546, term51546.getClass(), "compilerData", null);
        setIntField(term51546, term51546.getClass(), "type", 0);
        setField(term51546, term51546.getClass(), "next", null);
        setField(term51546, term51546.getClass(), "first", null);
        setField(term51546, term51546.getClass(), "last", null);
        setField(term51546, term51546.getClass(), "propListHead", null);
        setIntField(term51546, term51546.getClass(), "sourcePosition", 0);
        setField(term51546, term51546.getClass(), "jsType", null);
        setField(term51546, term51546.getClass(), "parent", null);
        setField(term51536, term51536.getClass(), "first", term51546);
        setField(term51536, term51536.getClass(), "last", null);
        setField(term51536, term51536.getClass(), "propListHead", null);
        setIntField(term51536, term51536.getClass(), "sourcePosition", 0);
        setField(term51536, term51536.getClass(), "jsType", null);
        setField(term51536, term51536.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51119;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term51033, args);
        assertTrue(recursiveEquals(term51033, term51591));
        assertTrue(recursiveEquals(term51119, term51592));
        assertTrue(recursiveEquals(retValue, term51536));
    }

};


