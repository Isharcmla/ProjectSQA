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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454863;
     Object term454953;
     Object term455681;
     Object term455682;
     Object term455611;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term454953 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455043 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455133 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term455043, term455043.getClass(), "next", term455133);
        setIntField(term455043, term455043.getClass(), "type", 39);
        setField(term454953, term454953.getClass(), "first", term455043);
        setIntField(term454953, term454953.getClass(), "type", 9);
        term455681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term455681, term455681.getClass(), "currentTraversal", null);
        term455682 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455683 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455684 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term455682, term455682.getClass(), "encodedSourceStart", 0);
        setIntField(term455682, term455682.getClass(), "encodedSourceEnd", 0);
        setField(term455682, term455682.getClass(), "sourceName", null);
        setIntField(term455682, term455682.getClass(), "baseLineno", 0);
        setIntField(term455682, term455682.getClass(), "endLineno", 0);
        setField(term455682, term455682.getClass(), "functions", null);
        setField(term455682, term455682.getClass(), "regexps", null);
        setField(term455682, term455682.getClass(), "itsVariables", null);
        setField(term455682, term455682.getClass(), "itsConst", null);
        setField(term455682, term455682.getClass(), "itsVariableNames", null);
        setIntField(term455682, term455682.getClass(), "varStart", 0);
        setField(term455682, term455682.getClass(), "compilerData", null);
        setIntField(term455682, term455682.getClass(), "type", 9);
        setField(term455682, term455682.getClass(), "next", null);
        setIntField(term455683, term455683.getClass(), "encodedSourceStart", 0);
        setIntField(term455683, term455683.getClass(), "encodedSourceEnd", 0);
        setField(term455683, term455683.getClass(), "sourceName", null);
        setIntField(term455683, term455683.getClass(), "baseLineno", 0);
        setIntField(term455683, term455683.getClass(), "endLineno", 0);
        setField(term455683, term455683.getClass(), "functions", null);
        setField(term455683, term455683.getClass(), "regexps", null);
        setField(term455683, term455683.getClass(), "itsVariables", null);
        setField(term455683, term455683.getClass(), "itsConst", null);
        setField(term455683, term455683.getClass(), "itsVariableNames", null);
        setIntField(term455683, term455683.getClass(), "varStart", 0);
        setField(term455683, term455683.getClass(), "compilerData", null);
        setIntField(term455683, term455683.getClass(), "type", 39);
        setIntField(term455684, term455684.getClass(), "encodedSourceStart", 0);
        setIntField(term455684, term455684.getClass(), "encodedSourceEnd", 0);
        setField(term455684, term455684.getClass(), "sourceName", null);
        setIntField(term455684, term455684.getClass(), "baseLineno", 0);
        setIntField(term455684, term455684.getClass(), "endLineno", 0);
        setField(term455684, term455684.getClass(), "functions", null);
        setField(term455684, term455684.getClass(), "regexps", null);
        setField(term455684, term455684.getClass(), "itsVariables", null);
        setField(term455684, term455684.getClass(), "itsConst", null);
        setField(term455684, term455684.getClass(), "itsVariableNames", null);
        setIntField(term455684, term455684.getClass(), "varStart", 0);
        setField(term455684, term455684.getClass(), "compilerData", null);
        setIntField(term455684, term455684.getClass(), "type", 0);
        setField(term455684, term455684.getClass(), "next", null);
        setField(term455684, term455684.getClass(), "first", null);
        setField(term455684, term455684.getClass(), "last", null);
        setField(term455684, term455684.getClass(), "propListHead", null);
        setIntField(term455684, term455684.getClass(), "sourcePosition", 0);
        setField(term455684, term455684.getClass(), "jsType", null);
        setField(term455684, term455684.getClass(), "parent", null);
        setField(term455683, term455683.getClass(), "next", term455684);
        setField(term455683, term455683.getClass(), "first", null);
        setField(term455683, term455683.getClass(), "last", null);
        setField(term455683, term455683.getClass(), "propListHead", null);
        setIntField(term455683, term455683.getClass(), "sourcePosition", 0);
        setField(term455683, term455683.getClass(), "jsType", null);
        setField(term455683, term455683.getClass(), "parent", null);
        setField(term455682, term455682.getClass(), "first", term455683);
        setField(term455682, term455682.getClass(), "last", null);
        setField(term455682, term455682.getClass(), "propListHead", null);
        setIntField(term455682, term455682.getClass(), "sourcePosition", 0);
        setField(term455682, term455682.getClass(), "jsType", null);
        setField(term455682, term455682.getClass(), "parent", null);
        term455611 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455618 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term455625 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term455611, term455611.getClass(), "encodedSourceStart", 0);
        setIntField(term455611, term455611.getClass(), "encodedSourceEnd", 0);
        setField(term455611, term455611.getClass(), "sourceName", null);
        setIntField(term455611, term455611.getClass(), "baseLineno", 0);
        setIntField(term455611, term455611.getClass(), "endLineno", 0);
        setField(term455611, term455611.getClass(), "functions", null);
        setField(term455611, term455611.getClass(), "regexps", null);
        setField(term455611, term455611.getClass(), "itsVariables", null);
        setField(term455611, term455611.getClass(), "itsConst", null);
        setField(term455611, term455611.getClass(), "itsVariableNames", null);
        setIntField(term455611, term455611.getClass(), "varStart", 0);
        setField(term455611, term455611.getClass(), "compilerData", null);
        setIntField(term455611, term455611.getClass(), "type", 9);
        setField(term455611, term455611.getClass(), "next", null);
        setIntField(term455618, term455618.getClass(), "encodedSourceStart", 0);
        setIntField(term455618, term455618.getClass(), "encodedSourceEnd", 0);
        setField(term455618, term455618.getClass(), "sourceName", null);
        setIntField(term455618, term455618.getClass(), "baseLineno", 0);
        setIntField(term455618, term455618.getClass(), "endLineno", 0);
        setField(term455618, term455618.getClass(), "functions", null);
        setField(term455618, term455618.getClass(), "regexps", null);
        setField(term455618, term455618.getClass(), "itsVariables", null);
        setField(term455618, term455618.getClass(), "itsConst", null);
        setField(term455618, term455618.getClass(), "itsVariableNames", null);
        setIntField(term455618, term455618.getClass(), "varStart", 0);
        setField(term455618, term455618.getClass(), "compilerData", null);
        setIntField(term455618, term455618.getClass(), "type", 39);
        setIntField(term455625, term455625.getClass(), "encodedSourceStart", 0);
        setIntField(term455625, term455625.getClass(), "encodedSourceEnd", 0);
        setField(term455625, term455625.getClass(), "sourceName", null);
        setIntField(term455625, term455625.getClass(), "baseLineno", 0);
        setIntField(term455625, term455625.getClass(), "endLineno", 0);
        setField(term455625, term455625.getClass(), "functions", null);
        setField(term455625, term455625.getClass(), "regexps", null);
        setField(term455625, term455625.getClass(), "itsVariables", null);
        setField(term455625, term455625.getClass(), "itsConst", null);
        setField(term455625, term455625.getClass(), "itsVariableNames", null);
        setIntField(term455625, term455625.getClass(), "varStart", 0);
        setField(term455625, term455625.getClass(), "compilerData", null);
        setIntField(term455625, term455625.getClass(), "type", 0);
        setField(term455625, term455625.getClass(), "next", null);
        setField(term455625, term455625.getClass(), "first", null);
        setField(term455625, term455625.getClass(), "last", null);
        setField(term455625, term455625.getClass(), "propListHead", null);
        setIntField(term455625, term455625.getClass(), "sourcePosition", 0);
        setField(term455625, term455625.getClass(), "jsType", null);
        setField(term455625, term455625.getClass(), "parent", null);
        setField(term455618, term455618.getClass(), "next", term455625);
        setField(term455618, term455618.getClass(), "first", null);
        setField(term455618, term455618.getClass(), "last", null);
        setField(term455618, term455618.getClass(), "propListHead", null);
        setIntField(term455618, term455618.getClass(), "sourcePosition", 0);
        setField(term455618, term455618.getClass(), "jsType", null);
        setField(term455618, term455618.getClass(), "parent", null);
        setField(term455611, term455611.getClass(), "first", term455618);
        setField(term455611, term455611.getClass(), "last", null);
        setField(term455611, term455611.getClass(), "propListHead", null);
        setIntField(term455611, term455611.getClass(), "sourcePosition", 0);
        setField(term455611, term455611.getClass(), "jsType", null);
        setField(term455611, term455611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term454953;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term454863, args);
        assertTrue(recursiveEquals(term454863, term455681));
        assertTrue(recursiveEquals(term454953, term455682));
        assertTrue(recursiveEquals(retValue, term455611));
    }

};


