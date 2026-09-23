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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209676;
     Object term209768;
     Object term220862;
     Object term220863;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209676 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term209768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209950 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term209860, term209860.getClass(), "type", 33);
        setField(term209860, term209860.getClass(), "first", term209950);
        setField(term209768, term209768.getClass(), "first", term209860);
        term220862 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term220862, term220862.getClass(), "propertyTestFunctions", null);
        term220863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220865 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term220863, term220863.getClass(), "number", 0.0);
        setIntField(term220863, term220863.getClass(), "type", 0);
        setField(term220863, term220863.getClass(), "next", null);
        setDoubleField(term220864, term220864.getClass(), "number", 0.0);
        setIntField(term220864, term220864.getClass(), "type", 33);
        setField(term220864, term220864.getClass(), "next", null);
        setIntField(term220865, term220865.getClass(), "encodedSourceStart", 0);
        setIntField(term220865, term220865.getClass(), "encodedSourceEnd", 0);
        setField(term220865, term220865.getClass(), "sourceName", null);
        setIntField(term220865, term220865.getClass(), "baseLineno", 0);
        setIntField(term220865, term220865.getClass(), "endLineno", 0);
        setField(term220865, term220865.getClass(), "functions", null);
        setField(term220865, term220865.getClass(), "regexps", null);
        setField(term220865, term220865.getClass(), "itsVariables", null);
        setField(term220865, term220865.getClass(), "itsConst", null);
        setField(term220865, term220865.getClass(), "itsVariableNames", null);
        setIntField(term220865, term220865.getClass(), "varStart", 0);
        setField(term220865, term220865.getClass(), "compilerData", null);
        setIntField(term220865, term220865.getClass(), "type", 0);
        setField(term220865, term220865.getClass(), "next", null);
        setField(term220865, term220865.getClass(), "first", null);
        setField(term220865, term220865.getClass(), "last", null);
        setField(term220865, term220865.getClass(), "propListHead", null);
        setIntField(term220865, term220865.getClass(), "sourcePosition", 0);
        setField(term220865, term220865.getClass(), "jsType", null);
        setField(term220865, term220865.getClass(), "parent", null);
        setField(term220864, term220864.getClass(), "first", term220865);
        setField(term220864, term220864.getClass(), "last", null);
        setField(term220864, term220864.getClass(), "propListHead", null);
        setIntField(term220864, term220864.getClass(), "sourcePosition", 0);
        setField(term220864, term220864.getClass(), "jsType", null);
        setField(term220864, term220864.getClass(), "parent", null);
        setField(term220863, term220863.getClass(), "first", term220864);
        setField(term220863, term220863.getClass(), "last", null);
        setField(term220863, term220863.getClass(), "propListHead", null);
        setIntField(term220863, term220863.getClass(), "sourcePosition", 0);
        setField(term220863, term220863.getClass(), "jsType", null);
        setField(term220863, term220863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209768;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term209676, args);
        assertTrue(recursiveEquals(term209676, term220862));
        assertTrue(recursiveEquals(term209768, term220863));
        assertTrue(recursiveEquals(retValue, null));
    }

};


