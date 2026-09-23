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

public class PeepholeFoldConstants_tryFoldComparison_848443179239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47350;
     Object term47436;
     Object term47522;
     Object term47614;
     Object term48101;
     Object term48102;
     Object term48103;
     Object term48104;
     Object term48073;

    public PeepholeFoldConstants_tryFoldComparison_848443179239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47350 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term47436 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term47436, term47436.getClass(), "type", 16);
        term47522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term47522, term47522.getClass(), "type", 42);
        term47614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term47614, term47614.getClass(), "type", 42);
        term48101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term48101, term48101.getClass(), "currentTraversal", null);
        term48102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48102, term48102.getClass(), "functionName", null);
        setBooleanField(term48102, term48102.getClass(), "itsNeedsActivation", false);
        setIntField(term48102, term48102.getClass(), "itsFunctionType", 0);
        setBooleanField(term48102, term48102.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48102, term48102.getClass(), "encodedSourceStart", 0);
        setIntField(term48102, term48102.getClass(), "encodedSourceEnd", 0);
        setField(term48102, term48102.getClass(), "sourceName", null);
        setIntField(term48102, term48102.getClass(), "baseLineno", 0);
        setIntField(term48102, term48102.getClass(), "endLineno", 0);
        setField(term48102, term48102.getClass(), "functions", null);
        setField(term48102, term48102.getClass(), "regexps", null);
        setField(term48102, term48102.getClass(), "itsVariables", null);
        setField(term48102, term48102.getClass(), "itsConst", null);
        setField(term48102, term48102.getClass(), "itsVariableNames", null);
        setIntField(term48102, term48102.getClass(), "varStart", 0);
        setField(term48102, term48102.getClass(), "compilerData", null);
        setIntField(term48102, term48102.getClass(), "type", 42);
        setField(term48102, term48102.getClass(), "next", null);
        setField(term48102, term48102.getClass(), "first", null);
        setField(term48102, term48102.getClass(), "last", null);
        setField(term48102, term48102.getClass(), "propListHead", null);
        setIntField(term48102, term48102.getClass(), "sourcePosition", 0);
        setField(term48102, term48102.getClass(), "jsType", null);
        setField(term48102, term48102.getClass(), "parent", null);
        term48103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48103, term48103.getClass(), "functionName", null);
        setBooleanField(term48103, term48103.getClass(), "itsNeedsActivation", false);
        setIntField(term48103, term48103.getClass(), "itsFunctionType", 0);
        setBooleanField(term48103, term48103.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48103, term48103.getClass(), "encodedSourceStart", 0);
        setIntField(term48103, term48103.getClass(), "encodedSourceEnd", 0);
        setField(term48103, term48103.getClass(), "sourceName", null);
        setIntField(term48103, term48103.getClass(), "baseLineno", 0);
        setIntField(term48103, term48103.getClass(), "endLineno", 0);
        setField(term48103, term48103.getClass(), "functions", null);
        setField(term48103, term48103.getClass(), "regexps", null);
        setField(term48103, term48103.getClass(), "itsVariables", null);
        setField(term48103, term48103.getClass(), "itsConst", null);
        setField(term48103, term48103.getClass(), "itsVariableNames", null);
        setIntField(term48103, term48103.getClass(), "varStart", 0);
        setField(term48103, term48103.getClass(), "compilerData", null);
        setIntField(term48103, term48103.getClass(), "type", 16);
        setField(term48103, term48103.getClass(), "next", null);
        setField(term48103, term48103.getClass(), "first", null);
        setField(term48103, term48103.getClass(), "last", null);
        setField(term48103, term48103.getClass(), "propListHead", null);
        setIntField(term48103, term48103.getClass(), "sourcePosition", 0);
        setField(term48103, term48103.getClass(), "jsType", null);
        setField(term48103, term48103.getClass(), "parent", null);
        term48104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48104, term48104.getClass(), "str", null);
        setIntField(term48104, term48104.getClass(), "type", 42);
        setField(term48104, term48104.getClass(), "next", null);
        setField(term48104, term48104.getClass(), "first", null);
        setField(term48104, term48104.getClass(), "last", null);
        setField(term48104, term48104.getClass(), "propListHead", null);
        setIntField(term48104, term48104.getClass(), "sourcePosition", 0);
        setField(term48104, term48104.getClass(), "jsType", null);
        setField(term48104, term48104.getClass(), "parent", null);
        term48073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48073, term48073.getClass(), "functionName", null);
        setBooleanField(term48073, term48073.getClass(), "itsNeedsActivation", false);
        setIntField(term48073, term48073.getClass(), "itsFunctionType", 0);
        setBooleanField(term48073, term48073.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48073, term48073.getClass(), "encodedSourceStart", 0);
        setIntField(term48073, term48073.getClass(), "encodedSourceEnd", 0);
        setField(term48073, term48073.getClass(), "sourceName", null);
        setIntField(term48073, term48073.getClass(), "baseLineno", 0);
        setIntField(term48073, term48073.getClass(), "endLineno", 0);
        setField(term48073, term48073.getClass(), "functions", null);
        setField(term48073, term48073.getClass(), "regexps", null);
        setField(term48073, term48073.getClass(), "itsVariables", null);
        setField(term48073, term48073.getClass(), "itsConst", null);
        setField(term48073, term48073.getClass(), "itsVariableNames", null);
        setIntField(term48073, term48073.getClass(), "varStart", 0);
        setField(term48073, term48073.getClass(), "compilerData", null);
        setIntField(term48073, term48073.getClass(), "type", 16);
        setField(term48073, term48073.getClass(), "next", null);
        setField(term48073, term48073.getClass(), "first", null);
        setField(term48073, term48073.getClass(), "last", null);
        setField(term48073, term48073.getClass(), "propListHead", null);
        setIntField(term48073, term48073.getClass(), "sourcePosition", 0);
        setField(term48073, term48073.getClass(), "jsType", null);
        setField(term48073, term48073.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term47436;
        args[1] = term47522;
        args[2] = term47614;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term47350, args);
        assertTrue(recursiveEquals(term47350, term48101));
        assertTrue(recursiveEquals(term47436, term48102));
        assertTrue(recursiveEquals(term47522, term48103));
        assertTrue(recursiveEquals(term47614, term48104));
        assertTrue(recursiveEquals(retValue, term48073));
    }

};


