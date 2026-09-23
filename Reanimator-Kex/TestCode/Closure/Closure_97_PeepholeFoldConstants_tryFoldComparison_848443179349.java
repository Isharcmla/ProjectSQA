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

public class PeepholeFoldConstants_tryFoldComparison_848443179349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69201;
     Object term69293;
     Object term69385;
     Object term69471;
     Object term81934;
     Object term81935;
     Object term81936;
     Object term81937;
     Object term81908;

    public PeepholeFoldConstants_tryFoldComparison_848443179349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term69293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69293, term69293.getClass(), "type", 16);
        term69385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69385, term69385.getClass(), "type", 16);
        term69471 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term81934 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81934, term81934.getClass(), "currentTraversal", null);
        term81935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81935, term81935.getClass(), "str", null);
        setIntField(term81935, term81935.getClass(), "type", 16);
        setField(term81935, term81935.getClass(), "next", null);
        setField(term81935, term81935.getClass(), "first", null);
        setField(term81935, term81935.getClass(), "last", null);
        setField(term81935, term81935.getClass(), "propListHead", null);
        setIntField(term81935, term81935.getClass(), "sourcePosition", 0);
        setField(term81935, term81935.getClass(), "jsType", null);
        setField(term81935, term81935.getClass(), "parent", null);
        term81936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81936, term81936.getClass(), "str", null);
        setIntField(term81936, term81936.getClass(), "type", 16);
        setField(term81936, term81936.getClass(), "next", null);
        setField(term81936, term81936.getClass(), "first", null);
        setField(term81936, term81936.getClass(), "last", null);
        setField(term81936, term81936.getClass(), "propListHead", null);
        setIntField(term81936, term81936.getClass(), "sourcePosition", 0);
        setField(term81936, term81936.getClass(), "jsType", null);
        setField(term81936, term81936.getClass(), "parent", null);
        term81937 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81937, term81937.getClass(), "functionName", null);
        setBooleanField(term81937, term81937.getClass(), "itsNeedsActivation", false);
        setIntField(term81937, term81937.getClass(), "itsFunctionType", 0);
        setBooleanField(term81937, term81937.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81937, term81937.getClass(), "encodedSourceStart", 0);
        setIntField(term81937, term81937.getClass(), "encodedSourceEnd", 0);
        setField(term81937, term81937.getClass(), "sourceName", null);
        setIntField(term81937, term81937.getClass(), "baseLineno", 0);
        setIntField(term81937, term81937.getClass(), "endLineno", 0);
        setField(term81937, term81937.getClass(), "functions", null);
        setField(term81937, term81937.getClass(), "regexps", null);
        setField(term81937, term81937.getClass(), "itsVariables", null);
        setField(term81937, term81937.getClass(), "itsConst", null);
        setField(term81937, term81937.getClass(), "itsVariableNames", null);
        setIntField(term81937, term81937.getClass(), "varStart", 0);
        setField(term81937, term81937.getClass(), "compilerData", null);
        setIntField(term81937, term81937.getClass(), "type", 0);
        setField(term81937, term81937.getClass(), "next", null);
        setField(term81937, term81937.getClass(), "first", null);
        setField(term81937, term81937.getClass(), "last", null);
        setField(term81937, term81937.getClass(), "propListHead", null);
        setIntField(term81937, term81937.getClass(), "sourcePosition", 0);
        setField(term81937, term81937.getClass(), "jsType", null);
        setField(term81937, term81937.getClass(), "parent", null);
        term81908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term81908, term81908.getClass(), "str", null);
        setIntField(term81908, term81908.getClass(), "type", 16);
        setField(term81908, term81908.getClass(), "next", null);
        setField(term81908, term81908.getClass(), "first", null);
        setField(term81908, term81908.getClass(), "last", null);
        setField(term81908, term81908.getClass(), "propListHead", null);
        setIntField(term81908, term81908.getClass(), "sourcePosition", 0);
        setField(term81908, term81908.getClass(), "jsType", null);
        setField(term81908, term81908.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term69293;
        args[1] = term69385;
        args[2] = term69471;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term69201, args);
        assertTrue(recursiveEquals(term69201, term81934));
        assertTrue(recursiveEquals(term69293, term81935));
        assertTrue(recursiveEquals(term69385, term81936));
        assertTrue(recursiveEquals(term69471, term81937));
        assertTrue(recursiveEquals(retValue, term81908));
    }

};


