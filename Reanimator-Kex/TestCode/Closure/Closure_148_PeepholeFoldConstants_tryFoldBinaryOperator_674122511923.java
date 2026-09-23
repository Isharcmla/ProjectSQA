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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214242;
     Object term214332;
     Object term215370;
     Object term215371;
     Object term215306;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214242 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term214332 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term214422 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term214512 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term214422, term214422.getClass(), "next", term214512);
        setIntField(term214422, term214422.getClass(), "type", 39);
        setField(term214332, term214332.getClass(), "first", term214422);
        setIntField(term214332, term214332.getClass(), "type", 19);
        term215370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term215370, term215370.getClass(), "currentTraversal", null);
        term215371 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term215372 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term215373 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term215371, term215371.getClass(), "encodedSourceStart", 0);
        setIntField(term215371, term215371.getClass(), "encodedSourceEnd", 0);
        setField(term215371, term215371.getClass(), "sourceName", null);
        setIntField(term215371, term215371.getClass(), "baseLineno", 0);
        setIntField(term215371, term215371.getClass(), "endLineno", 0);
        setField(term215371, term215371.getClass(), "functions", null);
        setField(term215371, term215371.getClass(), "regexps", null);
        setField(term215371, term215371.getClass(), "itsVariables", null);
        setField(term215371, term215371.getClass(), "itsConst", null);
        setField(term215371, term215371.getClass(), "itsVariableNames", null);
        setIntField(term215371, term215371.getClass(), "varStart", 0);
        setField(term215371, term215371.getClass(), "compilerData", null);
        setIntField(term215371, term215371.getClass(), "type", 19);
        setField(term215371, term215371.getClass(), "next", null);
        setIntField(term215372, term215372.getClass(), "encodedSourceStart", 0);
        setIntField(term215372, term215372.getClass(), "encodedSourceEnd", 0);
        setField(term215372, term215372.getClass(), "sourceName", null);
        setIntField(term215372, term215372.getClass(), "baseLineno", 0);
        setIntField(term215372, term215372.getClass(), "endLineno", 0);
        setField(term215372, term215372.getClass(), "functions", null);
        setField(term215372, term215372.getClass(), "regexps", null);
        setField(term215372, term215372.getClass(), "itsVariables", null);
        setField(term215372, term215372.getClass(), "itsConst", null);
        setField(term215372, term215372.getClass(), "itsVariableNames", null);
        setIntField(term215372, term215372.getClass(), "varStart", 0);
        setField(term215372, term215372.getClass(), "compilerData", null);
        setIntField(term215372, term215372.getClass(), "type", 39);
        setIntField(term215373, term215373.getClass(), "encodedSourceStart", 0);
        setIntField(term215373, term215373.getClass(), "encodedSourceEnd", 0);
        setField(term215373, term215373.getClass(), "sourceName", null);
        setIntField(term215373, term215373.getClass(), "baseLineno", 0);
        setIntField(term215373, term215373.getClass(), "endLineno", 0);
        setField(term215373, term215373.getClass(), "functions", null);
        setField(term215373, term215373.getClass(), "regexps", null);
        setField(term215373, term215373.getClass(), "itsVariables", null);
        setField(term215373, term215373.getClass(), "itsConst", null);
        setField(term215373, term215373.getClass(), "itsVariableNames", null);
        setIntField(term215373, term215373.getClass(), "varStart", 0);
        setField(term215373, term215373.getClass(), "compilerData", null);
        setIntField(term215373, term215373.getClass(), "type", 0);
        setField(term215373, term215373.getClass(), "next", null);
        setField(term215373, term215373.getClass(), "first", null);
        setField(term215373, term215373.getClass(), "last", null);
        setField(term215373, term215373.getClass(), "propListHead", null);
        setIntField(term215373, term215373.getClass(), "sourcePosition", 0);
        setField(term215373, term215373.getClass(), "jsType", null);
        setField(term215373, term215373.getClass(), "parent", null);
        setField(term215372, term215372.getClass(), "next", term215373);
        setField(term215372, term215372.getClass(), "first", null);
        setField(term215372, term215372.getClass(), "last", null);
        setField(term215372, term215372.getClass(), "propListHead", null);
        setIntField(term215372, term215372.getClass(), "sourcePosition", 0);
        setField(term215372, term215372.getClass(), "jsType", null);
        setField(term215372, term215372.getClass(), "parent", null);
        setField(term215371, term215371.getClass(), "first", term215372);
        setField(term215371, term215371.getClass(), "last", null);
        setField(term215371, term215371.getClass(), "propListHead", null);
        setIntField(term215371, term215371.getClass(), "sourcePosition", 0);
        setField(term215371, term215371.getClass(), "jsType", null);
        setField(term215371, term215371.getClass(), "parent", null);
        term215306 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term215313 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term215320 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term215306, term215306.getClass(), "encodedSourceStart", 0);
        setIntField(term215306, term215306.getClass(), "encodedSourceEnd", 0);
        setField(term215306, term215306.getClass(), "sourceName", null);
        setIntField(term215306, term215306.getClass(), "baseLineno", 0);
        setIntField(term215306, term215306.getClass(), "endLineno", 0);
        setField(term215306, term215306.getClass(), "functions", null);
        setField(term215306, term215306.getClass(), "regexps", null);
        setField(term215306, term215306.getClass(), "itsVariables", null);
        setField(term215306, term215306.getClass(), "itsConst", null);
        setField(term215306, term215306.getClass(), "itsVariableNames", null);
        setIntField(term215306, term215306.getClass(), "varStart", 0);
        setField(term215306, term215306.getClass(), "compilerData", null);
        setIntField(term215306, term215306.getClass(), "type", 19);
        setField(term215306, term215306.getClass(), "next", null);
        setIntField(term215313, term215313.getClass(), "encodedSourceStart", 0);
        setIntField(term215313, term215313.getClass(), "encodedSourceEnd", 0);
        setField(term215313, term215313.getClass(), "sourceName", null);
        setIntField(term215313, term215313.getClass(), "baseLineno", 0);
        setIntField(term215313, term215313.getClass(), "endLineno", 0);
        setField(term215313, term215313.getClass(), "functions", null);
        setField(term215313, term215313.getClass(), "regexps", null);
        setField(term215313, term215313.getClass(), "itsVariables", null);
        setField(term215313, term215313.getClass(), "itsConst", null);
        setField(term215313, term215313.getClass(), "itsVariableNames", null);
        setIntField(term215313, term215313.getClass(), "varStart", 0);
        setField(term215313, term215313.getClass(), "compilerData", null);
        setIntField(term215313, term215313.getClass(), "type", 39);
        setIntField(term215320, term215320.getClass(), "encodedSourceStart", 0);
        setIntField(term215320, term215320.getClass(), "encodedSourceEnd", 0);
        setField(term215320, term215320.getClass(), "sourceName", null);
        setIntField(term215320, term215320.getClass(), "baseLineno", 0);
        setIntField(term215320, term215320.getClass(), "endLineno", 0);
        setField(term215320, term215320.getClass(), "functions", null);
        setField(term215320, term215320.getClass(), "regexps", null);
        setField(term215320, term215320.getClass(), "itsVariables", null);
        setField(term215320, term215320.getClass(), "itsConst", null);
        setField(term215320, term215320.getClass(), "itsVariableNames", null);
        setIntField(term215320, term215320.getClass(), "varStart", 0);
        setField(term215320, term215320.getClass(), "compilerData", null);
        setIntField(term215320, term215320.getClass(), "type", 0);
        setField(term215320, term215320.getClass(), "next", null);
        setField(term215320, term215320.getClass(), "first", null);
        setField(term215320, term215320.getClass(), "last", null);
        setField(term215320, term215320.getClass(), "propListHead", null);
        setIntField(term215320, term215320.getClass(), "sourcePosition", 0);
        setField(term215320, term215320.getClass(), "jsType", null);
        setField(term215320, term215320.getClass(), "parent", null);
        setField(term215313, term215313.getClass(), "next", term215320);
        setField(term215313, term215313.getClass(), "first", null);
        setField(term215313, term215313.getClass(), "last", null);
        setField(term215313, term215313.getClass(), "propListHead", null);
        setIntField(term215313, term215313.getClass(), "sourcePosition", 0);
        setField(term215313, term215313.getClass(), "jsType", null);
        setField(term215313, term215313.getClass(), "parent", null);
        setField(term215306, term215306.getClass(), "first", term215313);
        setField(term215306, term215306.getClass(), "last", null);
        setField(term215306, term215306.getClass(), "propListHead", null);
        setIntField(term215306, term215306.getClass(), "sourcePosition", 0);
        setField(term215306, term215306.getClass(), "jsType", null);
        setField(term215306, term215306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term214332;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term214242, args);
        assertTrue(recursiveEquals(term214242, term215370));
        assertTrue(recursiveEquals(term214332, term215371));
        assertTrue(recursiveEquals(retValue, term215306));
    }

};


