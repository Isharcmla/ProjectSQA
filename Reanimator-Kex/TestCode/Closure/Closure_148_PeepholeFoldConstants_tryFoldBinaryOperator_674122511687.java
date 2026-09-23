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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152444;
     Object term152536;
     Object term152973;
     Object term152974;
     Object term152921;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term152536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152628 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152718 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term152628, term152628.getClass(), "next", term152718);
        setIntField(term152628, term152628.getClass(), "type", 63);
        setField(term152536, term152536.getClass(), "first", term152628);
        setIntField(term152536, term152536.getClass(), "type", 35);
        term152973 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term152973, term152973.getClass(), "currentTraversal", null);
        term152974 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152976 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term152974, term152974.getClass(), "number", 0.0);
        setIntField(term152974, term152974.getClass(), "type", 35);
        setField(term152974, term152974.getClass(), "next", null);
        setDoubleField(term152975, term152975.getClass(), "number", 0.0);
        setIntField(term152975, term152975.getClass(), "type", 63);
        setIntField(term152976, term152976.getClass(), "encodedSourceStart", 0);
        setIntField(term152976, term152976.getClass(), "encodedSourceEnd", 0);
        setField(term152976, term152976.getClass(), "sourceName", null);
        setIntField(term152976, term152976.getClass(), "baseLineno", 0);
        setIntField(term152976, term152976.getClass(), "endLineno", 0);
        setField(term152976, term152976.getClass(), "functions", null);
        setField(term152976, term152976.getClass(), "regexps", null);
        setField(term152976, term152976.getClass(), "itsVariables", null);
        setField(term152976, term152976.getClass(), "itsConst", null);
        setField(term152976, term152976.getClass(), "itsVariableNames", null);
        setIntField(term152976, term152976.getClass(), "varStart", 0);
        setField(term152976, term152976.getClass(), "compilerData", null);
        setIntField(term152976, term152976.getClass(), "type", 0);
        setField(term152976, term152976.getClass(), "next", null);
        setField(term152976, term152976.getClass(), "first", null);
        setField(term152976, term152976.getClass(), "last", null);
        setField(term152976, term152976.getClass(), "propListHead", null);
        setIntField(term152976, term152976.getClass(), "sourcePosition", 0);
        setField(term152976, term152976.getClass(), "jsType", null);
        setField(term152976, term152976.getClass(), "parent", null);
        setField(term152975, term152975.getClass(), "next", term152976);
        setField(term152975, term152975.getClass(), "first", null);
        setField(term152975, term152975.getClass(), "last", null);
        setField(term152975, term152975.getClass(), "propListHead", null);
        setIntField(term152975, term152975.getClass(), "sourcePosition", 0);
        setField(term152975, term152975.getClass(), "jsType", null);
        setField(term152975, term152975.getClass(), "parent", null);
        setField(term152974, term152974.getClass(), "first", term152975);
        setField(term152974, term152974.getClass(), "last", null);
        setField(term152974, term152974.getClass(), "propListHead", null);
        setIntField(term152974, term152974.getClass(), "sourcePosition", 0);
        setField(term152974, term152974.getClass(), "jsType", null);
        setField(term152974, term152974.getClass(), "parent", null);
        term152921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152927 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term152921, term152921.getClass(), "number", 0.0);
        setIntField(term152921, term152921.getClass(), "type", 35);
        setField(term152921, term152921.getClass(), "next", null);
        setDoubleField(term152924, term152924.getClass(), "number", 0.0);
        setIntField(term152924, term152924.getClass(), "type", 63);
        setIntField(term152927, term152927.getClass(), "encodedSourceStart", 0);
        setIntField(term152927, term152927.getClass(), "encodedSourceEnd", 0);
        setField(term152927, term152927.getClass(), "sourceName", null);
        setIntField(term152927, term152927.getClass(), "baseLineno", 0);
        setIntField(term152927, term152927.getClass(), "endLineno", 0);
        setField(term152927, term152927.getClass(), "functions", null);
        setField(term152927, term152927.getClass(), "regexps", null);
        setField(term152927, term152927.getClass(), "itsVariables", null);
        setField(term152927, term152927.getClass(), "itsConst", null);
        setField(term152927, term152927.getClass(), "itsVariableNames", null);
        setIntField(term152927, term152927.getClass(), "varStart", 0);
        setField(term152927, term152927.getClass(), "compilerData", null);
        setIntField(term152927, term152927.getClass(), "type", 0);
        setField(term152927, term152927.getClass(), "next", null);
        setField(term152927, term152927.getClass(), "first", null);
        setField(term152927, term152927.getClass(), "last", null);
        setField(term152927, term152927.getClass(), "propListHead", null);
        setIntField(term152927, term152927.getClass(), "sourcePosition", 0);
        setField(term152927, term152927.getClass(), "jsType", null);
        setField(term152927, term152927.getClass(), "parent", null);
        setField(term152924, term152924.getClass(), "next", term152927);
        setField(term152924, term152924.getClass(), "first", null);
        setField(term152924, term152924.getClass(), "last", null);
        setField(term152924, term152924.getClass(), "propListHead", null);
        setIntField(term152924, term152924.getClass(), "sourcePosition", 0);
        setField(term152924, term152924.getClass(), "jsType", null);
        setField(term152924, term152924.getClass(), "parent", null);
        setField(term152921, term152921.getClass(), "first", term152924);
        setField(term152921, term152921.getClass(), "last", null);
        setField(term152921, term152921.getClass(), "propListHead", null);
        setIntField(term152921, term152921.getClass(), "sourcePosition", 0);
        setField(term152921, term152921.getClass(), "jsType", null);
        setField(term152921, term152921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term152536;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term152444, args);
        assertTrue(recursiveEquals(term152444, term152973));
        assertTrue(recursiveEquals(term152536, term152974));
        assertTrue(recursiveEquals(retValue, term152921));
    }

};


