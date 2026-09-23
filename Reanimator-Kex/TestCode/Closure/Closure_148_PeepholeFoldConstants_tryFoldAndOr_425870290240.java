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

public class PeepholeFoldConstants_tryFoldAndOr_425870290240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45361;
     Object term45447;
     Object term45533;
     Object term45619;
     Object term45720;
     Object term45721;
     Object term45722;
     Object term45723;
     Object term45658;

    public PeepholeFoldConstants_tryFoldAndOr_425870290240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45447, term45447.getClass(), "parent", null);
        setIntField(term45447, term45447.getClass(), "type", 0);
        term45533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term45533, term45533.getClass(), "type", 0);
        term45619 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term45720 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45720, term45720.getClass(), "currentTraversal", null);
        term45721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45721, term45721.getClass(), "functionName", null);
        setBooleanField(term45721, term45721.getClass(), "itsNeedsActivation", false);
        setIntField(term45721, term45721.getClass(), "itsFunctionType", 0);
        setBooleanField(term45721, term45721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45721, term45721.getClass(), "encodedSourceStart", 0);
        setIntField(term45721, term45721.getClass(), "encodedSourceEnd", 0);
        setField(term45721, term45721.getClass(), "sourceName", null);
        setIntField(term45721, term45721.getClass(), "baseLineno", 0);
        setIntField(term45721, term45721.getClass(), "endLineno", 0);
        setField(term45721, term45721.getClass(), "functions", null);
        setField(term45721, term45721.getClass(), "regexps", null);
        setField(term45721, term45721.getClass(), "itsVariables", null);
        setField(term45721, term45721.getClass(), "itsConst", null);
        setField(term45721, term45721.getClass(), "itsVariableNames", null);
        setIntField(term45721, term45721.getClass(), "varStart", 0);
        setField(term45721, term45721.getClass(), "compilerData", null);
        setIntField(term45721, term45721.getClass(), "type", 0);
        setField(term45721, term45721.getClass(), "next", null);
        setField(term45721, term45721.getClass(), "first", null);
        setField(term45721, term45721.getClass(), "last", null);
        setField(term45721, term45721.getClass(), "propListHead", null);
        setIntField(term45721, term45721.getClass(), "sourcePosition", 0);
        setField(term45721, term45721.getClass(), "jsType", null);
        setField(term45721, term45721.getClass(), "parent", null);
        term45722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45722, term45722.getClass(), "functionName", null);
        setBooleanField(term45722, term45722.getClass(), "itsNeedsActivation", false);
        setIntField(term45722, term45722.getClass(), "itsFunctionType", 0);
        setBooleanField(term45722, term45722.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45722, term45722.getClass(), "encodedSourceStart", 0);
        setIntField(term45722, term45722.getClass(), "encodedSourceEnd", 0);
        setField(term45722, term45722.getClass(), "sourceName", null);
        setIntField(term45722, term45722.getClass(), "baseLineno", 0);
        setIntField(term45722, term45722.getClass(), "endLineno", 0);
        setField(term45722, term45722.getClass(), "functions", null);
        setField(term45722, term45722.getClass(), "regexps", null);
        setField(term45722, term45722.getClass(), "itsVariables", null);
        setField(term45722, term45722.getClass(), "itsConst", null);
        setField(term45722, term45722.getClass(), "itsVariableNames", null);
        setIntField(term45722, term45722.getClass(), "varStart", 0);
        setField(term45722, term45722.getClass(), "compilerData", null);
        setIntField(term45722, term45722.getClass(), "type", 0);
        setField(term45722, term45722.getClass(), "next", null);
        setField(term45722, term45722.getClass(), "first", null);
        setField(term45722, term45722.getClass(), "last", null);
        setField(term45722, term45722.getClass(), "propListHead", null);
        setIntField(term45722, term45722.getClass(), "sourcePosition", 0);
        setField(term45722, term45722.getClass(), "jsType", null);
        setField(term45722, term45722.getClass(), "parent", null);
        term45723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45723, term45723.getClass(), "functionName", null);
        setBooleanField(term45723, term45723.getClass(), "itsNeedsActivation", false);
        setIntField(term45723, term45723.getClass(), "itsFunctionType", 0);
        setBooleanField(term45723, term45723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45723, term45723.getClass(), "encodedSourceStart", 0);
        setIntField(term45723, term45723.getClass(), "encodedSourceEnd", 0);
        setField(term45723, term45723.getClass(), "sourceName", null);
        setIntField(term45723, term45723.getClass(), "baseLineno", 0);
        setIntField(term45723, term45723.getClass(), "endLineno", 0);
        setField(term45723, term45723.getClass(), "functions", null);
        setField(term45723, term45723.getClass(), "regexps", null);
        setField(term45723, term45723.getClass(), "itsVariables", null);
        setField(term45723, term45723.getClass(), "itsConst", null);
        setField(term45723, term45723.getClass(), "itsVariableNames", null);
        setIntField(term45723, term45723.getClass(), "varStart", 0);
        setField(term45723, term45723.getClass(), "compilerData", null);
        setIntField(term45723, term45723.getClass(), "type", 0);
        setField(term45723, term45723.getClass(), "next", null);
        setField(term45723, term45723.getClass(), "first", null);
        setField(term45723, term45723.getClass(), "last", null);
        setField(term45723, term45723.getClass(), "propListHead", null);
        setIntField(term45723, term45723.getClass(), "sourcePosition", 0);
        setField(term45723, term45723.getClass(), "jsType", null);
        setField(term45723, term45723.getClass(), "parent", null);
        term45658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45658, term45658.getClass(), "functionName", null);
        setBooleanField(term45658, term45658.getClass(), "itsNeedsActivation", false);
        setIntField(term45658, term45658.getClass(), "itsFunctionType", 0);
        setBooleanField(term45658, term45658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45658, term45658.getClass(), "encodedSourceStart", 0);
        setIntField(term45658, term45658.getClass(), "encodedSourceEnd", 0);
        setField(term45658, term45658.getClass(), "sourceName", null);
        setIntField(term45658, term45658.getClass(), "baseLineno", 0);
        setIntField(term45658, term45658.getClass(), "endLineno", 0);
        setField(term45658, term45658.getClass(), "functions", null);
        setField(term45658, term45658.getClass(), "regexps", null);
        setField(term45658, term45658.getClass(), "itsVariables", null);
        setField(term45658, term45658.getClass(), "itsConst", null);
        setField(term45658, term45658.getClass(), "itsVariableNames", null);
        setIntField(term45658, term45658.getClass(), "varStart", 0);
        setField(term45658, term45658.getClass(), "compilerData", null);
        setIntField(term45658, term45658.getClass(), "type", 0);
        setField(term45658, term45658.getClass(), "next", null);
        setField(term45658, term45658.getClass(), "first", null);
        setField(term45658, term45658.getClass(), "last", null);
        setField(term45658, term45658.getClass(), "propListHead", null);
        setIntField(term45658, term45658.getClass(), "sourcePosition", 0);
        setField(term45658, term45658.getClass(), "jsType", null);
        setField(term45658, term45658.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term45447;
        args[1] = term45533;
        args[2] = term45619;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term45361, args);
        assertTrue(recursiveEquals(term45361, term45720));
        assertTrue(recursiveEquals(term45447, term45721));
        assertTrue(recursiveEquals(term45533, term45722));
        assertTrue(recursiveEquals(term45619, term45723));
        assertTrue(recursiveEquals(retValue, term45658));
    }

};


