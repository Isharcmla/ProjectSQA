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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143245;
     Object term143331;
     Object term143584;
     Object term143585;
     Object term143508;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term143331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143417 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143417, term143417.getClass(), "next", term143487);
        setField(term143331, term143331.getClass(), "first", term143417);
        setIntField(term143331, term143331.getClass(), "type", 14);
        term143584 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term143584, term143584.getClass(), "currentTraversal", null);
        term143585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143585, term143585.getClass(), "functionName", null);
        setBooleanField(term143585, term143585.getClass(), "itsNeedsActivation", false);
        setIntField(term143585, term143585.getClass(), "itsFunctionType", 0);
        setBooleanField(term143585, term143585.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143585, term143585.getClass(), "encodedSourceStart", 0);
        setIntField(term143585, term143585.getClass(), "encodedSourceEnd", 0);
        setField(term143585, term143585.getClass(), "sourceName", null);
        setIntField(term143585, term143585.getClass(), "baseLineno", 0);
        setIntField(term143585, term143585.getClass(), "endLineno", 0);
        setField(term143585, term143585.getClass(), "functions", null);
        setField(term143585, term143585.getClass(), "regexps", null);
        setField(term143585, term143585.getClass(), "itsVariables", null);
        setField(term143585, term143585.getClass(), "itsConst", null);
        setField(term143585, term143585.getClass(), "itsVariableNames", null);
        setIntField(term143585, term143585.getClass(), "varStart", 0);
        setField(term143585, term143585.getClass(), "compilerData", null);
        setIntField(term143585, term143585.getClass(), "type", 14);
        setField(term143585, term143585.getClass(), "next", null);
        setField(term143586, term143586.getClass(), "functionName", null);
        setBooleanField(term143586, term143586.getClass(), "itsNeedsActivation", false);
        setIntField(term143586, term143586.getClass(), "itsFunctionType", 0);
        setBooleanField(term143586, term143586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143586, term143586.getClass(), "encodedSourceStart", 0);
        setIntField(term143586, term143586.getClass(), "encodedSourceEnd", 0);
        setField(term143586, term143586.getClass(), "sourceName", null);
        setIntField(term143586, term143586.getClass(), "baseLineno", 0);
        setIntField(term143586, term143586.getClass(), "endLineno", 0);
        setField(term143586, term143586.getClass(), "functions", null);
        setField(term143586, term143586.getClass(), "regexps", null);
        setField(term143586, term143586.getClass(), "itsVariables", null);
        setField(term143586, term143586.getClass(), "itsConst", null);
        setField(term143586, term143586.getClass(), "itsVariableNames", null);
        setIntField(term143586, term143586.getClass(), "varStart", 0);
        setField(term143586, term143586.getClass(), "compilerData", null);
        setIntField(term143586, term143586.getClass(), "type", 0);
        setIntField(term143587, term143587.getClass(), "type", 0);
        setField(term143587, term143587.getClass(), "next", null);
        setField(term143587, term143587.getClass(), "first", null);
        setField(term143587, term143587.getClass(), "last", null);
        setField(term143587, term143587.getClass(), "propListHead", null);
        setIntField(term143587, term143587.getClass(), "sourcePosition", 0);
        setField(term143587, term143587.getClass(), "jsType", null);
        setField(term143587, term143587.getClass(), "parent", null);
        setField(term143586, term143586.getClass(), "next", term143587);
        setField(term143586, term143586.getClass(), "first", null);
        setField(term143586, term143586.getClass(), "last", null);
        setField(term143586, term143586.getClass(), "propListHead", null);
        setIntField(term143586, term143586.getClass(), "sourcePosition", 0);
        setField(term143586, term143586.getClass(), "jsType", null);
        setField(term143586, term143586.getClass(), "parent", null);
        setField(term143585, term143585.getClass(), "first", term143586);
        setField(term143585, term143585.getClass(), "last", null);
        setField(term143585, term143585.getClass(), "propListHead", null);
        setIntField(term143585, term143585.getClass(), "sourcePosition", 0);
        setField(term143585, term143585.getClass(), "jsType", null);
        setField(term143585, term143585.getClass(), "parent", null);
        term143508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143508, term143508.getClass(), "functionName", null);
        setBooleanField(term143508, term143508.getClass(), "itsNeedsActivation", false);
        setIntField(term143508, term143508.getClass(), "itsFunctionType", 0);
        setBooleanField(term143508, term143508.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143508, term143508.getClass(), "encodedSourceStart", 0);
        setIntField(term143508, term143508.getClass(), "encodedSourceEnd", 0);
        setField(term143508, term143508.getClass(), "sourceName", null);
        setIntField(term143508, term143508.getClass(), "baseLineno", 0);
        setIntField(term143508, term143508.getClass(), "endLineno", 0);
        setField(term143508, term143508.getClass(), "functions", null);
        setField(term143508, term143508.getClass(), "regexps", null);
        setField(term143508, term143508.getClass(), "itsVariables", null);
        setField(term143508, term143508.getClass(), "itsConst", null);
        setField(term143508, term143508.getClass(), "itsVariableNames", null);
        setIntField(term143508, term143508.getClass(), "varStart", 0);
        setField(term143508, term143508.getClass(), "compilerData", null);
        setIntField(term143508, term143508.getClass(), "type", 14);
        setField(term143508, term143508.getClass(), "next", null);
        setField(term143518, term143518.getClass(), "functionName", null);
        setBooleanField(term143518, term143518.getClass(), "itsNeedsActivation", false);
        setIntField(term143518, term143518.getClass(), "itsFunctionType", 0);
        setBooleanField(term143518, term143518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143518, term143518.getClass(), "encodedSourceStart", 0);
        setIntField(term143518, term143518.getClass(), "encodedSourceEnd", 0);
        setField(term143518, term143518.getClass(), "sourceName", null);
        setIntField(term143518, term143518.getClass(), "baseLineno", 0);
        setIntField(term143518, term143518.getClass(), "endLineno", 0);
        setField(term143518, term143518.getClass(), "functions", null);
        setField(term143518, term143518.getClass(), "regexps", null);
        setField(term143518, term143518.getClass(), "itsVariables", null);
        setField(term143518, term143518.getClass(), "itsConst", null);
        setField(term143518, term143518.getClass(), "itsVariableNames", null);
        setIntField(term143518, term143518.getClass(), "varStart", 0);
        setField(term143518, term143518.getClass(), "compilerData", null);
        setIntField(term143518, term143518.getClass(), "type", 0);
        setIntField(term143528, term143528.getClass(), "type", 0);
        setField(term143528, term143528.getClass(), "next", null);
        setField(term143528, term143528.getClass(), "first", null);
        setField(term143528, term143528.getClass(), "last", null);
        setField(term143528, term143528.getClass(), "propListHead", null);
        setIntField(term143528, term143528.getClass(), "sourcePosition", 0);
        setField(term143528, term143528.getClass(), "jsType", null);
        setField(term143528, term143528.getClass(), "parent", null);
        setField(term143518, term143518.getClass(), "next", term143528);
        setField(term143518, term143518.getClass(), "first", null);
        setField(term143518, term143518.getClass(), "last", null);
        setField(term143518, term143518.getClass(), "propListHead", null);
        setIntField(term143518, term143518.getClass(), "sourcePosition", 0);
        setField(term143518, term143518.getClass(), "jsType", null);
        setField(term143518, term143518.getClass(), "parent", null);
        setField(term143508, term143508.getClass(), "first", term143518);
        setField(term143508, term143508.getClass(), "last", null);
        setField(term143508, term143508.getClass(), "propListHead", null);
        setIntField(term143508, term143508.getClass(), "sourcePosition", 0);
        setField(term143508, term143508.getClass(), "jsType", null);
        setField(term143508, term143508.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143331;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term143245, args);
        assertTrue(recursiveEquals(term143245, term143584));
        assertTrue(recursiveEquals(term143331, term143585));
        assertTrue(recursiveEquals(retValue, term143508));
    }

};


