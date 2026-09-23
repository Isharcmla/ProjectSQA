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

public class PeepholeFoldConstants_tryFoldComparison_848443179435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100282;
     Object term100368;
     Object term100454;
     Object term100546;
     Object term101037;
     Object term101038;
     Object term101039;
     Object term101040;
     Object term101006;

    public PeepholeFoldConstants_tryFoldComparison_848443179435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term100368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term100368, term100368.getClass(), "type", 16);
        term100454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term100454, term100454.getClass(), "type", 42);
        term100546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term100546, term100546.getClass(), "type", 16);
        term101037 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term101037, term101037.getClass(), "currentTraversal", null);
        term101038 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term101038, term101038.getClass(), "functionName", null);
        setBooleanField(term101038, term101038.getClass(), "itsNeedsActivation", false);
        setIntField(term101038, term101038.getClass(), "itsFunctionType", 0);
        setBooleanField(term101038, term101038.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101038, term101038.getClass(), "encodedSourceStart", 0);
        setIntField(term101038, term101038.getClass(), "encodedSourceEnd", 0);
        setField(term101038, term101038.getClass(), "sourceName", null);
        setIntField(term101038, term101038.getClass(), "baseLineno", 0);
        setIntField(term101038, term101038.getClass(), "endLineno", 0);
        setField(term101038, term101038.getClass(), "functions", null);
        setField(term101038, term101038.getClass(), "regexps", null);
        setField(term101038, term101038.getClass(), "itsVariables", null);
        setField(term101038, term101038.getClass(), "itsConst", null);
        setField(term101038, term101038.getClass(), "itsVariableNames", null);
        setIntField(term101038, term101038.getClass(), "varStart", 0);
        setField(term101038, term101038.getClass(), "compilerData", null);
        setIntField(term101038, term101038.getClass(), "type", 42);
        setField(term101038, term101038.getClass(), "next", null);
        setField(term101038, term101038.getClass(), "first", null);
        setField(term101038, term101038.getClass(), "last", null);
        setField(term101038, term101038.getClass(), "propListHead", null);
        setIntField(term101038, term101038.getClass(), "sourcePosition", 0);
        setField(term101038, term101038.getClass(), "jsType", null);
        setField(term101038, term101038.getClass(), "parent", null);
        term101039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term101039, term101039.getClass(), "functionName", null);
        setBooleanField(term101039, term101039.getClass(), "itsNeedsActivation", false);
        setIntField(term101039, term101039.getClass(), "itsFunctionType", 0);
        setBooleanField(term101039, term101039.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101039, term101039.getClass(), "encodedSourceStart", 0);
        setIntField(term101039, term101039.getClass(), "encodedSourceEnd", 0);
        setField(term101039, term101039.getClass(), "sourceName", null);
        setIntField(term101039, term101039.getClass(), "baseLineno", 0);
        setIntField(term101039, term101039.getClass(), "endLineno", 0);
        setField(term101039, term101039.getClass(), "functions", null);
        setField(term101039, term101039.getClass(), "regexps", null);
        setField(term101039, term101039.getClass(), "itsVariables", null);
        setField(term101039, term101039.getClass(), "itsConst", null);
        setField(term101039, term101039.getClass(), "itsVariableNames", null);
        setIntField(term101039, term101039.getClass(), "varStart", 0);
        setField(term101039, term101039.getClass(), "compilerData", null);
        setIntField(term101039, term101039.getClass(), "type", 16);
        setField(term101039, term101039.getClass(), "next", null);
        setField(term101039, term101039.getClass(), "first", null);
        setField(term101039, term101039.getClass(), "last", null);
        setField(term101039, term101039.getClass(), "propListHead", null);
        setIntField(term101039, term101039.getClass(), "sourcePosition", 0);
        setField(term101039, term101039.getClass(), "jsType", null);
        setField(term101039, term101039.getClass(), "parent", null);
        term101040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101040, term101040.getClass(), "str", null);
        setIntField(term101040, term101040.getClass(), "type", 16);
        setField(term101040, term101040.getClass(), "next", null);
        setField(term101040, term101040.getClass(), "first", null);
        setField(term101040, term101040.getClass(), "last", null);
        setField(term101040, term101040.getClass(), "propListHead", null);
        setIntField(term101040, term101040.getClass(), "sourcePosition", 0);
        setField(term101040, term101040.getClass(), "jsType", null);
        setField(term101040, term101040.getClass(), "parent", null);
        term101006 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term101006, term101006.getClass(), "functionName", null);
        setBooleanField(term101006, term101006.getClass(), "itsNeedsActivation", false);
        setIntField(term101006, term101006.getClass(), "itsFunctionType", 0);
        setBooleanField(term101006, term101006.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term101006, term101006.getClass(), "encodedSourceStart", 0);
        setIntField(term101006, term101006.getClass(), "encodedSourceEnd", 0);
        setField(term101006, term101006.getClass(), "sourceName", null);
        setIntField(term101006, term101006.getClass(), "baseLineno", 0);
        setIntField(term101006, term101006.getClass(), "endLineno", 0);
        setField(term101006, term101006.getClass(), "functions", null);
        setField(term101006, term101006.getClass(), "regexps", null);
        setField(term101006, term101006.getClass(), "itsVariables", null);
        setField(term101006, term101006.getClass(), "itsConst", null);
        setField(term101006, term101006.getClass(), "itsVariableNames", null);
        setIntField(term101006, term101006.getClass(), "varStart", 0);
        setField(term101006, term101006.getClass(), "compilerData", null);
        setIntField(term101006, term101006.getClass(), "type", 16);
        setField(term101006, term101006.getClass(), "next", null);
        setField(term101006, term101006.getClass(), "first", null);
        setField(term101006, term101006.getClass(), "last", null);
        setField(term101006, term101006.getClass(), "propListHead", null);
        setIntField(term101006, term101006.getClass(), "sourcePosition", 0);
        setField(term101006, term101006.getClass(), "jsType", null);
        setField(term101006, term101006.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term100368;
        args[1] = term100454;
        args[2] = term100546;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term100282, args);
        assertTrue(recursiveEquals(term100282, term101037));
        assertTrue(recursiveEquals(term100368, term101038));
        assertTrue(recursiveEquals(term100454, term101039));
        assertTrue(recursiveEquals(term100546, term101040));
        assertTrue(recursiveEquals(retValue, term101006));
    }

};


