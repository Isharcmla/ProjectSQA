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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348065;
     Object term348151;
     Object term348307;
     Object term348393;
     Object term348510;
     Object term348511;
     Object term348513;
     Object term348514;
     Object term348439;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348065 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term348151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term348151, term348151.getClass(), "parent", term348221);
        setIntField(term348151, term348151.getClass(), "type", 0);
        term348307 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term348307, term348307.getClass(), "type", 0);
        term348393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term348393, term348393.getClass(), "type", 63);
        term348510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term348510, term348510.getClass(), "currentTraversal", null);
        term348511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term348511, term348511.getClass(), "functionName", null);
        setBooleanField(term348511, term348511.getClass(), "itsNeedsActivation", false);
        setIntField(term348511, term348511.getClass(), "itsFunctionType", 0);
        setBooleanField(term348511, term348511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348511, term348511.getClass(), "encodedSourceStart", 0);
        setIntField(term348511, term348511.getClass(), "encodedSourceEnd", 0);
        setField(term348511, term348511.getClass(), "sourceName", null);
        setIntField(term348511, term348511.getClass(), "baseLineno", 0);
        setIntField(term348511, term348511.getClass(), "endLineno", 0);
        setField(term348511, term348511.getClass(), "functions", null);
        setField(term348511, term348511.getClass(), "regexps", null);
        setField(term348511, term348511.getClass(), "itsVariables", null);
        setField(term348511, term348511.getClass(), "itsConst", null);
        setField(term348511, term348511.getClass(), "itsVariableNames", null);
        setIntField(term348511, term348511.getClass(), "varStart", 0);
        setField(term348511, term348511.getClass(), "compilerData", null);
        setIntField(term348511, term348511.getClass(), "type", 0);
        setField(term348511, term348511.getClass(), "next", null);
        setField(term348511, term348511.getClass(), "first", null);
        setField(term348511, term348511.getClass(), "last", null);
        setField(term348511, term348511.getClass(), "propListHead", null);
        setIntField(term348511, term348511.getClass(), "sourcePosition", 0);
        setField(term348511, term348511.getClass(), "jsType", null);
        setIntField(term348512, term348512.getClass(), "type", 0);
        setField(term348512, term348512.getClass(), "next", null);
        setField(term348512, term348512.getClass(), "first", null);
        setField(term348512, term348512.getClass(), "last", null);
        setField(term348512, term348512.getClass(), "propListHead", null);
        setIntField(term348512, term348512.getClass(), "sourcePosition", 0);
        setField(term348512, term348512.getClass(), "jsType", null);
        setField(term348512, term348512.getClass(), "parent", null);
        setField(term348511, term348511.getClass(), "parent", term348512);
        term348513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term348513, term348513.getClass(), "functionName", null);
        setBooleanField(term348513, term348513.getClass(), "itsNeedsActivation", false);
        setIntField(term348513, term348513.getClass(), "itsFunctionType", 0);
        setBooleanField(term348513, term348513.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348513, term348513.getClass(), "encodedSourceStart", 0);
        setIntField(term348513, term348513.getClass(), "encodedSourceEnd", 0);
        setField(term348513, term348513.getClass(), "sourceName", null);
        setIntField(term348513, term348513.getClass(), "baseLineno", 0);
        setIntField(term348513, term348513.getClass(), "endLineno", 0);
        setField(term348513, term348513.getClass(), "functions", null);
        setField(term348513, term348513.getClass(), "regexps", null);
        setField(term348513, term348513.getClass(), "itsVariables", null);
        setField(term348513, term348513.getClass(), "itsConst", null);
        setField(term348513, term348513.getClass(), "itsVariableNames", null);
        setIntField(term348513, term348513.getClass(), "varStart", 0);
        setField(term348513, term348513.getClass(), "compilerData", null);
        setIntField(term348513, term348513.getClass(), "type", 0);
        setField(term348513, term348513.getClass(), "next", null);
        setField(term348513, term348513.getClass(), "first", null);
        setField(term348513, term348513.getClass(), "last", null);
        setField(term348513, term348513.getClass(), "propListHead", null);
        setIntField(term348513, term348513.getClass(), "sourcePosition", 0);
        setField(term348513, term348513.getClass(), "jsType", null);
        setField(term348513, term348513.getClass(), "parent", null);
        term348514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term348514, term348514.getClass(), "functionName", null);
        setBooleanField(term348514, term348514.getClass(), "itsNeedsActivation", false);
        setIntField(term348514, term348514.getClass(), "itsFunctionType", 0);
        setBooleanField(term348514, term348514.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348514, term348514.getClass(), "encodedSourceStart", 0);
        setIntField(term348514, term348514.getClass(), "encodedSourceEnd", 0);
        setField(term348514, term348514.getClass(), "sourceName", null);
        setIntField(term348514, term348514.getClass(), "baseLineno", 0);
        setIntField(term348514, term348514.getClass(), "endLineno", 0);
        setField(term348514, term348514.getClass(), "functions", null);
        setField(term348514, term348514.getClass(), "regexps", null);
        setField(term348514, term348514.getClass(), "itsVariables", null);
        setField(term348514, term348514.getClass(), "itsConst", null);
        setField(term348514, term348514.getClass(), "itsVariableNames", null);
        setIntField(term348514, term348514.getClass(), "varStart", 0);
        setField(term348514, term348514.getClass(), "compilerData", null);
        setIntField(term348514, term348514.getClass(), "type", 63);
        setField(term348514, term348514.getClass(), "next", null);
        setField(term348514, term348514.getClass(), "first", null);
        setField(term348514, term348514.getClass(), "last", null);
        setField(term348514, term348514.getClass(), "propListHead", null);
        setIntField(term348514, term348514.getClass(), "sourcePosition", 0);
        setField(term348514, term348514.getClass(), "jsType", null);
        setField(term348514, term348514.getClass(), "parent", null);
        term348439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term348439, term348439.getClass(), "functionName", null);
        setBooleanField(term348439, term348439.getClass(), "itsNeedsActivation", false);
        setIntField(term348439, term348439.getClass(), "itsFunctionType", 0);
        setBooleanField(term348439, term348439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term348439, term348439.getClass(), "encodedSourceStart", 0);
        setIntField(term348439, term348439.getClass(), "encodedSourceEnd", 0);
        setField(term348439, term348439.getClass(), "sourceName", null);
        setIntField(term348439, term348439.getClass(), "baseLineno", 0);
        setIntField(term348439, term348439.getClass(), "endLineno", 0);
        setField(term348439, term348439.getClass(), "functions", null);
        setField(term348439, term348439.getClass(), "regexps", null);
        setField(term348439, term348439.getClass(), "itsVariables", null);
        setField(term348439, term348439.getClass(), "itsConst", null);
        setField(term348439, term348439.getClass(), "itsVariableNames", null);
        setIntField(term348439, term348439.getClass(), "varStart", 0);
        setField(term348439, term348439.getClass(), "compilerData", null);
        setIntField(term348439, term348439.getClass(), "type", 0);
        setField(term348439, term348439.getClass(), "next", null);
        setField(term348439, term348439.getClass(), "first", null);
        setField(term348439, term348439.getClass(), "last", null);
        setField(term348439, term348439.getClass(), "propListHead", null);
        setIntField(term348439, term348439.getClass(), "sourcePosition", 0);
        setField(term348439, term348439.getClass(), "jsType", null);
        setIntField(term348450, term348450.getClass(), "type", 0);
        setField(term348450, term348450.getClass(), "next", null);
        setField(term348450, term348450.getClass(), "first", null);
        setField(term348450, term348450.getClass(), "last", null);
        setField(term348450, term348450.getClass(), "propListHead", null);
        setIntField(term348450, term348450.getClass(), "sourcePosition", 0);
        setField(term348450, term348450.getClass(), "jsType", null);
        setField(term348450, term348450.getClass(), "parent", null);
        setField(term348439, term348439.getClass(), "parent", term348450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term348151;
        args[1] = term348307;
        args[2] = term348393;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term348065, args);
        assertTrue(recursiveEquals(term348065, term348510));
        assertTrue(recursiveEquals(term348151, term348511));
        assertTrue(recursiveEquals(term348307, term348513));
        assertTrue(recursiveEquals(term348393, term348514));
        assertTrue(recursiveEquals(retValue, term348439));
    }

};


