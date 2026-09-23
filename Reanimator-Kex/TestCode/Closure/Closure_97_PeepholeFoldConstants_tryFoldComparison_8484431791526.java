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

public class PeepholeFoldConstants_tryFoldComparison_8484431791526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562754;
     Object term562846;
     Object term562938;
     Object term563024;
     Object term563069;
     Object term563070;
     Object term563071;
     Object term563072;
     Object term563035;

    public PeepholeFoldConstants_tryFoldComparison_8484431791526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term562846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term562846, term562846.getClass(), "type", 14);
        term562938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term562938, term562938.getClass(), "type", 42);
        term563024 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term563024, term563024.getClass(), "type", 14);
        term563069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term563069, term563069.getClass(), "currentTraversal", null);
        term563070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term563070, term563070.getClass(), "number", 0.0);
        setIntField(term563070, term563070.getClass(), "type", 42);
        setField(term563070, term563070.getClass(), "next", null);
        setField(term563070, term563070.getClass(), "first", null);
        setField(term563070, term563070.getClass(), "last", null);
        setField(term563070, term563070.getClass(), "propListHead", null);
        setIntField(term563070, term563070.getClass(), "sourcePosition", 0);
        setField(term563070, term563070.getClass(), "jsType", null);
        setField(term563070, term563070.getClass(), "parent", null);
        term563071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term563071, term563071.getClass(), "number", 0.0);
        setIntField(term563071, term563071.getClass(), "type", 14);
        setField(term563071, term563071.getClass(), "next", null);
        setField(term563071, term563071.getClass(), "first", null);
        setField(term563071, term563071.getClass(), "last", null);
        setField(term563071, term563071.getClass(), "propListHead", null);
        setIntField(term563071, term563071.getClass(), "sourcePosition", 0);
        setField(term563071, term563071.getClass(), "jsType", null);
        setField(term563071, term563071.getClass(), "parent", null);
        term563072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term563072, term563072.getClass(), "functionName", null);
        setBooleanField(term563072, term563072.getClass(), "itsNeedsActivation", false);
        setIntField(term563072, term563072.getClass(), "itsFunctionType", 0);
        setBooleanField(term563072, term563072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term563072, term563072.getClass(), "encodedSourceStart", 0);
        setIntField(term563072, term563072.getClass(), "encodedSourceEnd", 0);
        setField(term563072, term563072.getClass(), "sourceName", null);
        setIntField(term563072, term563072.getClass(), "baseLineno", 0);
        setIntField(term563072, term563072.getClass(), "endLineno", 0);
        setField(term563072, term563072.getClass(), "functions", null);
        setField(term563072, term563072.getClass(), "regexps", null);
        setField(term563072, term563072.getClass(), "itsVariables", null);
        setField(term563072, term563072.getClass(), "itsConst", null);
        setField(term563072, term563072.getClass(), "itsVariableNames", null);
        setIntField(term563072, term563072.getClass(), "varStart", 0);
        setField(term563072, term563072.getClass(), "compilerData", null);
        setIntField(term563072, term563072.getClass(), "type", 14);
        setField(term563072, term563072.getClass(), "next", null);
        setField(term563072, term563072.getClass(), "first", null);
        setField(term563072, term563072.getClass(), "last", null);
        setField(term563072, term563072.getClass(), "propListHead", null);
        setIntField(term563072, term563072.getClass(), "sourcePosition", 0);
        setField(term563072, term563072.getClass(), "jsType", null);
        setField(term563072, term563072.getClass(), "parent", null);
        term563035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term563035, term563035.getClass(), "number", 0.0);
        setIntField(term563035, term563035.getClass(), "type", 14);
        setField(term563035, term563035.getClass(), "next", null);
        setField(term563035, term563035.getClass(), "first", null);
        setField(term563035, term563035.getClass(), "last", null);
        setField(term563035, term563035.getClass(), "propListHead", null);
        setIntField(term563035, term563035.getClass(), "sourcePosition", 0);
        setField(term563035, term563035.getClass(), "jsType", null);
        setField(term563035, term563035.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term562846;
        args[1] = term562938;
        args[2] = term563024;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term562754, args);
        assertTrue(recursiveEquals(term562754, term563069));
        assertTrue(recursiveEquals(term562846, term563070));
        assertTrue(recursiveEquals(term562938, term563071));
        assertTrue(recursiveEquals(term563024, term563072));
        assertTrue(recursiveEquals(retValue, term563035));
    }

};


