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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324897;
     Object term324989;
     Object term325075;
     Object term325369;
     Object term325370;
     Object term325371;
     Object term325329;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term324989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term324989, term324989.getClass(), "parent", null);
        setIntField(term324989, term324989.getClass(), "type", 63);
        term325075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term325075, term325075.getClass(), "type", 63);
        term325369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term325369, term325369.getClass(), "currentTraversal", null);
        term325370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term325370, term325370.getClass(), "number", 0.0);
        setIntField(term325370, term325370.getClass(), "type", 63);
        setField(term325370, term325370.getClass(), "next", null);
        setField(term325370, term325370.getClass(), "first", null);
        setField(term325370, term325370.getClass(), "last", null);
        setField(term325370, term325370.getClass(), "propListHead", null);
        setIntField(term325370, term325370.getClass(), "sourcePosition", 0);
        setField(term325370, term325370.getClass(), "jsType", null);
        setField(term325370, term325370.getClass(), "parent", null);
        term325371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325371, term325371.getClass(), "functionName", null);
        setBooleanField(term325371, term325371.getClass(), "itsNeedsActivation", false);
        setIntField(term325371, term325371.getClass(), "itsFunctionType", 0);
        setBooleanField(term325371, term325371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term325371, term325371.getClass(), "encodedSourceStart", 0);
        setIntField(term325371, term325371.getClass(), "encodedSourceEnd", 0);
        setField(term325371, term325371.getClass(), "sourceName", null);
        setIntField(term325371, term325371.getClass(), "baseLineno", 0);
        setIntField(term325371, term325371.getClass(), "endLineno", 0);
        setField(term325371, term325371.getClass(), "functions", null);
        setField(term325371, term325371.getClass(), "regexps", null);
        setField(term325371, term325371.getClass(), "itsVariables", null);
        setField(term325371, term325371.getClass(), "itsConst", null);
        setField(term325371, term325371.getClass(), "itsVariableNames", null);
        setIntField(term325371, term325371.getClass(), "varStart", 0);
        setField(term325371, term325371.getClass(), "compilerData", null);
        setIntField(term325371, term325371.getClass(), "type", 63);
        setField(term325371, term325371.getClass(), "next", null);
        setField(term325371, term325371.getClass(), "first", null);
        setField(term325371, term325371.getClass(), "last", null);
        setField(term325371, term325371.getClass(), "propListHead", null);
        setIntField(term325371, term325371.getClass(), "sourcePosition", 0);
        setField(term325371, term325371.getClass(), "jsType", null);
        setField(term325371, term325371.getClass(), "parent", null);
        term325329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term325329, term325329.getClass(), "number", 0.0);
        setIntField(term325329, term325329.getClass(), "type", 63);
        setField(term325329, term325329.getClass(), "next", null);
        setField(term325329, term325329.getClass(), "first", null);
        setField(term325329, term325329.getClass(), "last", null);
        setField(term325329, term325329.getClass(), "propListHead", null);
        setIntField(term325329, term325329.getClass(), "sourcePosition", 0);
        setField(term325329, term325329.getClass(), "jsType", null);
        setField(term325329, term325329.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term324989;
        args[1] = term325075;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term324897, args);
        assertTrue(recursiveEquals(term324897, term325369));
        assertTrue(recursiveEquals(term324989, term325370));
        assertTrue(recursiveEquals(term325075, term325371));
        assertTrue(recursiveEquals(retValue, term325329));
    }

};


