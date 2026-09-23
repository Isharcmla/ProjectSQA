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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590995;
     Object term591081;
     Object term591265;
     Object term591357;
     Object term591510;
     Object term591511;
     Object term591513;
     Object term591514;
     Object term591432;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term591081 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term591173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term591173, term591173.getClass(), "type", 108);
        setField(term591081, term591081.getClass(), "parent", term591173);
        setIntField(term591081, term591081.getClass(), "type", 0);
        term591265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term591265, term591265.getClass(), "type", 129);
        term591357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term591357, term591357.getClass(), "type", 44);
        term591510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term591510, term591510.getClass(), "currentTraversal", null);
        term591511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term591512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term591511, term591511.getClass(), "functionName", null);
        setBooleanField(term591511, term591511.getClass(), "itsNeedsActivation", false);
        setIntField(term591511, term591511.getClass(), "itsFunctionType", 0);
        setBooleanField(term591511, term591511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term591511, term591511.getClass(), "encodedSourceStart", 0);
        setIntField(term591511, term591511.getClass(), "encodedSourceEnd", 0);
        setField(term591511, term591511.getClass(), "sourceName", null);
        setIntField(term591511, term591511.getClass(), "baseLineno", 0);
        setIntField(term591511, term591511.getClass(), "endLineno", 0);
        setField(term591511, term591511.getClass(), "functions", null);
        setField(term591511, term591511.getClass(), "regexps", null);
        setField(term591511, term591511.getClass(), "itsVariables", null);
        setField(term591511, term591511.getClass(), "itsConst", null);
        setField(term591511, term591511.getClass(), "itsVariableNames", null);
        setIntField(term591511, term591511.getClass(), "varStart", 0);
        setField(term591511, term591511.getClass(), "compilerData", null);
        setIntField(term591511, term591511.getClass(), "type", 0);
        setField(term591511, term591511.getClass(), "next", null);
        setField(term591511, term591511.getClass(), "first", null);
        setField(term591511, term591511.getClass(), "last", null);
        setField(term591511, term591511.getClass(), "propListHead", null);
        setIntField(term591511, term591511.getClass(), "sourcePosition", 0);
        setField(term591511, term591511.getClass(), "jsType", null);
        setDoubleField(term591512, term591512.getClass(), "number", 0.0);
        setIntField(term591512, term591512.getClass(), "type", 108);
        setField(term591512, term591512.getClass(), "next", null);
        setField(term591512, term591512.getClass(), "first", null);
        setField(term591512, term591512.getClass(), "last", null);
        setField(term591512, term591512.getClass(), "propListHead", null);
        setIntField(term591512, term591512.getClass(), "sourcePosition", 0);
        setField(term591512, term591512.getClass(), "jsType", null);
        setField(term591512, term591512.getClass(), "parent", null);
        setField(term591511, term591511.getClass(), "parent", term591512);
        term591513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term591513, term591513.getClass(), "number", 0.0);
        setIntField(term591513, term591513.getClass(), "type", 129);
        setField(term591513, term591513.getClass(), "next", null);
        setField(term591513, term591513.getClass(), "first", null);
        setField(term591513, term591513.getClass(), "last", null);
        setField(term591513, term591513.getClass(), "propListHead", null);
        setIntField(term591513, term591513.getClass(), "sourcePosition", 0);
        setField(term591513, term591513.getClass(), "jsType", null);
        setField(term591513, term591513.getClass(), "parent", null);
        term591514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term591514, term591514.getClass(), "str", null);
        setIntField(term591514, term591514.getClass(), "type", 44);
        setField(term591514, term591514.getClass(), "next", null);
        setField(term591514, term591514.getClass(), "first", null);
        setField(term591514, term591514.getClass(), "last", null);
        setField(term591514, term591514.getClass(), "propListHead", null);
        setIntField(term591514, term591514.getClass(), "sourcePosition", 0);
        setField(term591514, term591514.getClass(), "jsType", null);
        setField(term591514, term591514.getClass(), "parent", null);
        term591432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term591443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term591432, term591432.getClass(), "functionName", null);
        setBooleanField(term591432, term591432.getClass(), "itsNeedsActivation", false);
        setIntField(term591432, term591432.getClass(), "itsFunctionType", 0);
        setBooleanField(term591432, term591432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term591432, term591432.getClass(), "encodedSourceStart", 0);
        setIntField(term591432, term591432.getClass(), "encodedSourceEnd", 0);
        setField(term591432, term591432.getClass(), "sourceName", null);
        setIntField(term591432, term591432.getClass(), "baseLineno", 0);
        setIntField(term591432, term591432.getClass(), "endLineno", 0);
        setField(term591432, term591432.getClass(), "functions", null);
        setField(term591432, term591432.getClass(), "regexps", null);
        setField(term591432, term591432.getClass(), "itsVariables", null);
        setField(term591432, term591432.getClass(), "itsConst", null);
        setField(term591432, term591432.getClass(), "itsVariableNames", null);
        setIntField(term591432, term591432.getClass(), "varStart", 0);
        setField(term591432, term591432.getClass(), "compilerData", null);
        setIntField(term591432, term591432.getClass(), "type", 0);
        setField(term591432, term591432.getClass(), "next", null);
        setField(term591432, term591432.getClass(), "first", null);
        setField(term591432, term591432.getClass(), "last", null);
        setField(term591432, term591432.getClass(), "propListHead", null);
        setIntField(term591432, term591432.getClass(), "sourcePosition", 0);
        setField(term591432, term591432.getClass(), "jsType", null);
        setDoubleField(term591443, term591443.getClass(), "number", 0.0);
        setIntField(term591443, term591443.getClass(), "type", 108);
        setField(term591443, term591443.getClass(), "next", null);
        setField(term591443, term591443.getClass(), "first", null);
        setField(term591443, term591443.getClass(), "last", null);
        setField(term591443, term591443.getClass(), "propListHead", null);
        setIntField(term591443, term591443.getClass(), "sourcePosition", 0);
        setField(term591443, term591443.getClass(), "jsType", null);
        setField(term591443, term591443.getClass(), "parent", null);
        setField(term591432, term591432.getClass(), "parent", term591443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term591081;
        args[1] = term591265;
        args[2] = term591357;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term590995, args);
        assertTrue(recursiveEquals(term590995, term591510));
        assertTrue(recursiveEquals(term591081, term591511));
        assertTrue(recursiveEquals(term591265, term591513));
        assertTrue(recursiveEquals(term591357, term591514));
        assertTrue(recursiveEquals(retValue, term591432));
    }

};


