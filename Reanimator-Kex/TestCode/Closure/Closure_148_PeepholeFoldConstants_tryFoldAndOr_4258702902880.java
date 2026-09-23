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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839354;
     Object term839440;
     Object term839530;
     Object term839620;
     Object term839786;
     Object term839787;
     Object term839788;
     Object term839789;
     Object term839730;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term839440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term839440, term839440.getClass(), "parent", null);
        setIntField(term839440, term839440.getClass(), "type", 0);
        term839530 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term839530, term839530.getClass(), "type", 0);
        term839620 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term839786 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term839786, term839786.getClass(), "currentTraversal", null);
        term839787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term839787, term839787.getClass(), "functionName", null);
        setBooleanField(term839787, term839787.getClass(), "itsNeedsActivation", false);
        setIntField(term839787, term839787.getClass(), "itsFunctionType", 0);
        setBooleanField(term839787, term839787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839787, term839787.getClass(), "encodedSourceStart", 0);
        setIntField(term839787, term839787.getClass(), "encodedSourceEnd", 0);
        setField(term839787, term839787.getClass(), "sourceName", null);
        setIntField(term839787, term839787.getClass(), "baseLineno", 0);
        setIntField(term839787, term839787.getClass(), "endLineno", 0);
        setField(term839787, term839787.getClass(), "functions", null);
        setField(term839787, term839787.getClass(), "regexps", null);
        setField(term839787, term839787.getClass(), "itsVariables", null);
        setField(term839787, term839787.getClass(), "itsConst", null);
        setField(term839787, term839787.getClass(), "itsVariableNames", null);
        setIntField(term839787, term839787.getClass(), "varStart", 0);
        setField(term839787, term839787.getClass(), "compilerData", null);
        setIntField(term839787, term839787.getClass(), "type", 0);
        setField(term839787, term839787.getClass(), "next", null);
        setField(term839787, term839787.getClass(), "first", null);
        setField(term839787, term839787.getClass(), "last", null);
        setField(term839787, term839787.getClass(), "propListHead", null);
        setIntField(term839787, term839787.getClass(), "sourcePosition", 0);
        setField(term839787, term839787.getClass(), "jsType", null);
        setField(term839787, term839787.getClass(), "parent", null);
        term839788 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term839788, term839788.getClass(), "encodedSourceStart", 0);
        setIntField(term839788, term839788.getClass(), "encodedSourceEnd", 0);
        setField(term839788, term839788.getClass(), "sourceName", null);
        setIntField(term839788, term839788.getClass(), "baseLineno", 0);
        setIntField(term839788, term839788.getClass(), "endLineno", 0);
        setField(term839788, term839788.getClass(), "functions", null);
        setField(term839788, term839788.getClass(), "regexps", null);
        setField(term839788, term839788.getClass(), "itsVariables", null);
        setField(term839788, term839788.getClass(), "itsConst", null);
        setField(term839788, term839788.getClass(), "itsVariableNames", null);
        setIntField(term839788, term839788.getClass(), "varStart", 0);
        setField(term839788, term839788.getClass(), "compilerData", null);
        setIntField(term839788, term839788.getClass(), "type", 0);
        setField(term839788, term839788.getClass(), "next", null);
        setField(term839788, term839788.getClass(), "first", null);
        setField(term839788, term839788.getClass(), "last", null);
        setField(term839788, term839788.getClass(), "propListHead", null);
        setIntField(term839788, term839788.getClass(), "sourcePosition", 0);
        setField(term839788, term839788.getClass(), "jsType", null);
        setField(term839788, term839788.getClass(), "parent", null);
        term839789 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term839789, term839789.getClass(), "encodedSourceStart", 0);
        setIntField(term839789, term839789.getClass(), "encodedSourceEnd", 0);
        setField(term839789, term839789.getClass(), "sourceName", null);
        setIntField(term839789, term839789.getClass(), "baseLineno", 0);
        setIntField(term839789, term839789.getClass(), "endLineno", 0);
        setField(term839789, term839789.getClass(), "functions", null);
        setField(term839789, term839789.getClass(), "regexps", null);
        setField(term839789, term839789.getClass(), "itsVariables", null);
        setField(term839789, term839789.getClass(), "itsConst", null);
        setField(term839789, term839789.getClass(), "itsVariableNames", null);
        setIntField(term839789, term839789.getClass(), "varStart", 0);
        setField(term839789, term839789.getClass(), "compilerData", null);
        setIntField(term839789, term839789.getClass(), "type", 0);
        setField(term839789, term839789.getClass(), "next", null);
        setField(term839789, term839789.getClass(), "first", null);
        setField(term839789, term839789.getClass(), "last", null);
        setField(term839789, term839789.getClass(), "propListHead", null);
        setIntField(term839789, term839789.getClass(), "sourcePosition", 0);
        setField(term839789, term839789.getClass(), "jsType", null);
        setField(term839789, term839789.getClass(), "parent", null);
        term839730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term839730, term839730.getClass(), "functionName", null);
        setBooleanField(term839730, term839730.getClass(), "itsNeedsActivation", false);
        setIntField(term839730, term839730.getClass(), "itsFunctionType", 0);
        setBooleanField(term839730, term839730.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term839730, term839730.getClass(), "encodedSourceStart", 0);
        setIntField(term839730, term839730.getClass(), "encodedSourceEnd", 0);
        setField(term839730, term839730.getClass(), "sourceName", null);
        setIntField(term839730, term839730.getClass(), "baseLineno", 0);
        setIntField(term839730, term839730.getClass(), "endLineno", 0);
        setField(term839730, term839730.getClass(), "functions", null);
        setField(term839730, term839730.getClass(), "regexps", null);
        setField(term839730, term839730.getClass(), "itsVariables", null);
        setField(term839730, term839730.getClass(), "itsConst", null);
        setField(term839730, term839730.getClass(), "itsVariableNames", null);
        setIntField(term839730, term839730.getClass(), "varStart", 0);
        setField(term839730, term839730.getClass(), "compilerData", null);
        setIntField(term839730, term839730.getClass(), "type", 0);
        setField(term839730, term839730.getClass(), "next", null);
        setField(term839730, term839730.getClass(), "first", null);
        setField(term839730, term839730.getClass(), "last", null);
        setField(term839730, term839730.getClass(), "propListHead", null);
        setIntField(term839730, term839730.getClass(), "sourcePosition", 0);
        setField(term839730, term839730.getClass(), "jsType", null);
        setField(term839730, term839730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term839440;
        args[1] = term839530;
        args[2] = term839620;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term839354, args);
        assertTrue(recursiveEquals(term839354, term839786));
        assertTrue(recursiveEquals(term839440, term839787));
        assertTrue(recursiveEquals(term839530, term839788));
        assertTrue(recursiveEquals(term839620, term839789));
        assertTrue(recursiveEquals(retValue, term839730));
    }

};


