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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621963;
     Object term622049;
     Object term622205;
     Object term622291;
     Object term623235;
     Object term623236;
     Object term623238;
     Object term623239;
     Object term623144;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term622049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term622119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term622119, term622119.getClass(), "type", 108);
        setField(term622049, term622049.getClass(), "parent", term622119);
        setIntField(term622049, term622049.getClass(), "type", 0);
        term622205 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term622205, term622205.getClass(), "type", 31);
        term622291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term622291, term622291.getClass(), "type", 63);
        term623235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term623235, term623235.getClass(), "currentTraversal", null);
        term623236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term623237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term623236, term623236.getClass(), "functionName", null);
        setBooleanField(term623236, term623236.getClass(), "itsNeedsActivation", false);
        setIntField(term623236, term623236.getClass(), "itsFunctionType", 0);
        setBooleanField(term623236, term623236.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623236, term623236.getClass(), "encodedSourceStart", 0);
        setIntField(term623236, term623236.getClass(), "encodedSourceEnd", 0);
        setField(term623236, term623236.getClass(), "sourceName", null);
        setIntField(term623236, term623236.getClass(), "baseLineno", 0);
        setIntField(term623236, term623236.getClass(), "endLineno", 0);
        setField(term623236, term623236.getClass(), "functions", null);
        setField(term623236, term623236.getClass(), "regexps", null);
        setField(term623236, term623236.getClass(), "itsVariables", null);
        setField(term623236, term623236.getClass(), "itsConst", null);
        setField(term623236, term623236.getClass(), "itsVariableNames", null);
        setIntField(term623236, term623236.getClass(), "varStart", 0);
        setField(term623236, term623236.getClass(), "compilerData", null);
        setIntField(term623236, term623236.getClass(), "type", 0);
        setField(term623236, term623236.getClass(), "next", null);
        setField(term623236, term623236.getClass(), "first", null);
        setField(term623236, term623236.getClass(), "last", null);
        setField(term623236, term623236.getClass(), "propListHead", null);
        setIntField(term623236, term623236.getClass(), "sourcePosition", 0);
        setField(term623236, term623236.getClass(), "jsType", null);
        setIntField(term623237, term623237.getClass(), "type", 108);
        setField(term623237, term623237.getClass(), "next", null);
        setField(term623237, term623237.getClass(), "first", null);
        setField(term623237, term623237.getClass(), "last", null);
        setField(term623237, term623237.getClass(), "propListHead", null);
        setIntField(term623237, term623237.getClass(), "sourcePosition", 0);
        setField(term623237, term623237.getClass(), "jsType", null);
        setField(term623237, term623237.getClass(), "parent", null);
        setField(term623236, term623236.getClass(), "parent", term623237);
        term623238 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term623238, term623238.getClass(), "functionName", null);
        setBooleanField(term623238, term623238.getClass(), "itsNeedsActivation", false);
        setIntField(term623238, term623238.getClass(), "itsFunctionType", 0);
        setBooleanField(term623238, term623238.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623238, term623238.getClass(), "encodedSourceStart", 0);
        setIntField(term623238, term623238.getClass(), "encodedSourceEnd", 0);
        setField(term623238, term623238.getClass(), "sourceName", null);
        setIntField(term623238, term623238.getClass(), "baseLineno", 0);
        setIntField(term623238, term623238.getClass(), "endLineno", 0);
        setField(term623238, term623238.getClass(), "functions", null);
        setField(term623238, term623238.getClass(), "regexps", null);
        setField(term623238, term623238.getClass(), "itsVariables", null);
        setField(term623238, term623238.getClass(), "itsConst", null);
        setField(term623238, term623238.getClass(), "itsVariableNames", null);
        setIntField(term623238, term623238.getClass(), "varStart", 0);
        setField(term623238, term623238.getClass(), "compilerData", null);
        setIntField(term623238, term623238.getClass(), "type", 31);
        setField(term623238, term623238.getClass(), "next", null);
        setField(term623238, term623238.getClass(), "first", null);
        setField(term623238, term623238.getClass(), "last", null);
        setField(term623238, term623238.getClass(), "propListHead", null);
        setIntField(term623238, term623238.getClass(), "sourcePosition", 0);
        setField(term623238, term623238.getClass(), "jsType", null);
        setField(term623238, term623238.getClass(), "parent", null);
        term623239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term623239, term623239.getClass(), "functionName", null);
        setBooleanField(term623239, term623239.getClass(), "itsNeedsActivation", false);
        setIntField(term623239, term623239.getClass(), "itsFunctionType", 0);
        setBooleanField(term623239, term623239.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623239, term623239.getClass(), "encodedSourceStart", 0);
        setIntField(term623239, term623239.getClass(), "encodedSourceEnd", 0);
        setField(term623239, term623239.getClass(), "sourceName", null);
        setIntField(term623239, term623239.getClass(), "baseLineno", 0);
        setIntField(term623239, term623239.getClass(), "endLineno", 0);
        setField(term623239, term623239.getClass(), "functions", null);
        setField(term623239, term623239.getClass(), "regexps", null);
        setField(term623239, term623239.getClass(), "itsVariables", null);
        setField(term623239, term623239.getClass(), "itsConst", null);
        setField(term623239, term623239.getClass(), "itsVariableNames", null);
        setIntField(term623239, term623239.getClass(), "varStart", 0);
        setField(term623239, term623239.getClass(), "compilerData", null);
        setIntField(term623239, term623239.getClass(), "type", 63);
        setField(term623239, term623239.getClass(), "next", null);
        setField(term623239, term623239.getClass(), "first", null);
        setField(term623239, term623239.getClass(), "last", null);
        setField(term623239, term623239.getClass(), "propListHead", null);
        setIntField(term623239, term623239.getClass(), "sourcePosition", 0);
        setField(term623239, term623239.getClass(), "jsType", null);
        setField(term623239, term623239.getClass(), "parent", null);
        term623144 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term623155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term623144, term623144.getClass(), "functionName", null);
        setBooleanField(term623144, term623144.getClass(), "itsNeedsActivation", false);
        setIntField(term623144, term623144.getClass(), "itsFunctionType", 0);
        setBooleanField(term623144, term623144.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term623144, term623144.getClass(), "encodedSourceStart", 0);
        setIntField(term623144, term623144.getClass(), "encodedSourceEnd", 0);
        setField(term623144, term623144.getClass(), "sourceName", null);
        setIntField(term623144, term623144.getClass(), "baseLineno", 0);
        setIntField(term623144, term623144.getClass(), "endLineno", 0);
        setField(term623144, term623144.getClass(), "functions", null);
        setField(term623144, term623144.getClass(), "regexps", null);
        setField(term623144, term623144.getClass(), "itsVariables", null);
        setField(term623144, term623144.getClass(), "itsConst", null);
        setField(term623144, term623144.getClass(), "itsVariableNames", null);
        setIntField(term623144, term623144.getClass(), "varStart", 0);
        setField(term623144, term623144.getClass(), "compilerData", null);
        setIntField(term623144, term623144.getClass(), "type", 0);
        setField(term623144, term623144.getClass(), "next", null);
        setField(term623144, term623144.getClass(), "first", null);
        setField(term623144, term623144.getClass(), "last", null);
        setField(term623144, term623144.getClass(), "propListHead", null);
        setIntField(term623144, term623144.getClass(), "sourcePosition", 0);
        setField(term623144, term623144.getClass(), "jsType", null);
        setIntField(term623155, term623155.getClass(), "type", 108);
        setField(term623155, term623155.getClass(), "next", null);
        setField(term623155, term623155.getClass(), "first", null);
        setField(term623155, term623155.getClass(), "last", null);
        setField(term623155, term623155.getClass(), "propListHead", null);
        setIntField(term623155, term623155.getClass(), "sourcePosition", 0);
        setField(term623155, term623155.getClass(), "jsType", null);
        setField(term623155, term623155.getClass(), "parent", null);
        setField(term623144, term623144.getClass(), "parent", term623155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term622049;
        args[1] = term622205;
        args[2] = term622291;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term621963, args);
        assertTrue(recursiveEquals(term621963, term623235));
        assertTrue(recursiveEquals(term622049, term623236));
        assertTrue(recursiveEquals(term622205, term623238));
        assertTrue(recursiveEquals(term622291, term623239));
        assertTrue(recursiveEquals(retValue, term623144));
    }

};


