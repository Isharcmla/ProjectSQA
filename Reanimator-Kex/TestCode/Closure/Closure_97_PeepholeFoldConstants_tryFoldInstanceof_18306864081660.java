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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662400;
     Object term662486;
     Object term662578;
     Object term662980;
     Object term662981;
     Object term662982;
     Object term662956;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term662486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term662486, term662486.getClass(), "type", 52);
        term662578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term662980 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term662980, term662980.getClass(), "currentTraversal", null);
        term662981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term662981, term662981.getClass(), "functionName", null);
        setBooleanField(term662981, term662981.getClass(), "itsNeedsActivation", false);
        setIntField(term662981, term662981.getClass(), "itsFunctionType", 0);
        setBooleanField(term662981, term662981.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term662981, term662981.getClass(), "encodedSourceStart", 0);
        setIntField(term662981, term662981.getClass(), "encodedSourceEnd", 0);
        setField(term662981, term662981.getClass(), "sourceName", null);
        setIntField(term662981, term662981.getClass(), "baseLineno", 0);
        setIntField(term662981, term662981.getClass(), "endLineno", 0);
        setField(term662981, term662981.getClass(), "functions", null);
        setField(term662981, term662981.getClass(), "regexps", null);
        setField(term662981, term662981.getClass(), "itsVariables", null);
        setField(term662981, term662981.getClass(), "itsConst", null);
        setField(term662981, term662981.getClass(), "itsVariableNames", null);
        setIntField(term662981, term662981.getClass(), "varStart", 0);
        setField(term662981, term662981.getClass(), "compilerData", null);
        setIntField(term662981, term662981.getClass(), "type", 52);
        setField(term662981, term662981.getClass(), "next", null);
        setField(term662981, term662981.getClass(), "first", null);
        setField(term662981, term662981.getClass(), "last", null);
        setField(term662981, term662981.getClass(), "propListHead", null);
        setIntField(term662981, term662981.getClass(), "sourcePosition", 0);
        setField(term662981, term662981.getClass(), "jsType", null);
        setField(term662981, term662981.getClass(), "parent", null);
        term662982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term662982, term662982.getClass(), "number", 0.0);
        setIntField(term662982, term662982.getClass(), "type", 0);
        setField(term662982, term662982.getClass(), "next", null);
        setField(term662982, term662982.getClass(), "first", null);
        setField(term662982, term662982.getClass(), "last", null);
        setField(term662982, term662982.getClass(), "propListHead", null);
        setIntField(term662982, term662982.getClass(), "sourcePosition", 0);
        setField(term662982, term662982.getClass(), "jsType", null);
        setField(term662982, term662982.getClass(), "parent", null);
        term662956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term662956, term662956.getClass(), "functionName", null);
        setBooleanField(term662956, term662956.getClass(), "itsNeedsActivation", false);
        setIntField(term662956, term662956.getClass(), "itsFunctionType", 0);
        setBooleanField(term662956, term662956.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term662956, term662956.getClass(), "encodedSourceStart", 0);
        setIntField(term662956, term662956.getClass(), "encodedSourceEnd", 0);
        setField(term662956, term662956.getClass(), "sourceName", null);
        setIntField(term662956, term662956.getClass(), "baseLineno", 0);
        setIntField(term662956, term662956.getClass(), "endLineno", 0);
        setField(term662956, term662956.getClass(), "functions", null);
        setField(term662956, term662956.getClass(), "regexps", null);
        setField(term662956, term662956.getClass(), "itsVariables", null);
        setField(term662956, term662956.getClass(), "itsConst", null);
        setField(term662956, term662956.getClass(), "itsVariableNames", null);
        setIntField(term662956, term662956.getClass(), "varStart", 0);
        setField(term662956, term662956.getClass(), "compilerData", null);
        setIntField(term662956, term662956.getClass(), "type", 52);
        setField(term662956, term662956.getClass(), "next", null);
        setField(term662956, term662956.getClass(), "first", null);
        setField(term662956, term662956.getClass(), "last", null);
        setField(term662956, term662956.getClass(), "propListHead", null);
        setIntField(term662956, term662956.getClass(), "sourcePosition", 0);
        setField(term662956, term662956.getClass(), "jsType", null);
        setField(term662956, term662956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term662486;
        args[1] = term662578;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term662400, args);
        assertTrue(recursiveEquals(term662400, term662980));
        assertTrue(recursiveEquals(term662486, term662981));
        assertTrue(recursiveEquals(term662578, term662982));
        assertTrue(recursiveEquals(retValue, term662956));
    }

};


