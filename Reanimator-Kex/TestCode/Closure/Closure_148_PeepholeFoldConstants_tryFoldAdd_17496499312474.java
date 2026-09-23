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

public class PeepholeFoldConstants_tryFoldAdd_17496499312474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693678;
     Object term693770;
     Object term693856;
     Object term693948;
     Object term693990;
     Object term693991;
     Object term693992;
     Object term693993;
     Object term693956;

    public PeepholeFoldConstants_tryFoldAdd_17496499312474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term693770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term693770, term693770.getClass(), "type", 21);
        term693856 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term693856, term693856.getClass(), "type", 21);
        term693948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term693990 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term693990, term693990.getClass(), "currentTraversal", null);
        term693991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693991, term693991.getClass(), "str", null);
        setIntField(term693991, term693991.getClass(), "type", 21);
        setField(term693991, term693991.getClass(), "next", null);
        setField(term693991, term693991.getClass(), "first", null);
        setField(term693991, term693991.getClass(), "last", null);
        setField(term693991, term693991.getClass(), "propListHead", null);
        setIntField(term693991, term693991.getClass(), "sourcePosition", 0);
        setField(term693991, term693991.getClass(), "jsType", null);
        setField(term693991, term693991.getClass(), "parent", null);
        term693992 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term693992, term693992.getClass(), "functionName", null);
        setBooleanField(term693992, term693992.getClass(), "itsNeedsActivation", false);
        setIntField(term693992, term693992.getClass(), "itsFunctionType", 0);
        setBooleanField(term693992, term693992.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term693992, term693992.getClass(), "encodedSourceStart", 0);
        setIntField(term693992, term693992.getClass(), "encodedSourceEnd", 0);
        setField(term693992, term693992.getClass(), "sourceName", null);
        setIntField(term693992, term693992.getClass(), "baseLineno", 0);
        setIntField(term693992, term693992.getClass(), "endLineno", 0);
        setField(term693992, term693992.getClass(), "functions", null);
        setField(term693992, term693992.getClass(), "regexps", null);
        setField(term693992, term693992.getClass(), "itsVariables", null);
        setField(term693992, term693992.getClass(), "itsConst", null);
        setField(term693992, term693992.getClass(), "itsVariableNames", null);
        setIntField(term693992, term693992.getClass(), "varStart", 0);
        setField(term693992, term693992.getClass(), "compilerData", null);
        setIntField(term693992, term693992.getClass(), "type", 21);
        setField(term693992, term693992.getClass(), "next", null);
        setField(term693992, term693992.getClass(), "first", null);
        setField(term693992, term693992.getClass(), "last", null);
        setField(term693992, term693992.getClass(), "propListHead", null);
        setIntField(term693992, term693992.getClass(), "sourcePosition", 0);
        setField(term693992, term693992.getClass(), "jsType", null);
        setField(term693992, term693992.getClass(), "parent", null);
        term693993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693993, term693993.getClass(), "str", null);
        setIntField(term693993, term693993.getClass(), "type", 0);
        setField(term693993, term693993.getClass(), "next", null);
        setField(term693993, term693993.getClass(), "first", null);
        setField(term693993, term693993.getClass(), "last", null);
        setField(term693993, term693993.getClass(), "propListHead", null);
        setIntField(term693993, term693993.getClass(), "sourcePosition", 0);
        setField(term693993, term693993.getClass(), "jsType", null);
        setField(term693993, term693993.getClass(), "parent", null);
        term693956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693956, term693956.getClass(), "str", null);
        setIntField(term693956, term693956.getClass(), "type", 21);
        setField(term693956, term693956.getClass(), "next", null);
        setField(term693956, term693956.getClass(), "first", null);
        setField(term693956, term693956.getClass(), "last", null);
        setField(term693956, term693956.getClass(), "propListHead", null);
        setIntField(term693956, term693956.getClass(), "sourcePosition", 0);
        setField(term693956, term693956.getClass(), "jsType", null);
        setField(term693956, term693956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term693770;
        args[1] = term693856;
        args[2] = term693948;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term693678, args);
        assertTrue(recursiveEquals(term693678, term693990));
        assertTrue(recursiveEquals(term693770, term693991));
        assertTrue(recursiveEquals(term693856, term693992));
        assertTrue(recursiveEquals(term693948, term693993));
        assertTrue(recursiveEquals(retValue, term693956));
    }

};


