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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3479527;
     Object term3479613;
     Object term3481710;
     Object term3481711;
     Object term3481602;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3479527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3479613 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3479705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3479797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3479889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3479997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3479613, term3479613.getClass(), "type", 37);
        setIntField(term3479705, term3479705.getClass(), "type", 35);
        setIntField(term3479889, term3479889.getClass(), "type", 40);
        setField(term3479889, term3479889.getClass(), "str", "");
        setField(term3479797, term3479797.getClass(), "next", term3479889);
        setIntField(term3479797, term3479797.getClass(), "type", 40);
        setField(term3479705, term3479705.getClass(), "first", term3479797);
        setIntField(term3479997, term3479997.getClass(), "type", 44);
        setField(term3479705, term3479705.getClass(), "next", term3479997);
        setField(term3479613, term3479613.getClass(), "first", term3479705);
        term3481710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3481710, term3481710.getClass(), "currentTraversal", null);
        term3481711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3481712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3481714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3481711, term3481711.getClass(), "functionName", null);
        setBooleanField(term3481711, term3481711.getClass(), "itsNeedsActivation", false);
        setIntField(term3481711, term3481711.getClass(), "itsFunctionType", 0);
        setBooleanField(term3481711, term3481711.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3481711, term3481711.getClass(), "encodedSourceStart", 0);
        setIntField(term3481711, term3481711.getClass(), "encodedSourceEnd", 0);
        setField(term3481711, term3481711.getClass(), "sourceName", null);
        setIntField(term3481711, term3481711.getClass(), "baseLineno", 0);
        setIntField(term3481711, term3481711.getClass(), "endLineno", 0);
        setField(term3481711, term3481711.getClass(), "functions", null);
        setField(term3481711, term3481711.getClass(), "regexps", null);
        setField(term3481711, term3481711.getClass(), "itsVariables", null);
        setField(term3481711, term3481711.getClass(), "itsConst", null);
        setField(term3481711, term3481711.getClass(), "itsVariableNames", null);
        setIntField(term3481711, term3481711.getClass(), "varStart", 0);
        setField(term3481711, term3481711.getClass(), "compilerData", null);
        setIntField(term3481711, term3481711.getClass(), "type", 37);
        setField(term3481711, term3481711.getClass(), "next", null);
        setField(term3481712, term3481712.getClass(), "str", null);
        setIntField(term3481712, term3481712.getClass(), "type", 35);
        setIntField(term3481713, term3481713.getClass(), "type", 44);
        setField(term3481713, term3481713.getClass(), "next", null);
        setField(term3481713, term3481713.getClass(), "first", null);
        setField(term3481713, term3481713.getClass(), "last", null);
        setField(term3481713, term3481713.getClass(), "propListHead", null);
        setIntField(term3481713, term3481713.getClass(), "sourcePosition", 0);
        setField(term3481713, term3481713.getClass(), "jsType", null);
        setField(term3481713, term3481713.getClass(), "parent", null);
        setField(term3481712, term3481712.getClass(), "next", term3481713);
        setField(term3481714, term3481714.getClass(), "str", null);
        setIntField(term3481714, term3481714.getClass(), "type", 40);
        setField(term3481715, term3481715.getClass(), "str", "");
        setIntField(term3481715, term3481715.getClass(), "type", 40);
        setField(term3481715, term3481715.getClass(), "next", null);
        setField(term3481715, term3481715.getClass(), "first", null);
        setField(term3481715, term3481715.getClass(), "last", null);
        setField(term3481715, term3481715.getClass(), "propListHead", null);
        setIntField(term3481715, term3481715.getClass(), "sourcePosition", 0);
        setField(term3481715, term3481715.getClass(), "jsType", null);
        setField(term3481715, term3481715.getClass(), "parent", null);
        setField(term3481714, term3481714.getClass(), "next", term3481715);
        setField(term3481714, term3481714.getClass(), "first", null);
        setField(term3481714, term3481714.getClass(), "last", null);
        setField(term3481714, term3481714.getClass(), "propListHead", null);
        setIntField(term3481714, term3481714.getClass(), "sourcePosition", 0);
        setField(term3481714, term3481714.getClass(), "jsType", null);
        setField(term3481714, term3481714.getClass(), "parent", null);
        setField(term3481712, term3481712.getClass(), "first", term3481714);
        setField(term3481712, term3481712.getClass(), "last", null);
        setField(term3481712, term3481712.getClass(), "propListHead", null);
        setIntField(term3481712, term3481712.getClass(), "sourcePosition", 0);
        setField(term3481712, term3481712.getClass(), "jsType", null);
        setField(term3481712, term3481712.getClass(), "parent", null);
        setField(term3481711, term3481711.getClass(), "first", term3481712);
        setField(term3481711, term3481711.getClass(), "last", null);
        setField(term3481711, term3481711.getClass(), "propListHead", null);
        setIntField(term3481711, term3481711.getClass(), "sourcePosition", 0);
        setField(term3481711, term3481711.getClass(), "jsType", null);
        setField(term3481711, term3481711.getClass(), "parent", null);
        term3481602 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3481612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3481617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3481619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3481602, term3481602.getClass(), "functionName", null);
        setBooleanField(term3481602, term3481602.getClass(), "itsNeedsActivation", false);
        setIntField(term3481602, term3481602.getClass(), "itsFunctionType", 0);
        setBooleanField(term3481602, term3481602.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3481602, term3481602.getClass(), "encodedSourceStart", 0);
        setIntField(term3481602, term3481602.getClass(), "encodedSourceEnd", 0);
        setField(term3481602, term3481602.getClass(), "sourceName", null);
        setIntField(term3481602, term3481602.getClass(), "baseLineno", 0);
        setIntField(term3481602, term3481602.getClass(), "endLineno", 0);
        setField(term3481602, term3481602.getClass(), "functions", null);
        setField(term3481602, term3481602.getClass(), "regexps", null);
        setField(term3481602, term3481602.getClass(), "itsVariables", null);
        setField(term3481602, term3481602.getClass(), "itsConst", null);
        setField(term3481602, term3481602.getClass(), "itsVariableNames", null);
        setIntField(term3481602, term3481602.getClass(), "varStart", 0);
        setField(term3481602, term3481602.getClass(), "compilerData", null);
        setIntField(term3481602, term3481602.getClass(), "type", 37);
        setField(term3481602, term3481602.getClass(), "next", null);
        setField(term3481612, term3481612.getClass(), "str", null);
        setIntField(term3481612, term3481612.getClass(), "type", 35);
        setIntField(term3481614, term3481614.getClass(), "type", 44);
        setField(term3481614, term3481614.getClass(), "next", null);
        setField(term3481614, term3481614.getClass(), "first", null);
        setField(term3481614, term3481614.getClass(), "last", null);
        setField(term3481614, term3481614.getClass(), "propListHead", null);
        setIntField(term3481614, term3481614.getClass(), "sourcePosition", 0);
        setField(term3481614, term3481614.getClass(), "jsType", null);
        setField(term3481614, term3481614.getClass(), "parent", null);
        setField(term3481612, term3481612.getClass(), "next", term3481614);
        setField(term3481617, term3481617.getClass(), "str", null);
        setIntField(term3481617, term3481617.getClass(), "type", 40);
        setField(term3481619, term3481619.getClass(), "str", "");
        setIntField(term3481619, term3481619.getClass(), "type", 40);
        setField(term3481619, term3481619.getClass(), "next", null);
        setField(term3481619, term3481619.getClass(), "first", null);
        setField(term3481619, term3481619.getClass(), "last", null);
        setField(term3481619, term3481619.getClass(), "propListHead", null);
        setIntField(term3481619, term3481619.getClass(), "sourcePosition", 0);
        setField(term3481619, term3481619.getClass(), "jsType", null);
        setField(term3481619, term3481619.getClass(), "parent", null);
        setField(term3481617, term3481617.getClass(), "next", term3481619);
        setField(term3481617, term3481617.getClass(), "first", null);
        setField(term3481617, term3481617.getClass(), "last", null);
        setField(term3481617, term3481617.getClass(), "propListHead", null);
        setIntField(term3481617, term3481617.getClass(), "sourcePosition", 0);
        setField(term3481617, term3481617.getClass(), "jsType", null);
        setField(term3481617, term3481617.getClass(), "parent", null);
        setField(term3481612, term3481612.getClass(), "first", term3481617);
        setField(term3481612, term3481612.getClass(), "last", null);
        setField(term3481612, term3481612.getClass(), "propListHead", null);
        setIntField(term3481612, term3481612.getClass(), "sourcePosition", 0);
        setField(term3481612, term3481612.getClass(), "jsType", null);
        setField(term3481612, term3481612.getClass(), "parent", null);
        setField(term3481602, term3481602.getClass(), "first", term3481612);
        setField(term3481602, term3481602.getClass(), "last", null);
        setField(term3481602, term3481602.getClass(), "propListHead", null);
        setIntField(term3481602, term3481602.getClass(), "sourcePosition", 0);
        setField(term3481602, term3481602.getClass(), "jsType", null);
        setField(term3481602, term3481602.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3479613;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3479527, args);
        assertTrue(recursiveEquals(term3479527, term3481710));
        assertTrue(recursiveEquals(term3479613, term3481711));
        assertTrue(recursiveEquals(retValue, term3481602));
    }

};


