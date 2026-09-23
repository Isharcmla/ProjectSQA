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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791994;
     Object term792080;
     Object term792264;
     Object term792356;
     Object term792439;
     Object term792440;
     Object term792442;
     Object term792443;
     Object term792361;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term792080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term792172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term792172, term792172.getClass(), "type", 108);
        setField(term792080, term792080.getClass(), "parent", term792172);
        setIntField(term792080, term792080.getClass(), "type", 0);
        term792264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term792264, term792264.getClass(), "type", 36);
        term792356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term792356, term792356.getClass(), "type", 44);
        term792439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term792439, term792439.getClass(), "currentTraversal", null);
        term792440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term792441 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term792440, term792440.getClass(), "functionName", null);
        setBooleanField(term792440, term792440.getClass(), "itsNeedsActivation", false);
        setIntField(term792440, term792440.getClass(), "itsFunctionType", 0);
        setBooleanField(term792440, term792440.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term792440, term792440.getClass(), "encodedSourceStart", 0);
        setIntField(term792440, term792440.getClass(), "encodedSourceEnd", 0);
        setField(term792440, term792440.getClass(), "sourceName", null);
        setIntField(term792440, term792440.getClass(), "baseLineno", 0);
        setIntField(term792440, term792440.getClass(), "endLineno", 0);
        setField(term792440, term792440.getClass(), "functions", null);
        setField(term792440, term792440.getClass(), "regexps", null);
        setField(term792440, term792440.getClass(), "itsVariables", null);
        setField(term792440, term792440.getClass(), "itsConst", null);
        setField(term792440, term792440.getClass(), "itsVariableNames", null);
        setIntField(term792440, term792440.getClass(), "varStart", 0);
        setField(term792440, term792440.getClass(), "compilerData", null);
        setIntField(term792440, term792440.getClass(), "type", 0);
        setField(term792440, term792440.getClass(), "next", null);
        setField(term792440, term792440.getClass(), "first", null);
        setField(term792440, term792440.getClass(), "last", null);
        setField(term792440, term792440.getClass(), "propListHead", null);
        setIntField(term792440, term792440.getClass(), "sourcePosition", 0);
        setField(term792440, term792440.getClass(), "jsType", null);
        setDoubleField(term792441, term792441.getClass(), "number", 0.0);
        setIntField(term792441, term792441.getClass(), "type", 108);
        setField(term792441, term792441.getClass(), "next", null);
        setField(term792441, term792441.getClass(), "first", null);
        setField(term792441, term792441.getClass(), "last", null);
        setField(term792441, term792441.getClass(), "propListHead", null);
        setIntField(term792441, term792441.getClass(), "sourcePosition", 0);
        setField(term792441, term792441.getClass(), "jsType", null);
        setField(term792441, term792441.getClass(), "parent", null);
        setField(term792440, term792440.getClass(), "parent", term792441);
        term792442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term792442, term792442.getClass(), "number", 0.0);
        setIntField(term792442, term792442.getClass(), "type", 36);
        setField(term792442, term792442.getClass(), "next", null);
        setField(term792442, term792442.getClass(), "first", null);
        setField(term792442, term792442.getClass(), "last", null);
        setField(term792442, term792442.getClass(), "propListHead", null);
        setIntField(term792442, term792442.getClass(), "sourcePosition", 0);
        setField(term792442, term792442.getClass(), "jsType", null);
        setField(term792442, term792442.getClass(), "parent", null);
        term792443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term792443, term792443.getClass(), "str", null);
        setIntField(term792443, term792443.getClass(), "type", 44);
        setField(term792443, term792443.getClass(), "next", null);
        setField(term792443, term792443.getClass(), "first", null);
        setField(term792443, term792443.getClass(), "last", null);
        setField(term792443, term792443.getClass(), "propListHead", null);
        setIntField(term792443, term792443.getClass(), "sourcePosition", 0);
        setField(term792443, term792443.getClass(), "jsType", null);
        setField(term792443, term792443.getClass(), "parent", null);
        term792361 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term792372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term792361, term792361.getClass(), "functionName", null);
        setBooleanField(term792361, term792361.getClass(), "itsNeedsActivation", false);
        setIntField(term792361, term792361.getClass(), "itsFunctionType", 0);
        setBooleanField(term792361, term792361.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term792361, term792361.getClass(), "encodedSourceStart", 0);
        setIntField(term792361, term792361.getClass(), "encodedSourceEnd", 0);
        setField(term792361, term792361.getClass(), "sourceName", null);
        setIntField(term792361, term792361.getClass(), "baseLineno", 0);
        setIntField(term792361, term792361.getClass(), "endLineno", 0);
        setField(term792361, term792361.getClass(), "functions", null);
        setField(term792361, term792361.getClass(), "regexps", null);
        setField(term792361, term792361.getClass(), "itsVariables", null);
        setField(term792361, term792361.getClass(), "itsConst", null);
        setField(term792361, term792361.getClass(), "itsVariableNames", null);
        setIntField(term792361, term792361.getClass(), "varStart", 0);
        setField(term792361, term792361.getClass(), "compilerData", null);
        setIntField(term792361, term792361.getClass(), "type", 0);
        setField(term792361, term792361.getClass(), "next", null);
        setField(term792361, term792361.getClass(), "first", null);
        setField(term792361, term792361.getClass(), "last", null);
        setField(term792361, term792361.getClass(), "propListHead", null);
        setIntField(term792361, term792361.getClass(), "sourcePosition", 0);
        setField(term792361, term792361.getClass(), "jsType", null);
        setDoubleField(term792372, term792372.getClass(), "number", 0.0);
        setIntField(term792372, term792372.getClass(), "type", 108);
        setField(term792372, term792372.getClass(), "next", null);
        setField(term792372, term792372.getClass(), "first", null);
        setField(term792372, term792372.getClass(), "last", null);
        setField(term792372, term792372.getClass(), "propListHead", null);
        setIntField(term792372, term792372.getClass(), "sourcePosition", 0);
        setField(term792372, term792372.getClass(), "jsType", null);
        setField(term792372, term792372.getClass(), "parent", null);
        setField(term792361, term792361.getClass(), "parent", term792372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term792080;
        args[1] = term792264;
        args[2] = term792356;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term791994, args);
        assertTrue(recursiveEquals(term791994, term792439));
        assertTrue(recursiveEquals(term792080, term792440));
        assertTrue(recursiveEquals(term792264, term792442));
        assertTrue(recursiveEquals(term792356, term792443));
        assertTrue(recursiveEquals(retValue, term792361));
    }

};


