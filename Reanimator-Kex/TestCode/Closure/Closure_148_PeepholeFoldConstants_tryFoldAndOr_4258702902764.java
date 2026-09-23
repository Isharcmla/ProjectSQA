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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796097;
     Object term796183;
     Object term796361;
     Object term796453;
     Object term796862;
     Object term796863;
     Object term796865;
     Object term796866;
     Object term796768;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term796097 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term796183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term796269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term796269, term796269.getClass(), "type", 113);
        setField(term796183, term796183.getClass(), "parent", term796269);
        setIntField(term796183, term796183.getClass(), "type", 0);
        term796361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term796361, term796361.getClass(), "type", 60);
        term796453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term796453, term796453.getClass(), "type", 63);
        term796862 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term796862, term796862.getClass(), "currentTraversal", null);
        term796863 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term796864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term796863, term796863.getClass(), "functionName", null);
        setBooleanField(term796863, term796863.getClass(), "itsNeedsActivation", false);
        setIntField(term796863, term796863.getClass(), "itsFunctionType", 0);
        setBooleanField(term796863, term796863.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term796863, term796863.getClass(), "encodedSourceStart", 0);
        setIntField(term796863, term796863.getClass(), "encodedSourceEnd", 0);
        setField(term796863, term796863.getClass(), "sourceName", null);
        setIntField(term796863, term796863.getClass(), "baseLineno", 0);
        setIntField(term796863, term796863.getClass(), "endLineno", 0);
        setField(term796863, term796863.getClass(), "functions", null);
        setField(term796863, term796863.getClass(), "regexps", null);
        setField(term796863, term796863.getClass(), "itsVariables", null);
        setField(term796863, term796863.getClass(), "itsConst", null);
        setField(term796863, term796863.getClass(), "itsVariableNames", null);
        setIntField(term796863, term796863.getClass(), "varStart", 0);
        setField(term796863, term796863.getClass(), "compilerData", null);
        setIntField(term796863, term796863.getClass(), "type", 0);
        setField(term796863, term796863.getClass(), "next", null);
        setField(term796863, term796863.getClass(), "first", null);
        setField(term796863, term796863.getClass(), "last", null);
        setField(term796863, term796863.getClass(), "propListHead", null);
        setIntField(term796863, term796863.getClass(), "sourcePosition", 0);
        setField(term796863, term796863.getClass(), "jsType", null);
        setField(term796864, term796864.getClass(), "functionName", null);
        setBooleanField(term796864, term796864.getClass(), "itsNeedsActivation", false);
        setIntField(term796864, term796864.getClass(), "itsFunctionType", 0);
        setBooleanField(term796864, term796864.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term796864, term796864.getClass(), "encodedSourceStart", 0);
        setIntField(term796864, term796864.getClass(), "encodedSourceEnd", 0);
        setField(term796864, term796864.getClass(), "sourceName", null);
        setIntField(term796864, term796864.getClass(), "baseLineno", 0);
        setIntField(term796864, term796864.getClass(), "endLineno", 0);
        setField(term796864, term796864.getClass(), "functions", null);
        setField(term796864, term796864.getClass(), "regexps", null);
        setField(term796864, term796864.getClass(), "itsVariables", null);
        setField(term796864, term796864.getClass(), "itsConst", null);
        setField(term796864, term796864.getClass(), "itsVariableNames", null);
        setIntField(term796864, term796864.getClass(), "varStart", 0);
        setField(term796864, term796864.getClass(), "compilerData", null);
        setIntField(term796864, term796864.getClass(), "type", 113);
        setField(term796864, term796864.getClass(), "next", null);
        setField(term796864, term796864.getClass(), "first", null);
        setField(term796864, term796864.getClass(), "last", null);
        setField(term796864, term796864.getClass(), "propListHead", null);
        setIntField(term796864, term796864.getClass(), "sourcePosition", 0);
        setField(term796864, term796864.getClass(), "jsType", null);
        setField(term796864, term796864.getClass(), "parent", null);
        setField(term796863, term796863.getClass(), "parent", term796864);
        term796865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term796865, term796865.getClass(), "number", 0.0);
        setIntField(term796865, term796865.getClass(), "type", 60);
        setField(term796865, term796865.getClass(), "next", null);
        setField(term796865, term796865.getClass(), "first", null);
        setField(term796865, term796865.getClass(), "last", null);
        setField(term796865, term796865.getClass(), "propListHead", null);
        setIntField(term796865, term796865.getClass(), "sourcePosition", 0);
        setField(term796865, term796865.getClass(), "jsType", null);
        setField(term796865, term796865.getClass(), "parent", null);
        term796866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term796866, term796866.getClass(), "number", 0.0);
        setIntField(term796866, term796866.getClass(), "type", 63);
        setField(term796866, term796866.getClass(), "next", null);
        setField(term796866, term796866.getClass(), "first", null);
        setField(term796866, term796866.getClass(), "last", null);
        setField(term796866, term796866.getClass(), "propListHead", null);
        setIntField(term796866, term796866.getClass(), "sourcePosition", 0);
        setField(term796866, term796866.getClass(), "jsType", null);
        setField(term796866, term796866.getClass(), "parent", null);
        term796768 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term796779 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term796768, term796768.getClass(), "functionName", null);
        setBooleanField(term796768, term796768.getClass(), "itsNeedsActivation", false);
        setIntField(term796768, term796768.getClass(), "itsFunctionType", 0);
        setBooleanField(term796768, term796768.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term796768, term796768.getClass(), "encodedSourceStart", 0);
        setIntField(term796768, term796768.getClass(), "encodedSourceEnd", 0);
        setField(term796768, term796768.getClass(), "sourceName", null);
        setIntField(term796768, term796768.getClass(), "baseLineno", 0);
        setIntField(term796768, term796768.getClass(), "endLineno", 0);
        setField(term796768, term796768.getClass(), "functions", null);
        setField(term796768, term796768.getClass(), "regexps", null);
        setField(term796768, term796768.getClass(), "itsVariables", null);
        setField(term796768, term796768.getClass(), "itsConst", null);
        setField(term796768, term796768.getClass(), "itsVariableNames", null);
        setIntField(term796768, term796768.getClass(), "varStart", 0);
        setField(term796768, term796768.getClass(), "compilerData", null);
        setIntField(term796768, term796768.getClass(), "type", 0);
        setField(term796768, term796768.getClass(), "next", null);
        setField(term796768, term796768.getClass(), "first", null);
        setField(term796768, term796768.getClass(), "last", null);
        setField(term796768, term796768.getClass(), "propListHead", null);
        setIntField(term796768, term796768.getClass(), "sourcePosition", 0);
        setField(term796768, term796768.getClass(), "jsType", null);
        setField(term796779, term796779.getClass(), "functionName", null);
        setBooleanField(term796779, term796779.getClass(), "itsNeedsActivation", false);
        setIntField(term796779, term796779.getClass(), "itsFunctionType", 0);
        setBooleanField(term796779, term796779.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term796779, term796779.getClass(), "encodedSourceStart", 0);
        setIntField(term796779, term796779.getClass(), "encodedSourceEnd", 0);
        setField(term796779, term796779.getClass(), "sourceName", null);
        setIntField(term796779, term796779.getClass(), "baseLineno", 0);
        setIntField(term796779, term796779.getClass(), "endLineno", 0);
        setField(term796779, term796779.getClass(), "functions", null);
        setField(term796779, term796779.getClass(), "regexps", null);
        setField(term796779, term796779.getClass(), "itsVariables", null);
        setField(term796779, term796779.getClass(), "itsConst", null);
        setField(term796779, term796779.getClass(), "itsVariableNames", null);
        setIntField(term796779, term796779.getClass(), "varStart", 0);
        setField(term796779, term796779.getClass(), "compilerData", null);
        setIntField(term796779, term796779.getClass(), "type", 113);
        setField(term796779, term796779.getClass(), "next", null);
        setField(term796779, term796779.getClass(), "first", null);
        setField(term796779, term796779.getClass(), "last", null);
        setField(term796779, term796779.getClass(), "propListHead", null);
        setIntField(term796779, term796779.getClass(), "sourcePosition", 0);
        setField(term796779, term796779.getClass(), "jsType", null);
        setField(term796779, term796779.getClass(), "parent", null);
        setField(term796768, term796768.getClass(), "parent", term796779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term796183;
        args[1] = term796361;
        args[2] = term796453;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term796097, args);
        assertTrue(recursiveEquals(term796097, term796862));
        assertTrue(recursiveEquals(term796183, term796863));
        assertTrue(recursiveEquals(term796361, term796865));
        assertTrue(recursiveEquals(term796453, term796866));
        assertTrue(recursiveEquals(retValue, term796768));
    }

};


