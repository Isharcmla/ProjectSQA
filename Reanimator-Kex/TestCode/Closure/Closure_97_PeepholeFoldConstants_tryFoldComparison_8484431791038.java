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

public class PeepholeFoldConstants_tryFoldComparison_8484431791038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323692;
     Object term323778;
     Object term323864;
     Object term323950;
     Object term324074;
     Object term324075;
     Object term324076;
     Object term324077;
     Object term324033;

    public PeepholeFoldConstants_tryFoldComparison_8484431791038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323692 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term323778 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term323778, term323778.getClass(), "type", 14);
        term323864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term323864, term323864.getClass(), "type", 42);
        term323950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term323950, term323950.getClass(), "type", 14);
        term324074 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term324074, term324074.getClass(), "currentTraversal", null);
        term324075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term324075, term324075.getClass(), "functionName", null);
        setBooleanField(term324075, term324075.getClass(), "itsNeedsActivation", false);
        setIntField(term324075, term324075.getClass(), "itsFunctionType", 0);
        setBooleanField(term324075, term324075.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term324075, term324075.getClass(), "encodedSourceStart", 0);
        setIntField(term324075, term324075.getClass(), "encodedSourceEnd", 0);
        setField(term324075, term324075.getClass(), "sourceName", null);
        setIntField(term324075, term324075.getClass(), "baseLineno", 0);
        setIntField(term324075, term324075.getClass(), "endLineno", 0);
        setField(term324075, term324075.getClass(), "functions", null);
        setField(term324075, term324075.getClass(), "regexps", null);
        setField(term324075, term324075.getClass(), "itsVariables", null);
        setField(term324075, term324075.getClass(), "itsConst", null);
        setField(term324075, term324075.getClass(), "itsVariableNames", null);
        setIntField(term324075, term324075.getClass(), "varStart", 0);
        setField(term324075, term324075.getClass(), "compilerData", null);
        setIntField(term324075, term324075.getClass(), "type", 42);
        setField(term324075, term324075.getClass(), "next", null);
        setField(term324075, term324075.getClass(), "first", null);
        setField(term324075, term324075.getClass(), "last", null);
        setField(term324075, term324075.getClass(), "propListHead", null);
        setIntField(term324075, term324075.getClass(), "sourcePosition", 0);
        setField(term324075, term324075.getClass(), "jsType", null);
        setField(term324075, term324075.getClass(), "parent", null);
        term324076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term324076, term324076.getClass(), "functionName", null);
        setBooleanField(term324076, term324076.getClass(), "itsNeedsActivation", false);
        setIntField(term324076, term324076.getClass(), "itsFunctionType", 0);
        setBooleanField(term324076, term324076.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term324076, term324076.getClass(), "encodedSourceStart", 0);
        setIntField(term324076, term324076.getClass(), "encodedSourceEnd", 0);
        setField(term324076, term324076.getClass(), "sourceName", null);
        setIntField(term324076, term324076.getClass(), "baseLineno", 0);
        setIntField(term324076, term324076.getClass(), "endLineno", 0);
        setField(term324076, term324076.getClass(), "functions", null);
        setField(term324076, term324076.getClass(), "regexps", null);
        setField(term324076, term324076.getClass(), "itsVariables", null);
        setField(term324076, term324076.getClass(), "itsConst", null);
        setField(term324076, term324076.getClass(), "itsVariableNames", null);
        setIntField(term324076, term324076.getClass(), "varStart", 0);
        setField(term324076, term324076.getClass(), "compilerData", null);
        setIntField(term324076, term324076.getClass(), "type", 14);
        setField(term324076, term324076.getClass(), "next", null);
        setField(term324076, term324076.getClass(), "first", null);
        setField(term324076, term324076.getClass(), "last", null);
        setField(term324076, term324076.getClass(), "propListHead", null);
        setIntField(term324076, term324076.getClass(), "sourcePosition", 0);
        setField(term324076, term324076.getClass(), "jsType", null);
        setField(term324076, term324076.getClass(), "parent", null);
        term324077 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term324077, term324077.getClass(), "functionName", null);
        setBooleanField(term324077, term324077.getClass(), "itsNeedsActivation", false);
        setIntField(term324077, term324077.getClass(), "itsFunctionType", 0);
        setBooleanField(term324077, term324077.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term324077, term324077.getClass(), "encodedSourceStart", 0);
        setIntField(term324077, term324077.getClass(), "encodedSourceEnd", 0);
        setField(term324077, term324077.getClass(), "sourceName", null);
        setIntField(term324077, term324077.getClass(), "baseLineno", 0);
        setIntField(term324077, term324077.getClass(), "endLineno", 0);
        setField(term324077, term324077.getClass(), "functions", null);
        setField(term324077, term324077.getClass(), "regexps", null);
        setField(term324077, term324077.getClass(), "itsVariables", null);
        setField(term324077, term324077.getClass(), "itsConst", null);
        setField(term324077, term324077.getClass(), "itsVariableNames", null);
        setIntField(term324077, term324077.getClass(), "varStart", 0);
        setField(term324077, term324077.getClass(), "compilerData", null);
        setIntField(term324077, term324077.getClass(), "type", 14);
        setField(term324077, term324077.getClass(), "next", null);
        setField(term324077, term324077.getClass(), "first", null);
        setField(term324077, term324077.getClass(), "last", null);
        setField(term324077, term324077.getClass(), "propListHead", null);
        setIntField(term324077, term324077.getClass(), "sourcePosition", 0);
        setField(term324077, term324077.getClass(), "jsType", null);
        setField(term324077, term324077.getClass(), "parent", null);
        term324033 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term324033, term324033.getClass(), "functionName", null);
        setBooleanField(term324033, term324033.getClass(), "itsNeedsActivation", false);
        setIntField(term324033, term324033.getClass(), "itsFunctionType", 0);
        setBooleanField(term324033, term324033.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term324033, term324033.getClass(), "encodedSourceStart", 0);
        setIntField(term324033, term324033.getClass(), "encodedSourceEnd", 0);
        setField(term324033, term324033.getClass(), "sourceName", null);
        setIntField(term324033, term324033.getClass(), "baseLineno", 0);
        setIntField(term324033, term324033.getClass(), "endLineno", 0);
        setField(term324033, term324033.getClass(), "functions", null);
        setField(term324033, term324033.getClass(), "regexps", null);
        setField(term324033, term324033.getClass(), "itsVariables", null);
        setField(term324033, term324033.getClass(), "itsConst", null);
        setField(term324033, term324033.getClass(), "itsVariableNames", null);
        setIntField(term324033, term324033.getClass(), "varStart", 0);
        setField(term324033, term324033.getClass(), "compilerData", null);
        setIntField(term324033, term324033.getClass(), "type", 14);
        setField(term324033, term324033.getClass(), "next", null);
        setField(term324033, term324033.getClass(), "first", null);
        setField(term324033, term324033.getClass(), "last", null);
        setField(term324033, term324033.getClass(), "propListHead", null);
        setIntField(term324033, term324033.getClass(), "sourcePosition", 0);
        setField(term324033, term324033.getClass(), "jsType", null);
        setField(term324033, term324033.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term323778;
        args[1] = term323864;
        args[2] = term323950;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term323692, args);
        assertTrue(recursiveEquals(term323692, term324074));
        assertTrue(recursiveEquals(term323778, term324075));
        assertTrue(recursiveEquals(term323864, term324076));
        assertTrue(recursiveEquals(term323950, term324077));
        assertTrue(recursiveEquals(retValue, term324033));
    }

};


