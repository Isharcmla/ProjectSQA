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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612507;
     Object term612593;
     Object term612749;
     Object term612835;
     Object term612936;
     Object term612937;
     Object term612939;
     Object term612940;
     Object term612845;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term612593 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term612663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term612663, term612663.getClass(), "type", 108);
        setField(term612593, term612593.getClass(), "parent", term612663);
        setIntField(term612593, term612593.getClass(), "type", 0);
        term612749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term612749, term612749.getClass(), "type", 48);
        term612835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term612835, term612835.getClass(), "type", 63);
        term612936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term612936, term612936.getClass(), "currentTraversal", null);
        term612937 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term612938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term612937, term612937.getClass(), "functionName", null);
        setBooleanField(term612937, term612937.getClass(), "itsNeedsActivation", false);
        setIntField(term612937, term612937.getClass(), "itsFunctionType", 0);
        setBooleanField(term612937, term612937.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term612937, term612937.getClass(), "encodedSourceStart", 0);
        setIntField(term612937, term612937.getClass(), "encodedSourceEnd", 0);
        setField(term612937, term612937.getClass(), "sourceName", null);
        setIntField(term612937, term612937.getClass(), "baseLineno", 0);
        setIntField(term612937, term612937.getClass(), "endLineno", 0);
        setField(term612937, term612937.getClass(), "functions", null);
        setField(term612937, term612937.getClass(), "regexps", null);
        setField(term612937, term612937.getClass(), "itsVariables", null);
        setField(term612937, term612937.getClass(), "itsConst", null);
        setField(term612937, term612937.getClass(), "itsVariableNames", null);
        setIntField(term612937, term612937.getClass(), "varStart", 0);
        setField(term612937, term612937.getClass(), "compilerData", null);
        setIntField(term612937, term612937.getClass(), "type", 0);
        setField(term612937, term612937.getClass(), "next", null);
        setField(term612937, term612937.getClass(), "first", null);
        setField(term612937, term612937.getClass(), "last", null);
        setField(term612937, term612937.getClass(), "propListHead", null);
        setIntField(term612937, term612937.getClass(), "sourcePosition", 0);
        setField(term612937, term612937.getClass(), "jsType", null);
        setIntField(term612938, term612938.getClass(), "type", 108);
        setField(term612938, term612938.getClass(), "next", null);
        setField(term612938, term612938.getClass(), "first", null);
        setField(term612938, term612938.getClass(), "last", null);
        setField(term612938, term612938.getClass(), "propListHead", null);
        setIntField(term612938, term612938.getClass(), "sourcePosition", 0);
        setField(term612938, term612938.getClass(), "jsType", null);
        setField(term612938, term612938.getClass(), "parent", null);
        setField(term612937, term612937.getClass(), "parent", term612938);
        term612939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term612939, term612939.getClass(), "functionName", null);
        setBooleanField(term612939, term612939.getClass(), "itsNeedsActivation", false);
        setIntField(term612939, term612939.getClass(), "itsFunctionType", 0);
        setBooleanField(term612939, term612939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term612939, term612939.getClass(), "encodedSourceStart", 0);
        setIntField(term612939, term612939.getClass(), "encodedSourceEnd", 0);
        setField(term612939, term612939.getClass(), "sourceName", null);
        setIntField(term612939, term612939.getClass(), "baseLineno", 0);
        setIntField(term612939, term612939.getClass(), "endLineno", 0);
        setField(term612939, term612939.getClass(), "functions", null);
        setField(term612939, term612939.getClass(), "regexps", null);
        setField(term612939, term612939.getClass(), "itsVariables", null);
        setField(term612939, term612939.getClass(), "itsConst", null);
        setField(term612939, term612939.getClass(), "itsVariableNames", null);
        setIntField(term612939, term612939.getClass(), "varStart", 0);
        setField(term612939, term612939.getClass(), "compilerData", null);
        setIntField(term612939, term612939.getClass(), "type", 48);
        setField(term612939, term612939.getClass(), "next", null);
        setField(term612939, term612939.getClass(), "first", null);
        setField(term612939, term612939.getClass(), "last", null);
        setField(term612939, term612939.getClass(), "propListHead", null);
        setIntField(term612939, term612939.getClass(), "sourcePosition", 0);
        setField(term612939, term612939.getClass(), "jsType", null);
        setField(term612939, term612939.getClass(), "parent", null);
        term612940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term612940, term612940.getClass(), "functionName", null);
        setBooleanField(term612940, term612940.getClass(), "itsNeedsActivation", false);
        setIntField(term612940, term612940.getClass(), "itsFunctionType", 0);
        setBooleanField(term612940, term612940.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term612940, term612940.getClass(), "encodedSourceStart", 0);
        setIntField(term612940, term612940.getClass(), "encodedSourceEnd", 0);
        setField(term612940, term612940.getClass(), "sourceName", null);
        setIntField(term612940, term612940.getClass(), "baseLineno", 0);
        setIntField(term612940, term612940.getClass(), "endLineno", 0);
        setField(term612940, term612940.getClass(), "functions", null);
        setField(term612940, term612940.getClass(), "regexps", null);
        setField(term612940, term612940.getClass(), "itsVariables", null);
        setField(term612940, term612940.getClass(), "itsConst", null);
        setField(term612940, term612940.getClass(), "itsVariableNames", null);
        setIntField(term612940, term612940.getClass(), "varStart", 0);
        setField(term612940, term612940.getClass(), "compilerData", null);
        setIntField(term612940, term612940.getClass(), "type", 63);
        setField(term612940, term612940.getClass(), "next", null);
        setField(term612940, term612940.getClass(), "first", null);
        setField(term612940, term612940.getClass(), "last", null);
        setField(term612940, term612940.getClass(), "propListHead", null);
        setIntField(term612940, term612940.getClass(), "sourcePosition", 0);
        setField(term612940, term612940.getClass(), "jsType", null);
        setField(term612940, term612940.getClass(), "parent", null);
        term612845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term612856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term612845, term612845.getClass(), "functionName", null);
        setBooleanField(term612845, term612845.getClass(), "itsNeedsActivation", false);
        setIntField(term612845, term612845.getClass(), "itsFunctionType", 0);
        setBooleanField(term612845, term612845.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term612845, term612845.getClass(), "encodedSourceStart", 0);
        setIntField(term612845, term612845.getClass(), "encodedSourceEnd", 0);
        setField(term612845, term612845.getClass(), "sourceName", null);
        setIntField(term612845, term612845.getClass(), "baseLineno", 0);
        setIntField(term612845, term612845.getClass(), "endLineno", 0);
        setField(term612845, term612845.getClass(), "functions", null);
        setField(term612845, term612845.getClass(), "regexps", null);
        setField(term612845, term612845.getClass(), "itsVariables", null);
        setField(term612845, term612845.getClass(), "itsConst", null);
        setField(term612845, term612845.getClass(), "itsVariableNames", null);
        setIntField(term612845, term612845.getClass(), "varStart", 0);
        setField(term612845, term612845.getClass(), "compilerData", null);
        setIntField(term612845, term612845.getClass(), "type", 0);
        setField(term612845, term612845.getClass(), "next", null);
        setField(term612845, term612845.getClass(), "first", null);
        setField(term612845, term612845.getClass(), "last", null);
        setField(term612845, term612845.getClass(), "propListHead", null);
        setIntField(term612845, term612845.getClass(), "sourcePosition", 0);
        setField(term612845, term612845.getClass(), "jsType", null);
        setIntField(term612856, term612856.getClass(), "type", 108);
        setField(term612856, term612856.getClass(), "next", null);
        setField(term612856, term612856.getClass(), "first", null);
        setField(term612856, term612856.getClass(), "last", null);
        setField(term612856, term612856.getClass(), "propListHead", null);
        setIntField(term612856, term612856.getClass(), "sourcePosition", 0);
        setField(term612856, term612856.getClass(), "jsType", null);
        setField(term612856, term612856.getClass(), "parent", null);
        setField(term612845, term612845.getClass(), "parent", term612856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term612593;
        args[1] = term612749;
        args[2] = term612835;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term612507, args);
        assertTrue(recursiveEquals(term612507, term612936));
        assertTrue(recursiveEquals(term612593, term612937));
        assertTrue(recursiveEquals(term612749, term612939));
        assertTrue(recursiveEquals(term612835, term612940));
        assertTrue(recursiveEquals(retValue, term612845));
    }

};


