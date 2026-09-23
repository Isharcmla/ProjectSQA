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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121279;
     Object term121369;
     Object term203436;
     Object term203437;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term121369 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term121439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term121595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122525 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term122595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121525, term121525.getClass(), "type", 85);
        setIntField(term121595, term121595.getClass(), "type", 85);
        setIntField(term121665, term121665.getClass(), "type", 85);
        setIntField(term121735, term121735.getClass(), "type", 85);
        setIntField(term121805, term121805.getClass(), "type", 85);
        setIntField(term121875, term121875.getClass(), "type", 85);
        setIntField(term121945, term121945.getClass(), "type", 85);
        setIntField(term122015, term122015.getClass(), "type", 85);
        setIntField(term122085, term122085.getClass(), "type", 85);
        setIntField(term122155, term122155.getClass(), "type", 85);
        setIntField(term122225, term122225.getClass(), "type", 85);
        setIntField(term122295, term122295.getClass(), "type", 85);
        setIntField(term122365, term122365.getClass(), "type", 85);
        setIntField(term122435, term122435.getClass(), "type", 85);
        setField(term122435, term122435.getClass(), "last", term122525);
        setField(term122365, term122365.getClass(), "last", term122435);
        setField(term122295, term122295.getClass(), "last", term122365);
        setField(term122225, term122225.getClass(), "last", term122295);
        setField(term122155, term122155.getClass(), "last", term122225);
        setField(term122085, term122085.getClass(), "last", term122155);
        setField(term122015, term122015.getClass(), "last", term122085);
        setField(term121945, term121945.getClass(), "last", term122015);
        setField(term121875, term121875.getClass(), "last", term121945);
        setField(term121805, term121805.getClass(), "last", term121875);
        setField(term121735, term121735.getClass(), "last", term121805);
        setField(term121665, term121665.getClass(), "last", term121735);
        setField(term121595, term121595.getClass(), "last", term121665);
        setField(term121525, term121525.getClass(), "last", term121595);
        setField(term121439, term121439.getClass(), "next", term121525);
        setIntField(term121439, term121439.getClass(), "type", 85);
        setIntField(term122595, term122595.getClass(), "type", 85);
        setField(term122595, term122595.getClass(), "last", term121525);
        setField(term121439, term121439.getClass(), "last", term122595);
        setField(term121369, term121369.getClass(), "first", term121439);
        term203436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term203436, term203436.getClass(), "currentTraversal", null);
        term203437 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term203438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term203440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203437, term203437.getClass(), "encodedSourceStart", 0);
        setIntField(term203437, term203437.getClass(), "encodedSourceEnd", 0);
        setField(term203437, term203437.getClass(), "sourceName", null);
        setIntField(term203437, term203437.getClass(), "baseLineno", 0);
        setIntField(term203437, term203437.getClass(), "endLineno", 0);
        setField(term203437, term203437.getClass(), "functions", null);
        setField(term203437, term203437.getClass(), "regexps", null);
        setField(term203437, term203437.getClass(), "itsVariables", null);
        setField(term203437, term203437.getClass(), "itsConst", null);
        setField(term203437, term203437.getClass(), "itsVariableNames", null);
        setIntField(term203437, term203437.getClass(), "varStart", 0);
        setField(term203437, term203437.getClass(), "compilerData", null);
        setIntField(term203437, term203437.getClass(), "type", 0);
        setField(term203437, term203437.getClass(), "next", null);
        setIntField(term203438, term203438.getClass(), "type", 85);
        setField(term203439, term203439.getClass(), "functionName", null);
        setBooleanField(term203439, term203439.getClass(), "itsNeedsActivation", false);
        setIntField(term203439, term203439.getClass(), "itsFunctionType", 0);
        setBooleanField(term203439, term203439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term203439, term203439.getClass(), "encodedSourceStart", 0);
        setIntField(term203439, term203439.getClass(), "encodedSourceEnd", 0);
        setField(term203439, term203439.getClass(), "sourceName", null);
        setIntField(term203439, term203439.getClass(), "baseLineno", 0);
        setIntField(term203439, term203439.getClass(), "endLineno", 0);
        setField(term203439, term203439.getClass(), "functions", null);
        setField(term203439, term203439.getClass(), "regexps", null);
        setField(term203439, term203439.getClass(), "itsVariables", null);
        setField(term203439, term203439.getClass(), "itsConst", null);
        setField(term203439, term203439.getClass(), "itsVariableNames", null);
        setIntField(term203439, term203439.getClass(), "varStart", 0);
        setField(term203439, term203439.getClass(), "compilerData", null);
        setIntField(term203439, term203439.getClass(), "type", 85);
        setField(term203439, term203439.getClass(), "next", null);
        setField(term203439, term203439.getClass(), "first", null);
        setIntField(term203440, term203440.getClass(), "type", 85);
        setField(term203440, term203440.getClass(), "next", null);
        setField(term203440, term203440.getClass(), "first", null);
        setIntField(term203441, term203441.getClass(), "type", 85);
        setField(term203441, term203441.getClass(), "next", null);
        setField(term203441, term203441.getClass(), "first", null);
        setField(term203441, term203441.getClass(), "last", null);
        setField(term203441, term203441.getClass(), "propListHead", null);
        setIntField(term203441, term203441.getClass(), "sourcePosition", 0);
        setField(term203441, term203441.getClass(), "jsType", null);
        setField(term203441, term203441.getClass(), "parent", null);
        setField(term203440, term203440.getClass(), "last", term203441);
        setField(term203440, term203440.getClass(), "propListHead", null);
        setIntField(term203440, term203440.getClass(), "sourcePosition", 0);
        setField(term203440, term203440.getClass(), "jsType", null);
        setField(term203440, term203440.getClass(), "parent", null);
        setField(term203439, term203439.getClass(), "last", term203440);
        setField(term203439, term203439.getClass(), "propListHead", null);
        setIntField(term203439, term203439.getClass(), "sourcePosition", 0);
        setField(term203439, term203439.getClass(), "jsType", null);
        setField(term203439, term203439.getClass(), "parent", null);
        setField(term203438, term203438.getClass(), "next", term203439);
        setField(term203438, term203438.getClass(), "first", null);
        setIntField(term203442, term203442.getClass(), "type", 85);
        setField(term203442, term203442.getClass(), "next", null);
        setField(term203442, term203442.getClass(), "first", null);
        setField(term203442, term203442.getClass(), "last", term203439);
        setField(term203442, term203442.getClass(), "propListHead", null);
        setIntField(term203442, term203442.getClass(), "sourcePosition", 0);
        setField(term203442, term203442.getClass(), "jsType", null);
        setField(term203442, term203442.getClass(), "parent", null);
        setField(term203438, term203438.getClass(), "last", term203442);
        setField(term203438, term203438.getClass(), "propListHead", null);
        setIntField(term203438, term203438.getClass(), "sourcePosition", 0);
        setField(term203438, term203438.getClass(), "jsType", null);
        setField(term203438, term203438.getClass(), "parent", null);
        setField(term203437, term203437.getClass(), "first", term203438);
        setField(term203437, term203437.getClass(), "last", null);
        setField(term203437, term203437.getClass(), "propListHead", null);
        setIntField(term203437, term203437.getClass(), "sourcePosition", 0);
        setField(term203437, term203437.getClass(), "jsType", null);
        setField(term203437, term203437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term121369;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term121279, args);
        assertTrue(recursiveEquals(term121279, term203436));
        assertTrue(recursiveEquals(term121369, term203437));
    }

};


