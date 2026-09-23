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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460756;
     Object term460846;
     Object term461109;
     Object term461110;
     Object term461043;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460756 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term460846 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term460936 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term461026 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term460936, term460936.getClass(), "next", term461026);
        setField(term460846, term460846.getClass(), "first", term460936);
        setIntField(term460846, term460846.getClass(), "type", 33);
        term461109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term461109, term461109.getClass(), "currentTraversal", null);
        term461110 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term461111 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term461112 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term461110, term461110.getClass(), "encodedSourceStart", 0);
        setIntField(term461110, term461110.getClass(), "encodedSourceEnd", 0);
        setField(term461110, term461110.getClass(), "sourceName", null);
        setIntField(term461110, term461110.getClass(), "baseLineno", 0);
        setIntField(term461110, term461110.getClass(), "endLineno", 0);
        setField(term461110, term461110.getClass(), "functions", null);
        setField(term461110, term461110.getClass(), "regexps", null);
        setField(term461110, term461110.getClass(), "itsVariables", null);
        setField(term461110, term461110.getClass(), "itsConst", null);
        setField(term461110, term461110.getClass(), "itsVariableNames", null);
        setIntField(term461110, term461110.getClass(), "varStart", 0);
        setField(term461110, term461110.getClass(), "compilerData", null);
        setIntField(term461110, term461110.getClass(), "type", 33);
        setField(term461110, term461110.getClass(), "next", null);
        setIntField(term461111, term461111.getClass(), "encodedSourceStart", 0);
        setIntField(term461111, term461111.getClass(), "encodedSourceEnd", 0);
        setField(term461111, term461111.getClass(), "sourceName", null);
        setIntField(term461111, term461111.getClass(), "baseLineno", 0);
        setIntField(term461111, term461111.getClass(), "endLineno", 0);
        setField(term461111, term461111.getClass(), "functions", null);
        setField(term461111, term461111.getClass(), "regexps", null);
        setField(term461111, term461111.getClass(), "itsVariables", null);
        setField(term461111, term461111.getClass(), "itsConst", null);
        setField(term461111, term461111.getClass(), "itsVariableNames", null);
        setIntField(term461111, term461111.getClass(), "varStart", 0);
        setField(term461111, term461111.getClass(), "compilerData", null);
        setIntField(term461111, term461111.getClass(), "type", 0);
        setIntField(term461112, term461112.getClass(), "encodedSourceStart", 0);
        setIntField(term461112, term461112.getClass(), "encodedSourceEnd", 0);
        setField(term461112, term461112.getClass(), "sourceName", null);
        setIntField(term461112, term461112.getClass(), "baseLineno", 0);
        setIntField(term461112, term461112.getClass(), "endLineno", 0);
        setField(term461112, term461112.getClass(), "functions", null);
        setField(term461112, term461112.getClass(), "regexps", null);
        setField(term461112, term461112.getClass(), "itsVariables", null);
        setField(term461112, term461112.getClass(), "itsConst", null);
        setField(term461112, term461112.getClass(), "itsVariableNames", null);
        setIntField(term461112, term461112.getClass(), "varStart", 0);
        setField(term461112, term461112.getClass(), "compilerData", null);
        setIntField(term461112, term461112.getClass(), "type", 0);
        setField(term461112, term461112.getClass(), "next", null);
        setField(term461112, term461112.getClass(), "first", null);
        setField(term461112, term461112.getClass(), "last", null);
        setField(term461112, term461112.getClass(), "propListHead", null);
        setIntField(term461112, term461112.getClass(), "sourcePosition", 0);
        setField(term461112, term461112.getClass(), "jsType", null);
        setField(term461112, term461112.getClass(), "parent", null);
        setField(term461111, term461111.getClass(), "next", term461112);
        setField(term461111, term461111.getClass(), "first", null);
        setField(term461111, term461111.getClass(), "last", null);
        setField(term461111, term461111.getClass(), "propListHead", null);
        setIntField(term461111, term461111.getClass(), "sourcePosition", 0);
        setField(term461111, term461111.getClass(), "jsType", null);
        setField(term461111, term461111.getClass(), "parent", null);
        setField(term461110, term461110.getClass(), "first", term461111);
        setField(term461110, term461110.getClass(), "last", null);
        setField(term461110, term461110.getClass(), "propListHead", null);
        setIntField(term461110, term461110.getClass(), "sourcePosition", 0);
        setField(term461110, term461110.getClass(), "jsType", null);
        setField(term461110, term461110.getClass(), "parent", null);
        term461043 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term461050 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term461057 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term461043, term461043.getClass(), "encodedSourceStart", 0);
        setIntField(term461043, term461043.getClass(), "encodedSourceEnd", 0);
        setField(term461043, term461043.getClass(), "sourceName", null);
        setIntField(term461043, term461043.getClass(), "baseLineno", 0);
        setIntField(term461043, term461043.getClass(), "endLineno", 0);
        setField(term461043, term461043.getClass(), "functions", null);
        setField(term461043, term461043.getClass(), "regexps", null);
        setField(term461043, term461043.getClass(), "itsVariables", null);
        setField(term461043, term461043.getClass(), "itsConst", null);
        setField(term461043, term461043.getClass(), "itsVariableNames", null);
        setIntField(term461043, term461043.getClass(), "varStart", 0);
        setField(term461043, term461043.getClass(), "compilerData", null);
        setIntField(term461043, term461043.getClass(), "type", 33);
        setField(term461043, term461043.getClass(), "next", null);
        setIntField(term461050, term461050.getClass(), "encodedSourceStart", 0);
        setIntField(term461050, term461050.getClass(), "encodedSourceEnd", 0);
        setField(term461050, term461050.getClass(), "sourceName", null);
        setIntField(term461050, term461050.getClass(), "baseLineno", 0);
        setIntField(term461050, term461050.getClass(), "endLineno", 0);
        setField(term461050, term461050.getClass(), "functions", null);
        setField(term461050, term461050.getClass(), "regexps", null);
        setField(term461050, term461050.getClass(), "itsVariables", null);
        setField(term461050, term461050.getClass(), "itsConst", null);
        setField(term461050, term461050.getClass(), "itsVariableNames", null);
        setIntField(term461050, term461050.getClass(), "varStart", 0);
        setField(term461050, term461050.getClass(), "compilerData", null);
        setIntField(term461050, term461050.getClass(), "type", 0);
        setIntField(term461057, term461057.getClass(), "encodedSourceStart", 0);
        setIntField(term461057, term461057.getClass(), "encodedSourceEnd", 0);
        setField(term461057, term461057.getClass(), "sourceName", null);
        setIntField(term461057, term461057.getClass(), "baseLineno", 0);
        setIntField(term461057, term461057.getClass(), "endLineno", 0);
        setField(term461057, term461057.getClass(), "functions", null);
        setField(term461057, term461057.getClass(), "regexps", null);
        setField(term461057, term461057.getClass(), "itsVariables", null);
        setField(term461057, term461057.getClass(), "itsConst", null);
        setField(term461057, term461057.getClass(), "itsVariableNames", null);
        setIntField(term461057, term461057.getClass(), "varStart", 0);
        setField(term461057, term461057.getClass(), "compilerData", null);
        setIntField(term461057, term461057.getClass(), "type", 0);
        setField(term461057, term461057.getClass(), "next", null);
        setField(term461057, term461057.getClass(), "first", null);
        setField(term461057, term461057.getClass(), "last", null);
        setField(term461057, term461057.getClass(), "propListHead", null);
        setIntField(term461057, term461057.getClass(), "sourcePosition", 0);
        setField(term461057, term461057.getClass(), "jsType", null);
        setField(term461057, term461057.getClass(), "parent", null);
        setField(term461050, term461050.getClass(), "next", term461057);
        setField(term461050, term461050.getClass(), "first", null);
        setField(term461050, term461050.getClass(), "last", null);
        setField(term461050, term461050.getClass(), "propListHead", null);
        setIntField(term461050, term461050.getClass(), "sourcePosition", 0);
        setField(term461050, term461050.getClass(), "jsType", null);
        setField(term461050, term461050.getClass(), "parent", null);
        setField(term461043, term461043.getClass(), "first", term461050);
        setField(term461043, term461043.getClass(), "last", null);
        setField(term461043, term461043.getClass(), "propListHead", null);
        setIntField(term461043, term461043.getClass(), "sourcePosition", 0);
        setField(term461043, term461043.getClass(), "jsType", null);
        setField(term461043, term461043.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term460846;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term460756, args);
        assertTrue(recursiveEquals(term460756, term461109));
        assertTrue(recursiveEquals(term460846, term461110));
        assertTrue(recursiveEquals(retValue, term461043));
    }

};


