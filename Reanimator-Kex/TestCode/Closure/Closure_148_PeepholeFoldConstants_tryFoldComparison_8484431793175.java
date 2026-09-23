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

public class PeepholeFoldConstants_tryFoldComparison_8484431793175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942213;
     Object term942305;
     Object term942397;
     Object term942483;
     Object term942984;
     Object term942985;
     Object term942986;
     Object term942987;
     Object term942956;

    public PeepholeFoldConstants_tryFoldComparison_8484431793175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942213 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term942305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term942305, term942305.getClass(), "type", 14);
        term942397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term942397, term942397.getClass(), "type", 14);
        term942483 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term942984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term942984, term942984.getClass(), "currentTraversal", null);
        term942985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term942985, term942985.getClass(), "str", null);
        setIntField(term942985, term942985.getClass(), "type", 14);
        setField(term942985, term942985.getClass(), "next", null);
        setField(term942985, term942985.getClass(), "first", null);
        setField(term942985, term942985.getClass(), "last", null);
        setField(term942985, term942985.getClass(), "propListHead", null);
        setIntField(term942985, term942985.getClass(), "sourcePosition", 0);
        setField(term942985, term942985.getClass(), "jsType", null);
        setField(term942985, term942985.getClass(), "parent", null);
        term942986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term942986, term942986.getClass(), "str", null);
        setIntField(term942986, term942986.getClass(), "type", 14);
        setField(term942986, term942986.getClass(), "next", null);
        setField(term942986, term942986.getClass(), "first", null);
        setField(term942986, term942986.getClass(), "last", null);
        setField(term942986, term942986.getClass(), "propListHead", null);
        setIntField(term942986, term942986.getClass(), "sourcePosition", 0);
        setField(term942986, term942986.getClass(), "jsType", null);
        setField(term942986, term942986.getClass(), "parent", null);
        term942987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term942987, term942987.getClass(), "functionName", null);
        setBooleanField(term942987, term942987.getClass(), "itsNeedsActivation", false);
        setIntField(term942987, term942987.getClass(), "itsFunctionType", 0);
        setBooleanField(term942987, term942987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term942987, term942987.getClass(), "encodedSourceStart", 0);
        setIntField(term942987, term942987.getClass(), "encodedSourceEnd", 0);
        setField(term942987, term942987.getClass(), "sourceName", null);
        setIntField(term942987, term942987.getClass(), "baseLineno", 0);
        setIntField(term942987, term942987.getClass(), "endLineno", 0);
        setField(term942987, term942987.getClass(), "functions", null);
        setField(term942987, term942987.getClass(), "regexps", null);
        setField(term942987, term942987.getClass(), "itsVariables", null);
        setField(term942987, term942987.getClass(), "itsConst", null);
        setField(term942987, term942987.getClass(), "itsVariableNames", null);
        setIntField(term942987, term942987.getClass(), "varStart", 0);
        setField(term942987, term942987.getClass(), "compilerData", null);
        setIntField(term942987, term942987.getClass(), "type", 0);
        setField(term942987, term942987.getClass(), "next", null);
        setField(term942987, term942987.getClass(), "first", null);
        setField(term942987, term942987.getClass(), "last", null);
        setField(term942987, term942987.getClass(), "propListHead", null);
        setIntField(term942987, term942987.getClass(), "sourcePosition", 0);
        setField(term942987, term942987.getClass(), "jsType", null);
        setField(term942987, term942987.getClass(), "parent", null);
        term942956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term942956, term942956.getClass(), "str", null);
        setIntField(term942956, term942956.getClass(), "type", 14);
        setField(term942956, term942956.getClass(), "next", null);
        setField(term942956, term942956.getClass(), "first", null);
        setField(term942956, term942956.getClass(), "last", null);
        setField(term942956, term942956.getClass(), "propListHead", null);
        setIntField(term942956, term942956.getClass(), "sourcePosition", 0);
        setField(term942956, term942956.getClass(), "jsType", null);
        setField(term942956, term942956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term942305;
        args[1] = term942397;
        args[2] = term942483;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term942213, args);
        assertTrue(recursiveEquals(term942213, term942984));
        assertTrue(recursiveEquals(term942305, term942985));
        assertTrue(recursiveEquals(term942397, term942986));
        assertTrue(recursiveEquals(term942483, term942987));
        assertTrue(recursiveEquals(retValue, term942956));
    }

};


