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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841176;
     Object term841262;
     Object term841440;
     Object term841510;
     Object term842102;
     Object term842103;
     Object term842105;
     Object term842106;
     Object term842031;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term841262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term841348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term841262, term841262.getClass(), "parent", term841348);
        setIntField(term841262, term841262.getClass(), "type", 0);
        term841440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term841440, term841440.getClass(), "type", 0);
        term841510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term841510, term841510.getClass(), "type", 44);
        term842102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term842102, term842102.getClass(), "currentTraversal", null);
        term842103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term842104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term842103, term842103.getClass(), "functionName", null);
        setBooleanField(term842103, term842103.getClass(), "itsNeedsActivation", false);
        setIntField(term842103, term842103.getClass(), "itsFunctionType", 0);
        setBooleanField(term842103, term842103.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term842103, term842103.getClass(), "encodedSourceStart", 0);
        setIntField(term842103, term842103.getClass(), "encodedSourceEnd", 0);
        setField(term842103, term842103.getClass(), "sourceName", null);
        setIntField(term842103, term842103.getClass(), "baseLineno", 0);
        setIntField(term842103, term842103.getClass(), "endLineno", 0);
        setField(term842103, term842103.getClass(), "functions", null);
        setField(term842103, term842103.getClass(), "regexps", null);
        setField(term842103, term842103.getClass(), "itsVariables", null);
        setField(term842103, term842103.getClass(), "itsConst", null);
        setField(term842103, term842103.getClass(), "itsVariableNames", null);
        setIntField(term842103, term842103.getClass(), "varStart", 0);
        setField(term842103, term842103.getClass(), "compilerData", null);
        setIntField(term842103, term842103.getClass(), "type", 0);
        setField(term842103, term842103.getClass(), "next", null);
        setField(term842103, term842103.getClass(), "first", null);
        setField(term842103, term842103.getClass(), "last", null);
        setField(term842103, term842103.getClass(), "propListHead", null);
        setIntField(term842103, term842103.getClass(), "sourcePosition", 0);
        setField(term842103, term842103.getClass(), "jsType", null);
        setField(term842104, term842104.getClass(), "functionName", null);
        setBooleanField(term842104, term842104.getClass(), "itsNeedsActivation", false);
        setIntField(term842104, term842104.getClass(), "itsFunctionType", 0);
        setBooleanField(term842104, term842104.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term842104, term842104.getClass(), "encodedSourceStart", 0);
        setIntField(term842104, term842104.getClass(), "encodedSourceEnd", 0);
        setField(term842104, term842104.getClass(), "sourceName", null);
        setIntField(term842104, term842104.getClass(), "baseLineno", 0);
        setIntField(term842104, term842104.getClass(), "endLineno", 0);
        setField(term842104, term842104.getClass(), "functions", null);
        setField(term842104, term842104.getClass(), "regexps", null);
        setField(term842104, term842104.getClass(), "itsVariables", null);
        setField(term842104, term842104.getClass(), "itsConst", null);
        setField(term842104, term842104.getClass(), "itsVariableNames", null);
        setIntField(term842104, term842104.getClass(), "varStart", 0);
        setField(term842104, term842104.getClass(), "compilerData", null);
        setIntField(term842104, term842104.getClass(), "type", 0);
        setField(term842104, term842104.getClass(), "next", null);
        setField(term842104, term842104.getClass(), "first", null);
        setField(term842104, term842104.getClass(), "last", null);
        setField(term842104, term842104.getClass(), "propListHead", null);
        setIntField(term842104, term842104.getClass(), "sourcePosition", 0);
        setField(term842104, term842104.getClass(), "jsType", null);
        setField(term842104, term842104.getClass(), "parent", null);
        setField(term842103, term842103.getClass(), "parent", term842104);
        term842105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term842105, term842105.getClass(), "str", null);
        setIntField(term842105, term842105.getClass(), "type", 0);
        setField(term842105, term842105.getClass(), "next", null);
        setField(term842105, term842105.getClass(), "first", null);
        setField(term842105, term842105.getClass(), "last", null);
        setField(term842105, term842105.getClass(), "propListHead", null);
        setIntField(term842105, term842105.getClass(), "sourcePosition", 0);
        setField(term842105, term842105.getClass(), "jsType", null);
        setField(term842105, term842105.getClass(), "parent", null);
        term842106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term842106, term842106.getClass(), "type", 44);
        setField(term842106, term842106.getClass(), "next", null);
        setField(term842106, term842106.getClass(), "first", null);
        setField(term842106, term842106.getClass(), "last", null);
        setField(term842106, term842106.getClass(), "propListHead", null);
        setIntField(term842106, term842106.getClass(), "sourcePosition", 0);
        setField(term842106, term842106.getClass(), "jsType", null);
        setField(term842106, term842106.getClass(), "parent", null);
        term842031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term842042 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term842031, term842031.getClass(), "functionName", null);
        setBooleanField(term842031, term842031.getClass(), "itsNeedsActivation", false);
        setIntField(term842031, term842031.getClass(), "itsFunctionType", 0);
        setBooleanField(term842031, term842031.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term842031, term842031.getClass(), "encodedSourceStart", 0);
        setIntField(term842031, term842031.getClass(), "encodedSourceEnd", 0);
        setField(term842031, term842031.getClass(), "sourceName", null);
        setIntField(term842031, term842031.getClass(), "baseLineno", 0);
        setIntField(term842031, term842031.getClass(), "endLineno", 0);
        setField(term842031, term842031.getClass(), "functions", null);
        setField(term842031, term842031.getClass(), "regexps", null);
        setField(term842031, term842031.getClass(), "itsVariables", null);
        setField(term842031, term842031.getClass(), "itsConst", null);
        setField(term842031, term842031.getClass(), "itsVariableNames", null);
        setIntField(term842031, term842031.getClass(), "varStart", 0);
        setField(term842031, term842031.getClass(), "compilerData", null);
        setIntField(term842031, term842031.getClass(), "type", 0);
        setField(term842031, term842031.getClass(), "next", null);
        setField(term842031, term842031.getClass(), "first", null);
        setField(term842031, term842031.getClass(), "last", null);
        setField(term842031, term842031.getClass(), "propListHead", null);
        setIntField(term842031, term842031.getClass(), "sourcePosition", 0);
        setField(term842031, term842031.getClass(), "jsType", null);
        setField(term842042, term842042.getClass(), "functionName", null);
        setBooleanField(term842042, term842042.getClass(), "itsNeedsActivation", false);
        setIntField(term842042, term842042.getClass(), "itsFunctionType", 0);
        setBooleanField(term842042, term842042.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term842042, term842042.getClass(), "encodedSourceStart", 0);
        setIntField(term842042, term842042.getClass(), "encodedSourceEnd", 0);
        setField(term842042, term842042.getClass(), "sourceName", null);
        setIntField(term842042, term842042.getClass(), "baseLineno", 0);
        setIntField(term842042, term842042.getClass(), "endLineno", 0);
        setField(term842042, term842042.getClass(), "functions", null);
        setField(term842042, term842042.getClass(), "regexps", null);
        setField(term842042, term842042.getClass(), "itsVariables", null);
        setField(term842042, term842042.getClass(), "itsConst", null);
        setField(term842042, term842042.getClass(), "itsVariableNames", null);
        setIntField(term842042, term842042.getClass(), "varStart", 0);
        setField(term842042, term842042.getClass(), "compilerData", null);
        setIntField(term842042, term842042.getClass(), "type", 0);
        setField(term842042, term842042.getClass(), "next", null);
        setField(term842042, term842042.getClass(), "first", null);
        setField(term842042, term842042.getClass(), "last", null);
        setField(term842042, term842042.getClass(), "propListHead", null);
        setIntField(term842042, term842042.getClass(), "sourcePosition", 0);
        setField(term842042, term842042.getClass(), "jsType", null);
        setField(term842042, term842042.getClass(), "parent", null);
        setField(term842031, term842031.getClass(), "parent", term842042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term841262;
        args[1] = term841440;
        args[2] = term841510;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term841176, args);
        assertTrue(recursiveEquals(term841176, term842102));
        assertTrue(recursiveEquals(term841262, term842103));
        assertTrue(recursiveEquals(term841440, term842105));
        assertTrue(recursiveEquals(term841510, term842106));
        assertTrue(recursiveEquals(retValue, term842031));
    }

};


