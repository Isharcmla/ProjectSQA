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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45864;
     Object term45934;
     Object term46678;
     Object term46679;
     Object term46600;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45864 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46024 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term46114 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term46024, term46024.getClass(), "next", term46114);
        setIntField(term46024, term46024.getClass(), "type", 0);
        setField(term45934, term45934.getClass(), "first", term46024);
        setIntField(term45934, term45934.getClass(), "type", 101);
        setField(term45934, term45934.getClass(), "parent", null);
        term46678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46678, term46678.getClass(), "currentTraversal", null);
        term46679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46680 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term46681 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term46679, term46679.getClass(), "type", 101);
        setField(term46679, term46679.getClass(), "next", null);
        setIntField(term46680, term46680.getClass(), "encodedSourceStart", 0);
        setIntField(term46680, term46680.getClass(), "encodedSourceEnd", 0);
        setField(term46680, term46680.getClass(), "sourceName", null);
        setIntField(term46680, term46680.getClass(), "baseLineno", 0);
        setIntField(term46680, term46680.getClass(), "endLineno", 0);
        setField(term46680, term46680.getClass(), "functions", null);
        setField(term46680, term46680.getClass(), "regexps", null);
        setField(term46680, term46680.getClass(), "itsVariables", null);
        setField(term46680, term46680.getClass(), "itsConst", null);
        setField(term46680, term46680.getClass(), "itsVariableNames", null);
        setIntField(term46680, term46680.getClass(), "varStart", 0);
        setField(term46680, term46680.getClass(), "compilerData", null);
        setIntField(term46680, term46680.getClass(), "type", 0);
        setIntField(term46681, term46681.getClass(), "encodedSourceStart", 0);
        setIntField(term46681, term46681.getClass(), "encodedSourceEnd", 0);
        setField(term46681, term46681.getClass(), "sourceName", null);
        setIntField(term46681, term46681.getClass(), "baseLineno", 0);
        setIntField(term46681, term46681.getClass(), "endLineno", 0);
        setField(term46681, term46681.getClass(), "functions", null);
        setField(term46681, term46681.getClass(), "regexps", null);
        setField(term46681, term46681.getClass(), "itsVariables", null);
        setField(term46681, term46681.getClass(), "itsConst", null);
        setField(term46681, term46681.getClass(), "itsVariableNames", null);
        setIntField(term46681, term46681.getClass(), "varStart", 0);
        setField(term46681, term46681.getClass(), "compilerData", null);
        setIntField(term46681, term46681.getClass(), "type", 0);
        setField(term46681, term46681.getClass(), "next", null);
        setField(term46681, term46681.getClass(), "first", null);
        setField(term46681, term46681.getClass(), "last", null);
        setField(term46681, term46681.getClass(), "propListHead", null);
        setIntField(term46681, term46681.getClass(), "sourcePosition", 0);
        setField(term46681, term46681.getClass(), "jsType", null);
        setField(term46681, term46681.getClass(), "parent", null);
        setField(term46680, term46680.getClass(), "next", term46681);
        setField(term46680, term46680.getClass(), "first", null);
        setField(term46680, term46680.getClass(), "last", null);
        setField(term46680, term46680.getClass(), "propListHead", null);
        setIntField(term46680, term46680.getClass(), "sourcePosition", 0);
        setField(term46680, term46680.getClass(), "jsType", null);
        setField(term46680, term46680.getClass(), "parent", null);
        setField(term46679, term46679.getClass(), "first", term46680);
        setField(term46679, term46679.getClass(), "last", null);
        setField(term46679, term46679.getClass(), "propListHead", null);
        setIntField(term46679, term46679.getClass(), "sourcePosition", 0);
        setField(term46679, term46679.getClass(), "jsType", null);
        setField(term46679, term46679.getClass(), "parent", null);
        term46600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46602 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term46609 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term46600, term46600.getClass(), "type", 101);
        setField(term46600, term46600.getClass(), "next", null);
        setIntField(term46602, term46602.getClass(), "encodedSourceStart", 0);
        setIntField(term46602, term46602.getClass(), "encodedSourceEnd", 0);
        setField(term46602, term46602.getClass(), "sourceName", null);
        setIntField(term46602, term46602.getClass(), "baseLineno", 0);
        setIntField(term46602, term46602.getClass(), "endLineno", 0);
        setField(term46602, term46602.getClass(), "functions", null);
        setField(term46602, term46602.getClass(), "regexps", null);
        setField(term46602, term46602.getClass(), "itsVariables", null);
        setField(term46602, term46602.getClass(), "itsConst", null);
        setField(term46602, term46602.getClass(), "itsVariableNames", null);
        setIntField(term46602, term46602.getClass(), "varStart", 0);
        setField(term46602, term46602.getClass(), "compilerData", null);
        setIntField(term46602, term46602.getClass(), "type", 0);
        setIntField(term46609, term46609.getClass(), "encodedSourceStart", 0);
        setIntField(term46609, term46609.getClass(), "encodedSourceEnd", 0);
        setField(term46609, term46609.getClass(), "sourceName", null);
        setIntField(term46609, term46609.getClass(), "baseLineno", 0);
        setIntField(term46609, term46609.getClass(), "endLineno", 0);
        setField(term46609, term46609.getClass(), "functions", null);
        setField(term46609, term46609.getClass(), "regexps", null);
        setField(term46609, term46609.getClass(), "itsVariables", null);
        setField(term46609, term46609.getClass(), "itsConst", null);
        setField(term46609, term46609.getClass(), "itsVariableNames", null);
        setIntField(term46609, term46609.getClass(), "varStart", 0);
        setField(term46609, term46609.getClass(), "compilerData", null);
        setIntField(term46609, term46609.getClass(), "type", 0);
        setField(term46609, term46609.getClass(), "next", null);
        setField(term46609, term46609.getClass(), "first", null);
        setField(term46609, term46609.getClass(), "last", null);
        setField(term46609, term46609.getClass(), "propListHead", null);
        setIntField(term46609, term46609.getClass(), "sourcePosition", 0);
        setField(term46609, term46609.getClass(), "jsType", null);
        setField(term46609, term46609.getClass(), "parent", null);
        setField(term46602, term46602.getClass(), "next", term46609);
        setField(term46602, term46602.getClass(), "first", null);
        setField(term46602, term46602.getClass(), "last", null);
        setField(term46602, term46602.getClass(), "propListHead", null);
        setIntField(term46602, term46602.getClass(), "sourcePosition", 0);
        setField(term46602, term46602.getClass(), "jsType", null);
        setField(term46602, term46602.getClass(), "parent", null);
        setField(term46600, term46600.getClass(), "first", term46602);
        setField(term46600, term46600.getClass(), "last", null);
        setField(term46600, term46600.getClass(), "propListHead", null);
        setIntField(term46600, term46600.getClass(), "sourcePosition", 0);
        setField(term46600, term46600.getClass(), "jsType", null);
        setField(term46600, term46600.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45934;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term45864, args);
        assertTrue(recursiveEquals(term45864, term46678));
        assertTrue(recursiveEquals(term45934, term46679));
        assertTrue(recursiveEquals(retValue, term46600));
    }

};


