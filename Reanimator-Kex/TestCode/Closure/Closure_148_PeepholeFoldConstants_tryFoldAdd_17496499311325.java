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

public class PeepholeFoldConstants_tryFoldAdd_17496499311325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320226;
     Object term320312;
     Object term320404;
     Object term320490;
     Object term320962;
     Object term320963;
     Object term320964;
     Object term320965;
     Object term320911;

    public PeepholeFoldConstants_tryFoldAdd_17496499311325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term320312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term320312, term320312.getClass(), "type", 21);
        term320404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term320404, term320404.getClass(), "type", 21);
        term320490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term320962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term320962, term320962.getClass(), "currentTraversal", null);
        term320963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term320963, term320963.getClass(), "functionName", null);
        setBooleanField(term320963, term320963.getClass(), "itsNeedsActivation", false);
        setIntField(term320963, term320963.getClass(), "itsFunctionType", 0);
        setBooleanField(term320963, term320963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term320963, term320963.getClass(), "encodedSourceStart", 0);
        setIntField(term320963, term320963.getClass(), "encodedSourceEnd", 0);
        setField(term320963, term320963.getClass(), "sourceName", null);
        setIntField(term320963, term320963.getClass(), "baseLineno", 0);
        setIntField(term320963, term320963.getClass(), "endLineno", 0);
        setField(term320963, term320963.getClass(), "functions", null);
        setField(term320963, term320963.getClass(), "regexps", null);
        setField(term320963, term320963.getClass(), "itsVariables", null);
        setField(term320963, term320963.getClass(), "itsConst", null);
        setField(term320963, term320963.getClass(), "itsVariableNames", null);
        setIntField(term320963, term320963.getClass(), "varStart", 0);
        setField(term320963, term320963.getClass(), "compilerData", null);
        setIntField(term320963, term320963.getClass(), "type", 21);
        setField(term320963, term320963.getClass(), "next", null);
        setField(term320963, term320963.getClass(), "first", null);
        setField(term320963, term320963.getClass(), "last", null);
        setField(term320963, term320963.getClass(), "propListHead", null);
        setIntField(term320963, term320963.getClass(), "sourcePosition", 0);
        setField(term320963, term320963.getClass(), "jsType", null);
        setField(term320963, term320963.getClass(), "parent", null);
        term320964 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term320964, term320964.getClass(), "number", 0.0);
        setIntField(term320964, term320964.getClass(), "type", 21);
        setField(term320964, term320964.getClass(), "next", null);
        setField(term320964, term320964.getClass(), "first", null);
        setField(term320964, term320964.getClass(), "last", null);
        setField(term320964, term320964.getClass(), "propListHead", null);
        setIntField(term320964, term320964.getClass(), "sourcePosition", 0);
        setField(term320964, term320964.getClass(), "jsType", null);
        setField(term320964, term320964.getClass(), "parent", null);
        term320965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term320965, term320965.getClass(), "functionName", null);
        setBooleanField(term320965, term320965.getClass(), "itsNeedsActivation", false);
        setIntField(term320965, term320965.getClass(), "itsFunctionType", 0);
        setBooleanField(term320965, term320965.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term320965, term320965.getClass(), "encodedSourceStart", 0);
        setIntField(term320965, term320965.getClass(), "encodedSourceEnd", 0);
        setField(term320965, term320965.getClass(), "sourceName", null);
        setIntField(term320965, term320965.getClass(), "baseLineno", 0);
        setIntField(term320965, term320965.getClass(), "endLineno", 0);
        setField(term320965, term320965.getClass(), "functions", null);
        setField(term320965, term320965.getClass(), "regexps", null);
        setField(term320965, term320965.getClass(), "itsVariables", null);
        setField(term320965, term320965.getClass(), "itsConst", null);
        setField(term320965, term320965.getClass(), "itsVariableNames", null);
        setIntField(term320965, term320965.getClass(), "varStart", 0);
        setField(term320965, term320965.getClass(), "compilerData", null);
        setIntField(term320965, term320965.getClass(), "type", 0);
        setField(term320965, term320965.getClass(), "next", null);
        setField(term320965, term320965.getClass(), "first", null);
        setField(term320965, term320965.getClass(), "last", null);
        setField(term320965, term320965.getClass(), "propListHead", null);
        setIntField(term320965, term320965.getClass(), "sourcePosition", 0);
        setField(term320965, term320965.getClass(), "jsType", null);
        setField(term320965, term320965.getClass(), "parent", null);
        term320911 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term320911, term320911.getClass(), "functionName", null);
        setBooleanField(term320911, term320911.getClass(), "itsNeedsActivation", false);
        setIntField(term320911, term320911.getClass(), "itsFunctionType", 0);
        setBooleanField(term320911, term320911.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term320911, term320911.getClass(), "encodedSourceStart", 0);
        setIntField(term320911, term320911.getClass(), "encodedSourceEnd", 0);
        setField(term320911, term320911.getClass(), "sourceName", null);
        setIntField(term320911, term320911.getClass(), "baseLineno", 0);
        setIntField(term320911, term320911.getClass(), "endLineno", 0);
        setField(term320911, term320911.getClass(), "functions", null);
        setField(term320911, term320911.getClass(), "regexps", null);
        setField(term320911, term320911.getClass(), "itsVariables", null);
        setField(term320911, term320911.getClass(), "itsConst", null);
        setField(term320911, term320911.getClass(), "itsVariableNames", null);
        setIntField(term320911, term320911.getClass(), "varStart", 0);
        setField(term320911, term320911.getClass(), "compilerData", null);
        setIntField(term320911, term320911.getClass(), "type", 21);
        setField(term320911, term320911.getClass(), "next", null);
        setField(term320911, term320911.getClass(), "first", null);
        setField(term320911, term320911.getClass(), "last", null);
        setField(term320911, term320911.getClass(), "propListHead", null);
        setIntField(term320911, term320911.getClass(), "sourcePosition", 0);
        setField(term320911, term320911.getClass(), "jsType", null);
        setField(term320911, term320911.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term320312;
        args[1] = term320404;
        args[2] = term320490;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term320226, args);
        assertTrue(recursiveEquals(term320226, term320962));
        assertTrue(recursiveEquals(term320312, term320963));
        assertTrue(recursiveEquals(term320404, term320964));
        assertTrue(recursiveEquals(term320490, term320965));
        assertTrue(recursiveEquals(retValue, term320911));
    }

};


