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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76026;
     Object term76112;
     Object term76793;
     Object term76794;
     Object term76727;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76026 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term76112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76198, term76198.getClass(), "next", term76268);
        setField(term76112, term76112.getClass(), "first", term76198);
        setIntField(term76112, term76112.getClass(), "type", 12);
        term76793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term76793, term76793.getClass(), "currentTraversal", null);
        term76794 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76794, term76794.getClass(), "functionName", null);
        setBooleanField(term76794, term76794.getClass(), "itsNeedsActivation", false);
        setIntField(term76794, term76794.getClass(), "itsFunctionType", 0);
        setBooleanField(term76794, term76794.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76794, term76794.getClass(), "encodedSourceStart", 0);
        setIntField(term76794, term76794.getClass(), "encodedSourceEnd", 0);
        setField(term76794, term76794.getClass(), "sourceName", null);
        setIntField(term76794, term76794.getClass(), "baseLineno", 0);
        setIntField(term76794, term76794.getClass(), "endLineno", 0);
        setField(term76794, term76794.getClass(), "functions", null);
        setField(term76794, term76794.getClass(), "regexps", null);
        setField(term76794, term76794.getClass(), "itsVariables", null);
        setField(term76794, term76794.getClass(), "itsConst", null);
        setField(term76794, term76794.getClass(), "itsVariableNames", null);
        setIntField(term76794, term76794.getClass(), "varStart", 0);
        setField(term76794, term76794.getClass(), "compilerData", null);
        setIntField(term76794, term76794.getClass(), "type", 12);
        setField(term76794, term76794.getClass(), "next", null);
        setField(term76795, term76795.getClass(), "functionName", null);
        setBooleanField(term76795, term76795.getClass(), "itsNeedsActivation", false);
        setIntField(term76795, term76795.getClass(), "itsFunctionType", 0);
        setBooleanField(term76795, term76795.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76795, term76795.getClass(), "encodedSourceStart", 0);
        setIntField(term76795, term76795.getClass(), "encodedSourceEnd", 0);
        setField(term76795, term76795.getClass(), "sourceName", null);
        setIntField(term76795, term76795.getClass(), "baseLineno", 0);
        setIntField(term76795, term76795.getClass(), "endLineno", 0);
        setField(term76795, term76795.getClass(), "functions", null);
        setField(term76795, term76795.getClass(), "regexps", null);
        setField(term76795, term76795.getClass(), "itsVariables", null);
        setField(term76795, term76795.getClass(), "itsConst", null);
        setField(term76795, term76795.getClass(), "itsVariableNames", null);
        setIntField(term76795, term76795.getClass(), "varStart", 0);
        setField(term76795, term76795.getClass(), "compilerData", null);
        setIntField(term76795, term76795.getClass(), "type", 0);
        setIntField(term76796, term76796.getClass(), "type", 0);
        setField(term76796, term76796.getClass(), "next", null);
        setField(term76796, term76796.getClass(), "first", null);
        setField(term76796, term76796.getClass(), "last", null);
        setField(term76796, term76796.getClass(), "propListHead", null);
        setIntField(term76796, term76796.getClass(), "sourcePosition", 0);
        setField(term76796, term76796.getClass(), "jsType", null);
        setField(term76796, term76796.getClass(), "parent", null);
        setField(term76795, term76795.getClass(), "next", term76796);
        setField(term76795, term76795.getClass(), "first", null);
        setField(term76795, term76795.getClass(), "last", null);
        setField(term76795, term76795.getClass(), "propListHead", null);
        setIntField(term76795, term76795.getClass(), "sourcePosition", 0);
        setField(term76795, term76795.getClass(), "jsType", null);
        setField(term76795, term76795.getClass(), "parent", null);
        setField(term76794, term76794.getClass(), "first", term76795);
        setField(term76794, term76794.getClass(), "last", null);
        setField(term76794, term76794.getClass(), "propListHead", null);
        setIntField(term76794, term76794.getClass(), "sourcePosition", 0);
        setField(term76794, term76794.getClass(), "jsType", null);
        setField(term76794, term76794.getClass(), "parent", null);
        term76727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76727, term76727.getClass(), "functionName", null);
        setBooleanField(term76727, term76727.getClass(), "itsNeedsActivation", false);
        setIntField(term76727, term76727.getClass(), "itsFunctionType", 0);
        setBooleanField(term76727, term76727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76727, term76727.getClass(), "encodedSourceStart", 0);
        setIntField(term76727, term76727.getClass(), "encodedSourceEnd", 0);
        setField(term76727, term76727.getClass(), "sourceName", null);
        setIntField(term76727, term76727.getClass(), "baseLineno", 0);
        setIntField(term76727, term76727.getClass(), "endLineno", 0);
        setField(term76727, term76727.getClass(), "functions", null);
        setField(term76727, term76727.getClass(), "regexps", null);
        setField(term76727, term76727.getClass(), "itsVariables", null);
        setField(term76727, term76727.getClass(), "itsConst", null);
        setField(term76727, term76727.getClass(), "itsVariableNames", null);
        setIntField(term76727, term76727.getClass(), "varStart", 0);
        setField(term76727, term76727.getClass(), "compilerData", null);
        setIntField(term76727, term76727.getClass(), "type", 12);
        setField(term76727, term76727.getClass(), "next", null);
        setField(term76737, term76737.getClass(), "functionName", null);
        setBooleanField(term76737, term76737.getClass(), "itsNeedsActivation", false);
        setIntField(term76737, term76737.getClass(), "itsFunctionType", 0);
        setBooleanField(term76737, term76737.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76737, term76737.getClass(), "encodedSourceStart", 0);
        setIntField(term76737, term76737.getClass(), "encodedSourceEnd", 0);
        setField(term76737, term76737.getClass(), "sourceName", null);
        setIntField(term76737, term76737.getClass(), "baseLineno", 0);
        setIntField(term76737, term76737.getClass(), "endLineno", 0);
        setField(term76737, term76737.getClass(), "functions", null);
        setField(term76737, term76737.getClass(), "regexps", null);
        setField(term76737, term76737.getClass(), "itsVariables", null);
        setField(term76737, term76737.getClass(), "itsConst", null);
        setField(term76737, term76737.getClass(), "itsVariableNames", null);
        setIntField(term76737, term76737.getClass(), "varStart", 0);
        setField(term76737, term76737.getClass(), "compilerData", null);
        setIntField(term76737, term76737.getClass(), "type", 0);
        setIntField(term76747, term76747.getClass(), "type", 0);
        setField(term76747, term76747.getClass(), "next", null);
        setField(term76747, term76747.getClass(), "first", null);
        setField(term76747, term76747.getClass(), "last", null);
        setField(term76747, term76747.getClass(), "propListHead", null);
        setIntField(term76747, term76747.getClass(), "sourcePosition", 0);
        setField(term76747, term76747.getClass(), "jsType", null);
        setField(term76747, term76747.getClass(), "parent", null);
        setField(term76737, term76737.getClass(), "next", term76747);
        setField(term76737, term76737.getClass(), "first", null);
        setField(term76737, term76737.getClass(), "last", null);
        setField(term76737, term76737.getClass(), "propListHead", null);
        setIntField(term76737, term76737.getClass(), "sourcePosition", 0);
        setField(term76737, term76737.getClass(), "jsType", null);
        setField(term76737, term76737.getClass(), "parent", null);
        setField(term76727, term76727.getClass(), "first", term76737);
        setField(term76727, term76727.getClass(), "last", null);
        setField(term76727, term76727.getClass(), "propListHead", null);
        setIntField(term76727, term76727.getClass(), "sourcePosition", 0);
        setField(term76727, term76727.getClass(), "jsType", null);
        setField(term76727, term76727.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term76112;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term76026, args);
        assertTrue(recursiveEquals(term76026, term76793));
        assertTrue(recursiveEquals(term76112, term76794));
        assertTrue(recursiveEquals(retValue, term76727));
    }

};


