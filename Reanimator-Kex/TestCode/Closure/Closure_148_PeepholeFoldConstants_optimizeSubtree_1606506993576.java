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

public class PeepholeFoldConstants_optimizeSubtree_1606506993576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126106;
     Object term126196;
     Object term126631;
     Object term126632;
     Object term126525;

    public PeepholeFoldConstants_optimizeSubtree_1606506993576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term126196 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126286 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126376 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term126196, term126196.getClass(), "type", 33);
        setField(term126286, term126286.getClass(), "next", term126376);
        setField(term126196, term126196.getClass(), "first", term126286);
        term126631 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term126631, term126631.getClass(), "currentTraversal", null);
        term126632 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126633 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126634 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term126632, term126632.getClass(), "encodedSourceStart", 0);
        setIntField(term126632, term126632.getClass(), "encodedSourceEnd", 0);
        setField(term126632, term126632.getClass(), "sourceName", null);
        setIntField(term126632, term126632.getClass(), "baseLineno", 0);
        setIntField(term126632, term126632.getClass(), "endLineno", 0);
        setField(term126632, term126632.getClass(), "functions", null);
        setField(term126632, term126632.getClass(), "regexps", null);
        setField(term126632, term126632.getClass(), "itsVariables", null);
        setField(term126632, term126632.getClass(), "itsConst", null);
        setField(term126632, term126632.getClass(), "itsVariableNames", null);
        setIntField(term126632, term126632.getClass(), "varStart", 0);
        setField(term126632, term126632.getClass(), "compilerData", null);
        setIntField(term126632, term126632.getClass(), "type", 33);
        setField(term126632, term126632.getClass(), "next", null);
        setIntField(term126633, term126633.getClass(), "encodedSourceStart", 0);
        setIntField(term126633, term126633.getClass(), "encodedSourceEnd", 0);
        setField(term126633, term126633.getClass(), "sourceName", null);
        setIntField(term126633, term126633.getClass(), "baseLineno", 0);
        setIntField(term126633, term126633.getClass(), "endLineno", 0);
        setField(term126633, term126633.getClass(), "functions", null);
        setField(term126633, term126633.getClass(), "regexps", null);
        setField(term126633, term126633.getClass(), "itsVariables", null);
        setField(term126633, term126633.getClass(), "itsConst", null);
        setField(term126633, term126633.getClass(), "itsVariableNames", null);
        setIntField(term126633, term126633.getClass(), "varStart", 0);
        setField(term126633, term126633.getClass(), "compilerData", null);
        setIntField(term126633, term126633.getClass(), "type", 0);
        setIntField(term126634, term126634.getClass(), "encodedSourceStart", 0);
        setIntField(term126634, term126634.getClass(), "encodedSourceEnd", 0);
        setField(term126634, term126634.getClass(), "sourceName", null);
        setIntField(term126634, term126634.getClass(), "baseLineno", 0);
        setIntField(term126634, term126634.getClass(), "endLineno", 0);
        setField(term126634, term126634.getClass(), "functions", null);
        setField(term126634, term126634.getClass(), "regexps", null);
        setField(term126634, term126634.getClass(), "itsVariables", null);
        setField(term126634, term126634.getClass(), "itsConst", null);
        setField(term126634, term126634.getClass(), "itsVariableNames", null);
        setIntField(term126634, term126634.getClass(), "varStart", 0);
        setField(term126634, term126634.getClass(), "compilerData", null);
        setIntField(term126634, term126634.getClass(), "type", 0);
        setField(term126634, term126634.getClass(), "next", null);
        setField(term126634, term126634.getClass(), "first", null);
        setField(term126634, term126634.getClass(), "last", null);
        setField(term126634, term126634.getClass(), "propListHead", null);
        setIntField(term126634, term126634.getClass(), "sourcePosition", 0);
        setField(term126634, term126634.getClass(), "jsType", null);
        setField(term126634, term126634.getClass(), "parent", null);
        setField(term126633, term126633.getClass(), "next", term126634);
        setField(term126633, term126633.getClass(), "first", null);
        setField(term126633, term126633.getClass(), "last", null);
        setField(term126633, term126633.getClass(), "propListHead", null);
        setIntField(term126633, term126633.getClass(), "sourcePosition", 0);
        setField(term126633, term126633.getClass(), "jsType", null);
        setField(term126633, term126633.getClass(), "parent", null);
        setField(term126632, term126632.getClass(), "first", term126633);
        setField(term126632, term126632.getClass(), "last", null);
        setField(term126632, term126632.getClass(), "propListHead", null);
        setIntField(term126632, term126632.getClass(), "sourcePosition", 0);
        setField(term126632, term126632.getClass(), "jsType", null);
        setField(term126632, term126632.getClass(), "parent", null);
        term126525 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126532 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term126539 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term126525, term126525.getClass(), "encodedSourceStart", 0);
        setIntField(term126525, term126525.getClass(), "encodedSourceEnd", 0);
        setField(term126525, term126525.getClass(), "sourceName", null);
        setIntField(term126525, term126525.getClass(), "baseLineno", 0);
        setIntField(term126525, term126525.getClass(), "endLineno", 0);
        setField(term126525, term126525.getClass(), "functions", null);
        setField(term126525, term126525.getClass(), "regexps", null);
        setField(term126525, term126525.getClass(), "itsVariables", null);
        setField(term126525, term126525.getClass(), "itsConst", null);
        setField(term126525, term126525.getClass(), "itsVariableNames", null);
        setIntField(term126525, term126525.getClass(), "varStart", 0);
        setField(term126525, term126525.getClass(), "compilerData", null);
        setIntField(term126525, term126525.getClass(), "type", 33);
        setField(term126525, term126525.getClass(), "next", null);
        setIntField(term126532, term126532.getClass(), "encodedSourceStart", 0);
        setIntField(term126532, term126532.getClass(), "encodedSourceEnd", 0);
        setField(term126532, term126532.getClass(), "sourceName", null);
        setIntField(term126532, term126532.getClass(), "baseLineno", 0);
        setIntField(term126532, term126532.getClass(), "endLineno", 0);
        setField(term126532, term126532.getClass(), "functions", null);
        setField(term126532, term126532.getClass(), "regexps", null);
        setField(term126532, term126532.getClass(), "itsVariables", null);
        setField(term126532, term126532.getClass(), "itsConst", null);
        setField(term126532, term126532.getClass(), "itsVariableNames", null);
        setIntField(term126532, term126532.getClass(), "varStart", 0);
        setField(term126532, term126532.getClass(), "compilerData", null);
        setIntField(term126532, term126532.getClass(), "type", 0);
        setIntField(term126539, term126539.getClass(), "encodedSourceStart", 0);
        setIntField(term126539, term126539.getClass(), "encodedSourceEnd", 0);
        setField(term126539, term126539.getClass(), "sourceName", null);
        setIntField(term126539, term126539.getClass(), "baseLineno", 0);
        setIntField(term126539, term126539.getClass(), "endLineno", 0);
        setField(term126539, term126539.getClass(), "functions", null);
        setField(term126539, term126539.getClass(), "regexps", null);
        setField(term126539, term126539.getClass(), "itsVariables", null);
        setField(term126539, term126539.getClass(), "itsConst", null);
        setField(term126539, term126539.getClass(), "itsVariableNames", null);
        setIntField(term126539, term126539.getClass(), "varStart", 0);
        setField(term126539, term126539.getClass(), "compilerData", null);
        setIntField(term126539, term126539.getClass(), "type", 0);
        setField(term126539, term126539.getClass(), "next", null);
        setField(term126539, term126539.getClass(), "first", null);
        setField(term126539, term126539.getClass(), "last", null);
        setField(term126539, term126539.getClass(), "propListHead", null);
        setIntField(term126539, term126539.getClass(), "sourcePosition", 0);
        setField(term126539, term126539.getClass(), "jsType", null);
        setField(term126539, term126539.getClass(), "parent", null);
        setField(term126532, term126532.getClass(), "next", term126539);
        setField(term126532, term126532.getClass(), "first", null);
        setField(term126532, term126532.getClass(), "last", null);
        setField(term126532, term126532.getClass(), "propListHead", null);
        setIntField(term126532, term126532.getClass(), "sourcePosition", 0);
        setField(term126532, term126532.getClass(), "jsType", null);
        setField(term126532, term126532.getClass(), "parent", null);
        setField(term126525, term126525.getClass(), "first", term126532);
        setField(term126525, term126525.getClass(), "last", null);
        setField(term126525, term126525.getClass(), "propListHead", null);
        setIntField(term126525, term126525.getClass(), "sourcePosition", 0);
        setField(term126525, term126525.getClass(), "jsType", null);
        setField(term126525, term126525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126196;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term126106, args);
        assertTrue(recursiveEquals(term126106, term126631));
        assertTrue(recursiveEquals(term126196, term126632));
        assertTrue(recursiveEquals(retValue, term126525));
    }

};


