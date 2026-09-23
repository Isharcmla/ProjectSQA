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

public class PeepholeFoldConstants_tryFoldComparison_848443179341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66282;
     Object term66368;
     Object term66454;
     Object term66540;
     Object term81217;
     Object term81218;
     Object term81219;
     Object term81220;
     Object term81183;

    public PeepholeFoldConstants_tryFoldComparison_848443179341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term66368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term66368, term66368.getClass(), "type", 16);
        term66454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term66454, term66454.getClass(), "type", 16);
        term66540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term81217 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81217, term81217.getClass(), "currentTraversal", null);
        term81218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81218, term81218.getClass(), "functionName", null);
        setBooleanField(term81218, term81218.getClass(), "itsNeedsActivation", false);
        setIntField(term81218, term81218.getClass(), "itsFunctionType", 0);
        setBooleanField(term81218, term81218.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81218, term81218.getClass(), "encodedSourceStart", 0);
        setIntField(term81218, term81218.getClass(), "encodedSourceEnd", 0);
        setField(term81218, term81218.getClass(), "sourceName", null);
        setIntField(term81218, term81218.getClass(), "baseLineno", 0);
        setIntField(term81218, term81218.getClass(), "endLineno", 0);
        setField(term81218, term81218.getClass(), "functions", null);
        setField(term81218, term81218.getClass(), "regexps", null);
        setField(term81218, term81218.getClass(), "itsVariables", null);
        setField(term81218, term81218.getClass(), "itsConst", null);
        setField(term81218, term81218.getClass(), "itsVariableNames", null);
        setIntField(term81218, term81218.getClass(), "varStart", 0);
        setField(term81218, term81218.getClass(), "compilerData", null);
        setIntField(term81218, term81218.getClass(), "type", 16);
        setField(term81218, term81218.getClass(), "next", null);
        setField(term81218, term81218.getClass(), "first", null);
        setField(term81218, term81218.getClass(), "last", null);
        setField(term81218, term81218.getClass(), "propListHead", null);
        setIntField(term81218, term81218.getClass(), "sourcePosition", 0);
        setField(term81218, term81218.getClass(), "jsType", null);
        setField(term81218, term81218.getClass(), "parent", null);
        term81219 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81219, term81219.getClass(), "functionName", null);
        setBooleanField(term81219, term81219.getClass(), "itsNeedsActivation", false);
        setIntField(term81219, term81219.getClass(), "itsFunctionType", 0);
        setBooleanField(term81219, term81219.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81219, term81219.getClass(), "encodedSourceStart", 0);
        setIntField(term81219, term81219.getClass(), "encodedSourceEnd", 0);
        setField(term81219, term81219.getClass(), "sourceName", null);
        setIntField(term81219, term81219.getClass(), "baseLineno", 0);
        setIntField(term81219, term81219.getClass(), "endLineno", 0);
        setField(term81219, term81219.getClass(), "functions", null);
        setField(term81219, term81219.getClass(), "regexps", null);
        setField(term81219, term81219.getClass(), "itsVariables", null);
        setField(term81219, term81219.getClass(), "itsConst", null);
        setField(term81219, term81219.getClass(), "itsVariableNames", null);
        setIntField(term81219, term81219.getClass(), "varStart", 0);
        setField(term81219, term81219.getClass(), "compilerData", null);
        setIntField(term81219, term81219.getClass(), "type", 16);
        setField(term81219, term81219.getClass(), "next", null);
        setField(term81219, term81219.getClass(), "first", null);
        setField(term81219, term81219.getClass(), "last", null);
        setField(term81219, term81219.getClass(), "propListHead", null);
        setIntField(term81219, term81219.getClass(), "sourcePosition", 0);
        setField(term81219, term81219.getClass(), "jsType", null);
        setField(term81219, term81219.getClass(), "parent", null);
        term81220 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81220, term81220.getClass(), "functionName", null);
        setBooleanField(term81220, term81220.getClass(), "itsNeedsActivation", false);
        setIntField(term81220, term81220.getClass(), "itsFunctionType", 0);
        setBooleanField(term81220, term81220.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81220, term81220.getClass(), "encodedSourceStart", 0);
        setIntField(term81220, term81220.getClass(), "encodedSourceEnd", 0);
        setField(term81220, term81220.getClass(), "sourceName", null);
        setIntField(term81220, term81220.getClass(), "baseLineno", 0);
        setIntField(term81220, term81220.getClass(), "endLineno", 0);
        setField(term81220, term81220.getClass(), "functions", null);
        setField(term81220, term81220.getClass(), "regexps", null);
        setField(term81220, term81220.getClass(), "itsVariables", null);
        setField(term81220, term81220.getClass(), "itsConst", null);
        setField(term81220, term81220.getClass(), "itsVariableNames", null);
        setIntField(term81220, term81220.getClass(), "varStart", 0);
        setField(term81220, term81220.getClass(), "compilerData", null);
        setIntField(term81220, term81220.getClass(), "type", 0);
        setField(term81220, term81220.getClass(), "next", null);
        setField(term81220, term81220.getClass(), "first", null);
        setField(term81220, term81220.getClass(), "last", null);
        setField(term81220, term81220.getClass(), "propListHead", null);
        setIntField(term81220, term81220.getClass(), "sourcePosition", 0);
        setField(term81220, term81220.getClass(), "jsType", null);
        setField(term81220, term81220.getClass(), "parent", null);
        term81183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81183, term81183.getClass(), "functionName", null);
        setBooleanField(term81183, term81183.getClass(), "itsNeedsActivation", false);
        setIntField(term81183, term81183.getClass(), "itsFunctionType", 0);
        setBooleanField(term81183, term81183.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81183, term81183.getClass(), "encodedSourceStart", 0);
        setIntField(term81183, term81183.getClass(), "encodedSourceEnd", 0);
        setField(term81183, term81183.getClass(), "sourceName", null);
        setIntField(term81183, term81183.getClass(), "baseLineno", 0);
        setIntField(term81183, term81183.getClass(), "endLineno", 0);
        setField(term81183, term81183.getClass(), "functions", null);
        setField(term81183, term81183.getClass(), "regexps", null);
        setField(term81183, term81183.getClass(), "itsVariables", null);
        setField(term81183, term81183.getClass(), "itsConst", null);
        setField(term81183, term81183.getClass(), "itsVariableNames", null);
        setIntField(term81183, term81183.getClass(), "varStart", 0);
        setField(term81183, term81183.getClass(), "compilerData", null);
        setIntField(term81183, term81183.getClass(), "type", 16);
        setField(term81183, term81183.getClass(), "next", null);
        setField(term81183, term81183.getClass(), "first", null);
        setField(term81183, term81183.getClass(), "last", null);
        setField(term81183, term81183.getClass(), "propListHead", null);
        setIntField(term81183, term81183.getClass(), "sourcePosition", 0);
        setField(term81183, term81183.getClass(), "jsType", null);
        setField(term81183, term81183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term66368;
        args[1] = term66454;
        args[2] = term66540;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term66282, args);
        assertTrue(recursiveEquals(term66282, term81217));
        assertTrue(recursiveEquals(term66368, term81218));
        assertTrue(recursiveEquals(term66454, term81219));
        assertTrue(recursiveEquals(term66540, term81220));
        assertTrue(recursiveEquals(retValue, term81183));
    }

};


