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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692117;
     Object term692203;
     Object term692387;
     Object term692479;
     Object term692864;
     Object term692865;
     Object term692867;
     Object term692868;
     Object term692785;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term692203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term692295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term692295, term692295.getClass(), "type", 108);
        setField(term692203, term692203.getClass(), "parent", term692295);
        setIntField(term692203, term692203.getClass(), "type", 100);
        term692387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term692387, term692387.getClass(), "type", 102);
        term692479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term692479, term692479.getClass(), "type", 44);
        term692864 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term692864, term692864.getClass(), "currentTraversal", null);
        term692865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term692866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term692865, term692865.getClass(), "functionName", null);
        setBooleanField(term692865, term692865.getClass(), "itsNeedsActivation", false);
        setIntField(term692865, term692865.getClass(), "itsFunctionType", 0);
        setBooleanField(term692865, term692865.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term692865, term692865.getClass(), "encodedSourceStart", 0);
        setIntField(term692865, term692865.getClass(), "encodedSourceEnd", 0);
        setField(term692865, term692865.getClass(), "sourceName", null);
        setIntField(term692865, term692865.getClass(), "baseLineno", 0);
        setIntField(term692865, term692865.getClass(), "endLineno", 0);
        setField(term692865, term692865.getClass(), "functions", null);
        setField(term692865, term692865.getClass(), "regexps", null);
        setField(term692865, term692865.getClass(), "itsVariables", null);
        setField(term692865, term692865.getClass(), "itsConst", null);
        setField(term692865, term692865.getClass(), "itsVariableNames", null);
        setIntField(term692865, term692865.getClass(), "varStart", 0);
        setField(term692865, term692865.getClass(), "compilerData", null);
        setIntField(term692865, term692865.getClass(), "type", 100);
        setField(term692865, term692865.getClass(), "next", null);
        setField(term692865, term692865.getClass(), "first", null);
        setField(term692865, term692865.getClass(), "last", null);
        setField(term692865, term692865.getClass(), "propListHead", null);
        setIntField(term692865, term692865.getClass(), "sourcePosition", 0);
        setField(term692865, term692865.getClass(), "jsType", null);
        setDoubleField(term692866, term692866.getClass(), "number", 0.0);
        setIntField(term692866, term692866.getClass(), "type", 108);
        setField(term692866, term692866.getClass(), "next", null);
        setField(term692866, term692866.getClass(), "first", null);
        setField(term692866, term692866.getClass(), "last", null);
        setField(term692866, term692866.getClass(), "propListHead", null);
        setIntField(term692866, term692866.getClass(), "sourcePosition", 0);
        setField(term692866, term692866.getClass(), "jsType", null);
        setField(term692866, term692866.getClass(), "parent", null);
        setField(term692865, term692865.getClass(), "parent", term692866);
        term692867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term692867, term692867.getClass(), "number", 0.0);
        setIntField(term692867, term692867.getClass(), "type", 102);
        setField(term692867, term692867.getClass(), "next", null);
        setField(term692867, term692867.getClass(), "first", null);
        setField(term692867, term692867.getClass(), "last", null);
        setField(term692867, term692867.getClass(), "propListHead", null);
        setIntField(term692867, term692867.getClass(), "sourcePosition", 0);
        setField(term692867, term692867.getClass(), "jsType", null);
        setField(term692867, term692867.getClass(), "parent", null);
        term692868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term692868, term692868.getClass(), "str", null);
        setIntField(term692868, term692868.getClass(), "type", 44);
        setField(term692868, term692868.getClass(), "next", null);
        setField(term692868, term692868.getClass(), "first", null);
        setField(term692868, term692868.getClass(), "last", null);
        setField(term692868, term692868.getClass(), "propListHead", null);
        setIntField(term692868, term692868.getClass(), "sourcePosition", 0);
        setField(term692868, term692868.getClass(), "jsType", null);
        setField(term692868, term692868.getClass(), "parent", null);
        term692785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term692796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term692785, term692785.getClass(), "functionName", null);
        setBooleanField(term692785, term692785.getClass(), "itsNeedsActivation", false);
        setIntField(term692785, term692785.getClass(), "itsFunctionType", 0);
        setBooleanField(term692785, term692785.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term692785, term692785.getClass(), "encodedSourceStart", 0);
        setIntField(term692785, term692785.getClass(), "encodedSourceEnd", 0);
        setField(term692785, term692785.getClass(), "sourceName", null);
        setIntField(term692785, term692785.getClass(), "baseLineno", 0);
        setIntField(term692785, term692785.getClass(), "endLineno", 0);
        setField(term692785, term692785.getClass(), "functions", null);
        setField(term692785, term692785.getClass(), "regexps", null);
        setField(term692785, term692785.getClass(), "itsVariables", null);
        setField(term692785, term692785.getClass(), "itsConst", null);
        setField(term692785, term692785.getClass(), "itsVariableNames", null);
        setIntField(term692785, term692785.getClass(), "varStart", 0);
        setField(term692785, term692785.getClass(), "compilerData", null);
        setIntField(term692785, term692785.getClass(), "type", 100);
        setField(term692785, term692785.getClass(), "next", null);
        setField(term692785, term692785.getClass(), "first", null);
        setField(term692785, term692785.getClass(), "last", null);
        setField(term692785, term692785.getClass(), "propListHead", null);
        setIntField(term692785, term692785.getClass(), "sourcePosition", 0);
        setField(term692785, term692785.getClass(), "jsType", null);
        setDoubleField(term692796, term692796.getClass(), "number", 0.0);
        setIntField(term692796, term692796.getClass(), "type", 108);
        setField(term692796, term692796.getClass(), "next", null);
        setField(term692796, term692796.getClass(), "first", null);
        setField(term692796, term692796.getClass(), "last", null);
        setField(term692796, term692796.getClass(), "propListHead", null);
        setIntField(term692796, term692796.getClass(), "sourcePosition", 0);
        setField(term692796, term692796.getClass(), "jsType", null);
        setField(term692796, term692796.getClass(), "parent", null);
        setField(term692785, term692785.getClass(), "parent", term692796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term692203;
        args[1] = term692387;
        args[2] = term692479;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term692117, args);
        assertTrue(recursiveEquals(term692117, term692864));
        assertTrue(recursiveEquals(term692203, term692865));
        assertTrue(recursiveEquals(term692387, term692867));
        assertTrue(recursiveEquals(term692479, term692868));
        assertTrue(recursiveEquals(retValue, term692785));
    }

};


