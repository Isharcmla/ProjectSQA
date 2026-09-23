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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329662;
     Object term329752;
     Object term330882;
     Object term330883;
     Object term330818;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term329752 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term329842 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term329932 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term329842, term329842.getClass(), "next", term329932);
        setIntField(term329842, term329842.getClass(), "type", 39);
        setField(term329752, term329752.getClass(), "first", term329842);
        setIntField(term329752, term329752.getClass(), "type", 22);
        term330882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term330882, term330882.getClass(), "currentTraversal", null);
        term330883 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term330884 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term330885 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term330883, term330883.getClass(), "encodedSourceStart", 0);
        setIntField(term330883, term330883.getClass(), "encodedSourceEnd", 0);
        setField(term330883, term330883.getClass(), "sourceName", null);
        setIntField(term330883, term330883.getClass(), "baseLineno", 0);
        setIntField(term330883, term330883.getClass(), "endLineno", 0);
        setField(term330883, term330883.getClass(), "functions", null);
        setField(term330883, term330883.getClass(), "regexps", null);
        setField(term330883, term330883.getClass(), "itsVariables", null);
        setField(term330883, term330883.getClass(), "itsConst", null);
        setField(term330883, term330883.getClass(), "itsVariableNames", null);
        setIntField(term330883, term330883.getClass(), "varStart", 0);
        setField(term330883, term330883.getClass(), "compilerData", null);
        setIntField(term330883, term330883.getClass(), "type", 22);
        setField(term330883, term330883.getClass(), "next", null);
        setIntField(term330884, term330884.getClass(), "encodedSourceStart", 0);
        setIntField(term330884, term330884.getClass(), "encodedSourceEnd", 0);
        setField(term330884, term330884.getClass(), "sourceName", null);
        setIntField(term330884, term330884.getClass(), "baseLineno", 0);
        setIntField(term330884, term330884.getClass(), "endLineno", 0);
        setField(term330884, term330884.getClass(), "functions", null);
        setField(term330884, term330884.getClass(), "regexps", null);
        setField(term330884, term330884.getClass(), "itsVariables", null);
        setField(term330884, term330884.getClass(), "itsConst", null);
        setField(term330884, term330884.getClass(), "itsVariableNames", null);
        setIntField(term330884, term330884.getClass(), "varStart", 0);
        setField(term330884, term330884.getClass(), "compilerData", null);
        setIntField(term330884, term330884.getClass(), "type", 39);
        setIntField(term330885, term330885.getClass(), "encodedSourceStart", 0);
        setIntField(term330885, term330885.getClass(), "encodedSourceEnd", 0);
        setField(term330885, term330885.getClass(), "sourceName", null);
        setIntField(term330885, term330885.getClass(), "baseLineno", 0);
        setIntField(term330885, term330885.getClass(), "endLineno", 0);
        setField(term330885, term330885.getClass(), "functions", null);
        setField(term330885, term330885.getClass(), "regexps", null);
        setField(term330885, term330885.getClass(), "itsVariables", null);
        setField(term330885, term330885.getClass(), "itsConst", null);
        setField(term330885, term330885.getClass(), "itsVariableNames", null);
        setIntField(term330885, term330885.getClass(), "varStart", 0);
        setField(term330885, term330885.getClass(), "compilerData", null);
        setIntField(term330885, term330885.getClass(), "type", 0);
        setField(term330885, term330885.getClass(), "next", null);
        setField(term330885, term330885.getClass(), "first", null);
        setField(term330885, term330885.getClass(), "last", null);
        setField(term330885, term330885.getClass(), "propListHead", null);
        setIntField(term330885, term330885.getClass(), "sourcePosition", 0);
        setField(term330885, term330885.getClass(), "jsType", null);
        setField(term330885, term330885.getClass(), "parent", null);
        setField(term330884, term330884.getClass(), "next", term330885);
        setField(term330884, term330884.getClass(), "first", null);
        setField(term330884, term330884.getClass(), "last", null);
        setField(term330884, term330884.getClass(), "propListHead", null);
        setIntField(term330884, term330884.getClass(), "sourcePosition", 0);
        setField(term330884, term330884.getClass(), "jsType", null);
        setField(term330884, term330884.getClass(), "parent", null);
        setField(term330883, term330883.getClass(), "first", term330884);
        setField(term330883, term330883.getClass(), "last", null);
        setField(term330883, term330883.getClass(), "propListHead", null);
        setIntField(term330883, term330883.getClass(), "sourcePosition", 0);
        setField(term330883, term330883.getClass(), "jsType", null);
        setField(term330883, term330883.getClass(), "parent", null);
        term330818 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term330825 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term330832 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term330818, term330818.getClass(), "encodedSourceStart", 0);
        setIntField(term330818, term330818.getClass(), "encodedSourceEnd", 0);
        setField(term330818, term330818.getClass(), "sourceName", null);
        setIntField(term330818, term330818.getClass(), "baseLineno", 0);
        setIntField(term330818, term330818.getClass(), "endLineno", 0);
        setField(term330818, term330818.getClass(), "functions", null);
        setField(term330818, term330818.getClass(), "regexps", null);
        setField(term330818, term330818.getClass(), "itsVariables", null);
        setField(term330818, term330818.getClass(), "itsConst", null);
        setField(term330818, term330818.getClass(), "itsVariableNames", null);
        setIntField(term330818, term330818.getClass(), "varStart", 0);
        setField(term330818, term330818.getClass(), "compilerData", null);
        setIntField(term330818, term330818.getClass(), "type", 22);
        setField(term330818, term330818.getClass(), "next", null);
        setIntField(term330825, term330825.getClass(), "encodedSourceStart", 0);
        setIntField(term330825, term330825.getClass(), "encodedSourceEnd", 0);
        setField(term330825, term330825.getClass(), "sourceName", null);
        setIntField(term330825, term330825.getClass(), "baseLineno", 0);
        setIntField(term330825, term330825.getClass(), "endLineno", 0);
        setField(term330825, term330825.getClass(), "functions", null);
        setField(term330825, term330825.getClass(), "regexps", null);
        setField(term330825, term330825.getClass(), "itsVariables", null);
        setField(term330825, term330825.getClass(), "itsConst", null);
        setField(term330825, term330825.getClass(), "itsVariableNames", null);
        setIntField(term330825, term330825.getClass(), "varStart", 0);
        setField(term330825, term330825.getClass(), "compilerData", null);
        setIntField(term330825, term330825.getClass(), "type", 39);
        setIntField(term330832, term330832.getClass(), "encodedSourceStart", 0);
        setIntField(term330832, term330832.getClass(), "encodedSourceEnd", 0);
        setField(term330832, term330832.getClass(), "sourceName", null);
        setIntField(term330832, term330832.getClass(), "baseLineno", 0);
        setIntField(term330832, term330832.getClass(), "endLineno", 0);
        setField(term330832, term330832.getClass(), "functions", null);
        setField(term330832, term330832.getClass(), "regexps", null);
        setField(term330832, term330832.getClass(), "itsVariables", null);
        setField(term330832, term330832.getClass(), "itsConst", null);
        setField(term330832, term330832.getClass(), "itsVariableNames", null);
        setIntField(term330832, term330832.getClass(), "varStart", 0);
        setField(term330832, term330832.getClass(), "compilerData", null);
        setIntField(term330832, term330832.getClass(), "type", 0);
        setField(term330832, term330832.getClass(), "next", null);
        setField(term330832, term330832.getClass(), "first", null);
        setField(term330832, term330832.getClass(), "last", null);
        setField(term330832, term330832.getClass(), "propListHead", null);
        setIntField(term330832, term330832.getClass(), "sourcePosition", 0);
        setField(term330832, term330832.getClass(), "jsType", null);
        setField(term330832, term330832.getClass(), "parent", null);
        setField(term330825, term330825.getClass(), "next", term330832);
        setField(term330825, term330825.getClass(), "first", null);
        setField(term330825, term330825.getClass(), "last", null);
        setField(term330825, term330825.getClass(), "propListHead", null);
        setIntField(term330825, term330825.getClass(), "sourcePosition", 0);
        setField(term330825, term330825.getClass(), "jsType", null);
        setField(term330825, term330825.getClass(), "parent", null);
        setField(term330818, term330818.getClass(), "first", term330825);
        setField(term330818, term330818.getClass(), "last", null);
        setField(term330818, term330818.getClass(), "propListHead", null);
        setIntField(term330818, term330818.getClass(), "sourcePosition", 0);
        setField(term330818, term330818.getClass(), "jsType", null);
        setField(term330818, term330818.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term329752;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term329662, args);
        assertTrue(recursiveEquals(term329662, term330882));
        assertTrue(recursiveEquals(term329752, term330883));
        assertTrue(recursiveEquals(retValue, term330818));
    }

};


