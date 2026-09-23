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

public class PeepholeFoldConstants_tryFoldAndOr_425870290256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49089;
     Object term49175;
     Object term49261;
     Object term49351;
     Object term49468;
     Object term49469;
     Object term49470;
     Object term49471;
     Object term49409;

    public PeepholeFoldConstants_tryFoldAndOr_425870290256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49089 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49175, term49175.getClass(), "parent", null);
        setIntField(term49175, term49175.getClass(), "type", 0);
        term49261 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term49261, term49261.getClass(), "type", 0);
        term49351 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term49468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term49468, term49468.getClass(), "currentTraversal", null);
        term49469 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49469, term49469.getClass(), "functionName", null);
        setBooleanField(term49469, term49469.getClass(), "itsNeedsActivation", false);
        setIntField(term49469, term49469.getClass(), "itsFunctionType", 0);
        setBooleanField(term49469, term49469.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49469, term49469.getClass(), "encodedSourceStart", 0);
        setIntField(term49469, term49469.getClass(), "encodedSourceEnd", 0);
        setField(term49469, term49469.getClass(), "sourceName", null);
        setIntField(term49469, term49469.getClass(), "baseLineno", 0);
        setIntField(term49469, term49469.getClass(), "endLineno", 0);
        setField(term49469, term49469.getClass(), "functions", null);
        setField(term49469, term49469.getClass(), "regexps", null);
        setField(term49469, term49469.getClass(), "itsVariables", null);
        setField(term49469, term49469.getClass(), "itsConst", null);
        setField(term49469, term49469.getClass(), "itsVariableNames", null);
        setIntField(term49469, term49469.getClass(), "varStart", 0);
        setField(term49469, term49469.getClass(), "compilerData", null);
        setIntField(term49469, term49469.getClass(), "type", 0);
        setField(term49469, term49469.getClass(), "next", null);
        setField(term49469, term49469.getClass(), "first", null);
        setField(term49469, term49469.getClass(), "last", null);
        setField(term49469, term49469.getClass(), "propListHead", null);
        setIntField(term49469, term49469.getClass(), "sourcePosition", 0);
        setField(term49469, term49469.getClass(), "jsType", null);
        setField(term49469, term49469.getClass(), "parent", null);
        term49470 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49470, term49470.getClass(), "functionName", null);
        setBooleanField(term49470, term49470.getClass(), "itsNeedsActivation", false);
        setIntField(term49470, term49470.getClass(), "itsFunctionType", 0);
        setBooleanField(term49470, term49470.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49470, term49470.getClass(), "encodedSourceStart", 0);
        setIntField(term49470, term49470.getClass(), "encodedSourceEnd", 0);
        setField(term49470, term49470.getClass(), "sourceName", null);
        setIntField(term49470, term49470.getClass(), "baseLineno", 0);
        setIntField(term49470, term49470.getClass(), "endLineno", 0);
        setField(term49470, term49470.getClass(), "functions", null);
        setField(term49470, term49470.getClass(), "regexps", null);
        setField(term49470, term49470.getClass(), "itsVariables", null);
        setField(term49470, term49470.getClass(), "itsConst", null);
        setField(term49470, term49470.getClass(), "itsVariableNames", null);
        setIntField(term49470, term49470.getClass(), "varStart", 0);
        setField(term49470, term49470.getClass(), "compilerData", null);
        setIntField(term49470, term49470.getClass(), "type", 0);
        setField(term49470, term49470.getClass(), "next", null);
        setField(term49470, term49470.getClass(), "first", null);
        setField(term49470, term49470.getClass(), "last", null);
        setField(term49470, term49470.getClass(), "propListHead", null);
        setIntField(term49470, term49470.getClass(), "sourcePosition", 0);
        setField(term49470, term49470.getClass(), "jsType", null);
        setField(term49470, term49470.getClass(), "parent", null);
        term49471 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term49471, term49471.getClass(), "encodedSourceStart", 0);
        setIntField(term49471, term49471.getClass(), "encodedSourceEnd", 0);
        setField(term49471, term49471.getClass(), "sourceName", null);
        setIntField(term49471, term49471.getClass(), "baseLineno", 0);
        setIntField(term49471, term49471.getClass(), "endLineno", 0);
        setField(term49471, term49471.getClass(), "functions", null);
        setField(term49471, term49471.getClass(), "regexps", null);
        setField(term49471, term49471.getClass(), "itsVariables", null);
        setField(term49471, term49471.getClass(), "itsConst", null);
        setField(term49471, term49471.getClass(), "itsVariableNames", null);
        setIntField(term49471, term49471.getClass(), "varStart", 0);
        setField(term49471, term49471.getClass(), "compilerData", null);
        setIntField(term49471, term49471.getClass(), "type", 0);
        setField(term49471, term49471.getClass(), "next", null);
        setField(term49471, term49471.getClass(), "first", null);
        setField(term49471, term49471.getClass(), "last", null);
        setField(term49471, term49471.getClass(), "propListHead", null);
        setIntField(term49471, term49471.getClass(), "sourcePosition", 0);
        setField(term49471, term49471.getClass(), "jsType", null);
        setField(term49471, term49471.getClass(), "parent", null);
        term49409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49409, term49409.getClass(), "functionName", null);
        setBooleanField(term49409, term49409.getClass(), "itsNeedsActivation", false);
        setIntField(term49409, term49409.getClass(), "itsFunctionType", 0);
        setBooleanField(term49409, term49409.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49409, term49409.getClass(), "encodedSourceStart", 0);
        setIntField(term49409, term49409.getClass(), "encodedSourceEnd", 0);
        setField(term49409, term49409.getClass(), "sourceName", null);
        setIntField(term49409, term49409.getClass(), "baseLineno", 0);
        setIntField(term49409, term49409.getClass(), "endLineno", 0);
        setField(term49409, term49409.getClass(), "functions", null);
        setField(term49409, term49409.getClass(), "regexps", null);
        setField(term49409, term49409.getClass(), "itsVariables", null);
        setField(term49409, term49409.getClass(), "itsConst", null);
        setField(term49409, term49409.getClass(), "itsVariableNames", null);
        setIntField(term49409, term49409.getClass(), "varStart", 0);
        setField(term49409, term49409.getClass(), "compilerData", null);
        setIntField(term49409, term49409.getClass(), "type", 0);
        setField(term49409, term49409.getClass(), "next", null);
        setField(term49409, term49409.getClass(), "first", null);
        setField(term49409, term49409.getClass(), "last", null);
        setField(term49409, term49409.getClass(), "propListHead", null);
        setIntField(term49409, term49409.getClass(), "sourcePosition", 0);
        setField(term49409, term49409.getClass(), "jsType", null);
        setField(term49409, term49409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term49175;
        args[1] = term49261;
        args[2] = term49351;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term49089, args);
        assertTrue(recursiveEquals(term49089, term49468));
        assertTrue(recursiveEquals(term49175, term49469));
        assertTrue(recursiveEquals(term49261, term49470));
        assertTrue(recursiveEquals(term49351, term49471));
        assertTrue(recursiveEquals(retValue, term49409));
    }

};


