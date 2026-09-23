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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195477;
     Object term195563;
     Object term195649;
     Object term196084;
     Object term196085;
     Object term196086;
     Object term196053;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term195563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term195563, term195563.getClass(), "type", 52);
        term195649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term196084 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term196084, term196084.getClass(), "currentTraversal", null);
        term196085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term196085, term196085.getClass(), "functionName", null);
        setBooleanField(term196085, term196085.getClass(), "itsNeedsActivation", false);
        setIntField(term196085, term196085.getClass(), "itsFunctionType", 0);
        setBooleanField(term196085, term196085.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term196085, term196085.getClass(), "encodedSourceStart", 0);
        setIntField(term196085, term196085.getClass(), "encodedSourceEnd", 0);
        setField(term196085, term196085.getClass(), "sourceName", null);
        setIntField(term196085, term196085.getClass(), "baseLineno", 0);
        setIntField(term196085, term196085.getClass(), "endLineno", 0);
        setField(term196085, term196085.getClass(), "functions", null);
        setField(term196085, term196085.getClass(), "regexps", null);
        setField(term196085, term196085.getClass(), "itsVariables", null);
        setField(term196085, term196085.getClass(), "itsConst", null);
        setField(term196085, term196085.getClass(), "itsVariableNames", null);
        setIntField(term196085, term196085.getClass(), "varStart", 0);
        setField(term196085, term196085.getClass(), "compilerData", null);
        setIntField(term196085, term196085.getClass(), "type", 52);
        setField(term196085, term196085.getClass(), "next", null);
        setField(term196085, term196085.getClass(), "first", null);
        setField(term196085, term196085.getClass(), "last", null);
        setField(term196085, term196085.getClass(), "propListHead", null);
        setIntField(term196085, term196085.getClass(), "sourcePosition", 0);
        setField(term196085, term196085.getClass(), "jsType", null);
        setField(term196085, term196085.getClass(), "parent", null);
        term196086 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term196086, term196086.getClass(), "functionName", null);
        setBooleanField(term196086, term196086.getClass(), "itsNeedsActivation", false);
        setIntField(term196086, term196086.getClass(), "itsFunctionType", 0);
        setBooleanField(term196086, term196086.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term196086, term196086.getClass(), "encodedSourceStart", 0);
        setIntField(term196086, term196086.getClass(), "encodedSourceEnd", 0);
        setField(term196086, term196086.getClass(), "sourceName", null);
        setIntField(term196086, term196086.getClass(), "baseLineno", 0);
        setIntField(term196086, term196086.getClass(), "endLineno", 0);
        setField(term196086, term196086.getClass(), "functions", null);
        setField(term196086, term196086.getClass(), "regexps", null);
        setField(term196086, term196086.getClass(), "itsVariables", null);
        setField(term196086, term196086.getClass(), "itsConst", null);
        setField(term196086, term196086.getClass(), "itsVariableNames", null);
        setIntField(term196086, term196086.getClass(), "varStart", 0);
        setField(term196086, term196086.getClass(), "compilerData", null);
        setIntField(term196086, term196086.getClass(), "type", 0);
        setField(term196086, term196086.getClass(), "next", null);
        setField(term196086, term196086.getClass(), "first", null);
        setField(term196086, term196086.getClass(), "last", null);
        setField(term196086, term196086.getClass(), "propListHead", null);
        setIntField(term196086, term196086.getClass(), "sourcePosition", 0);
        setField(term196086, term196086.getClass(), "jsType", null);
        setField(term196086, term196086.getClass(), "parent", null);
        term196053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term196053, term196053.getClass(), "functionName", null);
        setBooleanField(term196053, term196053.getClass(), "itsNeedsActivation", false);
        setIntField(term196053, term196053.getClass(), "itsFunctionType", 0);
        setBooleanField(term196053, term196053.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term196053, term196053.getClass(), "encodedSourceStart", 0);
        setIntField(term196053, term196053.getClass(), "encodedSourceEnd", 0);
        setField(term196053, term196053.getClass(), "sourceName", null);
        setIntField(term196053, term196053.getClass(), "baseLineno", 0);
        setIntField(term196053, term196053.getClass(), "endLineno", 0);
        setField(term196053, term196053.getClass(), "functions", null);
        setField(term196053, term196053.getClass(), "regexps", null);
        setField(term196053, term196053.getClass(), "itsVariables", null);
        setField(term196053, term196053.getClass(), "itsConst", null);
        setField(term196053, term196053.getClass(), "itsVariableNames", null);
        setIntField(term196053, term196053.getClass(), "varStart", 0);
        setField(term196053, term196053.getClass(), "compilerData", null);
        setIntField(term196053, term196053.getClass(), "type", 52);
        setField(term196053, term196053.getClass(), "next", null);
        setField(term196053, term196053.getClass(), "first", null);
        setField(term196053, term196053.getClass(), "last", null);
        setField(term196053, term196053.getClass(), "propListHead", null);
        setIntField(term196053, term196053.getClass(), "sourcePosition", 0);
        setField(term196053, term196053.getClass(), "jsType", null);
        setField(term196053, term196053.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term195563;
        args[1] = term195649;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term195477, args);
        assertTrue(recursiveEquals(term195477, term196084));
        assertTrue(recursiveEquals(term195563, term196085));
        assertTrue(recursiveEquals(term195649, term196086));
        assertTrue(recursiveEquals(retValue, term196053));
    }

};


