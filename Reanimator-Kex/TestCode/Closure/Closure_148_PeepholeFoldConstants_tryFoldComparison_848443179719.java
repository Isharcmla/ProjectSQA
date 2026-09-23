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

public class PeepholeFoldConstants_tryFoldComparison_848443179719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159889;
     Object term159975;
     Object term160061;
     Object term160147;
     Object term160593;
     Object term160594;
     Object term160595;
     Object term160596;
     Object term160559;

    public PeepholeFoldConstants_tryFoldComparison_848443179719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term159975 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term159975, term159975.getClass(), "type", 16);
        term160061 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term160061, term160061.getClass(), "type", 16);
        term160147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term160593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term160593, term160593.getClass(), "currentTraversal", null);
        term160594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160594, term160594.getClass(), "functionName", null);
        setBooleanField(term160594, term160594.getClass(), "itsNeedsActivation", false);
        setIntField(term160594, term160594.getClass(), "itsFunctionType", 0);
        setBooleanField(term160594, term160594.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160594, term160594.getClass(), "encodedSourceStart", 0);
        setIntField(term160594, term160594.getClass(), "encodedSourceEnd", 0);
        setField(term160594, term160594.getClass(), "sourceName", null);
        setIntField(term160594, term160594.getClass(), "baseLineno", 0);
        setIntField(term160594, term160594.getClass(), "endLineno", 0);
        setField(term160594, term160594.getClass(), "functions", null);
        setField(term160594, term160594.getClass(), "regexps", null);
        setField(term160594, term160594.getClass(), "itsVariables", null);
        setField(term160594, term160594.getClass(), "itsConst", null);
        setField(term160594, term160594.getClass(), "itsVariableNames", null);
        setIntField(term160594, term160594.getClass(), "varStart", 0);
        setField(term160594, term160594.getClass(), "compilerData", null);
        setIntField(term160594, term160594.getClass(), "type", 16);
        setField(term160594, term160594.getClass(), "next", null);
        setField(term160594, term160594.getClass(), "first", null);
        setField(term160594, term160594.getClass(), "last", null);
        setField(term160594, term160594.getClass(), "propListHead", null);
        setIntField(term160594, term160594.getClass(), "sourcePosition", 0);
        setField(term160594, term160594.getClass(), "jsType", null);
        setField(term160594, term160594.getClass(), "parent", null);
        term160595 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160595, term160595.getClass(), "functionName", null);
        setBooleanField(term160595, term160595.getClass(), "itsNeedsActivation", false);
        setIntField(term160595, term160595.getClass(), "itsFunctionType", 0);
        setBooleanField(term160595, term160595.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160595, term160595.getClass(), "encodedSourceStart", 0);
        setIntField(term160595, term160595.getClass(), "encodedSourceEnd", 0);
        setField(term160595, term160595.getClass(), "sourceName", null);
        setIntField(term160595, term160595.getClass(), "baseLineno", 0);
        setIntField(term160595, term160595.getClass(), "endLineno", 0);
        setField(term160595, term160595.getClass(), "functions", null);
        setField(term160595, term160595.getClass(), "regexps", null);
        setField(term160595, term160595.getClass(), "itsVariables", null);
        setField(term160595, term160595.getClass(), "itsConst", null);
        setField(term160595, term160595.getClass(), "itsVariableNames", null);
        setIntField(term160595, term160595.getClass(), "varStart", 0);
        setField(term160595, term160595.getClass(), "compilerData", null);
        setIntField(term160595, term160595.getClass(), "type", 16);
        setField(term160595, term160595.getClass(), "next", null);
        setField(term160595, term160595.getClass(), "first", null);
        setField(term160595, term160595.getClass(), "last", null);
        setField(term160595, term160595.getClass(), "propListHead", null);
        setIntField(term160595, term160595.getClass(), "sourcePosition", 0);
        setField(term160595, term160595.getClass(), "jsType", null);
        setField(term160595, term160595.getClass(), "parent", null);
        term160596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160596, term160596.getClass(), "functionName", null);
        setBooleanField(term160596, term160596.getClass(), "itsNeedsActivation", false);
        setIntField(term160596, term160596.getClass(), "itsFunctionType", 0);
        setBooleanField(term160596, term160596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160596, term160596.getClass(), "encodedSourceStart", 0);
        setIntField(term160596, term160596.getClass(), "encodedSourceEnd", 0);
        setField(term160596, term160596.getClass(), "sourceName", null);
        setIntField(term160596, term160596.getClass(), "baseLineno", 0);
        setIntField(term160596, term160596.getClass(), "endLineno", 0);
        setField(term160596, term160596.getClass(), "functions", null);
        setField(term160596, term160596.getClass(), "regexps", null);
        setField(term160596, term160596.getClass(), "itsVariables", null);
        setField(term160596, term160596.getClass(), "itsConst", null);
        setField(term160596, term160596.getClass(), "itsVariableNames", null);
        setIntField(term160596, term160596.getClass(), "varStart", 0);
        setField(term160596, term160596.getClass(), "compilerData", null);
        setIntField(term160596, term160596.getClass(), "type", 0);
        setField(term160596, term160596.getClass(), "next", null);
        setField(term160596, term160596.getClass(), "first", null);
        setField(term160596, term160596.getClass(), "last", null);
        setField(term160596, term160596.getClass(), "propListHead", null);
        setIntField(term160596, term160596.getClass(), "sourcePosition", 0);
        setField(term160596, term160596.getClass(), "jsType", null);
        setField(term160596, term160596.getClass(), "parent", null);
        term160559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160559, term160559.getClass(), "functionName", null);
        setBooleanField(term160559, term160559.getClass(), "itsNeedsActivation", false);
        setIntField(term160559, term160559.getClass(), "itsFunctionType", 0);
        setBooleanField(term160559, term160559.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160559, term160559.getClass(), "encodedSourceStart", 0);
        setIntField(term160559, term160559.getClass(), "encodedSourceEnd", 0);
        setField(term160559, term160559.getClass(), "sourceName", null);
        setIntField(term160559, term160559.getClass(), "baseLineno", 0);
        setIntField(term160559, term160559.getClass(), "endLineno", 0);
        setField(term160559, term160559.getClass(), "functions", null);
        setField(term160559, term160559.getClass(), "regexps", null);
        setField(term160559, term160559.getClass(), "itsVariables", null);
        setField(term160559, term160559.getClass(), "itsConst", null);
        setField(term160559, term160559.getClass(), "itsVariableNames", null);
        setIntField(term160559, term160559.getClass(), "varStart", 0);
        setField(term160559, term160559.getClass(), "compilerData", null);
        setIntField(term160559, term160559.getClass(), "type", 16);
        setField(term160559, term160559.getClass(), "next", null);
        setField(term160559, term160559.getClass(), "first", null);
        setField(term160559, term160559.getClass(), "last", null);
        setField(term160559, term160559.getClass(), "propListHead", null);
        setIntField(term160559, term160559.getClass(), "sourcePosition", 0);
        setField(term160559, term160559.getClass(), "jsType", null);
        setField(term160559, term160559.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term159975;
        args[1] = term160061;
        args[2] = term160147;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term159889, args);
        assertTrue(recursiveEquals(term159889, term160593));
        assertTrue(recursiveEquals(term159975, term160594));
        assertTrue(recursiveEquals(term160061, term160595));
        assertTrue(recursiveEquals(term160147, term160596));
        assertTrue(recursiveEquals(retValue, term160559));
    }

};


