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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3547675;
     Object term3547761;
     Object term3548872;
     Object term3548873;
     Object term3548764;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3547675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3547761 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3547853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3547945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3547761, term3547761.getClass(), "type", 37);
        setIntField(term3547853, term3547853.getClass(), "type", 35);
        setIntField(term3548037, term3548037.getClass(), "type", 40);
        setField(term3548037, term3548037.getClass(), "str", "");
        setField(term3547945, term3547945.getClass(), "next", term3548037);
        setIntField(term3547945, term3547945.getClass(), "type", 40);
        setField(term3547853, term3547853.getClass(), "first", term3547945);
        setIntField(term3548145, term3548145.getClass(), "type", 39);
        setField(term3547853, term3547853.getClass(), "next", term3548145);
        setField(term3547761, term3547761.getClass(), "first", term3547853);
        term3548872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3548872, term3548872.getClass(), "currentTraversal", null);
        term3548873 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3548874 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3548876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3548873, term3548873.getClass(), "functionName", null);
        setBooleanField(term3548873, term3548873.getClass(), "itsNeedsActivation", false);
        setIntField(term3548873, term3548873.getClass(), "itsFunctionType", 0);
        setBooleanField(term3548873, term3548873.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3548873, term3548873.getClass(), "encodedSourceStart", 0);
        setIntField(term3548873, term3548873.getClass(), "encodedSourceEnd", 0);
        setField(term3548873, term3548873.getClass(), "sourceName", null);
        setIntField(term3548873, term3548873.getClass(), "baseLineno", 0);
        setIntField(term3548873, term3548873.getClass(), "endLineno", 0);
        setField(term3548873, term3548873.getClass(), "functions", null);
        setField(term3548873, term3548873.getClass(), "regexps", null);
        setField(term3548873, term3548873.getClass(), "itsVariables", null);
        setField(term3548873, term3548873.getClass(), "itsConst", null);
        setField(term3548873, term3548873.getClass(), "itsVariableNames", null);
        setIntField(term3548873, term3548873.getClass(), "varStart", 0);
        setField(term3548873, term3548873.getClass(), "compilerData", null);
        setIntField(term3548873, term3548873.getClass(), "type", 37);
        setField(term3548873, term3548873.getClass(), "next", null);
        setField(term3548874, term3548874.getClass(), "str", null);
        setIntField(term3548874, term3548874.getClass(), "type", 35);
        setIntField(term3548875, term3548875.getClass(), "type", 39);
        setField(term3548875, term3548875.getClass(), "next", null);
        setField(term3548875, term3548875.getClass(), "first", null);
        setField(term3548875, term3548875.getClass(), "last", null);
        setField(term3548875, term3548875.getClass(), "propListHead", null);
        setIntField(term3548875, term3548875.getClass(), "sourcePosition", 0);
        setField(term3548875, term3548875.getClass(), "jsType", null);
        setField(term3548875, term3548875.getClass(), "parent", null);
        setField(term3548874, term3548874.getClass(), "next", term3548875);
        setField(term3548876, term3548876.getClass(), "str", null);
        setIntField(term3548876, term3548876.getClass(), "type", 40);
        setField(term3548877, term3548877.getClass(), "str", "");
        setIntField(term3548877, term3548877.getClass(), "type", 40);
        setField(term3548877, term3548877.getClass(), "next", null);
        setField(term3548877, term3548877.getClass(), "first", null);
        setField(term3548877, term3548877.getClass(), "last", null);
        setField(term3548877, term3548877.getClass(), "propListHead", null);
        setIntField(term3548877, term3548877.getClass(), "sourcePosition", 0);
        setField(term3548877, term3548877.getClass(), "jsType", null);
        setField(term3548877, term3548877.getClass(), "parent", null);
        setField(term3548876, term3548876.getClass(), "next", term3548877);
        setField(term3548876, term3548876.getClass(), "first", null);
        setField(term3548876, term3548876.getClass(), "last", null);
        setField(term3548876, term3548876.getClass(), "propListHead", null);
        setIntField(term3548876, term3548876.getClass(), "sourcePosition", 0);
        setField(term3548876, term3548876.getClass(), "jsType", null);
        setField(term3548876, term3548876.getClass(), "parent", null);
        setField(term3548874, term3548874.getClass(), "first", term3548876);
        setField(term3548874, term3548874.getClass(), "last", null);
        setField(term3548874, term3548874.getClass(), "propListHead", null);
        setIntField(term3548874, term3548874.getClass(), "sourcePosition", 0);
        setField(term3548874, term3548874.getClass(), "jsType", null);
        setField(term3548874, term3548874.getClass(), "parent", null);
        setField(term3548873, term3548873.getClass(), "first", term3548874);
        setField(term3548873, term3548873.getClass(), "last", null);
        setField(term3548873, term3548873.getClass(), "propListHead", null);
        setIntField(term3548873, term3548873.getClass(), "sourcePosition", 0);
        setField(term3548873, term3548873.getClass(), "jsType", null);
        setField(term3548873, term3548873.getClass(), "parent", null);
        term3548764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3548774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3548779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3548781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3548764, term3548764.getClass(), "functionName", null);
        setBooleanField(term3548764, term3548764.getClass(), "itsNeedsActivation", false);
        setIntField(term3548764, term3548764.getClass(), "itsFunctionType", 0);
        setBooleanField(term3548764, term3548764.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3548764, term3548764.getClass(), "encodedSourceStart", 0);
        setIntField(term3548764, term3548764.getClass(), "encodedSourceEnd", 0);
        setField(term3548764, term3548764.getClass(), "sourceName", null);
        setIntField(term3548764, term3548764.getClass(), "baseLineno", 0);
        setIntField(term3548764, term3548764.getClass(), "endLineno", 0);
        setField(term3548764, term3548764.getClass(), "functions", null);
        setField(term3548764, term3548764.getClass(), "regexps", null);
        setField(term3548764, term3548764.getClass(), "itsVariables", null);
        setField(term3548764, term3548764.getClass(), "itsConst", null);
        setField(term3548764, term3548764.getClass(), "itsVariableNames", null);
        setIntField(term3548764, term3548764.getClass(), "varStart", 0);
        setField(term3548764, term3548764.getClass(), "compilerData", null);
        setIntField(term3548764, term3548764.getClass(), "type", 37);
        setField(term3548764, term3548764.getClass(), "next", null);
        setField(term3548774, term3548774.getClass(), "str", null);
        setIntField(term3548774, term3548774.getClass(), "type", 35);
        setIntField(term3548776, term3548776.getClass(), "type", 39);
        setField(term3548776, term3548776.getClass(), "next", null);
        setField(term3548776, term3548776.getClass(), "first", null);
        setField(term3548776, term3548776.getClass(), "last", null);
        setField(term3548776, term3548776.getClass(), "propListHead", null);
        setIntField(term3548776, term3548776.getClass(), "sourcePosition", 0);
        setField(term3548776, term3548776.getClass(), "jsType", null);
        setField(term3548776, term3548776.getClass(), "parent", null);
        setField(term3548774, term3548774.getClass(), "next", term3548776);
        setField(term3548779, term3548779.getClass(), "str", null);
        setIntField(term3548779, term3548779.getClass(), "type", 40);
        setField(term3548781, term3548781.getClass(), "str", "");
        setIntField(term3548781, term3548781.getClass(), "type", 40);
        setField(term3548781, term3548781.getClass(), "next", null);
        setField(term3548781, term3548781.getClass(), "first", null);
        setField(term3548781, term3548781.getClass(), "last", null);
        setField(term3548781, term3548781.getClass(), "propListHead", null);
        setIntField(term3548781, term3548781.getClass(), "sourcePosition", 0);
        setField(term3548781, term3548781.getClass(), "jsType", null);
        setField(term3548781, term3548781.getClass(), "parent", null);
        setField(term3548779, term3548779.getClass(), "next", term3548781);
        setField(term3548779, term3548779.getClass(), "first", null);
        setField(term3548779, term3548779.getClass(), "last", null);
        setField(term3548779, term3548779.getClass(), "propListHead", null);
        setIntField(term3548779, term3548779.getClass(), "sourcePosition", 0);
        setField(term3548779, term3548779.getClass(), "jsType", null);
        setField(term3548779, term3548779.getClass(), "parent", null);
        setField(term3548774, term3548774.getClass(), "first", term3548779);
        setField(term3548774, term3548774.getClass(), "last", null);
        setField(term3548774, term3548774.getClass(), "propListHead", null);
        setIntField(term3548774, term3548774.getClass(), "sourcePosition", 0);
        setField(term3548774, term3548774.getClass(), "jsType", null);
        setField(term3548774, term3548774.getClass(), "parent", null);
        setField(term3548764, term3548764.getClass(), "first", term3548774);
        setField(term3548764, term3548764.getClass(), "last", null);
        setField(term3548764, term3548764.getClass(), "propListHead", null);
        setIntField(term3548764, term3548764.getClass(), "sourcePosition", 0);
        setField(term3548764, term3548764.getClass(), "jsType", null);
        setField(term3548764, term3548764.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3547761;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3547675, args);
        assertTrue(recursiveEquals(term3547675, term3548872));
        assertTrue(recursiveEquals(term3547761, term3548873));
        assertTrue(recursiveEquals(retValue, term3548764));
    }

};


