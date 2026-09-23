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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184003;
     Object term184095;
     Object term193980;
     Object term193981;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184003 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term184095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184277 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term184187, term184187.getClass(), "type", 33);
        setField(term184187, term184187.getClass(), "first", term184277);
        setField(term184095, term184095.getClass(), "first", term184187);
        term193980 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term193980, term193980.getClass(), "propertyTestFunctions", null);
        term193981 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term193982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term193983 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term193981, term193981.getClass(), "str", null);
        setIntField(term193981, term193981.getClass(), "type", 0);
        setField(term193981, term193981.getClass(), "next", null);
        setField(term193982, term193982.getClass(), "str", null);
        setIntField(term193982, term193982.getClass(), "type", 33);
        setField(term193982, term193982.getClass(), "next", null);
        setIntField(term193983, term193983.getClass(), "encodedSourceStart", 0);
        setIntField(term193983, term193983.getClass(), "encodedSourceEnd", 0);
        setField(term193983, term193983.getClass(), "sourceName", null);
        setIntField(term193983, term193983.getClass(), "baseLineno", 0);
        setIntField(term193983, term193983.getClass(), "endLineno", 0);
        setField(term193983, term193983.getClass(), "functions", null);
        setField(term193983, term193983.getClass(), "regexps", null);
        setField(term193983, term193983.getClass(), "itsVariables", null);
        setField(term193983, term193983.getClass(), "itsConst", null);
        setField(term193983, term193983.getClass(), "itsVariableNames", null);
        setIntField(term193983, term193983.getClass(), "varStart", 0);
        setField(term193983, term193983.getClass(), "compilerData", null);
        setIntField(term193983, term193983.getClass(), "type", 0);
        setField(term193983, term193983.getClass(), "next", null);
        setField(term193983, term193983.getClass(), "first", null);
        setField(term193983, term193983.getClass(), "last", null);
        setField(term193983, term193983.getClass(), "propListHead", null);
        setIntField(term193983, term193983.getClass(), "sourcePosition", 0);
        setField(term193983, term193983.getClass(), "jsType", null);
        setField(term193983, term193983.getClass(), "parent", null);
        setField(term193982, term193982.getClass(), "first", term193983);
        setField(term193982, term193982.getClass(), "last", null);
        setField(term193982, term193982.getClass(), "propListHead", null);
        setIntField(term193982, term193982.getClass(), "sourcePosition", 0);
        setField(term193982, term193982.getClass(), "jsType", null);
        setField(term193982, term193982.getClass(), "parent", null);
        setField(term193981, term193981.getClass(), "first", term193982);
        setField(term193981, term193981.getClass(), "last", null);
        setField(term193981, term193981.getClass(), "propListHead", null);
        setIntField(term193981, term193981.getClass(), "sourcePosition", 0);
        setField(term193981, term193981.getClass(), "jsType", null);
        setField(term193981, term193981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term184095;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term184003, args);
        assertTrue(recursiveEquals(term184003, term193980));
        assertTrue(recursiveEquals(term184095, term193981));
        assertTrue(recursiveEquals(retValue, null));
    }

};


