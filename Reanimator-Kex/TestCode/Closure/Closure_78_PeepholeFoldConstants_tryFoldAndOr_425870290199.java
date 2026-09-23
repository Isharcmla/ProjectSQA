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

public class PeepholeFoldConstants_tryFoldAndOr_425870290199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32599;
     Object term32685;
     Object term32771;
     Object term32825;
     Object term32826;
     Object term32827;
     Object term32787;

    public PeepholeFoldConstants_tryFoldAndOr_425870290199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32599 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32685, term32685.getClass(), "parent", null);
        setIntField(term32685, term32685.getClass(), "type", 0);
        term32771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term32825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32825, term32825.getClass(), "currentTraversal", null);
        term32826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32826, term32826.getClass(), "functionName", null);
        setBooleanField(term32826, term32826.getClass(), "itsNeedsActivation", false);
        setIntField(term32826, term32826.getClass(), "itsFunctionType", 0);
        setBooleanField(term32826, term32826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32826, term32826.getClass(), "encodedSourceStart", 0);
        setIntField(term32826, term32826.getClass(), "encodedSourceEnd", 0);
        setField(term32826, term32826.getClass(), "sourceName", null);
        setIntField(term32826, term32826.getClass(), "baseLineno", 0);
        setIntField(term32826, term32826.getClass(), "endLineno", 0);
        setField(term32826, term32826.getClass(), "functions", null);
        setField(term32826, term32826.getClass(), "regexps", null);
        setField(term32826, term32826.getClass(), "itsVariables", null);
        setField(term32826, term32826.getClass(), "itsConst", null);
        setField(term32826, term32826.getClass(), "itsVariableNames", null);
        setIntField(term32826, term32826.getClass(), "varStart", 0);
        setField(term32826, term32826.getClass(), "compilerData", null);
        setIntField(term32826, term32826.getClass(), "type", 0);
        setField(term32826, term32826.getClass(), "next", null);
        setField(term32826, term32826.getClass(), "first", null);
        setField(term32826, term32826.getClass(), "last", null);
        setField(term32826, term32826.getClass(), "propListHead", null);
        setIntField(term32826, term32826.getClass(), "sourcePosition", 0);
        setField(term32826, term32826.getClass(), "jsType", null);
        setField(term32826, term32826.getClass(), "parent", null);
        term32827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32827, term32827.getClass(), "functionName", null);
        setBooleanField(term32827, term32827.getClass(), "itsNeedsActivation", false);
        setIntField(term32827, term32827.getClass(), "itsFunctionType", 0);
        setBooleanField(term32827, term32827.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32827, term32827.getClass(), "encodedSourceStart", 0);
        setIntField(term32827, term32827.getClass(), "encodedSourceEnd", 0);
        setField(term32827, term32827.getClass(), "sourceName", null);
        setIntField(term32827, term32827.getClass(), "baseLineno", 0);
        setIntField(term32827, term32827.getClass(), "endLineno", 0);
        setField(term32827, term32827.getClass(), "functions", null);
        setField(term32827, term32827.getClass(), "regexps", null);
        setField(term32827, term32827.getClass(), "itsVariables", null);
        setField(term32827, term32827.getClass(), "itsConst", null);
        setField(term32827, term32827.getClass(), "itsVariableNames", null);
        setIntField(term32827, term32827.getClass(), "varStart", 0);
        setField(term32827, term32827.getClass(), "compilerData", null);
        setIntField(term32827, term32827.getClass(), "type", 0);
        setField(term32827, term32827.getClass(), "next", null);
        setField(term32827, term32827.getClass(), "first", null);
        setField(term32827, term32827.getClass(), "last", null);
        setField(term32827, term32827.getClass(), "propListHead", null);
        setIntField(term32827, term32827.getClass(), "sourcePosition", 0);
        setField(term32827, term32827.getClass(), "jsType", null);
        setField(term32827, term32827.getClass(), "parent", null);
        term32787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32787, term32787.getClass(), "functionName", null);
        setBooleanField(term32787, term32787.getClass(), "itsNeedsActivation", false);
        setIntField(term32787, term32787.getClass(), "itsFunctionType", 0);
        setBooleanField(term32787, term32787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32787, term32787.getClass(), "encodedSourceStart", 0);
        setIntField(term32787, term32787.getClass(), "encodedSourceEnd", 0);
        setField(term32787, term32787.getClass(), "sourceName", null);
        setIntField(term32787, term32787.getClass(), "baseLineno", 0);
        setIntField(term32787, term32787.getClass(), "endLineno", 0);
        setField(term32787, term32787.getClass(), "functions", null);
        setField(term32787, term32787.getClass(), "regexps", null);
        setField(term32787, term32787.getClass(), "itsVariables", null);
        setField(term32787, term32787.getClass(), "itsConst", null);
        setField(term32787, term32787.getClass(), "itsVariableNames", null);
        setIntField(term32787, term32787.getClass(), "varStart", 0);
        setField(term32787, term32787.getClass(), "compilerData", null);
        setIntField(term32787, term32787.getClass(), "type", 0);
        setField(term32787, term32787.getClass(), "next", null);
        setField(term32787, term32787.getClass(), "first", null);
        setField(term32787, term32787.getClass(), "last", null);
        setField(term32787, term32787.getClass(), "propListHead", null);
        setIntField(term32787, term32787.getClass(), "sourcePosition", 0);
        setField(term32787, term32787.getClass(), "jsType", null);
        setField(term32787, term32787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term32685;
        args[1] = term32771;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term32599, args);
        assertTrue(recursiveEquals(term32599, term32825));
        assertTrue(recursiveEquals(term32685, term32826));
        assertTrue(recursiveEquals(term32771, term32827));
        assertTrue(recursiveEquals(retValue, term32787));
    }

};


