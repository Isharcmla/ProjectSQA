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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256505;
     Object term256591;
     Object term256677;
     Object term256710;
     Object term256711;
     Object term256712;
     Object term256679;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term256591 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term256591, term256591.getClass(), "type", 52);
        term256677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term256710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term256710, term256710.getClass(), "currentTraversal", null);
        term256711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term256711, term256711.getClass(), "functionName", null);
        setBooleanField(term256711, term256711.getClass(), "itsNeedsActivation", false);
        setIntField(term256711, term256711.getClass(), "itsFunctionType", 0);
        setBooleanField(term256711, term256711.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256711, term256711.getClass(), "encodedSourceStart", 0);
        setIntField(term256711, term256711.getClass(), "encodedSourceEnd", 0);
        setField(term256711, term256711.getClass(), "sourceName", null);
        setIntField(term256711, term256711.getClass(), "baseLineno", 0);
        setIntField(term256711, term256711.getClass(), "endLineno", 0);
        setField(term256711, term256711.getClass(), "functions", null);
        setField(term256711, term256711.getClass(), "regexps", null);
        setField(term256711, term256711.getClass(), "itsVariables", null);
        setField(term256711, term256711.getClass(), "itsConst", null);
        setField(term256711, term256711.getClass(), "itsVariableNames", null);
        setIntField(term256711, term256711.getClass(), "varStart", 0);
        setField(term256711, term256711.getClass(), "compilerData", null);
        setIntField(term256711, term256711.getClass(), "type", 52);
        setField(term256711, term256711.getClass(), "next", null);
        setField(term256711, term256711.getClass(), "first", null);
        setField(term256711, term256711.getClass(), "last", null);
        setField(term256711, term256711.getClass(), "propListHead", null);
        setIntField(term256711, term256711.getClass(), "sourcePosition", 0);
        setField(term256711, term256711.getClass(), "jsType", null);
        setField(term256711, term256711.getClass(), "parent", null);
        term256712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term256712, term256712.getClass(), "functionName", null);
        setBooleanField(term256712, term256712.getClass(), "itsNeedsActivation", false);
        setIntField(term256712, term256712.getClass(), "itsFunctionType", 0);
        setBooleanField(term256712, term256712.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256712, term256712.getClass(), "encodedSourceStart", 0);
        setIntField(term256712, term256712.getClass(), "encodedSourceEnd", 0);
        setField(term256712, term256712.getClass(), "sourceName", null);
        setIntField(term256712, term256712.getClass(), "baseLineno", 0);
        setIntField(term256712, term256712.getClass(), "endLineno", 0);
        setField(term256712, term256712.getClass(), "functions", null);
        setField(term256712, term256712.getClass(), "regexps", null);
        setField(term256712, term256712.getClass(), "itsVariables", null);
        setField(term256712, term256712.getClass(), "itsConst", null);
        setField(term256712, term256712.getClass(), "itsVariableNames", null);
        setIntField(term256712, term256712.getClass(), "varStart", 0);
        setField(term256712, term256712.getClass(), "compilerData", null);
        setIntField(term256712, term256712.getClass(), "type", 0);
        setField(term256712, term256712.getClass(), "next", null);
        setField(term256712, term256712.getClass(), "first", null);
        setField(term256712, term256712.getClass(), "last", null);
        setField(term256712, term256712.getClass(), "propListHead", null);
        setIntField(term256712, term256712.getClass(), "sourcePosition", 0);
        setField(term256712, term256712.getClass(), "jsType", null);
        setField(term256712, term256712.getClass(), "parent", null);
        term256679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term256679, term256679.getClass(), "functionName", null);
        setBooleanField(term256679, term256679.getClass(), "itsNeedsActivation", false);
        setIntField(term256679, term256679.getClass(), "itsFunctionType", 0);
        setBooleanField(term256679, term256679.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256679, term256679.getClass(), "encodedSourceStart", 0);
        setIntField(term256679, term256679.getClass(), "encodedSourceEnd", 0);
        setField(term256679, term256679.getClass(), "sourceName", null);
        setIntField(term256679, term256679.getClass(), "baseLineno", 0);
        setIntField(term256679, term256679.getClass(), "endLineno", 0);
        setField(term256679, term256679.getClass(), "functions", null);
        setField(term256679, term256679.getClass(), "regexps", null);
        setField(term256679, term256679.getClass(), "itsVariables", null);
        setField(term256679, term256679.getClass(), "itsConst", null);
        setField(term256679, term256679.getClass(), "itsVariableNames", null);
        setIntField(term256679, term256679.getClass(), "varStart", 0);
        setField(term256679, term256679.getClass(), "compilerData", null);
        setIntField(term256679, term256679.getClass(), "type", 52);
        setField(term256679, term256679.getClass(), "next", null);
        setField(term256679, term256679.getClass(), "first", null);
        setField(term256679, term256679.getClass(), "last", null);
        setField(term256679, term256679.getClass(), "propListHead", null);
        setIntField(term256679, term256679.getClass(), "sourcePosition", 0);
        setField(term256679, term256679.getClass(), "jsType", null);
        setField(term256679, term256679.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term256591;
        args[1] = term256677;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term256505, args);
        assertTrue(recursiveEquals(term256505, term256710));
        assertTrue(recursiveEquals(term256591, term256711));
        assertTrue(recursiveEquals(term256677, term256712));
        assertTrue(recursiveEquals(retValue, term256679));
    }

};


