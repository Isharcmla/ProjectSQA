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

public class CoalesceVariableNames_removeVarDeclaration_175124548585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31873;
     Object term31959;
     Object term98986;
     Object term98987;

    public CoalesceVariableNames_removeVarDeclaration_175124548585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31873 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        term31959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term32217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term32131, term32131.getClass(), "type", -116);
        setField(term32045, term32045.getClass(), "parent", term32131);
        setField(term32045, term32045.getClass(), "first", null);
        setField(term31959, term31959.getClass(), "parent", term32045);
        setField(term31959, term31959.getClass(), "first", term32217);
        term98986 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term98986, term98986.getClass(), "compiler", null);
        setField(term98986, term98986.getClass(), "colorings", null);
        setBooleanField(term98986, term98986.getClass(), "usePseudoNames", false);
        term98987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term98987, term98987.getClass(), "functionName", null);
        setBooleanField(term98987, term98987.getClass(), "itsNeedsActivation", false);
        setIntField(term98987, term98987.getClass(), "itsFunctionType", 0);
        setBooleanField(term98987, term98987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98987, term98987.getClass(), "encodedSourceStart", 0);
        setIntField(term98987, term98987.getClass(), "encodedSourceEnd", 0);
        setField(term98987, term98987.getClass(), "sourceName", null);
        setIntField(term98987, term98987.getClass(), "baseLineno", 0);
        setIntField(term98987, term98987.getClass(), "endLineno", 0);
        setField(term98987, term98987.getClass(), "functions", null);
        setField(term98987, term98987.getClass(), "regexps", null);
        setField(term98987, term98987.getClass(), "itsVariables", null);
        setField(term98987, term98987.getClass(), "itsConst", null);
        setField(term98987, term98987.getClass(), "itsVariableNames", null);
        setIntField(term98987, term98987.getClass(), "varStart", 0);
        setField(term98987, term98987.getClass(), "compilerData", null);
        setIntField(term98987, term98987.getClass(), "type", 0);
        setField(term98987, term98987.getClass(), "next", null);
        setField(term98988, term98988.getClass(), "functionName", null);
        setBooleanField(term98988, term98988.getClass(), "itsNeedsActivation", false);
        setIntField(term98988, term98988.getClass(), "itsFunctionType", 0);
        setBooleanField(term98988, term98988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98988, term98988.getClass(), "encodedSourceStart", 0);
        setIntField(term98988, term98988.getClass(), "encodedSourceEnd", 0);
        setField(term98988, term98988.getClass(), "sourceName", null);
        setIntField(term98988, term98988.getClass(), "baseLineno", 0);
        setIntField(term98988, term98988.getClass(), "endLineno", 0);
        setField(term98988, term98988.getClass(), "functions", null);
        setField(term98988, term98988.getClass(), "regexps", null);
        setField(term98988, term98988.getClass(), "itsVariables", null);
        setField(term98988, term98988.getClass(), "itsConst", null);
        setField(term98988, term98988.getClass(), "itsVariableNames", null);
        setIntField(term98988, term98988.getClass(), "varStart", 0);
        setField(term98988, term98988.getClass(), "compilerData", null);
        setIntField(term98988, term98988.getClass(), "type", 0);
        setField(term98988, term98988.getClass(), "next", null);
        setField(term98988, term98988.getClass(), "first", null);
        setField(term98988, term98988.getClass(), "last", null);
        setField(term98988, term98988.getClass(), "propListHead", null);
        setIntField(term98988, term98988.getClass(), "sourcePosition", 0);
        setField(term98988, term98988.getClass(), "jsType", null);
        setField(term98988, term98988.getClass(), "parent", null);
        setField(term98987, term98987.getClass(), "first", term98988);
        setField(term98987, term98987.getClass(), "last", null);
        setField(term98987, term98987.getClass(), "propListHead", null);
        setIntField(term98987, term98987.getClass(), "sourcePosition", 0);
        setField(term98987, term98987.getClass(), "jsType", null);
        setField(term98989, term98989.getClass(), "functionName", null);
        setBooleanField(term98989, term98989.getClass(), "itsNeedsActivation", false);
        setIntField(term98989, term98989.getClass(), "itsFunctionType", 0);
        setBooleanField(term98989, term98989.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98989, term98989.getClass(), "encodedSourceStart", 0);
        setIntField(term98989, term98989.getClass(), "encodedSourceEnd", 0);
        setField(term98989, term98989.getClass(), "sourceName", null);
        setIntField(term98989, term98989.getClass(), "baseLineno", 0);
        setIntField(term98989, term98989.getClass(), "endLineno", 0);
        setField(term98989, term98989.getClass(), "functions", null);
        setField(term98989, term98989.getClass(), "regexps", null);
        setField(term98989, term98989.getClass(), "itsVariables", null);
        setField(term98989, term98989.getClass(), "itsConst", null);
        setField(term98989, term98989.getClass(), "itsVariableNames", null);
        setIntField(term98989, term98989.getClass(), "varStart", 0);
        setField(term98989, term98989.getClass(), "compilerData", null);
        setIntField(term98989, term98989.getClass(), "type", 0);
        setField(term98989, term98989.getClass(), "next", null);
        setField(term98989, term98989.getClass(), "first", null);
        setField(term98989, term98989.getClass(), "last", null);
        setField(term98989, term98989.getClass(), "propListHead", null);
        setIntField(term98989, term98989.getClass(), "sourcePosition", 0);
        setField(term98989, term98989.getClass(), "jsType", null);
        setField(term98990, term98990.getClass(), "functionName", null);
        setBooleanField(term98990, term98990.getClass(), "itsNeedsActivation", false);
        setIntField(term98990, term98990.getClass(), "itsFunctionType", 0);
        setBooleanField(term98990, term98990.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98990, term98990.getClass(), "encodedSourceStart", 0);
        setIntField(term98990, term98990.getClass(), "encodedSourceEnd", 0);
        setField(term98990, term98990.getClass(), "sourceName", null);
        setIntField(term98990, term98990.getClass(), "baseLineno", 0);
        setIntField(term98990, term98990.getClass(), "endLineno", 0);
        setField(term98990, term98990.getClass(), "functions", null);
        setField(term98990, term98990.getClass(), "regexps", null);
        setField(term98990, term98990.getClass(), "itsVariables", null);
        setField(term98990, term98990.getClass(), "itsConst", null);
        setField(term98990, term98990.getClass(), "itsVariableNames", null);
        setIntField(term98990, term98990.getClass(), "varStart", 0);
        setField(term98990, term98990.getClass(), "compilerData", null);
        setIntField(term98990, term98990.getClass(), "type", -116);
        setField(term98990, term98990.getClass(), "next", null);
        setField(term98990, term98990.getClass(), "first", null);
        setField(term98990, term98990.getClass(), "last", null);
        setField(term98990, term98990.getClass(), "propListHead", null);
        setIntField(term98990, term98990.getClass(), "sourcePosition", 0);
        setField(term98990, term98990.getClass(), "jsType", null);
        setField(term98990, term98990.getClass(), "parent", null);
        setField(term98989, term98989.getClass(), "parent", term98990);
        setField(term98987, term98987.getClass(), "parent", term98989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31959;
        callMethod(klass, "removeVarDeclaration", argTypes, term31873, args);
        assertTrue(recursiveEquals(term31873, term98986));
        assertTrue(recursiveEquals(term31959, term98987));
    }

};


