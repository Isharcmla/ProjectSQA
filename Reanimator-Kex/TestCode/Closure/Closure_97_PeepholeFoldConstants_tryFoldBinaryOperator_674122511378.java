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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87719;
     Object term87805;
     Object term88691;
     Object term88692;
     Object term88632;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87719 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term87805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87891, term87891.getClass(), "next", term87961);
        setField(term87805, term87805.getClass(), "first", term87891);
        setIntField(term87805, term87805.getClass(), "type", 23);
        term88691 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term88691, term88691.getClass(), "currentTraversal", null);
        term88692 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88693 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88692, term88692.getClass(), "functionName", null);
        setBooleanField(term88692, term88692.getClass(), "itsNeedsActivation", false);
        setIntField(term88692, term88692.getClass(), "itsFunctionType", 0);
        setBooleanField(term88692, term88692.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term88692, term88692.getClass(), "encodedSourceStart", 0);
        setIntField(term88692, term88692.getClass(), "encodedSourceEnd", 0);
        setField(term88692, term88692.getClass(), "sourceName", null);
        setIntField(term88692, term88692.getClass(), "baseLineno", 0);
        setIntField(term88692, term88692.getClass(), "endLineno", 0);
        setField(term88692, term88692.getClass(), "functions", null);
        setField(term88692, term88692.getClass(), "regexps", null);
        setField(term88692, term88692.getClass(), "itsVariables", null);
        setField(term88692, term88692.getClass(), "itsConst", null);
        setField(term88692, term88692.getClass(), "itsVariableNames", null);
        setIntField(term88692, term88692.getClass(), "varStart", 0);
        setField(term88692, term88692.getClass(), "compilerData", null);
        setIntField(term88692, term88692.getClass(), "type", 23);
        setField(term88692, term88692.getClass(), "next", null);
        setField(term88693, term88693.getClass(), "functionName", null);
        setBooleanField(term88693, term88693.getClass(), "itsNeedsActivation", false);
        setIntField(term88693, term88693.getClass(), "itsFunctionType", 0);
        setBooleanField(term88693, term88693.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term88693, term88693.getClass(), "encodedSourceStart", 0);
        setIntField(term88693, term88693.getClass(), "encodedSourceEnd", 0);
        setField(term88693, term88693.getClass(), "sourceName", null);
        setIntField(term88693, term88693.getClass(), "baseLineno", 0);
        setIntField(term88693, term88693.getClass(), "endLineno", 0);
        setField(term88693, term88693.getClass(), "functions", null);
        setField(term88693, term88693.getClass(), "regexps", null);
        setField(term88693, term88693.getClass(), "itsVariables", null);
        setField(term88693, term88693.getClass(), "itsConst", null);
        setField(term88693, term88693.getClass(), "itsVariableNames", null);
        setIntField(term88693, term88693.getClass(), "varStart", 0);
        setField(term88693, term88693.getClass(), "compilerData", null);
        setIntField(term88693, term88693.getClass(), "type", 0);
        setIntField(term88694, term88694.getClass(), "type", 0);
        setField(term88694, term88694.getClass(), "next", null);
        setField(term88694, term88694.getClass(), "first", null);
        setField(term88694, term88694.getClass(), "last", null);
        setField(term88694, term88694.getClass(), "propListHead", null);
        setIntField(term88694, term88694.getClass(), "sourcePosition", 0);
        setField(term88694, term88694.getClass(), "jsType", null);
        setField(term88694, term88694.getClass(), "parent", null);
        setField(term88693, term88693.getClass(), "next", term88694);
        setField(term88693, term88693.getClass(), "first", null);
        setField(term88693, term88693.getClass(), "last", null);
        setField(term88693, term88693.getClass(), "propListHead", null);
        setIntField(term88693, term88693.getClass(), "sourcePosition", 0);
        setField(term88693, term88693.getClass(), "jsType", null);
        setField(term88693, term88693.getClass(), "parent", null);
        setField(term88692, term88692.getClass(), "first", term88693);
        setField(term88692, term88692.getClass(), "last", null);
        setField(term88692, term88692.getClass(), "propListHead", null);
        setIntField(term88692, term88692.getClass(), "sourcePosition", 0);
        setField(term88692, term88692.getClass(), "jsType", null);
        setField(term88692, term88692.getClass(), "parent", null);
        term88632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88632, term88632.getClass(), "functionName", null);
        setBooleanField(term88632, term88632.getClass(), "itsNeedsActivation", false);
        setIntField(term88632, term88632.getClass(), "itsFunctionType", 0);
        setBooleanField(term88632, term88632.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term88632, term88632.getClass(), "encodedSourceStart", 0);
        setIntField(term88632, term88632.getClass(), "encodedSourceEnd", 0);
        setField(term88632, term88632.getClass(), "sourceName", null);
        setIntField(term88632, term88632.getClass(), "baseLineno", 0);
        setIntField(term88632, term88632.getClass(), "endLineno", 0);
        setField(term88632, term88632.getClass(), "functions", null);
        setField(term88632, term88632.getClass(), "regexps", null);
        setField(term88632, term88632.getClass(), "itsVariables", null);
        setField(term88632, term88632.getClass(), "itsConst", null);
        setField(term88632, term88632.getClass(), "itsVariableNames", null);
        setIntField(term88632, term88632.getClass(), "varStart", 0);
        setField(term88632, term88632.getClass(), "compilerData", null);
        setIntField(term88632, term88632.getClass(), "type", 23);
        setField(term88632, term88632.getClass(), "next", null);
        setField(term88642, term88642.getClass(), "functionName", null);
        setBooleanField(term88642, term88642.getClass(), "itsNeedsActivation", false);
        setIntField(term88642, term88642.getClass(), "itsFunctionType", 0);
        setBooleanField(term88642, term88642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term88642, term88642.getClass(), "encodedSourceStart", 0);
        setIntField(term88642, term88642.getClass(), "encodedSourceEnd", 0);
        setField(term88642, term88642.getClass(), "sourceName", null);
        setIntField(term88642, term88642.getClass(), "baseLineno", 0);
        setIntField(term88642, term88642.getClass(), "endLineno", 0);
        setField(term88642, term88642.getClass(), "functions", null);
        setField(term88642, term88642.getClass(), "regexps", null);
        setField(term88642, term88642.getClass(), "itsVariables", null);
        setField(term88642, term88642.getClass(), "itsConst", null);
        setField(term88642, term88642.getClass(), "itsVariableNames", null);
        setIntField(term88642, term88642.getClass(), "varStart", 0);
        setField(term88642, term88642.getClass(), "compilerData", null);
        setIntField(term88642, term88642.getClass(), "type", 0);
        setIntField(term88652, term88652.getClass(), "type", 0);
        setField(term88652, term88652.getClass(), "next", null);
        setField(term88652, term88652.getClass(), "first", null);
        setField(term88652, term88652.getClass(), "last", null);
        setField(term88652, term88652.getClass(), "propListHead", null);
        setIntField(term88652, term88652.getClass(), "sourcePosition", 0);
        setField(term88652, term88652.getClass(), "jsType", null);
        setField(term88652, term88652.getClass(), "parent", null);
        setField(term88642, term88642.getClass(), "next", term88652);
        setField(term88642, term88642.getClass(), "first", null);
        setField(term88642, term88642.getClass(), "last", null);
        setField(term88642, term88642.getClass(), "propListHead", null);
        setIntField(term88642, term88642.getClass(), "sourcePosition", 0);
        setField(term88642, term88642.getClass(), "jsType", null);
        setField(term88642, term88642.getClass(), "parent", null);
        setField(term88632, term88632.getClass(), "first", term88642);
        setField(term88632, term88632.getClass(), "last", null);
        setField(term88632, term88632.getClass(), "propListHead", null);
        setIntField(term88632, term88632.getClass(), "sourcePosition", 0);
        setField(term88632, term88632.getClass(), "jsType", null);
        setField(term88632, term88632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87805;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term87719, args);
        assertTrue(recursiveEquals(term87719, term88691));
        assertTrue(recursiveEquals(term87805, term88692));
        assertTrue(recursiveEquals(retValue, term88632));
    }

};


