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

public class PeepholeFoldConstants_tryFoldComparison_8484431791281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306654;
     Object term306740;
     Object term306826;
     Object term306912;
     Object term307517;
     Object term307518;
     Object term307519;
     Object term307520;
     Object term307481;

    public PeepholeFoldConstants_tryFoldComparison_8484431791281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306654 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term306740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term306740, term306740.getClass(), "type", 14);
        term306826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term306826, term306826.getClass(), "type", 14);
        term306912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term307517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term307517, term307517.getClass(), "currentTraversal", null);
        term307518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term307518, term307518.getClass(), "functionName", null);
        setBooleanField(term307518, term307518.getClass(), "itsNeedsActivation", false);
        setIntField(term307518, term307518.getClass(), "itsFunctionType", 0);
        setBooleanField(term307518, term307518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307518, term307518.getClass(), "encodedSourceStart", 0);
        setIntField(term307518, term307518.getClass(), "encodedSourceEnd", 0);
        setField(term307518, term307518.getClass(), "sourceName", null);
        setIntField(term307518, term307518.getClass(), "baseLineno", 0);
        setIntField(term307518, term307518.getClass(), "endLineno", 0);
        setField(term307518, term307518.getClass(), "functions", null);
        setField(term307518, term307518.getClass(), "regexps", null);
        setField(term307518, term307518.getClass(), "itsVariables", null);
        setField(term307518, term307518.getClass(), "itsConst", null);
        setField(term307518, term307518.getClass(), "itsVariableNames", null);
        setIntField(term307518, term307518.getClass(), "varStart", 0);
        setField(term307518, term307518.getClass(), "compilerData", null);
        setIntField(term307518, term307518.getClass(), "type", 14);
        setField(term307518, term307518.getClass(), "next", null);
        setField(term307518, term307518.getClass(), "first", null);
        setField(term307518, term307518.getClass(), "last", null);
        setField(term307518, term307518.getClass(), "propListHead", null);
        setIntField(term307518, term307518.getClass(), "sourcePosition", 0);
        setField(term307518, term307518.getClass(), "jsType", null);
        setField(term307518, term307518.getClass(), "parent", null);
        term307519 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term307519, term307519.getClass(), "functionName", null);
        setBooleanField(term307519, term307519.getClass(), "itsNeedsActivation", false);
        setIntField(term307519, term307519.getClass(), "itsFunctionType", 0);
        setBooleanField(term307519, term307519.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307519, term307519.getClass(), "encodedSourceStart", 0);
        setIntField(term307519, term307519.getClass(), "encodedSourceEnd", 0);
        setField(term307519, term307519.getClass(), "sourceName", null);
        setIntField(term307519, term307519.getClass(), "baseLineno", 0);
        setIntField(term307519, term307519.getClass(), "endLineno", 0);
        setField(term307519, term307519.getClass(), "functions", null);
        setField(term307519, term307519.getClass(), "regexps", null);
        setField(term307519, term307519.getClass(), "itsVariables", null);
        setField(term307519, term307519.getClass(), "itsConst", null);
        setField(term307519, term307519.getClass(), "itsVariableNames", null);
        setIntField(term307519, term307519.getClass(), "varStart", 0);
        setField(term307519, term307519.getClass(), "compilerData", null);
        setIntField(term307519, term307519.getClass(), "type", 14);
        setField(term307519, term307519.getClass(), "next", null);
        setField(term307519, term307519.getClass(), "first", null);
        setField(term307519, term307519.getClass(), "last", null);
        setField(term307519, term307519.getClass(), "propListHead", null);
        setIntField(term307519, term307519.getClass(), "sourcePosition", 0);
        setField(term307519, term307519.getClass(), "jsType", null);
        setField(term307519, term307519.getClass(), "parent", null);
        term307520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term307520, term307520.getClass(), "functionName", null);
        setBooleanField(term307520, term307520.getClass(), "itsNeedsActivation", false);
        setIntField(term307520, term307520.getClass(), "itsFunctionType", 0);
        setBooleanField(term307520, term307520.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307520, term307520.getClass(), "encodedSourceStart", 0);
        setIntField(term307520, term307520.getClass(), "encodedSourceEnd", 0);
        setField(term307520, term307520.getClass(), "sourceName", null);
        setIntField(term307520, term307520.getClass(), "baseLineno", 0);
        setIntField(term307520, term307520.getClass(), "endLineno", 0);
        setField(term307520, term307520.getClass(), "functions", null);
        setField(term307520, term307520.getClass(), "regexps", null);
        setField(term307520, term307520.getClass(), "itsVariables", null);
        setField(term307520, term307520.getClass(), "itsConst", null);
        setField(term307520, term307520.getClass(), "itsVariableNames", null);
        setIntField(term307520, term307520.getClass(), "varStart", 0);
        setField(term307520, term307520.getClass(), "compilerData", null);
        setIntField(term307520, term307520.getClass(), "type", 0);
        setField(term307520, term307520.getClass(), "next", null);
        setField(term307520, term307520.getClass(), "first", null);
        setField(term307520, term307520.getClass(), "last", null);
        setField(term307520, term307520.getClass(), "propListHead", null);
        setIntField(term307520, term307520.getClass(), "sourcePosition", 0);
        setField(term307520, term307520.getClass(), "jsType", null);
        setField(term307520, term307520.getClass(), "parent", null);
        term307481 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term307481, term307481.getClass(), "functionName", null);
        setBooleanField(term307481, term307481.getClass(), "itsNeedsActivation", false);
        setIntField(term307481, term307481.getClass(), "itsFunctionType", 0);
        setBooleanField(term307481, term307481.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term307481, term307481.getClass(), "encodedSourceStart", 0);
        setIntField(term307481, term307481.getClass(), "encodedSourceEnd", 0);
        setField(term307481, term307481.getClass(), "sourceName", null);
        setIntField(term307481, term307481.getClass(), "baseLineno", 0);
        setIntField(term307481, term307481.getClass(), "endLineno", 0);
        setField(term307481, term307481.getClass(), "functions", null);
        setField(term307481, term307481.getClass(), "regexps", null);
        setField(term307481, term307481.getClass(), "itsVariables", null);
        setField(term307481, term307481.getClass(), "itsConst", null);
        setField(term307481, term307481.getClass(), "itsVariableNames", null);
        setIntField(term307481, term307481.getClass(), "varStart", 0);
        setField(term307481, term307481.getClass(), "compilerData", null);
        setIntField(term307481, term307481.getClass(), "type", 14);
        setField(term307481, term307481.getClass(), "next", null);
        setField(term307481, term307481.getClass(), "first", null);
        setField(term307481, term307481.getClass(), "last", null);
        setField(term307481, term307481.getClass(), "propListHead", null);
        setIntField(term307481, term307481.getClass(), "sourcePosition", 0);
        setField(term307481, term307481.getClass(), "jsType", null);
        setField(term307481, term307481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term306740;
        args[1] = term306826;
        args[2] = term306912;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term306654, args);
        assertTrue(recursiveEquals(term306654, term307517));
        assertTrue(recursiveEquals(term306740, term307518));
        assertTrue(recursiveEquals(term306826, term307519));
        assertTrue(recursiveEquals(term306912, term307520));
        assertTrue(recursiveEquals(retValue, term307481));
    }

};


